package Command;

public class Design implements Command{

	private Receiver receiver;
	private final String name = "設計フェーズ";

	public Design(Receiver receiver){
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
