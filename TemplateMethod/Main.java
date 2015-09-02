package TemplateMethod;

public class Main {

	public static void main(String[] args){

		AbstractTemplate method = new ImplementMethod1();
		method.startDevelopment();

		System.out.println("");

		method = new ImplementMethod2();
		method.startDevelopment();

	}

}
