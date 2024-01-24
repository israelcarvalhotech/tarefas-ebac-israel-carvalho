public class colecoes_parte2 {

    public static void main(String[] args) {
        // Inicialização de variáveis para armazenar os grupos
        StringBuilder masculinos = new StringBuilder("Masculinos: ");
        StringBuilder femininos = new StringBuilder("Femininos: ");

        // Exemplo com dois nomes
        processarNomeSexo("Pedro-M", masculinos, femininos);
        processarNomeSexo("Maria-F", masculinos, femininos);

        // Exemplo com mais dois nomes
        processarNomeSexo("João-M", masculinos, femininos);
        processarNomeSexo("Ana-F", masculinos, femininos);

        // Exemplo com mais um nome
        processarNomeSexo("Lucas-M", masculinos, femininos);

        // Imprimindo os grupos
        System.out.println("Grupos formados:");
        System.out.println(masculinos.toString());
        System.out.println(femininos.toString());
    }

    private static void processarNomeSexo(String dadosPessoa, StringBuilder masculinos, StringBuilder femininos) {
        // Utilizando o comando split para separar o nome e o sexo
        String[] dados = dadosPessoa.split("-");
        String nome = dados[0].trim();
        String sexo = dados[1].trim();

        // Separando por grupos (M e F) e armazenando nos respectivos StringBuilder
        if (sexo.equalsIgnoreCase("M")) {
            masculinos.append(nome).append(", ");
        } else if (sexo.equalsIgnoreCase("F")) {
            femininos.append(nome).append(", ");
        } else {
            System.out.println("Sexo não reconhecido. Tente novamente.");
        }
    }
}
