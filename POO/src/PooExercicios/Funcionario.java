package PooExercicios;

public class Funcionario {
	
	private String nome;
	private String sexo;
	private int idade;
	
	void trabalhando( ) {
		System.out.println("O funcionário está trabalhando...");
	}
	void comendo( ) {
		System.out.println("O funcionário está almoçando...");
	}
	void reclamando( ) {
		System.out.println("O funcionário está reclamando...");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

}

