package pw.skills;
import java.util.Scanner;
public class array_video6 {
    static void printArray(int [] arr){
        for(int i= 0; i<arr.length;i++) {
            System.out.print(arr[i] + " ");}

            System.out.println();
        }

//Q1) Given an integer array ,return the prefix sum/running sum in the same array without creating new array
/*   static int[] makePrefixArray(int [] arr){
        int [] pref = new int [ arr.length];
        pref[0]=arr[0];
        for (int i=1;i<arr.length;i++){
            pref[i]=pref[i-1]+arr[i];
        }
        return pref;
   }                                            */
//2nd method without creating a new array
    static int[] makePrefixArray(int [] arr){
         for (int i=1;i<arr.length;i++){
        arr[i] += arr[i-1];
    }
    return arr;
}
//****) Given an integer array ,return the suffix sum in the same array without creating new array
    static int [ ] makeSuffixArray(int [] arr){
        int n = arr.length;
        for (int i=n-2;i>=0;i--){
            arr[i]=arr[i] + arr[i+1];
        }
        return arr;
    }
//Q2) Given an array of integer of size n . Answer q queries where you need to print the sum of values in a given range of indices from 1 to r
    static int rangeSum(int [] arr ,int start , int end ){
         int [] pref = new int [ arr.length];
         pref[0]=arr[0];
         for (int i=1;i<arr.length;i++){
             pref[i]=pref[i-1]+arr[i];
         }
    return pref[end] - pref[start-1];
    }

 //Q3) Check if we can partition the array into two sub-array with equal sum .
 // more formally ,check that the prefix sum of a part of the array is equal to the suffix sum of the rest of the array
   static int findArraySum(int [] arr){
       int totalSum = 0 ;
       for (int i= 0 ; i<arr.length;i++){
           totalSum += arr[i];
       }
       return totalSum;
   }
    static boolean equalSumPartition(int [] arr){
        int totalSum = findArraySum(arr);           //prefixSum[i] +suffixSum[i+1] = totalSum
        int prefixSum = 0;
        for (int i = 0; i<arr.length;i++){
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum==prefixSum){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
//Q1) Given an integer array ,return the prefix sum/running sum in the same array without creating new array
        int [] arr = {1,2,3,4,5,6};
        int [] pref = makePrefixArray(arr);
        printArray(pref);

//****) Given an integer array ,return the suffix sum in the same array without creating new array
         int [] arr2 = { 5,3,2,6,3,1};
         int [] suffix = makeSuffixArray(arr2);
         printArray(suffix);

//Q2) Given an array of integer of size n . Answer q queries where you need to print the sum of values in a given range of indices from 1 to r
 /*       Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int [] arr1 = new int [n+1];
        System.out.println("Enter the "+n + " elements ");
        for(int i=1 ; i<= n;i++){       //1- indexing array
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter how many times query will run");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("enter start index ");
            int l = sc.nextInt();
            System.out.println("enter end index ");
            int r = sc.nextInt();
            int k = rangeSum(arr1,l,r);
            System.out.println(k);
        }                                                                           */

//Q3) Check if we can partition the array into two sub-array with equal sum .
// more formally ,check that the prefix sum of a part of the array is equal to the suffix sum of the rest of the array
        int [] arr4 = {1,1,1,1,1,1};
        System.out.println( "the sum of prefix sum and suffix sum  is equal ? :  " + equalSumPartition(arr4));


    }
}
