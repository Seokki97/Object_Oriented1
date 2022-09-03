package model;

import java.util.ArrayList;
import java.util.List;

public class Goods {

    private String goodsName;
    private int price;
    private int quantity;


    public Goods(){}
    public Goods(String goodsName, int price, int quantity) {
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
    }

    public void setGoodsName(String goodsName, int price, int quantity) {
        this.goodsName = goodsName;
        this.price = price;
        this.quantity = quantity;
    }

}
