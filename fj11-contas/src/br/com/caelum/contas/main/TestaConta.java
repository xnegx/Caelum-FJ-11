package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setTitular("Everton");
		conta.deposita(300.0);
		if (conta.saca(200.0)) {
			System.out.println("Sacou!");
		} else {
			System.out.println("Não Sacou!");
		}
	}
}
