package adapter.implement;

import adapter.extend.Banner;
import adapter.extend.Print;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 19:34
 */
public class PrintBanner implements Print{

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void pringStrong() {
        banner.showWithAster();
    }
}