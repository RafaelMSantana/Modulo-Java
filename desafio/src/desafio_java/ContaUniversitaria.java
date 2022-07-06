package desafio_java;

public class ContaUniversitaria extends Conta {

	public ContaUniversitaria(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Universitária ===");
		super.imprimirInfosComuns();
	}

}
