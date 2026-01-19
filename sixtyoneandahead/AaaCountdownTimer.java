package sixtyoneandahead;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class AaaCountdownTimer {

    static Scanner countdown = new Scanner(System.in);

    static void main(String[] args){

        // JAVA COUNTDOWN PROGRAM

        // EXAMPLE NUMBER 1
        /*
        Timer tempo  = new Timer();
        TimerTask task = new TimerTask(){

            int count = 5;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println();
                    tempo.cancel();
                }
            }
        };
        */

        System.out.print("Enter the number of seconds to countdown from: ");
        int response = countdown.nextInt();

        Timer tempo  = new Timer();
        TimerTask task = new TimerTask(){

            int count = response;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count <= 0){
                    System.out.println("HAPPY NEW YEAR!");
                    tempo.cancel();
                }
            }
        };

        tempo.scheduleAtFixedRate(task, 0, 1000);

        countdown.close();
    }
}
