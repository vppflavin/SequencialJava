package flavioteste.company;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[] args){
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite 4 notas. ");
        float nota1, nota2, nota3, nota4, media;
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();
        nota4 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(" Sua média é: " +media);
    }
}
