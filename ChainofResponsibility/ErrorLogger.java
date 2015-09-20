package ChainofResponsibility;

public class ErrorLogger extends LogHandler{

	private final int msgRangeS = 16;
	private final int msgRangeE = 20;

	@Override
	public void request(int req) {

		if(req >= msgRangeS && req <= msgRangeE){
			System.out.println("エラーログとして出力しました");
		}else if(next != null){
			next.request(req);
		}else{
			System.out.println("メッセージナンバー範囲外です");
		}

	}

}
