public class Cadete implements EmpleadoI {
    @Override
    public double calcularSueldoNeto() {
        return 1500;
    }

    @Override
    public double calcularBonoPorPresentismo(int diasAusente) {
        if (diasAusente == 0) return 100;
        if (diasAusente == 1) return 50;
        return 0;
    }

    @Override
    public double calcularBonoPorResultado() {
        return 0;
    }

    @Override
    public double calcularSueldoTotal(int diasAusente) {
        return 0;
    }
}
