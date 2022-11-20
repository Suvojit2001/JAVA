
import java.util.Scanner;
public class practiceset_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number in math");
        float a = sc.nextFloat();
        System.out.println("Enter your number in English");
        float b = sc.nextFloat();
        System.out.println("Enter your number in geography");
        float c = sc.nextFloat();
        System.out.println("Enter your number in bengali");
        float d = sc.nextFloat();
        System.out.println("Enter your number in life science");
        float e = sc.nextFloat();
        System.out.println("Enter your number in history");
        float f = sc.nextFloat();
        float Sum = a+b+c+d+e+f;
        float percentage = (Sum *100)/(600 );
        System.out.println(percentage);
    }
}
