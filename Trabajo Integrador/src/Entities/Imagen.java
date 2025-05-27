package Entities;

public class Imagen extends Base {
	private String denominacion;

	// Constructor

	public Imagen(long id, String denominacion) {
		super(id);
		this.denominacion = denominacion;
	}

	// Getter y Setter
	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	@Override
	public String toString() {
		return "\nImagen [denominacion=" + denominacion + "]";
	}

}
