package com.codedifferently.problem02;

public class Solution {
    public String howManyLettersDoYouSee(String input) {
        int charCount = 0;
        char temp;

        for (int i = 0; i < input.length(); i++) {
            temp = input.charAt(i);
                charCount++;
            }

        return temp;
    }
}
