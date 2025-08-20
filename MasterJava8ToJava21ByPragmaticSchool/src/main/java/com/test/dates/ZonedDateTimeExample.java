package com.test.dates;

import java.time.*;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zonedDateTime :" + zonedDateTime);
        System.out.println("getOffset :" + zonedDateTime.getOffset());
        System.out.println("getZone :" + zonedDateTime.getZone());

        /*System.out.println("Available Zones in Java time package");
        ZoneId.getAvailableZoneIds()
                .forEach(System.out::println);*/

        System.out.println("No. of Zones :" + ZoneId.getAvailableZoneIds().size());

        //Get ZonedDateTime as per specific Zone
        System.out.println("America - Chicago Zone :" + ZonedDateTime.now(ZoneId.of("America/Chicago")));
        System.out.println("America - Chicago Zone  Using Clock:" +ZonedDateTime.now(Clock.system(ZoneId.of("America/Chicago"))));

        //Gettng local date time of particular zone using LocalDateTime
        System.out.println("LocalDateTime of America - Chicago Zone:" + LocalDateTime.now(ZoneId.of("America/Chicago")));

        //Convert LocalDataTime, Instant to ZonedLocalDate and Time
        LocalDateTime localDateTime =LocalDateTime.now();
        System.out.println("LocalDateTime :" +localDateTime);
        ZonedDateTime zonedDateTime1 = localDateTime.atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("ZonedDateTime :" +zonedDateTime1);

        ZonedDateTime zonedDateTime2 =Instant.now().atZone(ZoneId.of("Asia/Calcutta"));
        System.out.println("Instant ZonedDateTime :"+zonedDateTime2);

    }
}
