package org.example.logic;

import java.util.ArrayList;
import java.util.List;

public class FindSubsetsOfIntegerArray {


    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 6, 1, 4};
        findSubSets(numbers, 10);
    }

    private static void findSubSets(int[] numbers, int target) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        backTrack(numbers, 0, target, current, result);
        for(List<Integer> subnet : result){
            System.out.println(subnet);
        }
    }

    private static void backTrack(int[] numbers, int index, int remainingSum, List<Integer> current, List<List<Integer>> result) {
       if(remainingSum == 0){
           result.add(new ArrayList<>(current));
           return;
       }
       if(remainingSum < 0){
           return;
       }
       for(int i = index; i < numbers.length; i++){
           current.add(numbers[i]);
           backTrack(numbers, i + 1, remainingSum - numbers[i], current, result);
           current.remove(current.size() - 1);
       }
    }
}
