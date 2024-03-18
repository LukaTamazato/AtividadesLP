import java.util.concurrent.ThreadLocalRandom;

public class Economias {
    String descricao;
    Double qtdDinheiroAtual;
    Boolean quebrado = false;

    void Depositar(Double QtdDepositada){
    if (quebrado){
        System.out.println("Você não pode depositar no cofrinho quebrado");
    }else{
        qtdDinheiroAtual += QtdDepositada;
    }
    }

    Double Agitar(){
        if (quebrado){
            System.out.println("Você não pode agitar o cofrinho quebrado");
            return null;
        }else {
           return ThreadLocalRandom.current().nextDouble(0, qtdDinheiroAtual);
        }
    }

    Double quebrar(){
        if(quebrado){
            System.out.println("Você não pode quebrar o cofrinho já quebrado");
            return null;
        }else {
            quebrado = true;
            return qtdDinheiroAtual;
        }

    }


}
