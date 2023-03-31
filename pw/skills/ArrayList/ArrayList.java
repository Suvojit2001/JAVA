package pw.skills.ArrayList;


import java.util.Arrays;

public class ArrayList {
    public static class Arraylist{
        int [] arr =new int[5];
        int index =0;
        int size =0;
        public void add(int element){
            if (size==arr.length){
                int [] brr= Arrays.copyOf(arr,arr.length*2);
                arr =new int[brr.length];
//                arr=Arrays.copyOf(brr,brr.length);
                arr=brr;
            }
            arr[index]=element;
            index++;
            size++;
        }
    }

    public static void main(String[] args) {
        Arraylist arr=new Arraylist();
        arr.add(5);
        arr.add(9);
        arr.add(8);
        arr.add(11);
        arr.add(6);
        arr.add(7);
        System.out.println(arr.size);

        for (int i=0;i<arr.size;i++){
            System.out.print(arr.arr[i] + " ");
        }

    }
}
