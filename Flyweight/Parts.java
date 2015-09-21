package Flyweight;

public class Parts {

	private int partsID;
	private int totalNum;

	public Parts(int partsID){
		this.partsID = partsID;
		System.out.println("新規Parts生成 : partsID = [ " + partsID + " ]");
	}

	private int incrementTotal(){
		return ++totalNum;
	}

	public void getStatus(){
		System.out.println("parts : partsID = [ " + partsID + " ] | totalNum = [ " + incrementTotal() + " ]");
	}

}
