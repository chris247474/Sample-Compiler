/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scanneralt;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.TabSet;
import javax.swing.text.TabStop;
import javax.swing.undo.UndoManager;
import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rsyntaxtextarea.SyntaxScheme;
import org.fife.ui.rsyntaxtextarea.Token;


/**
 *
 * @author Sonia Tan
 */
public class InputPane extends JScrollPane {
    
    TextLineNumber lNum;
    JPanel panel = new JPanel();
    RSyntaxTextArea input = new RSyntaxTextArea();
    UndoManager manager = new UndoManager();
    private String path = null;
    private MutableAttributeSet keyword;
    private HashSet keywords;
    CompletionProvider cp;
    

    public InputPane(){
//        setTabs(input, 4);
        input.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
        input.setAutoIndentEnabled(true);
        input.setAnimateBracketMatching(true);
        input.setBracketMatchingEnabled(true);
        input.setCloseCurlyBraces(true);
        input.setMarkOccurrences(true);
        input.setCloseMarkupTags(true);
        
        SyntaxScheme scheme = input.getSyntaxScheme();
        
        scheme.styles[Token.RESERVED_WORD].background = new Color(193, 167, 244);
        scheme.styles[Token.RESERVED_WORD].foreground = new Color(7, 67, 128);
        scheme.styles[Token.DATA_TYPE].foreground = new Color(176, 97, 12);
        scheme.styles[Token.COMMENT_MULTILINE].foreground = Color.gray;
        scheme.styles[Token.IDENTIFIER].foreground = new Color(57, 181, 74);
        scheme.styles[Token.ERROR_CHAR].foreground = Color.red;
        scheme.styles[Token.ERROR_IDENTIFIER].foreground = Color.red;
        scheme.styles[Token.ERROR_NUMBER_FORMAT].foreground = Color.red;
        scheme.styles[Token.ERROR_STRING_DOUBLE].foreground = Color.red;
        scheme.styles[Token.LITERAL_STRING_DOUBLE_QUOTE].underline = true;

        
        initCompletion();
        
        panel.setLayout(new BorderLayout());
        lNum = new TextLineNumber(input);
        setRowHeaderView(lNum);
        panel.add(input);
        
        setViewportView(panel);

        input.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                    manager.addEdit(e.getEdit());
            }
        });
        
        input.addKeyListener(new KeyListener(){

            public void keyTyped(KeyEvent e) {
                
            }

            public void keyPressed(KeyEvent e) {
                
            }

            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_SEMICOLON || e.getKeyCode() == KeyEvent.VK_OPEN_BRACKET )
                    Main.runThrough();
            }
        });
        
        
    }
    
    public InputPane(String path){
        this.path = path;
//        setTabs(input, 4);
        input.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_C);
        input.setAutoIndentEnabled(true);
        input.setAnimateBracketMatching(true);
        input.setBracketMatchingEnabled(true);
        input.setCloseCurlyBraces(true);
        input.setMarkOccurrences(true);
        input.setCloseMarkupTags(true);
        
        SyntaxScheme scheme = input.getSyntaxScheme();
        
        scheme.styles[Token.RESERVED_WORD].background = new Color(193, 167, 244);
        scheme.styles[Token.RESERVED_WORD].foreground = new Color(7, 67, 128);
        scheme.styles[Token.DATA_TYPE].foreground = new Color(176, 97, 12);
        scheme.styles[Token.COMMENT_MULTILINE].foreground = Color.gray;
        scheme.styles[Token.IDENTIFIER].foreground = new Color(57, 181, 74);
        scheme.styles[Token.ERROR_CHAR].foreground = Color.red;
        scheme.styles[Token.ERROR_IDENTIFIER].foreground = Color.red;
        scheme.styles[Token.ERROR_NUMBER_FORMAT].foreground = Color.red;
        scheme.styles[Token.ERROR_STRING_DOUBLE].foreground = Color.red;
        scheme.styles[Token.LITERAL_STRING_DOUBLE_QUOTE].underline = true;
        
        

        
        initCompletion();
        
        panel.setLayout(new BorderLayout());
        lNum = new TextLineNumber(input);
        setRowHeaderView(lNum);
        panel.add(input);
        
        setViewportView(panel);

        input.getDocument().addUndoableEditListener(new UndoableEditListener() {
            public void undoableEditHappened(UndoableEditEvent e) {
                    manager.addEdit(e.getEdit());
            }
        });
        
    }
    
    public void initCompletion(){
        cp = createCompletionProvider();
        AutoCompletion ac = new AutoCompletion(cp);
        ac.install(input);
    }
    
    public void addCompletion(String a){

        ((DefaultCompletionProvider)cp).addCompletion(new BasicCompletion(cp, a));

        AutoCompletion ac = new AutoCompletion(cp);
        ac.install(input);

    }
    
    public String getText(){
        return input.getText();
    }
    
    public void setText(String text){
        input.setText(text);
    }
    
    public void undo(){
        if(manager.canUndo())
            manager.undo();
    }
    
    public void redo(){
        if(manager.canRedo())
            manager.redo();
        
    }
    
    public void setTabs( JTextPane textPane, int charactersPerTab) {

        FontMetrics fm = textPane.getFontMetrics( textPane.getFont() );
        int charWidth = fm.charWidth( 'w' );
        int tabWidth = charWidth * charactersPerTab;
        TabStop[] tabs = new TabStop[10];

        for (int j = 0; j < tabs.length; j++) {
            int tab = j + 1;
            tabs[j] = new TabStop( tab * tabWidth );
        }
        TabSet tabSet = new TabSet(tabs);
        SimpleAttributeSet attributes = new SimpleAttributeSet();
        Style style = textPane.getLogicalStyle();
        StyleConstants.setTabSet(style, tabSet);
        textPane.setLogicalStyle(style);

    }
    
    private CompletionProvider createCompletionProvider() {

      // A DefaultCompletionProvider is the simplest concrete implementation
      // of CompletionProvider.  This provider has no understanding of
      // language semantics. It simply checks the text entered up to the
      // caret position for a match against known completions. This is all
      // that is needed in the majority of cases.
      DefaultCompletionProvider provider = new DefaultCompletionProvider();

      // Add completions for all Java keywords.  A BasicCompletion is just
      // a straightforward word completion.
      
      
      provider.addCompletion(new BasicCompletion(provider, "break"));
      provider.addCompletion(new BasicCompletion(provider, "case"));
      provider.addCompletion(new BasicCompletion(provider, "const"));
      provider.addCompletion(new BasicCompletion(provider, "continue"));
      provider.addCompletion(new BasicCompletion(provider, "default"));
      provider.addCompletion(new BasicCompletion(provider, "do"));
      provider.addCompletion(new BasicCompletion(provider, "else"));
      provider.addCompletion(new BasicCompletion(provider, "for"));
      provider.addCompletion(new BasicCompletion(provider, "goto"));
      provider.addCompletion(new BasicCompletion(provider, "if"));
      provider.addCompletion(new BasicCompletion(provider, "include"));
      provider.addCompletion(new BasicCompletion(provider, "return"));
      provider.addCompletion(new BasicCompletion(provider, "switch"));
      provider.addCompletion(new BasicCompletion(provider, "try"));
      provider.addCompletion(new BasicCompletion(provider, "void"));
      provider.addCompletion(new BasicCompletion(provider, "while"));
      provider.addCompletion(new BasicCompletion(provider, "printf()"));
      provider.addCompletion(new BasicCompletion(provider, "scanf()"));
      provider.addCompletion(new BasicCompletion(provider, "main()"));
      
      //DataTypes
      provider.addCompletion(new BasicCompletion(provider, "int"));
      provider.addCompletion(new BasicCompletion(provider, "float"));
      provider.addCompletion(new BasicCompletion(provider, "double"));
      provider.addCompletion(new BasicCompletion(provider, "String"));
      provider.addCompletion(new BasicCompletion(provider, "char"));
      
      // Add a couple of "shorthand" completions.  These completions don't
      // require the input text to be the same thing as the replacement text.
//      provider.addCompletion(new ShorthandCompletion(provider, "p", "System.out.println(", "System.out.println("));
//      provider.addCompletion(new ShorthandCompletion(provider, "syserr", "System.err.println(", "System.err.println("));

      return provider;

   }

    public RSyntaxTextArea getTextArea(){
        return input;
    }
    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }
    public boolean hasPath(){
        if(path == null)
            return false;
        
        return true;
    }
    /**
     * @param path the path to set
     */
    public void setPath(String path) {
        this.path = path;
    }
    
    public int getPos(int line){
        int x = 0;
        String txt = input.getText();
        
        for(int i = 0; i< line ;i++){
            x= txt.indexOf("\n", x+1);
            
        }

        
        return x;
        
    }
}
