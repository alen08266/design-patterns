package iterator;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 18:23
 */
public class BooksShelfIterator implements Iterator {

    private BookShelf bookShelf;
    private int index ;

    public BooksShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0 ;
    }

    public boolean hasNext() {
        if(index < bookShelf.getLength()){
            return true;
        }else {
            return false;
        }

    }

    public Object next() {
        Book book = bookShelf.getBooks(index);
        index ++;
        return book;
    }
}