package poliformismo1;

public abstract class Pessoa {
	protected String nome;
	protected double rendaAnual;
	
	public Pessoa() {
		
		
	}

	public Pessoa(String nome, double rendaAnual) {
		
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}
	
	public abstract void calcularImposto();
	
	public String toString() {
		return "Pessoa [nome=" + nome + ", rendaAnual=" + rendaAnual + "]";
	}
}
