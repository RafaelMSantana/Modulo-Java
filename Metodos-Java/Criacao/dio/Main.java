package dio;

public class Main {
    public static void main(String[] args) {
        // Calculadora:

        System.out.println("Exercício calculadora");
        Calculadora.soma(3, 56);
        Calculadora.subtracao(54, 46);
        Calculadora.multiplicacao(3, 6);
        Calculadora.divisao(4, 3);

        // Mensagem:

        System.out.println("Exercício mensagens:");
        Mensagens.obterMensagem(11);
        Mensagens.obterMensagem(13);
        Mensagens.obterMensagem(20);

        // Empréstimo:

        System.out.println("Exercício empréstimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
