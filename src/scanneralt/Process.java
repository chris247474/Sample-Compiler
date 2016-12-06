/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scanneralt;


import javax.swing.JEditorPane;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import scan.ALTTree;
import scan.Interpreter.TLNode;
import scan.ScannerALTLexer;
import scan.ScannerALTParser;

/**
 *
 * @author Sonia Tan
 */
public class Process implements Runnable {
    
    private JEditorPane Output;
    private InputPane input;
    public Process(JEditorPane out, InputPane p){
        Output = out;
        input = p;
        
    }
    public void run() {
        try {
            scan();
        } catch (RecognitionException ex) {
            Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void scan() throws RecognitionException{
        // TODO add your handling code here:
        Output.setText(null);
  
        CharStream charStream = new ANTLRStringStream(input.getText());
	ScannerALTLexer lexer = new ScannerALTLexer(charStream);
	TokenStream tokenStream = new CommonTokenStream(lexer);
	ScannerALTParser parser = new ScannerALTParser(tokenStream);
        
        CommonTree tree = (CommonTree)parser.parse().getTree();
        CommonTreeNodeStream nodes = new CommonTreeNodeStream(tree);

        ALTTree walker = new ALTTree(nodes, parser.functions);

        TLNode returned = walker.walk();
        returned.evaluate();
	
    }
    
    public synchronized void done(){
        notifyAll();
    }
    
}
