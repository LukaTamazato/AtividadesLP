public class Loja {
    //Atributos
    private String nomeLoja;
    private Integer qtdVendas;
    private Integer qtdMetasVendas;
    private Double valorTotalVendas;

    //Construtor
    public Loja() {
    }

    public Loja(String nomeLoja, Integer qtdMetasVendas) {
        this.nomeLoja = nomeLoja;
        qtdVendas = 0;
        this.qtdMetasVendas = qtdMetasVendas;
        valorTotalVendas = 0.0;
    }

    public void realizarVenda(Double valorVenda) {
        if (valorVenda < 1) {
            System.out.println("Não foi possível executar a venda sem comprar um produto");
        } else {
            qtdVendas++;
            valorTotalVendas += valorVenda;
        }
    }

    public void realizarVenda(Double valorVenda, Double valorDesconto) {
        if (valorVenda < 1) {
            System.out.println("Não foi possível executar a venda sem comprar um produto");
        } else {
            qtdVendas++;
            valorTotalVendas += valorVenda - (valorTotalVendas * (valorDesconto / 100));
        }
    }

    public Boolean verificarMeta(){
    return qtdVendas>=qtdMetasVendas;
    }

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public Integer getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(Integer qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public Integer getQtdMetasVendas() {
        return qtdMetasVendas;
    }

    public void setQtdMetasVendas(Integer qtdMetasVendas) {
        this.qtdMetasVendas = qtdMetasVendas;
    }

    public Double getValorTotalVendas() {
        return valorTotalVendas;
    }

    public void setValorTotalVendas(Double valorTotalVendas) {
        this.valorTotalVendas = valorTotalVendas;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nomeLoja='" + nomeLoja + '\'' +
                ", qtdVendas=" + qtdVendas +
                ", qtdMetasVendas=" + qtdMetasVendas +
                ", valorTotalVendas=" + valorTotalVendas +
                ", Meta Foi atingida? "+ (verificarMeta()?"Atingida":"Não Atingida")+
                '}';
    }
}
