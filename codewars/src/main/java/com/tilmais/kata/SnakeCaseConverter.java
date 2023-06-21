package com.tilmais.kata;

import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SnakeCaseConverter {

  public static String convert(final String camelCaseString) {
    return IntStream.range(0, camelCaseString.length())
        .mapToObj(camelCaseString::charAt)
        .map(SnakeCaseConverter::convertCharacter)
        .collect(Collectors.joining());
  }

  private static String convertCharacter(final Character character) {
    if (isUpperCase(character)) {
      return addUnderscoreInChar(character);
    }
    return character.toString();
  }

  private static String addUnderscoreInChar(final Character character) {
    return "_" + toLowerCase(character);
  }
}
