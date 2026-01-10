package trezeatedezoito;

public class aArray {
    static void main(String[] args){

        // array = a collection of values of the same data type
        //         * think of it as a variable that can store more than 1 value *

        String[] fruits = {"Apple", "orange", "banana", "coconut"};

        // fruits[0] = "pineapple";
        //int numoffruits = fruits.length;

        //System.out.println(numoffruits);

        /*
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
        */

        //Arrays.sort(fruits);

        //Arrays.fill(fruits, "pineapple");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
