package ders27_immutableClasses_DateAndTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C05__LocalTime {
    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();

        System.out.println(saat);  // 19:22:45.039180200

        LocalTime saatt2=LocalTime.of(17,10,20);


        System.out.println(saat.compareTo(saatt2));  // 1

        System.out.println(saatt2.withNano(455464)); // 17:10:20.000455464

    }
}
