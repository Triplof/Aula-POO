package aula2403;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// chamo uma classe >> instanciar a classe
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa(30, "Ana");
		
		//imprimir
		System.out.println("Nome......:" + p1.getNome());
		System.out.println("Idade.....:" + p1.getIdade());
		
		System.out.println("Nome......:" + p2.getNome());
		System.out.println("Idade.....:" + p2.getIdade());
		
	}

}
