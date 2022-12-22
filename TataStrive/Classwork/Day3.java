package TataStrive.Classwork;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter length");
//        int length = sc.nextInt();
//        System.out.println("Enter breadth");
//        int breadth = sc.nextInt();
//        int area = 2*(length+breadth);
//        System.out.println("Area of the rectangle is " + area);
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
       double circleArea = (3.14)*radius*radius;
        System.out.println("Area of the circle is " + circleArea);


    }
}
