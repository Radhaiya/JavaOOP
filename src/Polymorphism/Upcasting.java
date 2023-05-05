package Polymorphism;

public class Upcasting {
    public static void main(String[] args) {
      Animal a;
     a = new Dog();
        a.makeSound();
     a = new Cat();
        a.makeSound();
    }
}

class Animal{
    public void makeSound(){
        System.out.println("A Sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound() {

        System.out.println("Bark");
    }
}

class Cat extends Animal{
    @Override
    public void makeSound() {

        System.out.println("meow");
    }
}