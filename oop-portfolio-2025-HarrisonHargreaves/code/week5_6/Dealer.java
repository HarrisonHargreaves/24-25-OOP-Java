package code.week5_6;

import java.util.Random;

public class Dealer {
    public static void main(String[] args) {
        Card[] deck = new Card[52];
        int index = 0;
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck[index++] = new Card(suit, rank);
            }
        }

        Random rand = new Random();
        System.out.println("Your hand:");
        for (int i = 0; i < 5; i++) {
            int randomIndex = rand.nextInt(52 - i) + i;
            Card temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
            System.out.println(deck[i]);
        }
    }
}