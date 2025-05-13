package org.example.utility;

import java.util.HashSet;
import java.util.Set;

public class SetUtilityMethods {
    public static void main(String[] args) {
        Set<String> set1 = Set.of("A", "B", "C");
        Set<String> set2 = Set.of("A", "B");

        //Equals
        boolean isEquals = set1.equals(set2);
        System.out.println("isEquals :"+isEquals);

        //Check if one set is a subset of another:
        boolean isSubset = set1.containsAll(set2);
        System.out.println("isSubset :" +isSubset);

        //Difference (elements in one set but not the other)
        Set<String> diff =new HashSet<>(set1);
        diff.removeAll(set2);
        System.out.println("Difference :" +diff);

        //intersection
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection :" + intersection);

    }
}
