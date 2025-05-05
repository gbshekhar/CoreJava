package org.example.io;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Multithreading {

    private static final int THREAD_COUNT = 4;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(
                Multithreading.class.getClassLoader().getResourceAsStream("bigfile.csv")
        ))){
            String line;
           while((line = reader.readLine()) != null){
               final String currentLine = line;
               executor.submit(() -> {
                   if(EmployeeValidator.isValid(currentLine)){
                       Employee emp = EmployeeValidator.parse(currentLine);
                       System.out.println(emp.getEmail());
                   }
               });
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.HOURS);
    }
}
