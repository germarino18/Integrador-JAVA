package Entities;

import java.util.Set;

public class ArticuloInsumo extends Articulo{
    private Double precioCompra;
    private int stockActual;
    private int stockMaximo;
    private boolean esParaElaborar;
    private Set<ArticuloManufacturadoDetalle> detalles;
}
