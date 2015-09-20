package Mediator;

public class ColleagueCar extends Colleague {

	public ColleagueCar(String name){
		super(name);
	}

	@Override
	public void run() {
		mediator.control(this);
	}

	@Override
	public void advice(String msg) {
		System.out.println(msg);
	}

}
