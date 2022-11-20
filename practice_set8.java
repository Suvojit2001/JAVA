//Question 1
class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName( String n){
        name=n;
    }
    }
    //Question 2
   class Cellphone{
    public void ring(){
        System.out.println("Ringing.....");
    }
       public void vibrate(){
           System.out.println("Vibrateing....");
       }
       public void Callfriend(){
           System.out.println("Calling.....");
       }
   }
   //Question 3
class square{
    int side;
    public int area(){
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
   }
   //Question 4
class rectangle{
    public int area(int a,int b){
        return a*b;
    }
    public int perimeter(int a,int b){
        return 2*(a+b);
    }
   }
   class game{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("go to the safe zone, Runing...");
    }
    public void fire(){
        System.out.println("fire the enemy");
    }

   }
   class circle{
    float radius;
       public float area(){
           return (22/7.0f)*radius*radius ;
       }
       public float perimeter(){
           return 2*(22/7.0f)*radius;
       }
   }

public class practice_set8 {
    public static void main(String[] args) {
        //Question 1
/*        Employee emp = new Employee();
        emp.setName("suvo");
        emp.salary=466;
        System.out.println( emp.getSalary());
        System.out.println( emp.getName());

        //Question 2
        Cellphone asus=new Cellphone();
        asus.Callfriend();
        asus.ring();
        asus.vibrate();                                         */

        //Question 3
  /*      square sq =new square();
        sq.side=5;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());             */

        //Question 4
 /*       rectangle rec =new rectangle();
        int a,b;
        a=4;b=5;
        System.out.println(rec.area(a,b));
        System.out.println(rec.perimeter(a,b));                                         */

        //Question 5
/*        game player1=new game();
        player1.fire();
        player1.run();
        player1.hit();    */

       //Question 6
        circle rad =new circle();
        rad.radius = 5;
        System.out.println(rad.area());
        System.out.println(rad.perimeter());
    }
}
