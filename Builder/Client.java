package Builder;

public class Client {

	public static void main(String[] args){

		Director director = new Director(new ConcreateBuilder());

		Project project = (Project) director.construct();

		System.out.print(project.getLanguage());
		System.out.print(project.getFramework());
		System.out.print(project.getOS());
		System.out.print(project.getDatabase());

	}

}
