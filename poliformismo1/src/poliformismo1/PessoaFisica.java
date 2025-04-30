package poliformismo1;

public class PessoaFisica extends Pessoa{
	protected double gastosMedicos;
	
	public PessoaFisica() {
		
		
	}
	
	public PessoaFisica(String nome, double rendaAnual, double gastosMedicos) {
		super(nome, rendaAnual);
		this.gastosMedicos = gastosMedicos;
	}
	
	public double getGastosMedicos() {
		return gastosMedicos;
	}

	public void setGastosMedicos(double gastosMedicos) {
		this.gastosMedicos = gastosMedicos;
	}

	@Override
	public void calcularImposto() {
		double impostoPagar = 0;
		
		if(this.rendaAnual < 20000.00) {
			
			impostoPagar = this.rendaAnual * 0.15;
			
			if(this.gastosMedicos != 0){
				
				impostoPagar -= (this.gastosMedicos / 2);
				
			}
			
		} else if(this.rendaAnual > 20000.00) {
			
			impostoPagar = this.rendaAnual* 0.25;
			
			if(this.gastosMedicos != 0){
				
				impostoPagar -= (this.gastosMedicos / 2);
				
			}
		} 
		
		System.out.println("O valor a se pagar de imposto é: "+ impostoPagar);
	}

	@Override
	public String toString() {
		
		return super.toString() + "PessoaFisica [gastosMedicos=" + gastosMedicos + "]";
	}
	
	
	
	
	
}
