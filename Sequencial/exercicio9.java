package flavioteste.company;

import java.util.Scanner;

public class exercicio9 {
    public static void main (String[] args){
        float f;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Coloque a temperatura em Fahrenheit ");
        f = scanner.nextFloat();

        System.out.println(" A temperatura em Celsius fica: " + 5 * ((f-32 / 9)));
    }
}
