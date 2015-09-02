package TemplateMethod;

public class ImplementMethod1 extends AbstractTemplate {

	@Override
	public void afterProcess() {

		System.out.println("開発チーム内レビュー");
		System.out.println("客先レビュー");
		System.out.println("リリース前最終チェック");

	}

}
