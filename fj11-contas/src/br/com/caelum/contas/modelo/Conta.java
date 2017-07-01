package br.com.caelum.contas.modelo;

public class Conta {
	private String Titular;
	private int numero;
	private String agencia;
	private double saldo;
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
	public double getSaldo() {
		return saldo;
	}
	public void deposita(double valor) {
		this.saldo += valor;
		
	}
	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

}
