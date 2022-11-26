package pw.skills;
import java.util.Scanner;
//converting binary to decimal
public class binary_to_decimal {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the binary num");
            int num = sc.nextInt();
//            int num = 1001;
            int ans = 0;
            int pw = 1;   //2^0=1
            while(num > 0){
                int unit_digit = num %10;
                ans += (unit_digit*pw);
                num /=10;
                pw *=2;

            }
        System.out.println(ans);

//converting decimal tyo binary
            System.out.println("Enter decimal number");
            int decimal_num=sc.nextInt();
            int ans1 =0;
            int pw1=1;
            while(decimal_num>0){
                int parity = decimal_num %2;
                ans1 +=(parity * pw1);
                pw1 *=10;
                decimal_num /=2;
            }
            System.out.println(ans1);
        }
    }
