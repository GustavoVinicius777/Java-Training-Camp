import java.util.Scanner;

public class MathClass{
    public static void main(String[] args){

        //print the number pi (the first 16)
        //System.out.println(Math.PI);

        //print the number e de euler (the first 16)
        //System.out.println(Math.E);

        //double result;

        //eleva a potencia, por exemplo 2 elevado a 3 é igual a 8, pq 2x2=4(2) e 4x2=8(3)
        //result = Math.pow(2, 3);

        //gives you the number positive if its negative
        //abs = absolute
        //result = Math.abs(-5);

        //square route
        //result = Math.sqrt(8);

        //round (gives you the nearest integer number)
        //result = Math.round(3.94);

        //like the round (transform in a integer) but always gives you the up number
        //result = Math.ceil(3.14);

        //the opposite of the ceil (always gives you the down number)
        //result = Math.floor(3.94);

        //always gives you the greater number or variable
        //result = Math.max(10, 30);

        //the opposite of the max, now always gives you the lowest number beside those 2
        //result = Math.min(10, 30);

        //HYPOTENUSE c = Math.sqrt( a2 + b2 )
        Scanner hy = new Scanner(System.in);


/*
        double a;
        double b;
        double c;

        System.out.print("enter the value of the a side: ");
        a = hy.nextDouble();

        System.out.print("enter the value of the b side: ");
        b = hy.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) );

        System.out.print("The value of the Hypotenuse is: " + c);
*/

        double radius;
        double circumference;
        double volume;
        double area;

        System.out.print("enter the radius: ");
        radius = hy.nextDouble();

        circumference = 2 * Math.PI * radius;

        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.printf("the circumference is: %fCM" + circumference);
        System.out.printf("the area is: %fCM²" + area );
        System.out.printf("the volume is: %.1fCM³" + volume );



        hy.close();
    }
}
