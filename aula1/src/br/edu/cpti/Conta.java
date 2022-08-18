package br.edu.cpti;

public class Conta {
	
	//Padrão CamelCase
	private  String numeroConta;
	private Double saldo;
	
	
	
	//Métodos sem retorno

	public void deposito(Double valor) {
		
		saldo += valor;
		
		
	}
	
	public String saque(Double valor) {
		
		
		if(saldo < valor) {
			
			return "Saldo insuficiente";
		}
		
		else {
			
			saldo -= valor;
			
			return "Saque efetuado com sucesso";
			
			
			
		}
		
		
		
	}
	
	
	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	

}
