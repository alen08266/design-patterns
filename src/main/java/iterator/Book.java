package iterator;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 18:12
 */
public class Book {

    private String name ;

    public Book(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}