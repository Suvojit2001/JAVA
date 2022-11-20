import java.util.Scanner;
public class apnaclg_Qpattern_set2 {

    public static void main(String[] args) {
        //print Fibonacci sequence
/*        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a =0 , b=1;
        System.out.println(a +" ");
        if (n>1){
            for (int i = 2 ;i<=n;i++){
                System.out.println(b+" ");
                int temp =b;
                b=a+b;
                a=temp;
            }
            System.out.println();
        }                                                                                                           */

        //calculate greatest common divisor of 2 numbers.
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();
        while (n1!=n2){
            if (n1>n2){
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }
        }
        System.out.println("Gcd is "+ n2);
    }
}
