package pw.skills.Array;
import java.util.Scanner;
public class PW_2Darray_video3 {
    static void printArray(int [][] arr){
        for(int i= 0; i<arr.length;i++){
            for (int j= 0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

//Q1) Given an n X m matrix ,return all the elements of the matrix in spiral order .
     static void printSpiralOrder(int [][] arr,int r ,int c){
        int topRow = 0,bottomRow=r-1,leftCol = 0,rightCol= c-1;
        int totalElements = 0;
        while( totalElements < r*c){
            //topRow  -> left col -> right col
            for (int j = leftCol;j<=rightCol && totalElements < r*c ;j++){
                System.out.print(arr[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            //rightCol -> topRow to bottomRow
            for (int j = topRow;j<=bottomRow && totalElements < r*c;j++){
                System.out.print(arr[j][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            //bottomRow -> rightCol to left col
            for (int j = rightCol;j>=leftCol && totalElements < r*c;j--){
                System.out.print(arr[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            //leftCol -> bottomRow to  topRow
            for (int j = bottomRow;j>= topRow && totalElements < r*c;j-- ){
                System.out.print(arr[j][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
     }

//Q2) given a +ve integer n , generate an  n  X n matrix filled with elements from 1 to n^2 in spiral order
static int [] [] makeSpriralmatrix(int n){
    int [][] ans = new int [n][n];
    int topRow = 0,bottomRow=n-1,leftCol = 0,rightCol= n-1;
    int num = 1;
    while( num <= n*n){
        //topRow  -> left col -> right col
        for (int j = leftCol;j<=rightCol && num <= n*n ;j++){
            ans[topRow][j] = num ++;
        }
        topRow++;
        //rightCol -> topRow to bottomRow
        for (int j = topRow;j<=bottomRow && num <= n*n;j++){
            ans[j][rightCol] = num++;
        }
        rightCol--;
        //bottomRow -> rightCol to left col
        for (int j = rightCol;j>=leftCol && num <= n*n;j--){
            ans[bottomRow][j] = num++;
        }
        bottomRow--;
        //leftCol -> bottomRow to  topRow
        for (int j = bottomRow;j>= topRow && num <=n*n;j-- ){
            ans[j][leftCol] = num++;

        }
        leftCol++;
    }
    return ans;
}

    public static void main(String[] args) {
//Q1) Given an n X m matrix ,return all the elements of the matrix in spiral order .
       int [][] arr = {{1,2,3},{5,6,7},{10,11,12},{14,15,16}};
       printArray(arr);
       printSpiralOrder(arr,4,3);

//Q2) given a +ve integer n , generate an  n  X n matrix filled with elements from 1 to n^2 in spiral order
    int [][]ans = makeSpriralmatrix(4);
    System.out.println();
    printArray(ans);
    }
}
