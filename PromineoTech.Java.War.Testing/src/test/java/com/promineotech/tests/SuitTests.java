package com.promineotech.tests;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import com.promineotech.Suit;

class SuitTests {
  @Test
  void all_ShouldContainFourValues() {
    // Arrange
    
    // Act/Invoke
    Suit[] suits = getSuitsAsArray();
    
    // Assert
    assertThat(suits.length).isEqualTo(4);
  }

  @Test
  void all_ShouldContainSPADE() {
    // Arrange

    // Act/Invoke
    Suit[] suits = getSuitsAsArray();
    
    // Assert
    assertThat(suits).contains(Suit.SPADE);
  }

  @Test
  void all_ShouldContainDIAMOND() {
    // Arrange
    
    // Act/Invoke
    Suit[] suits = getSuitsAsArray();
    
    // Assert
    assertThat(suits).contains(Suit.DIAMOND);
  }

  @Test
  void all_ShouldContainHEART() {
    // Arrange

    // Act/Invoke
    Suit[] suits = getSuitsAsArray();
    
    // Assert
    assertThat(suits).contains(Suit.HEART);
  }

  @Test
  void all_ShouldContainCLUB() {
    // Arrange
    
    // Act/Invoke
    Suit[] suits = getSuitsAsArray();
    
    // Assert
    assertThat(suits).contains(Suit.CLUB);
  }


  @ParameterizedTest
  @MethodSource("getSuitSymbols")
  void toString_ReturnsExpectedSymbol(Suit suit, String symbol) {
    // Arrange
    
    // Act/Invoke
    String value = suit.toString();
    
    // Assert
    assertThat(value).isEqualTo(symbol);
  }

  // ----------------------- [ HELPER METHODS ] -----------------------

  /**
   * Helper method to convert the Iterable<> into an array object.
   * @return The array of values.
   */
  private static Suit[] getSuitsAsArray() {
    Iterable<Suit> suits = Suit.all();
    return StreamSupport.stream(suits.spliterator(), false)
                        .toArray(Suit[]::new);
  }

  /**
   * Test parameter generator for suits and their symbols.
   * @return Stream of test parameters.
   */
  private static Stream<Arguments> getSuitSymbols() {
    return Stream.of(
      Arguments.of(Suit.CLUB, "♣"),
      Arguments.of(Suit.SPADE, "♠"),
      Arguments.of(Suit.DIAMOND, "♦"),
      Arguments.of(Suit.HEART, "♥")
    );
  }
}
