package iterator;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 18:29
 */
public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the worls in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-long-legs"));
        for(Iterator iterator = bookShelf.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}