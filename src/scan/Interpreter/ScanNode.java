package scan.Interpreter;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import scan.Scope;
import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class ScanNode extends Thread implements TLNode {

    private TLNode expression;
    private PrintStream out;
    protected String identifier;
    protected List<TLNode> indexNodes;
    protected TLNode rhs;
    protected Scope scope;
    protected String type;
    private int line;
    
    public ScanNode(String i, List<TLNode> e, TLNode n, Scope s) {
        identifier = i;
        indexNodes = (e == null) ? new ArrayList<TLNode>() : e;
        rhs = n;
        scope = s;
    }
    
    public ScanNode(String i, List<TLNode> e, Scope s, String type) {
        identifier = i;
        indexNodes = (e == null) ? new ArrayList<TLNode>() : e;
        scope = s;
        this.type = type;
        
    }
    
    @Override
    public TLValue evaluate() {
           
        setCaret();
        Object vl = Main.getScan(identifier);
        
        if(type.equals("int"))
            vl = Integer.parseInt((String)vl);
        else if(type.equals("double"))
            vl = Double.parseDouble((String)vl);
        else if(type.equals("boolean"))
            vl = Boolean.parseBoolean((String)vl);
        
        TLValue value = new TLValue(vl);

        if (value == TLValue.VOID) {
            throw new RuntimeException("can't assign VOID to " + identifier);
        }

        if (indexNodes.isEmpty()) { // a simple assignment
            scope.assign(identifier, value, null);
        }
        else { // a possible list-lookup and reassignment


            TLValue list = scope.resolve(identifier);

            // iterate up to `foo[x][y]` in case of `foo[x][y][z] = 42;`
            for (int i = 0; i < indexNodes.size() - 1 && list != null; i++) {
                TLValue index = indexNodes.get(i).evaluate();

                if (!index.isNumber() || !list.isList()) { // sanity checks
                    throw new RuntimeException("illegal statement: " + this);
                }

                int idx = index.asLong().intValue();
                list = list.asList().get(idx);
            }
            // list is now pointing to `foo[x][y]` in case of `foo[x][y][z] = 42;`

            // get the value `z`: the last index, in `foo[x][y][z] = 42;`
            TLValue idx = indexNodes.get(indexNodes.size() - 1).evaluate();

            if (!idx.isNumber() || /*list == null ||*/ !list.isList()) { // sanity checks
                throw new RuntimeException("illegal statement: " + this);
            }

            // re-assign `foo[x][y][z]`
            List<TLValue> existing = list.asList();
            existing.set(idx.asLong().intValue(), value);
        }

        return TLValue.VOID;
    }

    @Override
    public String toString() {
        return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
    }
    public void setCaret(){
        InputPane p = Main.getSelTab();
        p.getTextArea().setCaretPosition(p.getPos(line));
    }
    public void setLine(int a){
        line = a;
    }
           
}
