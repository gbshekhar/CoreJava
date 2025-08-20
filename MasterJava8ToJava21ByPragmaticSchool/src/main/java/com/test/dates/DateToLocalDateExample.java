package com.test.dates;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
    public static void main(String[] args) {
        //Convert java.util.Date to LocalDate and ViceVersa
        Date utilDate = new Date();
        System.out.println("Java Util Date :"+utilDate);

        LocalDate localDate = utilDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        System.out.println("local Date :" + localDate);

        //Conver java.sql.Date to LocalDate and ViceVersa

        java.sql.Date  sqlDate = java.sql.Date.valueOf(localDate);
        LocalDate localDate1 = sqlDate.toLocalDate();
        System.out.println("local Date2 :" + localDate1);
    }
}
