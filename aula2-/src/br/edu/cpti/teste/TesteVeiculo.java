package br.edu.cpti.teste;

import br.edu.cpti.model.Caminhao;
import br.edu.cpti.model.VeiculoPasseio;

public class TesteVeiculo {
	
	
	
	public static void main(String[] args) {
		
		
		Caminhao c1 = new Caminhao();
		
		c1.setPlaca("KLI-8909");
		c1.setChassi("234343434");
		c1.setCargaMaxima(10500.);
		c1.setValor(55000.);
	
		VeiculoPasseio v1 = new VeiculoPasseio ();
		
		System.out.println("IPVA Caminhão: "+ c1.calcularIPVA());
		
		v1.setPlaca("hyu-9090");
		v1.setChassi("3433567");
		v1.setValor(15000.);
		
		System.out.println("IPVA veiculo de passeio: "+ v1.calcularIPVA());
	}
	
	
	
	

}
