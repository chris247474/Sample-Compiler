// $ANTLR 3.3 Nov 30, 2010 12:45:30 C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g 2011-08-19 04:58:21

  package scan;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ScannerALTLexer extends Lexer {
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

    public ScannerALTLexer() {;} 
    public ScannerALTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ScannerALTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g"; }

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:7:7: ( 'main()' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:7:9: 'main()'
            {
            match("main()"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:8:7: ( 'var' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:8:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:9:7: ( 'int' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:9:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:10:7: ( 'double' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:10:9: 'double'
            {
            match("double"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:11:7: ( 'String' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:11:9: 'String'
            {
            match("String"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:12:7: ( 'boolean' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:12:9: 'boolean'
            {
            match("boolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:13:7: ( 'const' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:13:9: 'const'
            {
            match("const"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "Println"
    public final void mPrintln() throws RecognitionException {
        try {
            int _type = Println;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:233:10: ( 'println' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:233:12: 'println'
            {
            match("println"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Println"

    // $ANTLR start "Print"
    public final void mPrint() throws RecognitionException {
        try {
            int _type = Print;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:234:10: ( 'print' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:234:12: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Print"

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:235:10: ( 'assert' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:235:12: 'assert'
            {
            match("assert"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Size"
    public final void mSize() throws RecognitionException {
        try {
            int _type = Size;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:236:10: ( 'size' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:236:12: 'size'
            {
            match("size"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Size"

    // $ANTLR start "ScanInt"
    public final void mScanInt() throws RecognitionException {
        try {
            int _type = ScanInt;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:237:14: ( 'scanInt' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:237:16: 'scanInt'
            {
            match("scanInt"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScanInt"

    // $ANTLR start "ScanString"
    public final void mScanString() throws RecognitionException {
        try {
            int _type = ScanString;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:238:17: ( 'scanString' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:238:19: 'scanString'
            {
            match("scanString"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScanString"

    // $ANTLR start "ScanBoolean"
    public final void mScanBoolean() throws RecognitionException {
        try {
            int _type = ScanBoolean;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:239:17: ( 'scanBoolean' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:239:19: 'scanBoolean'
            {
            match("scanBoolean"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScanBoolean"

    // $ANTLR start "ScanDouble"
    public final void mScanDouble() throws RecognitionException {
        try {
            int _type = ScanDouble;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:240:17: ( 'scanDouble' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:240:19: 'scanDouble'
            {
            match("scanDouble"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ScanDouble"

    // $ANTLR start "Func"
    public final void mFunc() throws RecognitionException {
        try {
            int _type = Func;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:241:10: ( 'func' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:241:12: 'func'
            {
            match("func"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Func"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:242:10: ( 'if' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:242:12: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:243:10: ( 'else' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:243:12: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:244:10: ( 'return' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:244:12: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "For"
    public final void mFor() throws RecognitionException {
        try {
            int _type = For;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:245:10: ( 'for' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:245:12: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "For"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:246:10: ( 'while' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:246:12: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "To"
    public final void mTo() throws RecognitionException {
        try {
            int _type = To;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:247:10: ( 'to' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:247:12: 'to'
            {
            match("to"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "To"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:248:10: ( 'do' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:248:12: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:249:10: ( 'end' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:249:12: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "In"
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:250:10: ( 'in' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:250:12: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "In"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:251:10: ( 'null' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:251:12: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Or"
    public final void mOr() throws RecognitionException {
        try {
            int _type = Or;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:253:10: ( '||' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:253:12: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Or"

    // $ANTLR start "And"
    public final void mAnd() throws RecognitionException {
        try {
            int _type = And;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:254:10: ( '&&' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:254:12: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "And"

    // $ANTLR start "Equals"
    public final void mEquals() throws RecognitionException {
        try {
            int _type = Equals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:255:10: ( '==' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:255:12: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Equals"

    // $ANTLR start "NEquals"
    public final void mNEquals() throws RecognitionException {
        try {
            int _type = NEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:256:10: ( '!=' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:256:12: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NEquals"

    // $ANTLR start "GTEquals"
    public final void mGTEquals() throws RecognitionException {
        try {
            int _type = GTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:257:10: ( '>=' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:257:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GTEquals"

    // $ANTLR start "LTEquals"
    public final void mLTEquals() throws RecognitionException {
        try {
            int _type = LTEquals;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:258:10: ( '<=' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:258:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LTEquals"

    // $ANTLR start "Pow"
    public final void mPow() throws RecognitionException {
        try {
            int _type = Pow;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:259:10: ( '^' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:259:12: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Pow"

    // $ANTLR start "Excl"
    public final void mExcl() throws RecognitionException {
        try {
            int _type = Excl;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:260:10: ( '!' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:260:12: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Excl"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:261:10: ( '>' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:261:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:262:10: ( '<' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:262:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "Add"
    public final void mAdd() throws RecognitionException {
        try {
            int _type = Add;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:263:10: ( '+' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:263:12: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Add"

    // $ANTLR start "Subtract"
    public final void mSubtract() throws RecognitionException {
        try {
            int _type = Subtract;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:264:10: ( '-' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:264:12: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Subtract"

    // $ANTLR start "Multiply"
    public final void mMultiply() throws RecognitionException {
        try {
            int _type = Multiply;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:265:10: ( '*' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:265:12: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Multiply"

    // $ANTLR start "Divide"
    public final void mDivide() throws RecognitionException {
        try {
            int _type = Divide;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:266:10: ( '/' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:266:12: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Divide"

    // $ANTLR start "Modulus"
    public final void mModulus() throws RecognitionException {
        try {
            int _type = Modulus;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:267:10: ( '%' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:267:12: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Modulus"

    // $ANTLR start "OBrace"
    public final void mOBrace() throws RecognitionException {
        try {
            int _type = OBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:268:10: ( '{' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:268:12: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBrace"

    // $ANTLR start "CBrace"
    public final void mCBrace() throws RecognitionException {
        try {
            int _type = CBrace;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:269:10: ( '}' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:269:12: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CBrace"

    // $ANTLR start "OBracket"
    public final void mOBracket() throws RecognitionException {
        try {
            int _type = OBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:270:10: ( '[' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:270:12: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OBracket"

    // $ANTLR start "CBracket"
    public final void mCBracket() throws RecognitionException {
        try {
            int _type = CBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:271:10: ( ']' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:271:12: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CBracket"

    // $ANTLR start "OParen"
    public final void mOParen() throws RecognitionException {
        try {
            int _type = OParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:272:10: ( '(' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:272:12: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OParen"

    // $ANTLR start "CParen"
    public final void mCParen() throws RecognitionException {
        try {
            int _type = CParen;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:273:10: ( ')' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:273:12: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CParen"

    // $ANTLR start "SColon"
    public final void mSColon() throws RecognitionException {
        try {
            int _type = SColon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:274:10: ( ';' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:274:12: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SColon"

    // $ANTLR start "Assign"
    public final void mAssign() throws RecognitionException {
        try {
            int _type = Assign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:275:10: ( '=' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:275:12: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Assign"

    // $ANTLR start "Comma"
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:276:10: ( ',' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:276:12: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comma"

    // $ANTLR start "QMark"
    public final void mQMark() throws RecognitionException {
        try {
            int _type = QMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:277:10: ( '?' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:277:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QMark"

    // $ANTLR start "Colon"
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:278:10: ( ':' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:278:12: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Colon"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:281:3: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:281:6: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:282:6: 'false'
                    {
                    match("false"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:3: ( Int ( '.' ( Digit )* )? )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:6: Int ( '.' ( Digit )* )?
            {
            mInt(); 
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:10: ( '.' ( Digit )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:11: '.' ( Digit )*
                    {
                    match('.'); 
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:15: ( Digit )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:286:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:290:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )* )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:290:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:290:34: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | Digit )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "String"
    public final void mString() throws RecognitionException {
        try {
            int _type = String;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:297:3: ( '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"' | '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\'' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\"') ) {
                alt7=1;
            }
            else if ( (LA7_0=='\'') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:297:6: '\"' (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )* '\"'
                    {
                    match('\"'); 
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:297:11: (~ ( '\"' | '\\\\' ) | '\\\\' ( '\\\\' | '\"' ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='\u0000' && LA5_0<='!')||(LA5_0>='#' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=1;
                        }
                        else if ( (LA5_0=='\\') ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:297:12: ~ ( '\"' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:297:29: '\\\\' ( '\\\\' | '\"' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\\' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:298:6: '\\'' (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )* '\\''
                    {
                    match('\''); 
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:298:11: (~ ( '\\'' | '\\\\' ) | '\\\\' ( '\\\\' | '\\'' ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=1;
                        }
                        else if ( (LA6_0=='\\') ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:298:12: ~ ( '\\'' | '\\\\' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:298:29: '\\\\' ( '\\\\' | '\\'' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\''||input.LA(1)=='\\' ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;

              setText(getText().substring(1, getText().length()-1).replaceAll("\\\\(.)", "$1"));
        }
        finally {
        }
    }
    // $ANTLR end "String"

    // $ANTLR start "Comment"
    public final void mComment() throws RecognitionException {
        try {
            int _type = Comment;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:302:3: ( '//' (~ ( '\\r' | '\\n' ) )* | '/*' ( . )* '*/' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='/') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='/') ) {
                    alt10=1;
                }
                else if ( (LA10_1=='*') ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:302:6: '//' (~ ( '\\r' | '\\n' ) )*
                    {
                    match("//"); 

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:302:11: (~ ( '\\r' | '\\n' ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:302:11: ~ ( '\\r' | '\\n' )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    skip();

                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:303:6: '/*' ( . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:303:11: ( . )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0=='*') ) {
                            int LA9_1 = input.LA(2);

                            if ( (LA9_1=='/') ) {
                                alt9=2;
                            }
                            else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                                alt9=1;
                            }


                        }
                        else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:303:11: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    match("*/"); 

                    skip();

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Comment"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:307:3: ( ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' ) )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:307:6: ( ' ' | '\\t' | '\\r' | '\\n' | '\\u000C' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "Int"
    public final void mInt() throws RecognitionException {
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:311:3: ( '1' .. '9' ( Digit )* | '0' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='1' && LA12_0<='9')) ) {
                alt12=1;
            }
            else if ( (LA12_0=='0') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:311:6: '1' .. '9' ( Digit )*
                    {
                    matchRange('1','9'); 
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:311:15: ( Digit )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:311:15: Digit
                    	    {
                    	    mDigit(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:312:6: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "Int"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:316:3: ( '0' .. '9' )
            // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:316:6: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "Digit"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:8: ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | Println | Print | Assert | Size | ScanInt | ScanString | ScanBoolean | ScanDouble | Func | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | ID | String | Comment | WS )
        int alt13=58;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:10: T__80
                {
                mT__80(); 

                }
                break;
            case 2 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:16: T__81
                {
                mT__81(); 

                }
                break;
            case 3 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:22: T__82
                {
                mT__82(); 

                }
                break;
            case 4 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:28: T__83
                {
                mT__83(); 

                }
                break;
            case 5 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:34: T__84
                {
                mT__84(); 

                }
                break;
            case 6 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:40: T__85
                {
                mT__85(); 

                }
                break;
            case 7 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:46: T__86
                {
                mT__86(); 

                }
                break;
            case 8 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:52: Println
                {
                mPrintln(); 

                }
                break;
            case 9 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:60: Print
                {
                mPrint(); 

                }
                break;
            case 10 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:66: Assert
                {
                mAssert(); 

                }
                break;
            case 11 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:73: Size
                {
                mSize(); 

                }
                break;
            case 12 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:78: ScanInt
                {
                mScanInt(); 

                }
                break;
            case 13 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:86: ScanString
                {
                mScanString(); 

                }
                break;
            case 14 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:97: ScanBoolean
                {
                mScanBoolean(); 

                }
                break;
            case 15 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:109: ScanDouble
                {
                mScanDouble(); 

                }
                break;
            case 16 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:120: Func
                {
                mFunc(); 

                }
                break;
            case 17 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:125: If
                {
                mIf(); 

                }
                break;
            case 18 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:128: Else
                {
                mElse(); 

                }
                break;
            case 19 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:133: Return
                {
                mReturn(); 

                }
                break;
            case 20 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:140: For
                {
                mFor(); 

                }
                break;
            case 21 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:144: While
                {
                mWhile(); 

                }
                break;
            case 22 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:150: To
                {
                mTo(); 

                }
                break;
            case 23 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:153: Do
                {
                mDo(); 

                }
                break;
            case 24 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:156: End
                {
                mEnd(); 

                }
                break;
            case 25 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:160: In
                {
                mIn(); 

                }
                break;
            case 26 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:163: Null
                {
                mNull(); 

                }
                break;
            case 27 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:168: Or
                {
                mOr(); 

                }
                break;
            case 28 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:171: And
                {
                mAnd(); 

                }
                break;
            case 29 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:175: Equals
                {
                mEquals(); 

                }
                break;
            case 30 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:182: NEquals
                {
                mNEquals(); 

                }
                break;
            case 31 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:190: GTEquals
                {
                mGTEquals(); 

                }
                break;
            case 32 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:199: LTEquals
                {
                mLTEquals(); 

                }
                break;
            case 33 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:208: Pow
                {
                mPow(); 

                }
                break;
            case 34 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:212: Excl
                {
                mExcl(); 

                }
                break;
            case 35 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:217: GT
                {
                mGT(); 

                }
                break;
            case 36 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:220: LT
                {
                mLT(); 

                }
                break;
            case 37 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:223: Add
                {
                mAdd(); 

                }
                break;
            case 38 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:227: Subtract
                {
                mSubtract(); 

                }
                break;
            case 39 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:236: Multiply
                {
                mMultiply(); 

                }
                break;
            case 40 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:245: Divide
                {
                mDivide(); 

                }
                break;
            case 41 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:252: Modulus
                {
                mModulus(); 

                }
                break;
            case 42 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:260: OBrace
                {
                mOBrace(); 

                }
                break;
            case 43 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:267: CBrace
                {
                mCBrace(); 

                }
                break;
            case 44 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:274: OBracket
                {
                mOBracket(); 

                }
                break;
            case 45 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:283: CBracket
                {
                mCBracket(); 

                }
                break;
            case 46 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:292: OParen
                {
                mOParen(); 

                }
                break;
            case 47 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:299: CParen
                {
                mCParen(); 

                }
                break;
            case 48 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:306: SColon
                {
                mSColon(); 

                }
                break;
            case 49 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:313: Assign
                {
                mAssign(); 

                }
                break;
            case 50 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:320: Comma
                {
                mComma(); 

                }
                break;
            case 51 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:326: QMark
                {
                mQMark(); 

                }
                break;
            case 52 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:332: Colon
                {
                mColon(); 

                }
                break;
            case 53 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:338: Bool
                {
                mBool(); 

                }
                break;
            case 54 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:343: Number
                {
                mNumber(); 

                }
                break;
            case 55 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:350: ID
                {
                mID(); 

                }
                break;
            case 56 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:353: String
                {
                mString(); 

                }
                break;
            case 57 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:360: Comment
                {
                mComment(); 

                }
                break;
            case 58 :
                // C:\\Users\\Sonia Tan\\Desktop\\alt\\ScannerALT.g:1:368: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\20\50\2\uffff\1\102\1\104\1\106\1\110\4\uffff\1\112\17"+
        "\uffff\2\50\1\116\1\117\1\121\16\50\1\140\2\50\12\uffff\1\50\1\144"+
        "\1\145\2\uffff\1\50\1\uffff\10\50\1\157\2\50\1\162\2\50\1\uffff"+
        "\3\50\2\uffff\6\50\1\176\1\50\1\u0083\1\uffff\1\50\1\u0085\1\uffff"+
        "\2\50\1\u0088\1\u0089\1\uffff\3\50\1\u008d\1\u008f\1\50\1\uffff"+
        "\4\50\1\uffff\1\u0088\1\uffff\1\50\1\u0096\2\uffff\1\u0097\1\u0098"+
        "\1\50\1\uffff\1\50\1\uffff\1\u009b\4\50\1\u00a0\3\uffff\1\u00a1"+
        "\1\u00a2\1\uffff\1\u00a3\3\50\4\uffff\6\50\1\u00ad\1\50\1\u00af"+
        "\1\uffff\1\u00b0\2\uffff";
    static final String DFA13_eofS =
        "\u00b1\uffff";
    static final String DFA13_minS =
        "\1\11\2\141\1\146\1\157\1\164\2\157\1\162\1\163\1\143\1\141\1\154"+
        "\1\145\1\150\1\157\1\165\2\uffff\4\75\4\uffff\1\52\17\uffff\1\151"+
        "\1\162\3\60\1\162\1\157\1\156\1\151\1\163\1\172\1\141\1\156\1\162"+
        "\1\154\1\163\1\144\1\164\1\151\1\60\1\165\1\154\12\uffff\1\156\2"+
        "\60\2\uffff\1\142\1\uffff\1\151\1\154\1\163\1\156\2\145\1\156\1"+
        "\143\1\60\1\163\1\145\1\60\1\165\1\154\1\uffff\1\145\1\154\1\50"+
        "\2\uffff\1\154\1\156\1\145\2\164\1\162\1\60\1\102\1\60\1\uffff\1"+
        "\145\1\60\1\uffff\1\162\1\145\2\60\1\uffff\1\145\1\147\1\141\2\60"+
        "\1\164\1\uffff\1\156\1\164\2\157\1\uffff\1\60\1\uffff\1\156\1\60"+
        "\2\uffff\2\60\1\156\1\uffff\1\156\1\uffff\1\60\1\164\1\162\1\157"+
        "\1\165\1\60\3\uffff\2\60\1\uffff\1\60\1\151\1\154\1\142\4\uffff"+
        "\1\156\1\145\1\154\1\147\1\141\1\145\1\60\1\156\1\60\1\uffff\1\60"+
        "\2\uffff";
    static final String DFA13_maxS =
        "\1\175\2\141\1\156\1\157\1\164\2\157\1\162\1\163\1\151\1\165\1"+
        "\156\1\145\1\150\1\162\1\165\2\uffff\4\75\4\uffff\1\57\17\uffff"+
        "\1\151\1\162\3\172\1\162\1\157\1\156\1\151\1\163\1\172\1\141\1\156"+
        "\1\162\1\154\1\163\1\144\1\164\1\151\1\172\1\165\1\154\12\uffff"+
        "\1\156\2\172\2\uffff\1\142\1\uffff\1\151\1\154\1\163\1\156\2\145"+
        "\1\156\1\143\1\172\1\163\1\145\1\172\1\165\1\154\1\uffff\1\145\1"+
        "\154\1\50\2\uffff\1\154\1\156\1\145\2\164\1\162\1\172\1\123\1\172"+
        "\1\uffff\1\145\1\172\1\uffff\1\162\1\145\2\172\1\uffff\1\145\1\147"+
        "\1\141\2\172\1\164\1\uffff\1\156\1\164\2\157\1\uffff\1\172\1\uffff"+
        "\1\156\1\172\2\uffff\2\172\1\156\1\uffff\1\156\1\uffff\1\172\1\164"+
        "\1\162\1\157\1\165\1\172\3\uffff\2\172\1\uffff\1\172\1\151\1\154"+
        "\1\142\4\uffff\1\156\1\145\1\154\1\147\1\141\1\145\1\172\1\156\1"+
        "\172\1\uffff\1\172\2\uffff";
    static final String DFA13_acceptS =
        "\21\uffff\1\33\1\34\4\uffff\1\41\1\45\1\46\1\47\1\uffff\1\51\1"+
        "\52\1\53\1\54\1\55\1\56\1\57\1\60\1\62\1\63\1\64\1\66\1\67\1\70"+
        "\1\72\26\uffff\1\35\1\61\1\36\1\42\1\37\1\43\1\40\1\44\1\71\1\50"+
        "\3\uffff\1\31\1\21\1\uffff\1\27\16\uffff\1\26\3\uffff\1\2\1\3\11"+
        "\uffff\1\24\2\uffff\1\30\4\uffff\1\1\6\uffff\1\13\4\uffff\1\20\1"+
        "\uffff\1\22\2\uffff\1\65\1\32\3\uffff\1\7\1\uffff\1\11\6\uffff\1"+
        "\25\1\4\1\5\2\uffff\1\12\4\uffff\1\23\1\6\1\10\1\14\11\uffff\1\15"+
        "\1\uffff\1\17\1\16";
    static final String DFA13_specialS =
        "\u00b1\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\52\1\uffff\2\52\22\uffff\1\52\1\24\1\51\2\uffff\1\34\1\22"+
            "\1\51\1\41\1\42\1\32\1\30\1\44\1\31\1\uffff\1\33\12\47\1\46"+
            "\1\43\1\26\1\23\1\25\1\45\1\uffff\22\50\1\5\7\50\1\37\1\uffff"+
            "\1\40\1\27\1\50\1\uffff\1\11\1\6\1\7\1\4\1\14\1\13\2\50\1\3"+
            "\3\50\1\1\1\20\1\50\1\10\1\50\1\15\1\12\1\17\1\50\1\2\1\16\3"+
            "\50\1\35\1\21\1\36",
            "\1\53",
            "\1\54",
            "\1\56\7\uffff\1\55",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\66\5\uffff\1\65",
            "\1\71\15\uffff\1\70\5\uffff\1\67",
            "\1\72\1\uffff\1\73",
            "\1\74",
            "\1\75",
            "\1\76\2\uffff\1\77",
            "\1\100",
            "",
            "",
            "\1\101",
            "\1\103",
            "\1\105",
            "\1\107",
            "",
            "",
            "",
            "",
            "\1\111\4\uffff\1\111",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\23\50\1\115\6\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\24\50\1\120\5\50",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\141",
            "\1\142",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\143",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\1\146",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\160",
            "\1\161",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\163",
            "\1\164",
            "",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0081\1\uffff\1\u0082\4\uffff\1\177\11\uffff\1\u0080",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0084",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0086",
            "\1\u0087",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\13\50\1\u008e\16"+
            "\50",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\1\u0095",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "",
            "",
            "",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "\1\u00ae",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            "\12\50\7\uffff\32\50\4\uffff\1\50\1\uffff\32\50",
            "",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | Println | Print | Assert | Size | ScanInt | ScanString | ScanBoolean | ScanDouble | Func | If | Else | Return | For | While | To | Do | End | In | Null | Or | And | Equals | NEquals | GTEquals | LTEquals | Pow | Excl | GT | LT | Add | Subtract | Multiply | Divide | Modulus | OBrace | CBrace | OBracket | CBracket | OParen | CParen | SColon | Assign | Comma | QMark | Colon | Bool | Number | ID | String | Comment | WS );";
        }
    }
 

}