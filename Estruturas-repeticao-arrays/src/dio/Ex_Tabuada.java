package dio;

import java.util.Scanner;

public class Ex_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mult;
        int i;

        System.out.println("Digite um número para mostrar sua tabuada: ");
        mult = scan.nextInt();
        for (i = 1; i < 11; i++) {
            System.out.println(mult + " x " + i + " = " + (mult * i));
        }
    }
}
