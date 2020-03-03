package iterator;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 18:13
 */
public class BookShelf implements Aggregate {

    private Book[] books ;
    private int last = 0;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator() {
        return new BooksShelfIterator(this);
    }
}