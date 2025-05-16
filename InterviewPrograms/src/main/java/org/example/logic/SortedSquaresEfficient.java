package org.example.logic;
import java.util.Arrays;
public class SortedSquaresEfficient {
    public static void main(String[] args) {
        int[] nums1 = {-4, -2, 0, 1, 3};
        int[] result = makeSortedSquares(nums1);
        System.out.println(Arrays.toString(result));
    }

    private static int[] makeSortedSquares(int[] arr) {
        //Handle Edge case
        if(arr == null || arr.length == 0){
            return new int[0];
        }

        int n = arr.length;
        int[] result = new int[n];
        int left = 0; //pointer starting from beginning of array
        int right = n-1;//pointer starting from ending of array
        int resultIndex = n-1;//pointer for filling the result array from end
        while(left <= right){
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];
            if(leftSquare >= rightSquare){
                result[resultIndex] = leftSquare;
                left++;
            } else{
                result[resultIndex] = rightSquare;
                right--;
            }
            resultIndex--;
        }
        return  result;
    }
}
