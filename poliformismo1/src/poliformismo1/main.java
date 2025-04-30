package poliformismo1;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ListaPessoas listaPessoas = new ListaPessoas();
		int opcaoCadastro = 0, opcaoSair = 0;
		
		do {
			
			do {
		    System.out.println("Digite um número de acordo com o tipo de pessoa que deseja cadastrar:");
		    System.out.println("1 - Pessoa Física");
		    System.out.println("2 - Pessoa Jurídica");
		    opcaoCadastro = sc.nextInt();
		    sc.nextLine();

		    if (opcaoCadastro < 1 || opcaoCadastro > 2) {
		    	
		        System.out.println("Opção inválida. Tente novamente.\n");
		        
		    }

		} while (opcaoCadastro < 1 || opcaoCadastro > 2);
		
		
		if(opcaoCadastro == 1) {
			
			System.out.println("Digite o nome da pessoa");
			String nome = sc.nextLine();
			
			System.out.println("Digite a renda anual");
			double rendaAnual = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Digite o total de gastos médicos");
			double gastosMedicos = sc.nextDouble();
			sc.nextLine();
			
			listaPessoas.adicionarPessoas(new PessoaFisica(nome,rendaAnual,gastosMedicos));
			
			do {
				
				System.out.println("Deseja continuar cadastrando?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoSair = sc.nextInt();
				
				if(opcaoSair < 1 || opcaoSair > 2) {
					
					System.out.println("Opção inválida. Tente novamente.\n");	
				}
				
			} while(opcaoSair < 1 || opcaoSair > 2);
			
			
		} else {
			
			System.out.println("Digite o nome da pessoa");
			String nome = sc.nextLine();
			
			System.out.println("Digite a renda anual");
			double rendaAnual = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Digite o número total de funcionários");
			int numeroFunc = sc.nextInt();
			sc.nextLine();
			
			listaPessoas.adicionarPessoas(new PessoaJuridica(nome,rendaAnual,numeroFunc));
			
			do {
				
				System.out.println("Deseja continuar cadastrando?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoSair = sc.nextInt();
				
				if(opcaoSair < 1 || opcaoSair > 2) {
					
					System.out.println("Opção inválida. Tente novamente.\n");	
				}
				
			} while(opcaoSair < 1 || opcaoSair > 2);
		}
		
		}while(opcaoSair != 2);
		
		listaPessoas.calcularImposto();
		
	}

}
