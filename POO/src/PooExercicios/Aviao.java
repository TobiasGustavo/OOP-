package PooExercicios;

public class Aviao {

		private String fabricante;
		private String modelo;
		private int ano;
		
		
			void liga( ) {
				System.out.println("Ligando os motores...");
			}
			void acelera( ) {
				System.out.println("\nO avião está acelerando...");
			}
			void decola( ) {
				System.out.println("\nO avião está decolando...");
			}
			public String getFabricante() {
				return fabricante;
			}
			public void setFabricante(String fabricante) {
				this.fabricante = fabricante;
			}
			public String getModelo() {
				return modelo;
			}
			public void setModelo(String modelo) {
				this.modelo = modelo;
			}
			public int getAno() {
				return ano;
			}
			public void setAno(int ano) {
				this.ano = ano;
			}
			
	}
		
	
	
