package Entities;

import Enums.FormaPago;

import java.time.LocalDate;

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private int mpPaymentId;
    private int mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private FormaPago formaPago;
    private double totalVenta;
    private Pedido pedido;

}
