package java8_code;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.of(1998,04,06) ;
        LocalDate now = LocalDate.now() ;
        long age  =  ChronoUnit.YEARS.between(localDate,now) ;
        System.out.println(age) ;
    }
}
