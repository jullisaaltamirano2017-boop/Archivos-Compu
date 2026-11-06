package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Entero'", "'Decimal'", "'Texto'", "'Fecha'", "'public'", "'class'", "'{'", "'}'", "'description'", "';'", "'relacionado'", "'('", "')'", "','", "'Contenido'", "'tipo'", "'Relacionado'", "'numero'", "'-'", "'activo'"
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
    public static final int T__30=30;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleExample"
    // InternalMyDsl.g:53:1: entryRuleExample : ruleExample EOF ;
    public final void entryRuleExample() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleExample EOF )
            // InternalMyDsl.g:55:1: ruleExample EOF
            {
             before(grammarAccess.getExampleRule()); 
            pushFollow(FOLLOW_1);
            ruleExample();

            state._fsp--;

             after(grammarAccess.getExampleRule()); 
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
    // $ANTLR end "entryRuleExample"


    // $ANTLR start "ruleExample"
    // InternalMyDsl.g:62:1: ruleExample : ( ( rule__Example__Group__0 ) ) ;
    public final void ruleExample() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Example__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Example__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Example__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Example__Group__0 )
            {
             before(grammarAccess.getExampleAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Example__Group__0 )
            // InternalMyDsl.g:69:4: rule__Example__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getGroup()); 

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
    // $ANTLR end "ruleExample"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEString EOF )
            // InternalMyDsl.g:80:1: ruleEString EOF
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
    // InternalMyDsl.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleContenido"
    // InternalMyDsl.g:103:1: entryRuleContenido : ruleContenido EOF ;
    public final void entryRuleContenido() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleContenido EOF )
            // InternalMyDsl.g:105:1: ruleContenido EOF
            {
             before(grammarAccess.getContenidoRule()); 
            pushFollow(FOLLOW_1);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getContenidoRule()); 
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
    // $ANTLR end "entryRuleContenido"


    // $ANTLR start "ruleContenido"
    // InternalMyDsl.g:112:1: ruleContenido : ( ( rule__Contenido__Group__0 ) ) ;
    public final void ruleContenido() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Contenido__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Contenido__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Contenido__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Contenido__Group__0 )
            {
             before(grammarAccess.getContenidoAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Contenido__Group__0 )
            // InternalMyDsl.g:119:4: rule__Contenido__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getGroup()); 

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
    // $ANTLR end "ruleContenido"


    // $ANTLR start "entryRuleRelacionado"
    // InternalMyDsl.g:128:1: entryRuleRelacionado : ruleRelacionado EOF ;
    public final void entryRuleRelacionado() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleRelacionado EOF )
            // InternalMyDsl.g:130:1: ruleRelacionado EOF
            {
             before(grammarAccess.getRelacionadoRule()); 
            pushFollow(FOLLOW_1);
            ruleRelacionado();

            state._fsp--;

             after(grammarAccess.getRelacionadoRule()); 
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
    // $ANTLR end "entryRuleRelacionado"


    // $ANTLR start "ruleRelacionado"
    // InternalMyDsl.g:137:1: ruleRelacionado : ( ( rule__Relacionado__Group__0 ) ) ;
    public final void ruleRelacionado() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Relacionado__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Relacionado__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Relacionado__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Relacionado__Group__0 )
            {
             before(grammarAccess.getRelacionadoAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Relacionado__Group__0 )
            // InternalMyDsl.g:144:4: rule__Relacionado__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRelacionadoAccess().getGroup()); 

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
    // $ANTLR end "ruleRelacionado"


    // $ANTLR start "entryRuleEBigInteger"
    // InternalMyDsl.g:153:1: entryRuleEBigInteger : ruleEBigInteger EOF ;
    public final void entryRuleEBigInteger() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleEBigInteger EOF )
            // InternalMyDsl.g:155:1: ruleEBigInteger EOF
            {
             before(grammarAccess.getEBigIntegerRule()); 
            pushFollow(FOLLOW_1);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getEBigIntegerRule()); 
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
    // $ANTLR end "entryRuleEBigInteger"


    // $ANTLR start "ruleEBigInteger"
    // InternalMyDsl.g:162:1: ruleEBigInteger : ( ( rule__EBigInteger__Group__0 ) ) ;
    public final void ruleEBigInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__EBigInteger__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__EBigInteger__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__EBigInteger__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__EBigInteger__Group__0 )
            {
             before(grammarAccess.getEBigIntegerAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__EBigInteger__Group__0 )
            // InternalMyDsl.g:169:4: rule__EBigInteger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EBigInteger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEBigIntegerAccess().getGroup()); 

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
    // $ANTLR end "ruleEBigInteger"


    // $ANTLR start "ruleTipoDato"
    // InternalMyDsl.g:178:1: ruleTipoDato : ( ( rule__TipoDato__Alternatives ) ) ;
    public final void ruleTipoDato() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:182:1: ( ( ( rule__TipoDato__Alternatives ) ) )
            // InternalMyDsl.g:183:2: ( ( rule__TipoDato__Alternatives ) )
            {
            // InternalMyDsl.g:183:2: ( ( rule__TipoDato__Alternatives ) )
            // InternalMyDsl.g:184:3: ( rule__TipoDato__Alternatives )
            {
             before(grammarAccess.getTipoDatoAccess().getAlternatives()); 
            // InternalMyDsl.g:185:3: ( rule__TipoDato__Alternatives )
            // InternalMyDsl.g:185:4: rule__TipoDato__Alternatives
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
    // InternalMyDsl.g:193:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:197:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalMyDsl.g:198:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:198:2: ( RULE_STRING )
                    // InternalMyDsl.g:199:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:204:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:204:2: ( RULE_ID )
                    // InternalMyDsl.g:205:3: RULE_ID
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


    // $ANTLR start "rule__TipoDato__Alternatives"
    // InternalMyDsl.g:214:1: rule__TipoDato__Alternatives : ( ( ( 'Entero' ) ) | ( ( 'Decimal' ) ) | ( ( 'Texto' ) ) | ( ( 'Fecha' ) ) );
    public final void rule__TipoDato__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:218:1: ( ( ( 'Entero' ) ) | ( ( 'Decimal' ) ) | ( ( 'Texto' ) ) | ( ( 'Fecha' ) ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:219:2: ( ( 'Entero' ) )
                    {
                    // InternalMyDsl.g:219:2: ( ( 'Entero' ) )
                    // InternalMyDsl.g:220:3: ( 'Entero' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getEnteroEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:221:3: ( 'Entero' )
                    // InternalMyDsl.g:221:4: 'Entero'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getEnteroEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:225:2: ( ( 'Decimal' ) )
                    {
                    // InternalMyDsl.g:225:2: ( ( 'Decimal' ) )
                    // InternalMyDsl.g:226:3: ( 'Decimal' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getDecimalEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:227:3: ( 'Decimal' )
                    // InternalMyDsl.g:227:4: 'Decimal'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getDecimalEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:231:2: ( ( 'Texto' ) )
                    {
                    // InternalMyDsl.g:231:2: ( ( 'Texto' ) )
                    // InternalMyDsl.g:232:3: ( 'Texto' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getTextoEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:233:3: ( 'Texto' )
                    // InternalMyDsl.g:233:4: 'Texto'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getTextoEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:237:2: ( ( 'Fecha' ) )
                    {
                    // InternalMyDsl.g:237:2: ( ( 'Fecha' ) )
                    // InternalMyDsl.g:238:3: ( 'Fecha' )
                    {
                     before(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:239:3: ( 'Fecha' )
                    // InternalMyDsl.g:239:4: 'Fecha'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoDatoAccess().getFechaEnumLiteralDeclaration_3()); 

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


    // $ANTLR start "rule__Example__Group__0"
    // InternalMyDsl.g:247:1: rule__Example__Group__0 : rule__Example__Group__0__Impl rule__Example__Group__1 ;
    public final void rule__Example__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:251:1: ( rule__Example__Group__0__Impl rule__Example__Group__1 )
            // InternalMyDsl.g:252:2: rule__Example__Group__0__Impl rule__Example__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Example__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__1();

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
    // $ANTLR end "rule__Example__Group__0"


    // $ANTLR start "rule__Example__Group__0__Impl"
    // InternalMyDsl.g:259:1: rule__Example__Group__0__Impl : ( () ) ;
    public final void rule__Example__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:263:1: ( ( () ) )
            // InternalMyDsl.g:264:1: ( () )
            {
            // InternalMyDsl.g:264:1: ( () )
            // InternalMyDsl.g:265:2: ()
            {
             before(grammarAccess.getExampleAccess().getExampleAction_0()); 
            // InternalMyDsl.g:266:2: ()
            // InternalMyDsl.g:266:3: 
            {
            }

             after(grammarAccess.getExampleAccess().getExampleAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Example__Group__0__Impl"


    // $ANTLR start "rule__Example__Group__1"
    // InternalMyDsl.g:274:1: rule__Example__Group__1 : rule__Example__Group__1__Impl rule__Example__Group__2 ;
    public final void rule__Example__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:278:1: ( rule__Example__Group__1__Impl rule__Example__Group__2 )
            // InternalMyDsl.g:279:2: rule__Example__Group__1__Impl rule__Example__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Example__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__2();

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
    // $ANTLR end "rule__Example__Group__1"


    // $ANTLR start "rule__Example__Group__1__Impl"
    // InternalMyDsl.g:286:1: rule__Example__Group__1__Impl : ( 'public' ) ;
    public final void rule__Example__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:290:1: ( ( 'public' ) )
            // InternalMyDsl.g:291:1: ( 'public' )
            {
            // InternalMyDsl.g:291:1: ( 'public' )
            // InternalMyDsl.g:292:2: 'public'
            {
             before(grammarAccess.getExampleAccess().getPublicKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getPublicKeyword_1()); 

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
    // $ANTLR end "rule__Example__Group__1__Impl"


    // $ANTLR start "rule__Example__Group__2"
    // InternalMyDsl.g:301:1: rule__Example__Group__2 : rule__Example__Group__2__Impl rule__Example__Group__3 ;
    public final void rule__Example__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:305:1: ( rule__Example__Group__2__Impl rule__Example__Group__3 )
            // InternalMyDsl.g:306:2: rule__Example__Group__2__Impl rule__Example__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Example__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__3();

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
    // $ANTLR end "rule__Example__Group__2"


    // $ANTLR start "rule__Example__Group__2__Impl"
    // InternalMyDsl.g:313:1: rule__Example__Group__2__Impl : ( ( 'class' )? ) ;
    public final void rule__Example__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:317:1: ( ( ( 'class' )? ) )
            // InternalMyDsl.g:318:1: ( ( 'class' )? )
            {
            // InternalMyDsl.g:318:1: ( ( 'class' )? )
            // InternalMyDsl.g:319:2: ( 'class' )?
            {
             before(grammarAccess.getExampleAccess().getClassKeyword_2()); 
            // InternalMyDsl.g:320:2: ( 'class' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:320:3: 'class'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getClassKeyword_2()); 

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
    // $ANTLR end "rule__Example__Group__2__Impl"


    // $ANTLR start "rule__Example__Group__3"
    // InternalMyDsl.g:328:1: rule__Example__Group__3 : rule__Example__Group__3__Impl rule__Example__Group__4 ;
    public final void rule__Example__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:332:1: ( rule__Example__Group__3__Impl rule__Example__Group__4 )
            // InternalMyDsl.g:333:2: rule__Example__Group__3__Impl rule__Example__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Example__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__4();

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
    // $ANTLR end "rule__Example__Group__3"


    // $ANTLR start "rule__Example__Group__3__Impl"
    // InternalMyDsl.g:340:1: rule__Example__Group__3__Impl : ( ( rule__Example__NameAssignment_3 ) ) ;
    public final void rule__Example__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:344:1: ( ( ( rule__Example__NameAssignment_3 ) ) )
            // InternalMyDsl.g:345:1: ( ( rule__Example__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:345:1: ( ( rule__Example__NameAssignment_3 ) )
            // InternalMyDsl.g:346:2: ( rule__Example__NameAssignment_3 )
            {
             before(grammarAccess.getExampleAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:347:2: ( rule__Example__NameAssignment_3 )
            // InternalMyDsl.g:347:3: rule__Example__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Example__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Example__Group__3__Impl"


    // $ANTLR start "rule__Example__Group__4"
    // InternalMyDsl.g:355:1: rule__Example__Group__4 : rule__Example__Group__4__Impl rule__Example__Group__5 ;
    public final void rule__Example__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:359:1: ( rule__Example__Group__4__Impl rule__Example__Group__5 )
            // InternalMyDsl.g:360:2: rule__Example__Group__4__Impl rule__Example__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__5();

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
    // $ANTLR end "rule__Example__Group__4"


    // $ANTLR start "rule__Example__Group__4__Impl"
    // InternalMyDsl.g:367:1: rule__Example__Group__4__Impl : ( '{' ) ;
    public final void rule__Example__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:371:1: ( ( '{' ) )
            // InternalMyDsl.g:372:1: ( '{' )
            {
            // InternalMyDsl.g:372:1: ( '{' )
            // InternalMyDsl.g:373:2: '{'
            {
             before(grammarAccess.getExampleAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Example__Group__4__Impl"


    // $ANTLR start "rule__Example__Group__5"
    // InternalMyDsl.g:382:1: rule__Example__Group__5 : rule__Example__Group__5__Impl rule__Example__Group__6 ;
    public final void rule__Example__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:386:1: ( rule__Example__Group__5__Impl rule__Example__Group__6 )
            // InternalMyDsl.g:387:2: rule__Example__Group__5__Impl rule__Example__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__6();

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
    // $ANTLR end "rule__Example__Group__5"


    // $ANTLR start "rule__Example__Group__5__Impl"
    // InternalMyDsl.g:394:1: rule__Example__Group__5__Impl : ( ( rule__Example__Group_5__0 )? ) ;
    public final void rule__Example__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:398:1: ( ( ( rule__Example__Group_5__0 )? ) )
            // InternalMyDsl.g:399:1: ( ( rule__Example__Group_5__0 )? )
            {
            // InternalMyDsl.g:399:1: ( ( rule__Example__Group_5__0 )? )
            // InternalMyDsl.g:400:2: ( rule__Example__Group_5__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_5()); 
            // InternalMyDsl.g:401:2: ( rule__Example__Group_5__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:401:3: rule__Example__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Example__Group__5__Impl"


    // $ANTLR start "rule__Example__Group__6"
    // InternalMyDsl.g:409:1: rule__Example__Group__6 : rule__Example__Group__6__Impl rule__Example__Group__7 ;
    public final void rule__Example__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:413:1: ( rule__Example__Group__6__Impl rule__Example__Group__7 )
            // InternalMyDsl.g:414:2: rule__Example__Group__6__Impl rule__Example__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__7();

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
    // $ANTLR end "rule__Example__Group__6"


    // $ANTLR start "rule__Example__Group__6__Impl"
    // InternalMyDsl.g:421:1: rule__Example__Group__6__Impl : ( ( rule__Example__Group_6__0 )? ) ;
    public final void rule__Example__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:425:1: ( ( ( rule__Example__Group_6__0 )? ) )
            // InternalMyDsl.g:426:1: ( ( rule__Example__Group_6__0 )? )
            {
            // InternalMyDsl.g:426:1: ( ( rule__Example__Group_6__0 )? )
            // InternalMyDsl.g:427:2: ( rule__Example__Group_6__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_6()); 
            // InternalMyDsl.g:428:2: ( rule__Example__Group_6__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:428:3: rule__Example__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Example__Group__6__Impl"


    // $ANTLR start "rule__Example__Group__7"
    // InternalMyDsl.g:436:1: rule__Example__Group__7 : rule__Example__Group__7__Impl rule__Example__Group__8 ;
    public final void rule__Example__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:440:1: ( rule__Example__Group__7__Impl rule__Example__Group__8 )
            // InternalMyDsl.g:441:2: rule__Example__Group__7__Impl rule__Example__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__Example__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group__8();

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
    // $ANTLR end "rule__Example__Group__7"


    // $ANTLR start "rule__Example__Group__7__Impl"
    // InternalMyDsl.g:448:1: rule__Example__Group__7__Impl : ( ( rule__Example__Group_7__0 )? ) ;
    public final void rule__Example__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ( rule__Example__Group_7__0 )? ) )
            // InternalMyDsl.g:453:1: ( ( rule__Example__Group_7__0 )? )
            {
            // InternalMyDsl.g:453:1: ( ( rule__Example__Group_7__0 )? )
            // InternalMyDsl.g:454:2: ( rule__Example__Group_7__0 )?
            {
             before(grammarAccess.getExampleAccess().getGroup_7()); 
            // InternalMyDsl.g:455:2: ( rule__Example__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:455:3: rule__Example__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Example__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExampleAccess().getGroup_7()); 

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
    // $ANTLR end "rule__Example__Group__7__Impl"


    // $ANTLR start "rule__Example__Group__8"
    // InternalMyDsl.g:463:1: rule__Example__Group__8 : rule__Example__Group__8__Impl ;
    public final void rule__Example__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:467:1: ( rule__Example__Group__8__Impl )
            // InternalMyDsl.g:468:2: rule__Example__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group__8__Impl();

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
    // $ANTLR end "rule__Example__Group__8"


    // $ANTLR start "rule__Example__Group__8__Impl"
    // InternalMyDsl.g:474:1: rule__Example__Group__8__Impl : ( '}' ) ;
    public final void rule__Example__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:478:1: ( ( '}' ) )
            // InternalMyDsl.g:479:1: ( '}' )
            {
            // InternalMyDsl.g:479:1: ( '}' )
            // InternalMyDsl.g:480:2: '}'
            {
             before(grammarAccess.getExampleAccess().getRightCurlyBracketKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getRightCurlyBracketKeyword_8()); 

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
    // $ANTLR end "rule__Example__Group__8__Impl"


    // $ANTLR start "rule__Example__Group_5__0"
    // InternalMyDsl.g:490:1: rule__Example__Group_5__0 : rule__Example__Group_5__0__Impl rule__Example__Group_5__1 ;
    public final void rule__Example__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( rule__Example__Group_5__0__Impl rule__Example__Group_5__1 )
            // InternalMyDsl.g:495:2: rule__Example__Group_5__0__Impl rule__Example__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Example__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_5__1();

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
    // $ANTLR end "rule__Example__Group_5__0"


    // $ANTLR start "rule__Example__Group_5__0__Impl"
    // InternalMyDsl.g:502:1: rule__Example__Group_5__0__Impl : ( 'description' ) ;
    public final void rule__Example__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:506:1: ( ( 'description' ) )
            // InternalMyDsl.g:507:1: ( 'description' )
            {
            // InternalMyDsl.g:507:1: ( 'description' )
            // InternalMyDsl.g:508:2: 'description'
            {
             before(grammarAccess.getExampleAccess().getDescriptionKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getDescriptionKeyword_5_0()); 

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
    // $ANTLR end "rule__Example__Group_5__0__Impl"


    // $ANTLR start "rule__Example__Group_5__1"
    // InternalMyDsl.g:517:1: rule__Example__Group_5__1 : rule__Example__Group_5__1__Impl rule__Example__Group_5__2 ;
    public final void rule__Example__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:521:1: ( rule__Example__Group_5__1__Impl rule__Example__Group_5__2 )
            // InternalMyDsl.g:522:2: rule__Example__Group_5__1__Impl rule__Example__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__Example__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_5__2();

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
    // $ANTLR end "rule__Example__Group_5__1"


    // $ANTLR start "rule__Example__Group_5__1__Impl"
    // InternalMyDsl.g:529:1: rule__Example__Group_5__1__Impl : ( ( rule__Example__DescriptionAssignment_5_1 ) ) ;
    public final void rule__Example__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:533:1: ( ( ( rule__Example__DescriptionAssignment_5_1 ) ) )
            // InternalMyDsl.g:534:1: ( ( rule__Example__DescriptionAssignment_5_1 ) )
            {
            // InternalMyDsl.g:534:1: ( ( rule__Example__DescriptionAssignment_5_1 ) )
            // InternalMyDsl.g:535:2: ( rule__Example__DescriptionAssignment_5_1 )
            {
             before(grammarAccess.getExampleAccess().getDescriptionAssignment_5_1()); 
            // InternalMyDsl.g:536:2: ( rule__Example__DescriptionAssignment_5_1 )
            // InternalMyDsl.g:536:3: rule__Example__DescriptionAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__DescriptionAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getDescriptionAssignment_5_1()); 

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
    // $ANTLR end "rule__Example__Group_5__1__Impl"


    // $ANTLR start "rule__Example__Group_5__2"
    // InternalMyDsl.g:544:1: rule__Example__Group_5__2 : rule__Example__Group_5__2__Impl ;
    public final void rule__Example__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( rule__Example__Group_5__2__Impl )
            // InternalMyDsl.g:549:2: rule__Example__Group_5__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_5__2__Impl();

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
    // $ANTLR end "rule__Example__Group_5__2"


    // $ANTLR start "rule__Example__Group_5__2__Impl"
    // InternalMyDsl.g:555:1: rule__Example__Group_5__2__Impl : ( ';' ) ;
    public final void rule__Example__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:559:1: ( ( ';' ) )
            // InternalMyDsl.g:560:1: ( ';' )
            {
            // InternalMyDsl.g:560:1: ( ';' )
            // InternalMyDsl.g:561:2: ';'
            {
             before(grammarAccess.getExampleAccess().getSemicolonKeyword_5_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getSemicolonKeyword_5_2()); 

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
    // $ANTLR end "rule__Example__Group_5__2__Impl"


    // $ANTLR start "rule__Example__Group_6__0"
    // InternalMyDsl.g:571:1: rule__Example__Group_6__0 : rule__Example__Group_6__0__Impl rule__Example__Group_6__1 ;
    public final void rule__Example__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:575:1: ( rule__Example__Group_6__0__Impl rule__Example__Group_6__1 )
            // InternalMyDsl.g:576:2: rule__Example__Group_6__0__Impl rule__Example__Group_6__1
            {
            pushFollow(FOLLOW_8);
            rule__Example__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_6__1();

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
    // $ANTLR end "rule__Example__Group_6__0"


    // $ANTLR start "rule__Example__Group_6__0__Impl"
    // InternalMyDsl.g:583:1: rule__Example__Group_6__0__Impl : ( 'relacionado' ) ;
    public final void rule__Example__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:587:1: ( ( 'relacionado' ) )
            // InternalMyDsl.g:588:1: ( 'relacionado' )
            {
            // InternalMyDsl.g:588:1: ( 'relacionado' )
            // InternalMyDsl.g:589:2: 'relacionado'
            {
             before(grammarAccess.getExampleAccess().getRelacionadoKeyword_6_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getRelacionadoKeyword_6_0()); 

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
    // $ANTLR end "rule__Example__Group_6__0__Impl"


    // $ANTLR start "rule__Example__Group_6__1"
    // InternalMyDsl.g:598:1: rule__Example__Group_6__1 : rule__Example__Group_6__1__Impl rule__Example__Group_6__2 ;
    public final void rule__Example__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( rule__Example__Group_6__1__Impl rule__Example__Group_6__2 )
            // InternalMyDsl.g:603:2: rule__Example__Group_6__1__Impl rule__Example__Group_6__2
            {
            pushFollow(FOLLOW_4);
            rule__Example__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_6__2();

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
    // $ANTLR end "rule__Example__Group_6__1"


    // $ANTLR start "rule__Example__Group_6__1__Impl"
    // InternalMyDsl.g:610:1: rule__Example__Group_6__1__Impl : ( '(' ) ;
    public final void rule__Example__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:614:1: ( ( '(' ) )
            // InternalMyDsl.g:615:1: ( '(' )
            {
            // InternalMyDsl.g:615:1: ( '(' )
            // InternalMyDsl.g:616:2: '('
            {
             before(grammarAccess.getExampleAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getLeftParenthesisKeyword_6_1()); 

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
    // $ANTLR end "rule__Example__Group_6__1__Impl"


    // $ANTLR start "rule__Example__Group_6__2"
    // InternalMyDsl.g:625:1: rule__Example__Group_6__2 : rule__Example__Group_6__2__Impl rule__Example__Group_6__3 ;
    public final void rule__Example__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( rule__Example__Group_6__2__Impl rule__Example__Group_6__3 )
            // InternalMyDsl.g:630:2: rule__Example__Group_6__2__Impl rule__Example__Group_6__3
            {
            pushFollow(FOLLOW_9);
            rule__Example__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_6__3();

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
    // $ANTLR end "rule__Example__Group_6__2"


    // $ANTLR start "rule__Example__Group_6__2__Impl"
    // InternalMyDsl.g:637:1: rule__Example__Group_6__2__Impl : ( ( rule__Example__RelacionadoAssignment_6_2 ) ) ;
    public final void rule__Example__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:1: ( ( ( rule__Example__RelacionadoAssignment_6_2 ) ) )
            // InternalMyDsl.g:642:1: ( ( rule__Example__RelacionadoAssignment_6_2 ) )
            {
            // InternalMyDsl.g:642:1: ( ( rule__Example__RelacionadoAssignment_6_2 ) )
            // InternalMyDsl.g:643:2: ( rule__Example__RelacionadoAssignment_6_2 )
            {
             before(grammarAccess.getExampleAccess().getRelacionadoAssignment_6_2()); 
            // InternalMyDsl.g:644:2: ( rule__Example__RelacionadoAssignment_6_2 )
            // InternalMyDsl.g:644:3: rule__Example__RelacionadoAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Example__RelacionadoAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getRelacionadoAssignment_6_2()); 

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
    // $ANTLR end "rule__Example__Group_6__2__Impl"


    // $ANTLR start "rule__Example__Group_6__3"
    // InternalMyDsl.g:652:1: rule__Example__Group_6__3 : rule__Example__Group_6__3__Impl rule__Example__Group_6__4 ;
    public final void rule__Example__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( rule__Example__Group_6__3__Impl rule__Example__Group_6__4 )
            // InternalMyDsl.g:657:2: rule__Example__Group_6__3__Impl rule__Example__Group_6__4
            {
            pushFollow(FOLLOW_9);
            rule__Example__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_6__4();

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
    // $ANTLR end "rule__Example__Group_6__3"


    // $ANTLR start "rule__Example__Group_6__3__Impl"
    // InternalMyDsl.g:664:1: rule__Example__Group_6__3__Impl : ( ( rule__Example__Group_6_3__0 )* ) ;
    public final void rule__Example__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:668:1: ( ( ( rule__Example__Group_6_3__0 )* ) )
            // InternalMyDsl.g:669:1: ( ( rule__Example__Group_6_3__0 )* )
            {
            // InternalMyDsl.g:669:1: ( ( rule__Example__Group_6_3__0 )* )
            // InternalMyDsl.g:670:2: ( rule__Example__Group_6_3__0 )*
            {
             before(grammarAccess.getExampleAccess().getGroup_6_3()); 
            // InternalMyDsl.g:671:2: ( rule__Example__Group_6_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==24) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:671:3: rule__Example__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Example__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Example__Group_6__3__Impl"


    // $ANTLR start "rule__Example__Group_6__4"
    // InternalMyDsl.g:679:1: rule__Example__Group_6__4 : rule__Example__Group_6__4__Impl ;
    public final void rule__Example__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( rule__Example__Group_6__4__Impl )
            // InternalMyDsl.g:684:2: rule__Example__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_6__4__Impl();

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
    // $ANTLR end "rule__Example__Group_6__4"


    // $ANTLR start "rule__Example__Group_6__4__Impl"
    // InternalMyDsl.g:690:1: rule__Example__Group_6__4__Impl : ( ')' ) ;
    public final void rule__Example__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:694:1: ( ( ')' ) )
            // InternalMyDsl.g:695:1: ( ')' )
            {
            // InternalMyDsl.g:695:1: ( ')' )
            // InternalMyDsl.g:696:2: ')'
            {
             before(grammarAccess.getExampleAccess().getRightParenthesisKeyword_6_4()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getRightParenthesisKeyword_6_4()); 

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
    // $ANTLR end "rule__Example__Group_6__4__Impl"


    // $ANTLR start "rule__Example__Group_6_3__0"
    // InternalMyDsl.g:706:1: rule__Example__Group_6_3__0 : rule__Example__Group_6_3__0__Impl rule__Example__Group_6_3__1 ;
    public final void rule__Example__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( rule__Example__Group_6_3__0__Impl rule__Example__Group_6_3__1 )
            // InternalMyDsl.g:711:2: rule__Example__Group_6_3__0__Impl rule__Example__Group_6_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Example__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_6_3__1();

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
    // $ANTLR end "rule__Example__Group_6_3__0"


    // $ANTLR start "rule__Example__Group_6_3__0__Impl"
    // InternalMyDsl.g:718:1: rule__Example__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Example__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:722:1: ( ( ',' ) )
            // InternalMyDsl.g:723:1: ( ',' )
            {
            // InternalMyDsl.g:723:1: ( ',' )
            // InternalMyDsl.g:724:2: ','
            {
             before(grammarAccess.getExampleAccess().getCommaKeyword_6_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Example__Group_6_3__0__Impl"


    // $ANTLR start "rule__Example__Group_6_3__1"
    // InternalMyDsl.g:733:1: rule__Example__Group_6_3__1 : rule__Example__Group_6_3__1__Impl ;
    public final void rule__Example__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( rule__Example__Group_6_3__1__Impl )
            // InternalMyDsl.g:738:2: rule__Example__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Example__Group_6_3__1"


    // $ANTLR start "rule__Example__Group_6_3__1__Impl"
    // InternalMyDsl.g:744:1: rule__Example__Group_6_3__1__Impl : ( ( rule__Example__RelacionadoAssignment_6_3_1 ) ) ;
    public final void rule__Example__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:748:1: ( ( ( rule__Example__RelacionadoAssignment_6_3_1 ) ) )
            // InternalMyDsl.g:749:1: ( ( rule__Example__RelacionadoAssignment_6_3_1 ) )
            {
            // InternalMyDsl.g:749:1: ( ( rule__Example__RelacionadoAssignment_6_3_1 ) )
            // InternalMyDsl.g:750:2: ( rule__Example__RelacionadoAssignment_6_3_1 )
            {
             before(grammarAccess.getExampleAccess().getRelacionadoAssignment_6_3_1()); 
            // InternalMyDsl.g:751:2: ( rule__Example__RelacionadoAssignment_6_3_1 )
            // InternalMyDsl.g:751:3: rule__Example__RelacionadoAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__RelacionadoAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getRelacionadoAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Example__Group_6_3__1__Impl"


    // $ANTLR start "rule__Example__Group_7__0"
    // InternalMyDsl.g:760:1: rule__Example__Group_7__0 : rule__Example__Group_7__0__Impl rule__Example__Group_7__1 ;
    public final void rule__Example__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:764:1: ( rule__Example__Group_7__0__Impl rule__Example__Group_7__1 )
            // InternalMyDsl.g:765:2: rule__Example__Group_7__0__Impl rule__Example__Group_7__1
            {
            pushFollow(FOLLOW_11);
            rule__Example__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_7__1();

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
    // $ANTLR end "rule__Example__Group_7__0"


    // $ANTLR start "rule__Example__Group_7__0__Impl"
    // InternalMyDsl.g:772:1: rule__Example__Group_7__0__Impl : ( '{' ) ;
    public final void rule__Example__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:776:1: ( ( '{' ) )
            // InternalMyDsl.g:777:1: ( '{' )
            {
            // InternalMyDsl.g:777:1: ( '{' )
            // InternalMyDsl.g:778:2: '{'
            {
             before(grammarAccess.getExampleAccess().getLeftCurlyBracketKeyword_7_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getLeftCurlyBracketKeyword_7_0()); 

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
    // $ANTLR end "rule__Example__Group_7__0__Impl"


    // $ANTLR start "rule__Example__Group_7__1"
    // InternalMyDsl.g:787:1: rule__Example__Group_7__1 : rule__Example__Group_7__1__Impl rule__Example__Group_7__2 ;
    public final void rule__Example__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( rule__Example__Group_7__1__Impl rule__Example__Group_7__2 )
            // InternalMyDsl.g:792:2: rule__Example__Group_7__1__Impl rule__Example__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Example__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_7__2();

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
    // $ANTLR end "rule__Example__Group_7__1"


    // $ANTLR start "rule__Example__Group_7__1__Impl"
    // InternalMyDsl.g:799:1: rule__Example__Group_7__1__Impl : ( ( rule__Example__ContenidoAssignment_7_1 ) ) ;
    public final void rule__Example__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:803:1: ( ( ( rule__Example__ContenidoAssignment_7_1 ) ) )
            // InternalMyDsl.g:804:1: ( ( rule__Example__ContenidoAssignment_7_1 ) )
            {
            // InternalMyDsl.g:804:1: ( ( rule__Example__ContenidoAssignment_7_1 ) )
            // InternalMyDsl.g:805:2: ( rule__Example__ContenidoAssignment_7_1 )
            {
             before(grammarAccess.getExampleAccess().getContenidoAssignment_7_1()); 
            // InternalMyDsl.g:806:2: ( rule__Example__ContenidoAssignment_7_1 )
            // InternalMyDsl.g:806:3: rule__Example__ContenidoAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__ContenidoAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getContenidoAssignment_7_1()); 

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
    // $ANTLR end "rule__Example__Group_7__1__Impl"


    // $ANTLR start "rule__Example__Group_7__2"
    // InternalMyDsl.g:814:1: rule__Example__Group_7__2 : rule__Example__Group_7__2__Impl rule__Example__Group_7__3 ;
    public final void rule__Example__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( rule__Example__Group_7__2__Impl rule__Example__Group_7__3 )
            // InternalMyDsl.g:819:2: rule__Example__Group_7__2__Impl rule__Example__Group_7__3
            {
            pushFollow(FOLLOW_12);
            rule__Example__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_7__3();

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
    // $ANTLR end "rule__Example__Group_7__2"


    // $ANTLR start "rule__Example__Group_7__2__Impl"
    // InternalMyDsl.g:826:1: rule__Example__Group_7__2__Impl : ( ( rule__Example__Group_7_2__0 )* ) ;
    public final void rule__Example__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:830:1: ( ( ( rule__Example__Group_7_2__0 )* ) )
            // InternalMyDsl.g:831:1: ( ( rule__Example__Group_7_2__0 )* )
            {
            // InternalMyDsl.g:831:1: ( ( rule__Example__Group_7_2__0 )* )
            // InternalMyDsl.g:832:2: ( rule__Example__Group_7_2__0 )*
            {
             before(grammarAccess.getExampleAccess().getGroup_7_2()); 
            // InternalMyDsl.g:833:2: ( rule__Example__Group_7_2__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:833:3: rule__Example__Group_7_2__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Example__Group_7_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getExampleAccess().getGroup_7_2()); 

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
    // $ANTLR end "rule__Example__Group_7__2__Impl"


    // $ANTLR start "rule__Example__Group_7__3"
    // InternalMyDsl.g:841:1: rule__Example__Group_7__3 : rule__Example__Group_7__3__Impl ;
    public final void rule__Example__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:845:1: ( rule__Example__Group_7__3__Impl )
            // InternalMyDsl.g:846:2: rule__Example__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_7__3__Impl();

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
    // $ANTLR end "rule__Example__Group_7__3"


    // $ANTLR start "rule__Example__Group_7__3__Impl"
    // InternalMyDsl.g:852:1: rule__Example__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Example__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:856:1: ( ( '}' ) )
            // InternalMyDsl.g:857:1: ( '}' )
            {
            // InternalMyDsl.g:857:1: ( '}' )
            // InternalMyDsl.g:858:2: '}'
            {
             before(grammarAccess.getExampleAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getRightCurlyBracketKeyword_7_3()); 

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
    // $ANTLR end "rule__Example__Group_7__3__Impl"


    // $ANTLR start "rule__Example__Group_7_2__0"
    // InternalMyDsl.g:868:1: rule__Example__Group_7_2__0 : rule__Example__Group_7_2__0__Impl rule__Example__Group_7_2__1 ;
    public final void rule__Example__Group_7_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( rule__Example__Group_7_2__0__Impl rule__Example__Group_7_2__1 )
            // InternalMyDsl.g:873:2: rule__Example__Group_7_2__0__Impl rule__Example__Group_7_2__1
            {
            pushFollow(FOLLOW_11);
            rule__Example__Group_7_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Example__Group_7_2__1();

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
    // $ANTLR end "rule__Example__Group_7_2__0"


    // $ANTLR start "rule__Example__Group_7_2__0__Impl"
    // InternalMyDsl.g:880:1: rule__Example__Group_7_2__0__Impl : ( ',' ) ;
    public final void rule__Example__Group_7_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:884:1: ( ( ',' ) )
            // InternalMyDsl.g:885:1: ( ',' )
            {
            // InternalMyDsl.g:885:1: ( ',' )
            // InternalMyDsl.g:886:2: ','
            {
             before(grammarAccess.getExampleAccess().getCommaKeyword_7_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getExampleAccess().getCommaKeyword_7_2_0()); 

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
    // $ANTLR end "rule__Example__Group_7_2__0__Impl"


    // $ANTLR start "rule__Example__Group_7_2__1"
    // InternalMyDsl.g:895:1: rule__Example__Group_7_2__1 : rule__Example__Group_7_2__1__Impl ;
    public final void rule__Example__Group_7_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( rule__Example__Group_7_2__1__Impl )
            // InternalMyDsl.g:900:2: rule__Example__Group_7_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Example__Group_7_2__1__Impl();

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
    // $ANTLR end "rule__Example__Group_7_2__1"


    // $ANTLR start "rule__Example__Group_7_2__1__Impl"
    // InternalMyDsl.g:906:1: rule__Example__Group_7_2__1__Impl : ( ( rule__Example__ContenidoAssignment_7_2_1 ) ) ;
    public final void rule__Example__Group_7_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:910:1: ( ( ( rule__Example__ContenidoAssignment_7_2_1 ) ) )
            // InternalMyDsl.g:911:1: ( ( rule__Example__ContenidoAssignment_7_2_1 ) )
            {
            // InternalMyDsl.g:911:1: ( ( rule__Example__ContenidoAssignment_7_2_1 ) )
            // InternalMyDsl.g:912:2: ( rule__Example__ContenidoAssignment_7_2_1 )
            {
             before(grammarAccess.getExampleAccess().getContenidoAssignment_7_2_1()); 
            // InternalMyDsl.g:913:2: ( rule__Example__ContenidoAssignment_7_2_1 )
            // InternalMyDsl.g:913:3: rule__Example__ContenidoAssignment_7_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Example__ContenidoAssignment_7_2_1();

            state._fsp--;


            }

             after(grammarAccess.getExampleAccess().getContenidoAssignment_7_2_1()); 

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
    // $ANTLR end "rule__Example__Group_7_2__1__Impl"


    // $ANTLR start "rule__Contenido__Group__0"
    // InternalMyDsl.g:922:1: rule__Contenido__Group__0 : rule__Contenido__Group__0__Impl rule__Contenido__Group__1 ;
    public final void rule__Contenido__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:926:1: ( rule__Contenido__Group__0__Impl rule__Contenido__Group__1 )
            // InternalMyDsl.g:927:2: rule__Contenido__Group__0__Impl rule__Contenido__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Contenido__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__1();

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
    // $ANTLR end "rule__Contenido__Group__0"


    // $ANTLR start "rule__Contenido__Group__0__Impl"
    // InternalMyDsl.g:934:1: rule__Contenido__Group__0__Impl : ( () ) ;
    public final void rule__Contenido__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:938:1: ( ( () ) )
            // InternalMyDsl.g:939:1: ( () )
            {
            // InternalMyDsl.g:939:1: ( () )
            // InternalMyDsl.g:940:2: ()
            {
             before(grammarAccess.getContenidoAccess().getContenidoAction_0()); 
            // InternalMyDsl.g:941:2: ()
            // InternalMyDsl.g:941:3: 
            {
            }

             after(grammarAccess.getContenidoAccess().getContenidoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Contenido__Group__0__Impl"


    // $ANTLR start "rule__Contenido__Group__1"
    // InternalMyDsl.g:949:1: rule__Contenido__Group__1 : rule__Contenido__Group__1__Impl rule__Contenido__Group__2 ;
    public final void rule__Contenido__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( rule__Contenido__Group__1__Impl rule__Contenido__Group__2 )
            // InternalMyDsl.g:954:2: rule__Contenido__Group__1__Impl rule__Contenido__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Contenido__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__2();

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
    // $ANTLR end "rule__Contenido__Group__1"


    // $ANTLR start "rule__Contenido__Group__1__Impl"
    // InternalMyDsl.g:961:1: rule__Contenido__Group__1__Impl : ( 'Contenido' ) ;
    public final void rule__Contenido__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:965:1: ( ( 'Contenido' ) )
            // InternalMyDsl.g:966:1: ( 'Contenido' )
            {
            // InternalMyDsl.g:966:1: ( 'Contenido' )
            // InternalMyDsl.g:967:2: 'Contenido'
            {
             before(grammarAccess.getContenidoAccess().getContenidoKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getContenidoKeyword_1()); 

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
    // $ANTLR end "rule__Contenido__Group__1__Impl"


    // $ANTLR start "rule__Contenido__Group__2"
    // InternalMyDsl.g:976:1: rule__Contenido__Group__2 : rule__Contenido__Group__2__Impl rule__Contenido__Group__3 ;
    public final void rule__Contenido__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( rule__Contenido__Group__2__Impl rule__Contenido__Group__3 )
            // InternalMyDsl.g:981:2: rule__Contenido__Group__2__Impl rule__Contenido__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Contenido__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__3();

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
    // $ANTLR end "rule__Contenido__Group__2"


    // $ANTLR start "rule__Contenido__Group__2__Impl"
    // InternalMyDsl.g:988:1: rule__Contenido__Group__2__Impl : ( ( rule__Contenido__NameAssignment_2 ) ) ;
    public final void rule__Contenido__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:992:1: ( ( ( rule__Contenido__NameAssignment_2 ) ) )
            // InternalMyDsl.g:993:1: ( ( rule__Contenido__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:993:1: ( ( rule__Contenido__NameAssignment_2 ) )
            // InternalMyDsl.g:994:2: ( rule__Contenido__NameAssignment_2 )
            {
             before(grammarAccess.getContenidoAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:995:2: ( rule__Contenido__NameAssignment_2 )
            // InternalMyDsl.g:995:3: rule__Contenido__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Contenido__Group__2__Impl"


    // $ANTLR start "rule__Contenido__Group__3"
    // InternalMyDsl.g:1003:1: rule__Contenido__Group__3 : rule__Contenido__Group__3__Impl rule__Contenido__Group__4 ;
    public final void rule__Contenido__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1007:1: ( rule__Contenido__Group__3__Impl rule__Contenido__Group__4 )
            // InternalMyDsl.g:1008:2: rule__Contenido__Group__3__Impl rule__Contenido__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__Contenido__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__4();

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
    // $ANTLR end "rule__Contenido__Group__3"


    // $ANTLR start "rule__Contenido__Group__3__Impl"
    // InternalMyDsl.g:1015:1: rule__Contenido__Group__3__Impl : ( '{' ) ;
    public final void rule__Contenido__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1019:1: ( ( '{' ) )
            // InternalMyDsl.g:1020:1: ( '{' )
            {
            // InternalMyDsl.g:1020:1: ( '{' )
            // InternalMyDsl.g:1021:2: '{'
            {
             before(grammarAccess.getContenidoAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Contenido__Group__3__Impl"


    // $ANTLR start "rule__Contenido__Group__4"
    // InternalMyDsl.g:1030:1: rule__Contenido__Group__4 : rule__Contenido__Group__4__Impl rule__Contenido__Group__5 ;
    public final void rule__Contenido__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( rule__Contenido__Group__4__Impl rule__Contenido__Group__5 )
            // InternalMyDsl.g:1035:2: rule__Contenido__Group__4__Impl rule__Contenido__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__Contenido__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__5();

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
    // $ANTLR end "rule__Contenido__Group__4"


    // $ANTLR start "rule__Contenido__Group__4__Impl"
    // InternalMyDsl.g:1042:1: rule__Contenido__Group__4__Impl : ( ( rule__Contenido__Group_4__0 )? ) ;
    public final void rule__Contenido__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1046:1: ( ( ( rule__Contenido__Group_4__0 )? ) )
            // InternalMyDsl.g:1047:1: ( ( rule__Contenido__Group_4__0 )? )
            {
            // InternalMyDsl.g:1047:1: ( ( rule__Contenido__Group_4__0 )? )
            // InternalMyDsl.g:1048:2: ( rule__Contenido__Group_4__0 )?
            {
             before(grammarAccess.getContenidoAccess().getGroup_4()); 
            // InternalMyDsl.g:1049:2: ( rule__Contenido__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1049:3: rule__Contenido__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Contenido__Group__4__Impl"


    // $ANTLR start "rule__Contenido__Group__5"
    // InternalMyDsl.g:1057:1: rule__Contenido__Group__5 : rule__Contenido__Group__5__Impl rule__Contenido__Group__6 ;
    public final void rule__Contenido__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( rule__Contenido__Group__5__Impl rule__Contenido__Group__6 )
            // InternalMyDsl.g:1062:2: rule__Contenido__Group__5__Impl rule__Contenido__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__Contenido__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group__6();

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
    // $ANTLR end "rule__Contenido__Group__5"


    // $ANTLR start "rule__Contenido__Group__5__Impl"
    // InternalMyDsl.g:1069:1: rule__Contenido__Group__5__Impl : ( ( rule__Contenido__Group_5__0 )? ) ;
    public final void rule__Contenido__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1073:1: ( ( ( rule__Contenido__Group_5__0 )? ) )
            // InternalMyDsl.g:1074:1: ( ( rule__Contenido__Group_5__0 )? )
            {
            // InternalMyDsl.g:1074:1: ( ( rule__Contenido__Group_5__0 )? )
            // InternalMyDsl.g:1075:2: ( rule__Contenido__Group_5__0 )?
            {
             before(grammarAccess.getContenidoAccess().getGroup_5()); 
            // InternalMyDsl.g:1076:2: ( rule__Contenido__Group_5__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1076:3: rule__Contenido__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Contenido__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContenidoAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Contenido__Group__5__Impl"


    // $ANTLR start "rule__Contenido__Group__6"
    // InternalMyDsl.g:1084:1: rule__Contenido__Group__6 : rule__Contenido__Group__6__Impl ;
    public final void rule__Contenido__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( rule__Contenido__Group__6__Impl )
            // InternalMyDsl.g:1089:2: rule__Contenido__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group__6__Impl();

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
    // $ANTLR end "rule__Contenido__Group__6"


    // $ANTLR start "rule__Contenido__Group__6__Impl"
    // InternalMyDsl.g:1095:1: rule__Contenido__Group__6__Impl : ( '}' ) ;
    public final void rule__Contenido__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1099:1: ( ( '}' ) )
            // InternalMyDsl.g:1100:1: ( '}' )
            {
            // InternalMyDsl.g:1100:1: ( '}' )
            // InternalMyDsl.g:1101:2: '}'
            {
             before(grammarAccess.getContenidoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Contenido__Group__6__Impl"


    // $ANTLR start "rule__Contenido__Group_4__0"
    // InternalMyDsl.g:1111:1: rule__Contenido__Group_4__0 : rule__Contenido__Group_4__0__Impl rule__Contenido__Group_4__1 ;
    public final void rule__Contenido__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( rule__Contenido__Group_4__0__Impl rule__Contenido__Group_4__1 )
            // InternalMyDsl.g:1116:2: rule__Contenido__Group_4__0__Impl rule__Contenido__Group_4__1
            {
            pushFollow(FOLLOW_14);
            rule__Contenido__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_4__1();

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
    // $ANTLR end "rule__Contenido__Group_4__0"


    // $ANTLR start "rule__Contenido__Group_4__0__Impl"
    // InternalMyDsl.g:1123:1: rule__Contenido__Group_4__0__Impl : ( 'tipo' ) ;
    public final void rule__Contenido__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1127:1: ( ( 'tipo' ) )
            // InternalMyDsl.g:1128:1: ( 'tipo' )
            {
            // InternalMyDsl.g:1128:1: ( 'tipo' )
            // InternalMyDsl.g:1129:2: 'tipo'
            {
             before(grammarAccess.getContenidoAccess().getTipoKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getTipoKeyword_4_0()); 

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
    // $ANTLR end "rule__Contenido__Group_4__0__Impl"


    // $ANTLR start "rule__Contenido__Group_4__1"
    // InternalMyDsl.g:1138:1: rule__Contenido__Group_4__1 : rule__Contenido__Group_4__1__Impl ;
    public final void rule__Contenido__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( rule__Contenido__Group_4__1__Impl )
            // InternalMyDsl.g:1143:2: rule__Contenido__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group_4__1__Impl();

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
    // $ANTLR end "rule__Contenido__Group_4__1"


    // $ANTLR start "rule__Contenido__Group_4__1__Impl"
    // InternalMyDsl.g:1149:1: rule__Contenido__Group_4__1__Impl : ( ( rule__Contenido__TipoAssignment_4_1 ) ) ;
    public final void rule__Contenido__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1153:1: ( ( ( rule__Contenido__TipoAssignment_4_1 ) ) )
            // InternalMyDsl.g:1154:1: ( ( rule__Contenido__TipoAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1154:1: ( ( rule__Contenido__TipoAssignment_4_1 ) )
            // InternalMyDsl.g:1155:2: ( rule__Contenido__TipoAssignment_4_1 )
            {
             before(grammarAccess.getContenidoAccess().getTipoAssignment_4_1()); 
            // InternalMyDsl.g:1156:2: ( rule__Contenido__TipoAssignment_4_1 )
            // InternalMyDsl.g:1156:3: rule__Contenido__TipoAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__TipoAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getTipoAssignment_4_1()); 

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
    // $ANTLR end "rule__Contenido__Group_4__1__Impl"


    // $ANTLR start "rule__Contenido__Group_5__0"
    // InternalMyDsl.g:1165:1: rule__Contenido__Group_5__0 : rule__Contenido__Group_5__0__Impl rule__Contenido__Group_5__1 ;
    public final void rule__Contenido__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1169:1: ( rule__Contenido__Group_5__0__Impl rule__Contenido__Group_5__1 )
            // InternalMyDsl.g:1170:2: rule__Contenido__Group_5__0__Impl rule__Contenido__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Contenido__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5__1();

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
    // $ANTLR end "rule__Contenido__Group_5__0"


    // $ANTLR start "rule__Contenido__Group_5__0__Impl"
    // InternalMyDsl.g:1177:1: rule__Contenido__Group_5__0__Impl : ( 'relacionado' ) ;
    public final void rule__Contenido__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1181:1: ( ( 'relacionado' ) )
            // InternalMyDsl.g:1182:1: ( 'relacionado' )
            {
            // InternalMyDsl.g:1182:1: ( 'relacionado' )
            // InternalMyDsl.g:1183:2: 'relacionado'
            {
             before(grammarAccess.getContenidoAccess().getRelacionadoKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getRelacionadoKeyword_5_0()); 

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
    // $ANTLR end "rule__Contenido__Group_5__0__Impl"


    // $ANTLR start "rule__Contenido__Group_5__1"
    // InternalMyDsl.g:1192:1: rule__Contenido__Group_5__1 : rule__Contenido__Group_5__1__Impl rule__Contenido__Group_5__2 ;
    public final void rule__Contenido__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( rule__Contenido__Group_5__1__Impl rule__Contenido__Group_5__2 )
            // InternalMyDsl.g:1197:2: rule__Contenido__Group_5__1__Impl rule__Contenido__Group_5__2
            {
            pushFollow(FOLLOW_15);
            rule__Contenido__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5__2();

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
    // $ANTLR end "rule__Contenido__Group_5__1"


    // $ANTLR start "rule__Contenido__Group_5__1__Impl"
    // InternalMyDsl.g:1204:1: rule__Contenido__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Contenido__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1208:1: ( ( '{' ) )
            // InternalMyDsl.g:1209:1: ( '{' )
            {
            // InternalMyDsl.g:1209:1: ( '{' )
            // InternalMyDsl.g:1210:2: '{'
            {
             before(grammarAccess.getContenidoAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Contenido__Group_5__1__Impl"


    // $ANTLR start "rule__Contenido__Group_5__2"
    // InternalMyDsl.g:1219:1: rule__Contenido__Group_5__2 : rule__Contenido__Group_5__2__Impl rule__Contenido__Group_5__3 ;
    public final void rule__Contenido__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( rule__Contenido__Group_5__2__Impl rule__Contenido__Group_5__3 )
            // InternalMyDsl.g:1224:2: rule__Contenido__Group_5__2__Impl rule__Contenido__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Contenido__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5__3();

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
    // $ANTLR end "rule__Contenido__Group_5__2"


    // $ANTLR start "rule__Contenido__Group_5__2__Impl"
    // InternalMyDsl.g:1231:1: rule__Contenido__Group_5__2__Impl : ( ( rule__Contenido__RelacionadoAssignment_5_2 ) ) ;
    public final void rule__Contenido__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1235:1: ( ( ( rule__Contenido__RelacionadoAssignment_5_2 ) ) )
            // InternalMyDsl.g:1236:1: ( ( rule__Contenido__RelacionadoAssignment_5_2 ) )
            {
            // InternalMyDsl.g:1236:1: ( ( rule__Contenido__RelacionadoAssignment_5_2 ) )
            // InternalMyDsl.g:1237:2: ( rule__Contenido__RelacionadoAssignment_5_2 )
            {
             before(grammarAccess.getContenidoAccess().getRelacionadoAssignment_5_2()); 
            // InternalMyDsl.g:1238:2: ( rule__Contenido__RelacionadoAssignment_5_2 )
            // InternalMyDsl.g:1238:3: rule__Contenido__RelacionadoAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__RelacionadoAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getRelacionadoAssignment_5_2()); 

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
    // $ANTLR end "rule__Contenido__Group_5__2__Impl"


    // $ANTLR start "rule__Contenido__Group_5__3"
    // InternalMyDsl.g:1246:1: rule__Contenido__Group_5__3 : rule__Contenido__Group_5__3__Impl rule__Contenido__Group_5__4 ;
    public final void rule__Contenido__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( rule__Contenido__Group_5__3__Impl rule__Contenido__Group_5__4 )
            // InternalMyDsl.g:1251:2: rule__Contenido__Group_5__3__Impl rule__Contenido__Group_5__4
            {
            pushFollow(FOLLOW_12);
            rule__Contenido__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5__4();

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
    // $ANTLR end "rule__Contenido__Group_5__3"


    // $ANTLR start "rule__Contenido__Group_5__3__Impl"
    // InternalMyDsl.g:1258:1: rule__Contenido__Group_5__3__Impl : ( ( rule__Contenido__Group_5_3__0 )* ) ;
    public final void rule__Contenido__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1262:1: ( ( ( rule__Contenido__Group_5_3__0 )* ) )
            // InternalMyDsl.g:1263:1: ( ( rule__Contenido__Group_5_3__0 )* )
            {
            // InternalMyDsl.g:1263:1: ( ( rule__Contenido__Group_5_3__0 )* )
            // InternalMyDsl.g:1264:2: ( rule__Contenido__Group_5_3__0 )*
            {
             before(grammarAccess.getContenidoAccess().getGroup_5_3()); 
            // InternalMyDsl.g:1265:2: ( rule__Contenido__Group_5_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==24) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1265:3: rule__Contenido__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Contenido__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getContenidoAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Contenido__Group_5__3__Impl"


    // $ANTLR start "rule__Contenido__Group_5__4"
    // InternalMyDsl.g:1273:1: rule__Contenido__Group_5__4 : rule__Contenido__Group_5__4__Impl ;
    public final void rule__Contenido__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1277:1: ( rule__Contenido__Group_5__4__Impl )
            // InternalMyDsl.g:1278:2: rule__Contenido__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5__4__Impl();

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
    // $ANTLR end "rule__Contenido__Group_5__4"


    // $ANTLR start "rule__Contenido__Group_5__4__Impl"
    // InternalMyDsl.g:1284:1: rule__Contenido__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Contenido__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( '}' ) )
            // InternalMyDsl.g:1289:1: ( '}' )
            {
            // InternalMyDsl.g:1289:1: ( '}' )
            // InternalMyDsl.g:1290:2: '}'
            {
             before(grammarAccess.getContenidoAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Contenido__Group_5__4__Impl"


    // $ANTLR start "rule__Contenido__Group_5_3__0"
    // InternalMyDsl.g:1300:1: rule__Contenido__Group_5_3__0 : rule__Contenido__Group_5_3__0__Impl rule__Contenido__Group_5_3__1 ;
    public final void rule__Contenido__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( rule__Contenido__Group_5_3__0__Impl rule__Contenido__Group_5_3__1 )
            // InternalMyDsl.g:1305:2: rule__Contenido__Group_5_3__0__Impl rule__Contenido__Group_5_3__1
            {
            pushFollow(FOLLOW_15);
            rule__Contenido__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5_3__1();

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
    // $ANTLR end "rule__Contenido__Group_5_3__0"


    // $ANTLR start "rule__Contenido__Group_5_3__0__Impl"
    // InternalMyDsl.g:1312:1: rule__Contenido__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Contenido__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1316:1: ( ( ',' ) )
            // InternalMyDsl.g:1317:1: ( ',' )
            {
            // InternalMyDsl.g:1317:1: ( ',' )
            // InternalMyDsl.g:1318:2: ','
            {
             before(grammarAccess.getContenidoAccess().getCommaKeyword_5_3_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getContenidoAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Contenido__Group_5_3__0__Impl"


    // $ANTLR start "rule__Contenido__Group_5_3__1"
    // InternalMyDsl.g:1327:1: rule__Contenido__Group_5_3__1 : rule__Contenido__Group_5_3__1__Impl ;
    public final void rule__Contenido__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1331:1: ( rule__Contenido__Group_5_3__1__Impl )
            // InternalMyDsl.g:1332:2: rule__Contenido__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Contenido__Group_5_3__1"


    // $ANTLR start "rule__Contenido__Group_5_3__1__Impl"
    // InternalMyDsl.g:1338:1: rule__Contenido__Group_5_3__1__Impl : ( ( rule__Contenido__RelacionadoAssignment_5_3_1 ) ) ;
    public final void rule__Contenido__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1342:1: ( ( ( rule__Contenido__RelacionadoAssignment_5_3_1 ) ) )
            // InternalMyDsl.g:1343:1: ( ( rule__Contenido__RelacionadoAssignment_5_3_1 ) )
            {
            // InternalMyDsl.g:1343:1: ( ( rule__Contenido__RelacionadoAssignment_5_3_1 ) )
            // InternalMyDsl.g:1344:2: ( rule__Contenido__RelacionadoAssignment_5_3_1 )
            {
             before(grammarAccess.getContenidoAccess().getRelacionadoAssignment_5_3_1()); 
            // InternalMyDsl.g:1345:2: ( rule__Contenido__RelacionadoAssignment_5_3_1 )
            // InternalMyDsl.g:1345:3: rule__Contenido__RelacionadoAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Contenido__RelacionadoAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContenidoAccess().getRelacionadoAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Contenido__Group_5_3__1__Impl"


    // $ANTLR start "rule__Relacionado__Group__0"
    // InternalMyDsl.g:1354:1: rule__Relacionado__Group__0 : rule__Relacionado__Group__0__Impl rule__Relacionado__Group__1 ;
    public final void rule__Relacionado__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( rule__Relacionado__Group__0__Impl rule__Relacionado__Group__1 )
            // InternalMyDsl.g:1359:2: rule__Relacionado__Group__0__Impl rule__Relacionado__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Relacionado__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__1();

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
    // $ANTLR end "rule__Relacionado__Group__0"


    // $ANTLR start "rule__Relacionado__Group__0__Impl"
    // InternalMyDsl.g:1366:1: rule__Relacionado__Group__0__Impl : ( () ) ;
    public final void rule__Relacionado__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1370:1: ( ( () ) )
            // InternalMyDsl.g:1371:1: ( () )
            {
            // InternalMyDsl.g:1371:1: ( () )
            // InternalMyDsl.g:1372:2: ()
            {
             before(grammarAccess.getRelacionadoAccess().getRelacionadoAction_0()); 
            // InternalMyDsl.g:1373:2: ()
            // InternalMyDsl.g:1373:3: 
            {
            }

             after(grammarAccess.getRelacionadoAccess().getRelacionadoAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relacionado__Group__0__Impl"


    // $ANTLR start "rule__Relacionado__Group__1"
    // InternalMyDsl.g:1381:1: rule__Relacionado__Group__1 : rule__Relacionado__Group__1__Impl rule__Relacionado__Group__2 ;
    public final void rule__Relacionado__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( rule__Relacionado__Group__1__Impl rule__Relacionado__Group__2 )
            // InternalMyDsl.g:1386:2: rule__Relacionado__Group__1__Impl rule__Relacionado__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Relacionado__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__2();

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
    // $ANTLR end "rule__Relacionado__Group__1"


    // $ANTLR start "rule__Relacionado__Group__1__Impl"
    // InternalMyDsl.g:1393:1: rule__Relacionado__Group__1__Impl : ( ( rule__Relacionado__ActivoAssignment_1 )? ) ;
    public final void rule__Relacionado__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1397:1: ( ( ( rule__Relacionado__ActivoAssignment_1 )? ) )
            // InternalMyDsl.g:1398:1: ( ( rule__Relacionado__ActivoAssignment_1 )? )
            {
            // InternalMyDsl.g:1398:1: ( ( rule__Relacionado__ActivoAssignment_1 )? )
            // InternalMyDsl.g:1399:2: ( rule__Relacionado__ActivoAssignment_1 )?
            {
             before(grammarAccess.getRelacionadoAccess().getActivoAssignment_1()); 
            // InternalMyDsl.g:1400:2: ( rule__Relacionado__ActivoAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1400:3: rule__Relacionado__ActivoAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relacionado__ActivoAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelacionadoAccess().getActivoAssignment_1()); 

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
    // $ANTLR end "rule__Relacionado__Group__1__Impl"


    // $ANTLR start "rule__Relacionado__Group__2"
    // InternalMyDsl.g:1408:1: rule__Relacionado__Group__2 : rule__Relacionado__Group__2__Impl rule__Relacionado__Group__3 ;
    public final void rule__Relacionado__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( rule__Relacionado__Group__2__Impl rule__Relacionado__Group__3 )
            // InternalMyDsl.g:1413:2: rule__Relacionado__Group__2__Impl rule__Relacionado__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Relacionado__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__3();

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
    // $ANTLR end "rule__Relacionado__Group__2"


    // $ANTLR start "rule__Relacionado__Group__2__Impl"
    // InternalMyDsl.g:1420:1: rule__Relacionado__Group__2__Impl : ( 'Relacionado' ) ;
    public final void rule__Relacionado__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1424:1: ( ( 'Relacionado' ) )
            // InternalMyDsl.g:1425:1: ( 'Relacionado' )
            {
            // InternalMyDsl.g:1425:1: ( 'Relacionado' )
            // InternalMyDsl.g:1426:2: 'Relacionado'
            {
             before(grammarAccess.getRelacionadoAccess().getRelacionadoKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRelacionadoAccess().getRelacionadoKeyword_2()); 

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
    // $ANTLR end "rule__Relacionado__Group__2__Impl"


    // $ANTLR start "rule__Relacionado__Group__3"
    // InternalMyDsl.g:1435:1: rule__Relacionado__Group__3 : rule__Relacionado__Group__3__Impl rule__Relacionado__Group__4 ;
    public final void rule__Relacionado__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( rule__Relacionado__Group__3__Impl rule__Relacionado__Group__4 )
            // InternalMyDsl.g:1440:2: rule__Relacionado__Group__3__Impl rule__Relacionado__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Relacionado__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__4();

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
    // $ANTLR end "rule__Relacionado__Group__3"


    // $ANTLR start "rule__Relacionado__Group__3__Impl"
    // InternalMyDsl.g:1447:1: rule__Relacionado__Group__3__Impl : ( ( rule__Relacionado__NameAssignment_3 ) ) ;
    public final void rule__Relacionado__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1451:1: ( ( ( rule__Relacionado__NameAssignment_3 ) ) )
            // InternalMyDsl.g:1452:1: ( ( rule__Relacionado__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:1452:1: ( ( rule__Relacionado__NameAssignment_3 ) )
            // InternalMyDsl.g:1453:2: ( rule__Relacionado__NameAssignment_3 )
            {
             before(grammarAccess.getRelacionadoAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:1454:2: ( rule__Relacionado__NameAssignment_3 )
            // InternalMyDsl.g:1454:3: rule__Relacionado__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Relacionado__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRelacionadoAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Relacionado__Group__3__Impl"


    // $ANTLR start "rule__Relacionado__Group__4"
    // InternalMyDsl.g:1462:1: rule__Relacionado__Group__4 : rule__Relacionado__Group__4__Impl rule__Relacionado__Group__5 ;
    public final void rule__Relacionado__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( rule__Relacionado__Group__4__Impl rule__Relacionado__Group__5 )
            // InternalMyDsl.g:1467:2: rule__Relacionado__Group__4__Impl rule__Relacionado__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Relacionado__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__5();

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
    // $ANTLR end "rule__Relacionado__Group__4"


    // $ANTLR start "rule__Relacionado__Group__4__Impl"
    // InternalMyDsl.g:1474:1: rule__Relacionado__Group__4__Impl : ( '{' ) ;
    public final void rule__Relacionado__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1478:1: ( ( '{' ) )
            // InternalMyDsl.g:1479:1: ( '{' )
            {
            // InternalMyDsl.g:1479:1: ( '{' )
            // InternalMyDsl.g:1480:2: '{'
            {
             before(grammarAccess.getRelacionadoAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRelacionadoAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Relacionado__Group__4__Impl"


    // $ANTLR start "rule__Relacionado__Group__5"
    // InternalMyDsl.g:1489:1: rule__Relacionado__Group__5 : rule__Relacionado__Group__5__Impl rule__Relacionado__Group__6 ;
    public final void rule__Relacionado__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( rule__Relacionado__Group__5__Impl rule__Relacionado__Group__6 )
            // InternalMyDsl.g:1494:2: rule__Relacionado__Group__5__Impl rule__Relacionado__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Relacionado__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__6();

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
    // $ANTLR end "rule__Relacionado__Group__5"


    // $ANTLR start "rule__Relacionado__Group__5__Impl"
    // InternalMyDsl.g:1501:1: rule__Relacionado__Group__5__Impl : ( ( rule__Relacionado__Group_5__0 )? ) ;
    public final void rule__Relacionado__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1505:1: ( ( ( rule__Relacionado__Group_5__0 )? ) )
            // InternalMyDsl.g:1506:1: ( ( rule__Relacionado__Group_5__0 )? )
            {
            // InternalMyDsl.g:1506:1: ( ( rule__Relacionado__Group_5__0 )? )
            // InternalMyDsl.g:1507:2: ( rule__Relacionado__Group_5__0 )?
            {
             before(grammarAccess.getRelacionadoAccess().getGroup_5()); 
            // InternalMyDsl.g:1508:2: ( rule__Relacionado__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1508:3: rule__Relacionado__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relacionado__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelacionadoAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Relacionado__Group__5__Impl"


    // $ANTLR start "rule__Relacionado__Group__6"
    // InternalMyDsl.g:1516:1: rule__Relacionado__Group__6 : rule__Relacionado__Group__6__Impl ;
    public final void rule__Relacionado__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( rule__Relacionado__Group__6__Impl )
            // InternalMyDsl.g:1521:2: rule__Relacionado__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relacionado__Group__6__Impl();

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
    // $ANTLR end "rule__Relacionado__Group__6"


    // $ANTLR start "rule__Relacionado__Group__6__Impl"
    // InternalMyDsl.g:1527:1: rule__Relacionado__Group__6__Impl : ( '}' ) ;
    public final void rule__Relacionado__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1531:1: ( ( '}' ) )
            // InternalMyDsl.g:1532:1: ( '}' )
            {
            // InternalMyDsl.g:1532:1: ( '}' )
            // InternalMyDsl.g:1533:2: '}'
            {
             before(grammarAccess.getRelacionadoAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRelacionadoAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Relacionado__Group__6__Impl"


    // $ANTLR start "rule__Relacionado__Group_5__0"
    // InternalMyDsl.g:1543:1: rule__Relacionado__Group_5__0 : rule__Relacionado__Group_5__0__Impl rule__Relacionado__Group_5__1 ;
    public final void rule__Relacionado__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( rule__Relacionado__Group_5__0__Impl rule__Relacionado__Group_5__1 )
            // InternalMyDsl.g:1548:2: rule__Relacionado__Group_5__0__Impl rule__Relacionado__Group_5__1
            {
            pushFollow(FOLLOW_17);
            rule__Relacionado__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relacionado__Group_5__1();

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
    // $ANTLR end "rule__Relacionado__Group_5__0"


    // $ANTLR start "rule__Relacionado__Group_5__0__Impl"
    // InternalMyDsl.g:1555:1: rule__Relacionado__Group_5__0__Impl : ( 'numero' ) ;
    public final void rule__Relacionado__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1559:1: ( ( 'numero' ) )
            // InternalMyDsl.g:1560:1: ( 'numero' )
            {
            // InternalMyDsl.g:1560:1: ( 'numero' )
            // InternalMyDsl.g:1561:2: 'numero'
            {
             before(grammarAccess.getRelacionadoAccess().getNumeroKeyword_5_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRelacionadoAccess().getNumeroKeyword_5_0()); 

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
    // $ANTLR end "rule__Relacionado__Group_5__0__Impl"


    // $ANTLR start "rule__Relacionado__Group_5__1"
    // InternalMyDsl.g:1570:1: rule__Relacionado__Group_5__1 : rule__Relacionado__Group_5__1__Impl ;
    public final void rule__Relacionado__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1574:1: ( rule__Relacionado__Group_5__1__Impl )
            // InternalMyDsl.g:1575:2: rule__Relacionado__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relacionado__Group_5__1__Impl();

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
    // $ANTLR end "rule__Relacionado__Group_5__1"


    // $ANTLR start "rule__Relacionado__Group_5__1__Impl"
    // InternalMyDsl.g:1581:1: rule__Relacionado__Group_5__1__Impl : ( ( rule__Relacionado__NumeroAssignment_5_1 ) ) ;
    public final void rule__Relacionado__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1585:1: ( ( ( rule__Relacionado__NumeroAssignment_5_1 ) ) )
            // InternalMyDsl.g:1586:1: ( ( rule__Relacionado__NumeroAssignment_5_1 ) )
            {
            // InternalMyDsl.g:1586:1: ( ( rule__Relacionado__NumeroAssignment_5_1 ) )
            // InternalMyDsl.g:1587:2: ( rule__Relacionado__NumeroAssignment_5_1 )
            {
             before(grammarAccess.getRelacionadoAccess().getNumeroAssignment_5_1()); 
            // InternalMyDsl.g:1588:2: ( rule__Relacionado__NumeroAssignment_5_1 )
            // InternalMyDsl.g:1588:3: rule__Relacionado__NumeroAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Relacionado__NumeroAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getRelacionadoAccess().getNumeroAssignment_5_1()); 

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
    // $ANTLR end "rule__Relacionado__Group_5__1__Impl"


    // $ANTLR start "rule__EBigInteger__Group__0"
    // InternalMyDsl.g:1597:1: rule__EBigInteger__Group__0 : rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 ;
    public final void rule__EBigInteger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1 )
            // InternalMyDsl.g:1602:2: rule__EBigInteger__Group__0__Impl rule__EBigInteger__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EBigInteger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EBigInteger__Group__1();

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
    // $ANTLR end "rule__EBigInteger__Group__0"


    // $ANTLR start "rule__EBigInteger__Group__0__Impl"
    // InternalMyDsl.g:1609:1: rule__EBigInteger__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EBigInteger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1613:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:1614:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:1614:1: ( ( '-' )? )
            // InternalMyDsl.g:1615:2: ( '-' )?
            {
             before(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:1616:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==29) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1616:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEBigIntegerAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EBigInteger__Group__0__Impl"


    // $ANTLR start "rule__EBigInteger__Group__1"
    // InternalMyDsl.g:1624:1: rule__EBigInteger__Group__1 : rule__EBigInteger__Group__1__Impl ;
    public final void rule__EBigInteger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1628:1: ( rule__EBigInteger__Group__1__Impl )
            // InternalMyDsl.g:1629:2: rule__EBigInteger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EBigInteger__Group__1__Impl();

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
    // $ANTLR end "rule__EBigInteger__Group__1"


    // $ANTLR start "rule__EBigInteger__Group__1__Impl"
    // InternalMyDsl.g:1635:1: rule__EBigInteger__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EBigInteger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1639:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1640:1: ( RULE_INT )
            {
            // InternalMyDsl.g:1640:1: ( RULE_INT )
            // InternalMyDsl.g:1641:2: RULE_INT
            {
             before(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEBigIntegerAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EBigInteger__Group__1__Impl"


    // $ANTLR start "rule__Example__NameAssignment_3"
    // InternalMyDsl.g:1651:1: rule__Example__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Example__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1656:2: ( ruleEString )
            {
            // InternalMyDsl.g:1656:2: ( ruleEString )
            // InternalMyDsl.g:1657:3: ruleEString
            {
             before(grammarAccess.getExampleAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Example__NameAssignment_3"


    // $ANTLR start "rule__Example__DescriptionAssignment_5_1"
    // InternalMyDsl.g:1666:1: rule__Example__DescriptionAssignment_5_1 : ( ruleEString ) ;
    public final void rule__Example__DescriptionAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1671:2: ( ruleEString )
            {
            // InternalMyDsl.g:1671:2: ( ruleEString )
            // InternalMyDsl.g:1672:3: ruleEString
            {
             before(grammarAccess.getExampleAccess().getDescriptionEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getDescriptionEStringParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Example__DescriptionAssignment_5_1"


    // $ANTLR start "rule__Example__RelacionadoAssignment_6_2"
    // InternalMyDsl.g:1681:1: rule__Example__RelacionadoAssignment_6_2 : ( ( ruleEString ) ) ;
    public final void rule__Example__RelacionadoAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1685:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1686:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1686:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1687:3: ( ruleEString )
            {
             before(grammarAccess.getExampleAccess().getRelacionadoRelacionadoCrossReference_6_2_0()); 
            // InternalMyDsl.g:1688:3: ( ruleEString )
            // InternalMyDsl.g:1689:4: ruleEString
            {
             before(grammarAccess.getExampleAccess().getRelacionadoRelacionadoEStringParserRuleCall_6_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getRelacionadoRelacionadoEStringParserRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getExampleAccess().getRelacionadoRelacionadoCrossReference_6_2_0()); 

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
    // $ANTLR end "rule__Example__RelacionadoAssignment_6_2"


    // $ANTLR start "rule__Example__RelacionadoAssignment_6_3_1"
    // InternalMyDsl.g:1700:1: rule__Example__RelacionadoAssignment_6_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Example__RelacionadoAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( ruleEString ) ) )
            // InternalMyDsl.g:1705:2: ( ( ruleEString ) )
            {
            // InternalMyDsl.g:1705:2: ( ( ruleEString ) )
            // InternalMyDsl.g:1706:3: ( ruleEString )
            {
             before(grammarAccess.getExampleAccess().getRelacionadoRelacionadoCrossReference_6_3_1_0()); 
            // InternalMyDsl.g:1707:3: ( ruleEString )
            // InternalMyDsl.g:1708:4: ruleEString
            {
             before(grammarAccess.getExampleAccess().getRelacionadoRelacionadoEStringParserRuleCall_6_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getRelacionadoRelacionadoEStringParserRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getExampleAccess().getRelacionadoRelacionadoCrossReference_6_3_1_0()); 

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
    // $ANTLR end "rule__Example__RelacionadoAssignment_6_3_1"


    // $ANTLR start "rule__Example__ContenidoAssignment_7_1"
    // InternalMyDsl.g:1719:1: rule__Example__ContenidoAssignment_7_1 : ( ruleContenido ) ;
    public final void rule__Example__ContenidoAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( ruleContenido ) )
            // InternalMyDsl.g:1724:2: ( ruleContenido )
            {
            // InternalMyDsl.g:1724:2: ( ruleContenido )
            // InternalMyDsl.g:1725:3: ruleContenido
            {
             before(grammarAccess.getExampleAccess().getContenidoContenidoParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getContenidoContenidoParserRuleCall_7_1_0()); 

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
    // $ANTLR end "rule__Example__ContenidoAssignment_7_1"


    // $ANTLR start "rule__Example__ContenidoAssignment_7_2_1"
    // InternalMyDsl.g:1734:1: rule__Example__ContenidoAssignment_7_2_1 : ( ruleContenido ) ;
    public final void rule__Example__ContenidoAssignment_7_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( ( ruleContenido ) )
            // InternalMyDsl.g:1739:2: ( ruleContenido )
            {
            // InternalMyDsl.g:1739:2: ( ruleContenido )
            // InternalMyDsl.g:1740:3: ruleContenido
            {
             before(grammarAccess.getExampleAccess().getContenidoContenidoParserRuleCall_7_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContenido();

            state._fsp--;

             after(grammarAccess.getExampleAccess().getContenidoContenidoParserRuleCall_7_2_1_0()); 

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
    // $ANTLR end "rule__Example__ContenidoAssignment_7_2_1"


    // $ANTLR start "rule__Contenido__NameAssignment_2"
    // InternalMyDsl.g:1749:1: rule__Contenido__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Contenido__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1754:2: ( ruleEString )
            {
            // InternalMyDsl.g:1754:2: ( ruleEString )
            // InternalMyDsl.g:1755:3: ruleEString
            {
             before(grammarAccess.getContenidoAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Contenido__NameAssignment_2"


    // $ANTLR start "rule__Contenido__TipoAssignment_4_1"
    // InternalMyDsl.g:1764:1: rule__Contenido__TipoAssignment_4_1 : ( ruleTipoDato ) ;
    public final void rule__Contenido__TipoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1768:1: ( ( ruleTipoDato ) )
            // InternalMyDsl.g:1769:2: ( ruleTipoDato )
            {
            // InternalMyDsl.g:1769:2: ( ruleTipoDato )
            // InternalMyDsl.g:1770:3: ruleTipoDato
            {
             before(grammarAccess.getContenidoAccess().getTipoTipoDatoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoDato();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getTipoTipoDatoEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Contenido__TipoAssignment_4_1"


    // $ANTLR start "rule__Contenido__RelacionadoAssignment_5_2"
    // InternalMyDsl.g:1779:1: rule__Contenido__RelacionadoAssignment_5_2 : ( ruleRelacionado ) ;
    public final void rule__Contenido__RelacionadoAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1783:1: ( ( ruleRelacionado ) )
            // InternalMyDsl.g:1784:2: ( ruleRelacionado )
            {
            // InternalMyDsl.g:1784:2: ( ruleRelacionado )
            // InternalMyDsl.g:1785:3: ruleRelacionado
            {
             before(grammarAccess.getContenidoAccess().getRelacionadoRelacionadoParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRelacionado();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getRelacionadoRelacionadoParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Contenido__RelacionadoAssignment_5_2"


    // $ANTLR start "rule__Contenido__RelacionadoAssignment_5_3_1"
    // InternalMyDsl.g:1794:1: rule__Contenido__RelacionadoAssignment_5_3_1 : ( ruleRelacionado ) ;
    public final void rule__Contenido__RelacionadoAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1798:1: ( ( ruleRelacionado ) )
            // InternalMyDsl.g:1799:2: ( ruleRelacionado )
            {
            // InternalMyDsl.g:1799:2: ( ruleRelacionado )
            // InternalMyDsl.g:1800:3: ruleRelacionado
            {
             before(grammarAccess.getContenidoAccess().getRelacionadoRelacionadoParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRelacionado();

            state._fsp--;

             after(grammarAccess.getContenidoAccess().getRelacionadoRelacionadoParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Contenido__RelacionadoAssignment_5_3_1"


    // $ANTLR start "rule__Relacionado__ActivoAssignment_1"
    // InternalMyDsl.g:1809:1: rule__Relacionado__ActivoAssignment_1 : ( ( 'activo' ) ) ;
    public final void rule__Relacionado__ActivoAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1813:1: ( ( ( 'activo' ) ) )
            // InternalMyDsl.g:1814:2: ( ( 'activo' ) )
            {
            // InternalMyDsl.g:1814:2: ( ( 'activo' ) )
            // InternalMyDsl.g:1815:3: ( 'activo' )
            {
             before(grammarAccess.getRelacionadoAccess().getActivoActivoKeyword_1_0()); 
            // InternalMyDsl.g:1816:3: ( 'activo' )
            // InternalMyDsl.g:1817:4: 'activo'
            {
             before(grammarAccess.getRelacionadoAccess().getActivoActivoKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRelacionadoAccess().getActivoActivoKeyword_1_0()); 

            }

             after(grammarAccess.getRelacionadoAccess().getActivoActivoKeyword_1_0()); 

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
    // $ANTLR end "rule__Relacionado__ActivoAssignment_1"


    // $ANTLR start "rule__Relacionado__NameAssignment_3"
    // InternalMyDsl.g:1828:1: rule__Relacionado__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Relacionado__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1833:2: ( ruleEString )
            {
            // InternalMyDsl.g:1833:2: ( ruleEString )
            // InternalMyDsl.g:1834:3: ruleEString
            {
             before(grammarAccess.getRelacionadoAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRelacionadoAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Relacionado__NameAssignment_3"


    // $ANTLR start "rule__Relacionado__NumeroAssignment_5_1"
    // InternalMyDsl.g:1843:1: rule__Relacionado__NumeroAssignment_5_1 : ( ruleEBigInteger ) ;
    public final void rule__Relacionado__NumeroAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1847:1: ( ( ruleEBigInteger ) )
            // InternalMyDsl.g:1848:2: ( ruleEBigInteger )
            {
            // InternalMyDsl.g:1848:2: ( ruleEBigInteger )
            // InternalMyDsl.g:1849:3: ruleEBigInteger
            {
             before(grammarAccess.getRelacionadoAccess().getNumeroEBigIntegerParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBigInteger();

            state._fsp--;

             after(grammarAccess.getRelacionadoAccess().getNumeroEBigIntegerParserRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Relacionado__NumeroAssignment_5_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000002E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000004240000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000040L});

}