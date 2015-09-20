package ChainofResponsibility;

public class NormalLogger extends LogHandler{

	private final int msgRangeS = 1;
	private final int msgRangeE = 10;

	@Override
	public void request(int req) {

		if(req >= msgRangeS && req <= msgRangeE){
			System.out.println("通常ログとして出力しました");
		}else if(next != null){
			next.request(req);
		}else{
			System.out.println("メッセージナンバー範囲外です");
		}

	}

}
