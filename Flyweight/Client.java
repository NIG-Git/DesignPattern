package Flyweight;

public class Client {

	public static void main(String[] args){

		PartsFactory factory = PartsFactory.getInstance();

		final int createPartsNum = 10;

		for(int i = 0; i < createPartsNum; i++){
			int id = (int) (Math.random() * 10);
			Parts parts = factory.getParts(id);
			parts.getStatus();
		}

	}

}
