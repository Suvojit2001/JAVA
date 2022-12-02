package pw.skills.Array;
import java.util.Scanner;
public class PW_2Darray_video1 {
    static void printArray(int [][] arr){
        for(int i= 0; i<arr.length;i++){
            for (int j= 0;j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
//Q1) Addition of two matrix
    static  void addArray(int[][]arr,int[][]arr1){
        int [][]sum = new int[arr.length][arr[0].length];
        if (arr.length==arr1.length && arr[0].length==arr1[0].length){
            for(int i=0;i<arr.length;i++){
                for (int j=0;j<arr[0].length;j++){
                  sum[i][j]=arr[i][j]+arr1[i][j];
                }
            }
        }else {
            System.out.println("Addition can not possible ");
            return;
        }
        printArray(sum);
    }

//Q2)Multiplication of Matrix
    static  void multiplication(int[][]arr,int[][]arr1){
    if (arr[0].length!=arr1.length ){
        System.out.println("Multiplication  can not possible ");
        return;
    }
    int [][]multi = new int[arr.length][arr1[0].length];
    for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr1[0].length;j++){
                for (int k=0;k<arr[0].length;k++){
                    multi[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }
    printArray(multi);
}



    public static void main(String[] args) {
 /*       Scanner sc = new Scanner(System.in);
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
        }                                                                               */
       /* System.out.println("||" + arr[0][0] + " " + arr[0][1] + " " + arr[0][2]+ "||");
        System.out.println("||" + arr[1][0] + " " + arr[1][1] + " " + arr[2][2]+ "||");
        System.out.println("||" + arr[2][0] + " " + arr[2][1] + " " + arr[2][2]+ "||");
        printArray(arr); */
//Q1) Addition of two Matrix
        int [][] arr1 = {{1,2},{3,4},{1,2}};
        int [][] arr2 = {{1,2},{3,4}};
        addArray(arr1,arr2);
//Q2)Multiplication of Matrix
        int [][] arr3 = {{1,2},{3,4},{1,2}};
        int [][] arr4 = {{1,2},{3,4}};
        multiplication(arr3,arr4);


    }
}
