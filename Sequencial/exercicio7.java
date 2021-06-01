package flavioteste.company;
import java.util.Scanner;

public class exercicio7 {
    public static void main (String[] args){
        //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Informe o lado do quadrado: ");
        float lado = 0, area, dobro;
        
        area = lado * lado;
        System.out.println(" A área do quadrado é: " +area);

        dobro = area * 2;
        System.out.println(" O dobro da área do quadrado é: " +dobro);


    }
}
