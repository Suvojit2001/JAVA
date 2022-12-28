package CodeWithHarry;
class base{
    int x;
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("i am in base and setting x now!");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor ");
    }
}
                   //***************INHERITANCE***********
class derived extends base{
    //Then base(Super Class) is father of derived(subClass)
    //That means derived has property of base + we can add other property
    //This is inheritance.
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("i am in  derived and setting y now!");
        this.y = y;
    }
}
public class lec_45 {
    public static void main(String[] args) {
        base b =new base();
//        derived b =new derived();       //In Both Cases the output will be same
        b.setX(5);
        System.out.println(b.getX());

        derived d =new derived();            //derived can access base but base cannot access derived
        d.setY(45);
        System.out.println(d.getY());

    }
}
