package CodeWithHarry;
interface Bicycle{
    void applyBreak(int decrement);
    void speedup(int increment);
}
class AvonCycle implements Bicycle{
    int speed = 7;
   public void applyBreak(int decrement){
        speed=speed-decrement;
    }
    public void speedup(int increment){
        speed=speed+increment;
    }
}
public  class Lec_54 {

    public static void main(String[] args) {
        AvonCycle av = new AvonCycle();
        av.speedup(5);
        System.out.println(av.speed);
    }
}
