package ch07;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {

        FileInputStream fis= null;
        try{
            fis = new FileInputStream("a.txt");
        } catch(FileNotFoundException e){
            System.out.println(e);
        }finally{ //사용한 리소스를 해제하는것
            if(fis != null){ //열렸을때 close해야함
                try{
                    fis.close();
                }catch (IOException e){
                    e.printStackTrace();//어디서 오류가 났는지 찍어주는 기능 trace
                }
            }
            System.out.println("항상 수행되는 부분");
        }
        System.out.println("여기도 수행됨");

    }
}
