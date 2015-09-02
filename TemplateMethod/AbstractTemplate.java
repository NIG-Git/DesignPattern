package TemplateMethod;

public abstract class AbstractTemplate {

	public void startDevelopment(){

		System.out.println("基本設計フェーズ");
		System.out.println("詳細設計フェーズ");
		System.out.println("製造フェーズ");
		System.out.println("単体テストフェーズ");
		System.out.println("結合テストフェーズ");

		this.afterProcess();

		System.out.println("リリース完了");

	}

	public abstract void afterProcess();

}
