package Polymorphism;

public class ImplementPolymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.assign();
        int ans = obj.a;

        A bobj = new A();
        int ba = bobj.a;
        System.out.println(ba);
        System.out.println(ans);

        Calculator c1 = new Calculator();

        int anss = c1.add(2,50,8);
        System.out.println(anss);
    }

}

//Runtime Polymorphism
// Data members cannot be overriden
//Method Overloading

class A{
    public int a = 15;
    public void assign(){
        System.out.println("Hemlo");
    }
}

class B extends A{
   public int a = 18;

    // The method is overridden
    //Data memvbers cannot be overriden
    @Override
    public void assign() {
        super.assign();
        System.out.println("there");
    }

}

//Method Overriding
//Different Return type , different parameters
class Calculator{
    public int add(int x,int y){
        return x+y;
    }

    int add(int x,int y,int z){
        return x+y+z;
    }

    public float add(float x ,float y){
        return x+y;
    }
}


