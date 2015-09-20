package Visitor;

public class Coding {

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
