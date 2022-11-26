package pw.skills;
public class array_video1 {
    public static void main(String[] args) {
   //Q1)  Calculate the maximum value out of all the elements in the array

        int []array ={10,5,3,2,3,4,9,64};
        int ans1 =0;
        int indexof = -1;
        for (int j=0;j<array.length;j++){
            if (array[j]>ans1){
                ans1=array[j];
                indexof = j;
            }
        }
        System.out.println("Max " + ans1 + " ,and it is present at : " + indexof ) ;



    //Q2) Search an element in the array if exist return its index ,if not the return -1

     int []arr ={10,5,3,2,3,4,9};
     int x=3;
     int ans =-1;
     for (int i=0;i< arr.length;i++){
         if (arr[i]==x){
             ans=i;
             break;
         }
     }
        System.out.println(x +" is present at index " + ans);
    }
}
