package Facade;

public class Facade {

	public void startProject(){

		Design design = new Design();
		Coding coding = new Coding();
		Test test = new Test();

		design.basicDesign();
		design.detailDesign();

		coding.coding();

		test.unitTest();
		test.linkTest();

	}

}
