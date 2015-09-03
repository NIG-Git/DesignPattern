package FactoryMethod;

public class Main {

	public static void main(String[] args){

		AbstractFactory factory = new ConcreateFactory2();

		Product product = factory.factoryMethod();

		product.productMethod();

	}
}
