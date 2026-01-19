package sixtyoneandahead;

import java.util.Timer;
import java.util.TimerTask;

public class AaaATimerTask {
    static void main(String[] args){

        // Timer = Class that schedules tasks at specific times or periodically
        //         Useful for: sending notifications, scheduled updates, repetitive actions

        // TimerTask = Represents the task that will be executed by the Timer
        //             You will extend the TimerTask class to define your task
        //             Create a subclass of TimerTask and @Override run()

        Timer tempo = new Timer();
        TimerTask task = new TimerTask(){

            int count = 3;

            @Override
            public void run(){
                System.out.println("Hello!");
                count--;
                if(count <= 0){
                    System.out.println("Task complete");
                    tempo.cancel();
                }
            }
        };

        //tempo.schedule(task, 2500);
        //tempo.schedule(task, 0,2500);
        //tempo.schedule(task, 3000,2500);
    }

    public static class AaMusicPlayer {
        static void main(String[] args){

            // How to PLAY AUDIO with JAVA (.wav, .au, .aiff)

            // terminar depois, vou baIXAR NADA AGORA NÃO.
        }
    }
}
