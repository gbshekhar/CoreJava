package com.test.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("localDate :" + localDate);

        //Of
        LocalDate localDate1 = LocalDate.of(2018, 8,19);
        System.out.println("localDate1 :"+localDate1);

        //ofYearDay
        LocalDate localDate2 = LocalDate.ofYearDay(2025, 365);
        System.out.println(localDate2);

        //Get values from localDate
        System.out.println("getMonth :" +localDate.getMonth());
        System.out.println("getMonthValue :" +localDate.getMonthValue());;
        System.out.println("getDayOfWeek :" +localDate.getDayOfWeek());
        System.out.println("getDayOfMonth :" +localDate.getDayOfMonth());
        System.out.println("getDayOfYear :" +localDate.getDayOfYear());
        System.out.println("Day of month using Get :"+localDate.get(ChronoField.DAY_OF_MONTH));

        //Modify Local Date
        System.out.println("plusDays :" +localDate.plusDays(2));
        System.out.println("plusMonths :" +localDate.plusMonths(2));
        System.out.println("minusDays :" +localDate.minusDays(2));
        System.out.println("ChronoUnit with Minus :"+localDate.minus(1, ChronoUnit.YEARS));
        System.out.println("withYear:" +localDate.withYear(2020));
        System.out.println("with ChronoField:" + localDate.with(ChronoField.YEAR,2021));
        System.out.println("with TemporalAdjusters :" +localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        //Additonal Support Methods
        System.out.println("isLeapYear :" +localDate.isLeapYear());
        System.out.println("is equal :" +localDate.isEqual(localDate1));
        System.out.println("is Before :" + localDate.isBefore(localDate1));
        System.out.println("is After :" + localDate.isAfter(localDate1));
        System.out.println("is Supported :" +localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("is Supported :" +localDate.isSupported(ChronoUnit.YEARS));

    }
}
