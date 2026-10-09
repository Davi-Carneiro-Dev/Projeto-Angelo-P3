public class MotoristaParceiroFrotista extends Motorista {

    public MotoristaParceiroFrotista(String nome, String placa) {
        super(nome, placa);
    }

    @Override
    public double calcularPagamentoLiquido() {
        double pagamento = getValorBruto() * 0.80 - 800.0;

        return Math.max(0.0, pagamento);
    }
}
