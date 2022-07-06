package dio;

public class Mes {

        public static void nomeMes(int n1) {
            if (n1 == 2) {
                System.out.println("Fevereiro");
            } else if (n1 == 3) {
                System.out.println("Março");
            } else if (n1 == 4) {
                System.out.println("Abril");
            } else if (n1 == 5) {
                System.out.println("Maio");
            } else if (n1 == 6) {
                System.out.println("Junho");
            } else if (n1 == 8) {
                System.out.println("Agosto");
            } else if (n1 == 9) {
                System.out.println("Setembro");
            } else if (n1 == 10) {
                System.out.println("Outubro");
            } else if (n1 == 11) {
                System.out.println("Novembro");
            } else if (n1 == 1 || n1 == 7 || n1 == 12) {
                System.out.println("Férias");
            } else {
                System.out.println("Mês inválido");
            }
        }
    }

