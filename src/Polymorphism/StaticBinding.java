package Polymorphism;


// In this example we experience static binding / compile
public class StaticBinding {
    public static void main(String[] args) {
        Animals a = new Dogs();
        a.makeSound(); // Making Sound as during compiling it already decided to return the Animals Method
    }
}

class Animals{
    public static void makeSound(){
        System.out.println("making sound");
    }
}

class Dogs extends Animals{
    public static void makeSound(){
        System.out.println("bark");
    }
}