package Strategy;

public class OutputNormalLog implements OutputLog{

	@Override
	public void outputLog() {
		System.out.println("正常ログ出力");
	}

}
