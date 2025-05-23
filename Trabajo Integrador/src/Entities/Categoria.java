package Entities;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends Base{
    private String denominacion;
    private Set<Categoria> subCategorias = new HashSet<>();;
    private Set<Articulo> articulos = new HashSet<>();;
    private Set<Sucursal> sucursales = new HashSet<>();;

    //Constructor
    public Categoria(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter y Setter
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

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(Set<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }
}
