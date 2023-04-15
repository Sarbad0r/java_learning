package models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class CarModel extends TransportModel {
    public CarModel(float speed, float weight, String color, byte[] coordinate) {
        super(speed, weight, color, coordinate);
    }

    public static void doSomeStuff() {
        System.out.println("What the hell");
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate + "|" + localDateTime);
    }

}
