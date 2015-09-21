package State;

public class Context {

	private State state = null;

	public Context(State state){
		this.state = state;
	}

	public void changeState(State state){
		this.state = state;
	}

	public void getStatus(){
		this.state.execute();
	}

}
