package ch10;

public class PasswordTest {
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        if(password ==null){
        System.out.println("null 오류입니다.");
        }
        else if(password.length() < 5  ){
        System.out.println("문자열 길이 오류입니다");
        }

        else if(password.matches("[a-zA-Z]+")){ //a-z or A-Z 로만 되어있다.
            System.out.println("하나이상의 숫자나 특수문자가 들어가야합니다.");
        }
    }

    public static void main(String[] args) {
        PasswordTest pt= new PasswordTest();
        pt.password = null;

        try{
            pt.setPassword(null);
        }catch(PasswordException e){
            System.out.println(e);
        }
        try{
            pt.setPassword("ds2");
        }catch(PasswordException e){
            System.out.println(e);
        }
        try{
            pt.setPassword("jasdop");
        }catch (PasswordException e){
            System.out.println(e);
        }
        try{
            pt.setPassword("djaso321");
            System.out.println(pt.getPassword());
        }catch(PasswordException e){
            System.out.println(e);
        }


    }
}
