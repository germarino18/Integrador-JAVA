package Entities;

import Enums.TipoPromocion;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

public class Promocion extends  Base{
    private String denominacion;
    private LocalDate FechaDese;
    private LocalDate FechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
    private Set<Sucursal> sucursales;
    private Set<Imagen> imagenes;
    private Set<Articulo> articulos;
}
