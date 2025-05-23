package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Localidad extends Base {
    private String nombre;
    private Set<Domicilio> domicilios = new HashSet<>();;
    private Provincia provincia;

    //Constructor
    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    //Getter y Setter
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

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
}
