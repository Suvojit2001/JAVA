package pw.skills;
import java.util.Scanner;
public class array_video2 {
    static void printArray(int [] arr){
        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter the Array elements ");
        for (int i =0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array");
        printArray(arr);

/*        int [] arr_2 = arr;           //shallow copy
        System.out.println("Copied array");
        printArray(arr_2);  */

/*        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing copied array");    //you will se that the original array is also changed
        printArray(arr);
        System.out.println("Copied  array after changing copied array");
        printArray(arr_2);          */

        int [] arr_2 = arr.clone();    //*********************************imp
        printArray(arr_2);
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing copied array");
        printArray(arr);
        System.out.println("Copied  array after changing copied array");            //in this clone only the copied array will change
        printArray(arr_2);



    }
}
