import java.util.Scanner;

public class messingaround {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);

        double userinput1;
        double userinput2;
        double userinput3;

        double answer;

        System.out.print("Que tipo de operação deseja fazer: 1[adição], 2[subtração], 3[divisão], 4[multiplicação]: ");
        userinput1 = teste.nextDouble();

        if(userinput1 == 1){
            System.out.print("por favor escolha o primeiro numero para a adição: ");
            userinput2 = teste.nextDouble();

            System.out.print("por favor escolha o segundo numero para a adição: ");
            userinput3 = teste.nextDouble();

            answer = userinput2 + userinput3;

            System.out.print("o resultado da adição é: " + answer);
        }

        else if(userinput1 == 2){
            System.out.print("por favor escolha o primeiro numero para a subtração: ");
            userinput2 = teste.nextDouble();

            System.out.print("por favor escolha o segundo numero para a subtração: ");
            userinput3 = teste.nextDouble();

            answer = userinput2 - userinput3;

            System.out.println("o resultado da sua subtração é: " + answer);
        }

        else if(userinput1 == 3){
            System.out.print("por favor escolha o primeiro numero para a divisão: ");
            userinput2 = teste.nextDouble();

            System.out.print("por favor escolha o segundo numero para a divisão: ");
            userinput3 = teste.nextDouble();

            answer = userinput2 / userinput3;

            System.out.println("a resposta da sua divisão é: " + answer);
        }

        else if(userinput1 == 4){
            System.out.print("por favor escolha o primeiro numero para a multiplicação: ");
            userinput2 = teste.nextDouble();

            System.out.print("por favor escolha o segundo numero para a multiplicação: ");
            userinput3 = teste.nextDouble();

            answer = userinput2 * userinput3;

            System.out.println("a resposta da sua multiplicação é " + answer);
        }
        else{
            System.out.print("Alguma coisa deu errado por favor tente novamente: ");
        }

        teste.close();
    }
};