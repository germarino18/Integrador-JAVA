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
		Domicilio sanMartinSur = new Domicilio(3, "San Martin Sur", 2896, 5500, godoyCruz);

		// Agregar datos geograficos
		//sanMartinSur.setLocalidad(godoyCruz); Se puede quitar?
		argentina.agregarProvincia(mendoza);
		mendoza.agregarLocalidad(godoyCruz);
		godoyCruz.agregarDomicilio(sanMartinSur);
		godoyCruz.verDomicilios(); //Probando ver los domicilios de la Localidad

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
		empanada.agregarDetalle(new ArticuloManufacturadoDetalle(10)); //Faltan insumos
		
		//Muestro articulos
		System.out.println(harina.toString() + "\n" + empanada.toString());
		
		
		// -------------------------------------------------------
		// PROMOCIÓN
		// Crear Promocion
		Promocion promocion = new Promocion(13, "Promocion empanadas", LocalDate.of(2025, 05, 25), LocalDate.of(2025, 07, 25),
				LocalTime.of(00, 00), LocalTime.of(00, 00), "Empanadas Recargo Darin", 48000.00, TipoPromocion.PROMOCION1);

		//Agregando articulo e imagen
		Imagen imagen = new Imagen(14, "Empanada de oro");
		promocion.agregarArticulo(empanada);
		promocion.agregarImagen(imagen);

		//Mostrar promocion
		System.out.println(promocion);

		//Removiendo articulo e imagen
		promocion.removerArticulo(empanada);
		promocion.removerImagen(imagen);

		System.out.println(promocion);

		// -------------------------------------------------------
		// CATEGORÍA
		//Crear categoria
		Categoria categoria = new Categoria(15, "Comestible");

		//Agregando articulo y subcategoria
		categoria.agregarArticulo(empanada);
		categoria.agregarSubCategoria(new Categoria(16, "Rotiseria"));

		//Mostrar Categoria
		System.out.println(categoria);

		//Removiendo articulo y subcategoria
		categoria.removerArticulo(empanada);
		categoria.removerSubCategoria(new Categoria(16, "Rotiseria"));

		System.out.println(categoria);

		// -------------------------------------------------------
		// PEDIDO
		//Crear pedido
		Factura factura = new Factura(17, LocalDate.of(2025, 05, 27), 123, 456, "juanito.mp",
				"Transferencia", FormaPago.MERCADOPAGO, 55000.00);
		Pedido pedido = new Pedido(18, LocalTime.of(21, 30), 55000.00, 48000.00, Estado.PREPARACION, TipoEnvio.DELIVERY, FormaPago.MERCADOPAGO,
				LocalDate.of(2025, 05, 27), sanMartinSur, sucMendoza, factura);

		//Agregando detalles del pedido
		DetallePedido detallePedido = new DetallePedido(19, 12, 48000.00, empanada);
		pedido.agregarDetallePedido(detallePedido);

		//Mostrar pedido
		System.out.println(pedido);

		//Removiendo detalles
		pedido.removerDetallePedido(detallePedido);

		System.out.println(pedido);


	}

}
