package Interpreter;

public class TerminalExpression implements Expression{

	@Override
	public int Interpret(Context context) {

		String token = context.getToken();
		context.nextToken();
		return Integer.parseInt(token);

	}

}
