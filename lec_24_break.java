public class lec_24_break {
    public static void main(String[] args) {

//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i==2){
//                System.out.println("exit the loop");
//                break;
//            }
//        }



        //continue


        int i = 0;
        do {
            i++;
            if (i==2){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }while(i<5);
    }
}
