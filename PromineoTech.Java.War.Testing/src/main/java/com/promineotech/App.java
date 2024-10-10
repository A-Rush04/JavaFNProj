package com.promineotech;

/**
 * The application runner.
 */
public class App {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        // Each player draws 26 cards
        for (int i = 0; i < 26; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        // Each player flips 26 times
        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();
            
            card1.describe();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println(player1.getName() + " receives a point!");
            } else if (card1.getValue() < card2.getValue()) {
                player2.incrementScore();
                System.out.println(player2.getName() + " receives a point!");
            } else {
                System.out.println("No point awarded for this round.");
            }

            // Print updated scores
            System.out.println("Scores -> " + player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
        }

        // Determine final winner
        System.out.println("Final Scores:");
        System.out.println(player1.getName() + ": " + player1.getScore() + ", " + player2.getName() + ": " + player2.getScore());
        if (player1.getScore() > player2.getScore()) {
            System.out.println("The winner is " + player1.getName() + "!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("The winner is " + player2.getName() + "!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}
        
  