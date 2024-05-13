public class Carta {
    private Naipe naipe;
    private Simbolo simbolo;

    public Carta(Simbolo simbolo, Naipe naipe) {
        this.simbolo = simbolo;
        this.naipe = naipe;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public void setNaipe(Naipe naipe) {
        this.naipe = naipe;
    }

    public Simbolo getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(Simbolo simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "naipe='" + naipe + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
