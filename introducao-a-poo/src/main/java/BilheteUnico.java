public class BilheteUnico {
    //Atributos
    String nomeTitular;

    Double saldo;

    String codigo;

    void carregar(Double valorRecarga){
        if(valorRecarga<1){
            System.out.println("Valor inválido");
        } else {
            saldo += valorRecarga;
            System.out.println("Recarga efeturada!");
        }
    }

}
