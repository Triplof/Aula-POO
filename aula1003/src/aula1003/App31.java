package aula1003;

import java.util.Scanner;

public class App31 {
	
	//Entre com um nr. e informe quantas vezes ele se repete
	
	// some os valores do vetor
	public static void main(String[] args) {
		
		//entrada de dados
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = sc.nextInt();
		
		int contador = 0;
				
		int valor[] = {10,47,78,99,7,4,5,8,9,67,42,47,76,61,44,24,38};
		
		for(int i=0; i<valor.length; i++) {
			 if (numero == valor[i]) {
				 contador += 1;
			 }
			
		}
			System.out.println("Seu numero aparece: " + contador);
	}

}
