package dio;

import java.util.Scanner;

public class Ex_Par_Impar {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num;
        int pares = 0;
        int impares = 0;
        int qNum;
        int count = 0;

        System.out.println("Quer digitar quantos números? ");
        qNum = scan.nextInt();
        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();
            if (num % 2 == 0) pares += 1; else impares += 1;
            count++;

        } while (count < qNum);

        System.out.println("Foram informados " + pares + " números pares e " + impares + " ímpares");
    }

}
