// Classe Pessoa
class Pessoa {
    private String nome;

    // Construtor
    public Pessoa(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }
}

// Subclasse PessoaFisica
class PessoaFisica extends Pessoa {
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    // Método para obter o CPF
    public String getCPF() {
        return cpf;
    }
}

// Subclasse PessoaJuridica
class PessoaJuridica extends Pessoa {
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    // Método para obter o CNPJ
    public String getCNPJ() {
        return cnpj;
    }
}

// Exemplo de utilização
public class Pessoas {
    public static void main(String[] args) {
        // Criando uma pessoa física
        PessoaFisica pessoaFisica = new PessoaFisica("João Pessoa", "123.456.789-00");
        System.out.println("Nome da Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("CPF da Pessoa Física: " + pessoaFisica.getCPF());

        System.out.println(); // Linha em branco

        // Criando uma pessoa jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "12.345.678/0001-99");
        System.out.println("Nome da Pessoa Jurídica: " + pessoaJuridica.getNome());
        System.out.println("CNPJ da Pessoa Jurídica: " + pessoaJuridica.getCNPJ());
    }
}
