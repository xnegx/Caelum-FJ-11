class TestaConta5 {
    public static void main(String[] args) {
    Conta c1 = new Conta();
    
    c1.titular = "Hugo";
    c1.numero = 123;
    c1.agencia = "45678-9";
    c1.saldo = 50.0;
    c1.dataDeAbertura = "04/06/2015";
    
    
    Conta c2 = c1;
    
    if (c1 == c2) {
        System.out.println("iguais");
    } else {
        System.out.println ("Diferentes");     
    }

    }
}
