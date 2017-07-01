class TestaConta {
    public static void main(String[] args) {
    Conta c1 = new Conta();
    
    c1.setTitular("Everton");
    c1.setNumero(123);
    c1.setAgencia("123");
    c1.setDataDeAbertura("04/06/2015");
    c1.deposita(100.0);
    
    
    Conta c2 = new Conta();
    
    c2.setTitular("Everton");
    c2.setNumero(123);
    c2.setAgencia("123");
    c2.setDataDeAbertura("04/06/2015");
    c2.deposita(100.0);
    
    //System.out.println(c1.getTitular());
    //System.out.println(c1.getNumero());
    //System.out.println(c1.getSaldo());
    //System.out.println(c1.getDataDeAbertura());
    //System.out.println(c1.getAgencia());
    
    //c1.titular = "Hugo";
    //c1.numero = 123;
    //c1.agencia = "45678-9";
    //c1.saldo = 50.0;
    //c1.dataDeAbertura = "04/06/2015";
    
    //Data data = new Data();
    //data.dia = 1;
    //data.mes = 2;
    //data.ano = 2015;
    //c1.dataDeAbertura = data; 
    
       
    //System.out.println("saldo atual:" + c1.saldo);
    //System.out.println("rendimento mensal" + c1.calculaRendimento());
    System.out.println(c1.recuperaDadosParaImpressao());
    System.out.println(c2.recuperaDadosParaImpressao());
   

    }

}
