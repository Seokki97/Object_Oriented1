package ch28;

public class BookShelfTest {
    public static void main(String[] args) {

        Queue bookQueue = new BookShelf();
        bookQueue.enQueue("마비노기1");
        bookQueue.enQueue("마비노기2");
        bookQueue.enQueue("마비노기3");
        bookQueue.enQueue("마비노기4");
        bookQueue.enQueue("마비노기5");

        System.out.println(bookQueue.getSize());
        System.out.println(bookQueue.deQueue());

    }
}
