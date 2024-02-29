import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {
    public static void main(String[] args) {

//        List listaMaluca = new ArrayList();
            // adiciona == push
//        listaMaluca.add("Manoel Gomes");
//        listaMaluca.add(8);
//        listaMaluca.add(true);
//        listaMaluca.add(2.2);
//        System.out.println(listaMaluca);
//        listaMaluca.add(0,"Diego");
//        System.out.println(listaMaluca);
            //Adiciona uma posição específica
//        listaMaluca.set(1,"Manoel Almeida");
//        System.out.println(listaMaluca);
            //remove por posição ou objeto
//        listaMaluca.remove(0);
//        System.out.println(listaMaluca);
            // Pega posição
//        System.out.println(listaMaluca.get(0));

//        List<Integer> listaNumeros = new ArrayList<>();
//
//        listaNumeros.add(1);
//        listaNumeros.add(2);
//        listaNumeros.add(21);
//        listaNumeros.add(24);
//
//        System.out.println(listaNumeros);
//        System.out.println(listaNumeros.size());
//
//        for (int i = 0 ; i < listaNumeros.size();i++){
//            System.out.println(listaNumeros.get(i));
//        }

        Scanner leitor = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("Quantos valores deseja colocar na lista?");
        Integer qtdValores = leitor.nextInt();
        for (int i = 0;i<qtdValores;i++){
            System.out.println("""
                    Informe o %d º valor:""".formatted(i+1));
                Integer valorDigitado = leitor.nextInt();
                listaNumeros.add(valorDigitado);

        }
            System.out.println("""
            Sua lista ficará assim: 
            %s""".formatted(listaNumeros));
    }
}
