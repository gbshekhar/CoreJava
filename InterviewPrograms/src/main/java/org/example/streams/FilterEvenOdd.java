package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Problem Statement: How to filter Even and Odd in single stream() method from a list of Integer.
public class FilterEvenOdd {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 4, 7, 10, 15, 20, 22);

        Map<Boolean, List<Integer>> result = integerList.stream()
                .collect(Collectors.partitioningBy(n -> n % 2==0));

        List<Integer> evens = result.get(true);
        List<Integer> odds = result.get(false);

        System.out.println("Evens: "+evens);
        System.out.println("Odds: " +odds);
    }
}
