package scan;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import scan.Interpreter.TLNode;

public class Function {

    private String id;
    private List<String> identifiers;
    private CommonTree code;
    private Scope scope;
    private List<String> types = new ArrayList<String>();

    public Function(String i, CommonTree ids, CommonTree block) {
        id = i;
        identifiers = toList(ids);
        code = block;
        scope = new Scope();
    }
           
    public Function(Function original) {
        this.id = original.id;
        this.identifiers = original.identifiers;
        this.code = original.code;
        this.scope = original.scope.copy();
        this.types = original.types;
    }

    public TLValue invoke(List<TLNode> params, Map<String, Function> functions) {

        if(params.size() != identifiers.size()) {
            throw new RuntimeException("illegal function call: " + identifiers.size() +
                    " parameters expected for function `" + id + "`");
        }

        // Assign all expression parameters to this function's identifiers
        for(int i = 0; i < identifiers.size(); i++) {
            scope.assign(identifiers.get(i), params.get(i).evaluate(),types.get(i));
        }

        try {
            // Create a tree walker to evaluate this function's code block
            CommonTreeNodeStream nodes = new CommonTreeNodeStream(code);
            ALTTree walker = new ALTTree(nodes, scope, functions);
            return walker.walk().evaluate();
        } catch (Exception e) {
            // do not recover from this
            throw new RuntimeException("something went wrong, terminating", e);
        }
    }

    private List<String> toList(CommonTree tree) {
        List<String> ids = new ArrayList<String>();
        for(int i = 0; i < tree.getChildCount(); i++) {
            CommonTree child = (CommonTree)tree.getChild(i);
            if(i % 2 != 0)
                ids.add(child.getText());
            else
                types.add(child.getText());
        }
        return ids;
    }
}
