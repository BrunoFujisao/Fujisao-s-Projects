import java.util.Scanner;
public class TimeMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Digite um número de acordo com a necessidade");
		System.out.println("1- Cadastrar o clube");
		System.out.println("2- Cadastrar jagador");
		System.out.println("3- Remover jagador");
		System.out.println("4- Checar tamanho do elenco");
		System.out.println("5- Adicionar cartão");
		System.out.println("6- Checar quantidade de suspensos");
		System.out.println("7- Checar quantidade total de cartões recebidos");
		opcao = sc.nextInt();
		
		Time time = new Time();
		
		switch(opcao) {
		
		case 1: 
			
			System.out.println("Digite o nome do time");
			String nomeTime = sc.nextLine();
			
			time.setNome(nomeTime);
			
			break;
			
		case 2: 
			
			int cadastrarJogador = 0;
			
			do {
				
				System.out.println("Digite o nome do jogador");
				String nome = sc.nextLine();
				
				System.out.println("Digite o número da camisa do jogador");
				int numero = sc.nextInt();
				sc.nextLine();
				
				System.out.println("Digite o apelido do jogador");
				String apelido = sc.nextLine();
				
				time.adicionarJogador(new Jogador(nome,numero,apelido));
				
				System.out.println("Deseja cadastrar mais jogadores?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				cadastrarJogador = sc.nextInt();
				sc.nextLine();
				
			}while (cadastrarJogador == 1);
			
			break;
			
		case 3:
			
			int opcaoSwitch = 0;
			
			do {

				System.out.println("Digite o nome do jogador que deseja remover");
				String jogadorRemover = sc.nextLine();
				
				time.removerJogador(jogadorRemover);
				
				System.out.println("Deseja remover mais jogadores?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoSwitch = sc.nextInt();
				sc.nextLine();
				
			} while(opcaoSwitch == 1);
			
			
			break;
			
		case 4:
			
			System.out.println("O número de jogadores é: "+ time.retornarQuantidadeJogadores());
			
			break;
			
		case 5:
			
			do {
				
				System.out.println("Digite o número do jogador para adicionar cartão");
				int numeroCartao = sc.nextInt();
				
				time.adicionarCartao(numeroCartao);
				
				System.out.println("Deseja adicionar mais cartões?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoSwitch = sc.nextInt();
				sc.nextLine();
				
			} while(opcaoSwitch == 1);
			
			break;
			
		case 6:
			
			System.out.println("A quantidade de jogadores suspensos é: "+ time.retornarQuantidadeJogadoresSuspensos());
			
			break;
			
			
		case 7:
			
			System.out.println("A quantidade de cartões recebidos pelo time é: "+ time.quantidadeCartoesTime());
			
			break;
			
		default: 
			
			System.out.println("Opcão Inválida.");
			
		}
		
		System.out.println("Obrigado por usar nossa aplicação");
			
	}

}
