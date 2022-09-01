import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Coin { //자판기가 보유하고 있는 금액으로 동전을 무작위 생성
    private String moneyName;
    private int moneyCount;

    List<Coin> coinList = new ArrayList<>();

    public Coin(String moneyName, int moneyCount){
        this.moneyName = moneyName;
        this.moneyCount = moneyCount;
    }

    public String getMoneyName() {
        return moneyName;
    }

    public int getMoneyCount() {
        return moneyCount;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

}
