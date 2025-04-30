package poliformismo1;
import java.util.ArrayList;

public class ListaPessoas {
	protected ArrayList<Pessoa> listaPessoas;
	
	public ListaPessoas() {
		
		listaPessoas = new ArrayList<>();
		
	}
	
	public void adicionarPessoas(Pessoa p) {
		
		listaPessoas.add(p);
	}
	
	public void calcularImposto() {
		
		for(Pessoa p: listaPessoas) {
			
			p.calcularImposto();
		}
	}
}
