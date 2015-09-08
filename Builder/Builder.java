package Builder;

public abstract class Builder {

	public abstract void language(String str);

	public abstract void framework(String str);

	public abstract void OS(String str);

	public abstract void database(String str);

	public abstract Object getProject();

}
