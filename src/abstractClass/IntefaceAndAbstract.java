package abstractClass;

public class IntefaceAndAbstract {
    public static void main(String[] args) {
        A obj1 = new M();
        obj1.a();
        obj1.b();
        obj1.c();
        obj1.d();
        ((M)obj1).Z();  // Since no Z in interface we have to cast the object
    }
}


//Interface with Abstract Methods
interface  A{
    void a();
    void b();
    void c();
    void d();
}

//Abstract class that extends Interface and implement few methodss
abstract class B implements A{
public void c(){
    System.out.println("I am C");
        }
        abstract void Z();
}


// Class M extends Abstract Class and does not implemet non abstract methods
class M extends B{
    @Override
    public void a() {
        System.out.println("I am A");
    }

    @Override
    public void b() {
        System.out.println("I am B");
    }

    @Override
    public void d() {
        System.out.println("I am D");
    }


     void Z() {
        System.out.println("This is Compulsory Methods");
    }
}

