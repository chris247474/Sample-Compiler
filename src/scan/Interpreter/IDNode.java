package scan.Interpreter;

import scan.Scope;
import scan.TLValue;

public class IDNode implements TLNode {

    private String identifier;
    private Scope scope;

    public IDNode(String id, Scope s) {
        identifier = id;
        scope = s;
    }

    @Override
    public TLValue evaluate() {
        TLValue value = scope.resolve(identifier);
        if(value == null) {
            System.err.println("No such variable: "+ identifier);
            throw new RuntimeException("no such variable: " + this);
        }
        return value;
    }
    
    public TLValue evaluateArray(int index) {
        TLValue value = scope.resolveArray(identifier, index );
        if(value == null) {
            System.err.println("No such variable: "+ identifier);
            throw new RuntimeException("no such variable: " + this);
        }
        return value;
    }

    @Override
    public String toString() {
        return identifier;
    }
}
