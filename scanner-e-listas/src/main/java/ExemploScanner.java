import java.util.Scanner;

public class ExemploScanner {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        Integer numeroDigitado = leitor.nextInt();

        System.out.println(String.format("""
                O número digitado foi %d""",numeroDigitado));

        System.out.println("Digite um numero real:");
        Double numeroReal = leitor.nextDouble();

        System.out.println(String.format("""
                O número digitado foi %.2f""",numeroReal));

        System.out.println("Digite seu nome:");
        String nomeDigitado = leitorTexto.nextLine();

        System.out.println("O nome digitado é: %s".formatted(nomeDigitado));
    }
}
