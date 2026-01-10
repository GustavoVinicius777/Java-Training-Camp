package trezeatedezoito;

public class aaaavariableScope {

    static int x = 3; // class

    static void main(String[] args) {
        // variable scope = where a variable can be accessed

        int x = 1; //local

        System.out.println(x);

        dosomething();
    }
        static void dosomething(){

        int x = 2; //local

        System.out.println(x);
    }
}
