package ch21;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();

        AnimalTest test = new AnimalTest(); //animaltest의 메서드니까

      //  test.moveAnimal(hAnimal); //다 상위클래스인 Animal로 형변환이 된다.
       // test.moveAnimal(tAnimal);
        //test.moveAnimal(dog);

        ArrayList<Animal> animal21 = new ArrayList<>();

        animal21.add(dog);
        animal21.add(hAnimal);
        animal21.add(tAnimal);

        for(Animal animal: animal21){
            animal.move();
        }
    }

    public void moveAnimal(Animal animal){ //Animal을 형으로
        animal.move();
    }
}
//어떤 데이터형이 들어갔느냐에 따라(Animal) move();의 구현이 달라진다. -> 다형성
//상속을  하면, 하위 클래스들을 상위 클래스로 형변환을 할 수 있음.
//이럼 굉장히 tight해지기때문에 상위클래스가 살짝 바뀌면 전부 흔들릴 수 있음.