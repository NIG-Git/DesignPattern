package Interpreter;

public class NonTerminalExpression implements Expression{

	private int result;
	private boolean calcFlg;
	private String plusStr = "+";
	private String minusStr = "-";

	@Override
	public int Interpret(Context context) {

		result += Integer.parseInt(context.getToken());

		Expression expression;
		context.nextToken();

		String token = "";

		while(context.notEnd()){

			token = context.getToken();

			if(plusStr.equals(token) || minusStr.equals(token)){

				calcFlg = plusStr.equals(token) ? true : false;
				context.nextToken();
				continue;

			}else{

				expression = new TerminalExpression();

			}

			if(calcFlg){

				result += expression.Interpret(context);

			}else{

				result -= expression.Interpret(context);

			}

		}

		return result;

	}

}
