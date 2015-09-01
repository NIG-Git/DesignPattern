package Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> _books = new ArrayList<Book>();

    public void addBook(Book book) {
        _books.add(book);
    }

    public Book getBookAt(int idx) throws IndexOutOfBoundsException {
        return _books.get(idx);
    }

    public void removeBookAt(int idx) throws IndexOutOfBoundsException {
         _books.remove(idx);
    }

    public int getNumberOfBooks() {
        return _books.size();
    }

    /*** 1 ***/
    @Override
    public Iterator outputIterator() {
        return new OutputIterator(this);
    }

}