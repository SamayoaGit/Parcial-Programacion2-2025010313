/**
 * Contexto del patron Strategy: delega el calculo de la comision
 * en la estrategia que tenga asignada.
 */
public abstract class Empleado {

    protected String nombre;
    protected double ventasMes;
    protected EstrategiaComision estrategia;

    public Empleado(String nombre, double ventasMes, EstrategiaComision estrategia) {
        this.nombre = nombre;
        this.ventasMes = ventasMes;
        this.estrategia = estrategia;
    }

    // Inyeccion de la estrategia (patron Strategy)
    public void cambiarEstrategia(EstrategiaComision nueva) {
        this.estrategia = nueva;
    }

    public abstract void mostrarDetalle();
}
