package br.edu.cpti;

public class TesteAluno {

	public static void main(String[] args) {
	
		
	Aluno  aluno1 = new Aluno();
	
	
	aluno1.nome = "Joaquim";
	aluno1.telefone = "2245-1099";
	aluno1.email = "joaquim@gmail.com";

    System.out.println("Nome do Aluno: "+ aluno1.nome);
      //System.out.println("Telefone do Aluno: "+ aluno1.telefone);
	//	System.out.println("Email do Aluno: "+ aluno1.email);

	
      Aluno aluno2 = new Aluno();		
      Aluno aluno3 = new Aluno();		
      Aluno aluno4 = aluno3;
      
      
      
      
      if(aluno2 == aluno3) {
    	  
    	  System.out.println("São iguais");
    	  
      }
      else {
    	  
    	  
    	  System.out.println("Diferentes");
    	  
    	  
      }
		
	}

}
