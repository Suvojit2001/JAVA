import java.util.Scanner;
public class practice_set4 {
    public static void main(String[] args) {
        //question2
/*        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("enter your marks in maths");
        m2 = sc.nextByte();
        System.out.println("enter your marks in chem");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.printf("your overall percentage is %f ",avg);
        //or
//        System.out.println("your overall percentage is"+avg);
        if (avg >= 40 && m1 >33 && m2 >33 && m3 >33){
            System.out.println("you are passed");
        }
        else{
            System.out.println("you are fail ");
        }                                                                 */




        //question3

/*        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakh/annum ");
        float income = sc.nextFloat();
        float tax = 0;
         if(income<2.5f){
             tax=tax+0;

         }
        else if(income>2.5f && income<=5f ){
            tax = tax+ 0.05f *(income - 2.5f);

        }
         else if(income>5f && income<=10f ){
             tax = tax+ 0.05f *(5.0f - 2.5f);
             tax = tax+ 0.2f *(income - 5f);

         }
         else if(income>10f ){
             tax = tax+ 0.05f *(5.0f - 2.5f);
             tax = tax+ 0.2f *(10.0f - 5f);
             tax = tax+ 0.3f *(income - 10.0f);

         }
        System.out.println("tax is "+tax);            */



        //question 4

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number ");
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }                                                                             */


        //question 6

/*        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website ");
        String site = sc.next();
        if (site.endsWith(".org")){
            System.out.println("this is an organisation website");
        }
        else if (site.endsWith(".in")){

            System.out.println("this is an indian website ");
        }
        else if (site.endsWith(".com")){

            System.out.println("this is an commercial website ");
        }
        else {
            System.out.println("this is ordinary site");
        }                                                                       */
    }

}
