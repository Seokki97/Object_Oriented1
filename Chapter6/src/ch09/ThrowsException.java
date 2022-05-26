package ch09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className); //여기서 exception이 발생하지만 이걸 미루고 이 메서드를 쓰는 쪽에서 핸들링을 하겠단 말임
        return c;
    }
    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        try{
            test.loadClass("a.txty","java.lang.String");

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }catch (Exception e){ //어떤 Exception이 발생할 지 모를때 사용하는것. 디폴트 Exception이라 함
            // 즉 모든 Exception의 최상위 클래스
            System.out.println(e);
        }
    }


}
