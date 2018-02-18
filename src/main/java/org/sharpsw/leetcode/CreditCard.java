package org.sharpsw.leetcode;

public class CreditCard {
    private static final int MINIMUM_LENGTH = 6;
    private static final int LAST_FINAL_DIGITS_LENGTH = 4;

    public String maskify(String creditCardNumber) {
        if(creditCardNumber.length() < MINIMUM_LENGTH) {
            return creditCardNumber;
        }

        int maxPosition = creditCardNumber.length() - LAST_FINAL_DIGITS_LENGTH;
        int index = 0;
        StringBuilder buffer = new StringBuilder();
        while(index < maxPosition) {
            if(index == 0) {
                buffer.append(creditCardNumber.charAt(0));
            } else {
                if(Character.isDigit(creditCardNumber.charAt(index))) {
                    buffer.append("#");
                } else {
                    buffer.append(creditCardNumber.charAt(index));
                }
            }
            index++;
        }

        buffer.append(creditCardNumber.substring(maxPosition, creditCardNumber.length()));
        return buffer.toString();
    }

}
