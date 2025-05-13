package org.example.logic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SameCharactersCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input two string
        System.out.println("Enter First String");
        String firstString = scanner.nextLine();

        System.out.println("Enter Second String");
        String secondString = scanner.nextLine();

        //Convert both Strings to Set of Characters
        Set<Character> set1 = toCharacterSet(firstString);
        Set<Character> set2 = toCharacterSet(secondString);

        //compare the sets
        if(set1.equals(set2)){
            System.out.println("The String have same characters");
        } else {
            System.out.println("The String have different characters");
        }
    }

    private static Set<Character> toCharacterSet(String str) {
        Set<Character> set = new HashSet<>();
        for(char c: str.toCharArray()){
            set.add(c);
        }
        return set;
    }
}
