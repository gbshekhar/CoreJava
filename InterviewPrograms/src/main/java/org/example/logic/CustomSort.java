package org.example.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomSort {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(45, 12, 78, 4, 56, 19);
        List<Integer> sorted = sortList(input);
        System.out.println("Sorted List: " + sorted);
    }

    private static List<Integer> sortList(List<Integer> input) {
        List<Integer> list = new ArrayList<>(input); // To avoid modifying the original list
        int n = input.size();
        //Bubble Sort Logic : Keep swapping adjacent elements if they are in the wrong order.
        for(int i=0; i < n - 1; i++){// Outer loop: how many passes
            for(int j = 0; j < n - i - 1; j++){// Inner loop: compares pairs
                if(list.get(j) >  list.get(j + 1)){
                  //swap element
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list;
    }
}
