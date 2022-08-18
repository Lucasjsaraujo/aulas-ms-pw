package br.edu.cpti.model;

public class PessoaFisica extends ImpostoRenda{


	protected String cpf;
	
	
	
	

	

	public PessoaFisica(String nome, double rendimento, String cpf) {
		super(nome, rendimento);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	
	public double calcularImposto() {
		
	return	this.rendimento * 0.11;
		
		
	}
	
	
	

}
