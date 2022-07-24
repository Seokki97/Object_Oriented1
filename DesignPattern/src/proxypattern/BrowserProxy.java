package proxypattern;

public class BrowserProxy implements IBrowser{

    private String url;
    private html html;

    public BrowserProxy(String url){
        this.url = url;
    }
    @Override
    public html show() {
        if(html == null){
            this.html = new html(url);
            System.out.println("browser loading html from :" +url);
        }
        System.out.println("Browser loading cashing:" + url);
        return html;
    }
}
