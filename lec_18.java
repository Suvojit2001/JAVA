import java.util.Scanner;
public class lec_18 {
    public static void main(String[] args) {
        int age ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter yout age");
        age = sc.nextInt();
        if (age>56){
            System.out.println("you are experienced ");
        }
        else if (age>46) {
            System.out.println("you are semi experienced ");

        }
        else if (age>36) {
            System.out.println("you are semi semi experienced ");

        }
        else{
            System.out.println("you are no experienced ");
        }

    }
}
