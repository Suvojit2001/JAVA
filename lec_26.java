import  java.util.Scanner;
public class lec_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks= new int[5];
        for (int i =0;i<5;i++) {
            marks[i] = sc.nextInt();
            System.out.println("you have entered " + marks[i]);
        }
                          //or

/*
            int [] marks = {100,89,77,64,21};

                                                                           */

    }
}
