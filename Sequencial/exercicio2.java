package flavioteste.company;

import java.util.Scanner;

public class exercicio2 {
    public static void main (String[] args){
        // Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        Scanner scanner = new Scanner(System.in);
        int variavel;

        System.out.println(" Digite um número: ");
        variavel = scanner.nextInt();

        System.out.println(" O número informado foi: " +variavel);

    }
}
