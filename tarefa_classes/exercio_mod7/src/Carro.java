// Definindo a classe Carro
public class Carro {

    // Propriedades do Carro
    private String modelo;
    private String cor;
    private int anoFabricacao;
    private boolean ligado;

    // Construtor da classe Carro
    public Carro(String modelo, String cor, int anoFabricacao) {
        this.modelo = modelo;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false; // O carro inicia desligado
    }

    // Método para ligar o carro
    public void ligar() {
        if (!ligado) {
            System.out.println("Carro ligado. Vrum vrum!");
            ligado = true;
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para acelerar o carro
    public void acelerar() {
        if (ligado) {
            System.out.println("Acelerando o carro. Zuum zumm!");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    // Método para obter informações do carro
    public String obterInformacoes() {
        return "Carro: " + modelo + " | Cor: " + cor + " | Ano: " + anoFabricacao;
    }
}

