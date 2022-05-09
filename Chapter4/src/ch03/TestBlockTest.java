package ch03;

public class TestBlockTest {
    public static void main(String[] args) {
        String strBlock = """
                        hello
                        junseok
                        siyoung
                        couple
                        hi
                        
                        """;
        System.out.println(strBlock);
        System.out.println(getBlockOfHtml());


    }
    public static String getBlockOfHtml(){
        return """
                <html>
                    <body>
                        <span>example text</span>
                    </body>
                </html>
                """;
    }
}
