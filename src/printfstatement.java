import java.util.Scanner;

public class printfstatement {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);


        // exercise 1
        /*
        //printf = is a format used to output
        //how the format it use:
        // %[flags][width][.precision][specifier-carachter] - strictly in that order.

        String name = "Spongebob";
        char firstletter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isemployed = true;

        System.out.printf("Hello %s \n", name); // minor s is to string
        System.out.printf("Your name start with %c \n", firstletter); // minor c is to char
        System.out.printf("You are %d years old\n", age); // minor d is for integers
        System.out.printf("your height is %.2f \n", height); // minor f is for doubles
        System.out.printf("You are employed %b \n", isemployed); // minor b is for boolean

        // a example of how you can outputs the printf as much as you want
        System.out.printf("%s is %d years old, to the question if he is empolyed the answer is %b", name, age, isemployed);
        */


        // exercise 2
        /*
        // + = output a plus
        // , = comma grouping separator // useful for displaying prices
        // ( = negative numbers are enclosed in ()
        // space = display a minus if negative, space if positive

        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%+.2f \n", price1);
        System.out.printf("%.2f \n", price2);
        System.out.printf("%+.2f \n", price3);
        */


        // exercise 3
        /*
        // [width]
        // 0 = number padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%d \n", id1);
        System.out.printf("%d \n", id2);
        System.out.printf("%d \n", id3);
        System.out.printf("%d \n", id4);
        */

        teste.close();
    }
}
