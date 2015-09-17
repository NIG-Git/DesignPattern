package Strategy;

public class Client {

	public static void main(String[] args){

		Context context = new Context(new OutputNormalLog());
		context.contextMethod();

		context.setOutputLog(new OutputErrorLog());
		context.contextMethod();

	}

}
