package Polymorphism;


// In this example we experience static binding / compile
public class DynamicBinding {
    public static void main(String[] args) {
        Animalss a = new Dogss();
        a.makeSound(); // Bark as during runtime it dynamically decided to return the Dogss Method
    }
}

class Animalss{
    public void makeSound(){
        System.out.println("making sound");
    }
}

class Dogss extends Animalss{
    public void makeSound(){
        System.out.println("bark");
    }
}