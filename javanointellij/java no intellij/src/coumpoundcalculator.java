import java.util.Scanner;

public class coumpoundcalculator {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);

        // Compound interest calculator
        double principal;
        double rate;
        int timescompound;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = teste.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = teste.nextDouble() / 100; // The / 100 esta dividindo o valor do input do usuario por 100, o que
                                         // Se o usuario digitar 7 ele vai retornar 0.07

        System.out.print("Enter the # of times compounded per year: ");
        timescompound = teste.nextInt();

        System.out.print("Enter the # of years: ");
        years = teste.nextInt();

        amount = principal * Math.pow(1 + rate / timescompound, timescompound * years);

        System.out.printf("The total amount after %d is: R$ %.2f", years, amount);

        teste.close();
    }
}
