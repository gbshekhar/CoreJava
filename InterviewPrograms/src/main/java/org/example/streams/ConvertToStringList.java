package org.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class ConvertToStringList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 10, 20);

        List<String> stringList = numbers.stream()
                        .map(String::valueOf)
                        .toList();

        System.out.println("List of Strings: " + stringList);
    }
}
