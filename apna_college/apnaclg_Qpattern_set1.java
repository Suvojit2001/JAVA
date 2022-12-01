package apna_college;
import java.util.Scanner;
public class apnaclg_Qpattern_set1 {
    public static void main(String[] args) {
// print  inverted half pyramid (rotated by 180 deg)
       int n = 4;
       for (int i=1;i<=n;i++){
           for (int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for (int k=1;k<=i;k++){
               System.out.print("*");
           }
           System.out.println();
       }



// print  inverted half pyramid with number
/*        int n = 5;
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }                                                       */



//Floyd's Triangle
 /*
 1
 2   3
 4   5 6
 7   8  9 10
 11 12 13 14 15
  */
/*        int n = 5;
        int number =1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(number + " "); // " " this is only for beauty pf our output
                number++;
            }
            System.out.println();
        }

 */


// 0-1 triangle
/*        int n = 5;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

 */



    }

}
