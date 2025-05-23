package Entities;

import java.util.HashSet;
import java.util.Set;

public class Domicilio extends Base {
    private String calle;
    private int numero;
    private int cp;
    private Sucursal sucursal;
    private Localidad localidad;
    private Set<Pedido> pedidos = new HashSet<>();;
    private Set<Cliente> clientes = new HashSet<>();;

    //Constructor
    public Domicilio(String calle, int numero, int cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    //Getter y Setter
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }
}
