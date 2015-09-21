package Proxy;

public class Client {

	public static void main(String[] args){

		Server server = new WebServer();

		server.process(10);
		server.process(30);
		server.process(50);

	}

}
