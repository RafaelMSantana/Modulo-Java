package dio;

import java.util.Scanner;

public class Ex_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        while(true) {
            System.out.println("Nota: ");
            nota = scan.nextInt();


            if(nota >=0 && nota <=10) break;
            else {System.out.println("Valor inválido");}
        }
        System.out.println("Saiu do laço");
    }
}
