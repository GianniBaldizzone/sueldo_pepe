public class Main {
    public static void main(String[] args){
        System.out.println("Sueldo de pepe Argento");
        Cadete pepe = new Cadete();
        ConBuenRendimiento pepe2= new ConBuenRendimiento(new Gerente());

        System.out.println(String.format("El sueldo total del empleado es %f",
                pepe.calcularSueldoTotal(0)
        ));
        System.out.println(String.format("El sueldo total del empleado es %f",
                pepe2.calcularSueldoTotal(0)
        ));
}
}
