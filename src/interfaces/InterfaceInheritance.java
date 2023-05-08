package interfaces;

public class InterfaceInheritance {
    public static void main(String[] args) {

    }

}

interface  interfaceX{
    void draw();
}
interface  interfaceY extends interfaceX{
    void sketch();
}

class Aclass implements interfaceX{
    public void draw(){
        System.out.println("Helo");
    }
    public  void sketch(){
        System.out.println("helo2");
    };
}
