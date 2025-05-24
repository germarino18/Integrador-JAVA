package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Promocion extends Base {
	private String denominacion;
	private LocalDate FechaDesde;
	private LocalDate FechaHasta;
	private LocalTime HoraDesde;
	private LocalTime HoraHasta;
	private String descripcionDescuento;
	private Double precioPromocional;
	private TipoPromocion tipoPromocion;
	private Set<Imagen> imagenes = new HashSet<>();
	private Set<Articulo> articulos = new HashSet<>();

	// Constructor

	public Promocion(long id, String denominacion, LocalDate fechaDese, LocalDate fechaHasta, LocalTime horaDesde,
			LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion,
			Set<Imagen> imagenes, Set<Articulo> articulos) {
		super(id);
		this.denominacion = denominacion;
		FechaDesde = fechaDese;
		FechaHasta = fechaHasta;
		HoraDesde = horaDesde;
		HoraHasta = horaHasta;
		this.descripcionDescuento = descripcionDescuento;
		this.precioPromocional = precioPromocional;
		this.tipoPromocion = tipoPromocion;
		this.imagenes = imagenes;
		this.articulos = articulos;
	}

	public Promocion(long id, String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde,
			LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion) {
		super(id);
		this.denominacion = denominacion;
		FechaDesde = fechaDesde;
		FechaHasta = fechaHasta;
		HoraDesde = horaDesde;
		HoraHasta = horaHasta;
		this.descripcionDescuento = descripcionDescuento;
		this.precioPromocional = precioPromocional;
		this.tipoPromocion = tipoPromocion;
	}

	public Promocion(long id, String denominacion, LocalDate fechaDesde, LocalDate fechaHasta, LocalTime horaDesde,
			LocalTime horaHasta, String descripcionDescuento, Double precioPromocional, TipoPromocion tipoPromocion,
			Set<Articulo> articulos) {
		super(id);
		this.denominacion = denominacion;
		FechaDesde = fechaDesde;
		FechaHasta = fechaHasta;
		HoraDesde = horaDesde;
		HoraHasta = horaHasta;
		this.descripcionDescuento = descripcionDescuento;
		this.precioPromocional = precioPromocional;
		this.tipoPromocion = tipoPromocion;
		this.articulos = articulos;
	}

	// Getter y Setter
	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public LocalDate getFechaDese() {
		return FechaDesde;
	}

	public void setFechaDese(LocalDate fechaDese) {
		FechaDesde = fechaDese;
	}

	public LocalDate getFechaHasta() {
		return FechaHasta;
	}

	public void setFechaHasta(LocalDate fechaHasta) {
		FechaHasta = fechaHasta;
	}

	public LocalTime getHoraHasta() {
		return HoraHasta;
	}

	public void setHoraHasta(LocalTime horaHasta) {
		HoraHasta = horaHasta;
	}

	public LocalTime getHoraDesde() {
		return HoraDesde;
	}

	public void setHoraDesde(LocalTime horaDesde) {
		HoraDesde = horaDesde;
	}

	public String getDescripcionDescuento() {
		return descripcionDescuento;
	}

	public void setDescripcionDescuento(String descripcionDescuento) {
		this.descripcionDescuento = descripcionDescuento;
	}

	public Double getPrecioPromocional() {
		return precioPromocional;
	}

	public void setPrecioPromocional(Double precioPromocional) {
		this.precioPromocional = precioPromocional;
	}

	public TipoPromocion getTipoPromocion() {
		return tipoPromocion;
	}

	public void setTipoPromocion(TipoPromocion tipoPromocion) {
		this.tipoPromocion = tipoPromocion;
	}

	public Set<Imagen> getImagenes() {
		return imagenes;
	}

	public void setImagenes(Set<Imagen> imagenes) {
		this.imagenes = imagenes;
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}

	// Metodos

	public void agregarImagen(Imagen imagen) {
		imagenes.add(imagen);
	}

	public void removerImagen(Imagen imagen) {
		imagenes.remove(imagen);
	}

	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
	}

	public void removerArticulo(Articulo articulo) {
		articulos.remove(articulo);
	}

	@Override
	public String toString() {
		return "\nPromocion [denominacion=" + denominacion + ", FechaDesde=" + FechaDesde + ", FechaHasta=" + FechaHasta
				+ ", HoraDesde=" + HoraDesde + ", HoraHasta=" + HoraHasta + ", descripcionDescuento="
				+ descripcionDescuento + ", precioPromocional=" + precioPromocional + ", tipoPromocion=" + tipoPromocion
				+ ", imagenes=" + imagenes + ", articulos=" + articulos + "]";
	}

}
