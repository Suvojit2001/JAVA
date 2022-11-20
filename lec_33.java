public class lec_33 {
    static int sum(int a,int b,int c,int d){

        return a+b+c+d;
    }
    //now if i want many many numbers sum
    static int sum2(int ... arr){
        //available as int [] arr;
        int result=0;
        for (int a: arr){
            result=result+ a;
        }
        return result;
    }
    // if we restrict that you have to give at least 1 entry then
 static int sum3(int x,int ... arr){
        //available as int [] arr;
        int result=0;
        for (int a: arr){
            result=result+ a;
        }
        return result+x;
    }
    public static void main(String[] args) {
        System.out.println( sum(7,8,5,6));
        System.out.println(sum2());
        System.out.println("use this method " + sum2(1,2,3,4,5,6,7,8,9,10));
        System.out.println(sum3(5,33));
    }
}
