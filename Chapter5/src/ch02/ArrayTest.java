package ch02;

public class ArrayTest {
    public static void main(String[] args) {
        MyArray marr = new MyArray(11);
        marr.addElement(1);
        marr.addElement(2);
        marr.addElement(3);
        marr.addElement(4);
        marr.addElement(5);
        marr.addElement(6);
        marr.addElement(7);
        marr.addElement(8);
        marr.addElement(9);
        marr.addElement(10);


        marr.insertElement(4,13);
        marr.removeElement(4);
        marr.printAll();





    }
}
