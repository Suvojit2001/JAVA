package CodeWithHarry;
import java.util.Scanner;
public class lec_18_switch {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch(age){
            case 18:
                System.out.println("you are adult");
                break;
            case 29:
                System.out.println("you are going to get job");
                break;
            case 60:
                System.out.println("you are old");
                break;
            default:
                System.out.println("enjoy your life");

//                                OR

/*        switch (age) {
            case 18 -> System.out.println("you are adult");
            case 29 -> System.out.println("you are going to get job");
            case 60 -> System.out.println("you are old");
            default -> System.out.println("enjoy your life");   }      */
        }
    }
}
