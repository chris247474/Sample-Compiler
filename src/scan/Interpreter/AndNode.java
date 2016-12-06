package scan.Interpreter;

import scan.TLValue;

public class AndNode implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public AndNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        if(!a.isBoolean() || !b.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new TLValue(a.asBoolean() && b.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(%s && %s)", lhs, rhs);
    }
}
