package scan.Interpreter;

import scan.TLValue;

public class UnaryMinusNode implements TLNode {

    private TLNode exp;

    public UnaryMinusNode(TLNode e) {
        exp = e;
    }

    @Override
    public TLValue evaluate() {

        TLValue v = exp.evaluate();

        if(!v.isNumber()) {
            throw new RuntimeException("illegal expression: " + this);
        }

        return new TLValue(-v.asDouble());
    }

    @Override
    public String toString() {
        return String.format("(-%s)", exp);
    }
}
