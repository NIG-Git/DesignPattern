package Strategy;

public class OutputErrorLog implements OutputLog{

	@Override
	public void outputLog() {
		System.out.println("エラーログ出力");
	}

}
