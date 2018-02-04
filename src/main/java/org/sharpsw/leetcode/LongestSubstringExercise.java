package org.sharpsw.leetcode;

public class LongestSubstringExercise {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        StringBuilder buffer = new StringBuilder();

        int index = 0;
        int start = 0;
        while(index < s.length()) {
            char character = s.charAt(index);

            if(buffer.indexOf(String.valueOf(character)) != -1) {
                int position = s.indexOf(String.valueOf(character), start);
                index = position;
                start = position + 1;
                buffer = new StringBuilder();
            } else {
                buffer.append(character);
                if(buffer.length() > maxLength) {
                    maxLength = buffer.length();
                }
            }
            index++;
        }

        return maxLength;
    }
}
