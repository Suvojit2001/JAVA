package pw.skills.Array;
import java.util.Arrays;
public class array_video2_question {

    //Q4) Check if the given array is sorted or not
    static boolean IsSortedArray(int [] arr){
        boolean check = true;
        for (int i=1 ;i<arr.length;i++){
            if(arr[i]< arr[i-1]){
                check =false;
                break;
            }
        }
        return check;
    }

    //Q5)smallest and largest element of an array
    static  int[] smallestAndLargest(int [] arr ){
        Arrays.sort(arr);
        int[] ans22 = { arr[0] , arr[arr.length-1]};
        return ans22;
    }

    public static void main(String[] args) {
    //Q1) Count the number of occurrences of a particular element x
        int [] arr = {100,89,77,64,21,21,31,43,21};
        int x=21;
        int count =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                count ++;
            }
        }
        System.out.println("The number of occurrences of " + x + " is : " +count);

    //Q2) Find the last occurrences of an element x in a given array
        int ans = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==x){
                ans = i;
            }
        }
        System.out.println("The last occurrences of "+ x +" is at index :" + ans);

    //Q3) Count the number of elements strictly greater than the value x
        int count_1 = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count_1++;
            }
        }
        System.out.println("The number of elements strictly greater than the value " + x + " is : " + count_1);



    //Q4) Check if the given array is sorted or not

        int [] arr_244 = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        System.out.println( "is sorted : " + IsSortedArray(arr_244));
        System.out.println( "is sorted : " + IsSortedArray(arr));


//    Q5)smallest and lagest element of an array
        int [] ans22 =smallestAndLargest(arr);
        System.out.println("smallest " + ans22[0]);
        System.out.println("largest " + ans22[1]);
    }
}
