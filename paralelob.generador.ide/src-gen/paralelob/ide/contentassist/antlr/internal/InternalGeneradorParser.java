package paralelob.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import paralelob.services.GeneradorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGeneradorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'entero'", "'decimal'", "'logico'", "'cadena'", "'fecha'", "'caracter'", "'tiempo'", "'fechahora'", "'Proyecto'", "'{'", "'}'", "'Entidad'", "','"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGeneradorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGeneradorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGeneradorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalGenerador.g"; }


    	private GeneradorGrammarAccess grammarAccess;

    	public void setGrammarAccess(GeneradorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRaiz"
    // InternalGenerador.g:53:1: entryRuleRaiz : ruleRaiz EOF ;
    public final void entryRuleRaiz() throws RecognitionException {
        try {
            // InternalGenerador.g:54:1: ( ruleRaiz EOF )
            // InternalGenerador.g:55:1: ruleRaiz EOF
            {
             before(grammarAccess.getRaizRule()); 
            pushFollow(FOLLOW_1);
            ruleRaiz();

            state._fsp--;

             after(grammarAccess.getRaizRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRaiz"


    // $ANTLR start "ruleRaiz"
    // InternalGenerador.g:62:1: ruleRaiz : ( ( rule__Raiz__Group__0 ) ) ;
    public final void ruleRaiz() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:66:2: ( ( ( rule__Raiz__Group__0 ) ) )
            // InternalGenerador.g:67:2: ( ( rule__Raiz__Group__0 ) )
            {
            // InternalGenerador.g:67:2: ( ( rule__Raiz__Group__0 ) )
            // InternalGenerador.g:68:3: ( rule__Raiz__Group__0 )
            {
             before(grammarAccess.getRaizAccess().getGroup()); 
            // InternalGenerador.g:69:3: ( rule__Raiz__Group__0 )
            // InternalGenerador.g:69:4: rule__Raiz__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRaizAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRaiz"


    // $ANTLR start "entryRuleEString"
    // InternalGenerador.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalGenerador.g:79:1: ( ruleEString EOF )
            // InternalGenerador.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalGenerador.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalGenerador.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalGenerador.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalGenerador.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalGenerador.g:94:3: ( rule__EString__Alternatives )
            // InternalGenerador.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntidad"
    // InternalGenerador.g:103:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalGenerador.g:104:1: ( ruleEntidad EOF )
            // InternalGenerador.g:105:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalGenerador.g:112:1: ruleEntidad : ( ( rule__Entidad__Group__0 ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:116:2: ( ( ( rule__Entidad__Group__0 ) ) )
            // InternalGenerador.g:117:2: ( ( rule__Entidad__Group__0 ) )
            {
            // InternalGenerador.g:117:2: ( ( rule__Entidad__Group__0 ) )
            // InternalGenerador.g:118:3: ( rule__Entidad__Group__0 )
            {
             before(grammarAccess.getEntidadAccess().getGroup()); 
            // InternalGenerador.g:119:3: ( rule__Entidad__Group__0 )
            // InternalGenerador.g:119:4: rule__Entidad__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleCampo"
    // InternalGenerador.g:128:1: entryRuleCampo : ruleCampo EOF ;
    public final void entryRuleCampo() throws RecognitionException {
        try {
            // InternalGenerador.g:129:1: ( ruleCampo EOF )
            // InternalGenerador.g:130:1: ruleCampo EOF
            {
             before(grammarAccess.getCampoRule()); 
            pushFollow(FOLLOW_1);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getCampoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCampo"


    // $ANTLR start "ruleCampo"
    // InternalGenerador.g:137:1: ruleCampo : ( ( rule__Campo__Group__0 ) ) ;
    public final void ruleCampo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:141:2: ( ( ( rule__Campo__Group__0 ) ) )
            // InternalGenerador.g:142:2: ( ( rule__Campo__Group__0 ) )
            {
            // InternalGenerador.g:142:2: ( ( rule__Campo__Group__0 ) )
            // InternalGenerador.g:143:3: ( rule__Campo__Group__0 )
            {
             before(grammarAccess.getCampoAccess().getGroup()); 
            // InternalGenerador.g:144:3: ( rule__Campo__Group__0 )
            // InternalGenerador.g:144:4: rule__Campo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCampo"


    // $ANTLR start "entryRuleEBoolean"
    // InternalGenerador.g:153:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalGenerador.g:154:1: ( ruleEBoolean EOF )
            // InternalGenerador.g:155:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalGenerador.g:162:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:166:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalGenerador.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalGenerador.g:167:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalGenerador.g:168:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalGenerador.g:169:3: ( rule__EBoolean__Alternatives )
            // InternalGenerador.g:169:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "ruleTipoDato"
    // InternalGenerador.g:178:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:182:1: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalGenerador.g:183:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalGenerador.g:183:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalGenerador.g:184:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalGenerador.g:185:3: ( rule__TipoDato__Alternatives )
            // InternalGenerador.g:185:4: rule__TipoDato__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoDato__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoDatoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoDato"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalGenerador.g:193:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:197:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalGenerador.g:198:2: ( RULE_STRING )
                    {
                    // InternalGenerador.g:198:2: ( RULE_STRING )
                    // InternalGenerador.g:199:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:204:2: ( RULE_ID )
                    {
                    // InternalGenerador.g:204:2: ( RULE_ID )
                    // InternalGenerador.g:205:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalGenerador.g:214:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:218:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalGenerador.g:219:2: ( 'true' )
                    {
                    // InternalGenerador.g:219:2: ( 'true' )
                    // InternalGenerador.g:220:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:225:2: ( 'false' )
                    {
                    // InternalGenerador.g:225:2: ( 'false' )
                    // InternalGenerador.g:226:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalGenerador.g:235:1: rule__TipoDato__Alternatives : ( ( ( 'entero' ) ) | ( ( 'decimal' ) ) | ( ( 'logico' ) ) | ( ( 'cadena' ) ) | ( ( 'fecha' ) ) | ( ( 'caracter' ) ) | ( ( 'tiempo' ) ) | ( ( 'fechahora' ) ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:239:1: ( ( ( 'entero' ) ) | ( ( 'decimal' ) ) | ( ( 'logico' ) ) | ( ( 'cadena' ) ) | ( ( 'fecha' ) ) | ( ( 'caracter' ) ) | ( ( 'tiempo' ) ) | ( ( 'fechahora' ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalGenerador.g:240:2: ( ( 'entero' ) )
                    {
                    // InternalGenerador.g:240:2: ( ( 'entero' ) )
                    // InternalGenerador.g:241:3: ( 'entero' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getEnteroEnumLiteralDeclaration_0()); 
                    // InternalGenerador.g:242:3: ( 'entero' )
                    // InternalGenerador.g:242:4: 'entero'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getEnteroEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalGenerador.g:246:2: ( ( 'decimal' ) )
                    {
                    // InternalGenerador.g:246:2: ( ( 'decimal' ) )
                    // InternalGenerador.g:247:3: ( 'decimal' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getDecimalEnumLiteralDeclaration_1()); 
                    // InternalGenerador.g:248:3: ( 'decimal' )
                    // InternalGenerador.g:248:4: 'decimal'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getDecimalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalGenerador.g:252:2: ( ( 'logico' ) )
                    {
                    // InternalGenerador.g:252:2: ( ( 'logico' ) )
                    // InternalGenerador.g:253:3: ( 'logico' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getLogicoEnumLiteralDeclaration_2()); 
                    // InternalGenerador.g:254:3: ( 'logico' )
                    // InternalGenerador.g:254:4: 'logico'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getLogicoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalGenerador.g:258:2: ( ( 'cadena' ) )
                    {
                    // InternalGenerador.g:258:2: ( ( 'cadena' ) )
                    // InternalGenerador.g:259:3: ( 'cadena' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_3()); 
                    // InternalGenerador.g:260:3: ( 'cadena' )
                    // InternalGenerador.g:260:4: 'cadena'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getCadenaEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalGenerador.g:264:2: ( ( 'fecha' ) )
                    {
                    // InternalGenerador.g:264:2: ( ( 'fecha' ) )
                    // InternalGenerador.g:265:3: ( 'fecha' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_4()); 
                    // InternalGenerador.g:266:3: ( 'fecha' )
                    // InternalGenerador.g:266:4: 'fecha'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalGenerador.g:270:2: ( ( 'caracter' ) )
                    {
                    // InternalGenerador.g:270:2: ( ( 'caracter' ) )
                    // InternalGenerador.g:271:3: ( 'caracter' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getCaracterEnumLiteralDeclaration_5()); 
                    // InternalGenerador.g:272:3: ( 'caracter' )
                    // InternalGenerador.g:272:4: 'caracter'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getCaracterEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalGenerador.g:276:2: ( ( 'tiempo' ) )
                    {
                    // InternalGenerador.g:276:2: ( ( 'tiempo' ) )
                    // InternalGenerador.g:277:3: ( 'tiempo' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getHoraEnumLiteralDeclaration_6()); 
                    // InternalGenerador.g:278:3: ( 'tiempo' )
                    // InternalGenerador.g:278:4: 'tiempo'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getHoraEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalGenerador.g:282:2: ( ( 'fechahora' ) )
                    {
                    // InternalGenerador.g:282:2: ( ( 'fechahora' ) )
                    // InternalGenerador.g:283:3: ( 'fechahora' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getFechahoraEnumLiteralDeclaration_7()); 
                    // InternalGenerador.g:284:3: ( 'fechahora' )
                    // InternalGenerador.g:284:4: 'fechahora'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getFechahoraEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoDato__Alternatives"


    // $ANTLR start "rule__Raiz__Group__0"
    // InternalGenerador.g:292:1: rule__Raiz__Group__0 : rule__Raiz__Group__0__Impl rule__Raiz__Group__1 ;
    public final void rule__Raiz__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:296:1: ( rule__Raiz__Group__0__Impl rule__Raiz__Group__1 )
            // InternalGenerador.g:297:2: rule__Raiz__Group__0__Impl rule__Raiz__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Raiz__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__0"


    // $ANTLR start "rule__Raiz__Group__0__Impl"
    // InternalGenerador.g:304:1: rule__Raiz__Group__0__Impl : ( 'Proyecto' ) ;
    public final void rule__Raiz__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:308:1: ( ( 'Proyecto' ) )
            // InternalGenerador.g:309:1: ( 'Proyecto' )
            {
            // InternalGenerador.g:309:1: ( 'Proyecto' )
            // InternalGenerador.g:310:2: 'Proyecto'
            {
             before(grammarAccess.getRaizAccess().getProyectoKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getProyectoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__0__Impl"


    // $ANTLR start "rule__Raiz__Group__1"
    // InternalGenerador.g:319:1: rule__Raiz__Group__1 : rule__Raiz__Group__1__Impl rule__Raiz__Group__2 ;
    public final void rule__Raiz__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:323:1: ( rule__Raiz__Group__1__Impl rule__Raiz__Group__2 )
            // InternalGenerador.g:324:2: rule__Raiz__Group__1__Impl rule__Raiz__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Raiz__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__1"


    // $ANTLR start "rule__Raiz__Group__1__Impl"
    // InternalGenerador.g:331:1: rule__Raiz__Group__1__Impl : ( ( rule__Raiz__NameAssignment_1 ) ) ;
    public final void rule__Raiz__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:335:1: ( ( ( rule__Raiz__NameAssignment_1 ) ) )
            // InternalGenerador.g:336:1: ( ( rule__Raiz__NameAssignment_1 ) )
            {
            // InternalGenerador.g:336:1: ( ( rule__Raiz__NameAssignment_1 ) )
            // InternalGenerador.g:337:2: ( rule__Raiz__NameAssignment_1 )
            {
             before(grammarAccess.getRaizAccess().getNameAssignment_1()); 
            // InternalGenerador.g:338:2: ( rule__Raiz__NameAssignment_1 )
            // InternalGenerador.g:338:3: rule__Raiz__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRaizAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__1__Impl"


    // $ANTLR start "rule__Raiz__Group__2"
    // InternalGenerador.g:346:1: rule__Raiz__Group__2 : rule__Raiz__Group__2__Impl rule__Raiz__Group__3 ;
    public final void rule__Raiz__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:350:1: ( rule__Raiz__Group__2__Impl rule__Raiz__Group__3 )
            // InternalGenerador.g:351:2: rule__Raiz__Group__2__Impl rule__Raiz__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Raiz__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__2"


    // $ANTLR start "rule__Raiz__Group__2__Impl"
    // InternalGenerador.g:358:1: rule__Raiz__Group__2__Impl : ( '{' ) ;
    public final void rule__Raiz__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:362:1: ( ( '{' ) )
            // InternalGenerador.g:363:1: ( '{' )
            {
            // InternalGenerador.g:363:1: ( '{' )
            // InternalGenerador.g:364:2: '{'
            {
             before(grammarAccess.getRaizAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__2__Impl"


    // $ANTLR start "rule__Raiz__Group__3"
    // InternalGenerador.g:373:1: rule__Raiz__Group__3 : rule__Raiz__Group__3__Impl rule__Raiz__Group__4 ;
    public final void rule__Raiz__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:377:1: ( rule__Raiz__Group__3__Impl rule__Raiz__Group__4 )
            // InternalGenerador.g:378:2: rule__Raiz__Group__3__Impl rule__Raiz__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Raiz__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__3"


    // $ANTLR start "rule__Raiz__Group__3__Impl"
    // InternalGenerador.g:385:1: rule__Raiz__Group__3__Impl : ( ( rule__Raiz__EntidadAssignment_3 ) ) ;
    public final void rule__Raiz__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:389:1: ( ( ( rule__Raiz__EntidadAssignment_3 ) ) )
            // InternalGenerador.g:390:1: ( ( rule__Raiz__EntidadAssignment_3 ) )
            {
            // InternalGenerador.g:390:1: ( ( rule__Raiz__EntidadAssignment_3 ) )
            // InternalGenerador.g:391:2: ( rule__Raiz__EntidadAssignment_3 )
            {
             before(grammarAccess.getRaizAccess().getEntidadAssignment_3()); 
            // InternalGenerador.g:392:2: ( rule__Raiz__EntidadAssignment_3 )
            // InternalGenerador.g:392:3: rule__Raiz__EntidadAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__EntidadAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRaizAccess().getEntidadAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__3__Impl"


    // $ANTLR start "rule__Raiz__Group__4"
    // InternalGenerador.g:400:1: rule__Raiz__Group__4 : rule__Raiz__Group__4__Impl rule__Raiz__Group__5 ;
    public final void rule__Raiz__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:404:1: ( rule__Raiz__Group__4__Impl rule__Raiz__Group__5 )
            // InternalGenerador.g:405:2: rule__Raiz__Group__4__Impl rule__Raiz__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Raiz__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Raiz__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__4"


    // $ANTLR start "rule__Raiz__Group__4__Impl"
    // InternalGenerador.g:412:1: rule__Raiz__Group__4__Impl : ( ( rule__Raiz__EntidadAssignment_4 )* ) ;
    public final void rule__Raiz__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:416:1: ( ( ( rule__Raiz__EntidadAssignment_4 )* ) )
            // InternalGenerador.g:417:1: ( ( rule__Raiz__EntidadAssignment_4 )* )
            {
            // InternalGenerador.g:417:1: ( ( rule__Raiz__EntidadAssignment_4 )* )
            // InternalGenerador.g:418:2: ( rule__Raiz__EntidadAssignment_4 )*
            {
             before(grammarAccess.getRaizAccess().getEntidadAssignment_4()); 
            // InternalGenerador.g:419:2: ( rule__Raiz__EntidadAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==24) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalGenerador.g:419:3: rule__Raiz__EntidadAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Raiz__EntidadAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRaizAccess().getEntidadAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__4__Impl"


    // $ANTLR start "rule__Raiz__Group__5"
    // InternalGenerador.g:427:1: rule__Raiz__Group__5 : rule__Raiz__Group__5__Impl ;
    public final void rule__Raiz__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:431:1: ( rule__Raiz__Group__5__Impl )
            // InternalGenerador.g:432:2: rule__Raiz__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Raiz__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__5"


    // $ANTLR start "rule__Raiz__Group__5__Impl"
    // InternalGenerador.g:438:1: rule__Raiz__Group__5__Impl : ( '}' ) ;
    public final void rule__Raiz__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:442:1: ( ( '}' ) )
            // InternalGenerador.g:443:1: ( '}' )
            {
            // InternalGenerador.g:443:1: ( '}' )
            // InternalGenerador.g:444:2: '}'
            {
             before(grammarAccess.getRaizAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRaizAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group__0"
    // InternalGenerador.g:454:1: rule__Entidad__Group__0 : rule__Entidad__Group__0__Impl rule__Entidad__Group__1 ;
    public final void rule__Entidad__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:458:1: ( rule__Entidad__Group__0__Impl rule__Entidad__Group__1 )
            // InternalGenerador.g:459:2: rule__Entidad__Group__0__Impl rule__Entidad__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0"


    // $ANTLR start "rule__Entidad__Group__0__Impl"
    // InternalGenerador.g:466:1: rule__Entidad__Group__0__Impl : ( 'Entidad' ) ;
    public final void rule__Entidad__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:470:1: ( ( 'Entidad' ) )
            // InternalGenerador.g:471:1: ( 'Entidad' )
            {
            // InternalGenerador.g:471:1: ( 'Entidad' )
            // InternalGenerador.g:472:2: 'Entidad'
            {
             before(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getEntidadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__0__Impl"


    // $ANTLR start "rule__Entidad__Group__1"
    // InternalGenerador.g:481:1: rule__Entidad__Group__1 : rule__Entidad__Group__1__Impl rule__Entidad__Group__2 ;
    public final void rule__Entidad__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:485:1: ( rule__Entidad__Group__1__Impl rule__Entidad__Group__2 )
            // InternalGenerador.g:486:2: rule__Entidad__Group__1__Impl rule__Entidad__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entidad__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1"


    // $ANTLR start "rule__Entidad__Group__1__Impl"
    // InternalGenerador.g:493:1: rule__Entidad__Group__1__Impl : ( ( rule__Entidad__NameAssignment_1 ) ) ;
    public final void rule__Entidad__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:497:1: ( ( ( rule__Entidad__NameAssignment_1 ) ) )
            // InternalGenerador.g:498:1: ( ( rule__Entidad__NameAssignment_1 ) )
            {
            // InternalGenerador.g:498:1: ( ( rule__Entidad__NameAssignment_1 ) )
            // InternalGenerador.g:499:2: ( rule__Entidad__NameAssignment_1 )
            {
             before(grammarAccess.getEntidadAccess().getNameAssignment_1()); 
            // InternalGenerador.g:500:2: ( rule__Entidad__NameAssignment_1 )
            // InternalGenerador.g:500:3: rule__Entidad__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__1__Impl"


    // $ANTLR start "rule__Entidad__Group__2"
    // InternalGenerador.g:508:1: rule__Entidad__Group__2 : rule__Entidad__Group__2__Impl rule__Entidad__Group__3 ;
    public final void rule__Entidad__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:512:1: ( rule__Entidad__Group__2__Impl rule__Entidad__Group__3 )
            // InternalGenerador.g:513:2: rule__Entidad__Group__2__Impl rule__Entidad__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2"


    // $ANTLR start "rule__Entidad__Group__2__Impl"
    // InternalGenerador.g:520:1: rule__Entidad__Group__2__Impl : ( '{' ) ;
    public final void rule__Entidad__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:524:1: ( ( '{' ) )
            // InternalGenerador.g:525:1: ( '{' )
            {
            // InternalGenerador.g:525:1: ( '{' )
            // InternalGenerador.g:526:2: '{'
            {
             before(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__2__Impl"


    // $ANTLR start "rule__Entidad__Group__3"
    // InternalGenerador.g:535:1: rule__Entidad__Group__3 : rule__Entidad__Group__3__Impl rule__Entidad__Group__4 ;
    public final void rule__Entidad__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:539:1: ( rule__Entidad__Group__3__Impl rule__Entidad__Group__4 )
            // InternalGenerador.g:540:2: rule__Entidad__Group__3__Impl rule__Entidad__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3"


    // $ANTLR start "rule__Entidad__Group__3__Impl"
    // InternalGenerador.g:547:1: rule__Entidad__Group__3__Impl : ( ( rule__Entidad__CampoAssignment_3 ) ) ;
    public final void rule__Entidad__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:551:1: ( ( ( rule__Entidad__CampoAssignment_3 ) ) )
            // InternalGenerador.g:552:1: ( ( rule__Entidad__CampoAssignment_3 ) )
            {
            // InternalGenerador.g:552:1: ( ( rule__Entidad__CampoAssignment_3 ) )
            // InternalGenerador.g:553:2: ( rule__Entidad__CampoAssignment_3 )
            {
             before(grammarAccess.getEntidadAccess().getCampoAssignment_3()); 
            // InternalGenerador.g:554:2: ( rule__Entidad__CampoAssignment_3 )
            // InternalGenerador.g:554:3: rule__Entidad__CampoAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__CampoAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getCampoAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__3__Impl"


    // $ANTLR start "rule__Entidad__Group__4"
    // InternalGenerador.g:562:1: rule__Entidad__Group__4 : rule__Entidad__Group__4__Impl rule__Entidad__Group__5 ;
    public final void rule__Entidad__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:566:1: ( rule__Entidad__Group__4__Impl rule__Entidad__Group__5 )
            // InternalGenerador.g:567:2: rule__Entidad__Group__4__Impl rule__Entidad__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Entidad__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4"


    // $ANTLR start "rule__Entidad__Group__4__Impl"
    // InternalGenerador.g:574:1: rule__Entidad__Group__4__Impl : ( ( rule__Entidad__Group_4__0 )* ) ;
    public final void rule__Entidad__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:578:1: ( ( ( rule__Entidad__Group_4__0 )* ) )
            // InternalGenerador.g:579:1: ( ( rule__Entidad__Group_4__0 )* )
            {
            // InternalGenerador.g:579:1: ( ( rule__Entidad__Group_4__0 )* )
            // InternalGenerador.g:580:2: ( rule__Entidad__Group_4__0 )*
            {
             before(grammarAccess.getEntidadAccess().getGroup_4()); 
            // InternalGenerador.g:581:2: ( rule__Entidad__Group_4__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalGenerador.g:581:3: rule__Entidad__Group_4__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entidad__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getEntidadAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__4__Impl"


    // $ANTLR start "rule__Entidad__Group__5"
    // InternalGenerador.g:589:1: rule__Entidad__Group__5 : rule__Entidad__Group__5__Impl ;
    public final void rule__Entidad__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:593:1: ( rule__Entidad__Group__5__Impl )
            // InternalGenerador.g:594:2: rule__Entidad__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5"


    // $ANTLR start "rule__Entidad__Group__5__Impl"
    // InternalGenerador.g:600:1: rule__Entidad__Group__5__Impl : ( '}' ) ;
    public final void rule__Entidad__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:604:1: ( ( '}' ) )
            // InternalGenerador.g:605:1: ( '}' )
            {
            // InternalGenerador.g:605:1: ( '}' )
            // InternalGenerador.g:606:2: '}'
            {
             before(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group__5__Impl"


    // $ANTLR start "rule__Entidad__Group_4__0"
    // InternalGenerador.g:616:1: rule__Entidad__Group_4__0 : rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 ;
    public final void rule__Entidad__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:620:1: ( rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1 )
            // InternalGenerador.g:621:2: rule__Entidad__Group_4__0__Impl rule__Entidad__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Entidad__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0"


    // $ANTLR start "rule__Entidad__Group_4__0__Impl"
    // InternalGenerador.g:628:1: rule__Entidad__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Entidad__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:632:1: ( ( ',' ) )
            // InternalGenerador.g:633:1: ( ',' )
            {
            // InternalGenerador.g:633:1: ( ',' )
            // InternalGenerador.g:634:2: ','
            {
             before(grammarAccess.getEntidadAccess().getCommaKeyword_4_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getEntidadAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__0__Impl"


    // $ANTLR start "rule__Entidad__Group_4__1"
    // InternalGenerador.g:643:1: rule__Entidad__Group_4__1 : rule__Entidad__Group_4__1__Impl ;
    public final void rule__Entidad__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:647:1: ( rule__Entidad__Group_4__1__Impl )
            // InternalGenerador.g:648:2: rule__Entidad__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1"


    // $ANTLR start "rule__Entidad__Group_4__1__Impl"
    // InternalGenerador.g:654:1: rule__Entidad__Group_4__1__Impl : ( ( rule__Entidad__CampoAssignment_4_1 ) ) ;
    public final void rule__Entidad__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:658:1: ( ( ( rule__Entidad__CampoAssignment_4_1 ) ) )
            // InternalGenerador.g:659:1: ( ( rule__Entidad__CampoAssignment_4_1 ) )
            {
            // InternalGenerador.g:659:1: ( ( rule__Entidad__CampoAssignment_4_1 ) )
            // InternalGenerador.g:660:2: ( rule__Entidad__CampoAssignment_4_1 )
            {
             before(grammarAccess.getEntidadAccess().getCampoAssignment_4_1()); 
            // InternalGenerador.g:661:2: ( rule__Entidad__CampoAssignment_4_1 )
            // InternalGenerador.g:661:3: rule__Entidad__CampoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__CampoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getCampoAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Group_4__1__Impl"


    // $ANTLR start "rule__Campo__Group__0"
    // InternalGenerador.g:670:1: rule__Campo__Group__0 : rule__Campo__Group__0__Impl rule__Campo__Group__1 ;
    public final void rule__Campo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:674:1: ( rule__Campo__Group__0__Impl rule__Campo__Group__1 )
            // InternalGenerador.g:675:2: rule__Campo__Group__0__Impl rule__Campo__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Campo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__0"


    // $ANTLR start "rule__Campo__Group__0__Impl"
    // InternalGenerador.g:682:1: rule__Campo__Group__0__Impl : ( ( rule__Campo__NameAssignment_0 ) ) ;
    public final void rule__Campo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:686:1: ( ( ( rule__Campo__NameAssignment_0 ) ) )
            // InternalGenerador.g:687:1: ( ( rule__Campo__NameAssignment_0 ) )
            {
            // InternalGenerador.g:687:1: ( ( rule__Campo__NameAssignment_0 ) )
            // InternalGenerador.g:688:2: ( rule__Campo__NameAssignment_0 )
            {
             before(grammarAccess.getCampoAccess().getNameAssignment_0()); 
            // InternalGenerador.g:689:2: ( rule__Campo__NameAssignment_0 )
            // InternalGenerador.g:689:3: rule__Campo__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Campo__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__0__Impl"


    // $ANTLR start "rule__Campo__Group__1"
    // InternalGenerador.g:697:1: rule__Campo__Group__1 : rule__Campo__Group__1__Impl rule__Campo__Group__2 ;
    public final void rule__Campo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:701:1: ( rule__Campo__Group__1__Impl rule__Campo__Group__2 )
            // InternalGenerador.g:702:2: rule__Campo__Group__1__Impl rule__Campo__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Campo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__1"


    // $ANTLR start "rule__Campo__Group__1__Impl"
    // InternalGenerador.g:709:1: rule__Campo__Group__1__Impl : ( ( rule__Campo__TipoAssignment_1 ) ) ;
    public final void rule__Campo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:713:1: ( ( ( rule__Campo__TipoAssignment_1 ) ) )
            // InternalGenerador.g:714:1: ( ( rule__Campo__TipoAssignment_1 ) )
            {
            // InternalGenerador.g:714:1: ( ( rule__Campo__TipoAssignment_1 ) )
            // InternalGenerador.g:715:2: ( rule__Campo__TipoAssignment_1 )
            {
             before(grammarAccess.getCampoAccess().getTipoAssignment_1()); 
            // InternalGenerador.g:716:2: ( rule__Campo__TipoAssignment_1 )
            // InternalGenerador.g:716:3: rule__Campo__TipoAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Campo__TipoAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCampoAccess().getTipoAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__1__Impl"


    // $ANTLR start "rule__Campo__Group__2"
    // InternalGenerador.g:724:1: rule__Campo__Group__2 : rule__Campo__Group__2__Impl rule__Campo__Group__3 ;
    public final void rule__Campo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:728:1: ( rule__Campo__Group__2__Impl rule__Campo__Group__3 )
            // InternalGenerador.g:729:2: rule__Campo__Group__2__Impl rule__Campo__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Campo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Campo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__2"


    // $ANTLR start "rule__Campo__Group__2__Impl"
    // InternalGenerador.g:736:1: rule__Campo__Group__2__Impl : ( ( rule__Campo__PrincipalAssignment_2 )? ) ;
    public final void rule__Campo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:740:1: ( ( ( rule__Campo__PrincipalAssignment_2 )? ) )
            // InternalGenerador.g:741:1: ( ( rule__Campo__PrincipalAssignment_2 )? )
            {
            // InternalGenerador.g:741:1: ( ( rule__Campo__PrincipalAssignment_2 )? )
            // InternalGenerador.g:742:2: ( rule__Campo__PrincipalAssignment_2 )?
            {
             before(grammarAccess.getCampoAccess().getPrincipalAssignment_2()); 
            // InternalGenerador.g:743:2: ( rule__Campo__PrincipalAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalGenerador.g:743:3: rule__Campo__PrincipalAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Campo__PrincipalAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCampoAccess().getPrincipalAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__2__Impl"


    // $ANTLR start "rule__Campo__Group__3"
    // InternalGenerador.g:751:1: rule__Campo__Group__3 : rule__Campo__Group__3__Impl ;
    public final void rule__Campo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:755:1: ( rule__Campo__Group__3__Impl )
            // InternalGenerador.g:756:2: rule__Campo__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Campo__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__3"


    // $ANTLR start "rule__Campo__Group__3__Impl"
    // InternalGenerador.g:762:1: rule__Campo__Group__3__Impl : ( ( rule__Campo__EntidadAssignment_3 )? ) ;
    public final void rule__Campo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:766:1: ( ( ( rule__Campo__EntidadAssignment_3 )? ) )
            // InternalGenerador.g:767:1: ( ( rule__Campo__EntidadAssignment_3 )? )
            {
            // InternalGenerador.g:767:1: ( ( rule__Campo__EntidadAssignment_3 )? )
            // InternalGenerador.g:768:2: ( rule__Campo__EntidadAssignment_3 )?
            {
             before(grammarAccess.getCampoAccess().getEntidadAssignment_3()); 
            // InternalGenerador.g:769:2: ( rule__Campo__EntidadAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_ID)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalGenerador.g:769:3: rule__Campo__EntidadAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Campo__EntidadAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCampoAccess().getEntidadAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__Group__3__Impl"


    // $ANTLR start "rule__Raiz__NameAssignment_1"
    // InternalGenerador.g:778:1: rule__Raiz__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Raiz__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:782:1: ( ( ruleEString ) )
            // InternalGenerador.g:783:2: ( ruleEString )
            {
            // InternalGenerador.g:783:2: ( ruleEString )
            // InternalGenerador.g:784:3: ruleEString
            {
             before(grammarAccess.getRaizAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRaizAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__NameAssignment_1"


    // $ANTLR start "rule__Raiz__EntidadAssignment_3"
    // InternalGenerador.g:793:1: rule__Raiz__EntidadAssignment_3 : ( ruleEntidad ) ;
    public final void rule__Raiz__EntidadAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:797:1: ( ( ruleEntidad ) )
            // InternalGenerador.g:798:2: ( ruleEntidad )
            {
            // InternalGenerador.g:798:2: ( ruleEntidad )
            // InternalGenerador.g:799:3: ruleEntidad
            {
             before(grammarAccess.getRaizAccess().getEntidadEntidadParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getRaizAccess().getEntidadEntidadParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__EntidadAssignment_3"


    // $ANTLR start "rule__Raiz__EntidadAssignment_4"
    // InternalGenerador.g:808:1: rule__Raiz__EntidadAssignment_4 : ( ruleEntidad ) ;
    public final void rule__Raiz__EntidadAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:812:1: ( ( ruleEntidad ) )
            // InternalGenerador.g:813:2: ( ruleEntidad )
            {
            // InternalGenerador.g:813:2: ( ruleEntidad )
            // InternalGenerador.g:814:3: ruleEntidad
            {
             before(grammarAccess.getRaizAccess().getEntidadEntidadParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getRaizAccess().getEntidadEntidadParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Raiz__EntidadAssignment_4"


    // $ANTLR start "rule__Entidad__NameAssignment_1"
    // InternalGenerador.g:823:1: rule__Entidad__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Entidad__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:827:1: ( ( ruleEString ) )
            // InternalGenerador.g:828:2: ( ruleEString )
            {
            // InternalGenerador.g:828:2: ( ruleEString )
            // InternalGenerador.g:829:3: ruleEString
            {
             before(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__NameAssignment_1"


    // $ANTLR start "rule__Entidad__CampoAssignment_3"
    // InternalGenerador.g:838:1: rule__Entidad__CampoAssignment_3 : ( ruleCampo ) ;
    public final void rule__Entidad__CampoAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:842:1: ( ( ruleCampo ) )
            // InternalGenerador.g:843:2: ( ruleCampo )
            {
            // InternalGenerador.g:843:2: ( ruleCampo )
            // InternalGenerador.g:844:3: ruleCampo
            {
             before(grammarAccess.getEntidadAccess().getCampoCampoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getCampoCampoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__CampoAssignment_3"


    // $ANTLR start "rule__Entidad__CampoAssignment_4_1"
    // InternalGenerador.g:853:1: rule__Entidad__CampoAssignment_4_1 : ( ruleCampo ) ;
    public final void rule__Entidad__CampoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:857:1: ( ( ruleCampo ) )
            // InternalGenerador.g:858:2: ( ruleCampo )
            {
            // InternalGenerador.g:858:2: ( ruleCampo )
            // InternalGenerador.g:859:3: ruleCampo
            {
             before(grammarAccess.getEntidadAccess().getCampoCampoParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCampo();

            state._fsp--;

             after(grammarAccess.getEntidadAccess().getCampoCampoParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__CampoAssignment_4_1"


    // $ANTLR start "rule__Campo__NameAssignment_0"
    // InternalGenerador.g:868:1: rule__Campo__NameAssignment_0 : ( ruleEString ) ;
    public final void rule__Campo__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:872:1: ( ( ruleEString ) )
            // InternalGenerador.g:873:2: ( ruleEString )
            {
            // InternalGenerador.g:873:2: ( ruleEString )
            // InternalGenerador.g:874:3: ruleEString
            {
             before(grammarAccess.getCampoAccess().getNameEStringParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getNameEStringParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__NameAssignment_0"


    // $ANTLR start "rule__Campo__TipoAssignment_1"
    // InternalGenerador.g:883:1: rule__Campo__TipoAssignment_1 : ( ruleTipoDato ) ;
    public final void rule__Campo__TipoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:887:1: ( ( ruleTipoDato ) )
            // InternalGenerador.g:888:2: ( ruleTipoDato )
            {
            // InternalGenerador.g:888:2: ( ruleTipoDato )
            // InternalGenerador.g:889:3: ruleTipoDato
            {
             before(grammarAccess.getCampoAccess().getTipoTipoDatoEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getTipoTipoDatoEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__TipoAssignment_1"


    // $ANTLR start "rule__Campo__PrincipalAssignment_2"
    // InternalGenerador.g:898:1: rule__Campo__PrincipalAssignment_2 : ( ruleEBoolean ) ;
    public final void rule__Campo__PrincipalAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:902:1: ( ( ruleEBoolean ) )
            // InternalGenerador.g:903:2: ( ruleEBoolean )
            {
            // InternalGenerador.g:903:2: ( ruleEBoolean )
            // InternalGenerador.g:904:3: ruleEBoolean
            {
             before(grammarAccess.getCampoAccess().getPrincipalEBooleanParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getPrincipalEBooleanParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__PrincipalAssignment_2"


    // $ANTLR start "rule__Campo__EntidadAssignment_3"
    // InternalGenerador.g:913:1: rule__Campo__EntidadAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Campo__EntidadAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalGenerador.g:917:1: ( ( ( ruleEString ) ) )
            // InternalGenerador.g:918:2: ( ( ruleEString ) )
            {
            // InternalGenerador.g:918:2: ( ( ruleEString ) )
            // InternalGenerador.g:919:3: ( ruleEString )
            {
             before(grammarAccess.getCampoAccess().getEntidadEntidadCrossReference_3_0()); 
            // InternalGenerador.g:920:3: ( ruleEString )
            // InternalGenerador.g:921:4: ruleEString
            {
             before(grammarAccess.getCampoAccess().getEntidadEntidadEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCampoAccess().getEntidadEntidadEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCampoAccess().getEntidadEntidadCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Campo__EntidadAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000001830L});

}