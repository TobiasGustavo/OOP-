package PooExercicios;

import java.util.Scanner;

public class TesteAviao {

	public static void main(String[] args) {
		Aviao novoAviao = new Aviao();
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o fabricante do avião: ");
		novoAviao.setFabricante(leia.next());
		
		System.out.println("Digite o modelo do avião: ");
		novoAviao.setModelo(leia.next());
		
		System.out.println("Digite o ano do avião: ");
		novoAviao.setAno(leia.nextInt());
		System.out.println();
		
		System.out.println("Fabricante: " + novoAviao.getFabricante());
		System.out.println("Modelo: " + novoAviao.getModelo());
		System.out.println("Ano: " + novoAviao.getAno());
		System.out.println();
		
	    novoAviao.liga();
	    novoAviao.acelera();
	    novoAviao.decola();
		leia.close();

	}

}

