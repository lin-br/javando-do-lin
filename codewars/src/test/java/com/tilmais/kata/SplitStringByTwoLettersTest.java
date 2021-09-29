package com.tilmais.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SplitStringByTwoLettersTest {

  @Test
  @DisplayName("Should split the string and the result should be completed with an underscore.")
  void shouldSplitStringAndGetOneStringWithUnderscore() {
    var result = SplitStringByTwoLetters.split("LovePizza");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(5)
        .containsExactly("Lo", "ve", "Pi", "zz", "a_");
  }

  @Test
  @DisplayName("Should split the string into five groups each with two letters.")
  void shouldSplitStringInFiveGroupsWithTwoLetters() {
    var result = SplitStringByTwoLetters.split("HelloWorld");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(5)
        .containsExactly("He", "ll", "oW", "or", "ld");
  }

  @Test
  @DisplayName("Should get an empty array if the text is empty.")
  void shouldGetEmptyArrayWhenTextIsEmpty() {
    var result = SplitStringByTwoLetters.split("");
    assertThat(result).isEmpty();
  }

  @Test
  @DisplayName("Should split the text with spaces.")
  void shouldSplitStringWithSpaces() {
    var result = SplitStringByTwoLetters.split("I Love Pizza");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(6)
        .containsExactly("I ", "Lo", "ve", " P", "iz", "za");
  }

  @Test
  @DisplayName("Should split the text with spaces and underscore.")
  void shouldSplitStringWithSpacesAndUnderscore() {
    var result = SplitStringByTwoLetters.split("Hello World");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(6)
        .containsExactly("He", "ll", "o ", "Wo", "rl", "d_");
  }
}