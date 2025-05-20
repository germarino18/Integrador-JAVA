package Entities;

import java.util.List;
import java.util.Set;

public class Empresa extends Base {
    private String nombre;
    private String razonSocial;
    private int cuil;
    private Set<Sucursal> sucursales;
}
