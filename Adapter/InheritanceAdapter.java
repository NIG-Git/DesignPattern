package Adapter;

public class InheritanceAdapter extends Adaptee implements Target {

	@Override
	public void targetMethod() {

		adapteeMethod();

	}

}
