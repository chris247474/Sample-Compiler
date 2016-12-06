package scan.Interpreter;

import scan.TLValue;

import java.util.List;

public class InNode  implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public InNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        if(!rhs.evaluate().isList()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        List<TLValue> list = b.asList();

        for(TLValue val : list) {
            if(val.equals(a)) {
                return new TLValue(true);
            }
        }

        return new TLValue(false);
    }

    @Override
    public String toString() {
        return String.format("(%s in %s)", lhs, rhs);
    }
}
