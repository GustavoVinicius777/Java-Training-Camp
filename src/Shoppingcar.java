import java.util.Scanner;

public class Shoppingcar {

    public static void main(String[] args){
        Scanner cart = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy?: ");
        item = cart.nextLine();

        System.out.print("Whats the price of the item?: ");
        price = cart.nextDouble();

        System.out.print("How many items do you want?: ");
        quantity = cart.nextInt();

        total = price * quantity;
        System.out.println("you want to buy " + quantity + " " + item + " for " + currency + price + " each");
        System.out.println("Your total is: " + currency + total);

        cart.close();
    }
}
