package code.week4;

import java.util.Scanner;
import java.util.Random;

public class PinEncrypt
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int min = 1000;
        int max = 65536;

        System.out.println("Enter Your PIN");
        int pin = scan.nextInt();

        while(String.valueOf(pin).length() != 4)
        {
            System.out.println("Enter Your PIN");
             pin = scan.nextInt();
        }

        String hexPin = Integer.toHexString(pin);
        if(hexPin.length() != 4) {
            hexPin = ("0" + hexPin);
        }

        double random1 = random.nextDouble(max - min + 1) + min;
        double random2 = random.nextDouble(max - min + 1) + min;

        String hex1 = Integer.toHexString((int) random1);
        String hex2 = Integer.toHexString((int) random2);
        System.out.println(hex1.concat(hexPin).concat(hex2));


    }
}
