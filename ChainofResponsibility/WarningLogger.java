package ChainofResponsibility;

public class WarningLogger extends LogHandler{

	private final int msgRangeS = 11;
	private final int msgRangeE = 15;

	@Override
	public void request(int req) {

		if(req >= msgRangeS && req <= msgRangeE){
			System.out.println("警告ログとして出力しました");
		}else if(next != null){
			next.request(req);
		}else{
			System.out.println("メッセージナンバー範囲外です");
		}

	}

}
