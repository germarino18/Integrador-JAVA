package Entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Provincia extends Base {
    private String nombre;
    private Set<Localidad> localidades = new HashSet<>();;
    private Pais pais;

    //Constructor
    public Provincia(String nombre) {
        this.nombre = nombre;
    }

    //Getter y Setter
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}
