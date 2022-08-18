package br.edu.cpti.model;

public class ImpostoRenda {
	
	
	protected String nome;
	protected double rendimento;
	
	public ImpostoRenda(String nome, double rendimento) {
		super();
		this.nome = nome;
		this.rendimento = rendimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	
	
	

}
