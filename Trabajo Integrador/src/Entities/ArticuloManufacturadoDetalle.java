package Entities;

public class ArticuloManufacturadoDetalle {
	private int cantidad;
	private ArticuloInsumo insumo;

	// Constructor
	public ArticuloManufacturadoDetalle(int cantidad) {
		this.cantidad = cantidad;
	}

	// Getter y Setter
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public ArticuloInsumo getInsumo() {
		return insumo;
	}

	public void setInsumo(ArticuloInsumo insumo) {
		this.insumo = insumo;
	}

	@Override
	public String toString() {
		return "\nArticuloManufacturadoDetalle [cantidad=" + cantidad + ", insumo=" + insumo + "]";
	}

}
