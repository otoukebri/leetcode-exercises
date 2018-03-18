package org.sharpsw.codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestSibling {
    public int solution(int N) {
        // write your code in Java SE 8
        String convertedNumber = convertNumber(N);
        List<Integer> digits = splitNumberDigits(convertedNumber);
        int finalValue = recreateNumber(digits);
        return finalValue;
    }

    private String convertNumber(int number) {
        return String.valueOf(number);
    }

    private List<Integer> splitNumberDigits(String number) {
        List<Integer> digits = new ArrayList<>();

        number.chars().mapToObj(i -> (char) i).forEach(item -> digits.add(Integer.parseInt(String.valueOf(item))));
        digits.sort(Collections.reverseOrder());
        return digits;
    }

    private int recreateNumber(List<Integer> digits) {
        StringBuilder buffer = new StringBuilder();
        digits.stream().forEach(item -> buffer.append(item));
        return Integer.parseInt(buffer.toString());
    }
}
