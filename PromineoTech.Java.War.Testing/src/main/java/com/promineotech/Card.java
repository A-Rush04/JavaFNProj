package com.promineotech;

import java.util.List;

/**
 * Represents a standard playing card.
 */
public class Card {
  
  private Suit suit;
  private String face; 
  private final static List<String>[] FACES = new ArrayList<> (
     List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
  );
  
  /**
   * Creates an instance of the Card class.
   * @param suit The suit for the card (diamond, spade, heart, club).
   * @param face The face value for the card. (A, 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K)
   */
  public Card(Suit suit, String face) {
   if (suit == null) {
     throw new IllegalArgumentException("Suit");
     
   }
   if (face == null) {
     throw new IllegalArgumentException("Face");
   }
   
   if (! FACES.contains(face)) {
     throw new IllegalArgumentException("face");
   }
   
   this.suit = suit; 
   this.face = face; 
  }

  public Suit getSuit() {
    return suit;
  }

  public void setSuit(Suit suit) {
    this.suit = suit;
  }

  public String getFace() {
    return face;
  }

  public void setFace(String face) {
    this.face = face;
  }

  /**
   * Retrieves the numeric value of the card.
   * @return The numeric value.
   */
  public int getValue() {
   switch(getFace()) {
     case "A": return 14;
     case "K": return 13;
     case "Q": return 12;
     case "J": return 11;
     case "10": return 10;
     case "9": return 9;
     case "8": return 8;
     case "7": return 7;
     case "6": return 6;
     case "5": return 5;
     case "4": return 4;
     case "3": return 3;
     case "2": return 2;
    
     default: 
       return 0;
     
     
   }
  }
  
  private String getFaceName() {
    switch(getFace()) {
      case "A": return "Ace";
      case"2": return  "two";
      case "3": return "Ace";
      case "4": return "Ace";
      case "5": return "Ace";
      case "6": return "Ace";
      case "7": return "Ace";
      case "8": return "Ace";
      case "9": return "Ace";
      case "10": return "Ace";
      case "J": return "Ace";
      case "Q": return "Ace";
      case "K": return "Ace";
      
      default: 
      return "n/a";
      
      
    }
  }
  
  private String getSuitName() {
    switch(getSuit()) {
      case CLUB: return "Clubs";
      case HEART: return "Hearts";
      case DIAMOND: return "Diamonds";
      case SPADE: return "Spades";
      
      default:
        return "Unknown Suit";
    }
  }
  /**
   * 
   * Returns the detailed description of the card.
   * @return The description.
   */
  public String describe() {
    
    
   return String.format("%s of $s",  getFaceName(), getSuitName()); 
  }
  
  /**
   * Returns the default string representation of the card.
   * @return The string representation.
   */
  @Override
  public String toString() {
    // TODO Display Ace of Diamonds as ♥A
    return "♥K"; 
    
  }
  public static List<String>[] FACES = new ArrayList<> (
      List.of("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K")
   );
}
