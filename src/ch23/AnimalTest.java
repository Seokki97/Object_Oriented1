package ch23;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();

        AnimalTest test = new AnimalTest();

        ArrayList<Animal> animal21 = new ArrayList<>();

        animal21.add(dog);
        animal21.add(hAnimal);
        animal21.add(tAnimal);

        for(Animal animal: animal21){
            animal.move();
        }
        test.testDownCasting(animal21);
    }

    public void testDownCasting(ArrayList<Animal> animal2){

        for(int i = 0; i<animal2.size(); i++){

            Animal animal = animal2.get(i);

            if( animal instanceof Human){
                Human human = (Human)animal;
                human.readBook();
            }
            else if( animal instanceof Tiger){
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            }
            else{System.out.println("오류");}
        }

    }
}