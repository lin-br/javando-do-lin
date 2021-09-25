package com.tilmais.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndStar {

  public static String work(String[] vector) {
    return Arrays.stream(vector)
        .sorted()
        .findFirst()
        .map(first -> first.split(""))
        .stream()
        .map(arrayOfChars -> String.join("***", arrayOfChars))
        .collect(Collectors.joining());
  }
}
