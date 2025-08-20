package org.example.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Mohan", "Sita");

        Spliterator<String> spliterator = names.spliterator();

        //spliterator.forEachRemaining(name -> System.out.println("Name: "+name));


        System.out.println("Parallel Processing");
        Spliterator<String> spliterator2 = spliterator.trySplit();

        spliterator.forEachRemaining(name -> System.out.println("SP1 Name: "+name));
        spliterator2.forEachRemaining(name -> System.out.println("SP2 Name: "+name));
    }
}
