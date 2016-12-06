package scan.Interpreter;

import scan.TLValue;

public class TernaryNode implements TLNode {

    private TLNode condition;
    private TLNode ifTrue;
    private TLNode ifFalse;

    public TernaryNode(TLNode c, TLNode t, TLNode f) {
        condition = c;
        ifTrue = t;
        ifFalse = f;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = condition.evaluate();

        if(!a.isBoolean()) {
            throw new RuntimeException("not a boolean expression: " + condition + ", in: " + this);
        }

        return a.asBoolean() ? ifTrue.evaluate() : ifFalse.evaluate();
    }

    @Override
    public String toString() {
        return String.format("(%s ? %s : %s)", condition, ifTrue, ifFalse);
    }
}
