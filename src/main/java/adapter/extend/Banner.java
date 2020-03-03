package adapter.extend;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 19:31
 */
public class Banner {

    private String string ;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}