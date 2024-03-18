public class Confrinhos {
    public static void main(String[] args) {
        Economias cofrinho01 = new Economias();

        cofrinho01.descricao = "Aquisição Placa mãe";
        cofrinho01.qtdDinheiroAtual = 0.0;

        cofrinho01.Depositar(21.00);
        System.out.println(cofrinho01.qtdDinheiroAtual);
        System.out.println( cofrinho01.Agitar());
    }
}
