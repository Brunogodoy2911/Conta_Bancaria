package conta_bancaria.model;

public class Conta {

	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {

		if (this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}

		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	public void depositar(float valor) {

		this.setSaldo(this.getSaldo() + valor);

	}

	public void visualizar() {
		String tipoConta = "";

		switch (this.tipo) {
		case 1 -> tipoConta = "Conta Corrente";
		case 2 -> tipoConta = "Conta Poupança";
		default -> tipoConta = "Tipo Desconhecido";
		}

		System.out.println("\n***************************************************");
		System.out.println("                   DADOS DA CONTA                  ");
		System.out.println("***************************************************");
		System.out.printf("Número da Conta : %d%n", this.numero);
		System.out.printf("Agência         : %d%n", this.agencia);
		System.out.printf("Tipo da Conta   : %s%n", tipoConta);
		System.out.printf("Titular         : %s%n", this.titular);
		System.out.printf("Saldo           : R$ %.2f%n", this.saldo);
		System.out.println("***************************************************");
	}

}