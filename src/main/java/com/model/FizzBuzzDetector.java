package com.model;

public class FizzBuzzDetector {
    private String output;
    private int count;

    public String getOverlappings(String str) {
        if (str == null | !str.matches("[,'.`A-Za-z0-9 ]{7,100}"))
            return str;

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
