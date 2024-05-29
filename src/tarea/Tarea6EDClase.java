/*
*/
package tarea;
/**
 * La clase Tarea6EDClase proporciona métodos para aplicar descuentos
 * a productos basados en la cantidad comprada.
 */
public class Tarea6EDClase {

    /**
     * Descuento aplicado por gran cantidad de productos.
     */
    private static final double DESCUENTO_GRAN_CANTIDAD = 5.0;// Descuento gran cantidad
    private static final double DESCUENTO_NUM_PRODUCTOS = 0.8;// Descuento numero productos
    private static final double DESCUENTO_DEFECTO = 0.95;// Descuento defecto
    private static final int UMBRAL_GRAN_CANTIDAD = 3; // Umbral gran cantidad

    /**
     * Descuento al precio del producto basado en el número de productos comprados.
     * Muestra el total a pagar.
     * @param precioPorProducto El precio por producto.
     * @param numeroDeProductos El número de productos comprados.
     */
    public void aplicarDescuento(double precioPorProducto, int numeroDeProductos) {     
        double total = calcularTotal(precioPorProducto, numeroDeProductos);
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }

    /**
     * Calcula el total a pagar después de aplicar los descuentos correspondientes
     * al precio del producto.
     * 
     * @param precioPorProducto El precio por producto.
     * @param numeroDeProductos El número de productos comprados.
     * @return El total a pagar después de aplicar los descuentos.
     */
    private double calcularTotal(double precioPorProducto, int numeroDeProductos) {
        if (numeroDeProductos > UMBRAL_GRAN_CANTIDAD) {
            precioPorProducto -= DESCUENTO_GRAN_CANTIDAD;
        }
        if (numeroDeProductos != 0) {
            return precioPorProducto * DESCUENTO_NUM_PRODUCTOS;
        } else {
            return precioPorProducto * DESCUENTO_DEFECTO;
        }
    }
}
