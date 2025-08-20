package com.test.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant); //toString method of Instant is overridden to print in LocalDateTime format
        //Jan 1, 1970 -> EPOCH
        System.out.println("getEpochSecond :" +instant.getEpochSecond());

        //Of
        Instant instant1 = Instant.ofEpochSecond(0);
        System.out.println("ofEpochSecond :" + instant1);

        //Difference between Instances
        Instant instant2 = Instant.now();
        Duration duration = Duration.between(instant, instant2);
        System.out.println("difference : " + duration.getNano());
    }
}
