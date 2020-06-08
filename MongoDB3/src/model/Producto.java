package model;

public class Producto {
	public String codNumerico;
	public double precio;
	public String descripcion;
	public TipoProducto tipoProducto;
	public Laboratorio laboratorio;

	public Producto(String codNumerico, double precio, String descripcion, TipoProducto tipoProducto,
			Laboratorio laboratorio) {
		this.codNumerico = codNumerico;
		this.precio = precio;
		this.descripcion = descripcion;
		this.tipoProducto = tipoProducto;
		this.laboratorio = laboratorio;
	}

	public String getCodNumerico() {
		return codNumerico;
	}

	public void setCodNumerico(String codNumerico) {
		this.codNumerico = codNumerico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public TipoProducto getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(TipoProducto tipoProducto) {
		this.tipoProducto = tipoProducto;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String toString() {
		return "Producto [codNumerico=" + codNumerico + ", precio=" + precio + ", descripcion=" + descripcion
				+ ", tipoProducto=" + tipoProducto + ", laboratorio=" + laboratorio + "]";
	}

}
