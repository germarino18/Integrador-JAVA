package Entities;

public class ArticuloManufacturadoDetalle {
    private int cantidad;
    private ArticuloManufacturado articuloManufacturado;
    private ArticuloInsumo insumo;

    //Constructor
    public ArticuloManufacturadoDetalle(int cantidad) {
        this.cantidad = cantidad;
    }

    //Getter y Setter
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArticuloManufacturado getArticuloManufacturado() {
        return articuloManufacturado;
    }

    public void setArticuloManufacturado(ArticuloManufacturado articuloManufacturado) {
        this.articuloManufacturado = articuloManufacturado;
    }

    public ArticuloInsumo getInsumo() {
        return insumo;
    }

    public void setInsumo(ArticuloInsumo insumo) {
        this.insumo = insumo;
    }
}
