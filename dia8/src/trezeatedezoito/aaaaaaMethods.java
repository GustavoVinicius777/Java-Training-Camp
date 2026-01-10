package trezeatedezoito;

public class aaaaaaMethods {
    static void main(String[] args) {

        // method = a block of a reusable code that is executed when called ()

        // first example

        /*
        String name = "gustavo";
        int age = 25;

        happybirthday(name, age);
        happybirthday(name, age);
        happybirthday(name, age);
    }
    static void happybirthday(String name, int age){
        System.out.println("Happy birthday to you!" );
        System.out.printf("Happy birthday dear %s! \n", name);
        System.out.printf("You are %d years old! \n", age);
        System.out.println("Happy birthday to you! \n");
        */

        //double result = square(3);
        //System.out.println(result);

        //System.out.println(cube(3));

        //String fullname = getfullname("Gustavo", "Vinicius");
        //System.out.println(fullname);

        int age = 21;

        if(agecheck(age)){
            System.out.println("You may sign up!");
        }
        else{
            System.out.println("You have to be 18 or plus to sign up!");
        }

    }
        static void happybirthday(String name, int age){}
        static double square(double number){return number * number;}
        static double cube(double number){return number * number * number; }
        static String getfullname(String first, String last){return first + " " + last;}
        static boolean agecheck(int age){
            if(age >= 18){
                return true;
            }
            else{
                return false;
            }
    }
}
