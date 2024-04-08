package org.example;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        //    1) реализовать метод, который принимает год и проверяет на високосность

        LocalDate localDate = LocalDate.EPOCH.withYear(2024);
        System.out.println("Год после Эпохи является високосным " + localDate.isLeapYear());
        LocalDate localDate1 = LocalDate.of(1956, Month.JULY, 1);
        System.out.println("Год до Эпохи является високосным  " + localDate1.isLeapYear());

        //2) вывести на консоль дату локализованную для Индии (например)
        //  System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId zoneId = ZoneId.of("Asia/Calcutta");
        ZonedDateTime dateTime = ZonedDateTime.now(zoneId);
        System.out.println(dateTime);

        //  3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy, d, D, hh:mm");
        Date date = new Date(2022, Calendar.DECEMBER, 19, 11, 47);
        String stringDate = dateFormat.format(date);
        System.out.println(stringDate);

//     4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"

        LocalDate dateOfBirth = LocalDate.of(1789, Month.JULY, 14);
        Locale locale = new Locale("fr");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", locale);
        System.out.println(dateOfBirth.format(formatter));

        // 5) проверить дата "10 Января 1985" - это пятница?
        Calendar calendar = new GregorianCalendar();
        calendar.set(1985,Calendar.JANUARY,10);
        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK) == DayOfWeek.FRIDAY.getValue());

 // 6) вычесть 10 лет из созданной даты, вывести на консоль
        LocalDate dateLocal = LocalDate.of(1871,Month.MARCH,3);
        System.out.println(dateLocal.minusYears(10));

//   7) получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        String subject = "2022-12-19T06:55:30.00Z";
        Instant object = Instant.parse(subject);
        System.out.println(object.toEpochMilli());

  // 8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль

        ZoneId id = ZoneId.of("Pacific/Midway");
        ZonedDateTime dateZone = ZonedDateTime.now(id);
        System.out.println(dateZone);


    }

}