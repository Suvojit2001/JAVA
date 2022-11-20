import java.util.Scanner;
public class pw_loop_set_2 {
    public static void main(String[] args) {
/* Question 1 - ******
   print        ******
                ******                                   */
        /*
         Scanner sc =new Scanner(System.in);
        System.out.println("enter the row number");
        int r = sc.nextInt();
        System.out.println("enter the column number");
        int c = sc.nextInt();
        for (int i =1;i<=r;i++){
            for (int j=1;j<=c;j++){
                System.out.print("*");
            }
            System.out.println();
        }                                                                       */


/*question 2
******
*    *
*    *
* ****
 */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        System.out.println("Enter the column number");
        int c = sc.nextInt();
        for (int i =1;i<=r;i++){
            for (int j=1;j<=c;j++){
                if (i== 1 || i==r || j ==1 || j == c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

 */
/*  Question 3-
  *
  * *
  * * *
  * * * *
         */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
 */
 /*Question 4 -
 *****
 ****
 ***
 **
 *
 /*                                                                                                           */
/*
  Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =r;i>=1;i--) {
            for (int j = i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

          **************OR********

    Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j = 1; j <= (r+1-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
/* Question - 5
    *
   ***
  *****
 */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j=1;j<= r-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }                                                       */
/* Question 6 -
1234
2341
3412
4123
 */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j= i;j<=r;j++){
                System.out.print(j);
            }
            for (int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }                                                                                       */
/* Question 7-
1234
1234
1234
 */
/*         Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j = 1; j <= r; j++) {
                System.out.print(j);
            }
            System.out.println();
        }                                                                       */
/*
Question 8 -
121212
212121
121212
212121
 */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j = 1;j<=c;j++){
                if ((i+j)%2==0){
                    System.out.print("1");
                }
                else {
                    System.out.print("2");
                }
            }
            System.out.println();
        }                                                       */
/*
Question 9-
1
12
123
1234
 */
/*        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }                                               */

/*
Question 10
    1
   121
  12321
 1234321
 */
 /*       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row number");
        int r = sc.nextInt();
        for (int i =1;i<=r;i++) {
            for (int j=1;j<= r-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(k);
            }
            for (int l =i-1;l>=1;l--){
                System.out.print(l);
            }
            System.out.println();
        }                                                   */

/*
Question 11
     1
   2  2
  3    3
  4444444
try at your own
 */

    }
}
