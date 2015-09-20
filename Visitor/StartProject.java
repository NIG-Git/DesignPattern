package Visitor;

public class StartProject implements Visitor {

	@Override
	public void visit(Design desgin) {
		System.out.println("設計フェーズ");
	}

	@Override
	public void visit(Coding coding) {
		System.out.println("製造フェーズ");
	}

	@Override
	public void visit(Test test) {
		System.out.println("テストフェーズ");
	}

	@Override
	public void visit(Project project) {
		project.getDesign().accept(this);
		project.getCoding().accept(this);
		project.getTest().accept(this);
		System.out.println("開発終了");
	}

}
