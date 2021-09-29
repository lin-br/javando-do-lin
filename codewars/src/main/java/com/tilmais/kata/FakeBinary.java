package com.tilmais.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FakeBinary {

  public static String translate(String numberString) {
    return Arrays.stream(numberString.split(""))
        .filter(digit -> !digit.isEmpty())
        .map(Integer::parseInt)
        .map(number -> number < 5 ? 0 : 1)
        .map(String::valueOf)
        .collect(Collectors.joining());
  }
}
