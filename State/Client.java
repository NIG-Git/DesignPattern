package State;

public class Client {

	public static void main(String[] args){

		State state = new Design();

		Context context = new Context(state);

		context.getStatus();

		context.changeState(new Coding());

		context.getStatus();

		context.changeState(new Test());

		context.getStatus();

	}

}
