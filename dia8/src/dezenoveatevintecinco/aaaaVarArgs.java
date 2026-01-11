package dezenoveatevintecinco;

public class aaaaVarArgs {
    static void main(String[] args){

        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array

        /*
        System.out.println(add(1, 2, 3, 4));

    }
    static int  add(int... numbers){

        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
        */

        System.out.println(average(1, 2, 3, 4, 5));

    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
