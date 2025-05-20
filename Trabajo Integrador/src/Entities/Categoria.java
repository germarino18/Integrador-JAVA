package Entities;

import java.util.Set;

public class Categoria extends Base{
    private String denominacion;
    private Set<Categoria> subCategorias;
    private Set<Articulo> articulos;
    private Set<Sucursal> sucursales;
}
