package com.test.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025, 1, 1);
        LocalDate localDate1 = LocalDate.of(2025, 12, 31);

        //Period is used to compare time between two dates.
        Period period = localDate.until(localDate1);
        System.out.println("getDays : " +period.getDays());//result is 30: 31-1
        System.out.println("getMonths : " +period.getMonths());//12 - 1
        System.out.println("getYears : " +period.getYears());//2025 - 2025

        //Factory methods to get the Period
        Period period1 = Period.ofDays(10);
        System.out.println("getDays :" + period1.getDays());
        Period period2 = Period.ofMonths(10);
        System.out.println("getMonths :" + period2.getMonths());
        Period period3 = Period.ofYears(10);
        System.out.println("getYears :" + period3.getYears());
        System.out.println("toTotalMonths :"+period3.toTotalMonths());

        Period period4 = Period.between(localDate, localDate1);
        System.out.println("Period :" + period4.getDays() + ":" +period4.getMonths() + ":" +period4.getYears());

    }
}
