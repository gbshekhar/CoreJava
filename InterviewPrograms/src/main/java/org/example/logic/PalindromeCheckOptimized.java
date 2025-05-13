package org.example.logic;

public class PalindromeCheckOptimized {

    public static boolean isPalindrome(int num){
        //Negative numbers are not Palindrome
        if(num < 0) return  false;

        int original = num;
        int reversed = 0;
        while(num != 0){
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num = num /10;
        }
        return original == reversed;
    }

    public static void main(String[] args) {
        int n = 12321;
        boolean isPalaindrome = isPalindrome(n);
        System.out.println(isPalaindrome);
    }
}
