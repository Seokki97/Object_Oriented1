package ch12;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemInTest1 {
    public static void main(String[] args) {
        System.out.println("알파벳 하나를 쓰고 엔터를 누르세요");

        int i;
        try{
            //한글은 바이트단위로 쪼갤수없기떄문에 읽으려면
            InputStreamReader is = new InputStreamReader(System.in);
            i = is.read();
            System.out.println(i); //int로 반환된다 - 아스키코드
            System.out.println((char)i);//형변환
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
