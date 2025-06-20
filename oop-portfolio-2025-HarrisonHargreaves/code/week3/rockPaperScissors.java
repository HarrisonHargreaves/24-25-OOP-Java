package code.week3;
import java.util.Scanner;
import java.util.Random;

public class rockPaperScissors
{
    public static void main(String[] args)
    {
        String personPlay;
        String computerPlay = "";
        int computerInt;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Enter R, P, or S:");
        personPlay = scan.next();

        personPlay = personPlay.toUpperCase();

        computerInt = generator.nextInt(3);

        int choice = computerInt;

        switch (choice) {

            case 0:
                computerPlay = "R";
                break;

            case 1:
                computerPlay = "P";
                break;

            case 2:
                computerPlay = "S";
                break;

        }

        System.out.println(computerPlay);

        if (personPlay.equals(computerPlay)) {
            System.out.println("It's a tie!");
        }

        else if (personPlay.equals("R")) {
            if (computerPlay.equals("P")) {
                System.out.println("Paper covers rock. You lose!");
            }
            else {
                System.out.println("Rock crushes scissors. You win!");
            }

        }
        else if (personPlay.equals("P")) {
            if (computerPlay.equals("S")) {
                System.out.println("Scissors cut paper. You lose!");
            }
            else {
                System.out.println("Rock crushes scissors. You win!");
            }
        }
        else {
            if (personPlay.equals("S")) {
                if (computerPlay.equals("R")) {
                    System.out.println("Rock crushes scissors. You lose!");
                }
                else {
                    System.out.println("Scissors cuts paper. You win!");
                }
            }
        }
    }
}