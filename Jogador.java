
public class Jogador {
	private String nome;
	private int numero;
	private String apelido;
	private int cartoes;
	private boolean suspenso;
	
	public Jogador() {
		
		
	}

	public Jogador(String nome, int numero, String apelido) {
		
		this.nome = nome;
		this.numero = numero;
		this.apelido = apelido;
		this.cartoes = 0;
		this.suspenso = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int getCartoes() {
		return cartoes;
	}

	public void setCartoes(int cartoes) {
		this.cartoes = cartoes;
	}

	public boolean isSuspenso() {
		return suspenso;
	}

	public void setSuspenso(boolean suspenso) {
		this.suspenso = suspenso;
	}
	
	public void adicionarCartao() {
		
		this.cartoes++;
	}
	
	public boolean checarSuspenso() {
		boolean suspenso = false;
		
		if(this.cartoes >= 3) {
			
			suspenso = true;
		}
		
		return suspenso;
	}
	
	public String toString() {
		return "Jogador [nome=" + nome + ", numero=" + numero + ", apelido=" + apelido + ", cartoes=" + cartoes
				+ ", suspenso=" + suspenso + "]";
	}

}


