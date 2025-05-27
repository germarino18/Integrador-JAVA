package Entities;

public class Domicilio extends Base {
	private String calle;
	private int numero;
	private int cp;
	private Localidad localidad;

	// Constructor

	public Domicilio(long id, String calle, int numero, int cp, Localidad localidad) {
		super(id);
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.localidad = localidad;
	}

	public Domicilio(long id, String calle, int numero, int cp) {
		super(id);
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
	}

	// Getter y Setter
	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public Localidad getLocalidad() {
		return localidad;
	}

	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad; //se inicializa el ID localidad en 0 (LO CAMBIE, LOCALIDAD ERA NULL)
	}

	@Override
	public String toString() {
		return "\nDomicilio calle=" + calle + ", numero=" + numero + ", cp=" + cp + ", localidad=" + localidad;
	}

}
