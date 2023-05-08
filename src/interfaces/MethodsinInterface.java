package interfaces;

public class MethodsinInterface {
    public static void main(String[] args) {
        class1 obj = new class1();
        obj.msg2();
        obj.msg();
    }
}

 interface interface1{
    default void msg(){
        System.out.println("Helo");
    };

    void msg2();
}


// we havent declared the msg method but it implements the DEFAULT method from the interface
class class1 implements interface1{
    public void msg2(){
        System.out.println("Hi there");
    }
}

