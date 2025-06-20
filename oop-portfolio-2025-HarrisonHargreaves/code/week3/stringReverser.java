package code.week3;
import java.util.Scanner;

public class stringReverser {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = scan.nextLine().strip();

        String[] words = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word);
            reversed.append(reversedWord.reverse().toString()).append(" ");
        }

        System.out.println(reversed.toString().strip());
    }
}
