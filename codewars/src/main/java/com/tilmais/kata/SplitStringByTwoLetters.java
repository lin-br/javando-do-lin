package com.tilmais.kata;

import java.util.Arrays;
import java.util.regex.Pattern;

public class SplitStringByTwoLetters {

  private static final Pattern REGEX = Pattern.compile("\\.");

  public static String[] split(final String text) {
    var strings = REGEX.split(text.replaceAll("(..)", "$1."));
    return Arrays.stream(strings)
        .filter(twoChars -> !twoChars.isEmpty() || !twoChars.isBlank())
        .map(twoChars -> twoChars.length() < 2 ? twoChars.concat("_") : twoChars)
        .toArray(String[]::new);
  }
}
