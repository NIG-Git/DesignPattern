package Prototype;

public class Main {

	public static void main(String[] args){

		Client client = new Client();

		ConcreatePrototype model1 = new ConcreatePrototype("Model1");
		ConcreatePrototype model2 = new ConcreatePrototype("Model2");

		client.set("Model1", model1);
		client.set("Model2", model2);

		Prototype proto1 = client.create("Model1");
		Prototype proto2 = client.create("Model2");

		System.out.println(((ConcreatePrototype)proto1).getName());
		System.out.println(((ConcreatePrototype)proto2).getName());

	}

}
