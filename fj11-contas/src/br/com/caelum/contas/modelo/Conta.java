package br.com.caelum.contas.modelo;

/**
 * Classe que modela as contas do sistema.
 * @author Everton
 *
 */
public abstract class Conta implements Comparable<Conta>{
	private String Titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private String dataDeAbertura;
	
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getDataDeAbertura() {
		return dataDeAbertura;
	}
	public void setDataDeAbertura(String dataDeAbertura) {
		this.dataDeAbertura = dataDeAbertura;
	}
	
	/**
	 *  Metodo que retorna o valor do saldo
	 * @return o valor do saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Metodo para incrementar o saldo da conta
	 * @param valor a ser depositado
	 */
	public void deposita(double valor) {
		if (valor < 0 ){
			throw new IllegalArgumentException("Voce tentou depositar um valor negativo");
		}
		else {
			this.saldo += valor;
		}
				
	}
	
	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			
		}
		
	}
	
	public abstract String getTipo();
	
	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}
	
	@Override
	public String toString() {
		return "[titular=" + Titular.toUpperCase() +", numero=" + numero +", agencia=" + agencia + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		Conta outraConta = (Conta) obj;
		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.Titular.compareTo(outraConta.Titular);
	}
}
