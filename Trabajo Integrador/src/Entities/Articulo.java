package Entities;

import java.util.HashSet;
import java.util.Set;

public abstract class Articulo extends Base {
	protected String denominacion;
	protected Double precioVenta;
	private UnidadMedida unidad;
	private Set<Imagen> imagenes = new HashSet<>();

	// Constructor

	public Articulo(long id, String denominacion, Double precioVenta, UnidadMedida unidad, Set<Imagen> imagenes) {
		super(id);
		this.denominacion = denominacion;
		this.precioVenta = precioVenta;
		this.unidad = unidad;
		this.imagenes = imagenes;
	}

	public Articulo(long id, String denominacion, Double precioVenta, UnidadMedida unidad) {
		super(id);
		this.denominacion = denominacion;
		this.precioVenta = precioVenta;
		this.unidad = unidad;
	}

	// Getter y Setter
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

	public void agregarImagen(Imagen imagen) {
		imagenes.add(imagen);
	}

	public void removerImagen(Imagen imagen) {
		imagenes.remove(imagen);
	}

	@Override
	public String toString() {
		return "\nArticulo [denominacion=" + denominacion + ", precioVenta=" + precioVenta + ", unidad=" + unidad
				+ ", imagenes=" + imagenes + "]";
	}

}
