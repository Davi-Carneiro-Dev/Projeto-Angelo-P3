public class MotoristaPremium extends Motorista {

    public MotoristaPremium(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public void registrarCorrida(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException(
                    "O valor da corrida deve ser positivo."
            );
        }

        super.registrarCorrida(valor + 2.0);
    }

    @Override
    public double calcularPagamentoLiquido() {
        return getValorBruto() * 0.85;
    }
}
