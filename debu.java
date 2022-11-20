import java.util.Scanner;
public class debu{
        public static void main (String[] args){
            int math;
            int sci;
            int his;
            int geo;
            int evo;

            System.out.println("Enter math num");
            Scanner sc = new Scanner(System.in);
            math = sc.nextInt();

            System.out.println("Enter sci num");
            sci = sc.nextInt();

            System.out.println("Enter his num");
            his = sc.nextInt();

            System.out.println("Enter geo num");

            geo = sc.nextInt();

            System.out.println("Enter evo num");
            evo = sc.nextInt();

            float parentage = (math + sci+ his+ geo+ evo)*100/500.0f;

            System.out.println(parentage);

        }
    }

