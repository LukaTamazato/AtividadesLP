public class OperadoresMatematicos {
    public static void main(String[] args) {
        // +, - , /, *, %
        // += , -= , ++, --

        Double numero01 = 42.0;
        Double numero02 = 2.0;

        System.out.println("Soma :" + (numero01 + numero02));
        System.out.println("Subtração :" + (numero01 - numero02));
        System.out.println("Multiplicação :" + (numero01 * numero02));
        System.out.println("Divisão :" + (numero01 / numero02));

        // Double resultadoPotencia = Math.pow(numero01,numero02);
        // System.out.println("Potência: " + resultadoPotencia);

        System.out.println("Potência: " + Math.pow(numero01,numero02));

    }
}