package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pais extends Base {
    private String nombre;
    private Set<Provincia> provincias = new HashSet<>();;

    //Constructor
    public Pais(String nombre) {
        this.nombre = nombre;
    }

    //Getter y Setter
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
}
