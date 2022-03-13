package ch08;

public class BrithDay {
    private int day;
    private int month;
    private int year;

    private boolean isVaild; //boolean은 초기화해주지 않으면 자동으로 false

    public int getDay() {
        return day;
    }

    public void setDay(int day){
        /*if(day<1 || day >31){
            isVaild = false;
        }*/
        //else {

            this.day = day;
        //}

    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month){
        if(month<1 || month >12){
            isVaild = false;
        }
        else {
            isVaild = true;
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year){
        /*if(year<1 || year >9999){
            isVaild = false;
        }*/
        //else {

            this.year = year;
        //}
    }

    public void showDate(){
        if(isVaild == true) {
            System.out.println( year + "년" + month + "월" + day + "일 입니다.");
        }
        else{
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
