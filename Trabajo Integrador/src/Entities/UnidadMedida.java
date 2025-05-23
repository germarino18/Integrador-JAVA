package Entities;

import java.util.HashSet;
import java.util.Set;

public class UnidadMedida extends Base{
    private String denominacion;
    private Set<Articulo> articulos = new HashSet<>();;

    //Constructor
    public UnidadMedida(String denominacion) {
        this.denominacion = denominacion;
    }

    //Getter y Setter
    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Set<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(Set<Articulo> articulos) {
        this.articulos = articulos;
    }
}
