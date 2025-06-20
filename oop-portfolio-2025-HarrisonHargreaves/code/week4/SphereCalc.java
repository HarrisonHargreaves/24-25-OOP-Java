package code.week4;

import java.util.Scanner;

public class SphereCalc
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the sphere: ");
        float radius = scan.nextFloat();

        float volume = (float) ((4.0/3.0) * Math.PI * Math.pow(radius, 3));

        float surfaceArea = (float) (4 * Math.PI * (Math.pow(radius,2)));

        System.out.println("The volume of the sphere is " + volume);
        System.out.println("The surface area of the sphere is " + surfaceArea);

    }
}
