/**
 * Estrategia concreta: comision del 5% de la venta.
 */
public class ComisionEstandar implements EstrategiaComision {

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * 5 / 100;
    }
}
