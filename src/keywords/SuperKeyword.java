package keywords;

public class SuperKeyword {
    public static void main(String[] args) {
        // Gives 1 copy of legs = 5 tp every instance of class
        Animal.legs = 5;
        Dog dog1 = new Dog("Bobbt","Labrador");
        dog1.makeSound();
        System.out.println(dog1.legs);
    }
}

 class Animal{
    String name;
    static int legs;
    Animal(String name){
        this.name = name;
//        System.out.println("called animal");
    }
    void makeSound(){
        System.out.println("Animal making Sound");
    }
}

class Dog extends Animal{
    String Breed;
    //Access the varialbe from superclass
    int legs = super.legs;
    //It passes the value to the super constructor
    Dog(String name,String Breed){
        super(name);
        this.Breed = Breed;
//        System.out.println("called Dog");
    }
    //This method calls the super class method
    void makeSound(){
        super.makeSound();
        System.out.println("The "+ Breed + " Barks");
    }
}

