package interpreterClasses;

/**
 * enum TokenType contains as the possible token type defined by the simple LUA language
 * @author Nelsosn Tsaku
 */
public enum TokenType
{
	FUNCTION_TOK, LEFT_PAREN_TOK, RIGHT_PAREN_TOK, IF_TOK, THEN_TOK, END_TOK, 
	ELSE_TOK, WHILE_TOK, DO_TOK, ID_TOK, PRINT_TOK, GE_TOK, GT_TOK, REPEAT_TOK,
	UNTIL_TOK,LE_TOK, LT_TOK, EQ_TOK, NE_TOK, ADD_TOK, SUB_TOK, MUL_TOK, 
	DIV_TOK, ASSIGN_TOK, EOS_TOK, LITERAL_INTEGER_TOK
}
