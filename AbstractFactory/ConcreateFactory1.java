package AbstractFactory;

public class ConcreateFactory1 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProdcutB() {
		return new ProductB1();
	}

}
