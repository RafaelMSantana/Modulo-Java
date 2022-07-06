package dio;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Ex_Consoantes {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i;

        String letra;

        String []vetor = new String[6];

        int contCons = 0;

        for (i = 0; i < 6; i++) {

            System.out.println("Digite uma letra: ");
            letra = scan.next();
            if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e")
            | letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o")
            | letra.equalsIgnoreCase("u"))) {
                contCons += 1;
                vetor[i] = letra;
            }

            } for (String consoante : vetor) {
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + contCons);
    }
}
