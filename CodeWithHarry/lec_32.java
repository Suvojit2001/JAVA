package CodeWithHarry;
public class lec_32 {
    static void foo(){
        System.out.println("good morning ");
    }
    static void foo(int a){
        System.out.println(a + "good morning");
    }
    static void foo(int a,int b){
        System.out.println(a+b + "good morning");
    }

    public static void main(String[] args) {
        foo();
        foo(4);
        foo(3,4);
    }
}
