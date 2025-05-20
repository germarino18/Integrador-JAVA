package Entities;

import java.util.List;
import java.util.Set;

public class Provincia extends Base {
    private String nombre;
    private Set<Localidad> localidades;
    private Pais pais;
}
