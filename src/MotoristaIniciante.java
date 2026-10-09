public class MotoristaIniciante extends Motorista {

    public MotoristaIniciante(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento = getValorBruto() * 0.75;

        if (getQuantidadeCorridas() < 5) {
            pagamento -= 50.0;
        }

        return pagamento;
    }
}
