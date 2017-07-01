class TestaConta4 {
    public static void main(String[] args) {
    Conta c1 = new Conta();
    
    c1.titular = "Hugo";
    c1.numero = 123;
    c1.agencia = "45678-9";
    c1.saldo = 50.0;
    c1.dataDeAbertura = "04/06/2015";
    
    
    Conta c2 = new Conta();
    c2.titular = "Hugo";
    c2.numero = 123;
    c2.agencia = "45678-9";
    c2.saldo = 50.0;
    c2.dataDeAbertura = "04/06/2015";
    
    if (c1 == c2) {
        System.out.println("iguais");
    } else {
        System.out.println ("Diferentes");     
    }

    }
}
