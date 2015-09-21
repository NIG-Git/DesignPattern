package Proxy;

public class WebServer implements Server{

	private RealWebServer server;

	@Override
	public void process(int requestNum) {

		if(20 < requestNum && requestNum < 50){
			System.out.println("処理に時間がかかります、しばらくお待ちください...");
		}else if(requestNum >= 50){
			System.out.println("RealWebServerに処理を委譲します。");
			server = new RealWebServer();
			server.process(requestNum);
		}

		System.out.println("リクエスト数 : " + requestNum + "処理完了");

	}

}
