package Adapter;

public class User {

	public static void main(String[] args){
		Target adapter = new InheritanceAdapter();
		adapter.targetMethod();
	}

}
