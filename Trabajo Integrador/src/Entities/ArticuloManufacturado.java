package Entities;

import java.util.HashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {
	private String descripcion;
	private int tiempoEstimadoMinutos;
	private String preparacion;
	private Set<ArticuloManufacturadoDetalle> detalles = new HashSet<>();

	// Constructor

	public ArticuloManufacturado(long id, String denominacion, Double precioVenta, UnidadMedida unidad,
			Set<Imagen> imagenes, String descripcion, int tiempoEstimadoMinutos, String preparacion) {
		super(id, denominacion, precioVenta, unidad, imagenes);
		this.descripcion = descripcion;
		this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
		this.preparacion = preparacion;
	}

	public ArticuloManufacturado(long id, String denominacion, Double precioVenta, UnidadMedida unidad,
			Set<Imagen> imagenes, String descripcion, int tiempoEstimadoMinutos, String preparacion,
			Set<ArticuloManufacturadoDetalle> detalles) {
		super(id, denominacion, precioVenta, unidad, imagenes);
		this.descripcion = descripcion;
		this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
		this.preparacion = preparacion;
		this.detalles = detalles;
	}

	public ArticuloManufacturado(long id, String denominacion, Double precioVenta, UnidadMedida unidad,
			String descripcion, int tiempoEstimadoMinutos, String preparacion) {
		super(id, denominacion, precioVenta, unidad);
		this.descripcion = descripcion;
		this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
		this.preparacion = preparacion;
	}
	
	

	// Getter y Setter
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getTiempoEstimadoMinutos() {
		return tiempoEstimadoMinutos;
	}

	public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
		this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
	}

	public String getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(String preparacion) {
		this.preparacion = preparacion;
	}

	public Set<ArticuloManufacturadoDetalle> getDetallesArticuloManufacturadoDetalle() {
		return detalles;
	}

	public void setDetallesArticuloManufacturadoDetalle(Set<ArticuloManufacturadoDetalle> detalles) {
		this.detalles = detalles;
	}

	// Metodos

	public void agregarDetalle(ArticuloManufacturadoDetalle detalle) {
		detalles.add(detalle);
	}

	public void removerDetalle(ArticuloManufacturadoDetalle detalle) {
		detalles.remove(detalle);
	}

	@Override
	public String toString() {
		return "\nArticuloManufacturado [descripcion=" + descripcion + ", tiempoEstimadoMinutos="
				+ tiempoEstimadoMinutos + ", preparacion=" + preparacion + ", detalles=" + detalles + "]";
	}

}
