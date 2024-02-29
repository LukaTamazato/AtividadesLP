import java.util.ArrayList;
import java.util.List;

public class DesafioListas {
    public static void main(String[] args) {
        // Soma de elementos
        List<Double> listaDeSoma = new ArrayList<>();
        Double somador = 0.0;

        listaDeSoma.add(2.2);
        listaDeSoma.add(5.1);
        listaDeSoma.add(21.2);
        listaDeSoma.add(100.2);
        listaDeSoma.add(50.0);

        for (int i =0;i<listaDeSoma.size();i++){
            somador += listaDeSoma.get(i);
        }
        System.out.println("""
        Sua lista ficou assim:
        %s
        """.formatted(listaDeSoma));
        System.out.println("""
                A soma total ficou: %.2f
                """.formatted(somador));
//---------------------------------------------------------------------
        // Remoção dos pares
        List<Integer> listaSemPares = new ArrayList<>();
        listaSemPares.add(1);
        listaSemPares.add(2);
        listaSemPares.add(10);
        listaSemPares.add(13);
        listaSemPares.add(121);
        listaSemPares.add(140);
        listaSemPares.add(110);
        listaSemPares.add(140);
        listaSemPares.add(183);

        for (int i=0;i<listaSemPares.size();i++){
            if ((listaSemPares.get(i))%2==0){
                listaSemPares.set(i,0);
            }
        }
        for (int i=0;i<listaSemPares.size();i++) {
            Integer delecao = 0;
            listaSemPares.remove(delecao);
        };
        System.out.println("""
                Sua lista final ficou assim:
                %s
                """.formatted(listaSemPares));
    }
}
