package Entities;

public class DetallePedido extends Base {
	private int cantidad;
	private double subTotal;
	private Articulo articulo;

	// Constructor

	public DetallePedido(long id, int cantidad, double subTotal, Articulo articulo) {
		super(id);
		this.cantidad = cantidad;
		this.subTotal = subTotal;
		this.articulo = articulo;
	}

	public DetallePedido(long id, int cantidad, double subTotal) {
		super(id);
		this.cantidad = cantidad;
		this.subTotal = subTotal;
	}

	// Getter y Setter

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "\nDetallePedido [cantidad=" + cantidad + ", subTotal=" + subTotal + ", articulo=" + articulo + "]";
	}

}
