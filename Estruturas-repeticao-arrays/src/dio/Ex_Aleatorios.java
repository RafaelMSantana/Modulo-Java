package dio;

import java.util.Random;

public class Ex_Aleatorios {
    public static void main(String[] args) {
        Random randomNums = new Random();

        int [] vetor = new int[20];

        for (int count = 0; count < vetor.length; count++) {
            vetor[count] = randomNums.nextInt(101);
            int consequente = (Integer.parseInt(String.valueOf(vetor[count])) + 1);
            System.out.println(vetor[count] + " , " + consequente);
        }
    }
}
