package Command;

public interface Command {

	public String getName();
	public void setReceiver(Receiver receiver);
	public void execute();

}
