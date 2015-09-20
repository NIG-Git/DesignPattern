package Visitor;

public class Test {

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
