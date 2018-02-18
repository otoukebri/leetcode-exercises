package org.sharpsw.leetcode;

public class NumberToOrdinal {

    public String numberToOrdinal(Integer number) {
        if(number == 0) {
            return "0";
        }

        String suffix = getOrdinalSuffix(number);
        StringBuilder buffer = new StringBuilder();
        buffer.append(number).append(suffix);
        return buffer.toString();
    }

    private String getOrdinalSuffix(Integer number) {
        if(isFinishedBetween11And19(number)) {
            return "th";
        }

        Integer digit = number % 10;
        if(digit == 1) {
            return "st";
        } else if(digit == 2) {
            return "nd";
        } else if(digit == 3) {
            return "rd";
        }
        return "th";
    }

    private boolean isFinishedBetween11And19(Integer number) {
        String strNum = Integer.toString(number);
        return strNum.length() > 1 && strNum.substring(strNum.length() - 2).charAt(0) == '1';
    }
}
