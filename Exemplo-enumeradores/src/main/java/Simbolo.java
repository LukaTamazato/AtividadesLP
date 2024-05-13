import java.util.jar.JarEntry;

public enum Simbolo {
    AS("A",1),
    DOIS("2",2),
    TRÊS("3",3),
    QUATRO("4",4),
    CINCO("5",5),
    SEIS("6",6),
    SETE("7",7),
    OITO("8",8),
    NOVE("9",9),
    DEZ("10",10),
    VALETE("J",11),
    DAMA("Q",12),
    REI("K",13);

    private final String Figura;
    private final Integer valor;


    Simbolo(String Figura,Integer valor){
        this.Figura = Figura;
        this.valor= valor;
    }

    public String getFigura() {
        return Figura;
    }

    public Integer getValor() {
        return valor;
    }
}
