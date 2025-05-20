package Entities;

import java.util.Set;

public abstract class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    private Set<Promocion> promociones;
    private UnidadMedida unidad;
    private Set<Imagen> imagenes;
    private Categoria categoriaArticulo;
    private Set<DetallePedido> detalles;
}
