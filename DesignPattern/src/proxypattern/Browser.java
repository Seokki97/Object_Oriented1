package proxypattern;

public class Browser implements IBrowser{
    private String url;

    public Browser(String url){
        this.url = url;
    }

    @Override
    public html show() {
        System.out.println("browser loading html from :" +url);
        return new html(url);

    }
}
