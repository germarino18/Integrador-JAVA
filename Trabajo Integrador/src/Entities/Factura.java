package Entities;

import Enums.FormaPago;

import java.time.LocalDate;

public class Factura extends Base {
	private LocalDate fechaFacturacion;
	private int mpPaymentId;
	private int mpMerchantOrderId;
	private String mpPreferenceId;
	private String mpPaymentType;
	private FormaPago formaPago;
	private double totalVenta;
	private Pedido pedido;

	// Constructor

	public Factura(long id, LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String mpPreferenceId,
			String mpPaymentType, FormaPago formaPago, double totalVenta, Pedido pedido) {
		super(id);
		this.fechaFacturacion = fechaFacturacion;
		this.mpPaymentId = mpPaymentId;
		this.mpMerchantOrderId = mpMerchantOrderId;
		this.mpPreferenceId = mpPreferenceId;
		this.mpPaymentType = mpPaymentType;
		this.formaPago = formaPago;
		this.totalVenta = totalVenta;
		this.pedido = pedido;
	}

	public Factura(long id, LocalDate fechaFacturacion, int mpPaymentId, int mpMerchantOrderId, String mpPreferenceId,
			String mpPaymentType, FormaPago formaPago, double totalVenta) {
		super(id);
		this.fechaFacturacion = fechaFacturacion;
		this.mpPaymentId = mpPaymentId;
		this.mpMerchantOrderId = mpMerchantOrderId;
		this.mpPreferenceId = mpPreferenceId;
		this.mpPaymentType = mpPaymentType;
		this.formaPago = formaPago;
		this.totalVenta = totalVenta;
	}

	// Getter y Setter

	public LocalDate getFechaFacturacion() {
		return fechaFacturacion;
	}

	public void setFechaFacturacion(LocalDate fechaFacturacion) {
		this.fechaFacturacion = fechaFacturacion;
	}

	public int getMpPaymentId() {
		return mpPaymentId;
	}

	public void setMpPaymentId(int mpPaymentId) {
		this.mpPaymentId = mpPaymentId;
	}

	public int getMpMerchantOrderId() {
		return mpMerchantOrderId;
	}

	public void setMpMerchantOrderId(int mpMerchantOrderId) {
		this.mpMerchantOrderId = mpMerchantOrderId;
	}

	public String getMpPreferenceId() {
		return mpPreferenceId;
	}

	public void setMpPreferenceId(String mpPreferenceId) {
		this.mpPreferenceId = mpPreferenceId;
	}

	public String getMpPaymentType() {
		return mpPaymentType;
	}

	public void setMpPaymentType(String mpPaymentType) {
		this.mpPaymentType = mpPaymentType;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public double getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(double totalVenta) {
		this.totalVenta = totalVenta;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Override
	public String toString() {
		return "\nFactura [fechaFacturacion=" + fechaFacturacion + ", mpPaymentId=" + mpPaymentId + ", mpMerchantOrderId="
				+ mpMerchantOrderId + ", mpPreferenceId=" + mpPreferenceId + ", mpPaymentType=" + mpPaymentType
				+ ", formaPago=" + formaPago + ", totalVenta=" + totalVenta + ", pedido=" + pedido + "]";
	}

}
