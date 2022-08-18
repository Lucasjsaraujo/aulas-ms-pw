package br.edu.cpti.model;

import java.time.LocalDate;


public class Produto{
	
	private int codigo;
	private String descricao;
	private double valor;
	private LocalDate dataCadastro;
	
	
	
	public Produto() {
		
	}
	
	
	
	public Produto(int codigo, String descricao, double valor, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.dataCadastro = dataCadastro;
	}
	
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

}
