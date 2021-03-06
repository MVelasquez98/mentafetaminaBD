package model;

import java.util.ArrayList;
import java.util.List;

public class SistemaFarmacia {
	private List<Usuario> usuarios;
	private List<Producto> productos;
	private List<Sucursal> sucursales;
	private List<Venta> ventas;

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

	//ABMs
	public boolean agregarCliente (Cliente c) {
		return usuarios.add(c);
	}
	public boolean agregarEmpleado(Empleado e) {
		return usuarios.add(e);
	}
	
	public boolean agregarProducto(Producto p) {
		return productos.add(p);
	}
	
	public boolean agregarSucursal (Sucursal s) {
		return sucursales.add(s);
	}
	
	public boolean agregarVenta(Venta v) {
		return ventas.add(v);
	}
}
