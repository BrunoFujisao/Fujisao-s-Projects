package poliformismo1;

public class PessoaJuridica extends Pessoa{
	
	protected int numeroFunc;
	
	public PessoaJuridica() {
		
		
	}
	
	public PessoaJuridica(String nome, double rendaAnual, int numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}
	
	public int getNumeroFunc() {
		return numeroFunc;
	}

	public void setNumeroFunc(int numeroFunc) {
		this.numeroFunc = numeroFunc;
	}

	@Override
	public void calcularImposto() {
		double impostoPagar = 0;
		
		if(this.numeroFunc > 10) {
			
			impostoPagar = this.rendaAnual * 0.14;
			
		} else {
			
			impostoPagar = this.rendaAnual * 0.16;
		}
		
		System.out.println("O valor a se pagar de imposto é: "+ impostoPagar);
		
	}

}
