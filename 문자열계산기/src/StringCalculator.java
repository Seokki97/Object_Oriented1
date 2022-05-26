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

    public static void main(String[] args) {
        StringCalculator sc = new StringCalculator();

        System.out.println(sc.divide(4,2));
    }
}
