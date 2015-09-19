package Decorator;

public class PHPTitleBook implements Book {

	private Book book = null;

	public PHPTitleBook(Book book){
		this.book = book;
	}

	@Override
	public String getName() {
		String ret = "PHP" + book.getName();
		return ret;
	}

}
