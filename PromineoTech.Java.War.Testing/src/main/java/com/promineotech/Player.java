package com.promineotech;

/**
 * Represents a player in the game.
 */
public class Player {
  /**
   * Creates an instance of the Player class.
   * @param name The display name of the player.
   */
  public Player(String name) {
    // TODO Initialize player
  }

  /**
   * Creates an instance of the Player class.
   * @param name The display name of the player.
   * @param hand The optional collection of cards in the players hand.
   */
  public Player(String name, Card[] hand) {
    this(name);
    // TODO Initialize hand
  }
  
  /**
   * Adds the card to the bottom of the players hand.
   * @param card The card to add.
   * @return The current instance.
   */
  protected Player add(Card card) {
    // TODO Remove / return first card from hand.
    return this;
  }
  
  /**
   * Flips the first card contained in the players hand and removes it from their hand.
   * @return The card that was flipped. If no cards are in the player's hand, then null is returned.
   */
  public Card flip() {
    // TODO Remove / return first card from hand.
    throw new UnsupportedOperationException("Not implemented");
  }
  
  /**.
   * Draws a card from the deck and adds it to the bottom of the players hand.
   * @param card The deck to draw cards from.
   * @return True if a card was drawn, false if otherwise.
   */
  public boolean draw(Deck deck) {
    // TODO Get card from deck, add to players hand.
    return false;
  }
  
  /**.
   * Increments the players score.
   */
  public void incrementScore() {
    // TODO Increment the player score.
    throw new UnsupportedOperationException("Not implemented");
  }

  /**
   * Outputs information about the player along with all of the cards currently
   * in their hand.
   * @return The description.
   */
  public String describe() {
    // TODO Remove / return first card from hand.
    throw new UnsupportedOperationException("Not implemented");
  }

  /**
   * Returns the string representation of the Player.
   * @return The string representation.
   */
  @Override
  public String toString() {
    // TODO Return minimal information about a player.
    throw new UnsupportedOperationException("Not implemented");
  }
}
