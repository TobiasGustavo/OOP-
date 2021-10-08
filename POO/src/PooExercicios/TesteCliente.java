package PooExercicios;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente novoCliente = new Cliente();
		
		novoCliente.setNome("*******");
		novoCliente.setCpf("***************" );
		novoCliente.setIdade(0);
		novoCliente.setCidade("********");
		novoCliente.setEstado("********");
		
		System.out.println(novoCliente.getNome());	
		System.out.println(novoCliente.getCpf());
		System.out.println(novoCliente.getIdade());
		System.out.println(novoCliente.getCidade());
		System.out.println(novoCliente.getEstado());
		
		novoCliente.compra();
		
		novoCliente.paga();
		
		novoCliente.come();

	}

}
	
	
