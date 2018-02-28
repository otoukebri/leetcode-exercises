package org.sharpsw.leetcode;

import java.util.stream.IntStream;

import static java.lang.Character.isDigit;

public class CreditCard {
    private static final int MINIMUM_LENGTH = 6;
    private static final int LAST_FINAL_DIGITS_LENGTH = 4;
    private static final String MASK_CHAR = "#";

    public String maskify(String creditCardNumber) {
        if(creditCardNumber == null) {
            return "";
        }

        if(creditCardNumber.length() < MINIMUM_LENGTH) {
            return creditCardNumber;
        }

        StringBuilder maskedCard = new StringBuilder().append(creditCardNumber.charAt(0));
        maskedCard.append(performMask(creditCardNumber.substring(1, creditCardNumber.length() - LAST_FINAL_DIGITS_LENGTH)));
        maskedCard.append(creditCardNumber.substring(creditCardNumber.length() - LAST_FINAL_DIGITS_LENGTH, creditCardNumber.length()));
        return maskedCard.toString();
    }

    private String performMask(String creditCardNumber) {
        StringBuilder buffer = new StringBuilder();
        IntStream.range(0, creditCardNumber.length()).forEach(index -> {
            char digit = creditCardNumber.charAt(index);
            if (isDigit(digit)) {
                buffer.append(MASK_CHAR);
            } else {
                buffer.append(digit);
            }
        });
        return buffer.toString();
    }
}
