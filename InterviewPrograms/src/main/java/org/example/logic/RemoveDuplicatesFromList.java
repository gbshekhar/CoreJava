package org.example.logic;

import java.util.*;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        // Original list with duplicates
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);

        System.out.println("Original List: " + numbers);

        //Remove duplicates using LinkedHashSet to maintatin insertion order
        Set<Integer> set = new LinkedHashSet<>(numbers);
        List<Integer> uniqueList = new ArrayList<>(set);

        System.out.println("Unique List: " + uniqueList);

        //with streams
        List<Integer> uniqueListWithStreams = numbers.stream().distinct().toList();
        System.out.println("Unique List with streams: " + uniqueListWithStreams);


        // Use LinkedHashMap to retain order of last occurrence
        Map<Integer, Integer> map = new LinkedHashMap<>();
        // Traverse in reverse to keep last occurrence
        for (int i = numbers.size() - 1; i >= 0; i--) {
            map.put(numbers.get(i), i);
        }

        // Reverse again to restore original order of last occurrences
        List<Integer> result = new ArrayList<>(map.keySet());
        Collections.reverse(result);

        System.out.println("List after removing duplicates (keeping last): " + result);
    }
}
