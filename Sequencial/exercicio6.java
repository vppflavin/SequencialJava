package flavioteste.company;

import java.util.Scanner;

public class exercicio6 {
    public static void main (String[] args){
        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        Scanner scanner = new Scanner (System.in);

        System.out.println(" Escreva o valor do raio: ");
        double raio, area;
        raio = scanner.nextDouble();

        System.out.println(" O valor da área é: ");
        area = 3.14 * (raio * 2);
        System.out.print(area);


    }
}
