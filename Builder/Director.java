package Builder;

public class Director {

	private Builder builder;

	public Director(Builder builder){
		this.builder = builder;
	}

	public Object construct(){

		builder.language("Java");
		builder.framework("springFramework");
		builder.OS("Windows");
		builder.database("PostgreSQL");
		return builder.getProject();

	}

}
