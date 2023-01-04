package CodeWithHarry;
   abstract class Parent{
        Parent(){
            System.out.println("i am a constructor");
        }
        public void sayHello(){
            System.out.println("hello");
        }
        abstract public void greet();
   }
class child2 extends Parent{
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}


public class Lec_53 {
    public static void main(String[] args) {
//        Parent p = new Parent();      //this will throw an error
        child2  c2 =new child2();
        c2.greet();

    }
}
