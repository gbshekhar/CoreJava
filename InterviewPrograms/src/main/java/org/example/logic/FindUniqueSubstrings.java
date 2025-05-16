package org.example.logic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueSubstrings {
    public static void main(String[] args) {
        String input = "abcabcbb";
        List<String> uniqueSubstrings = getAllUniqueCharSubstrings(input);

        System.out.println("Total unique substrings with no repeated characters: " + uniqueSubstrings.size());
        System.out.println("Substrings:");
        for(String s: uniqueSubstrings){
            System.out.println(s);
        }
    }

    private static List<String> getAllUniqueCharSubstrings(String input) {
        List<String> result = new ArrayList<>();
        int n = input.length();

        //generate sub string
        for(int i = 0; i < input.length(); i++){
            Set<Character> seen = new HashSet<>();
            StringBuilder current = new StringBuilder();
            for(int j=i; j < input.length(); j++){
                char c = input.charAt(j);
                if(seen.contains(c)){
                    break;
                }
                seen.add(c);
                current.append(c);
                result.add(current.toString());
            }
        }
        return  result;
    }
}
