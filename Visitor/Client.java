package Visitor;

public class Client {

	public static void main(String[] args){

		Visitor visitor = new StartProject();

		Acceptor acceptor = new Project();

		acceptor.accept(visitor);

	}

}
