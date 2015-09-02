package Adapter;

public class TransferAdapter extends AbstractTarget {

	Adaptee adaptee;

	@Override
	public void targetMethod() {

		adaptee = new Adaptee();

		adaptee.adapteeMethod();

	}

}
