public abstract class  Veiculo {
    private String proprietario;
    private String fabricante;
    private Double valor;
    private Integer anoFabricacao;

    public Veiculo() {
    }
    public Veiculo(String proprietario, String fabricante, Double valor, Integer anoFabricacao) {
        this.proprietario = proprietario;
        this.fabricante = fabricante;
        this.valor = valor;
        this.anoFabricacao = anoFabricacao;
    }

    public abstract void exibirRelatorioDeRevisao();

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
}
