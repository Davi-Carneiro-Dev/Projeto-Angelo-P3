
public abstract class Motorista {
    private final String nome;
    private final String placa;
    private int quantidadeCorridas;
    private double valorBruto;

    public Motorista(String nome, String placa) {
        this.nome = nome;
        this.placa = placa;
    }

    public void registrarCorrida(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor da corrida deve ser positivo."
            );
        }

        quantidadeCorridas++;
        valorBruto += valor;
    }

    public abstract double calcularPagamentoLiquido();

    public String getNome() {
        return nome;
    }

    public String getPlaca() {
        return placa;
    }

    public int getQuantidadeCorridas() {
        return quantidadeCorridas;
    }

    public double getValorBruto() {
        return valorBruto;
    }
}


