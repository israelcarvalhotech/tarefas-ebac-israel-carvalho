public class tarefasColecoes {

    public static void main(String[] args) {
        // 1ª Tarefa
        System.out.println("1ª Tarefa:");

        // Sugestão de 5 nomes masculinos e 5 nomes femininos
        String inputNomesMasculinos = "Carlos,João,Lucas,Pedro,Gabriel";
        String inputNomesFemininos = "Ana,Maria,Julia,Carolina,Larissa";

        // Juntando os nomes masculinos e femininos
        String inputNomes = inputNomesMasculinos + "," + inputNomesFemininos;

        // Utilizando o comando split para separar os nomes
        String[] nomes = inputNomes.split(",");
        java.util.Arrays.sort(nomes); // Ordenando os nomes em ordem alfabética

        // Imprimindo os nomes no console
        System.out.println("Nomes ordenados em ordem alfabética: " + java.util.Arrays.toString(nomes));

        // 2ª Tarefa
        System.out.println("\n2ª Tarefa:");
        // Sugestão de 5 nomes masculinos e 5 nomes femininos com sexos já prontos
        String[] sugestaoNomesSexo = {"Pedro - M", "João - M", "Lucas - M", "Ana - F", "Maria - F", "Julia - F"};

        // Imprimindo os resultados da segunda tarefa
        for (String dadosPessoa : sugestaoNomesSexo) {
            // Utilizando o comando split para separar o nome e o sexo
            String[] dados = dadosPessoa.split("-");
            String nome = dados[0].trim();
            String sexo = dados[1].trim();

            // Separando por grupos (M e F) e imprimindo no console
            if (sexo.equalsIgnoreCase("M")) {
                System.out.println("Nome: " + nome + " - Grupo: Masculino");
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println("Nome: " + nome + " - Grupo: Feminino");
            } else {
                System.out.println("Sexo não reconhecido.");
            }
        }
    }
}
