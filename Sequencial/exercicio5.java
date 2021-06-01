package flavioteste.company;

import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args){
        // Faça um Programa que converta metros para centímetros.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite quantos metros deseja converter: ");
        int metros, centimetros;
        metros = scanner.nextInt();


        System.out.println("Metros: " +metros);

        centimetros = metros * 100;
        System.out.println("Centimetros: " +centimetros);
    }
}
