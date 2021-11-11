package com.model;

public class FizzBuzzDetector {
    private String output;
    private int count;

    // method "getOverlappings" convert input string to new string where every third word replaced to "Fizz"
    // and every fifth word replaced to "Buzz".
    // if the remainder of dividing a word index by three or five is zero, the word with a matching index will be replaced
    // if the remainder of dividing a word index by three AND five is zero, the word with a matching index will be replaced to "FizzBuzz"
    // if input string is null or have non alphanumeric characters and length  more than 100 or less than 7, string won`t be converted
    // int variable "wordCount" counts words that were replaced
    // after replacing string will assigned to local variable "output" and return
    // also "wordCount" will assigned to local variable "count"
    public String getOverlappings(String str) throws RuntimeException {
        if (str == null | !str.matches("[,'.`A-Za-z0-9 ]{7,100}"))
            throw new RuntimeException("Input should contain at least 7 or more alphanumeric characters and symbols \"` , ' . \" but not more than 100.");

        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        int wordCount = 0;
        for (int i = 0; i < strs.length; i++) {
            if (((i + 1) % 3 == 0) & ((i + 1) % 5 == 0)) {
                strs[i] = "FizzBuzz";
                wordCount++;
            } else if ((i + 1) % 3 == 0) {
                strs[i] = "Fizz";
                wordCount++;
            } else if ((i + 1) % 5 == 0) {
                strs[i] = "Buzz";
                wordCount++;
            }
            sb.append(strs[i]).append(" ");
        }
        output = sb.delete(sb.length() - 1, sb.length()).toString();
        count = wordCount;
        return output;
    }

    @Override
    public String toString() {
        return new StringBuilder("output string:\n")
                .append(output)
                .append("\ncount:")
                .append(count).toString();
    }
}
