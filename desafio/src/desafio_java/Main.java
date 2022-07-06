package desafio_java;

public class Main {

	public static void main(String[] args) {
		Cliente rafael = new Cliente();
		rafael.setNome("Rafael");
		rafael.setCpf(999);
		
		Conta cc = new ContaCorrente(rafael);
		cc.depositar(100);
		
		
		Conta poupanca = new ContaPoupanca(rafael);
			
		cc.transferir(51, poupanca);
		
		Conta universitaria = new ContaUniversitaria(rafael);
		universitaria.depositar(300);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		universitaria.imprimirExtrato();
	}

}
