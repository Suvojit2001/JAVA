package Kunal_kushwaha.linear_searching;

import java.util.Arrays;

public class evenNumberDigits {
    static  int findnumbers(int []nums){
        int count = 0;
        for (int num : nums){
            if (even(num)){
                count ++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfdigits = digits(num);
        if (numberOfdigits %2 ==0){
            return true;
        }
        return false;
    }
   static int digits(int num){
        if (num==0){
            return 1;
        }
        if (num<0){
            num= num*-1;
        }
       int count =0;
       while(num>0){
           count++;
           num /= 10;
       }
       return count;
   }

//Optimize solution of the problem
 static int digits2(int num){
     if (num<0){
         num= num*-1;
     }
        return (int)(Math.log10(num)+1);
 }

    public static void main(String[] args) {
        int []nums = {12,138,1746,1};
        System.out.println(findnumbers(nums));
        System.out.println(digits(-5478));
        System.out.println(digits2(5478));
    }
}
