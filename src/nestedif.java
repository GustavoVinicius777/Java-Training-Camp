import java.util.Scanner;

public class nestedif {
    static void main(String[] args){
        Scanner teste = new Scanner(System.in);

        boolean isStudent = false;
        boolean isSenior = true;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                System.out.println("You get a Senior discount of 20%.");
                System.out.printf("You also get a student discount of 10 percent %.2f", price);
                price *= 0.7;
            }
            else{
                System.out.printf("You get a student discount of 10 percent %.2f \n", price);
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.printf("You get a Senior discount of 20 percent %.2f", price);
                price *= 0.8;
            }
            else{
                price *= 1;
            }
        }

      //System.out.println("The price of a ticket is: R$ " + price);
        System.out.printf("The price of a ticket is: R$ %.2f", price);

        teste.close();
    }
}
