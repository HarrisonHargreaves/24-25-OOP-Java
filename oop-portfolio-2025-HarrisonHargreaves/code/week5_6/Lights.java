package code.week5_6;

import java.util.Scanner;

public class Lights {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bulb kitchen = new Bulb();
        Bulb bedroom = new Bulb();
        Bulb garage = new Bulb();

        System.out.print("-----Select Option-----\n1. select a bulb\n2. Exit");
        String choice = input.nextLine();

        switch (choice) {

            case "1":
                System.out.println("Enter bulb name: ");
                System.out.print("-----Select Option-----\n1. kitchen\n2. bedroom\n3. garage");
                String bulbLocation = input.nextLine();
                switch (bulbLocation) {
                    case "1":
                        System.out.println("-----Select Option-----\n1. Light on\n2. Light off\n3. get status");
                        String bulbAction = input.nextLine();
                        switch (bulbAction) {
                            case "1":
                                kitchen.turnOn();
                                break;
                            case "2":
                                kitchen.turnOff();
                                break;
                            case "3":
                                kitchen.getStatus();
                                break;
                        }

                    case "2":
                        System.out.println("-----Select Option-----\n1. Light on\n2. Light off\n3. get status");
                        String bulbAction1 = input.nextLine();
                        switch (bulbAction1) {
                            case "1":
                                bedroom.turnOn();
                                break;
                            case "2":
                                bedroom.turnOff();
                                break;
                            case "3":
                                bedroom.getStatus();
                                break;
                        }
                    case "3":
                        System.out.println("-----Select Option-----\n1. Light on\n2. Light off\n3. get status");
                        String bulbAction2 = input.nextLine();
                        switch (bulbAction2) {
                            case "1":
                                garage.turnOn();

                                break;
                            case "2":
                                garage.turnOff();
                                break;
                            case "3":
                                garage.getStatus();
                                break;
                        }
                }
            case "2":
                break;
        }
    }
}