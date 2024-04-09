import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private String nome;
    private List<Contato> contatos;

    public Grupo(String nome) {
        this.nome = nome;
        contatos = new ArrayList<>();
    }

    public void adicionar(Contato c){
        contatos.add(c);
    }

    public void remover(Contato c){
        contatos.remove(c);
    }
    public void exibirContatos(){
//        for (int i=0;i<contatos.size();i++){
//            System.out.println(contatos.get(i));
//        }
        for(Contato contatoDaVez:contatos){
            System.out.println(contatoDaVez);
        }
    }

    public Contato buscarPorNome(String nomePesquisado){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nomePesquisado)){
                return contato;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return """
                Nome do grupo: %s
                Lista de contatos : %s
                """.formatted(nome,contatos);
    }
}