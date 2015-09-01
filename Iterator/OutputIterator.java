package Iterator;

public class OutputIterator implements Iterator {

    private BookShelf _bookShelf;
    private int _index = 0;

    /*** 1 ***/
    public OutputIterator(BookShelf bookShelf) {
    	_bookShelf = bookShelf;
    }

    /*** 2 ***/
    @Override
    public boolean hasNext() {
        try {
        	_bookShelf.getBookAt(_index);
            return true;
        } catch (IndexOutOfBoundsException ex) {
            return false;
        }
    }

    /*** 3 ***/
    @Override
    public Object next() {
        Book book = _bookShelf.getBookAt(_index);
        _index++;
        return book;
    }
}
