package pw.skills;
import java.util.Scanner;
public class PW_2Darray_video2 {
    static void printArray(int [][] arr){
        for(int i= 0; i<arr.length;i++){
            for (int j= 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverseArray(int [] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
//Q1) write a program to display transpose of matrix entered by the user

    static void transposeMatrix(int [] [] arr,int r ,int c){
        int[] [] ans = new int [c][r];
        for (int i =0;i<r;i++){
            for (int j=0 ;j<c;j++){
                ans[j][i]= arr[i][j];
            }
        }
        printArray(ans);
    }
// Transpose in place method
    static void transposeInPlace( int [][] arr,int r ,int c){
        for (int i =0;i<c;i++){
            for (int j=i ;j<r;j++){
//                swap arr[i][j],arr[j][i]
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        printArray(arr);
    }

//Q2) Given a square matrix ,turn it by 90 degree in a clockwise direction without using extra space
    static void rotateMatrix(int [][] matrix,int n){
        //transpose the matrix
        System.out.println("1st we have to transpose the matrix and the transpose matrix is : ");
        transposeInPlace(matrix ,n,n);
        //reverse the matrix
        for(int i=0;i<n;i++){
            reverseArray(matrix[i]);
        }
        System.out.println("Rotated matrix : ");
        printArray(matrix);
    }

//Q3) Given an integer n return the 1st n rows of pascal's triangle.
    public static int [][] pascal(int n){
        int [][] arr = new int [n][];
        for (int i=0;i<n;i++){
            arr[i]= new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for (int j = 1;j<i;j++){
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
            }
        }
       return arr;
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

//Q1) write a program to display transpose of matrix entered by the user
        transposeMatrix(arr,r,c);
        transposeInPlace(arr,r,c);                //inplace transpose

//Q2) Given a square matrix ,turn it by 90 degree in a clockwise direction without using extra space
        rotateMatrix(arr,r);

//Q3) Given an integer n return the 1st n rows of pascal's triangle.
            int n= sc.nextInt();
            int [][] ans = new int [n][];
            ans= pascal(n);
            for (int i=0;i<n;i++){
                for (int j=0;j<i+1;j++){
                    System.out.print(ans[i][j]);
                }
                System.out.println();
            }

    }
}
