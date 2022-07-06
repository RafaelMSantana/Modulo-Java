package dio;

import java.util.Random;

public class Ex_Multi {
    public static void main(String[] args) {
        Random randomNums  = new Random();

        int [] [] M = new int [4][4];

        for (int count = 0; count < M.length; count++) {
            for (int count2 = 0; count2 < M[count].length; count2++) {
                M[count][count2] = randomNums.nextInt(9);
            }
        }
        System.out.println("Matriz");
        for ( int [] linha: M ) {
            for (int coluna: linha ) {
                System.out.println(coluna + " ");
            }
            System.out.println();

        }
    }

}
