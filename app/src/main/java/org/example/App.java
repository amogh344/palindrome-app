package com.example;

public class App {
    public static void main(String[] args) {
        String word = "madam";
        System.out.println("Is '" + word + "' a palindrome? " + isPalindrome(word));
    }

    public static boolean isPalindrome(String input) {
        StringBuilder reversed = new StringBuilder(input).reverse();
        return input.equals(reversed.toString());
    }
}
