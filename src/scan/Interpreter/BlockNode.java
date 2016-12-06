package scan.Interpreter;

import java.util.logging.Level;
import java.util.logging.Logger;
import scan.TLValue;

import java.util.ArrayList;
import java.util.List;
import scan.ScannerALTParser;
import scanneralt.InputPane;
import scanneralt.Main;

public class BlockNode extends Thread implements TLNode  {

    private List<TLNode> statements;
    private TLNode returnStatement;

    public BlockNode() {
        statements = new ArrayList<TLNode>();
        returnStatement = null;
    }

    public void addReturn(TLNode stat) {
        returnStatement = stat;
    }

    public void addStatement(TLNode stat) {
        statements.add(stat);
    }

    @Override
    public synchronized TLValue evaluate() {
        for(TLNode stat : statements) {
         
                TLValue value = stat.evaluate();
                
                if(Main.debugMode)
                    try {
                        Main.setBlock(this);
                        
                        if(!Main.stepInto){
                            wait();
                        }else
                            Main.stepInto = false;
                        
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(BlockNode.class.getName()).log(Level.SEVERE, null, ex);
                    }
                
                
              
                if(value != TLValue.VOID) {
                    return value;
                }
           
        }
        return returnStatement == null ? TLValue.VOID : returnStatement.evaluate();
    }

    public synchronized void done(){
        notifyAll();
    }
    
    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        for(TLNode stat : statements) {
            b.append(stat).append("\n");
        }
        if(returnStatement != null) {
            b.append("return ").append(returnStatement).append("\n");
        }
        return b.toString();
    }
}
