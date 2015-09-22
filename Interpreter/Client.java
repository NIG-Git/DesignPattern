package Interpreter;

public class Client {

	public static void main(String[] args){

		String source = "10 - 3 + 5 - 6 + 9 + 2 - 5 - 1 <END>";

		Context context = new Context(source);

		Expression expression = new NonTerminalExpression();

		System.out.println(expression.Interpret(context));

	}

}
