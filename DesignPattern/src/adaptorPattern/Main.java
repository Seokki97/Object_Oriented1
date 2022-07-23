package adaptorPattern;

public class Main {
    public static void connectConsent(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
    public static void main(String[] args) {
        HairDryer hairDryer = new HairDryer();

        connectConsent(hairDryer);
        Cleaner cleaner = new Cleaner();

        Electronic110V adaptor = new SocketAdapter(cleaner);
        connectConsent(adaptor);
    }
}
