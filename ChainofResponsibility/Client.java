package ChainofResponsibility;

public class Client {

	public static void main(String[] args){

		LogHandler handler1 = new NormalLogger();
		LogHandler handler2 = new WarningLogger();
		LogHandler handler3 = new ErrorLogger();

		handler1.setNext(handler2).setNext(handler3);

		handler1.request(10);
		handler1.request(15);
		handler1.request(20);
		handler1.request(21);

	}

}
