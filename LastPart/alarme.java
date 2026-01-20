package LastPart;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class alarme implements Runnable{

    private final LocalTime alarmtime;
    private final String filepath;
    private final Scanner scanner;

    public alarme(LocalTime alarmtime, String filepath, Scanner scanner){

        this.alarmtime = alarmtime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run(){

        while(LocalTime.now().isBefore(alarmtime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                int hours = now.getHour();
                int minutes = now.getMinute();
                int seconds = now.getSecond();

                System.out.printf("\r%02d:%02d:%02d", hours, minutes, seconds);
            }
            catch (InterruptedException e) {
                System.out.println("Thread was interrupted");
            }
        }

        System.out.println("\n *ALARM NOISE* ");
        playSound(filepath);

        // metodo 1: ao inves de musica toca um beep
        //Toolkit.getDefaultToolkit().beep();
    }
    // metodo 2: toca a musica
    private void playSound(String filepath){

        File audioFile = new File(filepath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press *ENTER* to stop the alarm: ");
            scanner.nextLine();
            clip.stop();

            scanner.close();
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file format is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch(IOException e){
            System.out.println("Error reading audio file");
        }

    }
}
