package org.sharpsw.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Calc {
    public double evaluate(String expr) {
        if(!isValidExpression(expr)) {
            return 0;
        }

        Stack<Double> numbers = new Stack<>();
        String[] tokens = expr.split(" ");
        List<String> digits = Arrays.asList(tokens);

        digits.forEach(digit -> {
            if(Character.isDigit(digit.charAt(0))) {
                numbers.push(Double.parseDouble(digit));
            } else {
                // Found an operator
                Double secondNumber = numbers.pop();
                Double firstNumber = numbers.pop();
                Double result = applyMathOperation(firstNumber, secondNumber, digit);
                numbers.push(result);
            }
        });
        return numbers.pop();
    }

    private Double applyMathOperation(Double firstNumber, Double secondNumber, String operation) {
        switch(operation) {
            case "+": return firstNumber + secondNumber;
            case "-": return firstNumber - secondNumber;
            case "/": return firstNumber / secondNumber;
            case "*": return firstNumber * secondNumber;
            default: return 0.0;
        }
    }

    private boolean isValidExpression(String expr) {
        if(expr == null || expr.isEmpty()) {
            return false;
        }

        if(expr.length() == 1 && (expr.charAt(0) == '+' || expr.charAt(0) == '-' || expr.charAt(0) == '/' || expr.charAt(0) == '*')) {
            return false;
        }
        return true;
    }
}
