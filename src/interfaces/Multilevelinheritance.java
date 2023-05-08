package interfaces;

public class Multilevelinheritance {
    public static void main(String[] args) {
       Parent2 c1 = new child();
        c1.draw();
    }
}

interface Parent1{
    void draw();
}

interface Parent2{
    void draw();
}

class child implements Parent1,Parent2{
    public void draw(){
        System.out.println("This is triggered");
    }
}