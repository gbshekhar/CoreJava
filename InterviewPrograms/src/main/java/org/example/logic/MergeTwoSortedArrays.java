package org.example.logic;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        System.out.println("Array1 : "+ Arrays.toString(array1));
        System.out.println("Array2 :" +Arrays.toString(array2));
        int[] mergedArray = mergeTwoSortedArrays(array1, array2);
        System.out.println("Merged Array :" + Arrays.toString(mergedArray));
    }

    private static int[] mergeTwoSortedArrays(int[] array1, int[] array2) {
        //check if Array1 is null or empty
        if(array1 == null || array1.length == 0){
            return array2 == null ? new int[0] : Arrays.copyOf(array2, array2.length);
        }

        //check if Array2 is null or empty
        if(array2 == null || array2.length == 0){
            return Arrays.copyOf(array1, array1.length);
        }

        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        int i=0;//pointer for array1
        int j=0;//pointer for array2
        int k=0;//pointer for merged array

        //main merging loop
        while(i < n1 && j < n2){
            if(array1[i] <= array2[j]){
                mergedArray[k] = array1[i];
                i++;//move pointer for Array1
            } else{
                mergedArray[k] = array2[j];
                j++;//move pointer for Array2
            }
            k++;//move pointer for merged Array
        }

        //Copy Remaining elements
        //if elements are left in Array1, copy them
        while(i < n1){
            mergedArray[k] = array1[i];
            i++;
            k++;
        }
        while(j < n2){
            mergedArray[k] = array2[j];
            j++;
            k++;
        }

        return mergedArray;
    }
}
