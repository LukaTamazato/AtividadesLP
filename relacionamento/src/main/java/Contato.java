public class Contato {
    //Atributos
    private String nome;
    private String telefone;
    private Boolean bloqueado;

    //Construtores

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        bloqueado = false;
    }
    public Contato() {
    }

    //Métodos
    public void bloquear(){
        bloqueado = true;
    }
    public void desbloquear(){
        bloqueado = false;
    }

    //Get/Set

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Boolean getBloqueado() {
        return bloqueado;
    }


    //toString

    @Override
    public String toString() {
        return """
                Nome: %s
                Telefone: %s
                Bloqueado: %s
                """.formatted(nome,telefone,bloqueado?"Sim":"Não");
    }
}
