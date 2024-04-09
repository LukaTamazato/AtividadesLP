public class TesteContato {
    public static void main(String[] args) {
        Contato contato01 = new Contato("Luka Eiji Tamazato","11000999");
        Contato contato02 = new Contato("Luiz Marcelo","1123232399");
        System.out.println(contato01);
        System.out.println(contato02);

        Grupo grupo01 = new Grupo ("Trabalho");
        Grupo grupo02 = new Grupo ("NINEBILLE");

        grupo01.adicionar(contato01);
        grupo01.adicionar(contato02);

        grupo02.adicionar(contato01);

        System.out.println(grupo01);
        grupo01.exibirContatos();
    }
}
