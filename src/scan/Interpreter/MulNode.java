package scan.Interpreter;

import scan.TLValue;

import java.util.ArrayList;
import java.util.List;

public class MulNode implements TLNode {

    private TLNode lhs;
    private TLNode rhs;

    public MulNode(TLNode lhs, TLNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public TLValue evaluate() {

        TLValue a = lhs.evaluate();
        TLValue b = rhs.evaluate();

        // number * number
        if(a.isNumber() && b.isNumber()) {
            if(a.isInt() && b.isInt())
                return new TLValue(a.asInt() * b.asInt());
            else if(!a.isInt() || !b.isInt())
                return new TLValue(a.asDouble() * b.asDouble());
            
        }

        // string * number
        if(a.isString() && b.isNumber()) {
            StringBuilder str = new StringBuilder();
            int stop = b.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                str.append(a.asString());
            }
            return new TLValue(str.toString());
        }

        // list * number
        if(a.isList() && b.isNumber()) {
            List<TLValue> total = new ArrayList<TLValue>();
            int stop = b.asDouble().intValue();
            for(int i = 0; i < stop; i++) {
                total.addAll(a.asList());
            }
            return new TLValue(total);
        }

        throw new RuntimeException("illegal expression: " + this);
    }

    @Override
    public String toString() {
        return String.format("(%s * %s)", lhs, rhs);
    }
}
