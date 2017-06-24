class Conta {
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataDeAbertura;

    void saca (double valor) {
        this.saldo -= valor;
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }


}
	
