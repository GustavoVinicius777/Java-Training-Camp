package seisprimeiros;

import java.util.Scanner;

public class aaaaaasubstrings {
    static void main(String[] args){

        // .substring() = A method used to extract a portion of a string
         //               .substring(start, end)

        Scanner teste = new Scanner(System.in);

        /*
        String email = "gustavo@gmail.com";
        String username = email.substring(0, 7);
        String domain = email.substring(8, 17);

        System.out.println(username);
        System.out.println(domain);
        */

        /*
        String email = "gustavo@gmail.com";
        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println(username);
        System.out.println(domain);
        */

        String email;

        System.out.print("Enter your email:");
        email = teste.nextLine();

        if(email.contains("@")){
            String username = email.substring(0, email.indexOf("@"));
            String domain = email.substring(email.indexOf("@") + 1);

            System.out.println("confirm that your email is: " + email );
            System.out.println("confirm the domain of your way of login: " + domain);
            System.out.println("Your nem username is: " + username);
        }
        else{
            System.out.println("Sorry brother, you have to use a valid form of login to continue, please type in an valid gmail/outlook etc. ");
        }

        teste.close();
    }
}
