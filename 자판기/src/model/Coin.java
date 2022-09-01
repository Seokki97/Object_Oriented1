package model;

import java.util.ArrayList;
import java.util.List;

public class Coin {
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
