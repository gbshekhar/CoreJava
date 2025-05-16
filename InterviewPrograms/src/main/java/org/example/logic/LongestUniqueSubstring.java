package org.example.logic;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    public static String findLongestUniqueSubstring(String s) {
        //Creates a HashMap seen to store characters and their most recent index in the string.
        Map<Character, Integer> seen = new HashMap<>();
        //maxLength: Tracks the length of the longest unique substring found so far.
        //start: Marks the beginning of the sliding window.
        int maxLength =0, start = 0;
        //Keep track of the actual position of the longest substring.
        int startIndex = 0;
        //Iterates over the string, checking each character's occurrence in the sliding window
        for(int index=0; index < s.length(); index++){
            //Extracts the current character at position index.
            char ch = s.charAt(index);
            //Checks if the character has been seen before and whether it's within the current window:
            //If yes, updates start to exclude the previous occurrence and maintain uniqueness.
            if(seen.containsKey(ch) && seen.get(ch) >= start){
                start = seen.get(ch) + 1;
            }
            //Stores the character's index in the HashMap.
            seen.put(ch, index);
            //Updates maximum length if a longer unique substring is found.
            //Saves the start and end positions for extracting the substring later.
            if (index - start + 1 > maxLength) {
                maxLength = index - start + 1;
                startIndex = start;
            }
        }
        //Extracts and returns the longest unique substring found.
        return s.substring(startIndex, startIndex + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Longest unique substring: " + findLongestUniqueSubstring(s));
    }
}


