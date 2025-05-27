package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pais extends Base {
	private String nombre;
	private Set<Provincia> provincias = new HashSet<>();;

	// Constructor

	public Pais(long id, String nombre) {
		super(id);
		this.nombre = nombre;
	}

	public Pais(long id, String nombre, Set<Provincia> provincias) {
		super(id);
		this.nombre = nombre;
		this.provincias = provincias;
	}

	// Getter y Setter
	public Set<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(Set<Provincia> provincias) {
		this.provincias = provincias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Metodo

	public void agregarProvincia(Provincia provincia) {
		provincias.add(provincia);
	}

	public void removerProvincia(Provincia provincia) {
		provincias.remove(provincia);
	}

	@Override
	public String toString() {
		return "\nPais [nombre=" + nombre + ", provincias=" + provincias + "]";
	}

}
