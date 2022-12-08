package Kunal_kushwaha.linear_searching;

public class maxWealth {
    public static  int maximumWealth(int[][] accounts) {
        // person = rol
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            // now we have sum of accounts of person
            // check with overall ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [][] arr = {{1,2},{3,4}};
        int a= maximumWealth(arr);
        System.out.println(a);
    }
}
