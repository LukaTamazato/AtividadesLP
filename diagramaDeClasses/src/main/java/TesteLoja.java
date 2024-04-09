public class TesteLoja {
    public static void main(String[] args) {
        Loja administrarLoja = new Loja("Marcelinho",21);

        administrarLoja.realizarVenda(31.21);

        System.out.println(administrarLoja);
    }
}
