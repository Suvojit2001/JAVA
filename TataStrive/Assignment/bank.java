package TataStrive.Assignment;
import java.util.Scanner;
public class bank{
    public static void main(String[] args) {
        int accBalance = 0;

        Scanner sc = new Scanner(System.in);
        int money =0;

    do {
        System.out.println("Choose \n 1) WITHDRAW \n 2)DEPOSIT ");
        int option =sc.nextInt();
         switch (option) {
            case 1:
            System.out.println("Enter the amount");
            money = sc.nextInt();
            if (accBalance > money) {
                accBalance = accBalance - money;
                System.out.println("Collect Your Cash");
            } else {
                System.out.println("Insufficient Balance ! Deposit first");
            }
            break;
             case 2:
            System.out.println("Enter the amount you want to deposit");
            money = sc.nextInt();
            accBalance = accBalance + money;
            System.out.println("Deposit Successfully");
            break;


         }
    }while(true);

    }
}
