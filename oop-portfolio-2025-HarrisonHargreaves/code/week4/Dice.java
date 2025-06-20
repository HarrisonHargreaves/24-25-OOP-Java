package code.week4;

import java.util.Scanner;
import java.util.Random;

public class Dice
{

    public static void main(String[]args )
    {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How many sides does dice 1 have?");
        int Side1 = sc.nextInt();
        System.out.print("How many sides does dice 2 have?");
        int Side2 = sc.nextInt();

        int Dice1 = 0;
        int Dice2 = 0;

        for( int i = 1; i <= 3; i++ )
        {
            int roll1 = rand.nextInt(Side1) + 1;
            int roll2 = rand.nextInt(Side2) + 1;

            Dice1 += roll1;
            Dice2 += roll2;

            System.out.println("Die 1 roll " + i + " = " + roll1 + ".");
            System.out.println("Die 2 roll " + i + " = " + roll2 + ".");
        }

        double avg1 = Dice1 / 3.0;
        double avg2 = Dice2 / 3.0;

        System.out.println("Die 1 rolled a total of " + Dice1 + " and rolled " + String.format("%.3f", avg1) + " on average.");
        System.out.println("Die 2 rolled a total of " + Dice2 + " and rolled " + String.format("%.3f", avg2) + " on average.");

    }
}
