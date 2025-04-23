package entities;

public class ContaCorrente extends Conta {
	
	  private static final double taxaSaque = 2.5;
	  
	  public ContaCorrente() {
		  
		  
	  }
	  
	public ContaCorrente(String nome, String dataNascimento, String cpf, double senha) {
		super(nome, dataNascimento, cpf, senha);
	}

	@Override
	public void sacar(double valor, String numero) {
		  
		  if (valor * taxaSaque / 100 + valor > saldo) {
			  
			  System.out.println("Saldo Insuficiente!");
			  
			  
		  } else {
			  
			  saldo -= valor * taxaSaque / 100 + valor;
		  }
	  }
	
	@Override
	public void depositar(double valor, String numero) {
		
		saldo += valor;
		
		System.out.println("Depósito realizado com sucesso");
	}
	

	
}
