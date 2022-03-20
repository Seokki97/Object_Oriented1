package ch11;

public class Transportation {
    //내가 짠것
    String transformation;
    int price;
    String kind;
    int count;
    public Transportation(){}
    public Transportation(String transformation,String kind, int price){
        this.transformation = transformation;
        this.kind = kind;
        this.price = price;
    }

    public void showTransportInfo(){
        System.out.println(this.transformation+this.price);
    }

    /*강의 자료
   String studentName;
    int money;

    public Student(String studentName,int money){
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus){
        bus.take(1000);
        this.money -= 1000;
    }
    public void takeSubway(Subway subway){
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo(){
        System.out.println("~~~");
    }

    public class Bus{
        int busNumber;
        int passengerCount;
        int money;

        public Bus(int busNumber){
            this.busNumber = busNumber;
        }
        public void take(int money){
            this.money += money;
            passengerCount++;
        }
    }
    public void showBusinfo(){
        //~~~
    }
    public class Subway{
        int subwayNumber;
        int passengerCount;
        int money;

        public Subway(int subwayNumber){
            this.subwayNumber = subwayNumber;
        }
        public void take(int money){
            this.money +=money;
            passengerCount++;
        }

        public void showSubwayInfo(){
            //~~
        }
        */
    }


