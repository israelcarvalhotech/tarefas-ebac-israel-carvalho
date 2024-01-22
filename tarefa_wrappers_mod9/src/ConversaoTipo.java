public class ConversaoTipo {

    public static void main(String[] args) {
        // Leitura de uma variável primitiva do tipo int
        System.out.print("Digite um número inteiro: ");
        int numeroPrimitivo = lerInteiroDoConsole();

        // Conversão para o tipo Wrapper (Integer)
        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);

        // Imprimindo novamente no console
        System.out.println("Número primitivo: " + numeroPrimitivo);
        System.out.println("Número Wrapper: " + numeroWrapper);
    }

    // Método para ler um número inteiro do console
    private static int lerInteiroDoConsole() {
        return new java.util.Scanner(System.in).nextInt();
    }
}
