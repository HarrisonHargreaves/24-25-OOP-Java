package code.week2;
import java.util.Scanner;

public class squareCalculations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a length for a square side: ");
        float side = scan.nextFloat();

        float perimeter = (4 * side);
        float area = (side * side);

        System.out.println("The perimeter is " + perimeter + "cm" +" and the area is " + area + "cm²");

    }
}
