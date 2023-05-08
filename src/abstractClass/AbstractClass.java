package abstractClass;

public class AbstractClass {
    public static void main(String[] args){
//        Bike obj = new Honda4();
//        Bike obj2 = new Hayabusa();
//        obj2.run();
//        obj.run();

        Car c1 = new harrier();
        c1.run();
        c1.gear();
    }
}


//Abstratc MEthods
abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){System.out.println("running safely");}

}

class Hayabusa extends  Bike{
    @Override
    void run() {
        System.out.println("Fasttt");
    }
}

//------Abstract MEthods , Non-Abstract Methods and Constructors

abstract class Car{
    Car(){
        System.out.println("Car is Created");
    }
    abstract void run();
    void gear(){                /// Non Abstract Method need not to be overriden
        System.out.println("Gear changed");
    }
}

class harrier extends Car{
    @Override
    void run() {
        System.out.println("Car is running");
    }
}

class civic extends Car{
    @Override
    void run() {
        System.out.println("Civi");
    }
}