package scan.Interpreter;

import scan.TLValue;

public class DivNode implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public DivNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        // number / number
        if(a.isNumber() && b.isNumber()) {
            if(a.isInt() && b.isInt())
                return new TLValue(a.asInt() * b.asInt());
            else if(!a.isInt() || !b.isInt())
                return new TLValue(a.asDouble() * b.asDouble());
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s / %s)", lhs, rhs);
    }
}
