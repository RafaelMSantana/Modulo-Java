public class rodarAplicacao2 {
    public static void main(String[] args) {
        // instanciar um objeto em uma classe:
        Funcionario funcionario = new Funcionario();

        // upcastings usando classe mãe:
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // downcast:
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }

}
