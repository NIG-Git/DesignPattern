package FactoryMethod;

public class ConcreateFactory2 extends AbstractFactory{

	@Override
	public Product factoryMethod() {

		return new ConcreateProdcut2();

	}

}
