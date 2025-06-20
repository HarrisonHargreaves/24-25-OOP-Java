package code.week2;
import java.util.Scanner;

public class computingAverages {
    public static void main(String[] args) {
        int val1, val2, val3;
        double average;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter three integers and I will compute their average");

        System.out.print("Enter the first value: ");
        val1 = scan.nextInt();

        System.out.print("Enter the second value: ");
        val2 = scan.nextInt();

        System.out.print("Enter the third value: ");
        val3 = scan.nextInt();


        average = (val1 + val2 + val3) / 3.0;


        System.out.println("The average is " + average);
    }
}
