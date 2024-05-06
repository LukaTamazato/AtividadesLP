public class Bicicleta extends Veiculo{
    private Double nivelCalibragem;
    private Double pesoMax;

    public Bicicleta(){}

    public Bicicleta(String proprietario, String fabricante, Double valor, Integer anoFabricacao, Double nivelCalibragem, Double pesoMax) {
        super(proprietario, fabricante, valor, anoFabricacao);
        this.nivelCalibragem = nivelCalibragem;
        this.pesoMax = pesoMax;
    }
    public void exibirRelatorioDeRevisao(){
        if (nivelCalibragem<0.8){
            System.out.println("Precisa calibrar o pneu");
        }else{
            System.out.println("Calibragem pneu OK");
        }
        if (pesoMax<120.20){
            System.out.println("Profissional");
        }else {
            System.out.println("Amadora");

        }
    }

    public Double getNivelCalibragem() {
        return nivelCalibragem;
    }

    public void setNivelCalibragem(Double nivelCalibragem) {
        this.nivelCalibragem = nivelCalibragem;
    }

    public Double getPesoMax() {
        return pesoMax;
    }

    public void setPesoMax(Double pesoMax) {
        this.pesoMax = pesoMax;
    }
}
