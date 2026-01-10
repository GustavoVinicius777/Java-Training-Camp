package doseteatéodoze;

public class aaBreakANDcontinue {
    static void main(String[] args){

        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)


        // break example.
        /*
        for(int i = 0; i < 10; i++){

            if(i == 5){
             break;
            }
            System.out.println(i + " ");
        }
        */

        //continue example
        for(int i = 0; i < 10; i++){

            if(i == 5){
                continue;
            }
            System.out.println(i + " ");
        }

    }
}
