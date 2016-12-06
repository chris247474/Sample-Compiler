package scan.Interpreter;

import scan.TLValue;

public class NotEqualsNode implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public NotEqualsNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        return new TLValue(!a.equals(b));
    }

    @Override
    public String toString() {
        return String.format("(%s != %s)", lhs, rhs);
    }
}
