package scan.Interpreter;

import scan.TLValue;

public class PowNode implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public PowNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        // number ^ number
        if(a.isNumber() && b.isNumber()) {
            return new TLValue(Math.pow(a.asDouble(), b.asDouble()));
        }

        throw new RuntimeException("iIllegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s^%s)", lhs, rhs);
    }
}
