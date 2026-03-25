package aula2403;

public class Pessoa {
	// atributos da classe >> caracteristicas
	private int idade;
	private String nome;
	// construtores - vazio
	public Pessoa() {
	}
	public Pessoa(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	// getters e setters
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
