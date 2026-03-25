package aula2403;

public class Conta {
	//atributos
	double Saldo;
	String nrAgencia;
	String titular;
	String nrConta;
	int codBanco;
	
	//construtores
	public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
		super();
		Saldo = saldo;
		this.nrAgencia = nrAgencia;
		this.titular = titular;
		this.nrConta = nrConta;
		this.codBanco = codBanco;
	}
	
	//getters e setters


	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

	public String getNrAgencia() {
		return nrAgencia;
	}

	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNrConta() {
		return nrConta;
	}

	public void setNrConta(String nrConta) {
		this.nrConta = nrConta;
	}

	public int getCodBanco() {
		return codBanco;
	}

	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
	
	
	
	
}
