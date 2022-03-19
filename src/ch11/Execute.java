package ch11;

public class Execute {
    public static void main(String[] args) {
        Person Tomas = new Person("Tomas","subway", 5000);
        Person James = new Person("James","bus", 10000);

        Transportation subway = new Transportation("Subway","초록색지하철",1200);
        Transportation bus = new Transportation("bus","100번버스", 1000);

        if(Tomas.trans.equals("subway")){
            Tomas.saveMoney = Tomas.money - subway.price;
            subway.count++;
        }
        else{
            Tomas.saveMoney = Tomas.money - bus.price;
            bus.count++;
        }

        if(James.trans.equals("subway")){
            Tomas.saveMoney = James.money - subway.price;
            subway.count++;
        }
        else{
            James.saveMoney = James.money - bus.price;
            bus.count++;
        }

        System.out.println("Tomas의 남은 돈은"+Tomas.saveMoney+"입니다.");
        System.out.println("James의 남은 돈은"+James.saveMoney+"입니다.");
        System.out.println(subway.kind+"의 승객은"+subway.count+"입니다");
        System.out.println(bus.kind+"의 승객은" +bus.count+"입니다.");
    }
}
