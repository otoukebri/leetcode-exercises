package org.sharpsw.leetcode;

import java.util.List;
import java.util.stream.Collectors;

public class LongestSubstringExercise {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        List<Character> myString = convertString(s);
        StringBuilder buffer = new StringBuilder();

        int index = 0;
        while(index < myString.size()) {
            Character character = myString.get(index);

            if(buffer.toString().indexOf(character.charValue()) != -1) {
                buffer = new StringBuilder().append(character.toString());
            } else {
                buffer.append(character.toString());
                if(buffer.length() > maxLength) {
                    maxLength = buffer.length();
                }
            }
            index++;
        }

        return maxLength;
    }

    private List<Character> convertString(String input) {
        return input.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
    }
}
