package Iterator;

public class ReverseIterator implements Iterator {

    private BookShelf _bookShelf;
    private int _index;

    public ReverseIterator(BookShelf bookShelf) {
    	_bookShelf = bookShelf;
        _index = _bookShelf.getNumberOfBooks() - 1;
    }

    @Override
    public boolean hasNext() {
        try {
        	_bookShelf.getBookAt(_index);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    @Override
    public Object next() {
        Book book = _bookShelf.getBookAt(_index);
        _index--;
        return book;
    }
}