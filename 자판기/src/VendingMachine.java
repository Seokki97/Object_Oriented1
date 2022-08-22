public class VendingMachine {

    private int totalMoney;

    public VendingMachine(){

    }
    public VendingMachine(int money){
        this.totalMoney = money;
    }

    public int inputMoneyOnVendingMachine(){
        totalMoney = Input.input.nextInt();

        return totalMoney;
    }

    public int getTotalMoney() {
        return totalMoney;
    }
}
