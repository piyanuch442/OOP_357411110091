package oop_lab8;

public class PetApp {
    public static void main(String[] args) {
        Dog dog =new Dog("mochi",3,"chihuahua");
        System.out.println(dog.toString());
        dog.makeNoise();

        Cat cat = new Cat("Giant",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
    }//main
}//class
