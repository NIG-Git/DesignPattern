package Iterator;

public class Main {
    public static void main(String args[]) {

    	/*** 1 ***/
        BookShelf bookShelf = new BookShelf();

        bookShelf.addBook(new Book(1, "ライオンの本"));
        bookShelf.addBook(new Book(2, "イヌの本"));
        bookShelf.addBook(new Book(3, "ネコの本"));
        bookShelf.addBook(new Book(4, "タヌキの本"));
        bookShelf.addBook(new Book(5, "パンダの本"));

        /*** 2 ***/
        Iterator outputIt = bookShelf.outputIterator();
        while (outputIt.hasNext()) {
            Book book = (Book) outputIt.next();
            System.out.print("書籍番号: No" + book.getNum());
            System.out.println(" 書籍名称: "+book.getName());
        }
    }
}
