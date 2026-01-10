package doseteatéodoze;

import java.util.Scanner;

public class aNestedLoops {
    static void main(String[] args){

        // nested loop = A loop inside another loop
        //               Used often with matrices or DS&A [Data Structures and Algorithms]


        // explain and first example
        /*
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */

        // a mini project using nested loops

        Scanner Loops = new Scanner(System.in);

        int rows;
        int columns;
        char symbol;

        System.out.print("Enter the # of rows: ");
        rows = Loops.nextInt();

        System.out.print("Enter the # of columns: ");
        columns = Loops.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = Loops.next().charAt(0);

        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }

        Loops.close();
    }
}
