// Generated from C:\Users\oscar\Desktop\u005Cunsorted\HaskellParser.g4 by ANTLR 4.5.1
package haskellantlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HaskellParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NEWLINE=1, TAB=2, WS=3, COMMENT=4, NCOMMENT=5, OCURLY=6, CCURLY=7, VOCURLY=8, 
		VCCURLY=9, SEMI=10, CASE=11, CLASS=12, DATA=13, DEFAULT=14, DERIVING=15, 
		DO=16, ELSE=17, EXPORT=18, FOREIGN=19, IF=20, IMPORT=21, IN=22, INFIX=23, 
		INFIXL=24, INFIXR=25, INSTANCE=26, LET=27, MODULE=28, NEWTYPE=29, OF=30, 
		THEN=31, TYPE=32, WHERE=33, WILDCARD=34, QUALIFIED=35, AS=36, HIDING=37, 
		LANGUAGE=38, INLINE=39, NOINLINE=40, SPECIALIZE=41, CCALL=42, STDCALL=43, 
		CPPCALL=44, JVMCALL=45, DOTNETCALL=46, SAFE=47, UNSAFE=48, DoubleArrow=49, 
		DoubleColon=50, Arrow=51, Revarrow=52, Hash=53, Less=54, Greater=55, Ampersand=56, 
		Pipe=57, Bang=58, Caret=59, Plus=60, Minus=61, Asterisk=62, Percent=63, 
		Divide=64, Tilde=65, Atsign=66, Dollar=67, Dot=68, Semi=69, DoubleDot=70, 
		QuestionMark=71, OpenRoundBracket=72, CloseRoundBracket=73, OpenSquareBracket=74, 
		CloseSquareBracket=75, OpenCommentBracket=76, CloseCommentBracket=77, 
		Comma=78, Colon=79, Eq=80, Quote=81, DoubleQuote=82, BackQuote=83, CHAR=84, 
		STRING=85, VARID=86, CONID=87, DECIMAL=88, OCTAL=89, HEXADECIMAL=90, FLOAT=91, 
		EXPONENT=92, ASCSYMBOL=93, UNISYMBOL=94;
	public static final int
		RULE_module = 0, RULE_pragmas = 1, RULE_pragma = 2, RULE_extension = 3, 
		RULE_body = 4, RULE_impdecls = 5, RULE_exports = 6, RULE_exprt = 7, RULE_impdecl = 8, 
		RULE_impspec = 9, RULE_himport = 10, RULE_cname = 11, RULE_topdecls = 12, 
		RULE_topdecl = 13, RULE_decls = 14, RULE_decl = 15, RULE_specs = 16, RULE_spec = 17, 
		RULE_cdecls = 18, RULE_cdecl = 19, RULE_idecls = 20, RULE_idecl = 21, 
		RULE_gendecl = 22, RULE_ops = 23, RULE_vars = 24, RULE_fixity = 25, RULE_type = 26, 
		RULE_btype = 27, RULE_atype = 28, RULE_gtycon = 29, RULE_typecontext = 30, 
		RULE_cls = 31, RULE_scontext = 32, RULE_simpleclass = 33, RULE_simpletype = 34, 
		RULE_constrs = 35, RULE_constr = 36, RULE_newconstr = 37, RULE_fielddecl = 38, 
		RULE_deriving = 39, RULE_dclass = 40, RULE_inst = 41, RULE_fdecl = 42, 
		RULE_callconv = 43, RULE_impent = 44, RULE_expent = 45, RULE_safety = 46, 
		RULE_funlhs = 47, RULE_rhs = 48, RULE_gdrhs = 49, RULE_gdrh = 50, RULE_guards = 51, 
		RULE_guard = 52, RULE_exp = 53, RULE_infixexp = 54, RULE_lexp = 55, RULE_fexp = 56, 
		RULE_aexp = 57, RULE_qual = 58, RULE_alts = 59, RULE_alt = 60, RULE_gdpats = 61, 
		RULE_ifgdpats = 62, RULE_gdpat = 63, RULE_stmts = 64, RULE_stmt = 65, 
		RULE_fbind = 66, RULE_pat = 67, RULE_lpat = 68, RULE_apat = 69, RULE_fpat = 70, 
		RULE_gcon = 71, RULE_var = 72, RULE_qvar = 73, RULE_con = 74, RULE_qcon = 75, 
		RULE_varop = 76, RULE_qvarop = 77, RULE_conop = 78, RULE_qconop = 79, 
		RULE_op = 80, RULE_qop = 81, RULE_gconsym = 82, RULE_open = 83, RULE_close = 84, 
		RULE_semi = 85, RULE_literal = 86, RULE_special = 87, RULE_varid = 88, 
		RULE_conid = 89, RULE_symbol = 90, RULE_ascSymbol = 91, RULE_varsym = 92, 
		RULE_consym = 93, RULE_tyvar = 94, RULE_tycon = 95, RULE_tycls = 96, RULE_modid = 97, 
		RULE_qvarid = 98, RULE_qconid = 99, RULE_qtycon = 100, RULE_qtycls = 101, 
		RULE_qvarsym = 102, RULE_qconsym = 103, RULE_integer = 104, RULE_pfloat = 105, 
		RULE_pchar = 106, RULE_pstring = 107;
	public static final String[] ruleNames = {
		"module", "pragmas", "pragma", "extension", "body", "impdecls", "exports", 
		"exprt", "impdecl", "impspec", "himport", "cname", "topdecls", "topdecl", 
		"decls", "decl", "specs", "spec", "cdecls", "cdecl", "idecls", "idecl", 
		"gendecl", "ops", "vars", "fixity", "type", "btype", "atype", "gtycon", 
		"typecontext", "cls", "scontext", "simpleclass", "simpletype", "constrs", 
		"constr", "newconstr", "fielddecl", "deriving", "dclass", "inst", "fdecl", 
		"callconv", "impent", "expent", "safety", "funlhs", "rhs", "gdrhs", "gdrh", 
		"guards", "guard", "exp", "infixexp", "lexp", "fexp", "aexp", "qual", 
		"alts", "alt", "gdpats", "ifgdpats", "gdpat", "stmts", "stmt", "fbind", 
		"pat", "lpat", "apat", "fpat", "gcon", "var", "qvar", "con", "qcon", "varop", 
		"qvarop", "conop", "qconop", "op", "qop", "gconsym", "open", "close", 
		"semi", "literal", "special", "varid", "conid", "symbol", "ascSymbol", 
		"varsym", "consym", "tyvar", "tycon", "tycls", "modid", "qvarid", "qconid", 
		"qtycon", "qtycls", "qvarsym", "qconsym", "integer", "pfloat", "pchar", 
		"pstring"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, "'{'", "'}'", "'VOCURLY'", "'VCCURLY'", 
		"'SEMI'", "'case'", "'class'", "'data'", "'default'", "'deriving'", "'do'", 
		"'else'", "'export'", "'foreign'", "'if'", "'import'", "'in'", "'infix'", 
		"'infixl'", "'infixr'", "'instance'", "'let'", "'module'", "'newtype'", 
		"'of'", "'then'", "'type'", "'where'", "'_'", "'qualified'", "'as'", "'hiding'", 
		"'LANGUAGE'", "'INLINE'", "'NOINLINE'", "'SPECIALIZE'", "'ccall'", "'stdcall'", 
		"'cplusplus'", "'jvm'", "'dotnet'", "'safe'", "'unsafe'", "'=>'", "'::'", 
		"'->'", "'<-'", "'#'", "'<'", "'>'", "'&'", "'|'", "'!'", "'^'", "'+'", 
		"'-'", "'*'", "'%'", "'/'", "'~'", "'@'", "'$'", "'.'", "';'", "'..'", 
		"'?'", "'('", "')'", "'['", "']'", "'{-#'", "'#-}'", "','", "':'", "'='", 
		"'''", "'\\'", "'`'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NEWLINE", "TAB", "WS", "COMMENT", "NCOMMENT", "OCURLY", "CCURLY", 
		"VOCURLY", "VCCURLY", "SEMI", "CASE", "CLASS", "DATA", "DEFAULT", "DERIVING", 
		"DO", "ELSE", "EXPORT", "FOREIGN", "IF", "IMPORT", "IN", "INFIX", "INFIXL", 
		"INFIXR", "INSTANCE", "LET", "MODULE", "NEWTYPE", "OF", "THEN", "TYPE", 
		"WHERE", "WILDCARD", "QUALIFIED", "AS", "HIDING", "LANGUAGE", "INLINE", 
		"NOINLINE", "SPECIALIZE", "CCALL", "STDCALL", "CPPCALL", "JVMCALL", "DOTNETCALL", 
		"SAFE", "UNSAFE", "DoubleArrow", "DoubleColon", "Arrow", "Revarrow", "Hash", 
		"Less", "Greater", "Ampersand", "Pipe", "Bang", "Caret", "Plus", "Minus", 
		"Asterisk", "Percent", "Divide", "Tilde", "Atsign", "Dollar", "Dot", "Semi", 
		"DoubleDot", "QuestionMark", "OpenRoundBracket", "CloseRoundBracket", 
		"OpenSquareBracket", "CloseSquareBracket", "OpenCommentBracket", "CloseCommentBracket", 
		"Comma", "Colon", "Eq", "Quote", "DoubleQuote", "BackQuote", "CHAR", "STRING", 
		"VARID", "CONID", "DECIMAL", "OCTAL", "HEXADECIMAL", "FLOAT", "EXPONENT", 
		"ASCSYMBOL", "UNISYMBOL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "HaskellParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HaskellParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModuleContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HaskellParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public PragmasContext pragmas() {
			return getRuleContext(PragmasContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(HaskellParser.MODULE, 0); }
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public ExportsContext exports() {
			return getRuleContext(ExportsContext.class,0);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterModule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitModule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_module);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(216);
					semi();
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(222);
				pragmas();
				}
				break;
			}
			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(225);
					semi();
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(247);
			switch (_input.LA(1)) {
			case MODULE:
				{
				{
				setState(231);
				match(MODULE);
				setState(232);
				modid();
				setState(234);
				_la = _input.LA(1);
				if (_la==OpenRoundBracket) {
					{
					setState(233);
					exports();
					}
				}

				setState(236);
				match(WHERE);
				setState(237);
				open();
				setState(238);
				body();
				setState(239);
				close();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==Semi) {
					{
					{
					setState(240);
					semi();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case NEWLINE:
			case SEMI:
			case CLASS:
			case DATA:
			case DEFAULT:
			case FOREIGN:
			case IMPORT:
			case INFIX:
			case INFIXL:
			case INSTANCE:
			case NEWTYPE:
			case TYPE:
			case WILDCARD:
			case AS:
			case HIDING:
			case Minus:
			case Tilde:
			case Semi:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCommentBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				{
				setState(246);
				body();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(249);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmasContext extends ParserRuleContext {
		public List<PragmaContext> pragma() {
			return getRuleContexts(PragmaContext.class);
		}
		public PragmaContext pragma(int i) {
			return getRuleContext(PragmaContext.class,i);
		}
		public PragmasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragmas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPragmas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPragmas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragmas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmasContext pragmas() throws RecognitionException {
		PragmasContext _localctx = new PragmasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_pragmas);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(251);
					pragma();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PragmaContext extends ParserRuleContext {
		public List<ExtensionContext> extension() {
			return getRuleContexts(ExtensionContext.class);
		}
		public ExtensionContext extension(int i) {
			return getRuleContext(ExtensionContext.class,i);
		}
		public PragmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPragma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPragma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPragma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PragmaContext pragma() throws RecognitionException {
		PragmaContext _localctx = new PragmaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pragma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(OpenCommentBracket);
			setState(257);
			match(LANGUAGE);
			setState(258);
			extension();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(259);
				match(Comma);
				setState(260);
				extension();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
			match(CloseCommentBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtensionContext extension() throws RecognitionException {
		ExtensionContext _localctx = new ExtensionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_extension);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			conid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public ImpdeclsContext impdecls() {
			return getRuleContext(ImpdeclsContext.class,0);
		}
		public TopdeclsContext topdecls() {
			return getRuleContext(TopdeclsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_body);
		try {
			setState(275);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(270);
				impdecls();
				setState(271);
				topdecls();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				impdecls();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				topdecls();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpdeclsContext extends ParserRuleContext {
		public List<ImpdeclContext> impdecl() {
			return getRuleContexts(ImpdeclContext.class);
		}
		public ImpdeclContext impdecl(int i) {
			return getRuleContext(ImpdeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ImpdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterImpdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitImpdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpdeclsContext impdecls() throws RecognitionException {
		ImpdeclsContext _localctx = new ImpdeclsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_impdecls);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(280);
					switch (_input.LA(1)) {
					case IMPORT:
						{
						setState(277);
						impdecl();
						}
						break;
					case NEWLINE:
						{
						setState(278);
						match(NEWLINE);
						}
						break;
					case SEMI:
					case Semi:
						{
						setState(279);
						semi();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExportsContext extends ParserRuleContext {
		public List<ExprtContext> exprt() {
			return getRuleContexts(ExprtContext.class);
		}
		public ExprtContext exprt(int i) {
			return getRuleContext(ExprtContext.class,i);
		}
		public ExportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exports; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterExports(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitExports(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExports(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportsContext exports() throws RecognitionException {
		ExportsContext _localctx = new ExportsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exports);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(OpenRoundBracket);
			setState(293);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (MODULE - 28)) | (1L << (AS - 28)) | (1L << (HIDING - 28)) | (1L << (OpenRoundBracket - 28)) | (1L << (VARID - 28)) | (1L << (CONID - 28)))) != 0)) {
				{
				setState(285);
				exprt();
				setState(290);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						match(Comma);
						setState(287);
						exprt();
						}
						} 
					}
					setState(292);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
			}

			setState(296);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(295);
				match(Comma);
				}
			}

			setState(298);
			match(CloseRoundBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprtContext extends ParserRuleContext {
		public List<QvarContext> qvar() {
			return getRuleContexts(QvarContext.class);
		}
		public QvarContext qvar(int i) {
			return getRuleContext(QvarContext.class,i);
		}
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public List<CnameContext> cname() {
			return getRuleContexts(CnameContext.class);
		}
		public CnameContext cname(int i) {
			return getRuleContext(CnameContext.class,i);
		}
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public TerminalNode MODULE() { return getToken(HaskellParser.MODULE, 0); }
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public ExprtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterExprt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitExprt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExprt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprtContext exprt() throws RecognitionException {
		ExprtContext _localctx = new ExprtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprt);
		int _la;
		try {
			setState(339);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				qvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(301);
				qtycon();
				setState(317);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					{
					setState(302);
					match(OpenRoundBracket);
					setState(303);
					match(DoubleDot);
					setState(304);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(305);
					match(OpenRoundBracket);
					setState(314);
					_la = _input.LA(1);
					if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
						{
						setState(306);
						cname();
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(307);
							match(Comma);
							setState(308);
							cname();
							}
							}
							setState(313);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(316);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(319);
				qtycls();
				setState(335);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					{
					setState(320);
					match(OpenRoundBracket);
					setState(321);
					match(DoubleDot);
					setState(322);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(323);
					match(OpenRoundBracket);
					setState(332);
					_la = _input.LA(1);
					if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
						{
						setState(324);
						qvar();
						setState(329);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(325);
							match(Comma);
							setState(326);
							qvar();
							}
							}
							setState(331);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(334);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(337);
				match(MODULE);
				setState(338);
				modid();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpdeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HaskellParser.IMPORT, 0); }
		public List<ModidContext> modid() {
			return getRuleContexts(ModidContext.class);
		}
		public ModidContext modid(int i) {
			return getRuleContext(ModidContext.class,i);
		}
		public TerminalNode QUALIFIED() { return getToken(HaskellParser.QUALIFIED, 0); }
		public ImpspecContext impspec() {
			return getRuleContext(ImpspecContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public ImpdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterImpdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitImpdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpdeclContext impdecl() throws RecognitionException {
		ImpdeclContext _localctx = new ImpdeclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_impdecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IMPORT);
			setState(343);
			_la = _input.LA(1);
			if (_la==QUALIFIED) {
				{
				setState(342);
				match(QUALIFIED);
				}
			}

			setState(345);
			modid();
			setState(348);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(346);
				match(AS);
				setState(347);
				modid();
				}
			}

			setState(351);
			_la = _input.LA(1);
			if (_la==HIDING || _la==OpenRoundBracket) {
				{
				setState(350);
				impspec();
				}
			}

			setState(354); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(353);
					semi();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(356); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpspecContext extends ParserRuleContext {
		public List<HimportContext> himport() {
			return getRuleContexts(HimportContext.class);
		}
		public HimportContext himport(int i) {
			return getRuleContext(HimportContext.class,i);
		}
		public ImpspecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impspec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterImpspec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitImpspec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpspec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpspecContext impspec() throws RecognitionException {
		ImpspecContext _localctx = new ImpspecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_impspec);
		int _la;
		try {
			int _alt;
			setState(389);
			switch (_input.LA(1)) {
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(358);
				match(OpenRoundBracket);
				setState(370);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					setState(359);
					himport();
					setState(364);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(360);
							match(Comma);
							setState(361);
							himport();
							}
							} 
						}
						setState(366);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					}
					setState(368);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(367);
						match(Comma);
						}
					}

					}
				}

				setState(372);
				match(CloseRoundBracket);
				}
				}
				break;
			case HIDING:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(373);
				match(HIDING);
				setState(374);
				match(OpenRoundBracket);
				setState(386);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					setState(375);
					himport();
					setState(380);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(376);
							match(Comma);
							setState(377);
							himport();
							}
							} 
						}
						setState(382);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					}
					setState(384);
					_la = _input.LA(1);
					if (_la==Comma) {
						{
						setState(383);
						match(Comma);
						}
					}

					}
				}

				setState(388);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HimportContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public List<CnameContext> cname() {
			return getRuleContexts(CnameContext.class);
		}
		public CnameContext cname(int i) {
			return getRuleContext(CnameContext.class,i);
		}
		public TyclsContext tycls() {
			return getRuleContext(TyclsContext.class,0);
		}
		public HimportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_himport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterHimport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitHimport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitHimport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HimportContext himport() throws RecognitionException {
		HimportContext _localctx = new HimportContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_himport);
		int _la;
		try {
			setState(428);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(392);
				tycon();
				setState(408);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					{
					setState(393);
					match(OpenRoundBracket);
					setState(394);
					match(DoubleDot);
					setState(395);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(396);
					match(OpenRoundBracket);
					setState(405);
					_la = _input.LA(1);
					if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
						{
						setState(397);
						cname();
						setState(402);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(398);
							match(Comma);
							setState(399);
							cname();
							}
							}
							setState(404);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(407);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(410);
				tycls();
				setState(426);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					{
					setState(411);
					match(OpenRoundBracket);
					setState(412);
					match(DoubleDot);
					setState(413);
					match(CloseRoundBracket);
					}
					}
					break;
				case 2:
					{
					{
					setState(414);
					match(OpenRoundBracket);
					setState(423);
					_la = _input.LA(1);
					if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)))) != 0)) {
						{
						setState(415);
						var();
						setState(420);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(416);
							match(Comma);
							setState(417);
							var();
							}
							}
							setState(422);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(425);
					match(CloseRoundBracket);
					}
					}
					break;
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CnameContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public CnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CnameContext cname() throws RecognitionException {
		CnameContext _localctx = new CnameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cname);
		try {
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				con();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopdeclsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(HaskellParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(HaskellParser.NEWLINE, i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public List<TopdeclContext> topdecl() {
			return getRuleContexts(TopdeclContext.class);
		}
		public TopdeclContext topdecl(int i) {
			return getRuleContext(TopdeclContext.class,i);
		}
		public TopdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTopdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTopdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTopdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopdeclsContext topdecls() throws RecognitionException {
		TopdeclsContext _localctx = new TopdeclsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_topdecls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(442); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(442);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					{
					setState(434);
					topdecl();
					setState(436); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(435);
							semi();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(438); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					break;
				case 2:
					{
					setState(440);
					match(NEWLINE);
					}
					break;
				case 3:
					{
					setState(441);
					semi();
					}
					break;
				}
				}
				setState(444); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NEWLINE) | (1L << SEMI) | (1L << CLASS) | (1L << DATA) | (1L << DEFAULT) | (1L << FOREIGN) | (1L << INFIX) | (1L << INFIXL) | (1L << INSTANCE) | (1L << NEWTYPE) | (1L << TYPE) | (1L << WILDCARD) | (1L << AS) | (1L << HIDING) | (1L << Minus))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (OpenRoundBracket - 65)) | (1L << (OpenSquareBracket - 65)) | (1L << (OpenCommentBracket - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (VARID - 65)) | (1L << (CONID - 65)) | (1L << (DECIMAL - 65)) | (1L << (OCTAL - 65)) | (1L << (HEXADECIMAL - 65)) | (1L << (FLOAT - 65)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopdeclContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(HaskellParser.TYPE, 0); }
		public SimpletypeContext simpletype() {
			return getRuleContext(SimpletypeContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode DATA() { return getToken(HaskellParser.DATA, 0); }
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public ConstrsContext constrs() {
			return getRuleContext(ConstrsContext.class,0);
		}
		public DerivingContext deriving() {
			return getRuleContext(DerivingContext.class,0);
		}
		public TerminalNode NEWTYPE() { return getToken(HaskellParser.NEWTYPE, 0); }
		public NewconstrContext newconstr() {
			return getRuleContext(NewconstrContext.class,0);
		}
		public TerminalNode CLASS() { return getToken(HaskellParser.CLASS, 0); }
		public TyclsContext tycls() {
			return getRuleContext(TyclsContext.class,0);
		}
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public ScontextContext scontext() {
			return getRuleContext(ScontextContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public CdeclsContext cdecls() {
			return getRuleContext(CdeclsContext.class,0);
		}
		public TerminalNode INSTANCE() { return getToken(HaskellParser.INSTANCE, 0); }
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public InstContext inst() {
			return getRuleContext(InstContext.class,0);
		}
		public IdeclsContext idecls() {
			return getRuleContext(IdeclsContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(HaskellParser.DEFAULT, 0); }
		public TerminalNode FOREIGN() { return getToken(HaskellParser.FOREIGN, 0); }
		public FdeclContext fdecl() {
			return getRuleContext(FdeclContext.class,0);
		}
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TopdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTopdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTopdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTopdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopdeclContext topdecl() throws RecognitionException {
		TopdeclContext _localctx = new TopdeclContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_topdecl);
		int _la;
		try {
			setState(517);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(446);
				match(TYPE);
				setState(447);
				simpletype();
				setState(448);
				match(Eq);
				setState(449);
				type();
				}
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(451);
				match(DATA);
				setState(455);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(452);
					typecontext();
					setState(453);
					match(DoubleArrow);
					}
					break;
				}
				setState(457);
				simpletype();
				setState(460);
				_la = _input.LA(1);
				if (_la==Eq) {
					{
					setState(458);
					match(Eq);
					setState(459);
					constrs();
					}
				}

				setState(463);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(462);
					deriving();
					}
				}

				}
				}
				break;
			case NEWTYPE:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(465);
				match(NEWTYPE);
				setState(469);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(466);
					typecontext();
					setState(467);
					match(DoubleArrow);
					}
					break;
				}
				setState(471);
				simpletype();
				setState(472);
				match(Eq);
				setState(473);
				newconstr();
				setState(475);
				_la = _input.LA(1);
				if (_la==DERIVING) {
					{
					setState(474);
					deriving();
					}
				}

				}
				}
				break;
			case CLASS:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(477);
				match(CLASS);
				setState(481);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(478);
					scontext();
					setState(479);
					match(DoubleArrow);
					}
					break;
				}
				setState(483);
				tycls();
				setState(484);
				tyvar();
				setState(487);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(485);
					match(WHERE);
					setState(486);
					cdecls();
					}
				}

				}
				}
				break;
			case INSTANCE:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(489);
				match(INSTANCE);
				setState(493);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(490);
					scontext();
					setState(491);
					match(DoubleArrow);
					}
					break;
				}
				setState(495);
				qtycls();
				setState(496);
				inst();
				setState(499);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(497);
					match(WHERE);
					setState(498);
					idecls();
					}
				}

				}
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(501);
				match(DEFAULT);
				setState(502);
				match(OpenRoundBracket);
				setState(511);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (OpenSquareBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					setState(503);
					type();
					setState(508);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(504);
						match(Comma);
						setState(505);
						type();
						}
						}
						setState(510);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(513);
				match(CloseRoundBracket);
				}
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(514);
				match(FOREIGN);
				setState(515);
				fdecl();
				}
				}
				break;
			case SEMI:
			case INFIX:
			case INFIXL:
			case WILDCARD:
			case AS:
			case HIDING:
			case Minus:
			case Tilde:
			case Semi:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case OpenCommentBracket:
			case CHAR:
			case STRING:
			case VARID:
			case CONID:
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
			case FLOAT:
				enterOuterAlt(_localctx, 8);
				{
				setState(516);
				decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclsContext extends ParserRuleContext {
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterDecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitDecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclsContext decls() throws RecognitionException {
		DeclsContext _localctx = new DeclsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_decls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			open();
			setState(538);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SEMI) | (1L << INFIX) | (1L << INFIXL) | (1L << WILDCARD) | (1L << AS) | (1L << HIDING) | (1L << Minus))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (OpenRoundBracket - 65)) | (1L << (OpenSquareBracket - 65)) | (1L << (OpenCommentBracket - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (VARID - 65)) | (1L << (CONID - 65)) | (1L << (DECIMAL - 65)) | (1L << (OCTAL - 65)) | (1L << (HEXADECIMAL - 65)) | (1L << (FLOAT - 65)))) != 0)) {
				{
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(520);
						decl();
						setState(522); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(521);
								semi();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(524); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						} 
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(531);
				decl();
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==Semi) {
					{
					{
					setState(532);
					semi();
					}
					}
					setState(537);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(540);
			close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public SpecsContext specs() {
			return getRuleContext(SpecsContext.class,0);
		}
		public GendeclContext gendecl() {
			return getRuleContext(GendeclContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_decl);
		try {
			int _alt;
			setState(569);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(542);
				match(OpenCommentBracket);
				setState(543);
				match(INLINE);
				setState(544);
				qvar();
				setState(545);
				match(CloseCommentBracket);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(OpenCommentBracket);
				setState(548);
				match(NOINLINE);
				setState(549);
				qvar();
				setState(550);
				match(CloseCommentBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				match(OpenCommentBracket);
				setState(553);
				match(SPECIALIZE);
				setState(554);
				specs();
				setState(555);
				match(CloseCommentBracket);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(557);
				gendecl();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(560);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(558);
					funlhs();
					}
					break;
				case 2:
					{
					setState(559);
					pat();
					}
					break;
				}
				setState(562);
				rhs();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(565); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(564);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(567); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecsContext extends ParserRuleContext {
		public List<SpecContext> spec() {
			return getRuleContexts(SpecContext.class);
		}
		public SpecContext spec(int i) {
			return getRuleContext(SpecContext.class,i);
		}
		public SpecsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSpecs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSpecs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSpecs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecsContext specs() throws RecognitionException {
		SpecsContext _localctx = new SpecsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_specs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			spec();
			setState(576);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(572);
				match(Comma);
				setState(573);
				spec();
				}
				}
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_spec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecContext spec() throws RecognitionException {
		SpecContext _localctx = new SpecContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_spec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			vars();
			setState(580);
			match(DoubleColon);
			setState(581);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CdeclsContext extends ParserRuleContext {
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<CdeclContext> cdecl() {
			return getRuleContexts(CdeclContext.class);
		}
		public CdeclContext cdecl(int i) {
			return getRuleContext(CdeclContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public CdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdeclsContext cdecls() throws RecognitionException {
		CdeclsContext _localctx = new CdeclsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cdecls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			open();
			setState(602);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INFIX) | (1L << INFIXL) | (1L << WILDCARD) | (1L << AS) | (1L << HIDING) | (1L << Minus))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Tilde - 65)) | (1L << (OpenRoundBracket - 65)) | (1L << (OpenSquareBracket - 65)) | (1L << (CHAR - 65)) | (1L << (STRING - 65)) | (1L << (VARID - 65)) | (1L << (CONID - 65)) | (1L << (DECIMAL - 65)) | (1L << (OCTAL - 65)) | (1L << (HEXADECIMAL - 65)) | (1L << (FLOAT - 65)))) != 0)) {
				{
				setState(592);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						cdecl();
						setState(586); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(585);
							semi();
							}
							}
							setState(588); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SEMI || _la==Semi );
						}
						} 
					}
					setState(594);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				setState(595);
				cdecl();
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==Semi) {
					{
					{
					setState(596);
					semi();
					}
					}
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(604);
			close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CdeclContext extends ParserRuleContext {
		public GendeclContext gendecl() {
			return getRuleContext(GendeclContext.class,0);
		}
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public CdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CdeclContext cdecl() throws RecognitionException {
		CdeclContext _localctx = new CdeclContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cdecl);
		try {
			setState(613);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				gendecl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(609);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(607);
					funlhs();
					}
					break;
				case 2:
					{
					setState(608);
					var();
					}
					break;
				}
				setState(611);
				rhs();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdeclsContext extends ParserRuleContext {
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<IdeclContext> idecl() {
			return getRuleContexts(IdeclContext.class);
		}
		public IdeclContext idecl(int i) {
			return getRuleContext(IdeclContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public IdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterIdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitIdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitIdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdeclsContext idecls() throws RecognitionException {
		IdeclsContext _localctx = new IdeclsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_idecls);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			open();
			setState(634);
			_la = _input.LA(1);
			if (((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (WILDCARD - 34)) | (1L << (AS - 34)) | (1L << (HIDING - 34)) | (1L << (Minus - 34)) | (1L << (Tilde - 34)) | (1L << (OpenRoundBracket - 34)) | (1L << (OpenSquareBracket - 34)) | (1L << (CHAR - 34)) | (1L << (STRING - 34)) | (1L << (VARID - 34)) | (1L << (CONID - 34)) | (1L << (DECIMAL - 34)) | (1L << (OCTAL - 34)) | (1L << (HEXADECIMAL - 34)) | (1L << (FLOAT - 34)))) != 0)) {
				{
				setState(624);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(616);
						idecl();
						setState(618); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(617);
							semi();
							}
							}
							setState(620); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==SEMI || _la==Semi );
						}
						} 
					}
					setState(626);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				setState(627);
				idecl();
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SEMI || _la==Semi) {
					{
					{
					setState(628);
					semi();
					}
					}
					setState(633);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(636);
			close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdeclContext extends ParserRuleContext {
		public RhsContext rhs() {
			return getRuleContext(RhsContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public IdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterIdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitIdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitIdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdeclContext idecl() throws RecognitionException {
		IdeclContext _localctx = new IdeclContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_idecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(638);
				funlhs();
				}
				break;
			case 2:
				{
				setState(639);
				var();
				}
				break;
			}
			setState(642);
			rhs();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GendeclContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public FixityContext fixity() {
			return getRuleContext(FixityContext.class,0);
		}
		public OpsContext ops() {
			return getRuleContext(OpsContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(HaskellParser.DECIMAL, 0); }
		public GendeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gendecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGendecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGendecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGendecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GendeclContext gendecl() throws RecognitionException {
		GendeclContext _localctx = new GendeclContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_gendecl);
		int _la;
		try {
			setState(659);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case OpenRoundBracket:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				vars();
				setState(645);
				match(DoubleColon);
				setState(649);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(646);
					typecontext();
					setState(647);
					match(DoubleArrow);
					}
					break;
				}
				setState(651);
				type();
				}
				break;
			case INFIX:
			case INFIXL:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(653);
				fixity();
				setState(655);
				_la = _input.LA(1);
				if (_la==DECIMAL) {
					{
					setState(654);
					match(DECIMAL);
					}
				}

				setState(657);
				ops();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpsContext extends ParserRuleContext {
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public OpsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterOps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitOps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpsContext ops() throws RecognitionException {
		OpsContext _localctx = new OpsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			op();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(662);
				match(Comma);
				setState(663);
				op();
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsContext extends ParserRuleContext {
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			var();
			setState(674);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(670);
				match(Comma);
				setState(671);
				var();
				}
				}
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FixityContext extends ParserRuleContext {
		public TerminalNode INFIX() { return getToken(HaskellParser.INFIX, 0); }
		public List<TerminalNode> INFIXL() { return getTokens(HaskellParser.INFIXL); }
		public TerminalNode INFIXL(int i) {
			return getToken(HaskellParser.INFIXL, i);
		}
		public FixityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fixity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFixity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFixity(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFixity(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FixityContext fixity() throws RecognitionException {
		FixityContext _localctx = new FixityContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_fixity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			_la = _input.LA(1);
			if ( !(_la==INFIX || _la==INFIXL) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public BtypeContext btype() {
			return getRuleContext(BtypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			btype();
			setState(682);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(680);
				match(Arrow);
				setState(681);
				type();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BtypeContext extends ParserRuleContext {
		public List<AtypeContext> atype() {
			return getRuleContexts(AtypeContext.class);
		}
		public AtypeContext atype(int i) {
			return getRuleContext(AtypeContext.class,i);
		}
		public BtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_btype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterBtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitBtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitBtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BtypeContext btype() throws RecognitionException {
		BtypeContext _localctx = new BtypeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_btype);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(685); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(684);
					atype();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(687); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtypeContext extends ParserRuleContext {
		public GtyconContext gtycon() {
			return getRuleContext(GtyconContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public AtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterAtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitAtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtypeContext atype() throws RecognitionException {
		AtypeContext _localctx = new AtypeContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atype);
		int _la;
		try {
			setState(710);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				gtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				varid();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(691);
				match(OpenRoundBracket);
				setState(692);
				type();
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(693);
					match(Comma);
					setState(694);
					type();
					}
					}
					setState(699);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(700);
				match(CloseRoundBracket);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(702);
				match(OpenSquareBracket);
				setState(703);
				type();
				setState(704);
				match(CloseSquareBracket);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(706);
				match(OpenRoundBracket);
				setState(707);
				type();
				setState(708);
				match(CloseRoundBracket);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GtyconContext extends ParserRuleContext {
		public QtyconContext qtycon() {
			return getRuleContext(QtyconContext.class,0);
		}
		public GtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gtycon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGtycon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGtycon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GtyconContext gtycon() throws RecognitionException {
		GtyconContext _localctx = new GtyconContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_gtycon);
		try {
			setState(726);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(712);
				qtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(713);
				match(OpenRoundBracket);
				setState(714);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(715);
				match(OpenSquareBracket);
				setState(716);
				match(CloseSquareBracket);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(717);
				match(OpenRoundBracket);
				setState(718);
				match(Arrow);
				setState(719);
				match(CloseRoundBracket);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(720);
				match(OpenRoundBracket);
				setState(721);
				match(Comma);
				setState(722);
				match(OCURLY);
				setState(723);
				match(Comma);
				setState(724);
				match(CCURLY);
				setState(725);
				match(CloseRoundBracket);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypecontextContext extends ParserRuleContext {
		public List<ClsContext> cls() {
			return getRuleContexts(ClsContext.class);
		}
		public ClsContext cls(int i) {
			return getRuleContext(ClsContext.class,i);
		}
		public TypecontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typecontext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTypecontext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTypecontext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTypecontext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypecontextContext typecontext() throws RecognitionException {
		TypecontextContext _localctx = new TypecontextContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_typecontext);
		int _la;
		try {
			setState(740);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(728);
				cls();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(729);
				match(OpenRoundBracket);
				setState(730);
				cls();
				setState(735);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(731);
					match(Comma);
					setState(732);
					cls();
					}
					}
					setState(737);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(738);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClsContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public List<AtypeContext> atype() {
			return getRuleContexts(AtypeContext.class);
		}
		public AtypeContext atype(int i) {
			return getRuleContext(AtypeContext.class,i);
		}
		public ClsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClsContext cls() throws RecognitionException {
		ClsContext _localctx = new ClsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_cls);
		int _la;
		try {
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(742);
				conid();
				setState(743);
				varid();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(745);
				qtycls();
				setState(746);
				match(OpenRoundBracket);
				setState(747);
				tyvar();
				{
				setState(748);
				atype();
				setState(753);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(749);
					match(Comma);
					setState(750);
					atype();
					}
					}
					setState(755);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(756);
				match(CloseRoundBracket);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScontextContext extends ParserRuleContext {
		public List<SimpleclassContext> simpleclass() {
			return getRuleContexts(SimpleclassContext.class);
		}
		public SimpleclassContext simpleclass(int i) {
			return getRuleContext(SimpleclassContext.class,i);
		}
		public ScontextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scontext; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterScontext(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitScontext(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitScontext(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScontextContext scontext() throws RecognitionException {
		ScontextContext _localctx = new ScontextContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_scontext);
		int _la;
		try {
			setState(773);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(760);
				simpleclass();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(761);
				match(OpenRoundBracket);
				setState(770);
				_la = _input.LA(1);
				if (_la==CONID) {
					{
					setState(762);
					simpleclass();
					setState(767);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(763);
						match(Comma);
						setState(764);
						simpleclass();
						}
						}
						setState(769);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(772);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleclassContext extends ParserRuleContext {
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public TyvarContext tyvar() {
			return getRuleContext(TyvarContext.class,0);
		}
		public SimpleclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSimpleclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSimpleclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSimpleclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleclassContext simpleclass() throws RecognitionException {
		SimpleclassContext _localctx = new SimpleclassContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_simpleclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			qtycls();
			setState(776);
			tyvar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpletypeContext extends ParserRuleContext {
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public List<TyvarContext> tyvar() {
			return getRuleContexts(TyvarContext.class);
		}
		public TyvarContext tyvar(int i) {
			return getRuleContext(TyvarContext.class,i);
		}
		public SimpletypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpletype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSimpletype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSimpletype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSimpletype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpletypeContext simpletype() throws RecognitionException {
		SimpletypeContext _localctx = new SimpletypeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_simpletype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(778);
			tycon();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (VARID - 36)))) != 0)) {
				{
				{
				setState(779);
				tyvar();
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrsContext extends ParserRuleContext {
		public List<ConstrContext> constr() {
			return getRuleContexts(ConstrContext.class);
		}
		public ConstrContext constr(int i) {
			return getRuleContext(ConstrContext.class,i);
		}
		public ConstrsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constrs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterConstrs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitConstrs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstrs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrsContext constrs() throws RecognitionException {
		ConstrsContext _localctx = new ConstrsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constrs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			constr();
			setState(790);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Pipe) {
				{
				{
				setState(786);
				match(Pipe);
				setState(787);
				constr();
				}
				}
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstrContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public List<AtypeContext> atype() {
			return getRuleContexts(AtypeContext.class);
		}
		public AtypeContext atype(int i) {
			return getRuleContext(AtypeContext.class,i);
		}
		public ConopContext conop() {
			return getRuleContext(ConopContext.class,0);
		}
		public List<BtypeContext> btype() {
			return getRuleContexts(BtypeContext.class);
		}
		public BtypeContext btype(int i) {
			return getRuleContext(BtypeContext.class,i);
		}
		public List<FielddeclContext> fielddecl() {
			return getRuleContexts(FielddeclContext.class);
		}
		public FielddeclContext fielddecl(int i) {
			return getRuleContext(FielddeclContext.class,i);
		}
		public ConstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterConstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitConstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstrContext constr() throws RecognitionException {
		ConstrContext _localctx = new ConstrContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_constr);
		int _la;
		try {
			setState(828);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(793);
				con();
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (Bang - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (OpenSquareBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					{
					setState(795);
					_la = _input.LA(1);
					if (_la==Bang) {
						{
						setState(794);
						match(Bang);
						}
					}

					setState(797);
					atype();
					}
					}
					setState(802);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(806);
				switch (_input.LA(1)) {
				case AS:
				case HIDING:
				case OpenRoundBracket:
				case OpenSquareBracket:
				case VARID:
				case CONID:
					{
					setState(803);
					btype();
					}
					break;
				case Bang:
					{
					{
					setState(804);
					match(Bang);
					setState(805);
					atype();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(808);
				conop();
				setState(812);
				switch (_input.LA(1)) {
				case AS:
				case HIDING:
				case OpenRoundBracket:
				case OpenSquareBracket:
				case VARID:
				case CONID:
					{
					setState(809);
					btype();
					}
					break;
				case Bang:
					{
					{
					setState(810);
					match(Bang);
					setState(811);
					atype();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(814);
				con();
				setState(815);
				match(OCURLY);
				setState(824);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)))) != 0)) {
					{
					setState(816);
					fielddecl();
					setState(821);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(817);
						match(Comma);
						setState(818);
						fielddecl();
						}
						}
						setState(823);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(826);
				match(CCURLY);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewconstrContext extends ParserRuleContext {
		public ConContext con() {
			return getRuleContext(ConContext.class,0);
		}
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public NewconstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newconstr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterNewconstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitNewconstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitNewconstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewconstrContext newconstr() throws RecognitionException {
		NewconstrContext _localctx = new NewconstrContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_newconstr);
		try {
			setState(840);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(830);
				con();
				setState(831);
				atype();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(833);
				con();
				setState(834);
				match(OCURLY);
				setState(835);
				var();
				setState(836);
				match(DoubleColon);
				setState(837);
				type();
				setState(838);
				match(CCURLY);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FielddeclContext extends ParserRuleContext {
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public AtypeContext atype() {
			return getRuleContext(AtypeContext.class,0);
		}
		public FielddeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fielddecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFielddecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFielddecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFielddecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FielddeclContext fielddecl() throws RecognitionException {
		FielddeclContext _localctx = new FielddeclContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_fielddecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(842);
			vars();
			setState(843);
			match(DoubleColon);
			setState(847);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case OpenRoundBracket:
			case OpenSquareBracket:
			case VARID:
			case CONID:
				{
				setState(844);
				type();
				}
				break;
			case Bang:
				{
				{
				setState(845);
				match(Bang);
				setState(846);
				atype();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DerivingContext extends ParserRuleContext {
		public TerminalNode DERIVING() { return getToken(HaskellParser.DERIVING, 0); }
		public List<DclassContext> dclass() {
			return getRuleContexts(DclassContext.class);
		}
		public DclassContext dclass(int i) {
			return getRuleContext(DclassContext.class,i);
		}
		public DerivingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deriving; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterDeriving(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitDeriving(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDeriving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DerivingContext deriving() throws RecognitionException {
		DerivingContext _localctx = new DerivingContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_deriving);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
			match(DERIVING);
			setState(863);
			switch (_input.LA(1)) {
			case CONID:
				{
				setState(850);
				dclass();
				}
				break;
			case OpenRoundBracket:
				{
				{
				setState(851);
				match(OpenRoundBracket);
				setState(860);
				_la = _input.LA(1);
				if (_la==CONID) {
					{
					setState(852);
					dclass();
					setState(857);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(853);
						match(Comma);
						setState(854);
						dclass();
						}
						}
						setState(859);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(862);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DclassContext extends ParserRuleContext {
		public QtyclsContext qtycls() {
			return getRuleContext(QtyclsContext.class,0);
		}
		public DclassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dclass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterDclass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitDclass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitDclass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DclassContext dclass() throws RecognitionException {
		DclassContext _localctx = new DclassContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dclass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			qtycls();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstContext extends ParserRuleContext {
		public GtyconContext gtycon() {
			return getRuleContext(GtyconContext.class,0);
		}
		public List<TyvarContext> tyvar() {
			return getRuleContexts(TyvarContext.class);
		}
		public TyvarContext tyvar(int i) {
			return getRuleContext(TyvarContext.class,i);
		}
		public List<TyconContext> tycon() {
			return getRuleContexts(TyconContext.class);
		}
		public TyconContext tycon(int i) {
			return getRuleContext(TyconContext.class,i);
		}
		public InstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterInst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitInst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstContext inst() throws RecognitionException {
		InstContext _localctx = new InstContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_inst);
		int _la;
		try {
			setState(911);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(867);
				gtycon();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(868);
				match(OpenRoundBracket);
				setState(869);
				gtycon();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (VARID - 36)))) != 0)) {
					{
					{
					setState(870);
					tyvar();
					}
					}
					setState(875);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(876);
				match(CloseRoundBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(878);
				match(OpenRoundBracket);
				setState(879);
				gtycon();
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CONID) {
					{
					{
					setState(880);
					tycon();
					}
					}
					setState(885);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(886);
				match(CloseRoundBracket);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(888);
				match(OpenRoundBracket);
				setState(889);
				tyvar();
				setState(890);
				match(Comma);
				setState(891);
				tyvar();
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(892);
					match(Comma);
					setState(893);
					tyvar();
					}
					}
					setState(898);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(899);
				match(CloseRoundBracket);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(901);
				match(OpenSquareBracket);
				setState(902);
				tyvar();
				setState(903);
				match(CloseSquareBracket);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(905);
				match(OpenRoundBracket);
				setState(906);
				tyvar();
				setState(907);
				match(Arrow);
				setState(908);
				tyvar();
				setState(909);
				match(CloseRoundBracket);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FdeclContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(HaskellParser.IMPORT, 0); }
		public CallconvContext callconv() {
			return getRuleContext(CallconvContext.class,0);
		}
		public ImpentContext impent() {
			return getRuleContext(ImpentContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SafetyContext safety() {
			return getRuleContext(SafetyContext.class,0);
		}
		public TerminalNode EXPORT() { return getToken(HaskellParser.EXPORT, 0); }
		public ExpentContext expent() {
			return getRuleContext(ExpentContext.class,0);
		}
		public FdeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fdecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFdecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFdecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFdecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FdeclContext fdecl() throws RecognitionException {
		FdeclContext _localctx = new FdeclContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fdecl);
		int _la;
		try {
			setState(930);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(913);
				match(IMPORT);
				setState(914);
				callconv();
				setState(916);
				_la = _input.LA(1);
				if (_la==SAFE || _la==UNSAFE) {
					{
					setState(915);
					safety();
					}
				}

				setState(918);
				impent();
				setState(919);
				var();
				setState(920);
				match(DoubleColon);
				setState(921);
				type();
				}
				}
				break;
			case EXPORT:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(923);
				match(EXPORT);
				setState(924);
				callconv();
				setState(925);
				expent();
				setState(926);
				var();
				setState(927);
				match(DoubleColon);
				setState(928);
				type();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallconvContext extends ParserRuleContext {
		public CallconvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callconv; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCallconv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCallconv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCallconv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallconvContext callconv() throws RecognitionException {
		CallconvContext _localctx = new CallconvContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_callconv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CCALL) | (1L << STDCALL) | (1L << CPPCALL) | (1L << JVMCALL) | (1L << DOTNETCALL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpentContext extends ParserRuleContext {
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public ImpentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterImpent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitImpent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitImpent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpentContext impent() throws RecognitionException {
		ImpentContext _localctx = new ImpentContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_impent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(934);
			pstring();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpentContext extends ParserRuleContext {
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public ExpentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterExpent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitExpent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExpent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpentContext expent() throws RecognitionException {
		ExpentContext _localctx = new ExpentContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_expent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			pstring();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SafetyContext extends ParserRuleContext {
		public SafetyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_safety; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSafety(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSafety(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSafety(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SafetyContext safety() throws RecognitionException {
		SafetyContext _localctx = new SafetyContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_safety);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(938);
			_la = _input.LA(1);
			if ( !(_la==SAFE || _la==UNSAFE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunlhsContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public List<ApatContext> apat() {
			return getRuleContexts(ApatContext.class);
		}
		public ApatContext apat(int i) {
			return getRuleContext(ApatContext.class,i);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public VaropContext varop() {
			return getRuleContext(VaropContext.class,0);
		}
		public FunlhsContext funlhs() {
			return getRuleContext(FunlhsContext.class,0);
		}
		public FunlhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funlhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFunlhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFunlhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFunlhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunlhsContext funlhs() throws RecognitionException {
		FunlhsContext _localctx = new FunlhsContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_funlhs);
		int _la;
		try {
			setState(958);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(940);
				var();
				setState(942); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(941);
					apat();
					}
					}
					setState(944); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (WILDCARD - 34)) | (1L << (AS - 34)) | (1L << (HIDING - 34)) | (1L << (Tilde - 34)) | (1L << (OpenRoundBracket - 34)) | (1L << (OpenSquareBracket - 34)) | (1L << (CHAR - 34)) | (1L << (STRING - 34)) | (1L << (VARID - 34)) | (1L << (CONID - 34)) | (1L << (DECIMAL - 34)) | (1L << (OCTAL - 34)) | (1L << (HEXADECIMAL - 34)) | (1L << (FLOAT - 34)))) != 0) );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(946);
				pat();
				setState(947);
				varop();
				setState(948);
				pat();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(950);
				match(OpenRoundBracket);
				setState(951);
				funlhs();
				setState(952);
				match(CloseRoundBracket);
				setState(954); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(953);
					apat();
					}
					}
					setState(956); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (WILDCARD - 34)) | (1L << (AS - 34)) | (1L << (HIDING - 34)) | (1L << (Tilde - 34)) | (1L << (OpenRoundBracket - 34)) | (1L << (OpenSquareBracket - 34)) | (1L << (CHAR - 34)) | (1L << (STRING - 34)) | (1L << (VARID - 34)) | (1L << (CONID - 34)) | (1L << (DECIMAL - 34)) | (1L << (OCTAL - 34)) | (1L << (HEXADECIMAL - 34)) | (1L << (FLOAT - 34)))) != 0) );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RhsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public GdrhsContext gdrhs() {
			return getRuleContext(GdrhsContext.class,0);
		}
		public RhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterRhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitRhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitRhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RhsContext rhs() throws RecognitionException {
		RhsContext _localctx = new RhsContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_rhs);
		int _la;
		try {
			setState(971);
			switch (_input.LA(1)) {
			case Eq:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(960);
				match(Eq);
				setState(961);
				exp();
				setState(964);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(962);
					match(WHERE);
					setState(963);
					decls();
					}
				}

				}
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(966);
				gdrhs();
				setState(969);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(967);
					match(WHERE);
					setState(968);
					decls();
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GdrhsContext extends ParserRuleContext {
		public List<GdrhContext> gdrh() {
			return getRuleContexts(GdrhContext.class);
		}
		public GdrhContext gdrh(int i) {
			return getRuleContext(GdrhContext.class,i);
		}
		public GdrhsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdrhs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGdrhs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGdrhs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdrhs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdrhsContext gdrhs() throws RecognitionException {
		GdrhsContext _localctx = new GdrhsContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_gdrhs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(974); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(973);
				gdrh();
				}
				}
				setState(976); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Pipe );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GdrhContext extends ParserRuleContext {
		public GuardsContext guards() {
			return getRuleContext(GuardsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GdrhContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdrh; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGdrh(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGdrh(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdrh(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdrhContext gdrh() throws RecognitionException {
		GdrhContext _localctx = new GdrhContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gdrh);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(978);
			match(Pipe);
			setState(979);
			guards();
			setState(980);
			match(Eq);
			setState(981);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardsContext extends ParserRuleContext {
		public List<GuardContext> guard() {
			return getRuleContexts(GuardContext.class);
		}
		public GuardContext guard(int i) {
			return getRuleContext(GuardContext.class,i);
		}
		public GuardsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guards; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGuards(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGuards(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGuards(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardsContext guards() throws RecognitionException {
		GuardsContext _localctx = new GuardsContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_guards);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(983);
			guard();
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(984);
				match(Comma);
				setState(985);
				guard();
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public GuardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGuard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGuard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGuard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GuardContext guard() throws RecognitionException {
		GuardContext _localctx = new GuardContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_guard);
		try {
			setState(998);
			switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(991);
				pat();
				setState(992);
				match(Revarrow);
				setState(993);
				infixexp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				match(LET);
				setState(996);
				decls();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				infixexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpContext extends ParserRuleContext {
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypecontextContext typecontext() {
			return getRuleContext(TypecontextContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_exp);
		try {
			setState(1010);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1000);
				infixexp();
				setState(1001);
				match(DoubleColon);
				setState(1005);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1002);
					typecontext();
					setState(1003);
					match(DoubleArrow);
					}
					break;
				}
				setState(1007);
				type();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1009);
				infixexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixexpContext extends ParserRuleContext {
		public LexpContext lexp() {
			return getRuleContext(LexpContext.class,0);
		}
		public QopContext qop() {
			return getRuleContext(QopContext.class,0);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public InfixexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterInfixexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitInfixexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInfixexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InfixexpContext infixexp() throws RecognitionException {
		InfixexpContext _localctx = new InfixexpContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_infixexp);
		try {
			setState(1019);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1012);
				lexp();
				setState(1013);
				qop();
				setState(1014);
				infixexp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1016);
				match(Minus);
				setState(1017);
				infixexp();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1018);
				lexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexpContext extends ParserRuleContext {
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<ApatContext> apat() {
			return getRuleContexts(ApatContext.class);
		}
		public ApatContext apat(int i) {
			return getRuleContext(ApatContext.class,i);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public TerminalNode IN() { return getToken(HaskellParser.IN, 0); }
		public TerminalNode IF() { return getToken(HaskellParser.IF, 0); }
		public TerminalNode THEN() { return getToken(HaskellParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(HaskellParser.ELSE, 0); }
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public IfgdpatsContext ifgdpats() {
			return getRuleContext(IfgdpatsContext.class,0);
		}
		public TerminalNode CASE() { return getToken(HaskellParser.CASE, 0); }
		public TerminalNode OF() { return getToken(HaskellParser.OF, 0); }
		public AltsContext alts() {
			return getRuleContext(AltsContext.class,0);
		}
		public TerminalNode DO() { return getToken(HaskellParser.DO, 0); }
		public StmtsContext stmts() {
			return getRuleContext(StmtsContext.class,0);
		}
		public FexpContext fexp() {
			return getRuleContext(FexpContext.class,0);
		}
		public LexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterLexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitLexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexpContext lexp() throws RecognitionException {
		LexpContext _localctx = new LexpContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_lexp);
		int _la;
		try {
			setState(1058);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1021);
				match(DoubleQuote);
				setState(1023); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1022);
					apat();
					}
					}
					setState(1025); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (WILDCARD - 34)) | (1L << (AS - 34)) | (1L << (HIDING - 34)) | (1L << (Tilde - 34)) | (1L << (OpenRoundBracket - 34)) | (1L << (OpenSquareBracket - 34)) | (1L << (CHAR - 34)) | (1L << (STRING - 34)) | (1L << (VARID - 34)) | (1L << (CONID - 34)) | (1L << (DECIMAL - 34)) | (1L << (OCTAL - 34)) | (1L << (HEXADECIMAL - 34)) | (1L << (FLOAT - 34)))) != 0) );
				setState(1027);
				match(Arrow);
				setState(1028);
				exp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1030);
				match(LET);
				setState(1031);
				decls();
				setState(1032);
				match(IN);
				setState(1033);
				exp();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1035);
				match(IF);
				setState(1036);
				exp();
				setState(1038);
				_la = _input.LA(1);
				if (_la==SEMI || _la==Semi) {
					{
					setState(1037);
					semi();
					}
				}

				setState(1040);
				match(THEN);
				setState(1041);
				exp();
				setState(1043);
				_la = _input.LA(1);
				if (_la==SEMI || _la==Semi) {
					{
					setState(1042);
					semi();
					}
				}

				setState(1045);
				match(ELSE);
				setState(1046);
				exp();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1048);
				match(IF);
				setState(1049);
				ifgdpats();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1050);
				match(CASE);
				setState(1051);
				exp();
				setState(1052);
				match(OF);
				setState(1053);
				alts();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1055);
				match(DO);
				setState(1056);
				stmts();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1057);
				fexp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FexpContext extends ParserRuleContext {
		public List<AexpContext> aexp() {
			return getRuleContexts(AexpContext.class);
		}
		public AexpContext aexp(int i) {
			return getRuleContext(AexpContext.class,i);
		}
		public FexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FexpContext fexp() throws RecognitionException {
		FexpContext _localctx = new FexpContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_fexp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1061); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1060);
					aexp();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1063); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AexpContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public GconContext gcon() {
			return getRuleContext(GconContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public List<QualContext> qual() {
			return getRuleContexts(QualContext.class);
		}
		public QualContext qual(int i) {
			return getRuleContext(QualContext.class,i);
		}
		public InfixexpContext infixexp() {
			return getRuleContext(InfixexpContext.class,0);
		}
		public QopContext qop() {
			return getRuleContext(QopContext.class,0);
		}
		public QconContext qcon() {
			return getRuleContext(QconContext.class,0);
		}
		public List<FbindContext> fbind() {
			return getRuleContexts(FbindContext.class);
		}
		public FbindContext fbind(int i) {
			return getRuleContext(FbindContext.class,i);
		}
		public AexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterAexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitAexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AexpContext aexp() throws RecognitionException {
		AexpContext _localctx = new AexpContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_aexp);
		int _la;
		try {
			int _alt;
			setState(1156);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1065);
				qvar();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1066);
				gcon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1067);
				literal();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(1068);
				match(OpenRoundBracket);
				setState(1069);
				exp();
				setState(1070);
				match(CloseRoundBracket);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(1072);
				match(OpenRoundBracket);
				setState(1073);
				exp();
				setState(1074);
				match(Comma);
				setState(1075);
				exp();
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1076);
					match(Comma);
					setState(1077);
					exp();
					}
					}
					setState(1082);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1083);
				match(CloseRoundBracket);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1085);
				match(OpenSquareBracket);
				setState(1086);
				exp();
				setState(1091);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1087);
					match(Comma);
					setState(1088);
					exp();
					}
					}
					setState(1093);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1094);
				match(CloseSquareBracket);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1096);
				match(OpenSquareBracket);
				setState(1097);
				exp();
				setState(1100);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(1098);
					match(Comma);
					setState(1099);
					exp();
					}
				}

				setState(1102);
				match(DoubleDot);
				setState(1104);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OCURLY) | (1L << CASE) | (1L << DO) | (1L << IF) | (1L << LET) | (1L << AS) | (1L << HIDING) | (1L << Minus))) != 0) || ((((_la - 72)) & ~0x3f) == 0 && ((1L << (_la - 72)) & ((1L << (OpenRoundBracket - 72)) | (1L << (OpenSquareBracket - 72)) | (1L << (DoubleQuote - 72)) | (1L << (CHAR - 72)) | (1L << (STRING - 72)) | (1L << (VARID - 72)) | (1L << (CONID - 72)) | (1L << (DECIMAL - 72)) | (1L << (OCTAL - 72)) | (1L << (HEXADECIMAL - 72)) | (1L << (FLOAT - 72)))) != 0)) {
					{
					setState(1103);
					exp();
					}
				}

				setState(1106);
				match(CloseSquareBracket);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1108);
				match(OpenSquareBracket);
				setState(1109);
				exp();
				setState(1110);
				match(Pipe);
				setState(1111);
				qual();
				setState(1116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1112);
					match(Comma);
					setState(1113);
					qual();
					}
					}
					setState(1118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1119);
				match(CloseSquareBracket);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1121);
				match(OpenRoundBracket);
				setState(1122);
				infixexp();
				setState(1123);
				qop();
				setState(1124);
				match(CloseRoundBracket);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(1126);
				match(OpenRoundBracket);
				setState(1127);
				qop();
				setState(1128);
				infixexp();
				setState(1129);
				match(CloseRoundBracket);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(1131);
				qcon();
				setState(1132);
				match(OCURLY);
				setState(1137);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					setState(1133);
					fbind();
					{
					setState(1134);
					match(Comma);
					setState(1135);
					fbind();
					}
					}
				}

				setState(1139);
				match(CCURLY);
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1152); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1141);
						match(OCURLY);
						setState(1142);
						fbind();
						setState(1147);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1143);
							match(Comma);
							setState(1144);
							fbind();
							}
							}
							setState(1149);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(1150);
						match(CCURLY);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1154); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public QualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQual(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualContext qual() throws RecognitionException {
		QualContext _localctx = new QualContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_qual);
		try {
			setState(1165);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1158);
				pat();
				setState(1159);
				match(Revarrow);
				setState(1160);
				exp();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1162);
				match(LET);
				setState(1163);
				decls();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1164);
				exp();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltsContext extends ParserRuleContext {
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<AltContext> alt() {
			return getRuleContexts(AltContext.class);
		}
		public AltContext alt(int i) {
			return getRuleContext(AltContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public AltsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterAlts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitAlts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAlts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltsContext alts() throws RecognitionException {
		AltsContext _localctx = new AltsContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_alts);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			open();
			setState(1174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1168);
				alt();
				setState(1170); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1169);
					semi();
					}
					}
					setState(1172); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SEMI || _la==Semi );
				}
				}
				setState(1176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (WILDCARD - 34)) | (1L << (AS - 34)) | (1L << (HIDING - 34)) | (1L << (Minus - 34)) | (1L << (Tilde - 34)) | (1L << (OpenRoundBracket - 34)) | (1L << (OpenSquareBracket - 34)) | (1L << (CHAR - 34)) | (1L << (STRING - 34)) | (1L << (VARID - 34)) | (1L << (CONID - 34)) | (1L << (DECIMAL - 34)) | (1L << (OCTAL - 34)) | (1L << (HEXADECIMAL - 34)) | (1L << (FLOAT - 34)))) != 0) );
			setState(1178);
			close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AltContext extends ParserRuleContext {
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(HaskellParser.WHERE, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public GdpatsContext gdpats() {
			return getRuleContext(GdpatsContext.class,0);
		}
		public AltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_alt);
		int _la;
		try {
			setState(1193);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1180);
				pat();
				setState(1181);
				match(Arrow);
				setState(1182);
				exp();
				setState(1185);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1183);
					match(WHERE);
					setState(1184);
					decls();
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1187);
				pat();
				setState(1188);
				gdpats();
				setState(1191);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1189);
					match(WHERE);
					setState(1190);
					decls();
					}
				}

				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GdpatsContext extends ParserRuleContext {
		public List<GdpatContext> gdpat() {
			return getRuleContexts(GdpatContext.class);
		}
		public GdpatContext gdpat(int i) {
			return getRuleContext(GdpatContext.class,i);
		}
		public GdpatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdpats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGdpats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGdpats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdpats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdpatsContext gdpats() throws RecognitionException {
		GdpatsContext _localctx = new GdpatsContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_gdpats);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1195);
					gdpat();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfgdpatsContext extends ParserRuleContext {
		public GdpatsContext gdpats() {
			return getRuleContext(GdpatsContext.class,0);
		}
		public IfgdpatsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifgdpats; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterIfgdpats(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitIfgdpats(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitIfgdpats(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfgdpatsContext ifgdpats() throws RecognitionException {
		IfgdpatsContext _localctx = new IfgdpatsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_ifgdpats);
		try {
			setState(1205);
			switch (_input.LA(1)) {
			case OCURLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1200);
				match(OCURLY);
				setState(1201);
				gdpats();
				setState(1202);
				match(CCURLY);
				}
				break;
			case Pipe:
				enterOuterAlt(_localctx, 2);
				{
				setState(1204);
				gdpats();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GdpatContext extends ParserRuleContext {
		public GuardsContext guards() {
			return getRuleContext(GuardsContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public GdpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gdpat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGdpat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGdpat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGdpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GdpatContext gdpat() throws RecognitionException {
		GdpatContext _localctx = new GdpatContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_gdpat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1207);
			match(Pipe);
			setState(1208);
			guards();
			setState(1209);
			match(Arrow);
			setState(1210);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtsContext extends ParserRuleContext {
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public CloseContext close() {
			return getRuleContext(CloseContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public StmtsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterStmts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitStmts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStmts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtsContext stmts() throws RecognitionException {
		StmtsContext _localctx = new StmtsContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_stmts);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
			open();
			setState(1216);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1213);
					stmt();
					}
					} 
				}
				setState(1218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			setState(1219);
			exp();
			setState(1223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI || _la==Semi) {
				{
				{
				setState(1220);
				semi();
				}
				}
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1226);
			close();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<SemiContext> semi() {
			return getRuleContexts(SemiContext.class);
		}
		public SemiContext semi(int i) {
			return getRuleContext(SemiContext.class,i);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public TerminalNode LET() { return getToken(HaskellParser.LET, 0); }
		public DeclsContext decls() {
			return getRuleContext(DeclsContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_stmt);
		try {
			int _alt;
			setState(1254);
			switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1228);
				exp();
				setState(1230); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1229);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1232); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,147,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1234);
				pat();
				setState(1235);
				match(Revarrow);
				setState(1236);
				exp();
				setState(1238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1237);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1242);
				match(LET);
				setState(1243);
				decls();
				setState(1245); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1244);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1247); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1250); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1249);
						semi();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1252); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,150,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FbindContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FbindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fbind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFbind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFbind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFbind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FbindContext fbind() throws RecognitionException {
		FbindContext _localctx = new FbindContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_fbind);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1256);
			qvar();
			setState(1257);
			match(Eq);
			setState(1258);
			exp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatContext extends ParserRuleContext {
		public LpatContext lpat() {
			return getRuleContext(LpatContext.class,0);
		}
		public QconopContext qconop() {
			return getRuleContext(QconopContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public PatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatContext pat() throws RecognitionException {
		PatContext _localctx = new PatContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_pat);
		try {
			setState(1265);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1260);
				lpat();
				setState(1261);
				qconop();
				setState(1262);
				pat();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1264);
				lpat();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LpatContext extends ParserRuleContext {
		public List<ApatContext> apat() {
			return getRuleContexts(ApatContext.class);
		}
		public ApatContext apat(int i) {
			return getRuleContext(ApatContext.class,i);
		}
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PfloatContext pfloat() {
			return getRuleContext(PfloatContext.class,0);
		}
		public GconContext gcon() {
			return getRuleContext(GconContext.class,0);
		}
		public LpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lpat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterLpat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitLpat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LpatContext lpat() throws RecognitionException {
		LpatContext _localctx = new LpatContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_lpat);
		try {
			int _alt;
			setState(1279);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				apat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1268);
				match(Minus);
				setState(1271);
				switch (_input.LA(1)) {
				case DECIMAL:
				case OCTAL:
				case HEXADECIMAL:
					{
					setState(1269);
					integer();
					}
					break;
				case FLOAT:
					{
					setState(1270);
					pfloat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1273);
				gcon();
				setState(1275); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1274);
						apat();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1277); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ApatContext extends ParserRuleContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public ApatContext apat() {
			return getRuleContext(ApatContext.class,0);
		}
		public GconContext gcon() {
			return getRuleContext(GconContext.class,0);
		}
		public QconContext qcon() {
			return getRuleContext(QconContext.class,0);
		}
		public List<FpatContext> fpat() {
			return getRuleContexts(FpatContext.class);
		}
		public FpatContext fpat(int i) {
			return getRuleContext(FpatContext.class,i);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public List<PatContext> pat() {
			return getRuleContexts(PatContext.class);
		}
		public PatContext pat(int i) {
			return getRuleContext(PatContext.class,i);
		}
		public ApatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_apat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterApat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitApat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitApat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApatContext apat() throws RecognitionException {
		ApatContext _localctx = new ApatContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_apat);
		int _la;
		try {
			setState(1333);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1281);
				var();
				setState(1284);
				switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
				case 1:
					{
					setState(1282);
					match(Atsign);
					setState(1283);
					apat();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1286);
				gcon();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1287);
				qcon();
				setState(1288);
				match(OCURLY);
				setState(1297);
				_la = _input.LA(1);
				if (((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (OpenRoundBracket - 36)) | (1L << (VARID - 36)) | (1L << (CONID - 36)))) != 0)) {
					{
					setState(1289);
					fpat();
					setState(1294);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1290);
						match(Comma);
						setState(1291);
						fpat();
						}
						}
						setState(1296);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1299);
				match(CCURLY);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1301);
				literal();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1302);
				match(WILDCARD);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(1303);
				match(OpenRoundBracket);
				setState(1304);
				pat();
				setState(1305);
				match(CloseRoundBracket);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(1307);
				match(OpenRoundBracket);
				setState(1308);
				pat();
				setState(1309);
				match(Comma);
				setState(1310);
				pat();
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1311);
					match(Comma);
					setState(1312);
					pat();
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1318);
				match(CloseRoundBracket);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(1320);
				match(OpenSquareBracket);
				setState(1321);
				pat();
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(1322);
					match(Comma);
					setState(1323);
					pat();
					}
					}
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1329);
				match(CloseSquareBracket);
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				{
				setState(1331);
				match(Tilde);
				setState(1332);
				apat();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FpatContext extends ParserRuleContext {
		public QvarContext qvar() {
			return getRuleContext(QvarContext.class,0);
		}
		public PatContext pat() {
			return getRuleContext(PatContext.class,0);
		}
		public FpatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fpat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterFpat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitFpat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitFpat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FpatContext fpat() throws RecognitionException {
		FpatContext _localctx = new FpatContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_fpat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			qvar();
			setState(1336);
			match(Eq);
			setState(1337);
			pat();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GconContext extends ParserRuleContext {
		public QconContext qcon() {
			return getRuleContext(QconContext.class,0);
		}
		public GconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gcon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GconContext gcon() throws RecognitionException {
		GconContext _localctx = new GconContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_gcon);
		int _la;
		try {
			setState(1351);
			switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1339);
				match(OpenRoundBracket);
				setState(1340);
				match(CloseRoundBracket);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1341);
				match(OpenSquareBracket);
				setState(1342);
				match(CloseSquareBracket);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(1343);
				match(OpenRoundBracket);
				setState(1345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1344);
					match(Comma);
					}
					}
					setState(1347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==Comma );
				setState(1349);
				match(CloseRoundBracket);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1350);
				qcon();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_var);
		try {
			setState(1358);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case VARID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1353);
				varid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1354);
				match(OpenRoundBracket);
				setState(1355);
				varsym();
				setState(1356);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QvarContext extends ParserRuleContext {
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public QvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvarContext qvar() throws RecognitionException {
		QvarContext _localctx = new QvarContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_qvar);
		try {
			setState(1365);
			switch (_input.LA(1)) {
			case AS:
			case HIDING:
			case VARID:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				qvarid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1361);
				match(OpenRoundBracket);
				setState(1362);
				qvarsym();
				setState(1363);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public ConContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterCon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitCon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitCon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConContext con() throws RecognitionException {
		ConContext _localctx = new ConContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_con);
		try {
			setState(1372);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				conid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1368);
				match(OpenRoundBracket);
				setState(1369);
				consym();
				setState(1370);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QconContext extends ParserRuleContext {
		public QconidContext qconid() {
			return getRuleContext(QconidContext.class,0);
		}
		public GconsymContext gconsym() {
			return getRuleContext(GconsymContext.class,0);
		}
		public QconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qcon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQcon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQcon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQcon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconContext qcon() throws RecognitionException {
		QconContext _localctx = new QconContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_qcon);
		try {
			setState(1379);
			switch (_input.LA(1)) {
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1374);
				qconid();
				}
				break;
			case OpenRoundBracket:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1375);
				match(OpenRoundBracket);
				setState(1376);
				gconsym();
				setState(1377);
				match(CloseRoundBracket);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VaropContext extends ParserRuleContext {
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public VaropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterVarop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitVarop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaropContext varop() throws RecognitionException {
		VaropContext _localctx = new VaropContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_varop);
		try {
			setState(1386);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case DoubleQuote:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				varsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1382);
				match(BackQuote);
				setState(1383);
				varid();
				setState(1384);
				match(BackQuote);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QvaropContext extends ParserRuleContext {
		public QvarsymContext qvarsym() {
			return getRuleContext(QvarsymContext.class,0);
		}
		public QvaridContext qvarid() {
			return getRuleContext(QvaridContext.class,0);
		}
		public QvaropContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQvarop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQvarop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvaropContext qvarop() throws RecognitionException {
		QvaropContext _localctx = new QvaropContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_qvarop);
		try {
			setState(1393);
			switch (_input.LA(1)) {
			case Hash:
			case Less:
			case Greater:
			case Ampersand:
			case Pipe:
			case Bang:
			case Caret:
			case Plus:
			case Minus:
			case Asterisk:
			case Percent:
			case Divide:
			case Tilde:
			case Atsign:
			case Dollar:
			case Dot:
			case QuestionMark:
			case Colon:
			case Eq:
			case DoubleQuote:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1388);
				qvarsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1389);
				match(BackQuote);
				setState(1390);
				qvarid();
				setState(1391);
				match(BackQuote);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConopContext extends ParserRuleContext {
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ConopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterConop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitConop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConopContext conop() throws RecognitionException {
		ConopContext _localctx = new ConopContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conop);
		try {
			setState(1400);
			switch (_input.LA(1)) {
			case Colon:
				enterOuterAlt(_localctx, 1);
				{
				setState(1395);
				consym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1396);
				match(BackQuote);
				setState(1397);
				conid();
				setState(1398);
				match(BackQuote);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QconopContext extends ParserRuleContext {
		public GconsymContext gconsym() {
			return getRuleContext(GconsymContext.class,0);
		}
		public QconidContext qconid() {
			return getRuleContext(QconidContext.class,0);
		}
		public QconopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQconop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQconop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconopContext qconop() throws RecognitionException {
		QconopContext _localctx = new QconopContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_qconop);
		try {
			setState(1407);
			switch (_input.LA(1)) {
			case Colon:
			case CONID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1402);
				gconsym();
				}
				break;
			case BackQuote:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1403);
				match(BackQuote);
				setState(1404);
				qconid();
				setState(1405);
				match(BackQuote);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public VaropContext varop() {
			return getRuleContext(VaropContext.class,0);
		}
		public ConopContext conop() {
			return getRuleContext(ConopContext.class,0);
		}
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_op);
		try {
			setState(1411);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1409);
				varop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1410);
				conop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QopContext extends ParserRuleContext {
		public QvaropContext qvarop() {
			return getRuleContext(QvaropContext.class,0);
		}
		public QconopContext qconop() {
			return getRuleContext(QconopContext.class,0);
		}
		public QopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QopContext qop() throws RecognitionException {
		QopContext _localctx = new QopContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_qop);
		try {
			setState(1415);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1413);
				qvarop();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1414);
				qconop();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GconsymContext extends ParserRuleContext {
		public QconsymContext qconsym() {
			return getRuleContext(QconsymContext.class,0);
		}
		public GconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gconsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterGconsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitGconsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitGconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GconsymContext gconsym() throws RecognitionException {
		GconsymContext _localctx = new GconsymContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_gconsym);
		try {
			setState(1419);
			switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1417);
				match(Colon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1418);
				qconsym();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpenContext extends ParserRuleContext {
		public TerminalNode VOCURLY() { return getToken(HaskellParser.VOCURLY, 0); }
		public TerminalNode OCURLY() { return getToken(HaskellParser.OCURLY, 0); }
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_open);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			_la = _input.LA(1);
			if ( !(_la==OCURLY || _la==VOCURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CloseContext extends ParserRuleContext {
		public TerminalNode VCCURLY() { return getToken(HaskellParser.VCCURLY, 0); }
		public TerminalNode CCURLY() { return getToken(HaskellParser.CCURLY, 0); }
		public CloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseContext close() throws RecognitionException {
		CloseContext _localctx = new CloseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_close);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			_la = _input.LA(1);
			if ( !(_la==CCURLY || _la==VCCURLY) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SemiContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(HaskellParser.SEMI, 0); }
		public SemiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_semi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSemi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSemi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSemi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SemiContext semi() throws RecognitionException {
		SemiContext _localctx = new SemiContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_semi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			_la = _input.LA(1);
			if ( !(_la==SEMI || _la==Semi) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public PfloatContext pfloat() {
			return getRuleContext(PfloatContext.class,0);
		}
		public PcharContext pchar() {
			return getRuleContext(PcharContext.class,0);
		}
		public PstringContext pstring() {
			return getRuleContext(PstringContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_literal);
		try {
			setState(1431);
			switch (_input.LA(1)) {
			case DECIMAL:
			case OCTAL:
			case HEXADECIMAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1427);
				integer();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				pfloat();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1429);
				pchar();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1430);
				pstring();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialContext extends ParserRuleContext {
		public SpecialContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_special; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSpecial(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSpecial(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSpecial(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialContext special() throws RecognitionException {
		SpecialContext _localctx = new SpecialContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_special);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			_la = _input.LA(1);
			if ( !(_la==OCURLY || _la==CCURLY || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (Semi - 69)) | (1L << (OpenRoundBracket - 69)) | (1L << (CloseRoundBracket - 69)) | (1L << (OpenSquareBracket - 69)) | (1L << (CloseSquareBracket - 69)) | (1L << (Comma - 69)) | (1L << (BackQuote - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VaridContext extends ParserRuleContext {
		public TerminalNode VARID() { return getToken(HaskellParser.VARID, 0); }
		public TerminalNode AS() { return getToken(HaskellParser.AS, 0); }
		public TerminalNode HIDING() { return getToken(HaskellParser.HIDING, 0); }
		public VaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterVarid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitVarid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VaridContext varid() throws RecognitionException {
		VaridContext _localctx = new VaridContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_varid);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			_la = _input.LA(1);
			if ( !(((((_la - 36)) & ~0x3f) == 0 && ((1L << (_la - 36)) & ((1L << (AS - 36)) | (1L << (HIDING - 36)) | (1L << (VARID - 36)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(1439);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1436);
					match(Hash);
					}
					} 
				}
				setState(1441);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConidContext extends ParserRuleContext {
		public TerminalNode CONID() { return getToken(HaskellParser.CONID, 0); }
		public ConidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterConid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitConid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConidContext conid() throws RecognitionException {
		ConidContext _localctx = new ConidContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_conid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1442);
			match(CONID);
			setState(1446);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1443);
					match(Hash);
					}
					} 
				}
				setState(1448);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,177,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SymbolContext extends ParserRuleContext {
		public AscSymbolContext ascSymbol() {
			return getRuleContext(AscSymbolContext.class,0);
		}
		public SymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SymbolContext symbol() throws RecognitionException {
		SymbolContext _localctx = new SymbolContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1449);
			ascSymbol();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AscSymbolContext extends ParserRuleContext {
		public AscSymbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascSymbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterAscSymbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitAscSymbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitAscSymbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AscSymbolContext ascSymbol() throws RecognitionException {
		AscSymbolContext _localctx = new AscSymbolContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_ascSymbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1451);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Hash - 53)) | (1L << (Less - 53)) | (1L << (Greater - 53)) | (1L << (Ampersand - 53)) | (1L << (Pipe - 53)) | (1L << (Bang - 53)) | (1L << (Caret - 53)) | (1L << (Plus - 53)) | (1L << (Minus - 53)) | (1L << (Asterisk - 53)) | (1L << (Percent - 53)) | (1L << (Divide - 53)) | (1L << (Tilde - 53)) | (1L << (Atsign - 53)) | (1L << (Dollar - 53)) | (1L << (Dot - 53)) | (1L << (QuestionMark - 53)) | (1L << (Colon - 53)) | (1L << (Eq - 53)) | (1L << (DoubleQuote - 53)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarsymContext extends ParserRuleContext {
		public List<AscSymbolContext> ascSymbol() {
			return getRuleContexts(AscSymbolContext.class);
		}
		public AscSymbolContext ascSymbol(int i) {
			return getRuleContext(AscSymbolContext.class,i);
		}
		public VarsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterVarsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitVarsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitVarsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsymContext varsym() throws RecognitionException {
		VarsymContext _localctx = new VarsymContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_varsym);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1454); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1453);
					ascSymbol();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1456); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,178,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsymContext extends ParserRuleContext {
		public List<AscSymbolContext> ascSymbol() {
			return getRuleContexts(AscSymbolContext.class);
		}
		public AscSymbolContext ascSymbol(int i) {
			return getRuleContext(AscSymbolContext.class,i);
		}
		public ConsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterConsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitConsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitConsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsymContext consym() throws RecognitionException {
		ConsymContext _localctx = new ConsymContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_consym);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			match(Colon);
			setState(1462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1459);
					ascSymbol();
					}
					} 
				}
				setState(1464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyvarContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public TyvarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tyvar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTyvar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTyvar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTyvar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyvarContext tyvar() throws RecognitionException {
		TyvarContext _localctx = new TyvarContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_tyvar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			varid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyconContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public TyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTycon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTycon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyconContext tycon() throws RecognitionException {
		TyconContext _localctx = new TyconContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tycon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			conid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TyclsContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public TyclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tycls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterTycls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitTycls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitTycls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TyclsContext tycls() throws RecognitionException {
		TyclsContext _localctx = new TyclsContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_tycls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			conid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModidContext extends ParserRuleContext {
		public List<ConidContext> conid() {
			return getRuleContexts(ConidContext.class);
		}
		public ConidContext conid(int i) {
			return getRuleContext(ConidContext.class,i);
		}
		public ModidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterModid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitModid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitModid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModidContext modid() throws RecognitionException {
		ModidContext _localctx = new ModidContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_modid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1471);
					conid();
					setState(1472);
					match(Dot);
					}
					} 
				}
				setState(1478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,180,_ctx);
			}
			setState(1479);
			conid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QvaridContext extends ParserRuleContext {
		public VaridContext varid() {
			return getRuleContext(VaridContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QvaridContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQvarid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQvarid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvaridContext qvarid() throws RecognitionException {
		QvaridContext _localctx = new QvaridContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_qvarid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1484);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(1481);
				modid();
				setState(1482);
				match(Dot);
				}
			}

			setState(1486);
			varid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QconidContext extends ParserRuleContext {
		public ConidContext conid() {
			return getRuleContext(ConidContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QconidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQconid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQconid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconidContext qconid() throws RecognitionException {
		QconidContext _localctx = new QconidContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_qconid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1491);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1488);
				modid();
				setState(1489);
				match(Dot);
				}
				break;
			}
			setState(1493);
			conid();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QtyconContext extends ParserRuleContext {
		public TyconContext tycon() {
			return getRuleContext(TyconContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QtyconContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtycon; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQtycon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQtycon(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtycon(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyconContext qtycon() throws RecognitionException {
		QtyconContext _localctx = new QtyconContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_qtycon);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1498);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				{
				setState(1495);
				modid();
				setState(1496);
				match(Dot);
				}
				break;
			}
			setState(1500);
			tycon();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QtyclsContext extends ParserRuleContext {
		public TyclsContext tycls() {
			return getRuleContext(TyclsContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QtyclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qtycls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQtycls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQtycls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQtycls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QtyclsContext qtycls() throws RecognitionException {
		QtyclsContext _localctx = new QtyclsContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_qtycls);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1502);
				modid();
				setState(1503);
				match(Dot);
				}
				break;
			}
			setState(1507);
			tycls();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QvarsymContext extends ParserRuleContext {
		public VarsymContext varsym() {
			return getRuleContext(VarsymContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QvarsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qvarsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQvarsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQvarsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQvarsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QvarsymContext qvarsym() throws RecognitionException {
		QvarsymContext _localctx = new QvarsymContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_qvarsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(1509);
				modid();
				setState(1510);
				match(Dot);
				}
			}

			setState(1514);
			varsym();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QconsymContext extends ParserRuleContext {
		public ConsymContext consym() {
			return getRuleContext(ConsymContext.class,0);
		}
		public ModidContext modid() {
			return getRuleContext(ModidContext.class,0);
		}
		public QconsymContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qconsym; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterQconsym(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitQconsym(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitQconsym(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QconsymContext qconsym() throws RecognitionException {
		QconsymContext _localctx = new QconsymContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_qconsym);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1519);
			_la = _input.LA(1);
			if (_la==CONID) {
				{
				setState(1516);
				modid();
				setState(1517);
				match(Dot);
				}
			}

			setState(1521);
			consym();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DECIMAL() { return getToken(HaskellParser.DECIMAL, 0); }
		public TerminalNode OCTAL() { return getToken(HaskellParser.OCTAL, 0); }
		public TerminalNode HEXADECIMAL() { return getToken(HaskellParser.HEXADECIMAL, 0); }
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			_la = _input.LA(1);
			if ( !(((((_la - 88)) & ~0x3f) == 0 && ((1L << (_la - 88)) & ((1L << (DECIMAL - 88)) | (1L << (OCTAL - 88)) | (1L << (HEXADECIMAL - 88)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PfloatContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(HaskellParser.FLOAT, 0); }
		public PfloatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pfloat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPfloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPfloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPfloat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PfloatContext pfloat() throws RecognitionException {
		PfloatContext _localctx = new PfloatContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_pfloat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1525);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PcharContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(HaskellParser.CHAR, 0); }
		public PcharContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pchar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPchar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPchar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPchar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PcharContext pchar() throws RecognitionException {
		PcharContext _localctx = new PcharContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_pchar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1527);
			match(CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PstringContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(HaskellParser.STRING, 0); }
		public PstringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pstring; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).enterPstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HaskellParserListener ) ((HaskellParserListener)listener).exitPstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HaskellParserVisitor ) return ((HaskellParserVisitor<? extends T>)visitor).visitPstring(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PstringContext pstring() throws RecognitionException {
		PstringContext _localctx = new PstringContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_pstring);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1529);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3`\u05fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\3\2\7\2\u00dc\n\2\f\2\16\2\u00df\13\2\3\2\5\2\u00e2\n\2"+
		"\3\2\7\2\u00e5\n\2\f\2\16\2\u00e8\13\2\3\2\3\2\3\2\5\2\u00ed\n\2\3\2\3"+
		"\2\3\2\3\2\3\2\7\2\u00f4\n\2\f\2\16\2\u00f7\13\2\3\2\5\2\u00fa\n\2\3\2"+
		"\3\2\3\3\6\3\u00ff\n\3\r\3\16\3\u0100\3\4\3\4\3\4\3\4\3\4\7\4\u0108\n"+
		"\4\f\4\16\4\u010b\13\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u0116\n"+
		"\6\3\7\3\7\3\7\6\7\u011b\n\7\r\7\16\7\u011c\3\b\3\b\3\b\3\b\7\b\u0123"+
		"\n\b\f\b\16\b\u0126\13\b\5\b\u0128\n\b\3\b\5\b\u012b\n\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0138\n\t\f\t\16\t\u013b\13\t\5\t\u013d"+
		"\n\t\3\t\5\t\u0140\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u014a\n\t\f"+
		"\t\16\t\u014d\13\t\5\t\u014f\n\t\3\t\5\t\u0152\n\t\3\t\3\t\5\t\u0156\n"+
		"\t\3\n\3\n\5\n\u015a\n\n\3\n\3\n\3\n\5\n\u015f\n\n\3\n\5\n\u0162\n\n\3"+
		"\n\6\n\u0165\n\n\r\n\16\n\u0166\3\13\3\13\3\13\3\13\7\13\u016d\n\13\f"+
		"\13\16\13\u0170\13\13\3\13\5\13\u0173\n\13\5\13\u0175\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u017d\n\13\f\13\16\13\u0180\13\13\3\13\5\13\u0183"+
		"\n\13\5\13\u0185\n\13\3\13\5\13\u0188\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\7\f\u0193\n\f\f\f\16\f\u0196\13\f\5\f\u0198\n\f\3\f\5\f\u019b"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u01a5\n\f\f\f\16\f\u01a8\13\f"+
		"\5\f\u01aa\n\f\3\f\5\f\u01ad\n\f\5\f\u01af\n\f\3\r\3\r\5\r\u01b3\n\r\3"+
		"\16\3\16\6\16\u01b7\n\16\r\16\16\16\u01b8\3\16\3\16\6\16\u01bd\n\16\r"+
		"\16\16\16\u01be\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u01ca"+
		"\n\17\3\17\3\17\3\17\5\17\u01cf\n\17\3\17\5\17\u01d2\n\17\3\17\3\17\3"+
		"\17\3\17\5\17\u01d8\n\17\3\17\3\17\3\17\3\17\5\17\u01de\n\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01e4\n\17\3\17\3\17\3\17\3\17\5\17\u01ea\n\17\3\17\3"+
		"\17\3\17\3\17\5\17\u01f0\n\17\3\17\3\17\3\17\3\17\5\17\u01f6\n\17\3\17"+
		"\3\17\3\17\3\17\3\17\7\17\u01fd\n\17\f\17\16\17\u0200\13\17\5\17\u0202"+
		"\n\17\3\17\3\17\3\17\3\17\5\17\u0208\n\17\3\20\3\20\3\20\6\20\u020d\n"+
		"\20\r\20\16\20\u020e\7\20\u0211\n\20\f\20\16\20\u0214\13\20\3\20\3\20"+
		"\7\20\u0218\n\20\f\20\16\20\u021b\13\20\5\20\u021d\n\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0233\n\21\3\21\3\21\3\21\6\21\u0238\n\21\r\21\16"+
		"\21\u0239\5\21\u023c\n\21\3\22\3\22\3\22\7\22\u0241\n\22\f\22\16\22\u0244"+
		"\13\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\6\24\u024d\n\24\r\24\16\24\u024e"+
		"\7\24\u0251\n\24\f\24\16\24\u0254\13\24\3\24\3\24\7\24\u0258\n\24\f\24"+
		"\16\24\u025b\13\24\5\24\u025d\n\24\3\24\3\24\3\25\3\25\3\25\5\25\u0264"+
		"\n\25\3\25\3\25\5\25\u0268\n\25\3\26\3\26\3\26\6\26\u026d\n\26\r\26\16"+
		"\26\u026e\7\26\u0271\n\26\f\26\16\26\u0274\13\26\3\26\3\26\7\26\u0278"+
		"\n\26\f\26\16\26\u027b\13\26\5\26\u027d\n\26\3\26\3\26\3\27\3\27\5\27"+
		"\u0283\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\5\30\u028c\n\30\3\30\3"+
		"\30\3\30\3\30\5\30\u0292\n\30\3\30\3\30\5\30\u0296\n\30\3\31\3\31\3\31"+
		"\7\31\u029b\n\31\f\31\16\31\u029e\13\31\3\32\3\32\3\32\7\32\u02a3\n\32"+
		"\f\32\16\32\u02a6\13\32\3\33\3\33\3\34\3\34\3\34\5\34\u02ad\n\34\3\35"+
		"\6\35\u02b0\n\35\r\35\16\35\u02b1\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u02ba"+
		"\n\36\f\36\16\36\u02bd\13\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\5\36\u02c9\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\5\37\u02d9\n\37\3 \3 \3 \3 \3 \7 \u02e0\n \f"+
		" \16 \u02e3\13 \3 \3 \5 \u02e7\n \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u02f2"+
		"\n!\f!\16!\u02f5\13!\3!\3!\5!\u02f9\n!\3\"\3\"\3\"\3\"\3\"\7\"\u0300\n"+
		"\"\f\"\16\"\u0303\13\"\5\"\u0305\n\"\3\"\5\"\u0308\n\"\3#\3#\3#\3$\3$"+
		"\7$\u030f\n$\f$\16$\u0312\13$\3%\3%\3%\7%\u0317\n%\f%\16%\u031a\13%\3"+
		"&\3&\5&\u031e\n&\3&\7&\u0321\n&\f&\16&\u0324\13&\3&\3&\3&\5&\u0329\n&"+
		"\3&\3&\3&\3&\5&\u032f\n&\3&\3&\3&\3&\3&\7&\u0336\n&\f&\16&\u0339\13&\5"+
		"&\u033b\n&\3&\3&\5&\u033f\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u034b\n\'\3(\3(\3(\3(\3(\5(\u0352\n(\3)\3)\3)\3)\3)\3)\7)\u035a\n)"+
		"\f)\16)\u035d\13)\5)\u035f\n)\3)\5)\u0362\n)\3*\3*\3+\3+\3+\3+\7+\u036a"+
		"\n+\f+\16+\u036d\13+\3+\3+\3+\3+\3+\7+\u0374\n+\f+\16+\u0377\13+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\7+\u0381\n+\f+\16+\u0384\13+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\5+\u0392\n+\3,\3,\3,\5,\u0397\n,\3,\3,\3,\3,\3,\3,\3,"+
		"\3,\3,\3,\3,\3,\5,\u03a5\n,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\6\61"+
		"\u03b1\n\61\r\61\16\61\u03b2\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\6"+
		"\61\u03bd\n\61\r\61\16\61\u03be\5\61\u03c1\n\61\3\62\3\62\3\62\3\62\5"+
		"\62\u03c7\n\62\3\62\3\62\3\62\5\62\u03cc\n\62\5\62\u03ce\n\62\3\63\6\63"+
		"\u03d1\n\63\r\63\16\63\u03d2\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7"+
		"\65\u03dd\n\65\f\65\16\65\u03e0\13\65\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\5\66\u03e9\n\66\3\67\3\67\3\67\3\67\3\67\5\67\u03f0\n\67\3\67\3\67"+
		"\3\67\5\67\u03f5\n\67\38\38\38\38\38\38\38\58\u03fe\n8\39\39\69\u0402"+
		"\n9\r9\169\u0403\39\39\39\39\39\39\39\39\39\39\39\59\u0411\n9\39\39\3"+
		"9\59\u0416\n9\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u0425\n9\3:\6"+
		":\u0428\n:\r:\16:\u0429\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u0439"+
		"\n;\f;\16;\u043c\13;\3;\3;\3;\3;\3;\3;\7;\u0444\n;\f;\16;\u0447\13;\3"+
		";\3;\3;\3;\3;\3;\5;\u044f\n;\3;\3;\5;\u0453\n;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\7;\u045d\n;\f;\16;\u0460\13;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\5;\u0474\n;\3;\3;\3;\3;\3;\3;\7;\u047c\n;\f;\16;\u047f"+
		"\13;\3;\3;\6;\u0483\n;\r;\16;\u0484\5;\u0487\n;\3<\3<\3<\3<\3<\3<\3<\5"+
		"<\u0490\n<\3=\3=\3=\6=\u0495\n=\r=\16=\u0496\6=\u0499\n=\r=\16=\u049a"+
		"\3=\3=\3>\3>\3>\3>\3>\5>\u04a4\n>\3>\3>\3>\3>\5>\u04aa\n>\5>\u04ac\n>"+
		"\3?\6?\u04af\n?\r?\16?\u04b0\3@\3@\3@\3@\3@\5@\u04b8\n@\3A\3A\3A\3A\3"+
		"A\3B\3B\7B\u04c1\nB\fB\16B\u04c4\13B\3B\3B\7B\u04c8\nB\fB\16B\u04cb\13"+
		"B\3B\3B\3C\3C\6C\u04d1\nC\rC\16C\u04d2\3C\3C\3C\3C\6C\u04d9\nC\rC\16C"+
		"\u04da\3C\3C\3C\6C\u04e0\nC\rC\16C\u04e1\3C\6C\u04e5\nC\rC\16C\u04e6\5"+
		"C\u04e9\nC\3D\3D\3D\3D\3E\3E\3E\3E\3E\5E\u04f4\nE\3F\3F\3F\3F\5F\u04fa"+
		"\nF\3F\3F\6F\u04fe\nF\rF\16F\u04ff\5F\u0502\nF\3G\3G\3G\5G\u0507\nG\3"+
		"G\3G\3G\3G\3G\3G\7G\u050f\nG\fG\16G\u0512\13G\5G\u0514\nG\3G\3G\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\7G\u0524\nG\fG\16G\u0527\13G\3G\3G\3G\3"+
		"G\3G\3G\7G\u052f\nG\fG\16G\u0532\13G\3G\3G\3G\3G\5G\u0538\nG\3H\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\3I\6I\u0544\nI\rI\16I\u0545\3I\3I\5I\u054a\nI\3J\3"+
		"J\3J\3J\3J\5J\u0551\nJ\3K\3K\3K\3K\3K\5K\u0558\nK\3L\3L\3L\3L\3L\5L\u055f"+
		"\nL\3M\3M\3M\3M\3M\5M\u0566\nM\3N\3N\3N\3N\3N\5N\u056d\nN\3O\3O\3O\3O"+
		"\3O\5O\u0574\nO\3P\3P\3P\3P\3P\5P\u057b\nP\3Q\3Q\3Q\3Q\3Q\5Q\u0582\nQ"+
		"\3R\3R\5R\u0586\nR\3S\3S\5S\u058a\nS\3T\3T\5T\u058e\nT\3U\3U\3V\3V\3W"+
		"\3W\3X\3X\3X\3X\5X\u059a\nX\3Y\3Y\3Z\3Z\7Z\u05a0\nZ\fZ\16Z\u05a3\13Z\3"+
		"[\3[\7[\u05a7\n[\f[\16[\u05aa\13[\3\\\3\\\3]\3]\3^\6^\u05b1\n^\r^\16^"+
		"\u05b2\3_\3_\7_\u05b7\n_\f_\16_\u05ba\13_\3`\3`\3a\3a\3b\3b\3c\3c\3c\7"+
		"c\u05c5\nc\fc\16c\u05c8\13c\3c\3c\3d\3d\3d\5d\u05cf\nd\3d\3d\3e\3e\3e"+
		"\5e\u05d6\ne\3e\3e\3f\3f\3f\5f\u05dd\nf\3f\3f\3g\3g\3g\5g\u05e4\ng\3g"+
		"\3g\3h\3h\3h\5h\u05eb\nh\3h\3h\3i\3i\3i\5i\u05f2\ni\3i\3i\3j\3j\3k\3k"+
		"\3l\3l\3m\3m\3m\2\2n\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\2\f\3\2\31\32\3\2,\60\3\2\61\62\4\2\b\b"+
		"\n\n\4\2\t\t\13\13\4\2\f\fGG\7\2\b\tGGJMPPUU\4\2&\'XX\6\2\67FIIQRTT\3"+
		"\2Z\\\u068c\2\u00dd\3\2\2\2\4\u00fe\3\2\2\2\6\u0102\3\2\2\2\b\u010e\3"+
		"\2\2\2\n\u0115\3\2\2\2\f\u011a\3\2\2\2\16\u011e\3\2\2\2\20\u0155\3\2\2"+
		"\2\22\u0157\3\2\2\2\24\u0187\3\2\2\2\26\u01ae\3\2\2\2\30\u01b2\3\2\2\2"+
		"\32\u01bc\3\2\2\2\34\u0207\3\2\2\2\36\u0209\3\2\2\2 \u023b\3\2\2\2\"\u023d"+
		"\3\2\2\2$\u0245\3\2\2\2&\u0249\3\2\2\2(\u0267\3\2\2\2*\u0269\3\2\2\2,"+
		"\u0282\3\2\2\2.\u0295\3\2\2\2\60\u0297\3\2\2\2\62\u029f\3\2\2\2\64\u02a7"+
		"\3\2\2\2\66\u02a9\3\2\2\28\u02af\3\2\2\2:\u02c8\3\2\2\2<\u02d8\3\2\2\2"+
		">\u02e6\3\2\2\2@\u02f8\3\2\2\2B\u0307\3\2\2\2D\u0309\3\2\2\2F\u030c\3"+
		"\2\2\2H\u0313\3\2\2\2J\u033e\3\2\2\2L\u034a\3\2\2\2N\u034c\3\2\2\2P\u0353"+
		"\3\2\2\2R\u0363\3\2\2\2T\u0391\3\2\2\2V\u03a4\3\2\2\2X\u03a6\3\2\2\2Z"+
		"\u03a8\3\2\2\2\\\u03aa\3\2\2\2^\u03ac\3\2\2\2`\u03c0\3\2\2\2b\u03cd\3"+
		"\2\2\2d\u03d0\3\2\2\2f\u03d4\3\2\2\2h\u03d9\3\2\2\2j\u03e8\3\2\2\2l\u03f4"+
		"\3\2\2\2n\u03fd\3\2\2\2p\u0424\3\2\2\2r\u0427\3\2\2\2t\u0486\3\2\2\2v"+
		"\u048f\3\2\2\2x\u0491\3\2\2\2z\u04ab\3\2\2\2|\u04ae\3\2\2\2~\u04b7\3\2"+
		"\2\2\u0080\u04b9\3\2\2\2\u0082\u04be\3\2\2\2\u0084\u04e8\3\2\2\2\u0086"+
		"\u04ea\3\2\2\2\u0088\u04f3\3\2\2\2\u008a\u0501\3\2\2\2\u008c\u0537\3\2"+
		"\2\2\u008e\u0539\3\2\2\2\u0090\u0549\3\2\2\2\u0092\u0550\3\2\2\2\u0094"+
		"\u0557\3\2\2\2\u0096\u055e\3\2\2\2\u0098\u0565\3\2\2\2\u009a\u056c\3\2"+
		"\2\2\u009c\u0573\3\2\2\2\u009e\u057a\3\2\2\2\u00a0\u0581\3\2\2\2\u00a2"+
		"\u0585\3\2\2\2\u00a4\u0589\3\2\2\2\u00a6\u058d\3\2\2\2\u00a8\u058f\3\2"+
		"\2\2\u00aa\u0591\3\2\2\2\u00ac\u0593\3\2\2\2\u00ae\u0599\3\2\2\2\u00b0"+
		"\u059b\3\2\2\2\u00b2\u059d\3\2\2\2\u00b4\u05a4\3\2\2\2\u00b6\u05ab\3\2"+
		"\2\2\u00b8\u05ad\3\2\2\2\u00ba\u05b0\3\2\2\2\u00bc\u05b4\3\2\2\2\u00be"+
		"\u05bb\3\2\2\2\u00c0\u05bd\3\2\2\2\u00c2\u05bf\3\2\2\2\u00c4\u05c6\3\2"+
		"\2\2\u00c6\u05ce\3\2\2\2\u00c8\u05d5\3\2\2\2\u00ca\u05dc\3\2\2\2\u00cc"+
		"\u05e3\3\2\2\2\u00ce\u05ea\3\2\2\2\u00d0\u05f1\3\2\2\2\u00d2\u05f5\3\2"+
		"\2\2\u00d4\u05f7\3\2\2\2\u00d6\u05f9\3\2\2\2\u00d8\u05fb\3\2\2\2\u00da"+
		"\u00dc\5\u00acW\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e2\5\4\3\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e6\3\2"+
		"\2\2\u00e3\u00e5\5\u00acW\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f9\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e9\u00ea\7\36\2\2\u00ea\u00ec\5\u00c4c\2\u00eb\u00ed\5\16\b\2"+
		"\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef"+
		"\7#\2\2\u00ef\u00f0\5\u00a8U\2\u00f0\u00f1\5\n\6\2\u00f1\u00f5\5\u00aa"+
		"V\2\u00f2\u00f4\5\u00acW\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f8\u00fa\5\n\6\2\u00f9\u00e9\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa"+
		"\u00fb\3\2\2\2\u00fb\u00fc\7\2\2\3\u00fc\3\3\2\2\2\u00fd\u00ff\5\6\4\2"+
		"\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\5\3\2\2\2\u0102\u0103\7N\2\2\u0103\u0104\7(\2\2\u0104\u0109"+
		"\5\b\5\2\u0105\u0106\7P\2\2\u0106\u0108\5\b\5\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010b\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\3\2"+
		"\2\2\u010b\u0109\3\2\2\2\u010c\u010d\7O\2\2\u010d\7\3\2\2\2\u010e\u010f"+
		"\5\u00b4[\2\u010f\t\3\2\2\2\u0110\u0111\5\f\7\2\u0111\u0112\5\32\16\2"+
		"\u0112\u0116\3\2\2\2\u0113\u0116\5\f\7\2\u0114\u0116\5\32\16\2\u0115\u0110"+
		"\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116\13\3\2\2\2\u0117"+
		"\u011b\5\22\n\2\u0118\u011b\7\3\2\2\u0119\u011b\5\u00acW\2\u011a\u0117"+
		"\3\2\2\2\u011a\u0118\3\2\2\2\u011a\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\r\3\2\2\2\u011e\u0127\7J\2\2"+
		"\u011f\u0124\5\20\t\2\u0120\u0121\7P\2\2\u0121\u0123\5\20\t\2\u0122\u0120"+
		"\3\2\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125"+
		"\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0127\u011f\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128\u012a\3\2\2\2\u0129\u012b\7P\2\2\u012a\u0129\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\7K\2\2\u012d\17\3\2\2\2"+
		"\u012e\u0156\5\u0094K\2\u012f\u013f\5\u00caf\2\u0130\u0131\7J\2\2\u0131"+
		"\u0132\7H\2\2\u0132\u0140\7K\2\2\u0133\u013c\7J\2\2\u0134\u0139\5\30\r"+
		"\2\u0135\u0136\7P\2\2\u0136\u0138\5\30\r\2\u0137\u0135\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013e\u0140\7K\2\2\u013f\u0130\3\2\2\2\u013f\u0133\3\2\2\2\u013f"+
		"\u0140\3\2\2\2\u0140\u0156\3\2\2\2\u0141\u0151\5\u00ccg\2\u0142\u0143"+
		"\7J\2\2\u0143\u0144\7H\2\2\u0144\u0152\7K\2\2\u0145\u014e\7J\2\2\u0146"+
		"\u014b\5\u0094K\2\u0147\u0148\7P\2\2\u0148\u014a\5\u0094K\2\u0149\u0147"+
		"\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0146\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0152\7K\2\2\u0151\u0142\3\2\2\2\u0151"+
		"\u0145\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0156\3\2\2\2\u0153\u0154\7\36"+
		"\2\2\u0154\u0156\5\u00c4c\2\u0155\u012e\3\2\2\2\u0155\u012f\3\2\2\2\u0155"+
		"\u0141\3\2\2\2\u0155\u0153\3\2\2\2\u0156\21\3\2\2\2\u0157\u0159\7\27\2"+
		"\2\u0158\u015a\7%\2\2\u0159\u0158\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015e\5\u00c4c\2\u015c\u015d\7&\2\2\u015d\u015f\5\u00c4"+
		"c\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161\3\2\2\2\u0160"+
		"\u0162\5\24\13\2\u0161\u0160\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3"+
		"\2\2\2\u0163\u0165\5\u00acW\2\u0164\u0163\3\2\2\2\u0165\u0166\3\2\2\2"+
		"\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\23\3\2\2\2\u0168\u0174"+
		"\7J\2\2\u0169\u016e\5\26\f\2\u016a\u016b\7P\2\2\u016b\u016d\5\26\f\2\u016c"+
		"\u016a\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0173\7P\2\2\u0172"+
		"\u0171\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0169\3\2"+
		"\2\2\u0174\u0175\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0188\7K\2\2\u0177"+
		"\u0178\7\'\2\2\u0178\u0184\7J\2\2\u0179\u017e\5\26\f\2\u017a\u017b\7P"+
		"\2\2\u017b\u017d\5\26\f\2\u017c\u017a\3\2\2\2\u017d\u0180\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2"+
		"\2\2\u0181\u0183\7P\2\2\u0182\u0181\3\2\2\2\u0182\u0183\3\2\2\2\u0183"+
		"\u0185\3\2\2\2\u0184\u0179\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0188\7K\2\2\u0187\u0168\3\2\2\2\u0187\u0177\3\2\2\2\u0188"+
		"\25\3\2\2\2\u0189\u01af\5\u0092J\2\u018a\u019a\5\u00c0a\2\u018b\u018c"+
		"\7J\2\2\u018c\u018d\7H\2\2\u018d\u019b\7K\2\2\u018e\u0197\7J\2\2\u018f"+
		"\u0194\5\30\r\2\u0190\u0191\7P\2\2\u0191\u0193\5\30\r\2\u0192\u0190\3"+
		"\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195"+
		"\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u018f\3\2\2\2\u0197\u0198\3\2"+
		"\2\2\u0198\u0199\3\2\2\2\u0199\u019b\7K\2\2\u019a\u018b\3\2\2\2\u019a"+
		"\u018e\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01af\3\2\2\2\u019c\u01ac\5\u00c2"+
		"b\2\u019d\u019e\7J\2\2\u019e\u019f\7H\2\2\u019f\u01ad\7K\2\2\u01a0\u01a9"+
		"\7J\2\2\u01a1\u01a6\5\u0092J\2\u01a2\u01a3\7P\2\2\u01a3\u01a5\5\u0092"+
		"J\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01a1\3\2"+
		"\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ad\7K\2\2\u01ac"+
		"\u019d\3\2\2\2\u01ac\u01a0\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u0189\3\2\2\2\u01ae\u018a\3\2\2\2\u01ae\u019c\3\2\2\2\u01af"+
		"\27\3\2\2\2\u01b0\u01b3\5\u0092J\2\u01b1\u01b3\5\u0096L\2\u01b2\u01b0"+
		"\3\2\2\2\u01b2\u01b1\3\2\2\2\u01b3\31\3\2\2\2\u01b4\u01b6\5\34\17\2\u01b5"+
		"\u01b7\5\u00acW\2\u01b6\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b6"+
		"\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bd\3\2\2\2\u01ba\u01bd\7\3\2\2\u01bb"+
		"\u01bd\5\u00acW\2\u01bc\u01b4\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bb"+
		"\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\33\3\2\2\2\u01c0\u01c1\7\"\2\2\u01c1\u01c2\5F$\2\u01c2\u01c3\7R\2\2\u01c3"+
		"\u01c4\5\66\34\2\u01c4\u0208\3\2\2\2\u01c5\u01c9\7\17\2\2\u01c6\u01c7"+
		"\5> \2\u01c7\u01c8\7\63\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c6\3\2\2\2\u01c9"+
		"\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01ce\5F$\2\u01cc\u01cd\7R\2"+
		"\2\u01cd\u01cf\5H%\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d1"+
		"\3\2\2\2\u01d0\u01d2\5P)\2\u01d1\u01d0\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2"+
		"\u0208\3\2\2\2\u01d3\u01d7\7\37\2\2\u01d4\u01d5\5> \2\u01d5\u01d6\7\63"+
		"\2\2\u01d6\u01d8\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\5F$\2\u01da\u01db\7R\2\2\u01db\u01dd\5L\'\2"+
		"\u01dc\u01de\5P)\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u0208"+
		"\3\2\2\2\u01df\u01e3\7\16\2\2\u01e0\u01e1\5B\"\2\u01e1\u01e2\7\63\2\2"+
		"\u01e2\u01e4\3\2\2\2\u01e3\u01e0\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e5"+
		"\3\2\2\2\u01e5\u01e6\5\u00c2b\2\u01e6\u01e9\5\u00be`\2\u01e7\u01e8\7#"+
		"\2\2\u01e8\u01ea\5&\24\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea"+
		"\u0208\3\2\2\2\u01eb\u01ef\7\34\2\2\u01ec\u01ed\5B\"\2\u01ed\u01ee\7\63"+
		"\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ec\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f2\5\u00ccg\2\u01f2\u01f5\5T+\2\u01f3\u01f4\7"+
		"#\2\2\u01f4\u01f6\5*\26\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u0208\3\2\2\2\u01f7\u01f8\7\20\2\2\u01f8\u0201\7J\2\2\u01f9\u01fe\5\66"+
		"\34\2\u01fa\u01fb\7P\2\2\u01fb\u01fd\5\66\34\2\u01fc\u01fa\3\2\2\2\u01fd"+
		"\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0201\u01f9\3\2\2\2\u0201\u0202\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0208\7K\2\2\u0204\u0205\7\25\2\2\u0205\u0208\5V"+
		",\2\u0206\u0208\5 \21\2\u0207\u01c0\3\2\2\2\u0207\u01c5\3\2\2\2\u0207"+
		"\u01d3\3\2\2\2\u0207\u01df\3\2\2\2\u0207\u01eb\3\2\2\2\u0207\u01f7\3\2"+
		"\2\2\u0207\u0204\3\2\2\2\u0207\u0206\3\2\2\2\u0208\35\3\2\2\2\u0209\u021c"+
		"\5\u00a8U\2\u020a\u020c\5 \21\2\u020b\u020d\5\u00acW\2\u020c\u020b\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u020a\3\2\2\2\u0211\u0214\3\2\2\2\u0212\u0210\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2\2\2\u0214\u0212\3\2\2\2\u0215"+
		"\u0219\5 \21\2\u0216\u0218\5\u00acW\2\u0217\u0216\3\2\2\2\u0218\u021b"+
		"\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021d\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021c\u0212\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e\u021f\5\u00aaV\2\u021f\37\3\2\2\2\u0220\u0221\7N\2\2\u0221"+
		"\u0222\7)\2\2\u0222\u0223\5\u0094K\2\u0223\u0224\7O\2\2\u0224\u023c\3"+
		"\2\2\2\u0225\u0226\7N\2\2\u0226\u0227\7*\2\2\u0227\u0228\5\u0094K\2\u0228"+
		"\u0229\7O\2\2\u0229\u023c\3\2\2\2\u022a\u022b\7N\2\2\u022b\u022c\7+\2"+
		"\2\u022c\u022d\5\"\22\2\u022d\u022e\7O\2\2\u022e\u023c\3\2\2\2\u022f\u023c"+
		"\5.\30\2\u0230\u0233\5`\61\2\u0231\u0233\5\u0088E\2\u0232\u0230\3\2\2"+
		"\2\u0232\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\5b\62\2\u0235\u023c"+
		"\3\2\2\2\u0236\u0238\5\u00acW\2\u0237\u0236\3\2\2\2\u0238\u0239\3\2\2"+
		"\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023c\3\2\2\2\u023b\u0220"+
		"\3\2\2\2\u023b\u0225\3\2\2\2\u023b\u022a\3\2\2\2\u023b\u022f\3\2\2\2\u023b"+
		"\u0232\3\2\2\2\u023b\u0237\3\2\2\2\u023c!\3\2\2\2\u023d\u0242\5$\23\2"+
		"\u023e\u023f\7P\2\2\u023f\u0241\5$\23\2\u0240\u023e\3\2\2\2\u0241\u0244"+
		"\3\2\2\2\u0242\u0240\3\2\2\2\u0242\u0243\3\2\2\2\u0243#\3\2\2\2\u0244"+
		"\u0242\3\2\2\2\u0245\u0246\5\62\32\2\u0246\u0247\7\64\2\2\u0247\u0248"+
		"\5\66\34\2\u0248%\3\2\2\2\u0249\u025c\5\u00a8U\2\u024a\u024c\5(\25\2\u024b"+
		"\u024d\5\u00acW\2\u024c\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u0251\3\2\2\2\u0250\u024a\3\2\2\2\u0251"+
		"\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2"+
		"\2\2\u0254\u0252\3\2\2\2\u0255\u0259\5(\25\2\u0256\u0258\5\u00acW\2\u0257"+
		"\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259\u025a\3\2"+
		"\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0252\3\2\2\2\u025c"+
		"\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\5\u00aaV\2\u025f\'\3\2"+
		"\2\2\u0260\u0268\5.\30\2\u0261\u0264\5`\61\2\u0262\u0264\5\u0092J\2\u0263"+
		"\u0261\3\2\2\2\u0263\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\5b"+
		"\62\2\u0266\u0268\3\2\2\2\u0267\u0260\3\2\2\2\u0267\u0263\3\2\2\2\u0268"+
		")\3\2\2\2\u0269\u027c\5\u00a8U\2\u026a\u026c\5,\27\2\u026b\u026d\5\u00ac"+
		"W\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026c\3\2\2\2\u026e"+
		"\u026f\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026a\3\2\2\2\u0271\u0274\3\2"+
		"\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274"+
		"\u0272\3\2\2\2\u0275\u0279\5,\27\2\u0276\u0278\5\u00acW\2\u0277\u0276"+
		"\3\2\2\2\u0278\u027b\3\2\2\2\u0279\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a"+
		"\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027c\u0272\3\2\2\2\u027c\u027d\3\2"+
		"\2\2\u027d\u027e\3\2\2\2\u027e\u027f\5\u00aaV\2\u027f+\3\2\2\2\u0280\u0283"+
		"\5`\61\2\u0281\u0283\5\u0092J\2\u0282\u0280\3\2\2\2\u0282\u0281\3\2\2"+
		"\2\u0283\u0284\3\2\2\2\u0284\u0285\5b\62\2\u0285-\3\2\2\2\u0286\u0287"+
		"\5\62\32\2\u0287\u028b\7\64\2\2\u0288\u0289\5> \2\u0289\u028a\7\63\2\2"+
		"\u028a\u028c\3\2\2\2\u028b\u0288\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u028e\5\66\34\2\u028e\u0296\3\2\2\2\u028f\u0291\5\64\33"+
		"\2\u0290\u0292\7Z\2\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\3\2\2\2\u0293\u0294\5\60\31\2\u0294\u0296\3\2\2\2\u0295\u0286\3\2\2\2"+
		"\u0295\u028f\3\2\2\2\u0296/\3\2\2\2\u0297\u029c\5\u00a2R\2\u0298\u0299"+
		"\7P\2\2\u0299\u029b\5\u00a2R\2\u029a\u0298\3\2\2\2\u029b\u029e\3\2\2\2"+
		"\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\61\3\2\2\2\u029e\u029c"+
		"\3\2\2\2\u029f\u02a4\5\u0092J\2\u02a0\u02a1\7P\2\2\u02a1\u02a3\5\u0092"+
		"J\2\u02a2\u02a0\3\2\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\63\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a7\u02a8\t\2\2"+
		"\2\u02a8\65\3\2\2\2\u02a9\u02ac\58\35\2\u02aa\u02ab\7\65\2\2\u02ab\u02ad"+
		"\5\66\34\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad\3\2\2\2\u02ad\67\3\2\2\2\u02ae"+
		"\u02b0\5:\36\2\u02af\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02af\3\2"+
		"\2\2\u02b1\u02b2\3\2\2\2\u02b29\3\2\2\2\u02b3\u02c9\5<\37\2\u02b4\u02c9"+
		"\5\u00b2Z\2\u02b5\u02b6\7J\2\2\u02b6\u02bb\5\66\34\2\u02b7\u02b8\7P\2"+
		"\2\u02b8\u02ba\5\66\34\2\u02b9\u02b7\3\2\2\2\u02ba\u02bd\3\2\2\2\u02bb"+
		"\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2\2\2\u02bd\u02bb\3\2"+
		"\2\2\u02be\u02bf\7K\2\2\u02bf\u02c9\3\2\2\2\u02c0\u02c1\7L\2\2\u02c1\u02c2"+
		"\5\66\34\2\u02c2\u02c3\7M\2\2\u02c3\u02c9\3\2\2\2\u02c4\u02c5\7J\2\2\u02c5"+
		"\u02c6\5\66\34\2\u02c6\u02c7\7K\2\2\u02c7\u02c9\3\2\2\2\u02c8\u02b3\3"+
		"\2\2\2\u02c8\u02b4\3\2\2\2\u02c8\u02b5\3\2\2\2\u02c8\u02c0\3\2\2\2\u02c8"+
		"\u02c4\3\2\2\2\u02c9;\3\2\2\2\u02ca\u02d9\5\u00caf\2\u02cb\u02cc\7J\2"+
		"\2\u02cc\u02d9\7K\2\2\u02cd\u02ce\7L\2\2\u02ce\u02d9\7M\2\2\u02cf\u02d0"+
		"\7J\2\2\u02d0\u02d1\7\65\2\2\u02d1\u02d9\7K\2\2\u02d2\u02d3\7J\2\2\u02d3"+
		"\u02d4\7P\2\2\u02d4\u02d5\7\b\2\2\u02d5\u02d6\7P\2\2\u02d6\u02d7\7\t\2"+
		"\2\u02d7\u02d9\7K\2\2\u02d8\u02ca\3\2\2\2\u02d8\u02cb\3\2\2\2\u02d8\u02cd"+
		"\3\2\2\2\u02d8\u02cf\3\2\2\2\u02d8\u02d2\3\2\2\2\u02d9=\3\2\2\2\u02da"+
		"\u02e7\5@!\2\u02db\u02dc\7J\2\2\u02dc\u02e1\5@!\2\u02dd\u02de\7P\2\2\u02de"+
		"\u02e0\5@!\2\u02df\u02dd\3\2\2\2\u02e0\u02e3\3\2\2\2\u02e1\u02df\3\2\2"+
		"\2\u02e1\u02e2\3\2\2\2\u02e2\u02e4\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e4\u02e5"+
		"\7K\2\2\u02e5\u02e7\3\2\2\2\u02e6\u02da\3\2\2\2\u02e6\u02db\3\2\2\2\u02e7"+
		"?\3\2\2\2\u02e8\u02e9\5\u00b4[\2\u02e9\u02ea\5\u00b2Z\2\u02ea\u02f9\3"+
		"\2\2\2\u02eb\u02ec\5\u00ccg\2\u02ec\u02ed\7J\2\2\u02ed\u02ee\5\u00be`"+
		"\2\u02ee\u02f3\5:\36\2\u02ef\u02f0\7P\2\2\u02f0\u02f2\5:\36\2\u02f1\u02ef"+
		"\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2\2\2\u02f4"+
		"\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\7K\2\2\u02f7\u02f9\3\2"+
		"\2\2\u02f8\u02e8\3\2\2\2\u02f8\u02eb\3\2\2\2\u02f9A\3\2\2\2\u02fa\u0308"+
		"\5D#\2\u02fb\u0304\7J\2\2\u02fc\u0301\5D#\2\u02fd\u02fe\7P\2\2\u02fe\u0300"+
		"\5D#\2\u02ff\u02fd\3\2\2\2\u0300\u0303\3\2\2\2\u0301\u02ff\3\2\2\2\u0301"+
		"\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303\u0301\3\2\2\2\u0304\u02fc\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\7K\2\2\u0307"+
		"\u02fa\3\2\2\2\u0307\u02fb\3\2\2\2\u0308C\3\2\2\2\u0309\u030a\5\u00cc"+
		"g\2\u030a\u030b\5\u00be`\2\u030bE\3\2\2\2\u030c\u0310\5\u00c0a\2\u030d"+
		"\u030f\5\u00be`\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e"+
		"\3\2\2\2\u0310\u0311\3\2\2\2\u0311G\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0318\5J&\2\u0314\u0315\7;\2\2\u0315\u0317\5J&\2\u0316\u0314\3\2\2\2"+
		"\u0317\u031a\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319I\3"+
		"\2\2\2\u031a\u0318\3\2\2\2\u031b\u0322\5\u0096L\2\u031c\u031e\7<\2\2\u031d"+
		"\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0321\5:"+
		"\36\2\u0320\u031d\3\2\2\2\u0321\u0324\3\2\2\2\u0322\u0320\3\2\2\2\u0322"+
		"\u0323\3\2\2\2\u0323\u033f\3\2\2\2\u0324\u0322\3\2\2\2\u0325\u0329\58"+
		"\35\2\u0326\u0327\7<\2\2\u0327\u0329\5:\36\2\u0328\u0325\3\2\2\2\u0328"+
		"\u0326\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032e\5\u009eP\2\u032b\u032f"+
		"\58\35\2\u032c\u032d\7<\2\2\u032d\u032f\5:\36\2\u032e\u032b\3\2\2\2\u032e"+
		"\u032c\3\2\2\2\u032f\u033f\3\2\2\2\u0330\u0331\5\u0096L\2\u0331\u033a"+
		"\7\b\2\2\u0332\u0337\5N(\2\u0333\u0334\7P\2\2\u0334\u0336\5N(\2\u0335"+
		"\u0333\3\2\2\2\u0336\u0339\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2"+
		"\2\2\u0338\u033b\3\2\2\2\u0339\u0337\3\2\2\2\u033a\u0332\3\2\2\2\u033a"+
		"\u033b\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\7\t\2\2\u033d\u033f\3\2"+
		"\2\2\u033e\u031b\3\2\2\2\u033e\u0328\3\2\2\2\u033e\u0330\3\2\2\2\u033f"+
		"K\3\2\2\2\u0340\u0341\5\u0096L\2\u0341\u0342\5:\36\2\u0342\u034b\3\2\2"+
		"\2\u0343\u0344\5\u0096L\2\u0344\u0345\7\b\2\2\u0345\u0346\5\u0092J\2\u0346"+
		"\u0347\7\64\2\2\u0347\u0348\5\66\34\2\u0348\u0349\7\t\2\2\u0349\u034b"+
		"\3\2\2\2\u034a\u0340\3\2\2\2\u034a\u0343\3\2\2\2\u034bM\3\2\2\2\u034c"+
		"\u034d\5\62\32\2\u034d\u0351\7\64\2\2\u034e\u0352\5\66\34\2\u034f\u0350"+
		"\7<\2\2\u0350\u0352\5:\36\2\u0351\u034e\3\2\2\2\u0351\u034f\3\2\2\2\u0352"+
		"O\3\2\2\2\u0353\u0361\7\21\2\2\u0354\u0362\5R*\2\u0355\u035e\7J\2\2\u0356"+
		"\u035b\5R*\2\u0357\u0358\7P\2\2\u0358\u035a\5R*\2\u0359\u0357\3\2\2\2"+
		"\u035a\u035d\3\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035f"+
		"\3\2\2\2\u035d\u035b\3\2\2\2\u035e\u0356\3\2\2\2\u035e\u035f\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0362\7K\2\2\u0361\u0354\3\2\2\2\u0361\u0355\3\2"+
		"\2\2\u0362Q\3\2\2\2\u0363\u0364\5\u00ccg\2\u0364S\3\2\2\2\u0365\u0392"+
		"\5<\37\2\u0366\u0367\7J\2\2\u0367\u036b\5<\37\2\u0368\u036a\5\u00be`\2"+
		"\u0369\u0368\3\2\2\2\u036a\u036d\3\2\2\2\u036b\u0369\3\2\2\2\u036b\u036c"+
		"\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u036f\7K\2\2\u036f"+
		"\u0392\3\2\2\2\u0370\u0371\7J\2\2\u0371\u0375\5<\37\2\u0372\u0374\5\u00c0"+
		"a\2\u0373\u0372\3\2\2\2\u0374\u0377\3\2\2\2\u0375\u0373\3\2\2\2\u0375"+
		"\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377\u0375\3\2\2\2\u0378\u0379\7K"+
		"\2\2\u0379\u0392\3\2\2\2\u037a\u037b\7J\2\2\u037b\u037c\5\u00be`\2\u037c"+
		"\u037d\7P\2\2\u037d\u0382\5\u00be`\2\u037e\u037f\7P\2\2\u037f\u0381\5"+
		"\u00be`\2\u0380\u037e\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2"+
		"\u0382\u0383\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0386"+
		"\7K\2\2\u0386\u0392\3\2\2\2\u0387\u0388\7L\2\2\u0388\u0389\5\u00be`\2"+
		"\u0389\u038a\7M\2\2\u038a\u0392\3\2\2\2\u038b\u038c\7J\2\2\u038c\u038d"+
		"\5\u00be`\2\u038d\u038e\7\65\2\2\u038e\u038f\5\u00be`\2\u038f\u0390\7"+
		"K\2\2\u0390\u0392\3\2\2\2\u0391\u0365\3\2\2\2\u0391\u0366\3\2\2\2\u0391"+
		"\u0370\3\2\2\2\u0391\u037a\3\2\2\2\u0391\u0387\3\2\2\2\u0391\u038b\3\2"+
		"\2\2\u0392U\3\2\2\2\u0393\u0394\7\27\2\2\u0394\u0396\5X-\2\u0395\u0397"+
		"\5^\60\2\u0396\u0395\3\2\2\2\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398"+
		"\u0399\5Z.\2\u0399\u039a\5\u0092J\2\u039a\u039b\7\64\2\2\u039b\u039c\5"+
		"\66\34\2\u039c\u03a5\3\2\2\2\u039d\u039e\7\24\2\2\u039e\u039f\5X-\2\u039f"+
		"\u03a0\5\\/\2\u03a0\u03a1\5\u0092J\2\u03a1\u03a2\7\64\2\2\u03a2\u03a3"+
		"\5\66\34\2\u03a3\u03a5\3\2\2\2\u03a4\u0393\3\2\2\2\u03a4\u039d\3\2\2\2"+
		"\u03a5W\3\2\2\2\u03a6\u03a7\t\3\2\2\u03a7Y\3\2\2\2\u03a8\u03a9\5\u00d8"+
		"m\2\u03a9[\3\2\2\2\u03aa\u03ab\5\u00d8m\2\u03ab]\3\2\2\2\u03ac\u03ad\t"+
		"\4\2\2\u03ad_\3\2\2\2\u03ae\u03b0\5\u0092J\2\u03af\u03b1\5\u008cG\2\u03b0"+
		"\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03c1\3\2\2\2\u03b4\u03b5\5\u0088E\2\u03b5\u03b6\5\u009aN\2"+
		"\u03b6\u03b7\5\u0088E\2\u03b7\u03c1\3\2\2\2\u03b8\u03b9\7J\2\2\u03b9\u03ba"+
		"\5`\61\2\u03ba\u03bc\7K\2\2\u03bb\u03bd\5\u008cG\2\u03bc\u03bb\3\2\2\2"+
		"\u03bd\u03be\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c1"+
		"\3\2\2\2\u03c0\u03ae\3\2\2\2\u03c0\u03b4\3\2\2\2\u03c0\u03b8\3\2\2\2\u03c1"+
		"a\3\2\2\2\u03c2\u03c3\7R\2\2\u03c3\u03c6\5l\67\2\u03c4\u03c5\7#\2\2\u03c5"+
		"\u03c7\5\36\20\2\u03c6\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03ce\3"+
		"\2\2\2\u03c8\u03cb\5d\63\2\u03c9\u03ca\7#\2\2\u03ca\u03cc\5\36\20\2\u03cb"+
		"\u03c9\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2\2\u03cd\u03c2\3\2"+
		"\2\2\u03cd\u03c8\3\2\2\2\u03cec\3\2\2\2\u03cf\u03d1\5f\64\2\u03d0\u03cf"+
		"\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d0\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"e\3\2\2\2\u03d4\u03d5\7;\2\2\u03d5\u03d6\5h\65\2\u03d6\u03d7\7R\2\2\u03d7"+
		"\u03d8\5l\67\2\u03d8g\3\2\2\2\u03d9\u03de\5j\66\2\u03da\u03db\7P\2\2\u03db"+
		"\u03dd\5j\66\2\u03dc\u03da\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2"+
		"\2\2\u03de\u03df\3\2\2\2\u03dfi\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03e2"+
		"\5\u0088E\2\u03e2\u03e3\7\66\2\2\u03e3\u03e4\5n8\2\u03e4\u03e9\3\2\2\2"+
		"\u03e5\u03e6\7\35\2\2\u03e6\u03e9\5\36\20\2\u03e7\u03e9\5n8\2\u03e8\u03e1"+
		"\3\2\2\2\u03e8\u03e5\3\2\2\2\u03e8\u03e7\3\2\2\2\u03e9k\3\2\2\2\u03ea"+
		"\u03eb\5n8\2\u03eb\u03ef\7\64\2\2\u03ec\u03ed\5> \2\u03ed\u03ee\7\63\2"+
		"\2\u03ee\u03f0\3\2\2\2\u03ef\u03ec\3\2\2\2\u03ef\u03f0\3\2\2\2\u03f0\u03f1"+
		"\3\2\2\2\u03f1\u03f2\5\66\34\2\u03f2\u03f5\3\2\2\2\u03f3\u03f5\5n8\2\u03f4"+
		"\u03ea\3\2\2\2\u03f4\u03f3\3\2\2\2\u03f5m\3\2\2\2\u03f6\u03f7\5p9\2\u03f7"+
		"\u03f8\5\u00a4S\2\u03f8\u03f9\5n8\2\u03f9\u03fe\3\2\2\2\u03fa\u03fb\7"+
		"?\2\2\u03fb\u03fe\5n8\2\u03fc\u03fe\5p9\2\u03fd\u03f6\3\2\2\2\u03fd\u03fa"+
		"\3\2\2\2\u03fd\u03fc\3\2\2\2\u03feo\3\2\2\2\u03ff\u0401\7T\2\2\u0400\u0402"+
		"\5\u008cG\2\u0401\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0401\3\2\2"+
		"\2\u0403\u0404\3\2\2\2\u0404\u0405\3\2\2\2\u0405\u0406\7\65\2\2\u0406"+
		"\u0407\5l\67\2\u0407\u0425\3\2\2\2\u0408\u0409\7\35\2\2\u0409\u040a\5"+
		"\36\20\2\u040a\u040b\7\30\2\2\u040b\u040c\5l\67\2\u040c\u0425\3\2\2\2"+
		"\u040d\u040e\7\26\2\2\u040e\u0410\5l\67\2\u040f\u0411\5\u00acW\2\u0410"+
		"\u040f\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\7!"+
		"\2\2\u0413\u0415\5l\67\2\u0414\u0416\5\u00acW\2\u0415\u0414\3\2\2\2\u0415"+
		"\u0416\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0418\7\23\2\2\u0418\u0419\5"+
		"l\67\2\u0419\u0425\3\2\2\2\u041a\u041b\7\26\2\2\u041b\u0425\5~@\2\u041c"+
		"\u041d\7\r\2\2\u041d\u041e\5l\67\2\u041e\u041f\7 \2\2\u041f\u0420\5x="+
		"\2\u0420\u0425\3\2\2\2\u0421\u0422\7\22\2\2\u0422\u0425\5\u0082B\2\u0423"+
		"\u0425\5r:\2\u0424\u03ff\3\2\2\2\u0424\u0408\3\2\2\2\u0424\u040d\3\2\2"+
		"\2\u0424\u041a\3\2\2\2\u0424\u041c\3\2\2\2\u0424\u0421\3\2\2\2\u0424\u0423"+
		"\3\2\2\2\u0425q\3\2\2\2\u0426\u0428\5t;\2\u0427\u0426\3\2\2\2\u0428\u0429"+
		"\3\2\2\2\u0429\u0427\3\2\2\2\u0429\u042a\3\2\2\2\u042as\3\2\2\2\u042b"+
		"\u0487\5\u0094K\2\u042c\u0487\5\u0090I\2\u042d\u0487\5\u00aeX\2\u042e"+
		"\u042f\7J\2\2\u042f\u0430\5l\67\2\u0430\u0431\7K\2\2\u0431\u0487\3\2\2"+
		"\2\u0432\u0433\7J\2\2\u0433\u0434\5l\67\2\u0434\u0435\7P\2\2\u0435\u043a"+
		"\5l\67\2\u0436\u0437\7P\2\2\u0437\u0439\5l\67\2\u0438\u0436\3\2\2\2\u0439"+
		"\u043c\3\2\2\2\u043a\u0438\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2"+
		"\2\2\u043c\u043a\3\2\2\2\u043d\u043e\7K\2\2\u043e\u0487\3\2\2\2\u043f"+
		"\u0440\7L\2\2\u0440\u0445\5l\67\2\u0441\u0442\7P\2\2\u0442\u0444\5l\67"+
		"\2\u0443\u0441\3\2\2\2\u0444\u0447\3\2\2\2\u0445\u0443\3\2\2\2\u0445\u0446"+
		"\3\2\2\2\u0446\u0448\3\2\2\2\u0447\u0445\3\2\2\2\u0448\u0449\7M\2\2\u0449"+
		"\u0487\3\2\2\2\u044a\u044b\7L\2\2\u044b\u044e\5l\67\2\u044c\u044d\7P\2"+
		"\2\u044d\u044f\5l\67\2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2\u044f\u0450"+
		"\3\2\2\2\u0450\u0452\7H\2\2\u0451\u0453\5l\67\2\u0452\u0451\3\2\2\2\u0452"+
		"\u0453\3\2\2\2\u0453\u0454\3\2\2\2\u0454\u0455\7M\2\2\u0455\u0487\3\2"+
		"\2\2\u0456\u0457\7L\2\2\u0457\u0458\5l\67\2\u0458\u0459\7;\2\2\u0459\u045e"+
		"\5v<\2\u045a\u045b\7P\2\2\u045b\u045d\5v<\2\u045c\u045a\3\2\2\2\u045d"+
		"\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461\3\2"+
		"\2\2\u0460\u045e\3\2\2\2\u0461\u0462\7M\2\2\u0462\u0487\3\2\2\2\u0463"+
		"\u0464\7J\2\2\u0464\u0465\5n8\2\u0465\u0466\5\u00a4S\2\u0466\u0467\7K"+
		"\2\2\u0467\u0487\3\2\2\2\u0468\u0469\7J\2\2\u0469\u046a\5\u00a4S\2\u046a"+
		"\u046b\5n8\2\u046b\u046c\7K\2\2\u046c\u0487\3\2\2\2\u046d\u046e\5\u0098"+
		"M\2\u046e\u0473\7\b\2\2\u046f\u0470\5\u0086D\2\u0470\u0471\7P\2\2\u0471"+
		"\u0472\5\u0086D\2\u0472\u0474\3\2\2\2\u0473\u046f\3\2\2\2\u0473\u0474"+
		"\3\2\2\2\u0474\u0475\3\2\2\2\u0475\u0476\7\t\2\2\u0476\u0487\3\2\2\2\u0477"+
		"\u0478\7\b\2\2\u0478\u047d\5\u0086D\2\u0479\u047a\7P\2\2\u047a\u047c\5"+
		"\u0086D\2\u047b\u0479\3\2\2\2\u047c\u047f\3\2\2\2\u047d\u047b\3\2\2\2"+
		"\u047d\u047e\3\2\2\2\u047e\u0480\3\2\2\2\u047f\u047d\3\2\2\2\u0480\u0481"+
		"\7\t\2\2\u0481\u0483\3\2\2\2\u0482\u0477\3\2\2\2\u0483\u0484\3\2\2\2\u0484"+
		"\u0482\3\2\2\2\u0484\u0485\3\2\2\2\u0485\u0487\3\2\2\2\u0486\u042b\3\2"+
		"\2\2\u0486\u042c\3\2\2\2\u0486\u042d\3\2\2\2\u0486\u042e\3\2\2\2\u0486"+
		"\u0432\3\2\2\2\u0486\u043f\3\2\2\2\u0486\u044a\3\2\2\2\u0486\u0456\3\2"+
		"\2\2\u0486\u0463\3\2\2\2\u0486\u0468\3\2\2\2\u0486\u046d\3\2\2\2\u0486"+
		"\u0482\3\2\2\2\u0487u\3\2\2\2\u0488\u0489\5\u0088E\2\u0489\u048a\7\66"+
		"\2\2\u048a\u048b\5l\67\2\u048b\u0490\3\2\2\2\u048c\u048d\7\35\2\2\u048d"+
		"\u0490\5\36\20\2\u048e\u0490\5l\67\2\u048f\u0488\3\2\2\2\u048f\u048c\3"+
		"\2\2\2\u048f\u048e\3\2\2\2\u0490w\3\2\2\2\u0491\u0498\5\u00a8U\2\u0492"+
		"\u0494\5z>\2\u0493\u0495\5\u00acW\2\u0494\u0493\3\2\2\2\u0495\u0496\3"+
		"\2\2\2\u0496\u0494\3\2\2\2\u0496\u0497\3\2\2\2\u0497\u0499\3\2\2\2\u0498"+
		"\u0492\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2"+
		"\2\2\u049b\u049c\3\2\2\2\u049c\u049d\5\u00aaV\2\u049dy\3\2\2\2\u049e\u049f"+
		"\5\u0088E\2\u049f\u04a0\7\65\2\2\u04a0\u04a3\5l\67\2\u04a1\u04a2\7#\2"+
		"\2\u04a2\u04a4\5\36\20\2\u04a3\u04a1\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04ac\3\2\2\2\u04a5\u04a6\5\u0088E\2\u04a6\u04a9\5|?\2\u04a7\u04a8\7"+
		"#\2\2\u04a8\u04aa\5\36\20\2\u04a9\u04a7\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ac\3\2\2\2\u04ab\u049e\3\2\2\2\u04ab\u04a5\3\2\2\2\u04ac{\3\2\2\2"+
		"\u04ad\u04af\5\u0080A\2\u04ae\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0"+
		"\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1}\3\2\2\2\u04b2\u04b3\7\b\2\2"+
		"\u04b3\u04b4\5|?\2\u04b4\u04b5\7\t\2\2\u04b5\u04b8\3\2\2\2\u04b6\u04b8"+
		"\5|?\2\u04b7\u04b2\3\2\2\2\u04b7\u04b6\3\2\2\2\u04b8\177\3\2\2\2\u04b9"+
		"\u04ba\7;\2\2\u04ba\u04bb\5h\65\2\u04bb\u04bc\7\65\2\2\u04bc\u04bd\5l"+
		"\67\2\u04bd\u0081\3\2\2\2\u04be\u04c2\5\u00a8U\2\u04bf\u04c1\5\u0084C"+
		"\2\u04c0\u04bf\3\2\2\2\u04c1\u04c4\3\2\2\2\u04c2\u04c0\3\2\2\2\u04c2\u04c3"+
		"\3\2\2\2\u04c3\u04c5\3\2\2\2\u04c4\u04c2\3\2\2\2\u04c5\u04c9\5l\67\2\u04c6"+
		"\u04c8\5\u00acW\2\u04c7\u04c6\3\2\2\2\u04c8\u04cb\3\2\2\2\u04c9\u04c7"+
		"\3\2\2\2\u04c9\u04ca\3\2\2\2\u04ca\u04cc\3\2\2\2\u04cb\u04c9\3\2\2\2\u04cc"+
		"\u04cd\5\u00aaV\2\u04cd\u0083\3\2\2\2\u04ce\u04d0\5l\67\2\u04cf\u04d1"+
		"\5\u00acW\2\u04d0\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d0\3\2\2"+
		"\2\u04d2\u04d3\3\2\2\2\u04d3\u04e9\3\2\2\2\u04d4\u04d5\5\u0088E\2\u04d5"+
		"\u04d6\7\66\2\2\u04d6\u04d8\5l\67\2\u04d7\u04d9\5\u00acW\2\u04d8\u04d7"+
		"\3\2\2\2\u04d9\u04da\3\2\2\2\u04da\u04d8\3\2\2\2\u04da\u04db\3\2\2\2\u04db"+
		"\u04e9\3\2\2\2\u04dc\u04dd\7\35\2\2\u04dd\u04df\5\36\20\2\u04de\u04e0"+
		"\5\u00acW\2\u04df\u04de\3\2\2\2\u04e0\u04e1\3\2\2\2\u04e1\u04df\3\2\2"+
		"\2\u04e1\u04e2\3\2\2\2\u04e2\u04e9\3\2\2\2\u04e3\u04e5\5\u00acW\2\u04e4"+
		"\u04e3\3\2\2\2\u04e5\u04e6\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e6\u04e7\3\2"+
		"\2\2\u04e7\u04e9\3\2\2\2\u04e8\u04ce\3\2\2\2\u04e8\u04d4\3\2\2\2\u04e8"+
		"\u04dc\3\2\2\2\u04e8\u04e4\3\2\2\2\u04e9\u0085\3\2\2\2\u04ea\u04eb\5\u0094"+
		"K\2\u04eb\u04ec\7R\2\2\u04ec\u04ed\5l\67\2\u04ed\u0087\3\2\2\2\u04ee\u04ef"+
		"\5\u008aF\2\u04ef\u04f0\5\u00a0Q\2\u04f0\u04f1\5\u0088E\2\u04f1\u04f4"+
		"\3\2\2\2\u04f2\u04f4\5\u008aF\2\u04f3\u04ee\3\2\2\2\u04f3\u04f2\3\2\2"+
		"\2\u04f4\u0089\3\2\2\2\u04f5\u0502\5\u008cG\2\u04f6\u04f9\7?\2\2\u04f7"+
		"\u04fa\5\u00d2j\2\u04f8\u04fa\5\u00d4k\2\u04f9\u04f7\3\2\2\2\u04f9\u04f8"+
		"\3\2\2\2\u04fa\u0502\3\2\2\2\u04fb\u04fd\5\u0090I\2\u04fc\u04fe\5\u008c"+
		"G\2\u04fd\u04fc\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u04fd\3\2\2\2\u04ff"+
		"\u0500\3\2\2\2\u0500\u0502\3\2\2\2\u0501\u04f5\3\2\2\2\u0501\u04f6\3\2"+
		"\2\2\u0501\u04fb\3\2\2\2\u0502\u008b\3\2\2\2\u0503\u0506\5\u0092J\2\u0504"+
		"\u0505\7D\2\2\u0505\u0507\5\u008cG\2\u0506\u0504\3\2\2\2\u0506\u0507\3"+
		"\2\2\2\u0507\u0538\3\2\2\2\u0508\u0538\5\u0090I\2\u0509\u050a\5\u0098"+
		"M\2\u050a\u0513\7\b\2\2\u050b\u0510\5\u008eH\2\u050c\u050d\7P\2\2\u050d"+
		"\u050f\5\u008eH\2\u050e\u050c\3\2\2\2\u050f\u0512\3\2\2\2\u0510\u050e"+
		"\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u0514\3\2\2\2\u0512\u0510\3\2\2\2\u0513"+
		"\u050b\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515\u0516\7\t"+
		"\2\2\u0516\u0538\3\2\2\2\u0517\u0538\5\u00aeX\2\u0518\u0538\7$\2\2\u0519"+
		"\u051a\7J\2\2\u051a\u051b\5\u0088E\2\u051b\u051c\7K\2\2\u051c\u0538\3"+
		"\2\2\2\u051d\u051e\7J\2\2\u051e\u051f\5\u0088E\2\u051f\u0520\7P\2\2\u0520"+
		"\u0525\5\u0088E\2\u0521\u0522\7P\2\2\u0522\u0524\5\u0088E\2\u0523\u0521"+
		"\3\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u0528\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u0529\7K\2\2\u0529\u0538\3\2"+
		"\2\2\u052a\u052b\7L\2\2\u052b\u0530\5\u0088E\2\u052c\u052d\7P\2\2\u052d"+
		"\u052f\5\u0088E\2\u052e\u052c\3\2\2\2\u052f\u0532\3\2\2\2\u0530\u052e"+
		"\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0533\3\2\2\2\u0532\u0530\3\2\2\2\u0533"+
		"\u0534\7M\2\2\u0534\u0538\3\2\2\2\u0535\u0536\7C\2\2\u0536\u0538\5\u008c"+
		"G\2\u0537\u0503\3\2\2\2\u0537\u0508\3\2\2\2\u0537\u0509\3\2\2\2\u0537"+
		"\u0517\3\2\2\2\u0537\u0518\3\2\2\2\u0537\u0519\3\2\2\2\u0537\u051d\3\2"+
		"\2\2\u0537\u052a\3\2\2\2\u0537\u0535\3\2\2\2\u0538\u008d\3\2\2\2\u0539"+
		"\u053a\5\u0094K\2\u053a\u053b\7R\2\2\u053b\u053c\5\u0088E\2\u053c\u008f"+
		"\3\2\2\2\u053d\u053e\7J\2\2\u053e\u054a\7K\2\2\u053f\u0540\7L\2\2\u0540"+
		"\u054a\7M\2\2\u0541\u0543\7J\2\2\u0542\u0544\7P\2\2\u0543\u0542\3\2\2"+
		"\2\u0544\u0545\3\2\2\2\u0545\u0543\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547"+
		"\3\2\2\2\u0547\u054a\7K\2\2\u0548\u054a\5\u0098M\2\u0549\u053d\3\2\2\2"+
		"\u0549\u053f\3\2\2\2\u0549\u0541\3\2\2\2\u0549\u0548\3\2\2\2\u054a\u0091"+
		"\3\2\2\2\u054b\u0551\5\u00b2Z\2\u054c\u054d\7J\2\2\u054d\u054e\5\u00ba"+
		"^\2\u054e\u054f\7K\2\2\u054f\u0551\3\2\2\2\u0550\u054b\3\2\2\2\u0550\u054c"+
		"\3\2\2\2\u0551\u0093\3\2\2\2\u0552\u0558\5\u00c6d\2\u0553\u0554\7J\2\2"+
		"\u0554\u0555\5\u00ceh\2\u0555\u0556\7K\2\2\u0556\u0558\3\2\2\2\u0557\u0552"+
		"\3\2\2\2\u0557\u0553\3\2\2\2\u0558\u0095\3\2\2\2\u0559\u055f\5\u00b4["+
		"\2\u055a\u055b\7J\2\2\u055b\u055c\5\u00bc_\2\u055c\u055d\7K\2\2\u055d"+
		"\u055f\3\2\2\2\u055e\u0559\3\2\2\2\u055e\u055a\3\2\2\2\u055f\u0097\3\2"+
		"\2\2\u0560\u0566\5\u00c8e\2\u0561\u0562\7J\2\2\u0562\u0563\5\u00a6T\2"+
		"\u0563\u0564\7K\2\2\u0564\u0566\3\2\2\2\u0565\u0560\3\2\2\2\u0565\u0561"+
		"\3\2\2\2\u0566\u0099\3\2\2\2\u0567\u056d\5\u00ba^\2\u0568\u0569\7U\2\2"+
		"\u0569\u056a\5\u00b2Z\2\u056a\u056b\7U\2\2\u056b\u056d\3\2\2\2\u056c\u0567"+
		"\3\2\2\2\u056c\u0568\3\2\2\2\u056d\u009b\3\2\2\2\u056e\u0574\5\u00ceh"+
		"\2\u056f\u0570\7U\2\2\u0570\u0571\5\u00c6d\2\u0571\u0572\7U\2\2\u0572"+
		"\u0574\3\2\2\2\u0573\u056e\3\2\2\2\u0573\u056f\3\2\2\2\u0574\u009d\3\2"+
		"\2\2\u0575\u057b\5\u00bc_\2\u0576\u0577\7U\2\2\u0577\u0578\5\u00b4[\2"+
		"\u0578\u0579\7U\2\2\u0579\u057b\3\2\2\2\u057a\u0575\3\2\2\2\u057a\u0576"+
		"\3\2\2\2\u057b\u009f\3\2\2\2\u057c\u0582\5\u00a6T\2\u057d\u057e\7U\2\2"+
		"\u057e\u057f\5\u00c8e\2\u057f\u0580\7U\2\2\u0580\u0582\3\2\2\2\u0581\u057c"+
		"\3\2\2\2\u0581\u057d\3\2\2\2\u0582\u00a1\3\2\2\2\u0583\u0586\5\u009aN"+
		"\2\u0584\u0586\5\u009eP\2\u0585\u0583\3\2\2\2\u0585\u0584\3\2\2\2\u0586"+
		"\u00a3\3\2\2\2\u0587\u058a\5\u009cO\2\u0588\u058a\5\u00a0Q\2\u0589\u0587"+
		"\3\2\2\2\u0589\u0588\3\2\2\2\u058a\u00a5\3\2\2\2\u058b\u058e\7Q\2\2\u058c"+
		"\u058e\5\u00d0i\2\u058d\u058b\3\2\2\2\u058d\u058c\3\2\2\2\u058e\u00a7"+
		"\3\2\2\2\u058f\u0590\t\5\2\2\u0590\u00a9\3\2\2\2\u0591\u0592\t\6\2\2\u0592"+
		"\u00ab\3\2\2\2\u0593\u0594\t\7\2\2\u0594\u00ad\3\2\2\2\u0595\u059a\5\u00d2"+
		"j\2\u0596\u059a\5\u00d4k\2\u0597\u059a\5\u00d6l\2\u0598\u059a\5\u00d8"+
		"m\2\u0599\u0595\3\2\2\2\u0599\u0596\3\2\2\2\u0599\u0597\3\2\2\2\u0599"+
		"\u0598\3\2\2\2\u059a\u00af\3\2\2\2\u059b\u059c\t\b\2\2\u059c\u00b1\3\2"+
		"\2\2\u059d\u05a1\t\t\2\2\u059e\u05a0\7\67\2\2\u059f\u059e\3\2\2\2\u05a0"+
		"\u05a3\3\2\2\2\u05a1\u059f\3\2\2\2\u05a1\u05a2\3\2\2\2\u05a2\u00b3\3\2"+
		"\2\2\u05a3\u05a1\3\2\2\2\u05a4\u05a8\7Y\2\2\u05a5\u05a7\7\67\2\2\u05a6"+
		"\u05a5\3\2\2\2\u05a7\u05aa\3\2\2\2\u05a8\u05a6\3\2\2\2\u05a8\u05a9\3\2"+
		"\2\2\u05a9\u00b5\3\2\2\2\u05aa\u05a8\3\2\2\2\u05ab\u05ac\5\u00b8]\2\u05ac"+
		"\u00b7\3\2\2\2\u05ad\u05ae\t\n\2\2\u05ae\u00b9\3\2\2\2\u05af\u05b1\5\u00b8"+
		"]\2\u05b0\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b0\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u00bb\3\2\2\2\u05b4\u05b8\7Q\2\2\u05b5\u05b7\5\u00b8"+
		"]\2\u05b6\u05b5\3\2\2\2\u05b7\u05ba\3\2\2\2\u05b8\u05b6\3\2\2\2\u05b8"+
		"\u05b9\3\2\2\2\u05b9\u00bd\3\2\2\2\u05ba\u05b8\3\2\2\2\u05bb\u05bc\5\u00b2"+
		"Z\2\u05bc\u00bf\3\2\2\2\u05bd\u05be\5\u00b4[\2\u05be\u00c1\3\2\2\2\u05bf"+
		"\u05c0\5\u00b4[\2\u05c0\u00c3\3\2\2\2\u05c1\u05c2\5\u00b4[\2\u05c2\u05c3"+
		"\7F\2\2\u05c3\u05c5\3\2\2\2\u05c4\u05c1\3\2\2\2\u05c5\u05c8\3\2\2\2\u05c6"+
		"\u05c4\3\2\2\2\u05c6\u05c7\3\2\2\2\u05c7\u05c9\3\2\2\2\u05c8\u05c6\3\2"+
		"\2\2\u05c9\u05ca\5\u00b4[\2\u05ca\u00c5\3\2\2\2\u05cb\u05cc\5\u00c4c\2"+
		"\u05cc\u05cd\7F\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05cb\3\2\2\2\u05ce\u05cf"+
		"\3\2\2\2\u05cf\u05d0\3\2\2\2\u05d0\u05d1\5\u00b2Z\2\u05d1\u00c7\3\2\2"+
		"\2\u05d2\u05d3\5\u00c4c\2\u05d3\u05d4\7F\2\2\u05d4\u05d6\3\2\2\2\u05d5"+
		"\u05d2\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8\5\u00b4"+
		"[\2\u05d8\u00c9\3\2\2\2\u05d9\u05da\5\u00c4c\2\u05da\u05db\7F\2\2\u05db"+
		"\u05dd\3\2\2\2\u05dc\u05d9\3\2\2\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2"+
		"\2\2\u05de\u05df\5\u00c0a\2\u05df\u00cb\3\2\2\2\u05e0\u05e1\5\u00c4c\2"+
		"\u05e1\u05e2\7F\2\2\u05e2\u05e4\3\2\2\2\u05e3\u05e0\3\2\2\2\u05e3\u05e4"+
		"\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\5\u00c2b\2\u05e6\u00cd\3\2\2"+
		"\2\u05e7\u05e8\5\u00c4c\2\u05e8\u05e9\7F\2\2\u05e9\u05eb\3\2\2\2\u05ea"+
		"\u05e7\3\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ed\5\u00ba"+
		"^\2\u05ed\u00cf\3\2\2\2\u05ee\u05ef\5\u00c4c\2\u05ef\u05f0\7F\2\2\u05f0"+
		"\u05f2\3\2\2\2\u05f1\u05ee\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2\u05f3\3\2"+
		"\2\2\u05f3\u05f4\5\u00bc_\2\u05f4\u00d1\3\2\2\2\u05f5\u05f6\t\13\2\2\u05f6"+
		"\u00d3\3\2\2\2\u05f7\u05f8\7]\2\2\u05f8\u00d5\3\2\2\2\u05f9\u05fa\7V\2"+
		"\2\u05fa\u00d7\3\2\2\2\u05fb\u05fc\7W\2\2\u05fc\u00d9\3\2\2\2\u00bd\u00dd"+
		"\u00e1\u00e6\u00ec\u00f5\u00f9\u0100\u0109\u0115\u011a\u011c\u0124\u0127"+
		"\u012a\u0139\u013c\u013f\u014b\u014e\u0151\u0155\u0159\u015e\u0161\u0166"+
		"\u016e\u0172\u0174\u017e\u0182\u0184\u0187\u0194\u0197\u019a\u01a6\u01a9"+
		"\u01ac\u01ae\u01b2\u01b8\u01bc\u01be\u01c9\u01ce\u01d1\u01d7\u01dd\u01e3"+
		"\u01e9\u01ef\u01f5\u01fe\u0201\u0207\u020e\u0212\u0219\u021c\u0232\u0239"+
		"\u023b\u0242\u024e\u0252\u0259\u025c\u0263\u0267\u026e\u0272\u0279\u027c"+
		"\u0282\u028b\u0291\u0295\u029c\u02a4\u02ac\u02b1\u02bb\u02c8\u02d8\u02e1"+
		"\u02e6\u02f3\u02f8\u0301\u0304\u0307\u0310\u0318\u031d\u0322\u0328\u032e"+
		"\u0337\u033a\u033e\u034a\u0351\u035b\u035e\u0361\u036b\u0375\u0382\u0391"+
		"\u0396\u03a4\u03b2\u03be\u03c0\u03c6\u03cb\u03cd\u03d2\u03de\u03e8\u03ef"+
		"\u03f4\u03fd\u0403\u0410\u0415\u0424\u0429\u043a\u0445\u044e\u0452\u045e"+
		"\u0473\u047d\u0484\u0486\u048f\u0496\u049a\u04a3\u04a9\u04ab\u04b0\u04b7"+
		"\u04c2\u04c9\u04d2\u04da\u04e1\u04e6\u04e8\u04f3\u04f9\u04ff\u0501\u0506"+
		"\u0510\u0513\u0525\u0530\u0537\u0545\u0549\u0550\u0557\u055e\u0565\u056c"+
		"\u0573\u057a\u0581\u0585\u0589\u058d\u0599\u05a1\u05a8\u05b2\u05b8\u05c6"+
		"\u05ce\u05d5\u05dc\u05e3\u05ea\u05f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}