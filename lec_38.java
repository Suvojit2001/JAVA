import java.util.Scanner;
class Employee1{
    long id;
    String name;
        public void printDetails(){
            System.out.println("your id is "+id);
            System.out.println("your name is "+name);
        }
}
public class lec_38 {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        Employee1 suvo = new Employee1();
        Employee1 Harry = new Employee1();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your id");
        suvo.id =sc.nextInt();
        System.out.println("enter your id");
        Harry.id = sc.nextInt();
        System.out.println("enter your name");
        suvo.name=sc.next();
        System.out.println("enter your name");
        Harry.name =sc.next();
//        suvo.id=12;
//        suvo.name="suvojit";
//        System.out.println(suvo.id);
//        System.out.println(suvo.name);
        suvo.printDetails();
        Harry.printDetails();
    }

}
