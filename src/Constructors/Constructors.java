package Constructors;

public class Constructors {
    public static void main(String[] args) {
        defaultConstructors d1 = new defaultConstructors();
        ParameterizedConstructor d2 = new ParameterizedConstructor(25);
        ParameterizedConstructor d3=new ParameterizedConstructor(26);
        System.out.println(ParameterizedConstructor.a);
    }
}

class defaultConstructors {
    private int a;
    defaultConstructors(){
        System.out.println("Default Called");
    }
}


//static member
class ParameterizedConstructor{
    public static int a;
    ParameterizedConstructor(int a){
        this.a = a;
    }
}

//3 Constructors  with different set of parameters
class ConstructorOverloading {
    String name;
    int age;
    int roll;

    ConstructorOverloading(String name,int age,int roll){
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    ConstructorOverloading(String a,int age){
        this.age = age;
        this.name =a ;
    }

    ConstructorOverloading(){

    }
}
