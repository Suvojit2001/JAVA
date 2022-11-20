public class practice_set7 {
    //question 1
/*    static void multi(int n){
        for (int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d \n",n,i,n*i);
        }
    }
                                                     */

 //question 3
/*    static int sumrect(int n){
        if (n==1){
            return 1;
        }
        return n + sumrect(n-1);
    }

                                                                     */


   // Question 5
 /*   static int fib(int n){
        if (n==1){                                     //  or      if(n==1 || n==2){return n-1;} and the rest is same
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else {
            return fib(n-1) + fib(n-2);
        }
    }
                                                                            */
      //Question 8-
 /*     static void pattern(int n){
          if (n>0){
              pattern(n-1);
              for (int i = 1;i<=n;i++){
                  System.out.print("*");
              }
              System.out.println();
          }
      }                                                                                     */


    public static void main(String[] args) {
        //question 1
//        multi(5);

        //Question 3
//        int c = sumrect(3);
//        System.out.println(c);

        //Question 5
//        System.out.println(fib(7));

        //Question 8
//        pattern(5);


    }
}
