package CodeWithHarry;
class base1{
    base1(){
        System.out.println("i am parent");
    }
    base1(int a){
        System.out.println("i an overloaded constructor of derived with value of a as "+ a);
    }
   }
class derived1 extends base1{
    derived1(){
        System.out.println("i am child of parent ");
    }
    derived1(int a ,int b){
        super(a);
        System.out.println("i an overloaded constructor of derived with value of b as "+ b);
    }
   }

class derived2 extends derived1{
    derived2(){
        System.out.println("I am chile of derived 1");
    }
    derived2(int a,int b,int c){
        super(a,b);
        System.out.println("i an overloaded constructor of derived with value of c as "+ c);
    }
}
public class LEC_46 {
    public static void main(String[] args) {
//        base1 b=new base1();
//        derived1 d1=new derived1(4,9);
        derived2 d2=new derived2(4,5,6);
    }
}
