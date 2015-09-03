package FactoryMethod;

public abstract class AbstractFactory {

	public final Product create(){

		Product product = factoryMethod();

		return product;

	}

	public abstract Product factoryMethod();

}
