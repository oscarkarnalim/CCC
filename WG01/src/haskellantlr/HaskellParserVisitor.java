// Generated from C:\Users\oscar\Desktop\u005Cunsorted\HaskellParser.g4 by ANTLR 4.5.1
package haskellantlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HaskellParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HaskellParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HaskellParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(HaskellParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragmas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragmas(HaskellParser.PragmasContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pragma}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma(HaskellParser.PragmaContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#extension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension(HaskellParser.ExtensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(HaskellParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpdecls(HaskellParser.ImpdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExports(HaskellParser.ExportsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exprt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprt(HaskellParser.ExprtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpdecl(HaskellParser.ImpdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpspec(HaskellParser.ImpspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#himport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHimport(HaskellParser.HimportContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCname(HaskellParser.CnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#topdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopdecls(HaskellParser.TopdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#topdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopdecl(HaskellParser.TopdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecls(HaskellParser.DeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(HaskellParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#specs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecs(HaskellParser.SpecsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpec(HaskellParser.SpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdecls(HaskellParser.CdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCdecl(HaskellParser.CdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#idecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdecls(HaskellParser.IdeclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#idecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdecl(HaskellParser.IdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gendecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGendecl(HaskellParser.GendeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOps(HaskellParser.OpsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(HaskellParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fixity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFixity(HaskellParser.FixityContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(HaskellParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#btype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBtype(HaskellParser.BtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#atype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtype(HaskellParser.AtypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtycon(HaskellParser.GtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#typecontext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypecontext(HaskellParser.TypecontextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#cls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCls(HaskellParser.ClsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#scontext}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScontext(HaskellParser.ScontextContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#simpleclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleclass(HaskellParser.SimpleclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#simpletype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpletype(HaskellParser.SimpletypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constrs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstrs(HaskellParser.ConstrsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#constr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr(HaskellParser.ConstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#newconstr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewconstr(HaskellParser.NewconstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fielddecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFielddecl(HaskellParser.FielddeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#deriving}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeriving(HaskellParser.DerivingContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#dclass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDclass(HaskellParser.DclassContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#inst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst(HaskellParser.InstContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fdecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFdecl(HaskellParser.FdeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#callconv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallconv(HaskellParser.CallconvContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#impent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpent(HaskellParser.ImpentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#expent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpent(HaskellParser.ExpentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#safety}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSafety(HaskellParser.SafetyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#funlhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunlhs(HaskellParser.FunlhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#rhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRhs(HaskellParser.RhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdrhs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdrhs(HaskellParser.GdrhsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdrh}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdrh(HaskellParser.GdrhContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#guards}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuards(HaskellParser.GuardsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#guard}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGuard(HaskellParser.GuardContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(HaskellParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#infixexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixexp(HaskellParser.InfixexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#lexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexp(HaskellParser.LexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFexp(HaskellParser.FexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#aexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexp(HaskellParser.AexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQual(HaskellParser.QualContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#alts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlts(HaskellParser.AltsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#alt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt(HaskellParser.AltContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdpats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdpats(HaskellParser.GdpatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ifgdpats}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfgdpats(HaskellParser.IfgdpatsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gdpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGdpat(HaskellParser.GdpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmts(HaskellParser.StmtsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(HaskellParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFbind(HaskellParser.FbindContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPat(HaskellParser.PatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#lpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLpat(HaskellParser.LpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#apat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApat(HaskellParser.ApatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#fpat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFpat(HaskellParser.FpatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGcon(HaskellParser.GconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(HaskellParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvar(HaskellParser.QvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCon(HaskellParser.ConContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qcon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQcon(HaskellParser.QconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarop(HaskellParser.VaropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarop(HaskellParser.QvaropContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#conop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConop(HaskellParser.ConopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconop(HaskellParser.QconopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(HaskellParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQop(HaskellParser.QopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#gconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGconsym(HaskellParser.GconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen(HaskellParser.OpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose(HaskellParser.CloseContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemi(HaskellParser.SemiContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HaskellParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecial(HaskellParser.SpecialContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarid(HaskellParser.VaridContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#conid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConid(HaskellParser.ConidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbol(HaskellParser.SymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#ascSymbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscSymbol(HaskellParser.AscSymbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#varsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarsym(HaskellParser.VarsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#consym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsym(HaskellParser.ConsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tyvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyvar(HaskellParser.TyvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycon(HaskellParser.TyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#tycls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTycls(HaskellParser.TyclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#modid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModid(HaskellParser.ModidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarid(HaskellParser.QvaridContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconid(HaskellParser.QconidContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtycon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtycon(HaskellParser.QtyconContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qtycls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQtycls(HaskellParser.QtyclsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qvarsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQvarsym(HaskellParser.QvarsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#qconsym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQconsym(HaskellParser.QconsymContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#integer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger(HaskellParser.IntegerContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pfloat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPfloat(HaskellParser.PfloatContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pchar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPchar(HaskellParser.PcharContext ctx);
	/**
	 * Visit a parse tree produced by {@link HaskellParser#pstring}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPstring(HaskellParser.PstringContext ctx);
}