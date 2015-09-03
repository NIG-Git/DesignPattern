package FactoryMethod;

public class ConcreateFactory extends AbstractFactory {

	@Override
	public Product factoryMethod() {

		return new ConcreateProduct();

	}

}
