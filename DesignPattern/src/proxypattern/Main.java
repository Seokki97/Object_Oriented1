package proxypattern;

public class Main {
    public static void main(String[] args) {
        IBrowser browser = new BrowserProxy("www.naver.com");
        browser.show();
    }
}
