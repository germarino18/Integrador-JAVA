package Entities;

import java.util.List;
import java.util.Set;

public class Localidad extends Base {
    private String nombre;
    private Set<Domicilio> domicilios;
    private Provincia provincia;
}
