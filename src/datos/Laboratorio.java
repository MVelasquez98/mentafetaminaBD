package datos;

public class Laboratorio {
	public String nombre;

	public Laboratorio(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Laboratorio [nombre=" + nombre + "]";
	}

}