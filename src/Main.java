public class Main {

    public static void main(String[] args) {
        Motorista iniciante =
                new MotoristaIniciante("Ana", "ABC-1234");

        Motorista premium =
                new MotoristaPremium("Bruno", "DEF-5678");

        Motorista frotista =
                new MotoristaParceiroFrotista("Carla", "GHI-9012");

        iniciante.registrarCorrida(100.0);
        iniciante.registrarCorrida(80.0);

        premium.registrarCorrida(100.0);
        premium.registrarCorrida(200.0);

        frotista.registrarCorrida(500.0);
        frotista.registrarCorrida(700.0);

        Motorista[] motoristas = {
                iniciante, premium, frotista
        };

        for (Motorista motorista : motoristas) {
            System.out.println("===== EXTRATO DO MOTORISTA =====");
            System.out.println("Nome: " + motorista.getNome());
            System.out.println("Placa: " + motorista.getPlaca());
            System.out.println("Corridas: " + motorista.getQuantidadeCorridas());

            System.out.printf(
                    "Valor bruto: R$ %.2f%n",
                    motorista.getValorBruto()
            );

            System.out.printf(
                    "Valor líquido: R$ %.2f%n%n",
                    motorista.calcularPagamentoLiquido()
            );
        }
    }
}
