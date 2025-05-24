package Entities;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal extends Base {
	private String nombre;
	private LocalTime horarioApertura;
	private LocalTime horarioCierre;
	private Domicilio domicilio;
	private Set<Promocion> promociones = new HashSet<>();;
	private Set<Categoria> categorias = new HashSet<>();;
	private Set<Pedido> pedidos = new HashSet<>();;

	// Constructor

	public Sucursal(long id, String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio,
			Set<Promocion> promociones, Set<Categoria> categorias, Set<Pedido> pedidos) {
		super(id);
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.domicilio = domicilio;
		this.promociones = promociones;
		this.categorias = categorias;
		this.pedidos = pedidos;
	}

	public Sucursal(long id, String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio,
			Set<Promocion> promociones, Set<Categoria> categorias) {
		super(id);
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.domicilio = domicilio;
		this.promociones = promociones;
		this.categorias = categorias;
	}

	public Sucursal(long id, String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio,
			Set<Promocion> promociones) {
		super(id);
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.domicilio = domicilio;
		this.promociones = promociones;
	}

	public Sucursal(long id, String nombre, LocalTime horarioApertura, LocalTime horarioCierre, Domicilio domicilio) {
		super(id);
		this.nombre = nombre;
		this.horarioApertura = horarioApertura;
		this.horarioCierre = horarioCierre;
		this.domicilio = domicilio;
	}

	// Getter y Setter
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

	// Metodos

	public void agregarPromocion(Promocion promocion) {
		promociones.add(promocion);
	}

	public void removerPromocion(Promocion promocion) {
		promociones.remove(promocion);
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

	public void agregarCategoria(Categoria categoria) {
		categorias.add(categoria);
	}

	public void removerCategoria(Categoria categoria) {
		categorias.remove(categoria);
	}

	@Override
	public String toString() {
		return "\nSucursal nombre=" + nombre + ", horarioApertura=" + horarioApertura + ", horarioCierre="
				+ horarioCierre + ", domicilio=" + domicilio + ", promociones=" + promociones + ", categorias="
				+ categorias + ", pedidos=" + pedidos;
	}

}
