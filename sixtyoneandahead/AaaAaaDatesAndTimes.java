package sixtyoneandahead;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class AaaAaaDatesAndTimes {
    static void main(String[] args){

        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC Timestamp)

        /*
        LocalDate dia = LocalDate.now();
        LocalTime hora = LocalTime.now();
        LocalDateTime datahora  = LocalDateTime.now();
        Instant instante = Instant.now();


        System.out.println(dia);
        System.out.println(hora);
        System.out.println(datahora);
        System.out.println(instante);
        */

        /*
        // Custom Format
        LocalDateTime horaedata = LocalDateTime.now();

        DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newdatetime = horaedata.format(formatado);
        System.out.println(newdatetime);
        */

        // Custom Format 2
        LocalDate data = LocalDate.of(2026, 12, 25);
        LocalDateTime dia1 = LocalDateTime.of(2026, 12, 25, 11, 59,59);
        LocalDateTime dia2 = LocalDateTime.of(2026, 12, 31, 11, 59,59);

        System.out.println(data);
        System.out.println(dia1);
        System.out.println(dia2);

        if(dia1.isBefore(dia2)){
            System.out.println(dia1 + " Is earlier than " + dia2);
        }
        else if(dia1.isAfter(dia2)){
            System.out.println(dia1 + " Is later than " + dia2);
        }
        else if(dia1.isEqual(dia2)){
            System.out.println(dia1 + " Is equal to " + dia2);
        }
    }
}