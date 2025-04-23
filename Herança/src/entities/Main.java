package entities;
import java.util.ArrayList;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;
import entities.Banco;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int criacaoConta = 0, opcaoTermino = 0;
		Banco listaContas = new Banco();
		
		do {
		do {
		
		System.out.println("Deseja realizar qual tipo de operação?");
		System.out.println("1- Criar conta corrente");
		System.out.println("2- Criar conta poupança");
		System.out.println("3- Exibir dados da conta");
		System.out.println("4- Sacar");
		System.out.println("5- Depositar");
		System.out.println("6- Verificar rendimento");
		 criacaoConta = sc.nextInt();
		 sc.nextLine();
		 
		 if(criacaoConta < 1 || criacaoConta > 6) {
			 
			 System.out.println("Operação Inválida. Digite novamente");
		 }
		
		}while(criacaoConta < 1 || criacaoConta > 6);
		
		
		int opcaoDeposito = 0;
		switch (criacaoConta) {
		
		case 1:
			
			System.out.println("Digite o nome completo");
			String nome = sc.nextLine();
			
			System.out.println("Digite a data de nascimento");
			String dataNascimento = sc.nextLine();
			
			System.out.println("Digite o número de CPF");
			String cpf = sc.nextLine();
			
			System.out.println("Digite um senha de 6 digitos");
			double senha = sc.nextInt();
			
			
			ContaCorrente accCorrente = new ContaCorrente (nome, dataNascimento, cpf, senha);
			
			accCorrente.gerarNumeroConta();
			
			listaContas.adicionarConta(accCorrente);
			
			System.out.println("O número da conta sua conta corrente é: "+ accCorrente.getNumero());
			
			do {
				
				System.out.println("Gostaria de adicionar um saldo inicial na sua conta corrente?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoDeposito = sc.nextInt();
				
				if(opcaoDeposito < 1 || opcaoDeposito > 2) {
					
					System.out.println("Opcão Inválida. Digite novamente");
				}
				
			if(opcaoDeposito == 1) {
				
				System.out.println("Digite o valor do depósito");
				double valorDeposito = sc.nextDouble();
				
				accCorrente.setSaldo(valorDeposito);
				
		} else {
			
			break;
			
		}
			
			} while(opcaoDeposito < 1 || opcaoDeposito > 2);

		break;
		
		case 2:
			
			System.out.println("Digite o nome completo");
			nome = sc.nextLine();
			
			System.out.println("Digite a data de nascimento");
			dataNascimento = sc.nextLine();
			
			System.out.println("Digite o número de CPF");
			cpf = sc.nextLine();
			
			System.out.println("Digite um senha de 6 digitos");
			senha = sc.nextInt();
			
			ContaPoupanca accPoupanca = new ContaPoupanca(nome, dataNascimento, cpf, senha);
			
			accPoupanca.gerarNumeroConta();
			
			listaContas.adicionarConta(accPoupanca);
			
			System.out.println("O número da conta sua conta poupança é: "+ accPoupanca.getNumero());
			
			do {
				
				System.out.println("Gostaria de adicionar um saldo inicial na sua conta poupança?");
				System.out.println("1- Sim");
				System.out.println("2- Não");
				opcaoDeposito = sc.nextInt();
				
				if(opcaoDeposito < 1 || opcaoDeposito > 2) {
					
					System.out.println("Opcão Inválida. Digite novamente");
				}
				
			if(opcaoDeposito == 1) {
				
				System.out.println("Digite o valor do depósito");
				double valorDeposito = sc.nextDouble();
				
				accPoupanca.setSaldo(valorDeposito);
				
			} 
			
			} while(opcaoDeposito < 1 || opcaoDeposito > 2);
			
			break;
			
			case 3:
				
				System.out.println("Digite o número da conta");
				String numeroConta = sc.nextLine();
				
				listaContas.imprimirDados(numeroConta);
				
				break;
				
			case 4:
				
				System.out.println("Digite o valor para a ser sacado");
				double valor = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Digite o número da conta");
				String numero = sc.nextLine();
				
				listaContas.sacar(valor, numero);
				
				listaContas.imprimirDados(numero);
				
				break;
				
			case 5: 
				
				System.out.println("Digite o valor para a ser depositado");
				valor = sc.nextDouble();
				sc.nextLine();
				
				System.out.println("Digite o número da conta");
				numero = sc.nextLine();
				
				listaContas.depositar(valor, numero);
				
				break;
				
			case 6:
				
				System.out.println("Digite o número da conta");
				numero = sc.nextLine();
				
				listaContas.checarRendimento(numero);
				
				break;
					
		}
		
		System.out.println("Gostaria de realizar mais alguma operação?");
		System.out.println("1- Sim");
		System.out.println("2- Não");
		opcaoTermino = sc.nextInt();
		
		
		}while(opcaoTermino == 1);
		
		System.out.println("Obrigado por usar nossa aplicação.");
	}

}
