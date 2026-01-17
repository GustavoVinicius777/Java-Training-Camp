package fiftysixandahead;

import java.util.ArrayList;
import java.util.Scanner;

public class AaaAaArrayList {
    static void main(String[] args){

        // ArrayList = A resizeable array that stores objects (Autoboxing)
        //             Arrays are fixed in size, but Arraylists can change

        /*
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(1);
        list1.add(2);

        //System.out.println(list1);

        //

        ArrayList<Double> list2 = new ArrayList<>();

        list2.add(6.3);
        list2.add(4.1);
        list2.add(5.2);

        //System.out.println(list2);

        //

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        //fruits.remove(1);
        //fruits.set(0, "Pineapple");

        //System.out.println(fruits.get(2));
        //System.out.println(fruits);
        //System.out.println(fruits.size());

        Collections.sort(fruits);

        //System.out.println(fruits);
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        */

        Scanner escaner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numoffood = escaner.nextInt();
        escaner.nextLine();

        for(int i = 1; i <= numoffood; i++){
            System.out.print("Enter food number" + i + ": ");
            String food = escaner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        escaner.close();
    }
}