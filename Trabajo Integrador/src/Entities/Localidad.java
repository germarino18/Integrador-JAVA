package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Localidad extends Base {
	private String nombre;
	private Set<Domicilio> domicilios = new HashSet<>();

	// Constructor
	
	public Localidad(long id, String nombre, Set<Domicilio> domicilios) {
		super(id);
		this.nombre = nombre;
		this.domicilios = domicilios;
	}

	public Localidad(long id, String nombre) {
		super(id);
		this.nombre = nombre;
	}

	public Localidad(long id) {
		super(id);
	}

	// Getter y Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Domicilio> getDomicilios() {
		return domicilios;
	}

	public void setDomicilios(Set<Domicilio> domicilios) {
		this.domicilios = domicilios;
	}

	// Metodos

	public void agregarDomicilio(Domicilio domicilio) {
		domicilios.add(domicilio);
	}

	public void removerDomicilio(Domicilio domicilio) {
		domicilios.remove(domicilio);
	}

	@Override
	public String toString() {
		return "\nLocalidad [nombre=" + nombre + ", domicilios=" + domicilios + "]";
	}

}
