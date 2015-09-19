package Composite;

public class File implements Component {

	private String name = null;

	public File(String name){
		this.name = name;
	}

	@Override
	public void operation() {
		System.out.println("This is " + name);
	}

}
