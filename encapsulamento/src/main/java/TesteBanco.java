public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria conta01 = new ContaBancaria("Luka Eiji Tamazato","C123",100);

       ContaBancaria conta02 = new ContaBancaria("Leonardo Mendes Souza","C321",213);

       System.out.println("Nome: "+conta01.getNomeTitular());
       System.out.println("Nome: "+conta02.getNomeTitular());
       conta01.depositar(1000.00);
       System.out.println("Saldo: "+conta01.getSaldo());
       conta01.sacar(500.00);
       System.out.println("Saldo: "+conta01.getSaldo());
       conta01.setSaldo(123.00);
        System.out.println("Saldo: "+conta01.getSaldo());
    }
}
