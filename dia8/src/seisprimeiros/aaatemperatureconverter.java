package seisprimeiros;

import java.util.Scanner;

public class aaatemperatureconverter {
    static void main(String[] args){
        Scanner tempo = new Scanner(System.in);

        double temp;
        double newtemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = tempo.nextDouble();

        System.out.print("You want to convert to Celsius or Fahrenheit? (C or F): ");
        unit = tempo.next().toUpperCase();

        newtemp = (unit.equals("c")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f°%s", newtemp, unit);
        //System.out.println(unit);

        tempo.close();
    }
}
