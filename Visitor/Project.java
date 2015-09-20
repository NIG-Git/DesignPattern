package Visitor;

public class Project implements Acceptor{

	private Design design = new Design();
	private Coding coding = new Coding();
	private Test test = new Test();

	public Design getDesign(){
		return this.design;
	}

	public Coding getCoding(){
		return this.coding;
	}

	public Test getTest(){
		return this.test;
	}

	public void accept(Visitor visitor){
		visitor.visit(this);
	}

}
