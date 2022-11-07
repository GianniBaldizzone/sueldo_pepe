public class Gerente implements EmpleadoI {
    @Override
    public double calcularSueldoNeto() {
        return 1500;
    }

    @Override
    public double calcularBonoPorPresentismo(int diasAusente) {
        return 0;
    }

    @Override
    public double calcularBonoPorResultado() {
        return 0;
    }

    @Override
    public double calcularSueldoTotal(int diasAusente) {
        return calcularSueldoNeto()+calcularBonoPorResultado();
    }
}
