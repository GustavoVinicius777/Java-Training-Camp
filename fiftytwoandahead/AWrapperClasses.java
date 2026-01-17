package fiftytwoandahead;

public class AWrapperClasses {
    static void main(String[] args){

        // Wrapper Classes = Allow primitive values (int, char, double, boolean)
        //                   To be used as objects. "Wrap them in an object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Collections Framework and static Utility Methods.

        /*
        // Showing an example.
        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
         int w = a;
         double x = b;
         char y = c;
         boolean z = d;

        */

        //+++++++++++++++++++++++++++++++++++

        /*
        // convert a primitive datatype to a string
        String a = Integer.toString(12);
        String b = Double.toString(3.14);
        String c = Character.toString('$');
        String d = Boolean.toString(false);

        String x = a + b + c + d;
        */

        /*
        int a = Integer.parseInt("123");
        double b = Double.parseDouble("3.14");
        char c = "Pizza".charAt(0); // uses charat (who is not related to wrapper) because does not have a parse method
        boolean d = Boolean.parseBoolean("true");
        */

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));
    }
}
