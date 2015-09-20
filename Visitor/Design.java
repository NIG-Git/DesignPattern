package Visitor;

public class Design {

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
