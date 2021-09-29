# About this project
I'm developing this project for both continuous learning and to improve my Java skills.
It has codes, scripts, algorithms, challenges, exercises, annotations, comments, and
more that I developed during this saga.

# Challenges

### [Kata] "Sort and Star" from CodeWars :white_check_mark:
The description [this challenge](https://www.codewars.com/kata/57cfdf34902f6ba3d300001e/train/java) is:
You will be given a vector of strings. You must sort it alphabetically (case-sensitive, and based on the ASCII values of the chars)
and then return the first value. The returned value must be a string, and have "***" between each of its letters.

Examples:
```text
  SortAndStar.do(new String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}) // should return "b***i***t***c***o***i***n"
  SortAndStar.do(new String[] "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones"}) // should return "a***r***e"
```

- [Here](https://github.com/lin-br/javando-do-lin/blob/master/codewars/src/main/java/com/tilmais/kata/SortAndStar.java) you can see the result.
- [Here](https://github.com/lin-br/javando-do-lin/blob/master/codewars/src/test/java/com/tilmais/kata/SortAndStarTest.java) you can see the test results.

### [Kata] "Split Strings" from CodeWars :white_check_mark:
Complete the solution so that it splits the string into pairs of two characters. If the string contains an odd number of characters then
it should replace the missing second character of the final pair with an underscore ('_').

Examples:
```text
  StringSplit.solution("abc") // should return {"ab", "c_"}
  StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
```

- [Here](https://github.com/lin-br/javando-do-lin/blob/master/codewars/src/main/java/com/tilmais/kata/SplitStringByTwoLetters.java) you can see the result.
- [Here](https://github.com/lin-br/javando-do-lin/blob/master/codewars/src/test/java/com/tilmais/kata/SplitStringByTwoLettersTest.java) you can see the test results.