package aula2403;

public class TesteConta {
	
	public static void main(String[] args) {
		//construir o objeto
		Conta a = new Conta(10,"001","Felipe","023",10);
		
		//imprimir
		System.out.println("-------------");
		
		System.out.println("Agencia: " + a.getNrAgencia() + " Banco"+ a.getCodBanco());
		System.out.println("Cod do Banco: " + a.getNrConta());
		System.out.println("Titular: " + a.getTitular());
		System.out.println("Saldo: " + a.getSaldo());
		System.out.println("-------------");
		
	}

}

