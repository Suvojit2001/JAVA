package pw.skills;

public class array_video5 {
    static void swapInArray(int [] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void printArray(int [] arr ){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    static void Reverse( int [] arr){
        int i = 0 , j= arr.length-1;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
 //Q1) Sort an array consisting of 0 and 1
    static  void sortZeroAndones(int [] arr){
        int n=arr.length;
        int zeroes = 0;
        for(int i=0;i<n;i++){
            if (arr[i]==0){
                zeroes++;
            }
        }
        for (int i=0 ; i<n ;i++){
            if (i<zeroes){
                arr[i]=0;
            }
            else {
                arr[i]=1;
            }
        }
        printArray(arr);
    }
//2nd Method
    static  void sortZeroAndOneInPlace(int [] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]==0){
                left++;
            }
            if (arr[right]==1){
                right--;
            }
        }
        printArray(arr);
    }
//Q2)  Given an array ,move all the even integer at the beginning of the array followed by all the odd integer .
// the relative order of odd or even integer does not matter .return any array that satisfies the  condition
    static  void sortByOdd_Even(int [] arr){
        int n= arr.length;
        int left=0,right=n-1;
        while (left<right){
            if (arr[left]%2==1 && arr[right]%2==0){
                swapInArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2==1){
                right--;
            }
        }
        printArray(arr);
    }
//Q3) Given an integer array sorted in non-decreasing order ,return an array of the squares of each number sorted in non-decreasing order
     static void sortNonDecreasing(int [] arr) {
         int[] ans = new int[arr.length];
         int k=0;
         int left=0,right = arr.length-1;
         while(left<=right){
             if (Math.abs(arr[left])>Math.abs(arr[right])){
                 ans[k++]=arr[left] * arr[left];
                 left++;
             }else {
                 ans[k++]=arr[right] * arr[right];
                 right--;
             }
         }
         Reverse(ans);
         printArray(ans);
     }


    public static void main(String[] args) {
//Q1) Sort an array consisting of 0 and 1
      int []  arr = {1,0,1,0,1,1,0,1,0,1,0,1,0,1};
       sortZeroAndones(arr);
//2nd Method
        System.out.println();
        int []  arr1 = {1,0,1,0,0,1,0,1,0,1};
        sortZeroAndOneInPlace(arr1);

//Q2) Given an array ,move all the even integer at the beginning of the array followed by all the odd integer .
// the relative order of odd or even integer does not matter .return any array that satisfies the  condition
        System.out.println();
        int[] arr3={2,7,4,8,9,6,5,3};
        sortByOdd_Even(arr3);

//Q3) Given an integer array sorted in non-decreasing order ,return an array of the squares of each number sorted in non-decreasing order
        System.out.println();
        int[] arr4={-10,-3,-2,1,4,5};
        sortNonDecreasing(arr4);
    }
}
