package scan.Interpreter;



import java.util.ArrayList;
import java.util.List;
import scan.Scope;
import scan.TLValue;

public class ConstantNode implements TLNode {

    protected String identifier;
    protected List<TLNode> indexNodes;
    protected TLNode rhs;
    protected Scope scope;
    protected String type;

    public ConstantNode(String i, List<TLNode> e, TLNode n, Scope s) {
        identifier = i;
        indexNodes = (e == null) ? new ArrayList<TLNode>() : e;
        rhs = n;
        scope = s;
    }
    
    public ConstantNode(String i, TLNode n, Scope s, String type) {
        identifier = i;
  
        if(n != null)
            rhs = n;
        else if(type.equals("String"))
            rhs = new AtomNode("");
        else 
            rhs = new AtomNode(0);
            
        scope = s;
        this.type = type;
    }
    
    @Override
    public TLValue evaluate() {

        TLValue value = rhs.evaluate();

        if (value == TLValue.VOID) {
            throw new RuntimeException("can't assign VOID to " + identifier);
        }

        scope.constant(identifier, value, type);
        

        return TLValue.VOID;
    }

    @Override
    public String toString() {
        return String.format("(%s[%s] = %s)", identifier, indexNodes, rhs);
    }
}
