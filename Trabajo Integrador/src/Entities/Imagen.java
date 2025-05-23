package Entities;

public class Imagen extends Base{
    private String denominacion;
    private Articulo articulo;
    private Promocion promocion;
    private Cliente cliente;

    //Constructor
    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter y Setter
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public Promocion getPromocion() {
        return promocion;
    }

    public void setPromocion(Promocion promocion) {
        this.promocion = promocion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
