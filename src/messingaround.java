import java.util.Scanner;

//feito sem tutorial totalmente de cabeça.
//dia: 25/12/2025

public class messingaround {
    public static void main(String[] args){
        Scanner teste = new Scanner(System.in);

        double x;
        double y;
        int resp;
        double z1;
        double z2;
        double z3;
        double z4;

        System.out.print("escolha o primeiro numero para sua conta: ");
        x = teste.nextDouble();
        
        System.out.print("escolha o segundo numero para a sua conta: ");
        y = teste.nextDouble();

        z1 = x + y;
        z2 = x - y;
        z3 = x * y;
        z4 = x / y;
        
        System.out.print("que tipo de conta gostaria de fazer: [1] adição, [2] subtração, [3] multiplicação, [4] divisão: ");
        resp = teste.nextInt();
        
        if(resp == 1){
            System.out.println("o resultado da sua adição é: " + z1);
        }
        else if(resp == 2){
            System.out.println("o resultado da sua subtração é: " + z2);
        }
        else if(resp == 3){
            System.out.println("o resultado da sua multiplicação é: " + z3);
        }
        else if(resp == 4){
            System.out.println("o resultado da sua divisão é: " + z4);
        }
        
        teste.close();
    }
}
