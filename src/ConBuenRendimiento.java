public class ConBuenRendimiento implements EmpleadoI{
    EmpleadoI empleado;
    ConBuenRendimiento(EmpleadoI empleado){
        this.empleado = empleado;
    }

    @Override
    public double calcularBonoPorResultado() {
        return 0.1 * empleado.calcularSueldoNeto();
    }

    @Override
    public double calcularSueldoTotal(int diasAusente) {
        return calcularSueldoNeto()+
                calcularBonoPorPresentismo(diasAusente)+
                calcularBonoPorResultado();
    }

    @Override
    public double calcularSueldoTotal() {
        return 0;
    }

    public double calcularSueldoNeto(){
        return empleado.calcularSueldoNeto();
    }

    @Override
    public double calcularBonoPorPresentismo(int diasAusente) {
        return 0;
    }
}
