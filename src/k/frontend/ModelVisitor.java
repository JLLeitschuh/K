// Generated from ../grammar/Model.g4 by ANTLR 4.4
package k.frontend;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ModelParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ModelVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenIFF}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenIFF(@NotNull ModelParser.TokenIFFContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#sortDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortDeclaration(@NotNull ModelParser.SortDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetEnumExp(@NotNull ModelParser.SetEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFFExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFFExp(@NotNull ModelParser.IFFExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(@NotNull ModelParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp1Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp1Exp(@NotNull ModelParser.BinOp1ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenType(@NotNull ModelParser.ParenTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenArrow(@NotNull ModelParser.TokenArrowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListCompExp(@NotNull ModelParser.ListCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RangeType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(@NotNull ModelParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(@NotNull ModelParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenGreatherThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenGreatherThan(@NotNull ModelParser.TokenGreatherThanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenStar(@NotNull ModelParser.TokenStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListEnumExp(@NotNull ModelParser.ListEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull ModelParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp3Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp3Exp(@NotNull ModelParser.BinOp3ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(@NotNull ModelParser.IdentExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenLessThan}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenLessThan(@NotNull ModelParser.TokenLessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExistsExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExp(@NotNull ModelParser.ExistsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LiteralExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExp(@NotNull ModelParser.LiteralExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTyping(@NotNull ModelParser.TypingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExp(@NotNull ModelParser.ParenExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(@NotNull ModelParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentType(@NotNull ModelParser.IdentTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#topDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopDeclaration(@NotNull ModelParser.TopDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(@NotNull ModelParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OptionalType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalType(@NotNull ModelParser.OptionalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(@NotNull ModelParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOp2Exp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOp2Exp(@NotNull ModelParser.BinOp2ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#patternList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternList(@NotNull ModelParser.PatternListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#matchArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchArgument(@NotNull ModelParser.MatchArgumentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CreateExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateExp(@NotNull ModelParser.CreateExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapCompExp(@NotNull ModelParser.MapCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetType(@NotNull ModelParser.SetTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenImplies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenImplies(@NotNull ModelParser.TokenImpliesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(@NotNull ModelParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetCompExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCompExp(@NotNull ModelParser.SetCompExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapType(@NotNull ModelParser.MapTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#valueParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueParameters(@NotNull ModelParser.ValueParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBinding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBinding(@NotNull ModelParser.RngBindingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MatchExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExp(@NotNull ModelParser.MatchExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch(@NotNull ModelParser.MatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenEquals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenEquals(@NotNull ModelParser.TokenEqualsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#collectionOrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOrType(@NotNull ModelParser.CollectionOrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#extending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtending(@NotNull ModelParser.ExtendingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classArgumentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArgumentList(@NotNull ModelParser.ClassArgumentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(@NotNull ModelParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#rngBindingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRngBindingList(@NotNull ModelParser.RngBindingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#model}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModel(@NotNull ModelParser.ModelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#idValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValueList(@NotNull ModelParser.IdValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(@NotNull ModelParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenNot}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenNot(@NotNull ModelParser.TokenNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentPattern(@NotNull ModelParser.IdentPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenAnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenAnd(@NotNull ModelParser.TokenAndContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(@NotNull ModelParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(@NotNull ModelParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AppExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppExp(@NotNull ModelParser.AppExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenOr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenOr(@NotNull ModelParser.TokenOrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenLessThanEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenLessThanEqual(@NotNull ModelParser.TokenLessThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassToken(@NotNull ModelParser.ClassTokenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssertExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssertExp(@NotNull ModelParser.AssertExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(@NotNull ModelParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(@NotNull ModelParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianPattern}
	 * labeled alternative in {@link ModelParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianPattern(@NotNull ModelParser.CartesianPatternContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExp(@NotNull ModelParser.AssignExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionOrStar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrStar(@NotNull ModelParser.ExpressionOrStarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#tokenGreaterThanEqual}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenGreaterThanEqual(@NotNull ModelParser.TokenGreaterThanEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegExp(@NotNull ModelParser.NegExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#idValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdValuePair(@NotNull ModelParser.IdValuePairContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TupleExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExp(@NotNull ModelParser.TupleExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#valueDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclaration(@NotNull ModelParser.ValueDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotExp(@NotNull ModelParser.DotExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRngExp(@NotNull ModelParser.ListRngExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(@NotNull ModelParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(@NotNull ModelParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(@NotNull ModelParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#expressionsWithSeparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithSeparator(@NotNull ModelParser.ExpressionsWithSeparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassArgument(@NotNull ModelParser.ClassArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull ModelParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(@NotNull ModelParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetRngExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetRngExp(@NotNull ModelParser.SetRngExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(@NotNull ModelParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CartesianType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCartesianType(@NotNull ModelParser.CartesianTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#mapPairList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPairList(@NotNull ModelParser.MapPairListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#matchPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchPattern(@NotNull ModelParser.MatchPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#mapPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapPair(@NotNull ModelParser.MapPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(@NotNull ModelParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForallExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForallExp(@NotNull ModelParser.ForallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(@NotNull ModelParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MapEnumExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapEnumExp(@NotNull ModelParser.MapEnumExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LambdaExp}
	 * labeled alternative in {@link ModelParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExp(@NotNull ModelParser.LambdaExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#typingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypingList(@NotNull ModelParser.TypingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(@NotNull ModelParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrimType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimType(@NotNull ModelParser.PrimTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SubType}
	 * labeled alternative in {@link ModelParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubType(@NotNull ModelParser.SubTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ModelParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull ModelParser.LiteralContext ctx);
}