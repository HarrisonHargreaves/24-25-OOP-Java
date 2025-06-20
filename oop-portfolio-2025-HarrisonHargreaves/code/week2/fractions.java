package code.week2;
import java.util.Scanner;

public class fractions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter numerator: ");
        int numerator = scan.nextInt();
        System.out.println("Enter denominator: ");
        int denominator = scan.nextInt();

        float decimal =  ((float) numerator / denominator);
        System.out.println(numerator + "/" + denominator + " as a decimal is " + decimal);

    }

}
