// Generated from C:\Users\oscar\Desktop\u005Cunsorted\HaskellParser.g4 by ANTLR 4.5.1
package haskellantlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HaskellParser}.
 */
public interface HaskellParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HaskellParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(HaskellParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(HaskellParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pragmas}.
	 * @param ctx the parse tree
	 */
	void enterPragmas(HaskellParser.PragmasContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pragmas}.
	 * @param ctx the parse tree
	 */
	void exitPragmas(HaskellParser.PragmasContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pragma}.
	 * @param ctx the parse tree
	 */
	void enterPragma(HaskellParser.PragmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pragma}.
	 * @param ctx the parse tree
	 */
	void exitPragma(HaskellParser.PragmaContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(HaskellParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(HaskellParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(HaskellParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(HaskellParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#impdecls}.
	 * @param ctx the parse tree
	 */
	void enterImpdecls(HaskellParser.ImpdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#impdecls}.
	 * @param ctx the parse tree
	 */
	void exitImpdecls(HaskellParser.ImpdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#exports}.
	 * @param ctx the parse tree
	 */
	void enterExports(HaskellParser.ExportsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#exports}.
	 * @param ctx the parse tree
	 */
	void exitExports(HaskellParser.ExportsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#exprt}.
	 * @param ctx the parse tree
	 */
	void enterExprt(HaskellParser.ExprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#exprt}.
	 * @param ctx the parse tree
	 */
	void exitExprt(HaskellParser.ExprtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void enterImpdecl(HaskellParser.ImpdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#impdecl}.
	 * @param ctx the parse tree
	 */
	void exitImpdecl(HaskellParser.ImpdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#impspec}.
	 * @param ctx the parse tree
	 */
	void enterImpspec(HaskellParser.ImpspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#impspec}.
	 * @param ctx the parse tree
	 */
	void exitImpspec(HaskellParser.ImpspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#himport}.
	 * @param ctx the parse tree
	 */
	void enterHimport(HaskellParser.HimportContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#himport}.
	 * @param ctx the parse tree
	 */
	void exitHimport(HaskellParser.HimportContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#cname}.
	 * @param ctx the parse tree
	 */
	void enterCname(HaskellParser.CnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#cname}.
	 * @param ctx the parse tree
	 */
	void exitCname(HaskellParser.CnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#topdecls}.
	 * @param ctx the parse tree
	 */
	void enterTopdecls(HaskellParser.TopdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#topdecls}.
	 * @param ctx the parse tree
	 */
	void exitTopdecls(HaskellParser.TopdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#topdecl}.
	 * @param ctx the parse tree
	 */
	void enterTopdecl(HaskellParser.TopdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#topdecl}.
	 * @param ctx the parse tree
	 */
	void exitTopdecl(HaskellParser.TopdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void enterDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 */
	void exitDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(HaskellParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(HaskellParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#specs}.
	 * @param ctx the parse tree
	 */
	void enterSpecs(HaskellParser.SpecsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#specs}.
	 * @param ctx the parse tree
	 */
	void exitSpecs(HaskellParser.SpecsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSpec(HaskellParser.SpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSpec(HaskellParser.SpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#cdecls}.
	 * @param ctx the parse tree
	 */
	void enterCdecls(HaskellParser.CdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#cdecls}.
	 * @param ctx the parse tree
	 */
	void exitCdecls(HaskellParser.CdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#cdecl}.
	 * @param ctx the parse tree
	 */
	void enterCdecl(HaskellParser.CdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#cdecl}.
	 * @param ctx the parse tree
	 */
	void exitCdecl(HaskellParser.CdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#idecls}.
	 * @param ctx the parse tree
	 */
	void enterIdecls(HaskellParser.IdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#idecls}.
	 * @param ctx the parse tree
	 */
	void exitIdecls(HaskellParser.IdeclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#idecl}.
	 * @param ctx the parse tree
	 */
	void enterIdecl(HaskellParser.IdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#idecl}.
	 * @param ctx the parse tree
	 */
	void exitIdecl(HaskellParser.IdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 */
	void enterGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 */
	void exitGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ops}.
	 * @param ctx the parse tree
	 */
	void enterOps(HaskellParser.OpsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ops}.
	 * @param ctx the parse tree
	 */
	void exitOps(HaskellParser.OpsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(HaskellParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(HaskellParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fixity}.
	 * @param ctx the parse tree
	 */
	void enterFixity(HaskellParser.FixityContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fixity}.
	 * @param ctx the parse tree
	 */
	void exitFixity(HaskellParser.FixityContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(HaskellParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(HaskellParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#btype}.
	 * @param ctx the parse tree
	 */
	void enterBtype(HaskellParser.BtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#btype}.
	 * @param ctx the parse tree
	 */
	void exitBtype(HaskellParser.BtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 */
	void enterAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 */
	void exitAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gtycon}.
	 * @param ctx the parse tree
	 */
	void enterGtycon(HaskellParser.GtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gtycon}.
	 * @param ctx the parse tree
	 */
	void exitGtycon(HaskellParser.GtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#typecontext}.
	 * @param ctx the parse tree
	 */
	void enterTypecontext(HaskellParser.TypecontextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#typecontext}.
	 * @param ctx the parse tree
	 */
	void exitTypecontext(HaskellParser.TypecontextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#cls}.
	 * @param ctx the parse tree
	 */
	void enterCls(HaskellParser.ClsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#cls}.
	 * @param ctx the parse tree
	 */
	void exitCls(HaskellParser.ClsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#scontext}.
	 * @param ctx the parse tree
	 */
	void enterScontext(HaskellParser.ScontextContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#scontext}.
	 * @param ctx the parse tree
	 */
	void exitScontext(HaskellParser.ScontextContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#simpleclass}.
	 * @param ctx the parse tree
	 */
	void enterSimpleclass(HaskellParser.SimpleclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#simpleclass}.
	 * @param ctx the parse tree
	 */
	void exitSimpleclass(HaskellParser.SimpleclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#simpletype}.
	 * @param ctx the parse tree
	 */
	void enterSimpletype(HaskellParser.SimpletypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#simpletype}.
	 * @param ctx the parse tree
	 */
	void exitSimpletype(HaskellParser.SimpletypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#constrs}.
	 * @param ctx the parse tree
	 */
	void enterConstrs(HaskellParser.ConstrsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#constrs}.
	 * @param ctx the parse tree
	 */
	void exitConstrs(HaskellParser.ConstrsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#constr}.
	 * @param ctx the parse tree
	 */
	void enterConstr(HaskellParser.ConstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#constr}.
	 * @param ctx the parse tree
	 */
	void exitConstr(HaskellParser.ConstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#newconstr}.
	 * @param ctx the parse tree
	 */
	void enterNewconstr(HaskellParser.NewconstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#newconstr}.
	 * @param ctx the parse tree
	 */
	void exitNewconstr(HaskellParser.NewconstrContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void enterFielddecl(HaskellParser.FielddeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fielddecl}.
	 * @param ctx the parse tree
	 */
	void exitFielddecl(HaskellParser.FielddeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#deriving}.
	 * @param ctx the parse tree
	 */
	void enterDeriving(HaskellParser.DerivingContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#deriving}.
	 * @param ctx the parse tree
	 */
	void exitDeriving(HaskellParser.DerivingContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#dclass}.
	 * @param ctx the parse tree
	 */
	void enterDclass(HaskellParser.DclassContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#dclass}.
	 * @param ctx the parse tree
	 */
	void exitDclass(HaskellParser.DclassContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#inst}.
	 * @param ctx the parse tree
	 */
	void enterInst(HaskellParser.InstContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#inst}.
	 * @param ctx the parse tree
	 */
	void exitInst(HaskellParser.InstContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void enterFdecl(HaskellParser.FdeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fdecl}.
	 * @param ctx the parse tree
	 */
	void exitFdecl(HaskellParser.FdeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#callconv}.
	 * @param ctx the parse tree
	 */
	void enterCallconv(HaskellParser.CallconvContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#callconv}.
	 * @param ctx the parse tree
	 */
	void exitCallconv(HaskellParser.CallconvContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#impent}.
	 * @param ctx the parse tree
	 */
	void enterImpent(HaskellParser.ImpentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#impent}.
	 * @param ctx the parse tree
	 */
	void exitImpent(HaskellParser.ImpentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#expent}.
	 * @param ctx the parse tree
	 */
	void enterExpent(HaskellParser.ExpentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#expent}.
	 * @param ctx the parse tree
	 */
	void exitExpent(HaskellParser.ExpentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#safety}.
	 * @param ctx the parse tree
	 */
	void enterSafety(HaskellParser.SafetyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#safety}.
	 * @param ctx the parse tree
	 */
	void exitSafety(HaskellParser.SafetyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 */
	void enterFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 */
	void exitFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void enterRhs(HaskellParser.RhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 */
	void exitRhs(HaskellParser.RhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void enterGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 */
	void exitGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gdrh}.
	 * @param ctx the parse tree
	 */
	void enterGdrh(HaskellParser.GdrhContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gdrh}.
	 * @param ctx the parse tree
	 */
	void exitGdrh(HaskellParser.GdrhContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#guards}.
	 * @param ctx the parse tree
	 */
	void enterGuards(HaskellParser.GuardsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#guards}.
	 * @param ctx the parse tree
	 */
	void exitGuards(HaskellParser.GuardsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#guard}.
	 * @param ctx the parse tree
	 */
	void enterGuard(HaskellParser.GuardContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#guard}.
	 * @param ctx the parse tree
	 */
	void exitGuard(HaskellParser.GuardContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(HaskellParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(HaskellParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#infixexp}.
	 * @param ctx the parse tree
	 */
	void enterInfixexp(HaskellParser.InfixexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#infixexp}.
	 * @param ctx the parse tree
	 */
	void exitInfixexp(HaskellParser.InfixexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lexp}.
	 * @param ctx the parse tree
	 */
	void enterLexp(HaskellParser.LexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lexp}.
	 * @param ctx the parse tree
	 */
	void exitLexp(HaskellParser.LexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fexp}.
	 * @param ctx the parse tree
	 */
	void enterFexp(HaskellParser.FexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fexp}.
	 * @param ctx the parse tree
	 */
	void exitFexp(HaskellParser.FexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#aexp}.
	 * @param ctx the parse tree
	 */
	void enterAexp(HaskellParser.AexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#aexp}.
	 * @param ctx the parse tree
	 */
	void exitAexp(HaskellParser.AexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qual}.
	 * @param ctx the parse tree
	 */
	void enterQual(HaskellParser.QualContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qual}.
	 * @param ctx the parse tree
	 */
	void exitQual(HaskellParser.QualContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#alts}.
	 * @param ctx the parse tree
	 */
	void enterAlts(HaskellParser.AltsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#alts}.
	 * @param ctx the parse tree
	 */
	void exitAlts(HaskellParser.AltsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(HaskellParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(HaskellParser.AltContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gdpats}.
	 * @param ctx the parse tree
	 */
	void enterGdpats(HaskellParser.GdpatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gdpats}.
	 * @param ctx the parse tree
	 */
	void exitGdpats(HaskellParser.GdpatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ifgdpats}.
	 * @param ctx the parse tree
	 */
	void enterIfgdpats(HaskellParser.IfgdpatsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ifgdpats}.
	 * @param ctx the parse tree
	 */
	void exitIfgdpats(HaskellParser.IfgdpatsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gdpat}.
	 * @param ctx the parse tree
	 */
	void enterGdpat(HaskellParser.GdpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gdpat}.
	 * @param ctx the parse tree
	 */
	void exitGdpat(HaskellParser.GdpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 */
	void enterStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 */
	void exitStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(HaskellParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(HaskellParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fbind}.
	 * @param ctx the parse tree
	 */
	void enterFbind(HaskellParser.FbindContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fbind}.
	 * @param ctx the parse tree
	 */
	void exitFbind(HaskellParser.FbindContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterPat(HaskellParser.PatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitPat(HaskellParser.PatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#lpat}.
	 * @param ctx the parse tree
	 */
	void enterLpat(HaskellParser.LpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#lpat}.
	 * @param ctx the parse tree
	 */
	void exitLpat(HaskellParser.LpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#apat}.
	 * @param ctx the parse tree
	 */
	void enterApat(HaskellParser.ApatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#apat}.
	 * @param ctx the parse tree
	 */
	void exitApat(HaskellParser.ApatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#fpat}.
	 * @param ctx the parse tree
	 */
	void enterFpat(HaskellParser.FpatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#fpat}.
	 * @param ctx the parse tree
	 */
	void exitFpat(HaskellParser.FpatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gcon}.
	 * @param ctx the parse tree
	 */
	void enterGcon(HaskellParser.GconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gcon}.
	 * @param ctx the parse tree
	 */
	void exitGcon(HaskellParser.GconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(HaskellParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(HaskellParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qvar}.
	 * @param ctx the parse tree
	 */
	void enterQvar(HaskellParser.QvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qvar}.
	 * @param ctx the parse tree
	 */
	void exitQvar(HaskellParser.QvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#con}.
	 * @param ctx the parse tree
	 */
	void enterCon(HaskellParser.ConContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#con}.
	 * @param ctx the parse tree
	 */
	void exitCon(HaskellParser.ConContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qcon}.
	 * @param ctx the parse tree
	 */
	void enterQcon(HaskellParser.QconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qcon}.
	 * @param ctx the parse tree
	 */
	void exitQcon(HaskellParser.QconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#varop}.
	 * @param ctx the parse tree
	 */
	void enterVarop(HaskellParser.VaropContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#varop}.
	 * @param ctx the parse tree
	 */
	void exitVarop(HaskellParser.VaropContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qvarop}.
	 * @param ctx the parse tree
	 */
	void enterQvarop(HaskellParser.QvaropContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qvarop}.
	 * @param ctx the parse tree
	 */
	void exitQvarop(HaskellParser.QvaropContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#conop}.
	 * @param ctx the parse tree
	 */
	void enterConop(HaskellParser.ConopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#conop}.
	 * @param ctx the parse tree
	 */
	void exitConop(HaskellParser.ConopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qconop}.
	 * @param ctx the parse tree
	 */
	void enterQconop(HaskellParser.QconopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qconop}.
	 * @param ctx the parse tree
	 */
	void exitQconop(HaskellParser.QconopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(HaskellParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(HaskellParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qop}.
	 * @param ctx the parse tree
	 */
	void enterQop(HaskellParser.QopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qop}.
	 * @param ctx the parse tree
	 */
	void exitQop(HaskellParser.QopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#gconsym}.
	 * @param ctx the parse tree
	 */
	void enterGconsym(HaskellParser.GconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#gconsym}.
	 * @param ctx the parse tree
	 */
	void exitGconsym(HaskellParser.GconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#open}.
	 * @param ctx the parse tree
	 */
	void enterOpen(HaskellParser.OpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#open}.
	 * @param ctx the parse tree
	 */
	void exitOpen(HaskellParser.OpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#close}.
	 * @param ctx the parse tree
	 */
	void enterClose(HaskellParser.CloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#close}.
	 * @param ctx the parse tree
	 */
	void exitClose(HaskellParser.CloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#semi}.
	 * @param ctx the parse tree
	 */
	void enterSemi(HaskellParser.SemiContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#semi}.
	 * @param ctx the parse tree
	 */
	void exitSemi(HaskellParser.SemiContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#special}.
	 * @param ctx the parse tree
	 */
	void enterSpecial(HaskellParser.SpecialContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#special}.
	 * @param ctx the parse tree
	 */
	void exitSpecial(HaskellParser.SpecialContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#varid}.
	 * @param ctx the parse tree
	 */
	void enterVarid(HaskellParser.VaridContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#varid}.
	 * @param ctx the parse tree
	 */
	void exitVarid(HaskellParser.VaridContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#conid}.
	 * @param ctx the parse tree
	 */
	void enterConid(HaskellParser.ConidContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#conid}.
	 * @param ctx the parse tree
	 */
	void exitConid(HaskellParser.ConidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(HaskellParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(HaskellParser.SymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#ascSymbol}.
	 * @param ctx the parse tree
	 */
	void enterAscSymbol(HaskellParser.AscSymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#ascSymbol}.
	 * @param ctx the parse tree
	 */
	void exitAscSymbol(HaskellParser.AscSymbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#varsym}.
	 * @param ctx the parse tree
	 */
	void enterVarsym(HaskellParser.VarsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#varsym}.
	 * @param ctx the parse tree
	 */
	void exitVarsym(HaskellParser.VarsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#consym}.
	 * @param ctx the parse tree
	 */
	void enterConsym(HaskellParser.ConsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#consym}.
	 * @param ctx the parse tree
	 */
	void exitConsym(HaskellParser.ConsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#tyvar}.
	 * @param ctx the parse tree
	 */
	void enterTyvar(HaskellParser.TyvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#tyvar}.
	 * @param ctx the parse tree
	 */
	void exitTyvar(HaskellParser.TyvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#tycon}.
	 * @param ctx the parse tree
	 */
	void enterTycon(HaskellParser.TyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#tycon}.
	 * @param ctx the parse tree
	 */
	void exitTycon(HaskellParser.TyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#tycls}.
	 * @param ctx the parse tree
	 */
	void enterTycls(HaskellParser.TyclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#tycls}.
	 * @param ctx the parse tree
	 */
	void exitTycls(HaskellParser.TyclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#modid}.
	 * @param ctx the parse tree
	 */
	void enterModid(HaskellParser.ModidContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#modid}.
	 * @param ctx the parse tree
	 */
	void exitModid(HaskellParser.ModidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qvarid}.
	 * @param ctx the parse tree
	 */
	void enterQvarid(HaskellParser.QvaridContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qvarid}.
	 * @param ctx the parse tree
	 */
	void exitQvarid(HaskellParser.QvaridContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qconid}.
	 * @param ctx the parse tree
	 */
	void enterQconid(HaskellParser.QconidContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qconid}.
	 * @param ctx the parse tree
	 */
	void exitQconid(HaskellParser.QconidContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qtycon}.
	 * @param ctx the parse tree
	 */
	void enterQtycon(HaskellParser.QtyconContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qtycon}.
	 * @param ctx the parse tree
	 */
	void exitQtycon(HaskellParser.QtyconContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qtycls}.
	 * @param ctx the parse tree
	 */
	void enterQtycls(HaskellParser.QtyclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qtycls}.
	 * @param ctx the parse tree
	 */
	void exitQtycls(HaskellParser.QtyclsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qvarsym}.
	 * @param ctx the parse tree
	 */
	void enterQvarsym(HaskellParser.QvarsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qvarsym}.
	 * @param ctx the parse tree
	 */
	void exitQvarsym(HaskellParser.QvarsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#qconsym}.
	 * @param ctx the parse tree
	 */
	void enterQconsym(HaskellParser.QconsymContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#qconsym}.
	 * @param ctx the parse tree
	 */
	void exitQconsym(HaskellParser.QconsymContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(HaskellParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(HaskellParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pfloat}.
	 * @param ctx the parse tree
	 */
	void enterPfloat(HaskellParser.PfloatContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pfloat}.
	 * @param ctx the parse tree
	 */
	void exitPfloat(HaskellParser.PfloatContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pchar}.
	 * @param ctx the parse tree
	 */
	void enterPchar(HaskellParser.PcharContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pchar}.
	 * @param ctx the parse tree
	 */
	void exitPchar(HaskellParser.PcharContext ctx);
	/**
	 * Enter a parse tree produced by {@link HaskellParser#pstring}.
	 * @param ctx the parse tree
	 */
	void enterPstring(HaskellParser.PstringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HaskellParser#pstring}.
	 * @param ctx the parse tree
	 */
	void exitPstring(HaskellParser.PstringContext ctx);
}