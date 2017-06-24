class Academia{
    public static void main(String[] args){
        String nome = "Everton";
        int idade = 28;
        float peso = 61.5f;
        double altura = 1.65;
        // apenas um comentario
        char sexo = 'M';
        boolean ehFumante = false;
        boolean amigo = false;

        // Or = ||
        // And = && 
        if (idade >= 18 || amigo ){
            System.out.println("Pode se matricular");
        } 
        else {
            System.out.println("Nao pode se matricular");
        }

        while (idade < 18 ) {
            System.out.println ("Tente ano que vem...");
            //idade = idade + 1;
            //idade +=1
            idade++;
        }

        for (int i = 1; o <= 10; i++){
            System.out.println(i);
        }



    }
}
