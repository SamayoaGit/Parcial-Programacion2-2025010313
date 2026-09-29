/**
 * Estrategia concreta: comision del (5 + N)% de la venta,
 * donde N es la cantidad de letras del primer nombre.
 */
public class ComisionPersonalizada implements EstrategiaComision {

    // "Carlos" tiene 6 letras
    private static final int LETRAS_PRIMER_NOMBRE = 6;

    @Override
    public double calcularComision(double montoVenta) {
        double porcentaje = 5 + LETRAS_PRIMER_NOMBRE; // 11%
        return montoVenta * porcentaje / 100;
    }
}
