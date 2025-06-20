package code.week5_6;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MultiSphere {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Sphere>  spheres = new ArrayList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter the Diameter of the sphere: ");
            double diameter  = scan.nextDouble();
            Sphere sphere = new Sphere(diameter);
            spheres.add(sphere);
        }

        for (Sphere sphere : spheres) {
            System.out.println(sphere);
            scan.close();
        }
    }
}
