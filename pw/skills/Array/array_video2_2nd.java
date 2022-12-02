package pw.skills.Array;
import java.util.Arrays;
public class array_video2_2nd {
    static void printArray(int [] arr){
        for (int i=0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println( );
    }
    public static void main(String[] args) {
        int [] arr = {100,89,77,64,21};
        int []arr_2 = Arrays.copyOf(arr,arr.length);
        int []arr_3 =Arrays.copyOfRange(arr,0 , 3);        //starting to (length-1) obdi copy hobe
        printArray(arr);
        printArray(arr_2);
        printArray(arr_3);
        arr_2[0]=0;
        arr_2[1]=0;
        System.out.println("original array after changing copied array");
        printArray(arr);
        System.out.println("Copied  array after changing copied array");            //in this copy method only  the copied array will change
        printArray(arr_2);
    }
}
