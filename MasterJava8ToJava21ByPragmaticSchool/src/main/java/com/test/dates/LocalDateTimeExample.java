package com.test.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime :"+localDateTime);

        //of
        LocalDateTime localDateTime1 = LocalDateTime.of(2025, 8, 19, 17,
                40, 10, 98);
        System.out.println("localDateTime1 :"+ localDateTime1);
        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2 :"+localDateTime2);

        //Get the time and date from LocalDateTime instance
        System.out.println("getDayOfMonth :" +localDateTime.getDayOfMonth());
        System.out.println("getHour :"+ localDateTime.getHour());
        System.out.println("DAY_OF_MONTH :" +localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("plusHours :" + localDateTime.plusHours(2));
        System.out.println("minusHours :" +localDateTime.minusHours(2));
        System.out.println("withHour :" +localDateTime.withHour(20));;

        //Converting LocalDate, LocalTime  to LocalDateTime and ViceVersa
        LocalDate localDate = LocalDate.now();
        System.out.println("atTime :" + localDate.atTime(20,10));
        LocalTime localTime = LocalTime.now();
        System.out.println("atDate :" +localTime.atDate(localDate));
        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate :" +localDateTime3.toLocalDate());
        System.out.println("toLocalTime :" +localDateTime3.toLocalTime());
    }
}
