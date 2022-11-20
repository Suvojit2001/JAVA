
class Phone{
    public void showTime(){
        System.out.println("This is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone");
    }

}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("playing music on your smart phone ");
    }
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
}
public class lec_49 {
    public static void main(String[] args) {
            Phone obj=new SmartPhone();
            obj.showTime();
            obj.on();
//            obj.music        //  this is not allowed
    }
}
