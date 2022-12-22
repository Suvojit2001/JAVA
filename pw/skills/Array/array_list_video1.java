package pw.skills.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class array_list_video1 {
    public static void main(String[] args) {
        //Wrapper Classes
        Integer  i= Integer.valueOf(5);
        System.out.println(i);
        Float f = Float.valueOf(5.45f);
        System.out.println(f);

    //Array_list is nothing but an array with variable array size

        ArrayList<Integer> l1 = new ArrayList<Integer>();
//        ArrayList<Boolean> b1 = new ArrayList< >(); //2nd bar ArrayList < > er vetor boolean na dileu cholbe
//        ArrayList<Float> f1 = new ArrayList<>();

 //SOME IMPORTANT METHODS ARE WRITTEN BELOW

        //add new element
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        //get an element at index i
        System.out.println(l1.get(1));  // 6

        //print with for loop
        for(int j=0; j<l1.size();j++){
            System.out.println(l1.get(j));      // 5 , 6 , 7 , 8
        }

        //printing the array list directly
        System.out.println(l1);             // [ 5 , 6 , 7 , 8 ]

        //adding element at index i
        l1.add(1,100);      // [ 5 ,100, 6 , 7 , 8 ]

        //modifying element at index i
        l1.set(1,10);               // [ 5 , 10 , 6 , 7 , 8 ]

        //  removing an element at index i
        l1.remove(1);           // [ 5 , 6 , 7 , 8 ]

        //removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);             //[5, 6, 8]
        System.out.println(   l1.remove(Integer.valueOf(7))   );              //this will return true or false depending upon present or not

        //Checking if an element exists
        boolean ans  = l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        //if you don't specify class ,you can put anything to it
        ArrayList l = new ArrayList();
        l.add("pqres");
        l.add(1);
        l.add(true);
        System.out.println(l);

 //Q1) Write a program to reverse array list
        ArrayList<Integer> list =new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original list " + list);
//        reverseList(list);
//        System.out.println("Reverse list" + list);
//2nd method
        Collections.reverse(list);
        System.out.println(list);

//Q2) Sort an array list of int in Ascending order
        Collections.sort(list);
        System.out.println("ASCENDING : "+list);                   //Ascending order

        Collections.sort(list,Collections.reverseOrder());   //Descending order
        //OR            //list.sort(Collections.reverseOrder());
        System.out.println("DESCENDING : "+list);

//Q3) Sort an array list of String in Descending order
        ArrayList<String> l2 =new ArrayList<>();
        l2.add("Welcome");
        l2.add("To");
        l2.add("Physics");
        l2.add("Wallah");
        System.out.println("Original list : " + l2);                //Original list
        Collections.sort(l2);
        System.out.println("Sorted list : "+l2);                    //Sorted in Ascending order
        l2.sort(Collections.reverseOrder());
        System.out.println("Descending order :" + l2 );             //Sorted in descending order
    }
//Q1) Write a program to reverse array list
    static void reverseList(ArrayList<Integer> list){
        int i=0 ,j = list.size()-1;
        while(i<j){
//          Integer  temp = Integer.valueOf(list.get(i));   OR  -->
            Integer  temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }



}
