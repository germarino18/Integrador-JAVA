package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Pedido extends Base {
	private LocalTime horaEstimadaFinalizacion;
	private Double total;
	private Double totalCosto;
	private Estado estado;
	private TipoEnvio tipoEnvio;
	private FormaPago formaPago;
	private LocalDate fechaPedido;
	private Set<DetallePedido> detallePedido = new HashSet<>();;
	private Domicilio domicilio;
	private Sucursal sucursal;
	private Factura factura;

	// Constructor

	public Pedido(long id, LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado,
			TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Set<DetallePedido> detallePedido,
			Domicilio domicilio, Sucursal sucursal, Factura factura) {
		super(id);
		this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
		this.total = total;
		this.totalCosto = totalCosto;
		this.estado = estado;
		this.tipoEnvio = tipoEnvio;
		this.formaPago = formaPago;
		this.fechaPedido = fechaPedido;
		this.detallePedido = detallePedido;
		this.domicilio = domicilio;
		this.sucursal = sucursal;
		this.factura = factura;
	}

	public Pedido(long id, LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado,
			TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido, Domicilio domicilio, Sucursal sucursal,
			Factura factura) {
		super(id);
		this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
		this.total = total;
		this.totalCosto = totalCosto;
		this.estado = estado;
		this.tipoEnvio = tipoEnvio;
		this.formaPago = formaPago;
		this.fechaPedido = fechaPedido;
		this.domicilio = domicilio;
		this.sucursal = sucursal;
		this.factura = factura;
	}

	// Getter y Setter
	public LocalTime getHoraEstimadaFinalizacion() {
		return horaEstimadaFinalizacion;
	}

	public void setHoraEstimadaFinalizacion(LocalTime horaEstimadaFinalizacion) {
		this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getTotalCosto() {
		return totalCosto;
	}

	public void setTotalCosto(Double totalCosto) {
		this.totalCosto = totalCosto;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public TipoEnvio getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(TipoEnvio tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public LocalDate getFechaPedido() {
		return fechaPedido;
	}

	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}

	public Set<DetallePedido> getDetallePedido() {
		return detallePedido;
	}

	public void setDetallePedido(Set<DetallePedido> detallePedido) {
		this.detallePedido = detallePedido;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	// Metodo

	public void agregarDetallePedido(DetallePedido detalle) {
		detallePedido.add(detalle);
	}

	public void removerDetallePedido(DetallePedido detalle) {
		detallePedido.remove(detalle);
	}

	@Override
	public String toString() {
		return "\nPedido [horaEstimadaFinalizacion=" + horaEstimadaFinalizacion + ", total=" + total + ", totalCosto="
				+ totalCosto + ", estado=" + estado + ", tipoEnvio=" + tipoEnvio + ", formaPago=" + formaPago
				+ ", fechaPedido=" + fechaPedido + ", detallePedido=" + detallePedido + ", domicilio=" + domicilio
				+ ", sucursal=" + sucursal + ", factura=" + factura + "]";
	}

}
