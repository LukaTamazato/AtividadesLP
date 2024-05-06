public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Giu","Hyundai",200000.00,2012,0.1,false);
        carro.exibirRelatorioDeRevisao();

        Bicicleta bicicleta = new Bicicleta(
                "Luka","monark",2100.00,2004,123.00,120.50
        );
    }
}
