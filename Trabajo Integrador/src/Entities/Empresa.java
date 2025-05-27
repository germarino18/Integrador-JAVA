package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa extends Base {
	private String nombre;
	private String razonSocial;
	private int cuil;
	private Set<Sucursal> sucursales = new HashSet<>();;

	// Constructor

	public Empresa(long id, String nombre, String razonSocial, int cuil) {
		super(id);
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cuil = cuil;
	}

	public Empresa(long id, String nombre, String razonSocial, int cuil, Set<Sucursal> sucursales) {
		super(id);
		this.nombre = nombre;
		this.razonSocial = razonSocial;
		this.cuil = cuil;
		this.sucursales = sucursales;
	}

	// Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public int getCuil() {
		return cuil;
	}

	public void setCuil(int cuil) {
		this.cuil = cuil;
	}

	public Set<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(Set<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	// Métodos

	public void agregarSucursal(Sucursal sucursal) {
		sucursales.add(sucursal);
	}

	public void removerSucursal(Sucursal sucursal) {
		sucursales.remove(sucursal);
	}

	@Override
	public String toString() {
		return "\nEmpresa nombre=" + nombre + ", razonSocial=" + razonSocial + ", cuil=" + cuil + ", sucursales="
				+ sucursales;
	}

}
