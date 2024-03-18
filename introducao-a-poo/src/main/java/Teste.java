public class Teste {
    public static void main(String[] args) {
        BilheteUnico bilhete01 = new BilheteUnico();
        BilheteUnico bilhete02 = new BilheteUnico();

        bilhete01.nomeTitular = "Luka";
        bilhete01.saldo = 00.00;
        bilhete01.codigo = "B001";

        bilhete02.nomeTitular = "Bob da Silva";
        bilhete02.saldo = 00.00;
        bilhete02.codigo = "B002";

        bilhete01.carregar(21.0);
        System.out.println("Saldo atual: "+bilhete01.saldo);
    }
}
