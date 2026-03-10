package aula1003;

public class App3 {
	
	// some os valores do vetor
	public static void main(String[] args) {
		int valor[] = {10,47,78,99,7,4,5,8,9,67,42,47,76,61,44,24,38};
		int soma = 0;
		for(int i=0; i<valor.length; i++) {
			 soma += valor[i];
			
		}
			System.out.println("Sua soma é: " + soma);
	}

}
