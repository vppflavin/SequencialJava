package flavioteste.company;

import java.util.Scanner;

public class exercicio3 {
    public static void main (String[] args){
        //Faça um Programa que peça dois números e imprima a soma.
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite dois números: ");
        int var1, var2, result;
        var1 = scanner.nextInt();
        var2 = scanner.nextInt();
        result = var1 + var2;

        System.out.println(" A soma dos dois números é: " +result);
    }
}
