package doseteatéodoze;

import java.util.Scanner;

public class aaaForLoop {
    static void main(String[] args){

        // for loop = execute some code a CERTAIN amount of times

        // increasing
        /*
        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        */

        // decreasing
        /*
        for(int i = 10; i > 0; i--){
            System.out.println(i);
        }
        */

        // choosing what the size if the jumps between the numbers
        /*
        for(int i = 10; i > 0; i+= 2){
            System.out.println(i);
        }
        */

        Scanner Loops = new Scanner(System.in);

        /*
        System.out.print("Enter how many times you want to loop: ");
        int max = Loops.nextInt();

        for(int i = 1; i <= max; i++){
            System.out.println(i);
        }
        */

        System.out.println("How many seconds to countdown from?: ");
        int start = Loops.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
        }

        System.out.println("HAPPY NEW YEAR!");

        Loops.close();
    }
}