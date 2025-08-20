package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

//Problem Statement
//from list of integers find highest group of integers (12,22,31,44,11,44,22,31,44,32,33) => output - (44,44,44)
public class HighestGroup {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(12, 22, 31, 44, 11, 44, 22, 31, 44, 32, 33);

        // Step 1: Count frequencies
        Map<Integer, Long> frequencyMap = input.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        //Step2: Find Max Frequency
        long maxFreq = Collections.max(frequencyMap.values());

        //Step3: Get number(s) with max frequency
        Set<Integer> maxFrequencyNumbers = frequencyMap.entrySet().stream()
                .filter(e -> e.getValue() == maxFreq)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        //Step4: Filter original list to get only max group
        List<Integer> numbers = input.stream()
                .filter(maxFrequencyNumbers::contains)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
