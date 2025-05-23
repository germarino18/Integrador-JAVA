package Entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Articulo extends Base {
    protected String denominacion;
    protected Double precioVenta;
    private Set<Promocion> promociones = new HashSet<>();
    private UnidadMedida unidad;
    private Set<Imagen> imagenes = new HashSet<>();;
    private Categoria categoriaArticulo;
    private Set<DetallePedido> detalles;

    //Constructor
    public Articulo(String denominacion, Double precioVenta) {
        this.denominacion = denominacion;
        this.precioVenta = precioVenta;
    }

    //Getter y Setter
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Set<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(Set<Promocion> promociones) {
        this.promociones = promociones;
    }

    public UnidadMedida getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadMedida unidad) {
        this.unidad = unidad;
    }

    public Set<Imagen> getImagenes() {
        return imagenes;
    }

    public void setImagenes(Set<Imagen> imagenes) {
        this.imagenes = imagenes;
    }

    public Categoria getCategoriaArticulo() {
        return categoriaArticulo;
    }

    public void setCategoriaArticulo(Categoria categoriaArticulo) {
        this.categoriaArticulo = categoriaArticulo;
    }

    public Set<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setDetalles(Set<DetallePedido> detalles) {
        this.detalles = detalles;
    }
}
