package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args){

		List<AbstractFactory> factories = new ArrayList<>();

		factories.add(new ConcreateFactory1());
		factories.add(new ConcreateFactory2());

		for(AbstractFactory factory : factories){

			AbstractProductA productA = factory.createProductA();
			AbstractProductB productB = factory.createProdcutB();

			productA.productMethodA();
			productB.productMethodB();

		}

	}

}
