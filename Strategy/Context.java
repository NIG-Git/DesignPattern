package Strategy;

public class Context {

	private OutputLog outputLog;

	public Context(OutputLog outputLog){

		setOutputLog(outputLog);

	}

	public void setOutputLog(OutputLog outputLog){
		this.outputLog = outputLog;
	}

	public void contextMethod(){
		outputLog.outputLog();
	}

}
