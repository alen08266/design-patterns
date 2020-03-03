package adapter;

import adapter.extend.Print;
import adapter.extend.PrintBanner;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 19:35
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.pringStrong();
    }
}