package PooExercicios;

import java.util.Scanner;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
	    Funcionario novoFuncionario = new Funcionario();
			
			
			
		System.out.println("Digite o nome: ");
			novoFuncionario.setNome(leia.next());
			
		System.out.println("Digite a sexo: ");
			novoFuncionario.setSexo(leia.next());
			
		System.out.println("Digite a idade do funcionário: ");
			novoFuncionario.setIdade(leia.nextInt());
		System.out.println();
			
		System.out.println("Nome: " + novoFuncionario.getNome());
		System.out.println("\nSexo: " + novoFuncionario.getSexo());
		System.out.println("\nIdade: " + novoFuncionario.getIdade());
		System.out.println();
		
		    novoFuncionario.trabalhando();
		    novoFuncionario.comendo();
		    novoFuncionario.reclamando();
		leia.close();

	    }

	}
