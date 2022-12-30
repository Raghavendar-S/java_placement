import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;  
import java.time.format.DateTimeFormatter;
class LocalDate1{
public static void main(String[] args){
    /*LocalDate date = LocalDate.now();
    LocalDate d1 = date.minusDays(1);
    LocalDate d2 = d1.plusDays(2);
    LocalDate d3 = LocalDate.of(2022,12,29);
    System.out.println(d3.isLeapYear());
    LocalDate d4 = LocalDate.of(2022,12,29);
    LocalDateTime dt = d4.atTime(1,50,9);
    System.out.println(dt);*/
    Scanner sc = new Scanner(System.in);
    /*System.out.println("Enter the date in format(YYYY-MM-DD)");
    String str = sc.next();
    LocalDate date = LocalDate.parse(str,DateTimeFormatter.ISO_DATE);
    System.out.println(date.getDayOfWeek().name());*/
    /*LocalTime time = LocalTime.now();  
    System.out.println(time);  
    LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
    LocalTime time2=time1.minusHours(2);  
    System.out.println(time2);
    LocalTime time3=time2.minusMinutes(34);  
    System.out.println(time3);*/
    /*LocalTime.class:
    LocalTime t = LocalTime.now();
    LocalTime t = time.minusHours(2);
    LocalTime t = time.minusMinutes(2);


    Zone:
    ZoneId z1 = ZoneId.of("Asia/Kolkata");
    LocalTime t1 = LocalTime.now(z1);*/

    ZoneId zone1 = ZoneId.of("Asia/Kolkata");  
    ZoneId zone2 = ZoneId.of("Asia/Tokyo");  
    LocalTime time4 = LocalTime.now(zone1);  
    System.out.println("India Time Zone: "+time4);  
    LocalTime time5 = LocalTime.now(zone2);  
    System.out.println("Japan Time Zone: "+time5);  
    long hours = ChronoUnit.HOURS.between(time4, time5);  
    System.out.println("Hours between two Time Zone: "+hours);  
    long minutes = ChronoUnit.MINUTES.between(time4, time5);  
    System.out.println("Minutes between two time zone: "+minutes);  

    /*LocalDateTime
    LocalDateTime t = LocalDateTime.now();
    t.getMonth();
    t.getHour();
    t.getDayofMonth();
    Instant i = i.now(); // nano second*/
}
}