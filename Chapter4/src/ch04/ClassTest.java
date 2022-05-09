package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        Class c1 = Class.forName("ch04.Person");

        Person person = (Person) c1.newInstance(); //반환값이 object니까 person으로 다운캐스팅
        person.setName("lee");
        System.out.println(person);

        Class c2 = person.getClass();
        Person person1 = (Person) c2.newInstance();
        System.out.println(person1); //null

        Class[] parameterTypes = {String.class};
        Constructor cons = c2.getConstructor(parameterTypes);

        Object[] initargs = {"KIM"};
        Person kim = (Person)cons.newInstance(initargs);
        System.out.println(kim);
    }
}
