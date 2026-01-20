package LastPart;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AaAlarmClock {

    static Scanner scanner = new Scanner(System.in);
    static void main(String[] args){

        // JAVA ALARM CLOCK

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filepath = "On The Flip - The Grey Room _ Density & Time 2.wav";

        while(alarmTime == null){
            try {
                System.out.println("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);
            }
            catch(DateTimeParseException e){
                System.out.println("Invalid format. type a real hour to this program work!");
            }
        }

        alarme alarmclock = new alarme(alarmTime, filepath, scanner);
        Thread alarmThread = new Thread(alarmclock);
        alarmThread.start();

    }
}
