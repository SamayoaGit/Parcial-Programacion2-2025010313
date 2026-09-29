public class Main {

    public static void main(String[] args) {
        Empleado vendedor = new Vendedor("Carlos Josue Samayoa Contreras", 15000.00, new ComisionPersonalizada());
        vendedor.mostrarDetalle();
    }
}
