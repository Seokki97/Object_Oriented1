package ch11;

public class TakeTransTest {
    public static void main(String[] args) {
        Customer StudentJ = new Sturent("James", 5000);
        Customer StuedentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);

        Subway subwayGreen = new Subway(2);

        studentJ.takeBus(bus100);
        studentT.takeSubway(subwayGreen);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusInfo();

        subwayGreen.showSubwayInfo();
    }
}
