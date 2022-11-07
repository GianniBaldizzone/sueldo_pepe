public class Main {
    public static void main(String[] args){
        System.out.println("Sueldo de pepe Argento");
        Cadete pepe = new Cadete();
        System.out.println(String.format("El sueldo total del empleado es %f",
                pepe.calcularSueldoTotal(0)
        ));
}
}
