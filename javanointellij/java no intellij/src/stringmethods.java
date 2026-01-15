public class stringmethods {
    static void main(String[] args){

        String name1 = "passWord";

        int length = name1.length();
        char letter = name1.charAt(0);
        int index = name1.indexOf("v");
        int index2 = name1.lastIndexOf("s");

        //name1 = name1.toLowerCase();
        //name1 = name1.toUpperCase();
        //name1 = name1.trim();
       //name1 = name1.replace("U", "v" );

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(index2 + 1);
        //
        System.out.println(name1);
        //System.out.println(name1.isEmpty());

        /*
        if(name1.isEmpty()){
            System.out.println("Sorry you do not can continue because your name is empty :(");
        }
        else{
            System.out.println("Congratulations you fulfilled your name sir " + name1 + " you must continue with the login :)");
        }

        if(name1.contains(" ")){
            System.out.println("Your name contain a space");
        }
        else{
            System.out.println("Your name DOESN`T contain space");
        }
        */

        //Method 1.
        /*
        if(name1.equalsIgnoreCase("password")){
            System.out.println("Your name can`t be [PASSWORD], or [password] at all");
        }
        else{
            System.out.println("Hello" + name1);
        }
        */

        //Method 2.
        if(name1.equalsIgnoreCase("password")){
            System.out.println("Your name can`t be any form of the word [password] at all");
        }
        else{
            System.out.println("Hello " + name1);
        }

    }
}
