package org.example.logic;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(10, 20, 10, 30, 40, 50, 20, 60);
        List<Integer> unique = findUniqueNumbers(input);
        System.out.println("Unique numbers: " + unique);
    }

    private static List<Integer> findUniqueNumbers(List<Integer> input) {
        return input.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
