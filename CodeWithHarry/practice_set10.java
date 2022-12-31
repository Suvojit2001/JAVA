package CodeWithHarry;
class Circle1{
    public  int r;
    Circle1(int r){

        this.r=r;
        System.out.println(area());
    }

  public double area(){
      return Math.PI*this.r*this.r;
  }

}
class Cylinder1 extends Circle1{
    public  int height;
    Cylinder1(int r,int h){
        super(r);
        this.height=h;
    }

    public double volume(){
        return Math.PI*this.r*this.r*this.height;
    }
}
public class practice_set10 {
    public static void main(String[] args) {
//        Circle objc =new Circle(4);
        Cylinder1 obj =new Cylinder1(4,5);
        System.out.println(obj.volume());
    }
}
