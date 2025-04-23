package entities;

import java.util.ArrayList;

public class ContaPoupanca extends Conta {
	
	private static final double rendimentoMensal = 0.01;
	

	public ContaPoupanca(String nome, String dataNascimento, String cpf, double senha) {
		super(nome, dataNascimento, cpf, senha);
	}
	

	public double rendimento() {
		
		return saldo * rendimentoMensal;
	}
	
	@Override
	public void sacar(double valor, String numero) {
		
		if(saldo > valor) {
			
			saldo -= valor;
		
		} else {
			
			System.out.println("Saldo insuficiente");
		}
		
	}
	
	@Override
	public void depositar(double valor, String numero) {
		
		saldo += valor;
		
		System.out.println("Depósito realizado com sucesso");
	}

}	