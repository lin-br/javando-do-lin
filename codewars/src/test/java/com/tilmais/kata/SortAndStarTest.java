package com.tilmais.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SortAndStarTest {

  @Test
  @DisplayName("Should get the bitcoin word as the first and with three asterisks between each of its letters")
  void shouldGetBitcoinAsTheFirstWordAndWithAsteriskBetweenEachOfItsLetters() {
    assertThat(SortAndStar.work(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}))
        .isNotNull()
        .isNotBlank()
        .isEqualTo("b***i***t***c***o***i***n");
  }

  @Test
  @DisplayName("Should get the are word as the first and with three asterisks between each of its letters")
  void shouldGetAreAsTheFirstWordAndWithAsteriskBetweenEachOfItsLetters() {
    assertThat(SortAndStar
        .work(new String[]{"turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}))
        .isNotNull()
        .isNotBlank()
        .isEqualTo("a***r***e");
  }
}