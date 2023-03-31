package pw.skills.LinkedList;

public class LinkedList01 {
    public static class Node{
        int data; // value
        Node next; // address of next node
        Node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        // advantage of array
        //1) if we want to get a element then the time complexity will be O(1) , which is very good
        // it happens because array took continuous memory , Disadvantage is array is fixed size so it takes nX4 bytes at a time whether we
        // use it or not .Where n is size of array .

        // if we want to insert an element in an array then we have to move all the element . which is disadvantage . Time complexity is O(n).

        // in linked list insertion becomes easy but if we want to find the last element then time complexity will be O(n)
            Node a=new Node(5);
        Node b=new Node(3);
        Node c=new Node(7);
        Node d=new Node(9);
        Node e=new Node(8);
        Node f=new Node(16);
   // a -> b -> c -> d -> e -> f

        a.next =b; //  5 -> 3
        b.next=c;  // 5 -> 3 -> 7
        c.next=d;  // 5 -> 3 -> 7 --> 9
        d.next=e;  // 5 -> 3 -> 7 --> 9 -> 8
        e.next=f;  // 5 -> 3 -> 7 --> 9-> 8 -> 16

//        System.out.println(a.next.data);

         Node temp =a;
         while(temp !=null){
             System.out.print(temp.data + " ");
             temp=temp.next;
         }



    }
}
