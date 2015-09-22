package Command;

public class Client {

	public static void main(String[] args){

		Receiver receiver = new ConcreateReceiver();
		Invoker invoker = new Invoker();

		invoker.addCommand(new Design(receiver));
		invoker.addCommand(new Coding(receiver));
		invoker.addCommand(new Test(receiver));
		invoker.addCommand(new SystemTest(receiver));

		invoker.execute();
		invoker.undoCommand();
		invoker.execute();

	}

}
