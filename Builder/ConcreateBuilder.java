package Builder;

public class ConcreateBuilder extends Builder {

	private Project project = new Project();

	@Override
	public void language(String str) {
		project.setLanguage("言語 : " + str + System.getProperty("line.separator"));
	}

	@Override
	public void framework(String str) {
		project.setFramework("フレームワーク : " + str + System.getProperty("line.separator"));
	}

	@Override
	public void OS(String str) {
		project.setOS("OS : " + str + System.getProperty("line.separator"));
	}

	@Override
	public void database(String str) {
		project.setDatabase("DB : " + str + System.getProperty("line.separator"));
	}

	@Override
	public Object getProject() {
		return this.project;
	}

}
