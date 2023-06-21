package com.tilmais.kata;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ConvertCamelCaseToSnakeCaseTest {

  @Test
  void shouldConvertTheToDoString() {
    final var converted = SnakeCaseConverter.convert("toDo");
    assertThat(converted)
        .isNotNull()
        .isNotEmpty()
        .isEqualTo("to_do");
  }

  @Test
  void shouldConvertTheAbcString() {
    final var converted = SnakeCaseConverter.convert("aBc");
    assertThat(converted)
        .isNotNull()
        .isNotEmpty()
        .isEqualTo("a_bc");
  }

  @Test
  void shouldConvertTheShouldReturnSnakeCaseString() {
    final var converted = SnakeCaseConverter.convert("shouldReturnSnakeCase");
    assertThat(converted)
        .isNotNull()
        .isNotEmpty()
        .isEqualTo("should_return_snake_case");
  }

}
