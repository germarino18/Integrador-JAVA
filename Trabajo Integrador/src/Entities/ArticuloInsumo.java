package Entities;

import java.util.*;

public class ArticuloInsumo extends Articulo {
	private Double precioCompra;
	private int stockActual;
	private int stockMaximo;
	private boolean esParaElaborar;
	private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

	// Constructor

	public ArticuloInsumo(long id, String denominacion, Double precioVenta, UnidadMedida unidad, Set<Imagen> imagenes,
			Double precioCompra, int stockActual, int stockMaximo, boolean esParaElaborar) {
		super(id, denominacion, precioVenta, unidad, imagenes);
		this.precioCompra = precioCompra;
		this.stockActual = stockActual;
		this.stockMaximo = stockMaximo;
		this.esParaElaborar = esParaElaborar;
	}

	public ArticuloInsumo(long id, String denominacion, Double precioVenta, UnidadMedida unidad, Double precioCompra,
			int stockActual, int stockMaximo, boolean esParaElaborar) {
		super(id, denominacion, precioVenta, unidad);
		this.precioCompra = precioCompra;
		this.stockActual = stockActual;
		this.stockMaximo = stockMaximo;
		this.esParaElaborar = esParaElaborar;
	}

	// Getter y Setter

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int getStockActual() {
		return stockActual;
	}

	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}

	public int getStockMaximo() {
		return stockMaximo;
	}

	public void setStockMaximo(int stockMaximo) {
		this.stockMaximo = stockMaximo;
	}

	public boolean isEsParaElaborar() {
		return esParaElaborar;
	}

	public void setEsParaElaborar(boolean esParaElaborar) {
		this.esParaElaborar = esParaElaborar;
	}

	public void agregarDetalle(ArticuloManufacturadoDetalle detalle) {
		detalles.add(detalle);
	}

	public void removerDetalle(ArticuloManufacturadoDetalle detalle) {
		detalles.remove(detalle);
	}

	@Override
	public String toString() {
		return "\nArticuloInsumo [precioCompra=" + precioCompra + ", stockActual=" + stockActual + ", stockMaximo="
				+ stockMaximo + ", esParaElaborar=" + esParaElaborar + "]";
	}

}
