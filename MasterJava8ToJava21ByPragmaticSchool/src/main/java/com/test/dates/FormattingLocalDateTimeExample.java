package com.test.dates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingLocalDateTimeExample {
    public static void parseLocalDateTime(){
       String dateTime = "2025-08-20T18:06:33";
       LocalDateTime localDateTime = LocalDateTime.parse(dateTime);
       System.out.println("localDateTime :" + localDateTime);

       //Custom Format
        String dateTime1 = "2025-08-20T18|06|33";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm|ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse(dateTime1, dateTimeFormatter);
        System.out.println("localDateTime1 :" + localDateTime1);

        String dateTime2 = "2025-08-20abc18|06|33";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime2 = LocalDateTime.parse(dateTime2, dateTimeFormatter1);
        System.out.println("localDateTime2 :" + localDateTime2);
    }
    public static void formatLocalDateTime(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm|ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = localDateTime.format(dateTimeFormatter);
        System.out.println("formattedDateTime :" + formattedDateTime);

    }
    public static void main(String[] args) {
        parseLocalDateTime();
        formatLocalDateTime();
    }
}
