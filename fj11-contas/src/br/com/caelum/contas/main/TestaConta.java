package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.setTitular("Everton");
		conta.deposita(300.0);
		System.out.println(conta);
		//if (conta.saca(200.0)) {
		//	System.out.println("Sacou!");
		//} else {
		//	System.out.println("Não Sacou!");
	}
}

// nao funciona