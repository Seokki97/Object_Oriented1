public class StringCalculator {

    public int add(int a, int b){

        return a+b;
    }

    public int subtract(int a, int b){

        return a-b;
    }

    public int multiply(int a, int b){

        return a*b;
    }

    public int divide(int a, int b)
    {
        try{
            if(b == 0){
                return a/b;
            }
        }catch(Exception e){
                System.out.println(e);
            }

        return a/b;
    }

    public int calculator(int front , String middle, int back) {
        int result=0;
        if (middle == "+") return result =add(front, back);
        else if (middle == "-") return result = subtract(front, back);
        else if (middle == "*") return result = multiply(front, back);
        else if (middle == "/") return result =divide(front, back);
        else try{ System.out.println("입력값이 잘못되었습니다");} catch (Exception e){
            System.out.println(e);
            }
        return result;
    }

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();

        System.out.println(sc.calculator(4,"f",3));
    }
}
