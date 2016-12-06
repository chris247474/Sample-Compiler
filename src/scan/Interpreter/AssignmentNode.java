package scan.Interpreter;



import java.util.ArrayList;
import java.util.List;
import scan.Scope;
import scan.TLValue;
import scanneralt.InputPane;
import scanneralt.Main;

public class AssignmentNode implements TLNode {

    protected String identifier;
    protected List<TLNode> indexNodes;
    protected TLNode rhs;
    protected Scope scope;
    protected String type;
    private int line;

    public AssignmentNode(String i, List<TLNode> e, TLNode n, Scope s) {
        identifier = i;
        indexNodes = (e == null) ? new ArrayList<TLNode>() : e;
        rhs = n;
        scope = s;
    }
    
    public AssignmentNode(String i, List<TLNode> e, TLNode n, Scope s, String type) {
        identifier = i;
        indexNodes = (e == null) ? new ArrayList<TLNode>() : e;
        if(n != null)
            rhs = n;
        else if(type.equals("String"))
            rhs = new AtomNode("");
        else if(type.equals("boolean"))
            rhs = new AtomNode(false);
        else 
            rhs = new AtomNode(0);
            
        scope = s;
        this.type = type;
    }
    
    @Override
    public TLValue evaluate() {
        setCaret();
        TLValue value = rhs.evaluate();

        if (value == TLValue.VOID) {
            throw new RuntimeException("can't assign VOID to " + identifier);
        }

        if (indexNodes.isEmpty()) { // a simple assignment
            scope.assign(identifier, value, type);
        }
        else { // a possible list-lookup and reassignment
            
            TLValue arraySize = indexNodes.get(0).evaluate();
            int aSize = -1;
            
            if(arraySize.isNumber())
                 aSize = arraySize.asInt();
            if(type == null)
                scope.assignArray(identifier, aSize, value);
            else
                scope.declArray(identifier, aSize, type);
    
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
