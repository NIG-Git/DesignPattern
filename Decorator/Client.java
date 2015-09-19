package Decorator;

public class Client {

	public static void main(String[] args){

		Book book1 = new JavaTitleBook(new ProgrammingBook());

		System.out.println(book1.getName());

		Book book2 = new PHPTitleBook(new ProgrammingBook());

		System.out.println(book2.getName());

	}

}
