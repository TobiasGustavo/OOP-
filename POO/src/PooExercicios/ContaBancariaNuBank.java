package PooExercicios;

public class ContaBancariaNuBank {

	
	//Crie uma classe conta bancaria e apresente os atributos e métodos referentes
	//esta classe, em seguida crie um objeto conta bancaria, 
	//defina as instancias deste objeto e apresente as 
	//informações deste objeto no console.
	
	
	private String nome, endereco, email, documentoIdentidade, ocupacao, foto;
	private double credito = 0.0;
	
	    public String getNome() {
		return nome;
	
	}
	
	    public void setNome(String nome) 	    {
	    	this.nome = nome;
	    }
	    public String getendereco()		        {
	    	return endereco;
	    }
	    public String email()                   {
	    	return email;
	    }
	    public String getDocumentoIdentidade()  {
	    	 return documentoIdentidade;
	    }
	    public String ocupacao()                {
	    	  return ocupacao;
	    }
	    public String foto()					{
	    	  return foto;
	    }

		public double getCredito() {
			return credito;
		}

		public void setCredito(double credito) {
			this.credito = credito;
		}
	    
	    	
}
