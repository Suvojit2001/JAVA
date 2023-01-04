package CodeWithHarry;
class CellPhone{
    public void Call(){
        System.out.println("Calling Your Friend");
    }
    public void switchOn(){
        System.out.println("Turning on Your Phone");
    }
    public void switchOff(){
        System.out.println("Turning off Your Phone");
    }
}
interface property{
    void Camera();
    void Calculator();
    void PlayStore();
}
class SmartPhonee extends CellPhone implements property {       //we can implement many interfaces at a time and extends a class
  public   void Camera(){
      System.out.println("turning on camera");
    }
    public void Calculator(){
        System.out.println("Your total profit is 0");
    }
    public void PlayStore(){
        System.out.println("Which game you want to play");
    }
}
public class Lec_56 {
    public static void main(String[] args) {
        SmartPhonee sp = new SmartPhonee();
        sp.Calculator();
        sp.Camera();
        sp.Call();
        sp.switchOff();
    }
}
