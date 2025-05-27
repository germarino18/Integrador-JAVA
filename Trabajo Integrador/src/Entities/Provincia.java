package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Provincia extends Base {
	private String nombre;
	private Set<Localidad> localidades = new HashSet<>();

	// Constructor

	public Provincia(long id, String nombre) {
		super(id);
		this.nombre = nombre;
	}

	public Provincia(long id, String nombre, Set<Localidad> localidades, Pais pais) {
		super(id);
		this.nombre = nombre;
		this.localidades = localidades;
	}

	// Getter y Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Localidad> getLocalidades() {
		return localidades;
	}

	public void setLocalidades(Set<Localidad> localidades) {
		this.localidades = localidades;
	}

	// Metodos

	public void agregarLocalidad(Localidad localidad) {
		localidades.add(localidad);
	}

	public void removerLocalidad(Localidad localidad) {
		localidades.remove(localidad);
	}

	@Override
	public String toString() {
		return "\nProvincia [nombre=" + nombre + ", localidades=" + localidades + "]";
	}

}
