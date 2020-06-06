package datos;

import java.util.ArrayList;
import java.util.List;

public class SistemaFarmacia {
	public List<Usuario> usuarios;
	public List<Producto> productos;
	public List<Sucursal> sucursales;
	public List<Venta> ventas;

	public SistemaFarmacia() {
		this.usuarios = new ArrayList<Usuario>();
		this.productos = new ArrayList<Producto>();
		this.sucursales = new ArrayList<Sucursal>();
		this.ventas = new ArrayList<Venta>();
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public List<Sucursal> getSucursales() {
		return sucursales;
	}

	public void setSucursales(List<Sucursal> sucursales) {
		this.sucursales = sucursales;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	}

}
