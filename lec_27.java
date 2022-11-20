import java.util.Scanner;
public class lec_27 {
    public static void main(String[] args) {
        int [] marks = {100,89,77,64,21};
/*        float [] marks = {100.0f,89.1f,77.88f,64.33f,21.9f};
        System.out.println(marks.length);

        String [] student = {"harry","suvojit","argha","debu"};
        System.out.println(student[1]);                                          */



        //to print in reverse order

 /*       for (int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }                                                       */



        //for each loop

        for (int element:marks ) {
            System.out.println(element);

        }



    }
}
