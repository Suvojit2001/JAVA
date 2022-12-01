package pw.skills;
import java.util.Scanner;
public class array_video4 {
//Q1) Given 2 integers a and b. swap the 2given values using temporary variable.
    static  void swap(int a,int b){
        System.out.printf("Original value before swap %d , %d \n" ,a,b);
        int c =b;
        b=a;
        a=c;
        System.out.printf("Value After swap %d ,%d ",a,b);
    }

//Q2) Given 2 integers a and b . swap the 2 given value using sum and difference method
    static void sumAndDifference( int a,int b){
        System.out.printf("\nOriginal value before swap %d , %d \n" ,a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("Value After swap %d ,%d ",a,b);
    }

//Q3) Reverse an array consisting of integer values
     static int [] reverseArray(int [] arr){
        int [] ans = new int [arr.length];
        int j=0;
        for (int i = arr.length-1 ; i >= 0 ; i--){
                ans[j++]=arr[i];
        }
     return  ans;
     }
static void swapInArray(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
}
//Second Method
static void Reverse( int [] arr){
        int i = 0 , j= arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
}

//Q4) Rotate the given array k steps , where k is +ve
    static  int[] rotate( int [] arr,int k){
        int n=arr.length;
        k=k % n;
        int [] ans = new int[n];
        int j= 0;
        for( int i=n-k;i<n;i++){
            ans[j++]= arr[i];
        }
        for( int i=0;i<n-k;i++){
            ans[j++]= arr[i];
        }
        return ans;
    }
//2nd method
static void reverse( int [] arr ,int i,int j){//where i is start index and j is end index
    while(i<j){
        swapInArray(arr,i,j);
        i++;
        j--;
    }
}
    static void rotateInPlace(int [] arr,int k){
        int n= arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

//Q5) Check if the given number is present is the array or not q times .
    static int [] makeFrequencyArray(int [] arr){
        int [] freq =new int [100005];
        for(int i = 0 ; i<arr.length;i++){
            freq[arr[i]]++;
        }
      return  freq;
    }



    public static void main(String[] args) {
//Q1) Given 2 integers a and b. swap the 2given values using temporary variable.
        swap(9,3);
//Q2)Given 2 integers a and b . swap the 2 given value using sum and difference method
        sumAndDifference(9,3);
        System.out.println();
//Q3) Reverse an array consisting of integer values
/*        int [] arr = {1,2,3,4,5};
        int [] arr1= reverseArray(arr);
        for (int j=0 ;j<arr.length;j++) {
            System.out.print(arr1[j] + "  ");
        }                                                                           */
//Second Method
        int [] arr = {1,2,3,4,5};
        Reverse(arr);
        for (int j=0 ;j<arr.length;j++) {
            System.out.print(arr[j] + "  ");
        }
        System.out.println();

//Q4) Rotate the given array k steps , where k is +ve
 /*       int [] ans =rotate(arr,1002);
        for (int j=0 ;j<arr.length;j++) {
            System.out.print(ans[j] + "  ");
        }                                                                           */
//2nd method
        int [] arr5 = {1,2,3,4,5};
        rotateInPlace(arr5,2);
        for (int j=0 ;j<arr5.length;j++) {
            System.out.print(arr5[j] + "  ");
        }

//Q5) Check if the given number is present is the array or not q times .
        int [] arr6 = {1,2,3,4,5};
        int [] freq = makeFrequencyArray(arr6);
        Scanner sc =new Scanner(System.in);
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched");
            int x= sc.nextInt();
            if(freq[x]>0){
                System.out.println("yes");
            }
            else {
                System.out.println("NO");
            }
         q--;
        }
    }
}
