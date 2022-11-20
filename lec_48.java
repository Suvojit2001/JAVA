class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override //this is just  notation
    public void meth2(){
        System.out.println("i am method 2 of class B");          //redefine method of superclass in subclass
    }
    public void meth3(){
        System.out.println("i am method 3 of class B");
    }
}
public class lec_48 {
    public static void main(String[] args) {
        A a =new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
