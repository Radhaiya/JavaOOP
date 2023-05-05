package inheritance;

public class Employee {
    float salary = 20000;
}

class programmer extends Employee{
  private int bonus;

   int setBonus(int bonus){
        this.bonus = bonus;
        return this.bonus;
    }
}

class radhe extends programmer{
        int bonus2=10;
        static int num=105454;
}

class TestInheritance {
    public static void main(String[] args) {
        int num1 = radhe.num;
        System.out.println(num1);
        radhe p1 = new radhe();
        System.out.println(p1.salary+p1.setBonus(1000)+p1.bonus2);
    }
}
