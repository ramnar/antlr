// Generated from powerbuilder.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link powerbuilderParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface powerbuilderVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#start_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_rule(powerbuilderParser.Start_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#header_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeader_rule(powerbuilderParser.Header_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#body_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_rule(powerbuilderParser.Body_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#export_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport_header(powerbuilderParser.Export_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#release_information}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_information(powerbuilderParser.Release_informationContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#window_property_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_property_line(powerbuilderParser.Window_property_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#window_property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_property(powerbuilderParser.Window_propertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#window_property_attributes_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_property_attributes_sub(powerbuilderParser.Window_property_attributes_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#window_property_attribute_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_property_attribute_sub(powerbuilderParser.Window_property_attribute_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(powerbuilderParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#attribute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_value(powerbuilderParser.Attribute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForward_decl(powerbuilderParser.Forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#datatype_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatype_decl(powerbuilderParser.Datatype_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#type_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_variables_decl(powerbuilderParser.Type_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#global_variables_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobal_variables_decl(powerbuilderParser.Global_variables_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#variable_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_sub(powerbuilderParser.Variable_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#variable_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl(powerbuilderParser.Variable_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#decimal_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal_decl_sub(powerbuilderParser.Decimal_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#array_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_decl_sub(powerbuilderParser.Array_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#constant_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl_sub(powerbuilderParser.Constant_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#constant_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_decl(powerbuilderParser.Constant_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#function_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_forward_decl(powerbuilderParser.Function_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#parameter_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_sub(powerbuilderParser.Parameter_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#parameters_list_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters_list_sub(powerbuilderParser.Parameters_list_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#functions_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_forward_decl(powerbuilderParser.Functions_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(powerbuilderParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#on_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_body(powerbuilderParser.On_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#event_forward_decl_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_forward_decl_sub(powerbuilderParser.Event_forward_decl_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#event_forward_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_forward_decl(powerbuilderParser.Event_forward_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#event_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_body(powerbuilderParser.Event_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#access_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif(powerbuilderParser.Access_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#access_modif_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccess_modif_part(powerbuilderParser.Access_modif_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#scope_modif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScope_modif(powerbuilderParser.Scope_modifContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(powerbuilderParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(powerbuilderParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_expression(powerbuilderParser.Boolean_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#condition_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_or(powerbuilderParser.Condition_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_and(powerbuilderParser.Condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_not(powerbuilderParser.Condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#condition_comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_comparison(powerbuilderParser.Condition_comparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#add_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expr(powerbuilderParser.Add_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#mul_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul_expr(powerbuilderParser.Mul_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#unary_sign_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_sign_expr(powerbuilderParser.Unary_sign_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(powerbuilderParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_sub(powerbuilderParser.Statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#assignment_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_sub(powerbuilderParser.Assignment_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(powerbuilderParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#lvalue_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue_sub(powerbuilderParser.Lvalue_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#return_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_sub(powerbuilderParser.Return_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(powerbuilderParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#function_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_expression_sub(powerbuilderParser.Function_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#function_virtual_call_expression_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_virtual_call_expression_sub(powerbuilderParser.Function_virtual_call_expression_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#open_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_call_sub(powerbuilderParser.Open_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#close_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_call_sub(powerbuilderParser.Close_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#function_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_statement(powerbuilderParser.Function_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#super_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_call_sub(powerbuilderParser.Super_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#super_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuper_call_statement(powerbuilderParser.Super_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#event_call_statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement_sub(powerbuilderParser.Event_call_statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#event_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_call_statement(powerbuilderParser.Event_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#create_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_sub(powerbuilderParser.Create_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#create_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_call_statement(powerbuilderParser.Create_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#destroy_call_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_sub(powerbuilderParser.Destroy_call_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#destroy_call_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestroy_call_statement(powerbuilderParser.Destroy_call_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#for_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_statement(powerbuilderParser.For_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#do_while_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while_loop_statement(powerbuilderParser.Do_while_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#do_loop_while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_loop_while_statement(powerbuilderParser.Do_loop_while_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(powerbuilderParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#if_simple_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_simple_statement(powerbuilderParser.If_simple_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#continue_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_sub(powerbuilderParser.Continue_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(powerbuilderParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#post_event_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_event_sub(powerbuilderParser.Post_event_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#post_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPost_event(powerbuilderParser.Post_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#exit_statement_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement_sub(powerbuilderParser.Exit_statement_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#exit_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_statement(powerbuilderParser.Exit_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#choose_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_statement(powerbuilderParser.Choose_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#choose_case_value_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_value_sub(powerbuilderParser.Choose_case_value_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#choose_case_cond_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_cond_sub(powerbuilderParser.Choose_case_cond_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#choose_case_range_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_range_sub(powerbuilderParser.Choose_case_range_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#choose_case_else_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChoose_case_else_sub(powerbuilderParser.Choose_case_else_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#goto_stat_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stat_sub(powerbuilderParser.Goto_stat_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#goto_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_stat(powerbuilderParser.Goto_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#label_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_stat(powerbuilderParser.Label_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#try_catch_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_block(powerbuilderParser.Try_catch_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#throw_stat_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_stat_sub(powerbuilderParser.Throw_stat_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#throw_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_stat(powerbuilderParser.Throw_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(powerbuilderParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#identifier_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name(powerbuilderParser.Identifier_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#identifier_name_ex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_name_ex(powerbuilderParser.Identifier_name_exContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub(powerbuilderParser.Atom_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom_sub_call1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_call1(powerbuilderParser.Atom_sub_call1Context ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom_sub_array1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_array1(powerbuilderParser.Atom_sub_array1Context ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom_sub_ref1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_ref1(powerbuilderParser.Atom_sub_ref1Context ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom_sub_member1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom_sub_member1(powerbuilderParser.Atom_sub_member1Context ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(powerbuilderParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#swallow_to_semi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_semi(powerbuilderParser.Swallow_to_semiContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#swallow_to_newline}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwallow_to_newline(powerbuilderParser.Swallow_to_newlineContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#array_access_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_access_atom(powerbuilderParser.Array_access_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#numeric_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumeric_atom(powerbuilderParser.Numeric_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#boolean_atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_atom(powerbuilderParser.Boolean_atomContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#cast_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_expression(powerbuilderParser.Cast_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#data_type_sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_sub(powerbuilderParser.Data_type_subContext ctx);
	/**
	 * Visit a parse tree produced by {@link powerbuilderParser#data_type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_name(powerbuilderParser.Data_type_nameContext ctx);
}