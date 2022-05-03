package ch28;

import java.util.ArrayList;

public class Shelf {

    protected ArrayList<String> shelf;

    public Shelf(){ //생성자 만들때 멤버변수 초기화하는게 좋다.
        shelf = new ArrayList();
    }

    public ArrayList<String> getShelf(){
        return shelf;
    }

    public int getCount(){
        return shelf.size();
    }

}
