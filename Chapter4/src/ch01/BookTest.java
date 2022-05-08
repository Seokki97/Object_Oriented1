package ch01;

class Book{
    private String title;
    private String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;

    }
    @Override
    public String toString(){
        return title +","+ author;
    }
}
public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("데미안", "헤르만 헤세");

        System.out.println(book); //가상 주소가 나옴 그래서 toString을 오버라이딩 하면 제대로된 값이 나옴

        String str = new String("test");
        System.out.println(str); //이미 String이 오버라이딩 되어서 문자열이 나옴
    }
}
