package scan.Interpreter;

import scan.TLValue;

public class NegateNode implements TLNode {

    private TLNode exp;

    public NegateNode(TLNode e) {
        exp = e;
    }

    @Override
    public TLValue evaluate() {

        TLValue v = exp.evaluate();

        if(!v.isBoolean()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new TLValue(!v.asBoolean());
    }

    @Override
    public String toString() {
        return String.format("(!%s)", exp);
    }
}
