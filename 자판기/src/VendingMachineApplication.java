public class VendingMachineApplication {

    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.inputMoneyOnVendingMachine();
        System.out.println(vendingMachine.getTotalMoney());

    }
}
