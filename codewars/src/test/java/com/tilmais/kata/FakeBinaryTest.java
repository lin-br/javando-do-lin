package com.tilmais.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class FakeBinaryTest {

  @Test
  void shouldGetEmptyStringIfNumberStringIsEmpty() {
    var fakeBinary = FakeBinary.translate("");
    assertThat(fakeBinary).isEmpty();
  }

  @Test
  void shouldTranslateFirstDigitsForFakeBinary() {
    var fakeBinary = FakeBinary.translate("45385593107843568");

    assertThat(fakeBinary)
        .isNotNull()
        .isNotEmpty()
        .isNotBlank()
        .isEqualTo("01011110001100111");
  }

  @Test
  void shouldTranslateSecondDigitsForFakeBinary() {
    var fakeBinary = FakeBinary.translate("509321967506747");

    assertThat(fakeBinary)
        .isNotNull()
        .isNotEmpty()
        .isNotBlank()
        .isEqualTo("101000111101101");
  }

  @Test
  void shouldTranslateThirdDigitsForFakeBinary() {
    var fakeBinary = FakeBinary.translate("366058562030849490134388085");

    assertThat(fakeBinary)
        .isNotNull()
        .isNotEmpty()
        .isNotBlank()
        .isEqualTo("011011110000101010000011011");
  }
}