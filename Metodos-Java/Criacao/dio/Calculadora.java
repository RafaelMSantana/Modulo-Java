package dio;

public class Calculadora {

    public static void soma(double n1, double n2) {

        double resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " com " + n2 + " é igual a " + resultado);
    }

    public static void subtracao(double n1, double n2) {

        double resultado = n1 - n2;

        System.out.println("A subtração de " + n1 + " e " + n2 + " é igual a " + resultado);
    }

    public static void multiplicacao(double n1, double n2) {

        double resultado = n1 * n2;

        System.out.println("O produto de " + n1 + " e " + n2 + " é igual a " + resultado);
    }

    public static void divisao(double n1, double n2) {

        double resultado = n1 / n2;

        System.out.println("A divisão de " + n1 + " por " + n2 + " é igual a " + resultado);
    }
}
