package org.sharpsw.leetcode;

import java.util.Stack;
import java.util.StringTokenizer;

public class Calc {
    public double evaluate(String expr) {
        if(expr.isEmpty()) {
            return 0;
        }

        StringTokenizer tokenizer = new StringTokenizer(expr);
        Stack<Double> numbers = new Stack<>();

        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();

            if(Character.isDigit(token.charAt(0))) {
                numbers.push(Double.parseDouble(token));
            } else {
                // Found an operator
                Double secondNumber = numbers.pop();
                Double firstNumber = numbers.pop();
                Double result = applyMathOperation(firstNumber, secondNumber, token);
                numbers.push(result);
            }
        }
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
}
