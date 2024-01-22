public class Main {

    public static void main(String[] args) {
        // Leitura das 4 notas e do operador
        System.out.println("Digite as 4 notas do aluno e o operador (+, -, *, /):");

        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Nota " + i + ": ");
            soma = realizarOperacao(soma, lerNota(), lerOperador());
        }

        // Exibindo o resultado
        System.out.println("Resultado: " + soma);
    }

    // Método para ler uma nota
    private static double lerNota() {
        return new java.util.Scanner(System.in).nextDouble();
    }

    // Método para ler um operador
    private static char lerOperador() {
        return new java.util.Scanner(System.in).next().charAt(0);
    }

    // Método para realizar a operação
    private static double realizarOperacao(double acumulado, double nota, char operador) {
        switch (operador) {
            case '+':
                return acumulado + nota;
            case '-':
                return acumulado - nota;
            case '*':
                return acumulado * nota;
            case '/':
                return acumulado / nota;
            default:
                System.out.println("Operador inválido. Use +, -, *, ou /.");
                return acumulado; // Se o operador for inválido, não muda o acumulado
        }
    }
}

