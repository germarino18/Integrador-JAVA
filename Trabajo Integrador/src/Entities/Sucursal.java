package Entities;

import java.time.LocalTime;
import java.util.Set;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private Set<Promocion> promociones;
    private Set<Categoria> categorias;
    private Set<Pedido> pedidos;
}
