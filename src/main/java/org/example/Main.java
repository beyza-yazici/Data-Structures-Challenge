package org.example;


import java.util.Stack;

public class Main {
    public static void main(String[] args) {

    }

    public static boolean checkForPalindrome(String input){
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    public static String convertDecimalToBinary(int num){
        if(num == 0){
            return "0";
        }

        Stack<Integer> binaryStack = new Stack<>();

        while (num > 0){
            int remainder = num % 2;
            binaryStack.push(remainder);
            num = num / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        while (!binaryStack.isEmpty()){
            binaryString.append(binaryStack.pop());
        }
        return binaryString.toString();
    }

}