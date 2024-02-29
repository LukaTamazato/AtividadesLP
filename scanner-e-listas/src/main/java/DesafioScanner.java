import java.util.Scanner;

public class DesafioScanner {
    public static void main(String[] args) {
        Scanner scannerLetra = new Scanner(System.in);
        Scanner scannerNumero = new Scanner(System.in);

        System.out.println("""
                Digite aqui o nome do seu companheiro:""");
        String nomePet = scannerLetra.nextLine();

        System.out.println("""
                Digite aqui a idade do seu animalzinho:""");
        Integer idadePet = scannerNumero.nextInt();

        System.out.println("""
                Digite aqui a Altura do seu Pet(Em metros):""");
        Double alturaPet = scannerNumero.nextDouble();


        System.out.println("""
                
                %s,
                de %d aninhos de idade,
                com exatos %.2f metros de altura.
                Agora está cadastrado em nosso sistema e pronto para receber nossos cuidados.
                Até breve !!! : )
                """.formatted(nomePet,idadePet,alturaPet));
    }

}