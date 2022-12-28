package CodeWithHarry;
import java.util.Scanner;
public class pw_loop_set_1 {
    public static void main(String[] args) {
        //question 1 - count the number of digits for a given number
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int numofDigits = 0;
        while(n>0){
            n=n/10;
            numofDigits++;

        }
        System.out.println("number of digits is =" + numofDigits );



        //question 2 - Find the sum of the digits of a given number
/*        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int sum=0;
        while(n>0){
            sum = sum + (n % 10);
            n=n/10;
        }
        System.out.println(sum);                                    */


//question 3 - Reverse the digits of a number
/*        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int ans = 0;
        while (n>0){
            ans = (ans * 10 +(n % 10));
            n = n/10;

        }
        System.out.println(ans);                            */


//question 4 - Find the sum of the series s=1-2+3-4.....n
/*        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i<= n;i++){
            if(i % 2==0){
                ans = ans - i;
            }
            else {
                ans = ans + i;
            }
        }
        System.out.println(ans);                        */

// question 5 - print the first n factorial numbers
/*        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n;i++){
          fact = fact * i;
            System.out.println("factorial of " + i + "is :"+fact);
        }                                                                       */

//question6 -    given two numbers a and b .find a raise to the power  b.
/*         Scanner sc =new Scanner(System.in);
         System.out.println("enter the number");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int value=1;
         for(int i=1;i<=b;i++){
             value= value * a  ;
         }
        System.out.println(value);                          */


        }
}
