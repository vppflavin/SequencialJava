package flavioteste.company;

import java.util.Scanner;

public class exercicio10 {
    public static void main (String[] args){
        float c;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Coloque a temperatura em Celsius ");
        c = scanner.nextFloat();

        System.out.println(" A temperatura em Fahrenheit fica: " + ((9*c+160)/5));
    }
}
