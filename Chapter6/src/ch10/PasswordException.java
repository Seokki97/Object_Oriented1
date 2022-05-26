package ch10;

public class PasswordException extends IllegalArgumentException{//argument의 오류가 있을때 런타임오류발생하는 exception

    public PasswordException(String message){
        super(message);
    }


}
