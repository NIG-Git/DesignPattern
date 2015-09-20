package Visitor;

public interface Visitor {

	public void visit(Design desgin);
	public void visit(Coding coding);
	public void visit(Test test);
	public void visit(Project project);

}
