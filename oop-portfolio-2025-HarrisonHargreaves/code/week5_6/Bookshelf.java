package code.week5_6;

import java.util.Scanner;

public class Bookshelf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many books do you want to add to the bookshelf?");
        int books = scan.nextInt();

        Book[] bookshelf = new Book[books];

        for (int i = 0; i < books; i++) {
            System.out.println("Enter the title of the book you want to add to the bookshelf");
            String title = scan.next();
            System.out.println("Enter the author of the book you want to add to the bookshelf");
            String author = scan.next();
            System.out.println("Enter the publisher of the book you want to add to the bookshelf");
            String publisher = scan.next();
            System.out.println("Enter the Copyright Date of the book you want to add to the bookshelf");
            String copyrightDate = scan.next();

            bookshelf[i] = new Book(title, author, publisher, copyrightDate);
        }

        for (Book book : bookshelf) {
            System.out.println(book);
        }

    }
}
