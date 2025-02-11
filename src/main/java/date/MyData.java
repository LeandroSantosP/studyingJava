package date;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;

public class MyData {
   public static void main(String[] args) {
      // How to work with DATES & TIMES using Java
      // (LocalDate , LocalTime, LocalDateTime, UTC timestamp)
      LocalDateTime datetime = LocalDateTime.now();
      // System.out.println(datetime); // 2025-01-28T13:36:06.493488169

      Instant instant = Instant.now();
      // System.out.println(instant); // 2025-01-28T16:36:06.493725439Z

      // Custom Format
      LocalDateTime datetimeNotFormatedInstance = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
      
      LocalDateTime datetimeNotFormated = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
      System.out.println("Before: " + datetimeNotFormated); // Before: 2025-01-28T13:36:38.791998862
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
      String datetimeFormated = datetimeNotFormated.format(formatter);
      System.out.println("After: " + datetimeFormated); // After: 28-01-2025 13:36:38

      LocalDateTime date_one = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
      LocalDateTime date_two = LocalDateTime.of(2025, 1, 1, 0, 0, 0);   
      System.out.println(date_one);
      System.out.println(date_two);
      /* Compare Dates */
      if (date_one.isBefore(date_two)) {
         System.out.println("Date " + date_one + " is earlier than " + date_two);
      } else if (date_one.isAfter(date_two)) {
         System.out.println("Date " + date_one + " is later than " + date_two);
      } else if (date_one.equals(date_two)) {
         System.out.println("Date " + date_one + " is equal to " + date_two);
      }
   }
}
