package ChainofResponsibility;

public abstract class LogHandler {

	protected LogHandler next;

	public LogHandler setNext(LogHandler handler){

		this.next = handler;
		return handler;

	}

	public abstract void request(int req);

}
