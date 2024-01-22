public class MediaNotas {

    public static void main(String[] args) {
        // Aluno 1
        double notaAluno1 = 8.5;
        // Aluno 2
        double notaAluno2 = 7.2;
        // Aluno 3
        double notaAluno3 = 5.0;
        // Aluno 4
        double notaAluno4 = 3.8;

        // Calculando a média para cada aluno
        double mediaAluno1 = notaAluno1 / 4;
        double mediaAluno2 = notaAluno2 / 4;
        double mediaAluno3 = notaAluno3 / 4;
        double mediaAluno4 = notaAluno4 / 4;

        // Verificando as condições e exibindo os resultados
        verificarResultado("Aluno 1", mediaAluno1);
        verificarResultado("Aluno 2", mediaAluno2);
        verificarResultado("Aluno 3", mediaAluno3);
        verificarResultado("Aluno 4", mediaAluno4);
    }

    // Método para verificar o resultado e imprimir no console
    private static void verificarResultado(String aluno, double media) {
        System.out.println("Média do " + aluno + ": " + media);

        if (media >= 7) {
            System.out.println(aluno + " está Aprovado.");
        } else if (media == 5) {
            System.out.println(aluno + " está em Recuperação.");
        } else {
            System.out.println(aluno + " está Reprovado.");
        }

        System.out.println();
    }
}
