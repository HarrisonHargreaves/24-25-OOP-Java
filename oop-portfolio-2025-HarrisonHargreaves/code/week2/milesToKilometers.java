package code.week2;
import java.util.Scanner;
public class milesToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float miles;
        float kilometers;

        System.out.println("Enter number of miles to convert: ");
        miles = scan.nextFloat();

        kilometers = miles * 1.609f;

        System.out.println(miles + " miles is " + kilometers + " kilometers");


    }
}
