package Entities;

import java.time.LocalDate;
import java.util.Set;

public class Cliente extends Base{
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Set<Pedido> pedidos;
    private Set<Domicilio> domicilio;
    private Imagen imagen;
    private Usuario usuario;
}
