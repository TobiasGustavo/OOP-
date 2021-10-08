package PooExercicios;

public class Carro {

	private String fabricante;
	private String modelo;
	private int ano;
	
	void liga( ) {
		System.out.println("Ligando o carro...");
	}
	void acelera( ) {
		System.out.println("O carro está acelerando...");
	}
	void freia( ) {
		System.out.println("O carro está freiando...");
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
