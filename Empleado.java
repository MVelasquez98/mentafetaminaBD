package datos;

public class Empleado extends Usuario {
	public String cuil;

	public Empleado(String dni, String nombre, String apellido, String direccion, ObraSocial obraSocial, String cuil) {
		super(dni, nombre, apellido, direccion, obraSocial);
		this.cuil = cuil;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}

	public String toString() {
		return "Empleado [cuil=" + cuil + "]";
	}
}