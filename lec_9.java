
public class lec_9 {
    public static void main(String[] args) {
        float a= 6*5-34/2;
        /*
       = 30-34/2                        * and /  precedence same  then left to right evaluate hobe
        =30-17=13                        + and -  precedence same        ,,
         */
        float b= 60/5-34*2;
        /*
        =12-34*2                          * and /  precedence same  then left to right evaluate hobe
        =12-68=-56                                                           ,,

         */
        System.out.println(a); //Precedence & Associativity
        System.out.println(b);

    }

}

