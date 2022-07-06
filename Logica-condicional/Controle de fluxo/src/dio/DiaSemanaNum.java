package dio;

public class DiaSemanaNum {

    public static void obterNum(String dia) {
        switch (dia) {
            case "Domingo":
                System.out.println(1);
                break;
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case"Quarta":
                System.out.println(4);
            case "Quinta":
                System.out.println(5);
            case "Sexta":
                System.out.println(6);
            case "Sábado":
                System.out.println(7);
        }
    }
}
