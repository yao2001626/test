// $ANTLR 3.4 ll\\Lime.g 2016-04-20 12:33:14

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LimeParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ID", "'hello'"
    };

    public static final int EOF=-1;
    public static final int T__5=5;
    public static final int ID=4;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LimeParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LimeParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return LimeParser.tokenNames; }
    public String getGrammarFileName() { return "ll\\Lime.g"; }



    // $ANTLR start "r"
    // ll\\Lime.g:2:1: r : 'hello' ID ;
    public final void r() throws RecognitionException {
        try {
            // ll\\Lime.g:2:4: ( 'hello' ID )
            // ll\\Lime.g:2:6: 'hello' ID
            {
            match(input,5,FOLLOW_5_in_r10); 

            match(input,ID,FOLLOW_ID_in_r12); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "r"

    // Delegated rules


 

    public static final BitSet FOLLOW_5_in_r10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ID_in_r12 = new BitSet(new long[]{0x0000000000000002L});

}