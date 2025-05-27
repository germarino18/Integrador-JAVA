package Entities;

import java.time.LocalDate;
import java.util.*;

public class Cliente extends Base {
	private String nombre;
	private String apellido;
	private String telefono;
	private String email;
	private LocalDate fechaNacimiento;
	private Set<Pedido> pedidos = new HashSet<>();
	private Set<Domicilio> domicilios = new HashSet<>();
	private Imagen imagen;
	private Usuario usuario;

	// Constructor
	
	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento,
			Set<Pedido> pedidos, Set<Domicilio> domicilio, Imagen imagen, Usuario usuario) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.pedidos = pedidos;
		this.domicilios = domicilio;
		this.imagen = imagen;
		this.usuario = usuario;
	}

	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento,
			Set<Pedido> pedidos, Set<Domicilio> domicilio, Usuario usuario) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.pedidos = pedidos;
		this.domicilios = domicilio;
		this.usuario = usuario;
	}

	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento,
			Set<Pedido> pedidos, Set<Domicilio> domicilio, Imagen imagen) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.pedidos = pedidos;
		this.domicilios = domicilio;
		this.imagen = imagen;
	}

	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento,
			Imagen imagen, Usuario usuario) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.imagen = imagen;
		this.usuario = usuario;
	}

	public Cliente(long id, String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento,
			Set<Domicilio> domicilio, Imagen imagen, Usuario usuario) {
		super(id);
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
		this.domicilios = domicilio;
		this.imagen = imagen;
		this.usuario = usuario;
	}

	// Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Set<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(Set<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Set<Domicilio> getDomicilio() {
		return domicilios;
	}

	public void setDomicilio(Set<Domicilio> domicilio) {
		this.domicilios = domicilio;
	}

	public Imagen getImagen() {
		return imagen;
	}

	public void setImagen(Imagen imagen) {
		this.imagen = imagen;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	// Metodos

	public void agregarDomicilio(Domicilio domicilio) {
		domicilios.add(domicilio);
	}

	public void removerDomicilio(Domicilio domicilio) {
		domicilios.remove(domicilio);
	}

	public void agregarPedido(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void removerPedido(Pedido pedido) {
		pedidos.remove(pedido);
	}

	@Override
	public String toString() {
		return "\nCliente [nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email
				+ ", fechaNacimiento=" + fechaNacimiento + ", pedidos=" + pedidos + ", domicilios=" + domicilios
				+ ", imagen=" + imagen + ", usuario=" + usuario + "]";
	}

}
