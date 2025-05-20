package Entities;

import java.util.Set;

public class Domicilio extends Base {
    private String calle;
    private int numero;
    private int cp;
    private Sucursal sucursal;
    private Localidad localidad;
    private Set<Pedido> pedidos;
    private Set<Cliente> clientes;

}
