package scan.Interpreter;

import scan.Scope;
import scan.TLValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import scan.Function;
import scanneralt.InputPane;
import scanneralt.Main;

public class FunctionCallNode implements TLNode {

    private String identifier;
    private List<TLNode> params;
    private Map<String, Function> functions;
    private int line;
    
    public FunctionCallNode(String id, List<TLNode> ps, Map<String, Function> fs) {
        identifier = id;
        params = ps == null ? new ArrayList<TLNode>() : ps;
        functions = fs;
    }

    @Override
    public TLValue evaluate() {
        setCaret();
        Function f = functions.get(identifier + params.size());

        if(f == null) {
            System.err.println("no function `" + identifier + "` with " + params.size() + " parameter(s)");
            throw new RuntimeException("no function `" + identifier + "` with " + params.size() + " parameter(s)");
        }

        Function function = new Function(f);
        
        

        return function.invoke(params, functions);
    }
    public void setCaret(){
        InputPane p = Main.getSelTab();
        p.getTextArea().setCaretPosition(p.getPos(line));
    }
    
    public void setLine(int a){
        line = a;
    }
}
