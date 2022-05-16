package ch07;


public class GenericPrinterTest {
    public static void main(String[] args) {
        Powder powder = new Powder();
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        //<> 다이아몬드 컬렉션

        powderPrinter.setMaterial(powder);

        Powder p = powderPrinter.getMaterial();
        System.out.println(powderPrinter.toString());
    }
}
