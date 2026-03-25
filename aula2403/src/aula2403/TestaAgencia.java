package aula2403;

public class TestaAgencia {

	public static void main(String[] args) {
		// construir o objeto
		Agencia a = new Agencia("1",234);
		// imprimir
		System.out.println("-------------");
		System.out.println("AGENCIA: " + a.getNrAgencia());
		System.out.println("BANCO: " + a.getCodBanco());
		System.out.println("-------------");
	}

}
