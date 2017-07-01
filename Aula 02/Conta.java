class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;
    private int identificador;

    public void saca (double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }
    
    public String recuperaDadosParaImpressao() {
        String dados = "Titular " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\ndata de Abertura " + this.dataDeAbertura;
        dados += "\nRendimento " + this.calculaRendimento();
        dados += "\nSaldo " + this.saldo;
        dados += "\nIdentificar " + this.identificador;                                                                  
        return dados;
    }
    
    public String getTitular(){
        return this.titular;
    }
    
    public void setTitular(String titular){
        this.titular = titular;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    
    public int getNumero(){
        return this.numero; 
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public void setDataDeAbertura(String dataDeAbertura){
        this.dataDeAbertura = dataDeAbertura;
    }
    
    public String getDataDeAbertura(){
        return this.dataDeAbertura;
    }
    
    public int getIdentificador(){
        return this.identificador;
    }
    
    public Conta() {
        //Construtor sem argumentos
        this.identificador += 1;
    }
    
    public Conta(String titular){
        this.titular = titular;
        this.identificador += 1;
    
    }
}
	
