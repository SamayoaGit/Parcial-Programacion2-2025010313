public class Vendedor extends Empleado {

    public Vendedor(String nombre, double ventasMes, EstrategiaComision estrategia) {
        super(nombre, ventasMes, estrategia);
    }

    @Override
    public void mostrarDetalle() {
        // Llamada polimorfica: el resultado depende de la estrategia asignada
        double comision = estrategia.calcularComision(ventasMes);

        System.out.println("Vendedor: " + nombre);
        System.out.println("Venta total: Q" + ventasMes);
        System.out.println("Comision: Q" + comision);
    }
}
