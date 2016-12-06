package scan.Interpreter;

import scan.TLValue;
import java.util.ArrayList;
import java.util.List;

public class LookupNode implements TLNode {

    private TLNode expression;
    private List<TLNode> indexes;

    public LookupNode(TLNode e, List<TLNode> i) {
        expression = e;
        indexes = i;
    }

    @Override
    public TLValue evaluate() {
        TLNode get = indexes.get(0);
        TLValue v = get.evaluate();
        int index = v.asInt();
        TLValue value = ((IDNode)expression).evaluateArray(index);

//        List<TLValue> indexValues = new ArrayList<TLValue>();
//
//        for (TLNode indexNode : indexes) {
//            indexValues.add(indexNode.evaluate());
//        }

//        for(TLValue index : indexValues) {
//
//            if(!index.isNumber() || !(value.isList() || value.isString())) {
//                throw new RuntimeException("illegal expression: " + expression + "[" + index + "]");
//            }
//
//            int idx = index.asLong().intValue();
//
//            if(value.isList()) {
//                value = value.asList().get(idx);
//            }
//            else if(value.isString()) {
//                value = new TLValue(String.valueOf(value.asString().charAt(idx)));
//            }
//        }

        return value;
    }
}
