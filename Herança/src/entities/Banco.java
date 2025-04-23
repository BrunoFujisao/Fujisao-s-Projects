package entities;
import java.util.ArrayList;

public class Banco {
	
	private static final ContaPoupanca Conta = null;
	private ArrayList <Conta> listaContas;
	
	public Banco() {
		
		listaContas = new ArrayList<>();
	}
	

    public void adicionarConta(Conta conta) {
       listaContas.add(conta);
       
    }
    
    public void imprimirDados(String numero) {
    	boolean encontrado = false;
    	
    	for (Conta c: listaContas) {
    		
    		if(c.getNumero().contains(numero)) {
    			
    			System.out.println(c.toString());
    			
    			encontrado = true;
    		}
    	}
    	
    	if(!encontrado){
    		
    		System.out.println("Conta não encontrada");
 
    	}
    }
    
    public void sacar(double valor, String numero) {
    	boolean encontrado = false;
    	
    	for(Conta c : listaContas) {
    		
    		if(c.getNumero().equals(numero)) {
    			
    			c.sacar(valor, numero);
    			
    			encontrado = true;
    			
    			return;
    		}
    	}
    	
    	if(!encontrado) {
    		
    		System.out.println("Conta não encontrada");
    	}
    	
    }
    
    public void depositar(double valor, String numero) {
    	boolean encontrado = false;
    	
    	for(Conta c : listaContas) {
    		
    		if(c.getNumero().equals(numero)) {
    			
    			c.depositar(valor,numero);;
    			
    			encontrado = true;
    			
    			return;
    			
    		}
    	}
    	
    	if(!encontrado) {
    		
    		System.out.println("Conta não encontrada");
    	}
    	
    }
    
    public void checarRendimento(String numero) {
    	
        for (Conta c : listaContas) {
        	
            if (c.getNumero().equals(numero)) {
            	
                if (c instanceof ContaPoupanca) {
                	
                    ContaPoupanca poupanca = (ContaPoupanca) c;
                    double rendimento = poupanca.rendimento(); 
                    
                    System.out.printf("Rendimento estimado da conta %s: R$ %.2f%n", numero, rendimento);
                    
                } else {
                	
                    System.out.println("Essa conta não é uma conta poupança.");
                    
                }
                
                return;
            }
        }
        
        System.out.println("Conta não encontrada.");
    }
    
    
}
