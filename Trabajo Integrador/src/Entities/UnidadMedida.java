package Entities;

public class UnidadMedida extends Base {
	private String denominacion;

	// Constructor

	public UnidadMedida(long id, String denominacion) {
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
		return "\nUnidadMedida [denominacion=" + denominacion + "]";
	}

}
