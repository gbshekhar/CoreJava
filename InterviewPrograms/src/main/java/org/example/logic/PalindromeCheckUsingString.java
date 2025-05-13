package org.example.logic;

public class PalindromeCheckUsingString {

    public static void main(String[] args) {
        int n = 12321;
        boolean isPalindrome = isPalindrome(n);
        System.out.println(isPalindrome);
    }

    private static boolean isPalindrome(int n) {
         String str = Integer.toString(n);
         String reverseString = new StringBuilder(str).reverse().toString();
         return str.equals(reverseString);
    }
}
