package CodeWithHarry;
import java.util.Random;
import java.util.Scanner;

public class Stonepaperscisor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Choose 0 for PAPER \n Choose 1 for STONE \n Choose 2 for SCISSOR");
        int userInput =sc.nextInt();
        Random rn =new Random();
        int ComputerChoise=rn.nextInt(3);
        if (userInput==ComputerChoise){
            System.out.println("Match is DRAW.........");
        }
        else if (ComputerChoise==0 && userInput==2 ||ComputerChoise==1 && userInput==0|| ComputerChoise==2 && userInput==1  ) {
            System.out.println("You Win...........");
        }
        else {
            System.out.println("Computer Win");
        }
    if (ComputerChoise==0){
        System.out.println("Computer Has Chosen PAPER");
    } else if (ComputerChoise==1) {
        System.out.println("Computer hAs Chosen STONE");

    }
    else {
        System.out.println("Computer has Chosen SCISSOR");
    }

    }

}
