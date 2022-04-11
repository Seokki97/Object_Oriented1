package ch15;

public class Book {
    private String title;
    private String author;

    public String setTitle(){
        return title;
    }

    public void getTitle(){
        this.title = title;
    }

    public String setAuthor(){
        return author;
    }

    public void getAuthor(){
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(title + "," + author);
    }
}
