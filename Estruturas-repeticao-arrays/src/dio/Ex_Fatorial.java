package dio;

import java.util.Scanner;

public class Ex_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorado;
        int resultado = 1;
        int i;

        System.out.println("Digite um número a ser fatorado: ");
        fatorado = scan.nextInt();
        for (i = fatorado; i > 1; i--) {
            resultado *= i;
        }
        System.out.println("Fatorial de " + fatorado + " é igual a " + resultado);
    }
}
