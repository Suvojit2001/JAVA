package pw.skills.Array;
public class array_video3 {
    //Q2) Find the total number of triplets in the array whose sum is equal to the given value of x
    static int sumTriplets(int [] arr , int target){
        int ans =0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k= j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k] == target){
                    ans++;
                    }
                }
            }
        }
        return ans;
    }



    //Q3) Find the unique number in a given Array where all the elements are being repeated twice with one value being unique(only +ve elements )
     static  int findUnique(int []arr ){
        int n= arr.length;
        for (int i=0 ; i<n ;i++){
            for (int j= i+1;j<n ; j++){
                if (arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans=-1;
        for (int i=0;i<n;i++){
            if (arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
     }


    //Q4) Find the 2nd largest elements in the given array
    static  int findMax( int [] arr ){
        int mx=Integer.MIN_VALUE;
        for (int i = 0 ;i< arr.length;i++){
            if (arr[i] > mx){
                mx=arr[i];
            }
        }
        return mx;
    }
    static  int findSecondMax(int [] arr){
        int mx = findMax(arr);
        for (int i= 0 ; i<arr.length;i++){
            if (arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int second_max = findMax(arr);
        return  second_max;
    }


    //Q5) Given an array consisting of integers ,return the first value that is repeating in this array .if no value is being repeated the return -1
    static  int firstRepeatingNumber( int [] arr){
        int n= arr.length ;
        for (int i=0 ;i<n ; i++){
            for (int j=i+1 ; j< n;j++){
                if ( arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return  - 1;
    }



    public static void main(String[] args) {
    //Q1) Find the total number of pairs in the array whose sum is equal to the given value of x
        int[] arr={4,6,3,5,8,2};
        int x= 7;
        int ans =0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        System.out.println("the total number of pairs in the array whose sum is equal to " + x+ " is : " +ans );

    //Q2) Find the total number of triplets in the array whose sum is equal to the given value of x
        int [] arr1 ={1,4,5,6,3};
        int y= 12;
        int z= sumTriplets(arr,y);
        System.out.println("the total number of triplets in the array whose sum is equal to " + y + " is : " + z );


    //Q3) Find the unique number in a given Array where all the elements are being repeated twice with one value being unique(only +ve elements )
      int [] arr2 = {1,2,3,4,3,2,1};
      int k = findUnique(arr2);
      System.out.println("the unique number in the array is :" + k);



    //Q4) Find the 2nd largest elements in the given array
      int [] arr3 = {1,2,3,22,100};
      int zx = findSecondMax(arr3);
      System.out.println("the 2nd largest number is : " + zx);


    //Q5) Given an array consisting of integers ,return the first value that is repeating in this array .if no value is being repeated the return -1
      int [] arr4 = {1,2,3,5,22,1,100};
      int s= firstRepeatingNumber(arr4);
      System.out.println("the 1st repeated number is  : " + s);

    }
}

