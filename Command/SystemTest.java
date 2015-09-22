package Command;

public class SystemTest implements Command{

	private Receiver receiver;
	private final String name = "システムテストフェーズ";

	public SystemTest(Receiver receiver){
		this.receiver = receiver;
	}

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
