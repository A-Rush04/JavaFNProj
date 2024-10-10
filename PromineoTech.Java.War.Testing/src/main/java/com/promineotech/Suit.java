package com.promineotech;

import java.util.List;

/**
 * The available suits or families of playing cards.
 */
public enum Suit {
  HEART("♥"), DIAMOND("♦"), CLUB("♣"), SPADE("♠");

  /**
   * All of the available suits
   */
  private static final List<Suit> suits = List.of(
      Suit.HEART, Suit.DIAMOND, Suit.CLUB, Suit.SPADE
  );
  private final String display;
  
  /**
   * Creates an instance of the enum.
   * @param display The display / string value.
   */
  private Suit(String display) {
    this.display = display;
  }
  
  /**
   * Retrieves all of the possible values.
   * @return All the suits.
   */
  public static Iterable<Suit> all() {
    return(suits);
  }
  
  @Override
  public String toString() {
    return display;
  }
}
