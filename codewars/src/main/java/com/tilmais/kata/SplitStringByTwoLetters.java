package com.tilmais.kata;

import java.util.Arrays;

public class SplitStringByTwoLetters {

  public static String[] split(final String text) {
    var strings = text.replaceAll("(..)", "$1.").split("\\.");
    return Arrays.stream(strings)
        .filter(twoChars -> !twoChars.isEmpty() || !twoChars.isBlank())
        .map(twoChars -> twoChars.length() < 2 ? twoChars.concat("_") : twoChars)
        .toArray(String[]::new);
  }
}
