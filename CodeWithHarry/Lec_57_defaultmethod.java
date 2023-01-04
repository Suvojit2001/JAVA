package CodeWithHarry;

interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class Lec_57_defaultmethod implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public static void main(String[] args) {
        Lec_57_defaultmethod obj1 = new Lec_57_defaultmethod();
        obj1.bark();
        obj1.say();

    }


}
