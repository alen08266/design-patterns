package adapter.extend;

/**
 * @author RenQi
 * @Description:
 * @date 2020-03-03 19:34
 */
public class PrintBanner extends Banner implements Print{

    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void pringStrong() {
        showWithAster();
    }
}