// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g 2011-08-19 04:58:20

  package scan;
  import scanneralt.Main;
  import scan.Interpreter.*;
  import scan.Function;
  import scan.Scope;
  import java.util.Map;
  import java.util.HashMap;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class ScannerALTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "BLOCK", "RETURN", "STATEMENTS", "ASSIGNMENT", "FUNC_CALL", "EXP", "EXP_LIST", "ID_LIST", "IF", "TERNARY", "UNARY_MIN", "NEGATE", "FUNCTION", "INDEXES", "LIST", "LOOKUP", "INT", "DOUBLE", "VOID", "STRING", "VARDECL", "CONSTDECL", "BOOLEAN", "Return", "ID", "Println", "Print", "ScanInt", "ScanDouble", "ScanString", "ScanBoolean", "If", "Else", "Func", "End", "For", "While", "Do", "In", "Number", "Bool", "Null", "String", "Assert", "Size", "To", "Or", "And", "Equals", "NEquals", "GTEquals", "LTEquals", "Pow", "Excl", "GT", "LT", "Add", "Subtract", "Multiply", "Divide", "Modulus", "OBrace", "CBrace", "OBracket", "CBracket", "OParen", "CParen", "SColon", "Assign", "Comma", "QMark", "Colon", "Int", "Digit", "Comment", "WS", "'main()'", "'var'", "'int'", "'double'", "'String'", "'boolean'", "'const'"
    };
    public static final int EOF=-1;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int BLOCK=4;
    public static final int RETURN=5;
    public static final int STATEMENTS=6;
    public static final int ASSIGNMENT=7;
    public static final int FUNC_CALL=8;
    public static final int EXP=9;
    public static final int EXP_LIST=10;
    public static final int ID_LIST=11;
    public static final int IF=12;
    public static final int TERNARY=13;
    public static final int UNARY_MIN=14;
    public static final int NEGATE=15;
    public static final int FUNCTION=16;
    public static final int INDEXES=17;
    public static final int LIST=18;
    public static final int LOOKUP=19;
    public static final int INT=20;
    public static final int DOUBLE=21;
    public static final int VOID=22;
    public static final int STRING=23;
    public static final int VARDECL=24;
    public static final int CONSTDECL=25;
    public static final int BOOLEAN=26;
    public static final int Return=27;
    public static final int ID=28;
    public static final int Println=29;
    public static final int Print=30;
    public static final int ScanInt=31;
    public static final int ScanDouble=32;
    public static final int ScanString=33;
    public static final int ScanBoolean=34;
    public static final int If=35;
    public static final int Else=36;
    public static final int Func=37;
    public static final int End=38;
    public static final int For=39;
    public static final int While=40;
    public static final int Do=41;
    public static final int In=42;
    public static final int Number=43;
    public static final int Bool=44;
    public static final int Null=45;
    public static final int String=46;
    public static final int Assert=47;
    public static final int Size=48;
    public static final int To=49;
    public static final int Or=50;
    public static final int And=51;
    public static final int Equals=52;
    public static final int NEquals=53;
    public static final int GTEquals=54;
    public static final int LTEquals=55;
    public static final int Pow=56;
    public static final int Excl=57;
    public static final int GT=58;
    public static final int LT=59;
    public static final int Add=60;
    public static final int Subtract=61;
    public static final int Multiply=62;
    public static final int Divide=63;
    public static final int Modulus=64;
    public static final int OBrace=65;
    public static final int CBrace=66;
    public static final int OBracket=67;
    public static final int CBracket=68;
    public static final int OParen=69;
    public static final int CParen=70;
    public static final int SColon=71;
    public static final int Assign=72;
    public static final int Comma=73;
    public static final int QMark=74;
    public static final int Colon=75;
    public static final int Int=76;
    public static final int Digit=77;
    public static final int Comment=78;
    public static final int WS=79;

    // delegates
    // delegators


        public ScannerALTParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ScannerALTParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return ScannerALTParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g"; }


      public Map<String, Function> functions = new HashMap<String, Function>();

      
      private void defineFunction(String id, Object idList, Object block) {

        // `idList` is possibly null! Create an empty tree in that case. 
        CommonTree idListTree = idList == null ? new CommonTree() : (CommonTree)idList;

        // `block` is never null.
        CommonTree blockTree = (CommonTree)block;

        // The function name with the number of parameters after it the unique key
        String key = id + (idListTree.getChildCount()/2);
        functions.put(key, new Function(id, idListTree, blockTree));
      }


    public static class parse_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parse"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:68:1: parse : ( constDecl ';' )* ( functionDecl )* 'main()' block EOF -> ( constDecl )* block ;
    public final ScannerALTParser.parse_return parse() throws RecognitionException {
        ScannerALTParser.parse_return retval = new ScannerALTParser.parse_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal2=null;
        Token string_literal4=null;
        Token EOF6=null;
        ScannerALTParser.constDecl_return constDecl1 = null;

        ScannerALTParser.functionDecl_return functionDecl3 = null;

        ScannerALTParser.block_return block5 = null;


        Object char_literal2_tree=null;
        Object string_literal4_tree=null;
        Object EOF6_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
        RewriteRuleSubtreeStream stream_constDecl=new RewriteRuleSubtreeStream(adaptor,"rule constDecl");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_functionDecl=new RewriteRuleSubtreeStream(adaptor,"rule functionDecl");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:3: ( ( constDecl ';' )* ( functionDecl )* 'main()' block EOF -> ( constDecl )* block )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:6: ( constDecl ';' )* ( functionDecl )* 'main()' block EOF
            {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:6: ( constDecl ';' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==86) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:7: constDecl ';'
            	    {
            	    pushFollow(FOLLOW_constDecl_in_parse178);
            	    constDecl1=constDecl();

            	    state._fsp--;

            	    stream_constDecl.add(constDecl1.getTree());
            	    char_literal2=(Token)match(input,SColon,FOLLOW_SColon_in_parse179);  
            	    stream_SColon.add(char_literal2);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:22: ( functionDecl )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==Func) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:22: functionDecl
            	    {
            	    pushFollow(FOLLOW_functionDecl_in_parse183);
            	    functionDecl3=functionDecl();

            	    state._fsp--;

            	    stream_functionDecl.add(functionDecl3.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            string_literal4=(Token)match(input,80,FOLLOW_80_in_parse186);  
            stream_80.add(string_literal4);

            pushFollow(FOLLOW_block_in_parse188);
            block5=block();

            state._fsp--;

            stream_block.add(block5.getTree());
            EOF6=(Token)match(input,EOF,FOLLOW_EOF_in_parse190);  
            stream_EOF.add(EOF6);



            // AST REWRITE
            // elements: constDecl, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 69:55: -> ( constDecl )* block
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:69:57: ( constDecl )*
                while ( stream_constDecl.hasNext() ) {
                    adaptor.addChild(root_0, stream_constDecl.nextTree());

                }
                stream_constDecl.reset();
                adaptor.addChild(root_0, stream_block.nextTree());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parse"

    public static class block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "block"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:72:1: block : '{' ( statement )* ( Return expression ';' )? '}' -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) ;
    public final ScannerALTParser.block_return block() throws RecognitionException {
        ScannerALTParser.block_return retval = new ScannerALTParser.block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal7=null;
        Token Return9=null;
        Token char_literal11=null;
        Token char_literal12=null;
        ScannerALTParser.statement_return statement8 = null;

        ScannerALTParser.expression_return expression10 = null;


        Object char_literal7_tree=null;
        Object Return9_tree=null;
        Object char_literal11_tree=null;
        Object char_literal12_tree=null;
        RewriteRuleTokenStream stream_OBrace=new RewriteRuleTokenStream(adaptor,"token OBrace");
        RewriteRuleTokenStream stream_Return=new RewriteRuleTokenStream(adaptor,"token Return");
        RewriteRuleTokenStream stream_CBrace=new RewriteRuleTokenStream(adaptor,"token CBrace");
        RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:3: ( '{' ( statement )* ( Return expression ';' )? '}' -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:6: '{' ( statement )* ( Return expression ';' )? '}'
            {
            char_literal7=(Token)match(input,OBrace,FOLLOW_OBrace_in_block210);  
            stream_OBrace.add(char_literal7);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:9: ( statement )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=ID && LA3_0<=If)||(LA3_0>=For && LA3_0<=Do)||LA3_0==81) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:10: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block212);
            	    statement8=statement();

            	    state._fsp--;

            	    stream_statement.add(statement8.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:22: ( Return expression ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Return) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:73:23: Return expression ';'
                    {
                    Return9=(Token)match(input,Return,FOLLOW_Return_in_block217);  
                    stream_Return.add(Return9);

                    pushFollow(FOLLOW_expression_in_block219);
                    expression10=expression();

                    state._fsp--;

                    stream_expression.add(expression10.getTree());
                    char_literal11=(Token)match(input,SColon,FOLLOW_SColon_in_block221);  
                    stream_SColon.add(char_literal11);


                    }
                    break;

            }

            char_literal12=(Token)match(input,CBrace,FOLLOW_CBrace_in_block225);  
            stream_CBrace.add(char_literal12);



            // AST REWRITE
            // elements: expression, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:6: -> ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:74:9: ^( BLOCK ^( STATEMENTS ( statement )* ) ^( RETURN ( expression )? ) )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(BLOCK, "BLOCK"), root_1);

                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:74:17: ^( STATEMENTS ( statement )* )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(STATEMENTS, "STATEMENTS"), root_2);

                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:74:30: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_2, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_1, root_2);
                }
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:74:42: ^( RETURN ( expression )? )
                {
                Object root_2 = (Object)adaptor.nil();
                root_2 = (Object)adaptor.becomeRoot((Object)adaptor.create(RETURN, "RETURN"), root_2);

                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:74:51: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_2, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "block"

    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "statement"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:77:1: statement : ( assignment ';' | functionCall ';' | ifStatement | forStatement | whileStatement | varDecl ';' | doWhileStatement ';' );
    public final ScannerALTParser.statement_return statement() throws RecognitionException {
        ScannerALTParser.statement_return retval = new ScannerALTParser.statement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal14=null;
        Token char_literal16=null;
        Token char_literal21=null;
        Token char_literal23=null;
        ScannerALTParser.assignment_return assignment13 = null;

        ScannerALTParser.functionCall_return functionCall15 = null;

        ScannerALTParser.ifStatement_return ifStatement17 = null;

        ScannerALTParser.forStatement_return forStatement18 = null;

        ScannerALTParser.whileStatement_return whileStatement19 = null;

        ScannerALTParser.varDecl_return varDecl20 = null;

        ScannerALTParser.doWhileStatement_return doWhileStatement22 = null;


        Object char_literal14_tree=null;
        Object char_literal16_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:78:3: ( assignment ';' | functionCall ';' | ifStatement | forStatement | whileStatement | varDecl ';' | doWhileStatement ';' )
            int alt5=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==OParen) ) {
                    alt5=2;
                }
                else if ( (LA5_1==OBracket||LA5_1==Assign) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case Println:
            case Print:
            case ScanInt:
            case ScanDouble:
            case ScanString:
            case ScanBoolean:
                {
                alt5=2;
                }
                break;
            case If:
                {
                alt5=3;
                }
                break;
            case For:
                {
                alt5=4;
                }
                break;
            case While:
                {
                alt5=5;
                }
                break;
            case 81:
                {
                alt5=6;
                }
                break;
            case Do:
                {
                alt5=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:78:6: assignment ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_assignment_in_statement264);
                    assignment13=assignment();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment13.getTree());
                    char_literal14=(Token)match(input,SColon,FOLLOW_SColon_in_statement266); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:79:6: functionCall ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_functionCall_in_statement274);
                    functionCall15=functionCall();

                    state._fsp--;

                    adaptor.addChild(root_0, functionCall15.getTree());
                    char_literal16=(Token)match(input,SColon,FOLLOW_SColon_in_statement276); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:80:6: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ifStatement_in_statement284);
                    ifStatement17=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement17.getTree());

                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:81:6: forStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_forStatement_in_statement291);
                    forStatement18=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement18.getTree());

                    }
                    break;
                case 5 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:82:6: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_whileStatement_in_statement298);
                    whileStatement19=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement19.getTree());

                    }
                    break;
                case 6 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:83:6: varDecl ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_varDecl_in_statement305);
                    varDecl20=varDecl();

                    state._fsp--;

                    adaptor.addChild(root_0, varDecl20.getTree());
                    char_literal21=(Token)match(input,SColon,FOLLOW_SColon_in_statement306); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:84:6: doWhileStatement ';'
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_doWhileStatement_in_statement314);
                    doWhileStatement22=doWhileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, doWhileStatement22.getTree());
                    char_literal23=(Token)match(input,SColon,FOLLOW_SColon_in_statement315); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "statement"

    public static class varDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "varDecl"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:87:1: varDecl : ( 'var' 'int' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? INT ) | 'var' 'double' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? DOUBLE ) | 'var' 'String' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? STRING ) | 'var' 'boolean' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? BOOLEAN ) );
    public final ScannerALTParser.varDecl_return varDecl() throws RecognitionException {
        ScannerALTParser.varDecl_return retval = new ScannerALTParser.varDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal24=null;
        Token string_literal25=null;
        Token ID26=null;
        Token char_literal28=null;
        Token string_literal30=null;
        Token string_literal31=null;
        Token ID32=null;
        Token char_literal34=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token ID38=null;
        Token char_literal40=null;
        Token string_literal42=null;
        Token string_literal43=null;
        Token ID44=null;
        Token char_literal46=null;
        ScannerALTParser.indexes_return indexes27 = null;

        ScannerALTParser.expression_return expression29 = null;

        ScannerALTParser.indexes_return indexes33 = null;

        ScannerALTParser.expression_return expression35 = null;

        ScannerALTParser.indexes_return indexes39 = null;

        ScannerALTParser.expression_return expression41 = null;

        ScannerALTParser.indexes_return indexes45 = null;

        ScannerALTParser.expression_return expression47 = null;


        Object string_literal24_tree=null;
        Object string_literal25_tree=null;
        Object ID26_tree=null;
        Object char_literal28_tree=null;
        Object string_literal30_tree=null;
        Object string_literal31_tree=null;
        Object ID32_tree=null;
        Object char_literal34_tree=null;
        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object ID38_tree=null;
        Object char_literal40_tree=null;
        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object ID44_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:3: ( 'var' 'int' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? INT ) | 'var' 'double' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? DOUBLE ) | 'var' 'String' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? STRING ) | 'var' 'boolean' ID ( indexes )? ( '=' expression )? -> ^( VARDECL ID ( indexes )? ( expression )? BOOLEAN ) )
            int alt14=4;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==81) ) {
                switch ( input.LA(2) ) {
                case 82:
                    {
                    alt14=1;
                    }
                    break;
                case 83:
                    {
                    alt14=2;
                    }
                    break;
                case 84:
                    {
                    alt14=3;
                    }
                    break;
                case 85:
                    {
                    alt14=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:6: 'var' 'int' ID ( indexes )? ( '=' expression )?
                    {
                    string_literal24=(Token)match(input,81,FOLLOW_81_in_varDecl330);  
                    stream_81.add(string_literal24);

                    string_literal25=(Token)match(input,82,FOLLOW_82_in_varDecl332);  
                    stream_82.add(string_literal25);

                    ID26=(Token)match(input,ID,FOLLOW_ID_in_varDecl334);  
                    stream_ID.add(ID26);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:21: ( indexes )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==OBracket) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:21: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_varDecl336);
                            indexes27=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes27.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:30: ( '=' expression )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==Assign) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:31: '=' expression
                            {
                            char_literal28=(Token)match(input,Assign,FOLLOW_Assign_in_varDecl340);  
                            stream_Assign.add(char_literal28);

                            pushFollow(FOLLOW_expression_in_varDecl342);
                            expression29=expression();

                            state._fsp--;

                            stream_expression.add(expression29.getTree());

                            }
                            break;

                    }

                    Main.getSelTab().addCompletion((ID26!=null?ID26.getText():null));


                    // AST REWRITE
                    // elements: indexes, expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 88:93: -> ^( VARDECL ID ( indexes )? ( expression )? INT )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:96: ^( VARDECL ID ( indexes )? ( expression )? INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:109: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:88:118: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "INT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:6: 'var' 'double' ID ( indexes )? ( '=' expression )?
                    {
                    string_literal30=(Token)match(input,81,FOLLOW_81_in_varDecl370);  
                    stream_81.add(string_literal30);

                    string_literal31=(Token)match(input,83,FOLLOW_83_in_varDecl372);  
                    stream_83.add(string_literal31);

                    ID32=(Token)match(input,ID,FOLLOW_ID_in_varDecl374);  
                    stream_ID.add(ID32);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:24: ( indexes )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==OBracket) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:24: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_varDecl376);
                            indexes33=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes33.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:33: ( '=' expression )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==Assign) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:34: '=' expression
                            {
                            char_literal34=(Token)match(input,Assign,FOLLOW_Assign_in_varDecl380);  
                            stream_Assign.add(char_literal34);

                            pushFollow(FOLLOW_expression_in_varDecl382);
                            expression35=expression();

                            state._fsp--;

                            stream_expression.add(expression35.getTree());

                            }
                            break;

                    }

                    Main.getSelTab().addCompletion((ID32!=null?ID32.getText():null));


                    // AST REWRITE
                    // elements: expression, indexes, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 89:94: -> ^( VARDECL ID ( indexes )? ( expression )? DOUBLE )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:97: ^( VARDECL ID ( indexes )? ( expression )? DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:110: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:89:119: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, (Object)adaptor.create(DOUBLE, "DOUBLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:6: 'var' 'String' ID ( indexes )? ( '=' expression )?
                    {
                    string_literal36=(Token)match(input,81,FOLLOW_81_in_varDecl408);  
                    stream_81.add(string_literal36);

                    string_literal37=(Token)match(input,84,FOLLOW_84_in_varDecl410);  
                    stream_84.add(string_literal37);

                    ID38=(Token)match(input,ID,FOLLOW_ID_in_varDecl412);  
                    stream_ID.add(ID38);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:24: ( indexes )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==OBracket) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:24: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_varDecl414);
                            indexes39=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes39.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:33: ( '=' expression )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==Assign) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:34: '=' expression
                            {
                            char_literal40=(Token)match(input,Assign,FOLLOW_Assign_in_varDecl418);  
                            stream_Assign.add(char_literal40);

                            pushFollow(FOLLOW_expression_in_varDecl420);
                            expression41=expression();

                            state._fsp--;

                            stream_expression.add(expression41.getTree());

                            }
                            break;

                    }

                    Main.getSelTab().addCompletion((ID38!=null?ID38.getText():null));


                    // AST REWRITE
                    // elements: ID, expression, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 90:95: -> ^( VARDECL ID ( indexes )? ( expression )? STRING )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:98: ^( VARDECL ID ( indexes )? ( expression )? STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:111: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:90:120: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, (Object)adaptor.create(STRING, "STRING"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:6: 'var' 'boolean' ID ( indexes )? ( '=' expression )?
                    {
                    string_literal42=(Token)match(input,81,FOLLOW_81_in_varDecl447);  
                    stream_81.add(string_literal42);

                    string_literal43=(Token)match(input,85,FOLLOW_85_in_varDecl449);  
                    stream_85.add(string_literal43);

                    ID44=(Token)match(input,ID,FOLLOW_ID_in_varDecl451);  
                    stream_ID.add(ID44);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:25: ( indexes )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==OBracket) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_varDecl453);
                            indexes45=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes45.getTree());

                            }
                            break;

                    }

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:34: ( '=' expression )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Assign) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:35: '=' expression
                            {
                            char_literal46=(Token)match(input,Assign,FOLLOW_Assign_in_varDecl457);  
                            stream_Assign.add(char_literal46);

                            pushFollow(FOLLOW_expression_in_varDecl459);
                            expression47=expression();

                            state._fsp--;

                            stream_expression.add(expression47.getTree());

                            }
                            break;

                    }

                    Main.getSelTab().addCompletion((ID44!=null?ID44.getText():null));


                    // AST REWRITE
                    // elements: expression, ID, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 91:96: -> ^( VARDECL ID ( indexes )? ( expression )? BOOLEAN )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:99: ^( VARDECL ID ( indexes )? ( expression )? BOOLEAN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VARDECL, "VARDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:112: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:91:121: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();
                        adaptor.addChild(root_1, (Object)adaptor.create(BOOLEAN, "BOOLEAN"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "varDecl"

    public static class constDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "constDecl"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:94:1: constDecl : ( 'const' 'int' ID '=' expression -> ^( CONSTDECL ID expression INT ) | 'const' 'double' ID '=' expression -> ^( CONSTDECL ID expression DOUBLE ) | 'const' 'String' ID '=' expression -> ^( CONSTDECL ID expression STRING ) | 'const' 'boolean' ID '=' expression -> ^( CONSTDECL ID expression BOOLEAN ) );
    public final ScannerALTParser.constDecl_return constDecl() throws RecognitionException {
        ScannerALTParser.constDecl_return retval = new ScannerALTParser.constDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal48=null;
        Token string_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token string_literal53=null;
        Token string_literal54=null;
        Token ID55=null;
        Token char_literal56=null;
        Token string_literal58=null;
        Token string_literal59=null;
        Token ID60=null;
        Token char_literal61=null;
        Token string_literal63=null;
        Token string_literal64=null;
        Token ID65=null;
        Token char_literal66=null;
        ScannerALTParser.expression_return expression52 = null;

        ScannerALTParser.expression_return expression57 = null;

        ScannerALTParser.expression_return expression62 = null;

        ScannerALTParser.expression_return expression67 = null;


        Object string_literal48_tree=null;
        Object string_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object string_literal53_tree=null;
        Object string_literal54_tree=null;
        Object ID55_tree=null;
        Object char_literal56_tree=null;
        Object string_literal58_tree=null;
        Object string_literal59_tree=null;
        Object ID60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal63_tree=null;
        Object string_literal64_tree=null;
        Object ID65_tree=null;
        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:95:3: ( 'const' 'int' ID '=' expression -> ^( CONSTDECL ID expression INT ) | 'const' 'double' ID '=' expression -> ^( CONSTDECL ID expression DOUBLE ) | 'const' 'String' ID '=' expression -> ^( CONSTDECL ID expression STRING ) | 'const' 'boolean' ID '=' expression -> ^( CONSTDECL ID expression BOOLEAN ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==86) ) {
                switch ( input.LA(2) ) {
                case 82:
                    {
                    alt15=1;
                    }
                    break;
                case 83:
                    {
                    alt15=2;
                    }
                    break;
                case 84:
                    {
                    alt15=3;
                    }
                    break;
                case 85:
                    {
                    alt15=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:95:6: 'const' 'int' ID '=' expression
                    {
                    string_literal48=(Token)match(input,86,FOLLOW_86_in_constDecl493);  
                    stream_86.add(string_literal48);

                    string_literal49=(Token)match(input,82,FOLLOW_82_in_constDecl495);  
                    stream_82.add(string_literal49);

                    ID50=(Token)match(input,ID,FOLLOW_ID_in_constDecl497);  
                    stream_ID.add(ID50);

                    char_literal51=(Token)match(input,Assign,FOLLOW_Assign_in_constDecl499);  
                    stream_Assign.add(char_literal51);

                    pushFollow(FOLLOW_expression_in_constDecl501);
                    expression52=expression();

                    state._fsp--;

                    stream_expression.add(expression52.getTree());
                    Main.getSelTab().addCompletion((ID50!=null?ID50.getText():null));


                    // AST REWRITE
                    // elements: ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:82: -> ^( CONSTDECL ID expression INT )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:95:85: ^( CONSTDECL ID expression INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTDECL, "CONSTDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(INT, "INT"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:96:6: 'const' 'double' ID '=' expression
                    {
                    string_literal53=(Token)match(input,86,FOLLOW_86_in_constDecl522);  
                    stream_86.add(string_literal53);

                    string_literal54=(Token)match(input,83,FOLLOW_83_in_constDecl524);  
                    stream_83.add(string_literal54);

                    ID55=(Token)match(input,ID,FOLLOW_ID_in_constDecl526);  
                    stream_ID.add(ID55);

                    char_literal56=(Token)match(input,Assign,FOLLOW_Assign_in_constDecl528);  
                    stream_Assign.add(char_literal56);

                    pushFollow(FOLLOW_expression_in_constDecl530);
                    expression57=expression();

                    state._fsp--;

                    stream_expression.add(expression57.getTree());
                    Main.getSelTab().addCompletion((ID55!=null?ID55.getText():null));


                    // AST REWRITE
                    // elements: expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:84: -> ^( CONSTDECL ID expression DOUBLE )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:96:87: ^( CONSTDECL ID expression DOUBLE )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTDECL, "CONSTDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(DOUBLE, "DOUBLE"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:97:6: 'const' 'String' ID '=' expression
                    {
                    string_literal58=(Token)match(input,86,FOLLOW_86_in_constDecl550);  
                    stream_86.add(string_literal58);

                    string_literal59=(Token)match(input,84,FOLLOW_84_in_constDecl552);  
                    stream_84.add(string_literal59);

                    ID60=(Token)match(input,ID,FOLLOW_ID_in_constDecl554);  
                    stream_ID.add(ID60);

                    char_literal61=(Token)match(input,Assign,FOLLOW_Assign_in_constDecl556);  
                    stream_Assign.add(char_literal61);

                    pushFollow(FOLLOW_expression_in_constDecl558);
                    expression62=expression();

                    state._fsp--;

                    stream_expression.add(expression62.getTree());
                    Main.getSelTab().addCompletion((ID60!=null?ID60.getText():null));


                    // AST REWRITE
                    // elements: ID, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:84: -> ^( CONSTDECL ID expression STRING )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:97:87: ^( CONSTDECL ID expression STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTDECL, "CONSTDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(STRING, "STRING"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:98:6: 'const' 'boolean' ID '=' expression
                    {
                    string_literal63=(Token)match(input,86,FOLLOW_86_in_constDecl578);  
                    stream_86.add(string_literal63);

                    string_literal64=(Token)match(input,85,FOLLOW_85_in_constDecl580);  
                    stream_85.add(string_literal64);

                    ID65=(Token)match(input,ID,FOLLOW_ID_in_constDecl582);  
                    stream_ID.add(ID65);

                    char_literal66=(Token)match(input,Assign,FOLLOW_Assign_in_constDecl584);  
                    stream_Assign.add(char_literal66);

                    pushFollow(FOLLOW_expression_in_constDecl586);
                    expression67=expression();

                    state._fsp--;

                    stream_expression.add(expression67.getTree());
                    Main.getSelTab().addCompletion((ID65!=null?ID65.getText():null));


                    // AST REWRITE
                    // elements: expression, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 98:85: -> ^( CONSTDECL ID expression BOOLEAN )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:98:88: ^( CONSTDECL ID expression BOOLEAN )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONSTDECL, "CONSTDECL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());
                        adaptor.addChild(root_1, (Object)adaptor.create(BOOLEAN, "BOOLEAN"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "constDecl"

    public static class assignment_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "assignment"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:101:1: assignment : ID ( indexes )? '=' expression -> ^( ASSIGNMENT ID ( indexes )? expression ) ;
    public final ScannerALTParser.assignment_return assignment() throws RecognitionException {
        ScannerALTParser.assignment_return retval = new ScannerALTParser.assignment_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID68=null;
        Token char_literal70=null;
        ScannerALTParser.indexes_return indexes69 = null;

        ScannerALTParser.expression_return expression71 = null;


        Object ID68_tree=null;
        Object char_literal70_tree=null;
        RewriteRuleTokenStream stream_Assign=new RewriteRuleTokenStream(adaptor,"token Assign");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:3: ( ID ( indexes )? '=' expression -> ^( ASSIGNMENT ID ( indexes )? expression ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:6: ID ( indexes )? '=' expression
            {
            ID68=(Token)match(input,ID,FOLLOW_ID_in_assignment613);  
            stream_ID.add(ID68);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:9: ( indexes )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OBracket) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:9: indexes
                    {
                    pushFollow(FOLLOW_indexes_in_assignment615);
                    indexes69=indexes();

                    state._fsp--;

                    stream_indexes.add(indexes69.getTree());

                    }
                    break;

            }

            char_literal70=(Token)match(input,Assign,FOLLOW_Assign_in_assignment618);  
            stream_Assign.add(char_literal70);

            pushFollow(FOLLOW_expression_in_assignment620);
            expression71=expression();

            state._fsp--;

            stream_expression.add(expression71.getTree());


            // AST REWRITE
            // elements: ID, indexes, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 102:34: -> ^( ASSIGNMENT ID ( indexes )? expression )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:37: ^( ASSIGNMENT ID ( indexes )? expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ASSIGNMENT, "ASSIGNMENT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:102:53: ( indexes )?
                if ( stream_indexes.hasNext() ) {
                    adaptor.addChild(root_1, stream_indexes.nextTree());

                }
                stream_indexes.reset();
                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "assignment"

    public static class functionCall_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionCall"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:105:1: functionCall : ( ID '(' ( exprList )? ')' -> ^( FUNC_CALL ID ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | ScanInt '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanInt ID ( indexes )? ) | ScanDouble '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanDouble ID ( indexes )? ) | ScanString '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanString ID ( indexes )? ) | ScanBoolean '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanBoolean ID ( indexes )? ) );
    public final ScannerALTParser.functionCall_return functionCall() throws RecognitionException {
        ScannerALTParser.functionCall_return retval = new ScannerALTParser.functionCall_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID72=null;
        Token char_literal73=null;
        Token char_literal75=null;
        Token Println76=null;
        Token char_literal77=null;
        Token char_literal79=null;
        Token Print80=null;
        Token char_literal81=null;
        Token char_literal83=null;
        Token ScanInt84=null;
        Token char_literal85=null;
        Token ID86=null;
        Token char_literal88=null;
        Token ScanDouble89=null;
        Token char_literal90=null;
        Token ID91=null;
        Token char_literal93=null;
        Token ScanString94=null;
        Token char_literal95=null;
        Token ID96=null;
        Token char_literal98=null;
        Token ScanBoolean99=null;
        Token char_literal100=null;
        Token ID101=null;
        Token char_literal103=null;
        ScannerALTParser.exprList_return exprList74 = null;

        ScannerALTParser.expression_return expression78 = null;

        ScannerALTParser.expression_return expression82 = null;

        ScannerALTParser.indexes_return indexes87 = null;

        ScannerALTParser.indexes_return indexes92 = null;

        ScannerALTParser.indexes_return indexes97 = null;

        ScannerALTParser.indexes_return indexes102 = null;


        Object ID72_tree=null;
        Object char_literal73_tree=null;
        Object char_literal75_tree=null;
        Object Println76_tree=null;
        Object char_literal77_tree=null;
        Object char_literal79_tree=null;
        Object Print80_tree=null;
        Object char_literal81_tree=null;
        Object char_literal83_tree=null;
        Object ScanInt84_tree=null;
        Object char_literal85_tree=null;
        Object ID86_tree=null;
        Object char_literal88_tree=null;
        Object ScanDouble89_tree=null;
        Object char_literal90_tree=null;
        Object ID91_tree=null;
        Object char_literal93_tree=null;
        Object ScanString94_tree=null;
        Object char_literal95_tree=null;
        Object ID96_tree=null;
        Object char_literal98_tree=null;
        Object ScanBoolean99_tree=null;
        Object char_literal100_tree=null;
        Object ID101_tree=null;
        Object char_literal103_tree=null;
        RewriteRuleTokenStream stream_Println=new RewriteRuleTokenStream(adaptor,"token Println");
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_ScanString=new RewriteRuleTokenStream(adaptor,"token ScanString");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_ScanInt=new RewriteRuleTokenStream(adaptor,"token ScanInt");
        RewriteRuleTokenStream stream_ScanDouble=new RewriteRuleTokenStream(adaptor,"token ScanDouble");
        RewriteRuleTokenStream stream_ScanBoolean=new RewriteRuleTokenStream(adaptor,"token ScanBoolean");
        RewriteRuleTokenStream stream_Print=new RewriteRuleTokenStream(adaptor,"token Print");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:3: ( ID '(' ( exprList )? ')' -> ^( FUNC_CALL ID ( exprList )? ) | Println '(' ( expression )? ')' -> ^( FUNC_CALL Println ( expression )? ) | Print '(' expression ')' -> ^( FUNC_CALL Print expression ) | ScanInt '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanInt ID ( indexes )? ) | ScanDouble '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanDouble ID ( indexes )? ) | ScanString '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanString ID ( indexes )? ) | ScanBoolean '(' ID ( indexes )? ')' -> ^( FUNC_CALL ScanBoolean ID ( indexes )? ) )
            int alt23=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt23=1;
                }
                break;
            case Println:
                {
                alt23=2;
                }
                break;
            case Print:
                {
                alt23=3;
                }
                break;
            case ScanInt:
                {
                alt23=4;
                }
                break;
            case ScanDouble:
                {
                alt23=5;
                }
                break;
            case ScanString:
                {
                alt23=6;
                }
                break;
            case ScanBoolean:
                {
                alt23=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:6: ID '(' ( exprList )? ')'
                    {
                    ID72=(Token)match(input,ID,FOLLOW_ID_in_functionCall648);  
                    stream_ID.add(ID72);

                    char_literal73=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall650);  
                    stream_OParen.add(char_literal73);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:13: ( exprList )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=ID && LA17_0<=ScanBoolean)||(LA17_0>=Number && LA17_0<=String)||LA17_0==Excl||LA17_0==Subtract||LA17_0==OBracket||LA17_0==OParen) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:13: exprList
                            {
                            pushFollow(FOLLOW_exprList_in_functionCall652);
                            exprList74=exprList();

                            state._fsp--;

                            stream_exprList.add(exprList74.getTree());

                            }
                            break;

                    }

                    char_literal75=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall655);  
                    stream_CParen.add(char_literal75);



                    // AST REWRITE
                    // elements: exprList, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:27: -> ^( FUNC_CALL ID ( exprList )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:30: ^( FUNC_CALL ID ( exprList )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:106:45: ( exprList )?
                        if ( stream_exprList.hasNext() ) {
                            adaptor.addChild(root_1, stream_exprList.nextTree());

                        }
                        stream_exprList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:107:6: Println '(' ( expression )? ')'
                    {
                    Println76=(Token)match(input,Println,FOLLOW_Println_in_functionCall674);  
                    stream_Println.add(Println76);

                    char_literal77=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall676);  
                    stream_OParen.add(char_literal77);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:107:18: ( expression )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=ID && LA18_0<=ScanBoolean)||(LA18_0>=Number && LA18_0<=String)||LA18_0==Excl||LA18_0==Subtract||LA18_0==OBracket||LA18_0==OParen) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:107:18: expression
                            {
                            pushFollow(FOLLOW_expression_in_functionCall678);
                            expression78=expression();

                            state._fsp--;

                            stream_expression.add(expression78.getTree());

                            }
                            break;

                    }

                    char_literal79=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall681);  
                    stream_CParen.add(char_literal79);



                    // AST REWRITE
                    // elements: Println, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 107:35: -> ^( FUNC_CALL Println ( expression )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:107:38: ^( FUNC_CALL Println ( expression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_Println.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:107:58: ( expression )?
                        if ( stream_expression.hasNext() ) {
                            adaptor.addChild(root_1, stream_expression.nextTree());

                        }
                        stream_expression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:108:6: Print '(' expression ')'
                    {
                    Print80=(Token)match(input,Print,FOLLOW_Print_in_functionCall700);  
                    stream_Print.add(Print80);

                    char_literal81=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall702);  
                    stream_OParen.add(char_literal81);

                    pushFollow(FOLLOW_expression_in_functionCall704);
                    expression82=expression();

                    state._fsp--;

                    stream_expression.add(expression82.getTree());
                    char_literal83=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall706);  
                    stream_CParen.add(char_literal83);



                    // AST REWRITE
                    // elements: expression, Print
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 108:35: -> ^( FUNC_CALL Print expression )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:108:38: ^( FUNC_CALL Print expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_Print.nextNode());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:109:6: ScanInt '(' ID ( indexes )? ')'
                    {
                    ScanInt84=(Token)match(input,ScanInt,FOLLOW_ScanInt_in_functionCall727);  
                    stream_ScanInt.add(ScanInt84);

                    char_literal85=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall729);  
                    stream_OParen.add(char_literal85);

                    ID86=(Token)match(input,ID,FOLLOW_ID_in_functionCall730);  
                    stream_ID.add(ID86);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:109:20: ( indexes )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OBracket) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:109:20: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_functionCall732);
                            indexes87=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes87.getTree());

                            }
                            break;

                    }

                    char_literal88=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall734);  
                    stream_CParen.add(char_literal88);



                    // AST REWRITE
                    // elements: ID, indexes, ScanInt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 109:36: -> ^( FUNC_CALL ScanInt ID ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:109:39: ^( FUNC_CALL ScanInt ID ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ScanInt.nextNode());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:109:62: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:110:6: ScanDouble '(' ID ( indexes )? ')'
                    {
                    ScanDouble89=(Token)match(input,ScanDouble,FOLLOW_ScanDouble_in_functionCall758);  
                    stream_ScanDouble.add(ScanDouble89);

                    char_literal90=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall760);  
                    stream_OParen.add(char_literal90);

                    ID91=(Token)match(input,ID,FOLLOW_ID_in_functionCall761);  
                    stream_ID.add(ID91);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:110:23: ( indexes )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==OBracket) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:110:23: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_functionCall763);
                            indexes92=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes92.getTree());

                            }
                            break;

                    }

                    char_literal93=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall765);  
                    stream_CParen.add(char_literal93);



                    // AST REWRITE
                    // elements: indexes, ScanDouble, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 110:39: -> ^( FUNC_CALL ScanDouble ID ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:110:42: ^( FUNC_CALL ScanDouble ID ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ScanDouble.nextNode());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:110:68: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:111:6: ScanString '(' ID ( indexes )? ')'
                    {
                    ScanString94=(Token)match(input,ScanString,FOLLOW_ScanString_in_functionCall789);  
                    stream_ScanString.add(ScanString94);

                    char_literal95=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall791);  
                    stream_OParen.add(char_literal95);

                    ID96=(Token)match(input,ID,FOLLOW_ID_in_functionCall792);  
                    stream_ID.add(ID96);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:111:23: ( indexes )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==OBracket) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:111:23: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_functionCall794);
                            indexes97=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes97.getTree());

                            }
                            break;

                    }

                    char_literal98=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall796);  
                    stream_CParen.add(char_literal98);



                    // AST REWRITE
                    // elements: ID, ScanString, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 111:39: -> ^( FUNC_CALL ScanString ID ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:111:42: ^( FUNC_CALL ScanString ID ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ScanString.nextNode());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:111:68: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:112:6: ScanBoolean '(' ID ( indexes )? ')'
                    {
                    ScanBoolean99=(Token)match(input,ScanBoolean,FOLLOW_ScanBoolean_in_functionCall820);  
                    stream_ScanBoolean.add(ScanBoolean99);

                    char_literal100=(Token)match(input,OParen,FOLLOW_OParen_in_functionCall822);  
                    stream_OParen.add(char_literal100);

                    ID101=(Token)match(input,ID,FOLLOW_ID_in_functionCall823);  
                    stream_ID.add(ID101);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:112:24: ( indexes )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==OBracket) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:112:24: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_functionCall825);
                            indexes102=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes102.getTree());

                            }
                            break;

                    }

                    char_literal103=(Token)match(input,CParen,FOLLOW_CParen_in_functionCall827);  
                    stream_CParen.add(char_literal103);



                    // AST REWRITE
                    // elements: ScanBoolean, indexes, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 112:40: -> ^( FUNC_CALL ScanBoolean ID ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:112:43: ^( FUNC_CALL ScanBoolean ID ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FUNC_CALL, "FUNC_CALL"), root_1);

                        adaptor.addChild(root_1, stream_ScanBoolean.nextNode());
                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:112:70: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionCall"

    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStatement"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:115:1: ifStatement : ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) ;
    public final ScannerALTParser.ifStatement_return ifStatement() throws RecognitionException {
        ScannerALTParser.ifStatement_return retval = new ScannerALTParser.ifStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScannerALTParser.ifStat_return ifStat104 = null;

        ScannerALTParser.elseIfStat_return elseIfStat105 = null;

        ScannerALTParser.elseStat_return elseStat106 = null;


        RewriteRuleSubtreeStream stream_elseIfStat=new RewriteRuleSubtreeStream(adaptor,"rule elseIfStat");
        RewriteRuleSubtreeStream stream_ifStat=new RewriteRuleSubtreeStream(adaptor,"rule ifStat");
        RewriteRuleSubtreeStream stream_elseStat=new RewriteRuleSubtreeStream(adaptor,"rule elseStat");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:3: ( ifStat ( elseIfStat )* ( elseStat )? -> ^( IF ifStat ( elseIfStat )* ( elseStat )? ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:6: ifStat ( elseIfStat )* ( elseStat )?
            {
            pushFollow(FOLLOW_ifStat_in_ifStatement858);
            ifStat104=ifStat();

            state._fsp--;

            stream_ifStat.add(ifStat104.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:13: ( elseIfStat )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Else) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==If) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:13: elseIfStat
            	    {
            	    pushFollow(FOLLOW_elseIfStat_in_ifStatement860);
            	    elseIfStat105=elseIfStat();

            	    state._fsp--;

            	    stream_elseIfStat.add(elseIfStat105.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:25: ( elseStat )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Else) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:25: elseStat
                    {
                    pushFollow(FOLLOW_elseStat_in_ifStatement863);
                    elseStat106=elseStat();

                    state._fsp--;

                    stream_elseStat.add(elseStat106.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: elseStat, ifStat, elseIfStat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 116:35: -> ^( IF ifStat ( elseIfStat )* ( elseStat )? )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:38: ^( IF ifStat ( elseIfStat )* ( elseStat )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IF, "IF"), root_1);

                adaptor.addChild(root_1, stream_ifStat.nextTree());
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:50: ( elseIfStat )*
                while ( stream_elseIfStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseIfStat.nextTree());

                }
                stream_elseIfStat.reset();
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:116:62: ( elseStat )?
                if ( stream_elseStat.hasNext() ) {
                    adaptor.addChild(root_1, stream_elseStat.nextTree());

                }
                stream_elseStat.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStatement"

    public static class ifStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifStat"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:119:1: ifStat : If '(' expression ')' block -> ^( EXP expression block ) ;
    public final ScannerALTParser.ifStat_return ifStat() throws RecognitionException {
        ScannerALTParser.ifStat_return retval = new ScannerALTParser.ifStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token If107=null;
        Token char_literal108=null;
        Token char_literal110=null;
        ScannerALTParser.expression_return expression109 = null;

        ScannerALTParser.block_return block111 = null;


        Object If107_tree=null;
        Object char_literal108_tree=null;
        Object char_literal110_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:120:3: ( If '(' expression ')' block -> ^( EXP expression block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:120:6: If '(' expression ')' block
            {
            If107=(Token)match(input,If,FOLLOW_If_in_ifStat892);  
            stream_If.add(If107);

            char_literal108=(Token)match(input,OParen,FOLLOW_OParen_in_ifStat894);  
            stream_OParen.add(char_literal108);

            pushFollow(FOLLOW_expression_in_ifStat895);
            expression109=expression();

            state._fsp--;

            stream_expression.add(expression109.getTree());
            char_literal110=(Token)match(input,CParen,FOLLOW_CParen_in_ifStat896);  
            stream_CParen.add(char_literal110);

            pushFollow(FOLLOW_block_in_ifStat898);
            block111=block();

            state._fsp--;

            stream_block.add(block111.getTree());


            // AST REWRITE
            // elements: block, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:33: -> ^( EXP expression block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:120:36: ^( EXP expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "ifStat"

    public static class elseIfStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseIfStat"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:123:1: elseIfStat : Else If '(' expression ')' block -> ^( EXP expression block ) ;
    public final ScannerALTParser.elseIfStat_return elseIfStat() throws RecognitionException {
        ScannerALTParser.elseIfStat_return retval = new ScannerALTParser.elseIfStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else112=null;
        Token If113=null;
        Token char_literal114=null;
        Token char_literal116=null;
        ScannerALTParser.expression_return expression115 = null;

        ScannerALTParser.block_return block117 = null;


        Object Else112_tree=null;
        Object If113_tree=null;
        Object char_literal114_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleTokenStream stream_If=new RewriteRuleTokenStream(adaptor,"token If");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:124:3: ( Else If '(' expression ')' block -> ^( EXP expression block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:124:6: Else If '(' expression ')' block
            {
            Else112=(Token)match(input,Else,FOLLOW_Else_in_elseIfStat923);  
            stream_Else.add(Else112);

            If113=(Token)match(input,If,FOLLOW_If_in_elseIfStat925);  
            stream_If.add(If113);

            char_literal114=(Token)match(input,OParen,FOLLOW_OParen_in_elseIfStat927);  
            stream_OParen.add(char_literal114);

            pushFollow(FOLLOW_expression_in_elseIfStat928);
            expression115=expression();

            state._fsp--;

            stream_expression.add(expression115.getTree());
            char_literal116=(Token)match(input,CParen,FOLLOW_CParen_in_elseIfStat929);  
            stream_CParen.add(char_literal116);

            pushFollow(FOLLOW_block_in_elseIfStat931);
            block117=block();

            state._fsp--;

            stream_block.add(block117.getTree());


            // AST REWRITE
            // elements: expression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 124:37: -> ^( EXP expression block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:124:40: ^( EXP expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseIfStat"

    public static class elseStat_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "elseStat"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:127:1: elseStat : Else block -> ^( EXP block ) ;
    public final ScannerALTParser.elseStat_return elseStat() throws RecognitionException {
        ScannerALTParser.elseStat_return retval = new ScannerALTParser.elseStat_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Else118=null;
        ScannerALTParser.block_return block119 = null;


        Object Else118_tree=null;
        RewriteRuleTokenStream stream_Else=new RewriteRuleTokenStream(adaptor,"token Else");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:128:3: ( Else block -> ^( EXP block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:128:6: Else block
            {
            Else118=(Token)match(input,Else,FOLLOW_Else_in_elseStat955);  
            stream_Else.add(Else118);

            pushFollow(FOLLOW_block_in_elseStat957);
            block119=block();

            state._fsp--;

            stream_block.add(block119.getTree());


            // AST REWRITE
            // elements: block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:17: -> ^( EXP block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:128:20: ^( EXP block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP, "EXP"), root_1);

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "elseStat"

    public static class functionDecl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "functionDecl"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:131:1: functionDecl : Func ID '(' ( idList )? ')' block End ;
    public final ScannerALTParser.functionDecl_return functionDecl() throws RecognitionException {
        ScannerALTParser.functionDecl_return retval = new ScannerALTParser.functionDecl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Func120=null;
        Token ID121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        Token End126=null;
        ScannerALTParser.idList_return idList123 = null;

        ScannerALTParser.block_return block125 = null;


        Object Func120_tree=null;
        Object ID121_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;
        Object End126_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:132:3: ( Func ID '(' ( idList )? ')' block End )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:132:6: Func ID '(' ( idList )? ')' block End
            {
            root_0 = (Object)adaptor.nil();

            Func120=(Token)match(input,Func,FOLLOW_Func_in_functionDecl979); 
            Func120_tree = (Object)adaptor.create(Func120);
            adaptor.addChild(root_0, Func120_tree);

            ID121=(Token)match(input,ID,FOLLOW_ID_in_functionDecl981); 
            ID121_tree = (Object)adaptor.create(ID121);
            adaptor.addChild(root_0, ID121_tree);

            char_literal122=(Token)match(input,OParen,FOLLOW_OParen_in_functionDecl983); 
            char_literal122_tree = (Object)adaptor.create(char_literal122);
            adaptor.addChild(root_0, char_literal122_tree);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:132:18: ( idList )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=82 && LA26_0<=85)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:132:18: idList
                    {
                    pushFollow(FOLLOW_idList_in_functionDecl985);
                    idList123=idList();

                    state._fsp--;

                    adaptor.addChild(root_0, idList123.getTree());

                    }
                    break;

            }

            char_literal124=(Token)match(input,CParen,FOLLOW_CParen_in_functionDecl988); 
            char_literal124_tree = (Object)adaptor.create(char_literal124);
            adaptor.addChild(root_0, char_literal124_tree);

            pushFollow(FOLLOW_block_in_functionDecl990);
            block125=block();

            state._fsp--;

            adaptor.addChild(root_0, block125.getTree());
            End126=(Token)match(input,End,FOLLOW_End_in_functionDecl992); 
            End126_tree = (Object)adaptor.create(End126);
            adaptor.addChild(root_0, End126_tree);

            defineFunction((ID121!=null?ID121.getText():null), (idList123!=null?((Object)idList123.tree):null), (block125!=null?((Object)block125.tree):null)); 
                 Main.getSelTab().addCompletion((ID121!=null?ID121.getText():null)+"()");

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "functionDecl"

    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forStatement"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:137:1: forStatement : For '(' assignment ';' expression ';' assignment ')' block -> ^( For expression assignment assignment block ) ;
    public final ScannerALTParser.forStatement_return forStatement() throws RecognitionException {
        ScannerALTParser.forStatement_return retval = new ScannerALTParser.forStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token For127=null;
        Token char_literal128=null;
        Token char_literal130=null;
        Token char_literal132=null;
        Token char_literal134=null;
        ScannerALTParser.assignment_return assignment129 = null;

        ScannerALTParser.expression_return expression131 = null;

        ScannerALTParser.assignment_return assignment133 = null;

        ScannerALTParser.block_return block135 = null;


        Object For127_tree=null;
        Object char_literal128_tree=null;
        Object char_literal130_tree=null;
        Object char_literal132_tree=null;
        Object char_literal134_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_For=new RewriteRuleTokenStream(adaptor,"token For");
        RewriteRuleTokenStream stream_SColon=new RewriteRuleTokenStream(adaptor,"token SColon");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_assignment=new RewriteRuleSubtreeStream(adaptor,"rule assignment");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:138:3: ( For '(' assignment ';' expression ';' assignment ')' block -> ^( For expression assignment assignment block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:138:6: For '(' assignment ';' expression ';' assignment ')' block
            {
            For127=(Token)match(input,For,FOLLOW_For_in_forStatement1015);  
            stream_For.add(For127);

            char_literal128=(Token)match(input,OParen,FOLLOW_OParen_in_forStatement1017);  
            stream_OParen.add(char_literal128);

            pushFollow(FOLLOW_assignment_in_forStatement1019);
            assignment129=assignment();

            state._fsp--;

            stream_assignment.add(assignment129.getTree());
            char_literal130=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement1021);  
            stream_SColon.add(char_literal130);

            pushFollow(FOLLOW_expression_in_forStatement1023);
            expression131=expression();

            state._fsp--;

            stream_expression.add(expression131.getTree());
            char_literal132=(Token)match(input,SColon,FOLLOW_SColon_in_forStatement1025);  
            stream_SColon.add(char_literal132);

            pushFollow(FOLLOW_assignment_in_forStatement1027);
            assignment133=assignment();

            state._fsp--;

            stream_assignment.add(assignment133.getTree());
            char_literal134=(Token)match(input,CParen,FOLLOW_CParen_in_forStatement1029);  
            stream_CParen.add(char_literal134);

            pushFollow(FOLLOW_block_in_forStatement1031);
            block135=block();

            state._fsp--;

            stream_block.add(block135.getTree());


            // AST REWRITE
            // elements: expression, assignment, block, assignment, For
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:6: -> ^( For expression assignment assignment block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:139:9: ^( For expression assignment assignment block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_For.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_assignment.nextTree());
                adaptor.addChild(root_1, stream_assignment.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "forStatement"

    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileStatement"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:142:1: whileStatement : While '(' expression ')' block -> ^( While expression block ) ;
    public final ScannerALTParser.whileStatement_return whileStatement() throws RecognitionException {
        ScannerALTParser.whileStatement_return retval = new ScannerALTParser.whileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token While136=null;
        Token char_literal137=null;
        Token char_literal139=null;
        ScannerALTParser.expression_return expression138 = null;

        ScannerALTParser.block_return block140 = null;


        Object While136_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:143:3: ( While '(' expression ')' block -> ^( While expression block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:143:6: While '(' expression ')' block
            {
            While136=(Token)match(input,While,FOLLOW_While_in_whileStatement1064);  
            stream_While.add(While136);

            char_literal137=(Token)match(input,OParen,FOLLOW_OParen_in_whileStatement1066);  
            stream_OParen.add(char_literal137);

            pushFollow(FOLLOW_expression_in_whileStatement1067);
            expression138=expression();

            state._fsp--;

            stream_expression.add(expression138.getTree());
            char_literal139=(Token)match(input,CParen,FOLLOW_CParen_in_whileStatement1069);  
            stream_CParen.add(char_literal139);

            pushFollow(FOLLOW_block_in_whileStatement1071);
            block140=block();

            state._fsp--;

            stream_block.add(block140.getTree());


            // AST REWRITE
            // elements: While, expression, block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 143:36: -> ^( While expression block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:143:39: ^( While expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_While.nextNode(), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whileStatement"

    public static class doWhileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "doWhileStatement"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:146:1: doWhileStatement : Do block While '(' expression ')' -> ^( Do While expression block ) ;
    public final ScannerALTParser.doWhileStatement_return doWhileStatement() throws RecognitionException {
        ScannerALTParser.doWhileStatement_return retval = new ScannerALTParser.doWhileStatement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Do141=null;
        Token While143=null;
        Token char_literal144=null;
        Token char_literal146=null;
        ScannerALTParser.block_return block142 = null;

        ScannerALTParser.expression_return expression145 = null;


        Object Do141_tree=null;
        Object While143_tree=null;
        Object char_literal144_tree=null;
        Object char_literal146_tree=null;
        RewriteRuleTokenStream stream_Do=new RewriteRuleTokenStream(adaptor,"token Do");
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_While=new RewriteRuleTokenStream(adaptor,"token While");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:147:3: ( Do block While '(' expression ')' -> ^( Do While expression block ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:147:6: Do block While '(' expression ')'
            {
            Do141=(Token)match(input,Do,FOLLOW_Do_in_doWhileStatement1097);  
            stream_Do.add(Do141);

            pushFollow(FOLLOW_block_in_doWhileStatement1100);
            block142=block();

            state._fsp--;

            stream_block.add(block142.getTree());
            While143=(Token)match(input,While,FOLLOW_While_in_doWhileStatement1102);  
            stream_While.add(While143);

            char_literal144=(Token)match(input,OParen,FOLLOW_OParen_in_doWhileStatement1103);  
            stream_OParen.add(char_literal144);

            pushFollow(FOLLOW_expression_in_doWhileStatement1104);
            expression145=expression();

            state._fsp--;

            stream_expression.add(expression145.getTree());
            char_literal146=(Token)match(input,CParen,FOLLOW_CParen_in_doWhileStatement1106);  
            stream_CParen.add(char_literal146);



            // AST REWRITE
            // elements: expression, While, block, Do
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:38: -> ^( Do While expression block )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:147:41: ^( Do While expression block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(stream_Do.nextNode(), root_1);

                adaptor.addChild(root_1, stream_While.nextNode());
                adaptor.addChild(root_1, stream_expression.nextTree());
                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"

    public static class idList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "idList"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:150:1: idList : type ID ( ',' type ID )* -> ^( ID_LIST ( type ID )+ ) ;
    public final ScannerALTParser.idList_return idList() throws RecognitionException {
        ScannerALTParser.idList_return retval = new ScannerALTParser.idList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID148=null;
        Token char_literal149=null;
        Token ID151=null;
        ScannerALTParser.type_return type147 = null;

        ScannerALTParser.type_return type150 = null;


        Object ID148_tree=null;
        Object char_literal149_tree=null;
        Object ID151_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:151:3: ( type ID ( ',' type ID )* -> ^( ID_LIST ( type ID )+ ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:151:6: type ID ( ',' type ID )*
            {
            pushFollow(FOLLOW_type_in_idList1131);
            type147=type();

            state._fsp--;

            stream_type.add(type147.getTree());
            ID148=(Token)match(input,ID,FOLLOW_ID_in_idList1133);  
            stream_ID.add(ID148);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:151:14: ( ',' type ID )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:151:15: ',' type ID
            	    {
            	    char_literal149=(Token)match(input,Comma,FOLLOW_Comma_in_idList1136);  
            	    stream_Comma.add(char_literal149);

            	    pushFollow(FOLLOW_type_in_idList1138);
            	    type150=type();

            	    state._fsp--;

            	    stream_type.add(type150.getTree());
            	    ID151=(Token)match(input,ID,FOLLOW_ID_in_idList1140);  
            	    stream_ID.add(ID151);


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);



            // AST REWRITE
            // elements: type, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 151:29: -> ^( ID_LIST ( type ID )+ )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:151:32: ^( ID_LIST ( type ID )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ID_LIST, "ID_LIST"), root_1);

                if ( !(stream_type.hasNext()||stream_ID.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_type.hasNext()||stream_ID.hasNext() ) {
                    adaptor.addChild(root_1, stream_type.nextTree());
                    adaptor.addChild(root_1, stream_ID.nextNode());

                }
                stream_type.reset();
                stream_ID.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "idList"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:154:1: type : ( 'int' | 'String' | 'double' | 'boolean' );
    public final ScannerALTParser.type_return type() throws RecognitionException {
        ScannerALTParser.type_return retval = new ScannerALTParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set152=null;

        Object set152_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:155:2: ( 'int' | 'String' | 'double' | 'boolean' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:
            {
            root_0 = (Object)adaptor.nil();

            set152=(Token)input.LT(1);
            if ( (input.LA(1)>=82 && input.LA(1)<=85) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set152));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    public static class exprList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exprList"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:161:1: exprList : expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) ;
    public final ScannerALTParser.exprList_return exprList() throws RecognitionException {
        ScannerALTParser.exprList_return retval = new ScannerALTParser.exprList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal154=null;
        ScannerALTParser.expression_return expression153 = null;

        ScannerALTParser.expression_return expression155 = null;


        Object char_literal154_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:162:3: ( expression ( ',' expression )* -> ^( EXP_LIST ( expression )+ ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:162:6: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_exprList1197);
            expression153=expression();

            state._fsp--;

            stream_expression.add(expression153.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:162:17: ( ',' expression )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==Comma) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:162:18: ',' expression
            	    {
            	    char_literal154=(Token)match(input,Comma,FOLLOW_Comma_in_exprList1200);  
            	    stream_Comma.add(char_literal154);

            	    pushFollow(FOLLOW_expression_in_exprList1202);
            	    expression155=expression();

            	    state._fsp--;

            	    stream_expression.add(expression155.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 162:35: -> ^( EXP_LIST ( expression )+ )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:162:38: ^( EXP_LIST ( expression )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXP_LIST, "EXP_LIST"), root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exprList"

    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:165:1: expression : condExpr ;
    public final ScannerALTParser.expression_return expression() throws RecognitionException {
        ScannerALTParser.expression_return retval = new ScannerALTParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        ScannerALTParser.condExpr_return condExpr156 = null;



        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:166:3: ( condExpr )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:166:6: condExpr
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_condExpr_in_expression1227);
            condExpr156=condExpr();

            state._fsp--;

            adaptor.addChild(root_0, condExpr156.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    public static class condExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "condExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:169:1: condExpr : ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? ;
    public final ScannerALTParser.condExpr_return condExpr() throws RecognitionException {
        ScannerALTParser.condExpr_return retval = new ScannerALTParser.condExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal158=null;
        Token char_literal159=null;
        Token In160=null;
        ScannerALTParser.expression_return a = null;

        ScannerALTParser.expression_return b = null;

        ScannerALTParser.orExpr_return orExpr157 = null;

        ScannerALTParser.expression_return expression161 = null;


        Object char_literal158_tree=null;
        Object char_literal159_tree=null;
        Object In160_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleTokenStream stream_Colon=new RewriteRuleTokenStream(adaptor,"token Colon");
        RewriteRuleTokenStream stream_QMark=new RewriteRuleTokenStream(adaptor,"token QMark");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_orExpr=new RewriteRuleSubtreeStream(adaptor,"rule orExpr");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:170:3: ( ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )? )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:170:6: ( orExpr -> orExpr ) ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
            {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:170:6: ( orExpr -> orExpr )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:170:7: orExpr
            {
            pushFollow(FOLLOW_orExpr_in_condExpr1242);
            orExpr157=orExpr();

            state._fsp--;

            stream_orExpr.add(orExpr157.getTree());


            // AST REWRITE
            // elements: orExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 170:14: -> orExpr
            {
                adaptor.addChild(root_0, stream_orExpr.nextTree());

            }

            retval.tree = root_0;
            }

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:171:6: ( '?' a= expression ':' b= expression -> ^( TERNARY orExpr $a $b) | In expression -> ^( In orExpr expression ) )?
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==QMark) ) {
                alt29=1;
            }
            else if ( (LA29_0==In) ) {
                alt29=2;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:171:8: '?' a= expression ':' b= expression
                    {
                    char_literal158=(Token)match(input,QMark,FOLLOW_QMark_in_condExpr1257);  
                    stream_QMark.add(char_literal158);

                    pushFollow(FOLLOW_expression_in_condExpr1261);
                    a=expression();

                    state._fsp--;

                    stream_expression.add(a.getTree());
                    char_literal159=(Token)match(input,Colon,FOLLOW_Colon_in_condExpr1263);  
                    stream_Colon.add(char_literal159);

                    pushFollow(FOLLOW_expression_in_condExpr1267);
                    b=expression();

                    state._fsp--;

                    stream_expression.add(b.getTree());


                    // AST REWRITE
                    // elements: b, a, orExpr
                    // token labels: 
                    // rule labels: retval, b, a
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_b=new RewriteRuleSubtreeStream(adaptor,"rule b",b!=null?b.tree:null);
                    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"rule a",a!=null?a.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 171:42: -> ^( TERNARY orExpr $a $b)
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:171:45: ^( TERNARY orExpr $a $b)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERNARY, "TERNARY"), root_1);

                        adaptor.addChild(root_1, stream_orExpr.nextTree());
                        adaptor.addChild(root_1, stream_a.nextTree());
                        adaptor.addChild(root_1, stream_b.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:172:8: In expression
                    {
                    In160=(Token)match(input,In,FOLLOW_In_in_condExpr1290);  
                    stream_In.add(In160);

                    pushFollow(FOLLOW_expression_in_condExpr1292);
                    expression161=expression();

                    state._fsp--;

                    stream_expression.add(expression161.getTree());


                    // AST REWRITE
                    // elements: expression, orExpr, In
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 172:42: -> ^( In orExpr expression )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:172:45: ^( In orExpr expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_In.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_orExpr.nextTree());
                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "condExpr"

    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "orExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:176:1: orExpr : andExpr ( '||' andExpr )* ;
    public final ScannerALTParser.orExpr_return orExpr() throws RecognitionException {
        ScannerALTParser.orExpr_return retval = new ScannerALTParser.orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal163=null;
        ScannerALTParser.andExpr_return andExpr162 = null;

        ScannerALTParser.andExpr_return andExpr164 = null;


        Object string_literal163_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:177:3: ( andExpr ( '||' andExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:177:6: andExpr ( '||' andExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_andExpr_in_orExpr1344);
            andExpr162=andExpr();

            state._fsp--;

            adaptor.addChild(root_0, andExpr162.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:177:14: ( '||' andExpr )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==Or) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:177:15: '||' andExpr
            	    {
            	    string_literal163=(Token)match(input,Or,FOLLOW_Or_in_orExpr1347); 
            	    string_literal163_tree = (Object)adaptor.create(string_literal163);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal163_tree, root_0);

            	    pushFollow(FOLLOW_andExpr_in_orExpr1350);
            	    andExpr164=andExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, andExpr164.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "orExpr"

    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "andExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:180:1: andExpr : equExpr ( '&&' equExpr )* ;
    public final ScannerALTParser.andExpr_return andExpr() throws RecognitionException {
        ScannerALTParser.andExpr_return retval = new ScannerALTParser.andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal166=null;
        ScannerALTParser.equExpr_return equExpr165 = null;

        ScannerALTParser.equExpr_return equExpr167 = null;


        Object string_literal166_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:181:3: ( equExpr ( '&&' equExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:181:6: equExpr ( '&&' equExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_equExpr_in_andExpr1366);
            equExpr165=equExpr();

            state._fsp--;

            adaptor.addChild(root_0, equExpr165.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:181:14: ( '&&' equExpr )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==And) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:181:15: '&&' equExpr
            	    {
            	    string_literal166=(Token)match(input,And,FOLLOW_And_in_andExpr1369); 
            	    string_literal166_tree = (Object)adaptor.create(string_literal166);
            	    root_0 = (Object)adaptor.becomeRoot(string_literal166_tree, root_0);

            	    pushFollow(FOLLOW_equExpr_in_andExpr1372);
            	    equExpr167=equExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, equExpr167.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "andExpr"

    public static class equExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "equExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:184:1: equExpr : relExpr ( ( '==' | '!=' ) relExpr )* ;
    public final ScannerALTParser.equExpr_return equExpr() throws RecognitionException {
        ScannerALTParser.equExpr_return retval = new ScannerALTParser.equExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set169=null;
        ScannerALTParser.relExpr_return relExpr168 = null;

        ScannerALTParser.relExpr_return relExpr170 = null;


        Object set169_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:185:3: ( relExpr ( ( '==' | '!=' ) relExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:185:6: relExpr ( ( '==' | '!=' ) relExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_relExpr_in_equExpr1388);
            relExpr168=relExpr();

            state._fsp--;

            adaptor.addChild(root_0, relExpr168.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:185:14: ( ( '==' | '!=' ) relExpr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=Equals && LA32_0<=NEquals)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:185:15: ( '==' | '!=' ) relExpr
            	    {
            	    set169=(Token)input.LT(1);
            	    set169=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Equals && input.LA(1)<=NEquals) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set169), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_relExpr_in_equExpr1400);
            	    relExpr170=relExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, relExpr170.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "equExpr"

    public static class relExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:188:1: relExpr : addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )* ;
    public final ScannerALTParser.relExpr_return relExpr() throws RecognitionException {
        ScannerALTParser.relExpr_return retval = new ScannerALTParser.relExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set172=null;
        ScannerALTParser.addExpr_return addExpr171 = null;

        ScannerALTParser.addExpr_return addExpr173 = null;


        Object set172_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:189:3: ( addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:189:6: addExpr ( ( '>=' | '<=' | '>' | '<' ) addExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_addExpr_in_relExpr1416);
            addExpr171=addExpr();

            state._fsp--;

            adaptor.addChild(root_0, addExpr171.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:189:14: ( ( '>=' | '<=' | '>' | '<' ) addExpr )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=GTEquals && LA33_0<=LTEquals)||(LA33_0>=GT && LA33_0<=LT)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:189:15: ( '>=' | '<=' | '>' | '<' ) addExpr
            	    {
            	    set172=(Token)input.LT(1);
            	    set172=(Token)input.LT(1);
            	    if ( (input.LA(1)>=GTEquals && input.LA(1)<=LTEquals)||(input.LA(1)>=GT && input.LA(1)<=LT) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set172), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_addExpr_in_relExpr1436);
            	    addExpr173=addExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, addExpr173.getTree());

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relExpr"

    public static class addExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "addExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:192:1: addExpr : mulExpr ( ( '+' | '-' ) mulExpr )* ;
    public final ScannerALTParser.addExpr_return addExpr() throws RecognitionException {
        ScannerALTParser.addExpr_return retval = new ScannerALTParser.addExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set175=null;
        ScannerALTParser.mulExpr_return mulExpr174 = null;

        ScannerALTParser.mulExpr_return mulExpr176 = null;


        Object set175_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:193:3: ( mulExpr ( ( '+' | '-' ) mulExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:193:6: mulExpr ( ( '+' | '-' ) mulExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_mulExpr_in_addExpr1452);
            mulExpr174=mulExpr();

            state._fsp--;

            adaptor.addChild(root_0, mulExpr174.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:193:14: ( ( '+' | '-' ) mulExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=Add && LA34_0<=Subtract)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:193:15: ( '+' | '-' ) mulExpr
            	    {
            	    set175=(Token)input.LT(1);
            	    set175=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Add && input.LA(1)<=Subtract) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set175), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_mulExpr_in_addExpr1464);
            	    mulExpr176=mulExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, mulExpr176.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "addExpr"

    public static class mulExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mulExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:196:1: mulExpr : powExpr ( ( '*' | '/' | '%' ) powExpr )* ;
    public final ScannerALTParser.mulExpr_return mulExpr() throws RecognitionException {
        ScannerALTParser.mulExpr_return retval = new ScannerALTParser.mulExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set178=null;
        ScannerALTParser.powExpr_return powExpr177 = null;

        ScannerALTParser.powExpr_return powExpr179 = null;


        Object set178_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:197:3: ( powExpr ( ( '*' | '/' | '%' ) powExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:197:6: powExpr ( ( '*' | '/' | '%' ) powExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_powExpr_in_mulExpr1480);
            powExpr177=powExpr();

            state._fsp--;

            adaptor.addChild(root_0, powExpr177.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:197:14: ( ( '*' | '/' | '%' ) powExpr )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=Multiply && LA35_0<=Modulus)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:197:15: ( '*' | '/' | '%' ) powExpr
            	    {
            	    set178=(Token)input.LT(1);
            	    set178=(Token)input.LT(1);
            	    if ( (input.LA(1)>=Multiply && input.LA(1)<=Modulus) ) {
            	        input.consume();
            	        root_0 = (Object)adaptor.becomeRoot((Object)adaptor.create(set178), root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }

            	    pushFollow(FOLLOW_powExpr_in_mulExpr1496);
            	    powExpr179=powExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, powExpr179.getTree());

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mulExpr"

    public static class powExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "powExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:200:1: powExpr : unaryExpr ( '^' unaryExpr )* ;
    public final ScannerALTParser.powExpr_return powExpr() throws RecognitionException {
        ScannerALTParser.powExpr_return retval = new ScannerALTParser.powExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal181=null;
        ScannerALTParser.unaryExpr_return unaryExpr180 = null;

        ScannerALTParser.unaryExpr_return unaryExpr182 = null;


        Object char_literal181_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:201:3: ( unaryExpr ( '^' unaryExpr )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:201:6: unaryExpr ( '^' unaryExpr )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_unaryExpr_in_powExpr1512);
            unaryExpr180=unaryExpr();

            state._fsp--;

            adaptor.addChild(root_0, unaryExpr180.getTree());
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:201:16: ( '^' unaryExpr )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==Pow) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:201:17: '^' unaryExpr
            	    {
            	    char_literal181=(Token)match(input,Pow,FOLLOW_Pow_in_powExpr1515); 
            	    char_literal181_tree = (Object)adaptor.create(char_literal181);
            	    root_0 = (Object)adaptor.becomeRoot(char_literal181_tree, root_0);

            	    pushFollow(FOLLOW_unaryExpr_in_powExpr1518);
            	    unaryExpr182=unaryExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unaryExpr182.getTree());

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "powExpr"

    public static class unaryExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "unaryExpr"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:204:1: unaryExpr : ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom );
    public final ScannerALTParser.unaryExpr_return unaryExpr() throws RecognitionException {
        ScannerALTParser.unaryExpr_return retval = new ScannerALTParser.unaryExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal183=null;
        Token char_literal185=null;
        ScannerALTParser.atom_return atom184 = null;

        ScannerALTParser.atom_return atom186 = null;

        ScannerALTParser.atom_return atom187 = null;


        Object char_literal183_tree=null;
        Object char_literal185_tree=null;
        RewriteRuleTokenStream stream_Excl=new RewriteRuleTokenStream(adaptor,"token Excl");
        RewriteRuleTokenStream stream_Subtract=new RewriteRuleTokenStream(adaptor,"token Subtract");
        RewriteRuleSubtreeStream stream_atom=new RewriteRuleSubtreeStream(adaptor,"rule atom");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:205:3: ( '-' atom -> ^( UNARY_MIN atom ) | '!' atom -> ^( NEGATE atom ) | atom )
            int alt37=3;
            switch ( input.LA(1) ) {
            case Subtract:
                {
                alt37=1;
                }
                break;
            case Excl:
                {
                alt37=2;
                }
                break;
            case ID:
            case Println:
            case Print:
            case ScanInt:
            case ScanDouble:
            case ScanString:
            case ScanBoolean:
            case Number:
            case Bool:
            case Null:
            case String:
            case OBracket:
            case OParen:
                {
                alt37=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:205:6: '-' atom
                    {
                    char_literal183=(Token)match(input,Subtract,FOLLOW_Subtract_in_unaryExpr1536);  
                    stream_Subtract.add(char_literal183);

                    pushFollow(FOLLOW_atom_in_unaryExpr1538);
                    atom184=atom();

                    state._fsp--;

                    stream_atom.add(atom184.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:15: -> ^( UNARY_MIN atom )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:205:18: ^( UNARY_MIN atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNARY_MIN, "UNARY_MIN"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:206:6: '!' atom
                    {
                    char_literal185=(Token)match(input,Excl,FOLLOW_Excl_in_unaryExpr1553);  
                    stream_Excl.add(char_literal185);

                    pushFollow(FOLLOW_atom_in_unaryExpr1555);
                    atom186=atom();

                    state._fsp--;

                    stream_atom.add(atom186.getTree());


                    // AST REWRITE
                    // elements: atom
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:15: -> ^( NEGATE atom )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:206:18: ^( NEGATE atom )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NEGATE, "NEGATE"), root_1);

                        adaptor.addChild(root_1, stream_atom.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:207:6: atom
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_atom_in_unaryExpr1570);
                    atom187=atom();

                    state._fsp--;

                    adaptor.addChild(root_0, atom187.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "unaryExpr"

    public static class atom_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:210:1: atom : ( Number | Bool | Null | lookup );
    public final ScannerALTParser.atom_return atom() throws RecognitionException {
        ScannerALTParser.atom_return retval = new ScannerALTParser.atom_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number188=null;
        Token Bool189=null;
        Token Null190=null;
        ScannerALTParser.lookup_return lookup191 = null;


        Object Number188_tree=null;
        Object Bool189_tree=null;
        Object Null190_tree=null;

        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:211:3: ( Number | Bool | Null | lookup )
            int alt38=4;
            switch ( input.LA(1) ) {
            case Number:
                {
                alt38=1;
                }
                break;
            case Bool:
                {
                alt38=2;
                }
                break;
            case Null:
                {
                alt38=3;
                }
                break;
            case ID:
            case Println:
            case Print:
            case ScanInt:
            case ScanDouble:
            case ScanString:
            case ScanBoolean:
            case String:
            case OBracket:
            case OParen:
                {
                alt38=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:211:6: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number188=(Token)match(input,Number,FOLLOW_Number_in_atom1584); 
                    Number188_tree = (Object)adaptor.create(Number188);
                    adaptor.addChild(root_0, Number188_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:212:6: Bool
                    {
                    root_0 = (Object)adaptor.nil();

                    Bool189=(Token)match(input,Bool,FOLLOW_Bool_in_atom1591); 
                    Bool189_tree = (Object)adaptor.create(Bool189);
                    adaptor.addChild(root_0, Bool189_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:213:6: Null
                    {
                    root_0 = (Object)adaptor.nil();

                    Null190=(Token)match(input,Null,FOLLOW_Null_in_atom1598); 
                    Null190_tree = (Object)adaptor.create(Null190);
                    adaptor.addChild(root_0, Null190_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:214:6: lookup
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lookup_in_atom1605);
                    lookup191=lookup();

                    state._fsp--;

                    adaptor.addChild(root_0, lookup191.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:217:1: list : '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) ;
    public final ScannerALTParser.list_return list() throws RecognitionException {
        ScannerALTParser.list_return retval = new ScannerALTParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal192=null;
        Token char_literal194=null;
        ScannerALTParser.exprList_return exprList193 = null;


        Object char_literal192_tree=null;
        Object char_literal194_tree=null;
        RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
        RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
        RewriteRuleSubtreeStream stream_exprList=new RewriteRuleSubtreeStream(adaptor,"rule exprList");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:3: ( '[' ( exprList )? ']' -> ^( LIST ( exprList )? ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:6: '[' ( exprList )? ']'
            {
            char_literal192=(Token)match(input,OBracket,FOLLOW_OBracket_in_list1619);  
            stream_OBracket.add(char_literal192);

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:10: ( exprList )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=ID && LA39_0<=ScanBoolean)||(LA39_0>=Number && LA39_0<=String)||LA39_0==Excl||LA39_0==Subtract||LA39_0==OBracket||LA39_0==OParen) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:10: exprList
                    {
                    pushFollow(FOLLOW_exprList_in_list1621);
                    exprList193=exprList();

                    state._fsp--;

                    stream_exprList.add(exprList193.getTree());

                    }
                    break;

            }

            char_literal194=(Token)match(input,CBracket,FOLLOW_CBracket_in_list1624);  
            stream_CBracket.add(char_literal194);



            // AST REWRITE
            // elements: exprList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:24: -> ^( LIST ( exprList )? )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:27: ^( LIST ( exprList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:218:34: ( exprList )?
                if ( stream_exprList.hasNext() ) {
                    adaptor.addChild(root_1, stream_exprList.nextTree());

                }
                stream_exprList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class lookup_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lookup"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:221:1: lookup : ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | ID ( indexes )? -> ^( LOOKUP ID ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) );
    public final ScannerALTParser.lookup_return lookup() throws RecognitionException {
        ScannerALTParser.lookup_return retval = new ScannerALTParser.lookup_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID199=null;
        Token String201=null;
        Token char_literal203=null;
        Token char_literal205=null;
        ScannerALTParser.functionCall_return functionCall195 = null;

        ScannerALTParser.indexes_return indexes196 = null;

        ScannerALTParser.list_return list197 = null;

        ScannerALTParser.indexes_return indexes198 = null;

        ScannerALTParser.indexes_return indexes200 = null;

        ScannerALTParser.indexes_return indexes202 = null;

        ScannerALTParser.expression_return expression204 = null;

        ScannerALTParser.indexes_return indexes206 = null;


        Object ID199_tree=null;
        Object String201_tree=null;
        Object char_literal203_tree=null;
        Object char_literal205_tree=null;
        RewriteRuleTokenStream stream_OParen=new RewriteRuleTokenStream(adaptor,"token OParen");
        RewriteRuleTokenStream stream_CParen=new RewriteRuleTokenStream(adaptor,"token CParen");
        RewriteRuleTokenStream stream_String=new RewriteRuleTokenStream(adaptor,"token String");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_functionCall=new RewriteRuleSubtreeStream(adaptor,"rule functionCall");
        RewriteRuleSubtreeStream stream_indexes=new RewriteRuleSubtreeStream(adaptor,"rule indexes");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:3: ( functionCall ( indexes )? -> ^( LOOKUP functionCall ( indexes )? ) | list ( indexes )? -> ^( LOOKUP list ( indexes )? ) | ID ( indexes )? -> ^( LOOKUP ID ( indexes )? ) | String ( indexes )? -> ^( LOOKUP String ( indexes )? ) | '(' expression ')' ( indexes )? -> ^( LOOKUP expression ( indexes )? ) )
            int alt45=5;
            switch ( input.LA(1) ) {
            case ID:
                {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==OParen) ) {
                    alt45=1;
                }
                else if ( (LA45_1==In||(LA45_1>=Or && LA45_1<=Pow)||(LA45_1>=GT && LA45_1<=Modulus)||(LA45_1>=OBracket && LA45_1<=CBracket)||(LA45_1>=CParen && LA45_1<=SColon)||(LA45_1>=Comma && LA45_1<=Colon)) ) {
                    alt45=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
                }
                break;
            case Println:
            case Print:
            case ScanInt:
            case ScanDouble:
            case ScanString:
            case ScanBoolean:
                {
                alt45=1;
                }
                break;
            case OBracket:
                {
                alt45=2;
                }
                break;
            case String:
                {
                alt45=4;
                }
                break;
            case OParen:
                {
                alt45=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:6: functionCall ( indexes )?
                    {
                    pushFollow(FOLLOW_functionCall_in_lookup1647);
                    functionCall195=functionCall();

                    state._fsp--;

                    stream_functionCall.add(functionCall195.getTree());
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:19: ( indexes )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==OBracket) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:19: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1649);
                            indexes196=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes196.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: functionCall, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 222:34: -> ^( LOOKUP functionCall ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:37: ^( LOOKUP functionCall ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_functionCall.nextTree());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:222:59: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:223:6: list ( indexes )?
                    {
                    pushFollow(FOLLOW_list_in_lookup1674);
                    list197=list();

                    state._fsp--;

                    stream_list.add(list197.getTree());
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:223:11: ( indexes )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==OBracket) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:223:11: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1676);
                            indexes198=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes198.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: indexes, list
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:34: -> ^( LOOKUP list ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:223:37: ^( LOOKUP list ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_list.nextTree());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:223:51: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:224:6: ID ( indexes )?
                    {
                    ID199=(Token)match(input,ID,FOLLOW_ID_in_lookup1709);  
                    stream_ID.add(ID199);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:224:9: ( indexes )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==OBracket) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:224:9: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1711);
                            indexes200=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes200.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: ID, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 224:28: -> ^( LOOKUP ID ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:224:31: ^( LOOKUP ID ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:224:43: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:225:6: String ( indexes )?
                    {
                    String201=(Token)match(input,String,FOLLOW_String_in_lookup1740);  
                    stream_String.add(String201);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:225:13: ( indexes )?
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==OBracket) ) {
                        alt43=1;
                    }
                    switch (alt43) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:225:13: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1742);
                            indexes202=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes202.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: String, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:34: -> ^( LOOKUP String ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:225:37: ^( LOOKUP String ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_String.nextNode());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:225:53: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:226:6: '(' expression ')' ( indexes )?
                    {
                    char_literal203=(Token)match(input,OParen,FOLLOW_OParen_in_lookup1773);  
                    stream_OParen.add(char_literal203);

                    pushFollow(FOLLOW_expression_in_lookup1775);
                    expression204=expression();

                    state._fsp--;

                    stream_expression.add(expression204.getTree());
                    char_literal205=(Token)match(input,CParen,FOLLOW_CParen_in_lookup1777);  
                    stream_CParen.add(char_literal205);

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:226:25: ( indexes )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==OBracket) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:226:25: indexes
                            {
                            pushFollow(FOLLOW_indexes_in_lookup1779);
                            indexes206=indexes();

                            state._fsp--;

                            stream_indexes.add(indexes206.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: expression, indexes
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 226:34: -> ^( LOOKUP expression ( indexes )? )
                    {
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:226:37: ^( LOOKUP expression ( indexes )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LOOKUP, "LOOKUP"), root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());
                        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:226:57: ( indexes )?
                        if ( stream_indexes.hasNext() ) {
                            adaptor.addChild(root_1, stream_indexes.nextTree());

                        }
                        stream_indexes.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lookup"

    public static class indexes_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "indexes"
    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:229:1: indexes : ( '[' expression ']' ) -> ^( INDEXES expression ) ;
    public final ScannerALTParser.indexes_return indexes() throws RecognitionException {
        ScannerALTParser.indexes_return retval = new ScannerALTParser.indexes_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal207=null;
        Token char_literal209=null;
        ScannerALTParser.expression_return expression208 = null;


        Object char_literal207_tree=null;
        Object char_literal209_tree=null;
        RewriteRuleTokenStream stream_CBracket=new RewriteRuleTokenStream(adaptor,"token CBracket");
        RewriteRuleTokenStream stream_OBracket=new RewriteRuleTokenStream(adaptor,"token OBracket");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:230:3: ( ( '[' expression ']' ) -> ^( INDEXES expression ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:230:6: ( '[' expression ']' )
            {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:230:6: ( '[' expression ']' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:230:7: '[' expression ']'
            {
            char_literal207=(Token)match(input,OBracket,FOLLOW_OBracket_in_indexes1806);  
            stream_OBracket.add(char_literal207);

            pushFollow(FOLLOW_expression_in_indexes1808);
            expression208=expression();

            state._fsp--;

            stream_expression.add(expression208.getTree());
            char_literal209=(Token)match(input,CBracket,FOLLOW_CBracket_in_indexes1810);  
            stream_CBracket.add(char_literal209);


            }



            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:27: -> ^( INDEXES expression )
            {
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:230:30: ^( INDEXES expression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(INDEXES, "INDEXES"), root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "indexes"

    // Delegated rules


 

    public static final BitSet FOLLOW_constDecl_in_parse178 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_parse179 = new BitSet(new long[]{0x0000002000000000L,0x0000000000410000L});
    public static final BitSet FOLLOW_functionDecl_in_parse183 = new BitSet(new long[]{0x0000002000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_parse186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_parse188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBrace_in_block210 = new BitSet(new long[]{0x0000038FF8000000L,0x0000000000020004L});
    public static final BitSet FOLLOW_statement_in_block212 = new BitSet(new long[]{0x0000038FF8000000L,0x0000000000020004L});
    public static final BitSet FOLLOW_Return_in_block217 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_block219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_block221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_CBrace_in_block225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_statement264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_statement266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_statement274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_statement276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_varDecl_in_statement305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_statement306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_statement314 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_statement315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_varDecl330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_varDecl332 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_varDecl334 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_indexes_in_varDecl336 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_varDecl340 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_varDecl342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_varDecl370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_varDecl372 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_varDecl374 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_indexes_in_varDecl376 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_varDecl380 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_varDecl382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_varDecl408 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_varDecl410 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_varDecl412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_indexes_in_varDecl414 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_varDecl418 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_varDecl420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_varDecl447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_varDecl449 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_varDecl451 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000108L});
    public static final BitSet FOLLOW_indexes_in_varDecl453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_varDecl457 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_varDecl459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_constDecl493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_constDecl495 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_constDecl497 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_constDecl499 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_constDecl501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_constDecl522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_constDecl524 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_constDecl526 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_constDecl528 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_constDecl530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_constDecl550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_constDecl552 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_constDecl554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_constDecl556 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_constDecl558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_constDecl578 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_constDecl580 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_constDecl582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_constDecl584 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_constDecl586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_assignment613 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000108L});
    public static final BitSet FOLLOW_indexes_in_assignment615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Assign_in_assignment618 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_assignment620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_functionCall648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall650 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000068L});
    public static final BitSet FOLLOW_exprList_in_functionCall652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Println_in_functionCall674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall676 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000068L});
    public static final BitSet FOLLOW_expression_in_functionCall678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Print_in_functionCall700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall702 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_functionCall704 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScanInt_in_functionCall727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall729 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_functionCall730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_indexes_in_functionCall732 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScanDouble_in_functionCall758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall760 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_functionCall761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_indexes_in_functionCall763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScanString_in_functionCall789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall791 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_functionCall792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_indexes_in_functionCall794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ScanBoolean_in_functionCall820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionCall822 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_functionCall823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
    public static final BitSet FOLLOW_indexes_in_functionCall825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionCall827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStat_in_ifStatement858 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_elseIfStat_in_ifStatement860 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_elseStat_in_ifStatement863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_If_in_ifStat892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_ifStat894 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_ifStat895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_ifStat896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_ifStat898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseIfStat923 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_If_in_elseIfStat925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_elseIfStat927 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_elseIfStat928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_elseIfStat929 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_elseIfStat931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Else_in_elseStat955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_elseStat957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Func_in_functionDecl979 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_functionDecl981 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_functionDecl983 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0040L});
    public static final BitSet FOLLOW_idList_in_functionDecl985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_functionDecl988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_functionDecl990 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_End_in_functionDecl992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_For_in_forStatement1015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_forStatement1017 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_assignment_in_forStatement1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_forStatement1021 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_forStatement1023 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_SColon_in_forStatement1025 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_assignment_in_forStatement1027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_forStatement1029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_forStatement1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_While_in_whileStatement1064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_whileStatement1066 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_whileStatement1067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_whileStatement1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_whileStatement1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Do_in_doWhileStatement1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_doWhileStatement1100 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_While_in_doWhileStatement1102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_OParen_in_doWhileStatement1103 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_doWhileStatement1104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_doWhileStatement1106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_idList1131 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_idList1133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_Comma_in_idList1136 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C0000L});
    public static final BitSet FOLLOW_type_in_idList1138 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ID_in_idList1140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_exprList1197 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_Comma_in_exprList1200 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_exprList1202 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_condExpr_in_expression1227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orExpr_in_condExpr1242 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_QMark_in_condExpr1257 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_condExpr1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_Colon_in_condExpr1263 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_condExpr1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_In_in_condExpr1290 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_condExpr1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1344 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_Or_in_orExpr1347 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1350 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_equExpr_in_andExpr1366 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_And_in_andExpr1369 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_equExpr_in_andExpr1372 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_relExpr_in_equExpr1388 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_set_in_equExpr1391 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_relExpr_in_equExpr1400 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_addExpr_in_relExpr1416 = new BitSet(new long[]{0x0CC0000000000002L});
    public static final BitSet FOLLOW_set_in_relExpr1419 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_addExpr_in_relExpr1436 = new BitSet(new long[]{0x0CC0000000000002L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr1452 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_set_in_addExpr1455 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_mulExpr_in_addExpr1464 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr1480 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_set_in_mulExpr1483 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_powExpr_in_mulExpr1496 = new BitSet(new long[]{0xC000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr1512 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Pow_in_powExpr1515 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_unaryExpr_in_powExpr1518 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Subtract_in_unaryExpr1536 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Excl_in_unaryExpr1553 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atom_in_unaryExpr1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Number_in_atom1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Bool_in_atom1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Null_in_atom1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lookup_in_atom1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBracket_in_list1619 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_exprList_in_list1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_CBracket_in_list1624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_functionCall_in_lookup1647 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_indexes_in_lookup1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_lookup1674 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_indexes_in_lookup1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_lookup1709 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_indexes_in_lookup1711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_String_in_lookup1740 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_indexes_in_lookup1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OParen_in_lookup1773 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_lookup1775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_CParen_in_lookup1777 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_indexes_in_lookup1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBracket_in_indexes1806 = new BitSet(new long[]{0x22007807F0000000L,0x0000000000000028L});
    public static final BitSet FOLLOW_expression_in_indexes1808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_CBracket_in_indexes1810 = new BitSet(new long[]{0x0000000000000002L});

}