package Mediator;

public class Client {

	public static void main(String[] args){

		Mediator mediator = new TrafficController();
		Colleague col = new ColleagueCar("車");

		col.setMediator(mediator);

		col.run();
		col.run();
		col.run();
		col.run();
		col.run();
		col.run();

	}

}
