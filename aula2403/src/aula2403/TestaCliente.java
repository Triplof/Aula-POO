package aula2403;

public class TestaCliente {

	public static void main(String[] args) {
		//construir o objeto
		Cliente a = new Cliente("Felipe","41268544754");
		
		//imprimir
		System.out.println("-------------");
		System.out.println("NOME: " + a.getNomeCliente());
		System.out.println("CPF: " + a.getCpfCliente());
		System.out.println("-------------");
		
	}

}
