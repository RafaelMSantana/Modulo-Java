package dio;

import java.util.Scanner;

public class Ex_Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int media;
        int soma = 0;

        int i = 0;

        do {
            System.out.println("Digite um número: ");
            num  = scan.nextInt();
            i ++;
            soma += num;
            if (num > maior) maior = num;
        }
        while (i < 5);


        media = soma /5;

        System.out.println("O maior número digitado foi " + maior);
        System.out.println("A média dos números é " + media);
    }

}
