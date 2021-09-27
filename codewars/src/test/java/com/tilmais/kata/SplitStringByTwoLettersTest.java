package com.tilmais.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SplitStringByTwoLettersTest {

  @Test
  @DisplayName("Should split the string and the result should be completed with an underscore.")
  void shouldSplitStringAndGetOneStringWithUnderscore() {
    var result = SplitStringByTwoLetters.split("abc");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(3)
        .containsExactly("ab", "c_");
  }

  @Test
  @DisplayName("Should split the string into three groups each with two letters.")
  void shouldSplitStringInThreeGroupsWithTwoLetters() {
    var result = SplitStringByTwoLetters.split("abcdef");
    assertThat(result)
        .isNotNull()
        .isNotEmpty()
        .hasSize(3)
        .containsExactly("ab", "cd", "ef");
  }
}