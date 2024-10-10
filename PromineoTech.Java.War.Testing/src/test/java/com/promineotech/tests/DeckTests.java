package com.promineotech.tests;

import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import com.promineotech.Card;
import com.promineotech.Suit;

class DeckTests {
  @Test
  void constructor_WithEmptyConstructorShouldCreateADeskWith52Cards() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_WithEmptyConstructorShouldCreateAStandardDeck() {
    // Arrange
    Card[] expectedCards = getStandardDeck();
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_WithArrayOfCardsShouldInitializeDeckWithProvidedCards() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void shuffle_WithEmptyDeckShouldThrowError() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void shuffle_WithOneCardShouldRemainUnshuffled() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void shuffle_ShouldNotRemoveOrAlterAnyExistingCardsInTheDeck() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void shuffle_WithMultipleCardsShouldChangePositionOfAtLeastOneCard() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_WithEmptyDeckShouldReturnNull() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_ShouldReturnCardAtTopOfTheDeck() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void draw_ShouldRemoveCardFromDeck() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  // ----------------------- [ HELPER METHODS ] -----------------------
  
  /**
   * Retrieves a standard desk of cards.
   * @return The desk of cards.
   */
  private Card[] getStandardDeck() {
    return new Card[] {
      new Card(Suit.DIAMOND, "2"), new Card(Suit.DIAMOND, "3"), new Card(Suit.DIAMOND, "4"), new Card(Suit.DIAMOND, "5"), 
      new Card(Suit.DIAMOND, "6"), new Card(Suit.DIAMOND, "7"), new Card(Suit.DIAMOND, "8"), new Card(Suit.DIAMOND, "9"), 
      new Card(Suit.DIAMOND, "10"), new Card(Suit.DIAMOND, "J"), new Card(Suit.DIAMOND, "Q"), new Card(Suit.DIAMOND, "K"), 
      new Card(Suit.DIAMOND, "A"), 
      new Card(Suit.HEART, "2"), new Card(Suit.HEART, "3"), new Card(Suit.HEART, "4"), new Card(Suit.HEART, "5"), 
      new Card(Suit.HEART, "6"), new Card(Suit.HEART, "7"), new Card(Suit.HEART, "8"), new Card(Suit.HEART, "9"), 
      new Card(Suit.HEART, "10"), new Card(Suit.HEART, "J"), new Card(Suit.HEART, "Q"), new Card(Suit.HEART, "K"), 
      new Card(Suit.HEART, "A"), 
      new Card(Suit.CLUB, "2"), new Card(Suit.CLUB, "3"), new Card(Suit.CLUB, "4"), new Card(Suit.CLUB, "5"), 
      new Card(Suit.CLUB, "6"), new Card(Suit.CLUB, "7"), new Card(Suit.CLUB, "8"), new Card(Suit.CLUB, "9"), 
      new Card(Suit.CLUB, "10"), new Card(Suit.CLUB, "J"), new Card(Suit.CLUB, "Q"), new Card(Suit.CLUB, "K"), 
      new Card(Suit.CLUB, "A"), 
      new Card(Suit.SPADE, "2"), new Card(Suit.SPADE, "3"), new Card(Suit.SPADE, "4"), new Card(Suit.SPADE, "5"), 
      new Card(Suit.SPADE, "6"), new Card(Suit.SPADE, "7"), new Card(Suit.SPADE, "8"), new Card(Suit.SPADE, "9"), 
      new Card(Suit.SPADE, "10"), new Card(Suit.SPADE, "J"), new Card(Suit.SPADE, "Q"), new Card(Suit.SPADE, "K"), 
      new Card(Suit.SPADE, "A")
    };
  }
}
