class Circle{
    Circle(int r){
        this.r=r;
    }
  public  int r;
  public double area(){
      return Math.PI*this.r*this.r;
  }
}
class Cylinder extends Circle{
    Cylinder(int r,int h){
        super(r);
        this.height=h;
    }
    public  int height;
    public double volume(){
        return Math.PI*this.r*this.r*this.height;
    }
}
public class practice_set10 {
    public static void main(String[] args) {
//        Circle objc =new Circle(4);
        Cylinder obj =new Cylinder(4,5);
//        System.out.println(obj.volume());
    }
}
