package Decorator;

public class JavaTitleBook implements Book{

	private Book book = null;

	public JavaTitleBook(Book book){
		this.book = book;
	}

	@Override
	public String getName() {
		String ret = "Java" + book.getName();
		return ret;
	}

}
