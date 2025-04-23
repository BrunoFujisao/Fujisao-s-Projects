package entities;

import java.util.Random;
import java.util.ArrayList;

public abstract class Conta {
	

    protected String nome;
    protected String dataNascimento;
    protected String cpf;
    protected double senha;
    protected String numero;
    protected double saldo;

    public Conta() {
    }

    public Conta(String nome, String dataNascimento, String cpf, double senha) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.senha = senha;

    }
    
    public Conta(String nome, String dataNascimento, String cpf, double senha, double saldo) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.senha = senha;
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getSenha() {
        return senha;
    }

    public void setSenha(double senha) {
        this.senha = senha;
    }

  
    public void depositar(double valor) {
        saldo += valor;
    }

    public abstract void sacar(double valor, String numero);
    
    public abstract void depositar(double valor, String numero);
    
    public void gerarNumeroConta() {
    	
        Random random = new Random();
        int numeroConta = random.nextInt(1_000_000);
        int digitoVerificador = random.nextInt(10);
        this.numero = String.format("%06d-%d", numeroConta, digitoVerificador);
    }

    public String toString() {
    	
        return "Conta [nome=" + nome + ", dataNascimento=" + dataNascimento + ", senha=" + senha + 
               ", numero=" + numero + ", saldo=" + saldo + "]";
    }
    
    
}
