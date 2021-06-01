package flavioteste.company;

import java.util.Scanner;

public class exercicio8 {
    public static void main (String[] args){
//Faça um Programa que pergunte quanto você ganha por hora e o número
// de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        System.out.println("Digite quanto ganha por hora: ");
        Scanner scanner = new Scanner(System.in);
        float gPh, hTm, finnalMes;
        gPh = scanner.nextFloat();

        System.out.println("Digite as horas trabalhadas no mês: ");
        hTm = scanner.nextFloat();

        finnalMes = gPh * hTm;

        System.out.println(" Você deve receber R$" +finnalMes + " por seu trabalho no referido mês." );


    }
}
