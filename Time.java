import java.util.ArrayList;
public class Time {
	private ArrayList <Jogador> jogadores;
	private String nome;
	
	
	public Time() {
		
		this.jogadores = new ArrayList<>();
	}


	public Time(String nome) {
		
		this.jogadores = new ArrayList<>();
		this.nome = nome;
	}
	
	public void adicionarJogador(Jogador jogador) {
		
		jogadores.add(jogador);
	}


	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}


	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void removerJogador(String nome) {
		
		boolean removida = false;
		
		for(int contador = 0; contador < jogadores.size(); contador++) {
			
			if(jogadores.get(contador).getNome().equals(nome)) {
				
				jogadores.remove(contador);
				
				removida = true;
			
			} 
		}
		
		if (removida) {
			
			System.out.println("Jogador removido com sucesso");
			
		} else {
			
			System.out.println("Não conseguimos achar o jogador");
			
		}
	}
	
	public int retornarQuantidadeJogadores() {
		
		return jogadores.size();
	}
	
	public int retornarQuantidadeJogadoresSuspensos() {
		int qtdSuspensos = 0;
		
		for(Jogador j : jogadores) {
			
			if(j.isSuspenso() == true) {
				
				qtdSuspensos++;
			}
			
		}
		
		return qtdSuspensos;
	}
	
	public int quantidadeCartoesTime() {
		int somatoriaCartoes = 0;
		
		for(Jogador pau : jogadores) {
			
			somatoriaCartoes += pau.getCartoes();
		
		}
		
		return somatoriaCartoes;
	}
	
	public void adicionarCartao(int numeroJogador) {
		
		for(Jogador j : jogadores) {
			
			if(j.getNumero() == numeroJogador) {
				
				j.setCartoes(j.getCartoes() + 1);
			}
		}
	}
}
