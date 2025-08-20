package com.test.dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormattingLocalDateExample {
    public static void parseLocalDate(){
        //Parsing - converting String representation of date to LocalDate
        String date = "2025-08-20";
        LocalDate localDate = LocalDate.parse(date);//Internally uses DateTimeFormatter.ISO_LOCAL_DATE
        System.out.println("localDate : " + localDate);

        LocalDate localDate1 = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("localDate1 :" + localDate1);

        String date1 = "20250820";
        LocalDate localDate2 = LocalDate.parse(date1, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("localDate2 :" + localDate2);

        //Custom Defined DateFormat
        String date2 = "2025|08|20";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate3 = LocalDate.parse(date2, dateTimeFormatter);
        System.out.println("localDate3 :" + localDate3);
    }

    public static void formatLocalDate(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
        LocalDate localDate = LocalDate.now();
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println("Formatted Date :" + formattedDate);
    }

    public static void main(String[] args) {
         parseLocalDate();
        formatLocalDate();
    }
}
