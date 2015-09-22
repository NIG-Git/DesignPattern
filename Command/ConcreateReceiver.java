package Command;

public class ConcreateReceiver implements Receiver{

	public void action(String msg){
		System.out.println(msg + " --- 開始 ---");
		System.out.println(msg + " --- 完了 ---");
	}

}
