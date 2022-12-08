package pw.skills.Array;
import  java.util.Scanner;
public class PW_2Darray_video4 {
    static void printArray(int [][] arr){
        for(int i= 0; i<arr.length;i++){
            for (int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
//Q1)   Given a matrix a of dimension n X m and 2 coordinates (l1,r1) and (l2,r2) ,
// return the sum of the rectangle from  (l1,r1) to (l2,r2)
    static int findSum(int [] [] matrix ,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i= l1;i<=l2;i++){
            for (int j=r1 ;j<=r2;j++){
                sum +=matrix[i][j];
            }
        }
        return sum;
    }


//Second Approach
    static void findPrefixSunMatrix(int [][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=1;j<matrix[i].length;j++){
                matrix[i][j] =matrix[i][j] + matrix[i][j-1];
            }
        }
    }
    static int findSum2(int [] [] matrix ,int l1,int r1,int l2,int r2){
        int sum=0;
        findPrefixSunMatrix(matrix);
        for(int i=l1;i<=l2;i++){
            if(r1>=1){
                sum += matrix[i][r2] - matrix[i][r1-1];
            }
            else {
                sum += matrix[i][r2];
            }
        }
        return sum;
}



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number");
        int r =sc.nextInt();
        System.out.println("Enter column number");
        int c= sc.nextInt();
        int [][] arr = new int[r][c];
        System.out.println("Enter " + r*c + " elements : ");
        for(int i= 0; i<arr.length;i++){
            for (int j= 0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix is : ");
        printArray(arr);
        System.out.println("Enter the coordinates");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        int a =findSum(arr,l1,r1,l2,r2);
        System.out.println("using 1st process the sum is : "+a);
//Second Approach
        int b =findSum2(arr,l1,r1,l2,r2);
        System.out.println("using 2nd process the sum is : "+b);
    }
}
