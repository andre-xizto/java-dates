package dev.buskopan.DataHora;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {

        // aspas simples para não converter o 's' para segundos
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy 'às' HH:mm:ss");

        LocalDateTime ldtNow = LocalDateTime.now();
        System.out.println(ldtNow);
        System.out.println(formatter.format(ldtNow));

        LocalDate ldNow = LocalDate.now();
        System.out.println(ldNow);

        LocalTime ltNow = LocalTime.now();
        System.out.println(ltNow);

        // GMT/UTC
        Instant iNow = Instant.now();
        System.out.println(iNow);

        // GMT/SAO PAULO
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

    }
}
