package model;

public class Cliente extends Usuario {
	public boolean tieneOS;

	public Cliente(String dni, String nombre, String apellido, String direccion, ObraSocial obraSocial,
			boolean tieneOS) {
		super(dni, nombre, apellido, direccion, obraSocial);
		this.tieneOS = tieneOS;
	}

	public boolean isTieneOS() {
		return tieneOS;
	}

	public void setTieneOS(boolean tieneOS) {
		this.tieneOS = tieneOS;
	}

	public String toString() {
		return "Cliente [tieneOS=" + tieneOS + "]";
	}

}
