package TataStrive.Classwork;

public class CountConstructor {
        static int count  = 0;
        CountConstructor(){
            count ++;

        }

    public static void main(String[] args) {
        CountConstructor c1 = new CountConstructor();
        CountConstructor c2 = new CountConstructor();
        CountConstructor c3 = new CountConstructor();
        
        System.out.println(count);
    }
}
