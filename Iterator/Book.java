package Iterator;

public class Book {
    private int _bookNum;
    private String _bookName;

    public Book(int bookNum, String bookName) {
    	_bookNum = bookNum;
    	_bookName = bookName;
    }

    public int getNum() {
        return _bookNum;
    }

    public String getName() {
        return _bookName;
    }
}
