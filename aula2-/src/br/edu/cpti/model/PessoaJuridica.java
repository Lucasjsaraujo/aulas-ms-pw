package br.edu.cpti.model;

public class PessoaJuridica extends ImpostoRenda{
	
	
	private String cnpj;

	public PessoaJuridica(String nome, double rendimento, String cnpj) {
		super(nome, rendimento);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double calcularImposto() {
		
	return	this.rendimento * 0.22;
		
		
	}
	

}
