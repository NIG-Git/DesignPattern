package Singleton;

public class Singleton {

	private static Singleton instance;

	//スレッドによる同時呼び出しを防ぐため、synchronizedを付与し同期実行
	public static synchronized Singleton getInstance(){

		if(instance == null){

			instance = new Singleton();

		}

		return instance;

	}

}
