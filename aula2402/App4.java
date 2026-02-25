package aula2402;

import java.util.Scanner; // importa bibliotecas

public class App4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); // via teclado
		
		System.out.println("Digite seu nome: ");
		String nome = sc.next();
		
		System.out.println("Digite seu idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite seu nota: ");
		int nota = sc.nextInt();
		
		System.out.println(" Seu nome é: " + nome + " Sua idade é: " + idade + " Sua nota foi: " + nota);
	}

}
