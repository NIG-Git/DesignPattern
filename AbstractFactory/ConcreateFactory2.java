package AbstractFactory;

public class ConcreateFactory2 extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProdcutB() {
		return new ProductB2();
	}

}
