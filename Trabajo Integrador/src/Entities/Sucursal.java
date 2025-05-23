package Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private Set<Promocion> promociones = new HashSet<>();;
    private Set<Categoria> categorias = new HashSet<>();;
    private Set<Pedido> pedidos = new HashSet<>();;

    //Constructor
    public Sucursal(String nombre, LocalTime horarioCierre, LocalTime horarioApertura) {
        this.nombre = nombre;
        this.horarioCierre = horarioCierre;
        this.horarioApertura = horarioApertura;
    }

    //Getter y Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public Set<Promocion> getPromociones() {
        return promociones;
    }

    public void setPromociones(Set<Promocion> promociones) {
        this.promociones = promociones;
    }

    public Set<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(Set<Categoria> categorias) {
        this.categorias = categorias;
    }

    public Set<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(Set<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
