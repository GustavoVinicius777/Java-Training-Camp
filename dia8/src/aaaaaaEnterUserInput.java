import java.util.Scanner;

public class aaaaaaEnterUserInput {
    // Into an Array
    static Scanner teste = new Scanner(System.in);

    static void main(String[] args){

        //foods[0] = "Pizza";
        //foods[1] = "Hamburguer";
        //foods[2] = "Macarrão";

        String[] foods;
        int size;

        System.out.print("What the # of food you want?: ");
        size = teste.nextInt();
        teste.nextLine();

        foods = new String[size];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = teste.nextLine();
        }

        for(String food : foods){
            System.out.println(food);
        }

        //System.out.println(foods);
        teste.close();
    }
}
