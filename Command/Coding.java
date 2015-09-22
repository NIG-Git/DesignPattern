package Command;

public class Coding implements Command{

	private Receiver receiver;
	private final String name = "製造フェーズ";

	public Coding(Receiver receiver){
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
