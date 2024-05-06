public class Carro extends Veiculo{
    private Double nivelOleo;
    private Boolean possuiStep;
    public Carro() {
    }

    public Carro(String proprietario, String fabricante, Double valor, Integer anoFabricacao, Double nivelOleo, Boolean possuiStep) {
        super(proprietario, fabricante, valor, anoFabricacao);
        this.nivelOleo = nivelOleo;
        this.possuiStep = possuiStep;
    }

    public void exibirRelatorioDeRevisao(){
        if (nivelOleo<0.5){
            System.out.println("Precisa trocar o óleo");
        }else{
            System.out.println("Nivel de óleo OK");
        }

        if (possuiStep){
            System.out.println("Step OK");
        }else {
            System.out.println("Compre um step");
        }
    }
    public Double getNivelOleo() {
        return nivelOleo;
    }

    public void setNivelOleo(Double nivelOleo) {
        this.nivelOleo = nivelOleo;
    }

    public Boolean getPossuiStep() {
        return possuiStep;
    }

    public void setPossuiStep(Boolean possuiStep) {
        this.possuiStep = possuiStep;
    }
}
