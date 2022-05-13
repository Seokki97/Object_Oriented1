package ch06;

public class ThreeDPrinter1 {

    private Powder material;

    public void setMaterial(Powder material){
        this.material = material;
    }

    public Powder getMaterial(){
        return material;
    }

    public String toString(){
        return "재료는 파우더입니다";
    }

}
