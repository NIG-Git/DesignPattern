package TemplateMethod;

public class ImplementMethod2 extends AbstractTemplate {

	@Override
	public void afterProcess() {

		System.out.println("システムテストフェーズ");
		System.out.println("開発チーム内レビュー");
		System.out.println("客先レビュー");
		System.out.println("リハーサル");
		System.out.println("リリース前最終チェック");

	}

}
