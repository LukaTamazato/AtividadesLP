public class ContaBancaria {
    //Caracteristicas
    private String nomeTitular;
    private Double saldo;
    private String codigoConta;
    private Integer agencia;

    //Construtor:
    //Não tem return
    //Sempre público
    //Mesmo nome da class
    public ContaBancaria(String nomeTitular, String codigoConta, Integer agencia) {
        this.nomeTitular = nomeTitular;
        this.saldo = 0.0;
        this.codigoConta = codigoConta;
        this.agencia = agencia;
    }

    //Comportamentos
    //Sempre em verbos
    
    void sacar(Double valorSaque){
        if(valorSaque<=0||valorSaque>saldo){
            System.out.println("Não é possivel sacar");
        }else {
            saldo -= valorSaque;
        }
    }
    void depositar(Double valorDeposito) {
        if (valorDeposito <= 0) {
            System.out.println("Não é possivel depositar");
        } else {
            saldo += valorDeposito;
        }
    }

// Get/Set
    void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getCodigoConta() {
        return codigoConta;
    }

    public void setCodigoConta(String codigoConta) {
        this.codigoConta = codigoConta;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }
}
