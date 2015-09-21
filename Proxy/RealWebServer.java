package Proxy;

public class RealWebServer implements Server {

	@Override
	public void process(int requestNum) {

		System.out.println("RealWebServer : " + requestNum + "リクエストを処理中です...");

	}

}
