import java.util.Scanner;

public class aaaaaSearchAnArray {

    static void main(String[] args){

        Scanner teste = new Scanner(System.in);

        //int[] numbers = {1, 2, 3, 4, 5, 6};
        String[] fruits = {"Apple", "Orange", "Strawberry"};
        String target = teste.nextLine();
        //int target = 9;
        boolean isfound = false;

        for(int i = 0; i < fruits.length; i++){
            //if(target == numbers[i]){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isfound = true;
                break;
            }
        }

        if(!isfound){
            System.out.println("Element not found in the array.");

            teste.close();
        }
    }
}
