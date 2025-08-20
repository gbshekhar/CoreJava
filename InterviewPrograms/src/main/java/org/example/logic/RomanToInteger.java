package org.example.logic;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s){
        //Define Roman Numerals Value
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        //Traverse the Roman numerals from right to left
        for(int i= s.length()-1; i >=0; i--){
            int current = romanMap.get(s.charAt(i));
            if(current < prevValue){
                result = result - current;//Subtract if it's less than the previous numeral
            } else {
                result = result + current;//Add the value if it's greater than or equal to the previous numeral.
            }
            prevValue = current;
        }

        return result;
    }

    public static void main(String[] args) {
        // Sample test cases
        System.out.println("XII = " + romanToInt("XII"));      // Output: 12
        System.out.println("IV = " + romanToInt("IV"));        // Output: 4
        System.out.println("MCMXCIV = " + romanToInt("MCMXCIV")); // Output: 1994
    }
}
