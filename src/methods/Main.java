package methods;

public class Main {
    public static void main(String[] args) {
//        StaticMethods obj1 = new StaticMethods();
//        StaticMethods.a = 12;
//        System.out.println(obj1.a);
//

        Shape s1 = new Rectangle(5,8);
        double area = s1.getArea();
        System.out.println(area);
    }
}

class StaticMethods{
     static int a;

    static void staticMethod(){
        a = 10;
    }

}

//Instance Methods- Make this while  revision

//Abstract Class is used to create
abstract class Shape{
    public abstract double getArea();
}

//Subclass of Abstract Class
class Rectangle extends Shape{
      private int l ;
        private int b ;

        Rectangle(int l,int b){
            this.l = l;
            this.b = b;
        }

    @Override
    public double getArea() {
        return l*b;
    }
}


