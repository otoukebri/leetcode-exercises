package org.sharpsw.leetcode;

public class ReverseInteger {
    public int reverse(int number) {
        String str = String.valueOf(number);
        String reversed = new StringBuilder(str).reverse().toString();

        StringBuilder cleaned = new StringBuilder();
        int length = reversed.length();
        boolean flag = false;
        for(int index = 0; index < length; index++) {
            if(Character.isDigit(reversed.charAt(index))) {
                cleaned.append(reversed.charAt(index));
            } else if(reversed.charAt(index) == '-') {
                flag = true;
            }
        }

        String resulting;
        if(flag) {
            resulting = "-" + cleaned.toString();
        } else {
            resulting = cleaned.toString();
        }

        try {
            return Integer.parseInt(resulting.toString());
        } catch (Exception exception) {
            return 0;
        }
    }
}
