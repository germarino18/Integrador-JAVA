package Entities;

import java.util.*;

public class Categoria extends Base {
	private String denominacion;
	private Set<Categoria> subCategorias = new HashSet<>();
	private Set<Articulo> articulos = new HashSet<>();

	// Constructores

	public Categoria(long id, String denominacion, Set<Articulo> articulos) {
		super(id);
		this.denominacion = denominacion;
		this.articulos = articulos;
	}

	public Categoria(long id, String denominacion, Set<Categoria> subCategorias, Set<Articulo> articulos) {
		super(id);
		this.denominacion = denominacion;
		this.subCategorias = subCategorias;
		this.articulos = articulos;
	}

	// Getter y Setter

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public Set<Categoria> getSubCategorias() {
		return subCategorias;
	}

	public void setSubCategorias(Set<Categoria> subCategorias) {
		this.subCategorias = subCategorias;
	}

	public Set<Articulo> getArticulos() {
		return articulos;
	}

	public void setArticulos(Set<Articulo> articulos) {
		this.articulos = articulos;
	}

	// Metodos

	public void agregarSubCategoria(Categoria sub) {
		subCategorias.add(sub);
	}

	public void removerSubCategoria(Categoria sub) {
		subCategorias.remove(sub);
	}

	public void agregarArticulo(Articulo articulo) {
		articulos.add(articulo);
	}

	public void removerArticulo(Articulo articulo) {
		articulos.remove(articulo);
	}

	@Override
	public String toString() {
		return "\nCategoria [denominacion=" + denominacion + ", subCategorias=" + subCategorias + ", articulos="
				+ articulos + "]";
	}

}
