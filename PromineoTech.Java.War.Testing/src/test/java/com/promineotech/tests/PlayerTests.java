package com.promineotech.tests;

import static org.junit.jupiter.api.Assertions.fail;
import java.util.List;
import org.junit.jupiter.api.Test;
import com.promineotech.Card;
import com.promineotech.Suit;

class PlayerTests {
  @Test
  void constructor_WithEmptyConstructorWillThrowError() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_WithNameSetsNameProperty() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void constructor_WithCardsShouldInitializeHand() {
    // Arrange
    Card[] cards = new Card[] {
      new Card(Suit.CLUB, "A"), new Card(Suit.HEART, "9"), new Card(Suit.HEART, "4"), new Card(Suit.DIAMOND, "Q"),    
    };
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void flip_WithEmptyHandShouldReturnNull() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void flip_ShouldReturnFirstCardFromPlayersHand() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }
  
  @Test
  void flip_ShouldRemoveCardFromPlayersHand() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_WithNullDeckReturnsFalse() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_WithEmptyDeckReturnsFalse() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_WithValidDeckAndEmptyHandAddsDrawnCardToPlayersHand() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  @Test
  void draw_WithValidDeckAndExistingHandAddsDrawnCardToEndOfPlayersHand() {
    // Arrange
    
    // Act/Invoke
    
    // Assert
    fail("Not yet implemented");
  }

  // ----------------------- [ HELPER METHODS ] -----------------------
  
}
