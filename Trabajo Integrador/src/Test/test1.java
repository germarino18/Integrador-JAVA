package Test;

import java.time.LocalDate;
import java.time.LocalTime;

import Entities.*;
import Enums.*;

public class test1 {

	public static void main(String[] args) {

		// DATOS GEOGRAFICOS
		// Paises
		Pais argentina = new Pais(5, "Argentina");

		// Provincias
		Provincia mendoza = new Provincia(6, "Mendoza");

		// Localidades
		Localidad godoyCruz = new Localidad(4, "Godoy Cruz");

		// Domicilios
		Domicilio sanMartinSur = new Domicilio(3, "San Martin Sur", 2896, 5500);

		// Agregar datos geograficos
		sanMartinSur.setLocalidad(godoyCruz);
		argentina.agregarProvincia(mendoza);
		mendoza.agregarLocalidad(godoyCruz);
		godoyCruz.agregarDomicilio(sanMartinSur);

		// -------------------------------------------------------
		// DATOS DE EMPRESA
		// Crea la empresa
		Empresa buenSabor = new Empresa(1, "Buen Sabor", "Desarrollos Gastronomicos S.A.", 308596321);

		// Sucursales de Buen Sabor
		Sucursal sucMendoza = new Sucursal(2, "Mendoza", LocalTime.of(8, 0), LocalTime.of(21, 0), sanMartinSur);

		// Agregar a sucursal
		buenSabor.agregarSucursal(sucMendoza);

		// Muestro empresa
		System.out.println(buenSabor.toString());

		// -------------------------------------------------------
		// CLIENTES
		// Crear cliente
		Cliente charlyCimino = new Cliente(7, "Charly", "Cimino", "49325322", "ciminocharly@gmail.com",
				LocalDate.of(1986, 02, 12));

		// -------------------------------------------------------
		// USUARIOS
		// Crear usuario
		Usuario charly = new Usuario(8, "6543284", "elCharlyOk", charlyCimino);

		// Crear imagen
		Imagen foto = new Imagen(9, "fotoCharlyEnLaPlaya.jpg");
		charlyCimino.setImagen(foto);

		// Muestro usuario
		System.out.println(charlyCimino.toString());

		// -------------------------------------------------------
		// ARTICULOS
		// Crear articulos insumo
		ArticuloInsumo harina = new ArticuloInsumo(12, "Harina", 152000.00, new UnidadMedida(11, "Kilos"), 350000.00,
				52, 100, true);

		// Crear articulos
		ArticuloManufacturado empanada = new ArticuloManufacturado(10, "Empanada", 1250.00,
				new UnidadMedida(11, "Kilos"), "Empanadas fritas", 15, "Amasado");
		
		//Agregar detalle a los articulos
		harina.agregarDetalle(new ArticuloManufacturadoDetalle(5));
		empanada.agregarDetalle(new ArticuloManufacturadoDetalle(10));
		
		//Muestro articulos
		System.out.println(harina.toString() + "\n" + empanada.toString());
		
		
		// -------------------------------------------------------
		// PROMOCIÓN
		
		// -------------------------------------------------------
		// CATEGORÍA
		
		// -------------------------------------------------------
		// PEDIDO

	}

}
