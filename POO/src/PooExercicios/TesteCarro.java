package PooExercicios;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
	Carro novoCarro = new Carro();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do carro: ");
		novoCarro.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do carro: ");
		novoCarro.setModelo(leia.next());
		
		System.out.println("Digite o ano do carro: ");
		novoCarro.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("\nFabricante: " + novoCarro.getFabricante());
		System.out.println("\nModelo: " + novoCarro.getModelo());
		System.out.println("\nAno: " + novoCarro.getAno());
		
	    novoCarro.liga();
	    novoCarro.acelera();
	    novoCarro.freia();
		leia.close();


	}

}

