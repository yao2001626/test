// $ANTLR 3.4 ll\\Lime.g 2016-04-20 12:33:15

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LimeLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int ID=4;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LimeLexer() {} 
    public LimeLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LimeLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "ll\\Lime.g"; }

    // $ANTLR start "T__5"
    public final void mT__5() throws RecognitionException {
        try {
            int _type = T__5;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime.g:2:6: ( 'hello' )
            // ll\\Lime.g:2:8: 'hello'
            {
            match("hello"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__5"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ll\\Lime.g:3:4: ( 'aa' )
            // ll\\Lime.g:3:6: 'aa'
            {
            match("aa"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    public void mTokens() throws RecognitionException {
        // ll\\Lime.g:1:8: ( T__5 | ID )
        int alt1=2;
        switch ( input.LA(1) ) {
        case 'h':
            {
            alt1=1;
            }
            break;
        case 'a':
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
                // ll\\Lime.g:1:10: T__5
                {
                mT__5(); 


                }
                break;
            case 2 :
                // ll\\Lime.g:1:15: ID
                {
                mID(); 


                }
                break;

        }

    }


 

}