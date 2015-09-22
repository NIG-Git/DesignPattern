package Command;

public class Test implements Command{

	private Receiver receiver;
	private final String name = "テストフェーズ";

	public Test(Receiver receiver){
		this.receiver = receiver;
	}

	@Override
	public String getName(){
		return this.name;
	}

	@Override
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		receiver.action(name);
	}

}
