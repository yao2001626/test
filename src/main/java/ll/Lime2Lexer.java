// $ANTLR 3.4 ll\\Lime2.g 2016-04-20 21:35:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Lime2Lexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int Action=4;
    public static final int Assert=5;
    public static final int Attribute=6;
    public static final int Begin=7;
    public static final int Bool=8;
    public static final int Booltype=9;
    public static final int COMMENT=10;
    public static final int Class=11;
    public static final int Do=12;
    public static final int Else=13;
    public static final int End=14;
    public static final int ID=15;
    public static final int INT=16;
    public static final int If=17;
    public static final int Inherit=18;
    public static final int Initialization=19;
    public static final int Inttype=20;
    public static final int LETTER=21;
    public static final int LINE_COMMENT=22;
    public static final int Method=23;
    public static final int New=24;
    public static final int Null=25;
    public static final int Return=26;
    public static final int STRING=27;
    public static final int Then=28;
    public static final int Var=29;
    public static final int WS=30;
    public static final int When=31;
    public static final int While=32;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Lime2Lexer() {} 
    public Lime2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Lime2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ll\\Lime2.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:2:7: ( '!=' )
            // ll\\Lime2.g:2:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:3:7: ( '(' )
            // ll\\Lime2.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:4:7: ( ')' )
            // ll\\Lime2.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:5:7: ( '+' )
            // ll\\Lime2.g:5:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:6:7: ( ',' )
            // ll\\Lime2.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:7:7: ( '-' )
            // ll\\Lime2.g:7:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:8:7: ( ':' )
            // ll\\Lime2.g:8:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:9:7: ( ';' )
            // ll\\Lime2.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:10:7: ( '<' )
            // ll\\Lime2.g:10:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:11:7: ( '<=' )
            // ll\\Lime2.g:11:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:12:7: ( '=' )
            // ll\\Lime2.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:13:7: ( '==' )
            // ll\\Lime2.g:13:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:14:7: ( '>' )
            // ll\\Lime2.g:14:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:15:7: ( '>=' )
            // ll\\Lime2.g:15:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:16:7: ( 'int' )
            // ll\\Lime2.g:16:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:17:7: ( 'void' )
            // ll\\Lime2.g:17:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "Assert"
    public final void mAssert() throws RecognitionException {
        try {
            int _type = Assert;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:90:12: ( 'assert' )
            // ll\\Lime2.g:90:14: 'assert'
            {
            match("assert"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Assert"

    // $ANTLR start "Class"
    public final void mClass() throws RecognitionException {
        try {
            int _type = Class;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:91:12: ( 'class' )
            // ll\\Lime2.g:91:14: 'class'
            {
            match("class"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Class"

    // $ANTLR start "Action"
    public final void mAction() throws RecognitionException {
        try {
            int _type = Action;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:92:12: ( 'action' )
            // ll\\Lime2.g:92:14: 'action'
            {
            match("action"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Action"

    // $ANTLR start "Inherit"
    public final void mInherit() throws RecognitionException {
        try {
            int _type = Inherit;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:93:12: ( 'inherit' )
            // ll\\Lime2.g:93:14: 'inherit'
            {
            match("inherit"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Inherit"

    // $ANTLR start "End"
    public final void mEnd() throws RecognitionException {
        try {
            int _type = End;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:94:12: ( 'end' )
            // ll\\Lime2.g:94:14: 'end'
            {
            match("end"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "End"

    // $ANTLR start "Attribute"
    public final void mAttribute() throws RecognitionException {
        try {
            int _type = Attribute;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:95:12: ( 'attr ' )
            // ll\\Lime2.g:95:14: 'attr '
            {
            match("attr "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Attribute"

    // $ANTLR start "Initialization"
    public final void mInitialization() throws RecognitionException {
        try {
            int _type = Initialization;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:96:16: ( 'initialization' )
            // ll\\Lime2.g:96:18: 'initialization'
            {
            match("initialization"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Initialization"

    // $ANTLR start "Method"
    public final void mMethod() throws RecognitionException {
        try {
            int _type = Method;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:97:12: ( 'method' )
            // ll\\Lime2.g:97:14: 'method'
            {
            match("method"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Method"

    // $ANTLR start "New"
    public final void mNew() throws RecognitionException {
        try {
            int _type = New;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:98:12: ( 'new' )
            // ll\\Lime2.g:98:14: 'new'
            {
            match("new"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "New"

    // $ANTLR start "When"
    public final void mWhen() throws RecognitionException {
        try {
            int _type = When;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:99:12: ( 'when' )
            // ll\\Lime2.g:99:14: 'when'
            {
            match("when"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "When"

    // $ANTLR start "Do"
    public final void mDo() throws RecognitionException {
        try {
            int _type = Do;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:100:17: ( 'do' )
            // ll\\Lime2.g:100:19: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Do"

    // $ANTLR start "Begin"
    public final void mBegin() throws RecognitionException {
        try {
            int _type = Begin;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:101:12: ( 'begin' )
            // ll\\Lime2.g:101:14: 'begin'
            {
            match("begin"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Begin"

    // $ANTLR start "If"
    public final void mIf() throws RecognitionException {
        try {
            int _type = If;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:102:12: ( 'if' )
            // ll\\Lime2.g:102:14: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "If"

    // $ANTLR start "Else"
    public final void mElse() throws RecognitionException {
        try {
            int _type = Else;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:103:12: ( 'else' )
            // ll\\Lime2.g:103:14: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Else"

    // $ANTLR start "Then"
    public final void mThen() throws RecognitionException {
        try {
            int _type = Then;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:104:12: ( 'then' )
            // ll\\Lime2.g:104:14: 'then'
            {
            match("then"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Then"

    // $ANTLR start "While"
    public final void mWhile() throws RecognitionException {
        try {
            int _type = While;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:105:12: ( 'while' )
            // ll\\Lime2.g:105:14: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "While"

    // $ANTLR start "Return"
    public final void mReturn() throws RecognitionException {
        try {
            int _type = Return;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:106:12: ( 'return' )
            // ll\\Lime2.g:106:14: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Return"

    // $ANTLR start "Var"
    public final void mVar() throws RecognitionException {
        try {
            int _type = Var;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:107:12: ( 'var ' )
            // ll\\Lime2.g:107:14: 'var '
            {
            match("var "); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Var"

    // $ANTLR start "Null"
    public final void mNull() throws RecognitionException {
        try {
            int _type = Null;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:108:11: ( 'nil' )
            // ll\\Lime2.g:108:13: 'nil'
            {
            match("nil"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Null"

    // $ANTLR start "Booltype"
    public final void mBooltype() throws RecognitionException {
        try {
            int _type = Booltype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:109:11: ( 'bool' )
            // ll\\Lime2.g:109:13: 'bool'
            {
            match("bool"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Booltype"

    // $ANTLR start "Inttype"
    public final void mInttype() throws RecognitionException {
        try {
            int _type = Inttype;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:110:11: ( 'integer' )
            // ll\\Lime2.g:110:13: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Inttype"

    // $ANTLR start "Bool"
    public final void mBool() throws RecognitionException {
        try {
            int _type = Bool;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:113:2: ( 'true' | 'false' )
            int alt1=2;
            switch ( input.LA(1) ) {
            case 't':
                {
                alt1=1;
                }
                break;
            case 'f':
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // ll\\Lime2.g:113:4: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // ll\\Lime2.g:114:4: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Bool"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:118:2: ( LETTER ( LETTER | '0' .. '9' )* )
            // ll\\Lime2.g:118:3: LETTER ( LETTER | '0' .. '9' )*
            {
            mLETTER(); 


            // ll\\Lime2.g:118:10: ( LETTER | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // ll\\Lime2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // ll\\Lime2.g:124:2: ( 'A' .. 'Z' | 'a' .. 'z' | '_' )
            // ll\\Lime2.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:128:5: ( ( '0' .. '9' )+ )
            // ll\\Lime2.g:128:7: ( '0' .. '9' )+
            {
            // ll\\Lime2.g:128:7: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // ll\\Lime2.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:130:7: ( '\"' ( . )* '\"' )
            // ll\\Lime2.g:130:9: '\"' ( . )* '\"'
            {
            match('\"'); 

            // ll\\Lime2.g:130:13: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\"') ) {
                    alt4=2;
                }
                else if ( ((LA4_0 >= '\u0000' && LA4_0 <= '!')||(LA4_0 >= '#' && LA4_0 <= '\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ll\\Lime2.g:130:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match('\"'); 

            setText(getText().substring(1, getText().length()-1));

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:132:5: ( ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' ) )
            // ll\\Lime2.g:132:8: ( ' ' | '\\r' | '\\t' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:136:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ll\\Lime2.g:136:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // ll\\Lime2.g:136:14: ( options {greedy=false; } : . )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='*') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='/') ) {
                        alt5=2;
                    }
                    else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
                        alt5=1;
                    }


                }
                else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ll\\Lime2.g:136:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match("*/"); 



            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime2.g:140:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // ll\\Lime2.g:140:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // ll\\Lime2.g:140:12: (~ ( '\\n' | '\\r' ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ll\\Lime2.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            // ll\\Lime2.g:140:26: ( '\\r' )?
            int alt7=2;
            switch ( input.LA(1) ) {
                case '\r':
                    {
                    alt7=1;
                    }
                    break;
            }

            switch (alt7) {
                case 1 :
                    // ll\\Lime2.g:140:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // ll\\Lime2.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | Assert | Class | Action | Inherit | End | Attribute | Initialization | Method | New | When | Do | Begin | If | Else | Then | While | Return | Var | Null | Booltype | Inttype | Bool | ID | INT | STRING | WS | COMMENT | LINE_COMMENT )
        int alt8=44;
        alt8 = dfa8.predict(input);
        switch (alt8) {
            case 1 :
                // ll\\Lime2.g:1:10: T__33
                {
                mT__33(); 


                }
                break;
            case 2 :
                // ll\\Lime2.g:1:16: T__34
                {
                mT__34(); 


                }
                break;
            case 3 :
                // ll\\Lime2.g:1:22: T__35
                {
                mT__35(); 


                }
                break;
            case 4 :
                // ll\\Lime2.g:1:28: T__36
                {
                mT__36(); 


                }
                break;
            case 5 :
                // ll\\Lime2.g:1:34: T__37
                {
                mT__37(); 


                }
                break;
            case 6 :
                // ll\\Lime2.g:1:40: T__38
                {
                mT__38(); 


                }
                break;
            case 7 :
                // ll\\Lime2.g:1:46: T__39
                {
                mT__39(); 


                }
                break;
            case 8 :
                // ll\\Lime2.g:1:52: T__40
                {
                mT__40(); 


                }
                break;
            case 9 :
                // ll\\Lime2.g:1:58: T__41
                {
                mT__41(); 


                }
                break;
            case 10 :
                // ll\\Lime2.g:1:64: T__42
                {
                mT__42(); 


                }
                break;
            case 11 :
                // ll\\Lime2.g:1:70: T__43
                {
                mT__43(); 


                }
                break;
            case 12 :
                // ll\\Lime2.g:1:76: T__44
                {
                mT__44(); 


                }
                break;
            case 13 :
                // ll\\Lime2.g:1:82: T__45
                {
                mT__45(); 


                }
                break;
            case 14 :
                // ll\\Lime2.g:1:88: T__46
                {
                mT__46(); 


                }
                break;
            case 15 :
                // ll\\Lime2.g:1:94: T__47
                {
                mT__47(); 


                }
                break;
            case 16 :
                // ll\\Lime2.g:1:100: T__48
                {
                mT__48(); 


                }
                break;
            case 17 :
                // ll\\Lime2.g:1:106: Assert
                {
                mAssert(); 


                }
                break;
            case 18 :
                // ll\\Lime2.g:1:113: Class
                {
                mClass(); 


                }
                break;
            case 19 :
                // ll\\Lime2.g:1:119: Action
                {
                mAction(); 


                }
                break;
            case 20 :
                // ll\\Lime2.g:1:126: Inherit
                {
                mInherit(); 


                }
                break;
            case 21 :
                // ll\\Lime2.g:1:134: End
                {
                mEnd(); 


                }
                break;
            case 22 :
                // ll\\Lime2.g:1:138: Attribute
                {
                mAttribute(); 


                }
                break;
            case 23 :
                // ll\\Lime2.g:1:148: Initialization
                {
                mInitialization(); 


                }
                break;
            case 24 :
                // ll\\Lime2.g:1:163: Method
                {
                mMethod(); 


                }
                break;
            case 25 :
                // ll\\Lime2.g:1:170: New
                {
                mNew(); 


                }
                break;
            case 26 :
                // ll\\Lime2.g:1:174: When
                {
                mWhen(); 


                }
                break;
            case 27 :
                // ll\\Lime2.g:1:179: Do
                {
                mDo(); 


                }
                break;
            case 28 :
                // ll\\Lime2.g:1:182: Begin
                {
                mBegin(); 


                }
                break;
            case 29 :
                // ll\\Lime2.g:1:188: If
                {
                mIf(); 


                }
                break;
            case 30 :
                // ll\\Lime2.g:1:191: Else
                {
                mElse(); 


                }
                break;
            case 31 :
                // ll\\Lime2.g:1:196: Then
                {
                mThen(); 


                }
                break;
            case 32 :
                // ll\\Lime2.g:1:201: While
                {
                mWhile(); 


                }
                break;
            case 33 :
                // ll\\Lime2.g:1:207: Return
                {
                mReturn(); 


                }
                break;
            case 34 :
                // ll\\Lime2.g:1:214: Var
                {
                mVar(); 


                }
                break;
            case 35 :
                // ll\\Lime2.g:1:218: Null
                {
                mNull(); 


                }
                break;
            case 36 :
                // ll\\Lime2.g:1:223: Booltype
                {
                mBooltype(); 


                }
                break;
            case 37 :
                // ll\\Lime2.g:1:232: Inttype
                {
                mInttype(); 


                }
                break;
            case 38 :
                // ll\\Lime2.g:1:240: Bool
                {
                mBool(); 


                }
                break;
            case 39 :
                // ll\\Lime2.g:1:245: ID
                {
                mID(); 


                }
                break;
            case 40 :
                // ll\\Lime2.g:1:248: INT
                {
                mINT(); 


                }
                break;
            case 41 :
                // ll\\Lime2.g:1:252: STRING
                {
                mSTRING(); 


                }
                break;
            case 42 :
                // ll\\Lime2.g:1:259: WS
                {
                mWS(); 


                }
                break;
            case 43 :
                // ll\\Lime2.g:1:262: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 44 :
                // ll\\Lime2.g:1:270: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\11\uffff\1\37\1\41\1\43\15\31\13\uffff\1\31\1\76\14\31\1\114\6"+
        "\31\2\uffff\1\124\2\31\1\uffff\6\31\1\135\2\31\1\140\1\141\2\31"+
        "\1\uffff\7\31\1\uffff\2\31\1\155\1\uffff\4\31\1\uffff\1\162\1\31"+
        "\2\uffff\1\164\2\31\1\167\1\170\1\171\5\31\1\uffff\2\31\1\uffff"+
        "\1\u0081\1\uffff\1\31\1\uffff\1\u0083\1\u0084\3\uffff\1\31\1\171"+
        "\3\31\1\u0089\1\u008a\1\uffff\1\u008b\2\uffff\1\u008c\1\u008d\1"+
        "\u008e\1\31\6\uffff\6\31\1\u0096\1\uffff";
    static final String DFA8_eofS =
        "\u0097\uffff";
    static final String DFA8_minS =
        "\1\11\10\uffff\3\75\1\146\1\141\1\143\2\154\2\145\1\150\1\157\1"+
        "\145\1\150\1\145\1\141\4\uffff\1\52\6\uffff\1\150\1\60\1\151\1\162"+
        "\1\163\2\164\1\141\1\144\1\163\1\164\1\167\1\154\1\145\1\60\1\147"+
        "\1\157\1\145\1\165\1\164\1\154\2\uffff\1\60\1\145\1\164\1\uffff"+
        "\1\144\1\40\1\145\1\151\1\162\1\163\1\60\1\145\1\150\2\60\1\156"+
        "\1\154\1\uffff\1\151\1\154\1\156\1\145\1\165\1\163\1\147\1\uffff"+
        "\1\162\1\151\1\60\1\uffff\1\162\1\157\1\40\1\163\1\uffff\1\60\1"+
        "\157\2\uffff\1\60\1\145\1\156\3\60\1\162\2\145\1\151\1\141\1\uffff"+
        "\1\164\1\156\1\uffff\1\60\1\uffff\1\144\1\uffff\2\60\3\uffff\1\156"+
        "\1\60\1\162\1\164\1\154\2\60\1\uffff\1\60\2\uffff\3\60\1\151\6\uffff"+
        "\1\172\1\141\1\164\1\151\1\157\1\156\1\60\1\uffff";
    static final String DFA8_maxS =
        "\1\172\10\uffff\3\75\1\156\1\157\1\164\1\154\1\156\1\145\1\151\1"+
        "\150\2\157\1\162\1\145\1\141\4\uffff\1\57\6\uffff\1\164\1\172\1"+
        "\151\1\162\1\163\2\164\1\141\1\144\1\163\1\164\1\167\1\154\1\151"+
        "\1\172\1\147\1\157\1\145\1\165\1\164\1\154\2\uffff\1\172\1\145\1"+
        "\164\1\uffff\1\144\1\40\1\145\1\151\1\162\1\163\1\172\1\145\1\150"+
        "\2\172\1\156\1\154\1\uffff\1\151\1\154\1\156\1\145\1\165\1\163\1"+
        "\147\1\uffff\1\162\1\151\1\172\1\uffff\1\162\1\157\1\40\1\163\1"+
        "\uffff\1\172\1\157\2\uffff\1\172\1\145\1\156\3\172\1\162\2\145\1"+
        "\151\1\141\1\uffff\1\164\1\156\1\uffff\1\172\1\uffff\1\144\1\uffff"+
        "\2\172\3\uffff\1\156\1\172\1\162\1\164\1\154\2\172\1\uffff\1\172"+
        "\2\uffff\3\172\1\151\6\uffff\1\172\1\141\1\164\1\151\1\157\1\156"+
        "\1\172\1\uffff";
    static final String DFA8_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\20\uffff\1\47\1\50\1\51"+
        "\1\52\1\uffff\1\12\1\11\1\14\1\13\1\16\1\15\25\uffff\1\53\1\54\3"+
        "\uffff\1\35\15\uffff\1\33\7\uffff\1\17\3\uffff\1\42\4\uffff\1\25"+
        "\2\uffff\1\31\1\43\13\uffff\1\20\2\uffff\1\26\1\uffff\1\36\1\uffff"+
        "\1\32\2\uffff\1\44\1\37\1\46\7\uffff\1\22\1\uffff\1\40\1\34\4\uffff"+
        "\1\21\1\23\1\30\1\41\1\45\1\24\7\uffff\1\27";
    static final String DFA8_specialS =
        "\u0097\uffff}>";
    static final String[] DFA8_transitionS = {
            "\2\34\1\uffff\2\34\22\uffff\1\34\1\1\1\33\5\uffff\1\2\1\3\1"+
            "\uffff\1\4\1\5\1\6\1\uffff\1\35\12\32\1\7\1\10\1\11\1\12\1\13"+
            "\2\uffff\32\31\4\uffff\1\31\1\uffff\1\16\1\25\1\17\1\24\1\20"+
            "\1\30\2\31\1\14\3\31\1\21\1\22\3\31\1\27\1\31\1\26\1\31\1\15"+
            "\1\23\3\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36",
            "\1\40",
            "\1\42",
            "\1\45\7\uffff\1\44",
            "\1\47\15\uffff\1\46",
            "\1\51\17\uffff\1\50\1\52",
            "\1\53",
            "\1\55\1\uffff\1\54",
            "\1\56",
            "\1\57\3\uffff\1\60",
            "\1\61",
            "\1\62",
            "\1\63\11\uffff\1\64",
            "\1\65\11\uffff\1\66",
            "\1\67",
            "\1\70",
            "",
            "",
            "",
            "",
            "\1\71\4\uffff\1\72",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\74\1\75\12\uffff\1\73",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112\3\uffff\1\113",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\4\31\1\123\25\31",
            "\1\125",
            "\1\126",
            "",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\136",
            "\1\137",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\1\153",
            "\1\154",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\163",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\165",
            "\1\166",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\1\u0082",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "",
            "\1\u0085",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "",
            "",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            "\1\u008f",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\31\7\uffff\32\31\4\uffff\1\31\1\uffff\32\31",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | Assert | Class | Action | Inherit | End | Attribute | Initialization | Method | New | When | Do | Begin | If | Else | Then | While | Return | Var | Null | Booltype | Inttype | Bool | ID | INT | STRING | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}