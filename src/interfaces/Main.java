package interfaces;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Rectangle();


    }
}

interface Shape{
    int getArea(int S1,int S2);
}
class Rectangle implements Shape{
   @Override
    public int getArea(int l,int b){

       return l*b;
    }
}

class Square implements Shape{
    @Override
    public int getArea(int s1,int s2) {
        return s1*s2;
    }
}

