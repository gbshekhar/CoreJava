package org.example.collections;

import java.util.HashMap;

public class RehashingDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>(4, 0.75f);

        for (int i = 1; i <= 10; i++) {
            map.put(i, "Value" + i);
            System.out.println("Added key " + i + ", size = " + map.size());
        }
    }
}
