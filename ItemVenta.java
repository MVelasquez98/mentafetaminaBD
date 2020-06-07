package datos;

public class ItemVenta {
	public Producto producto;
	public int cantidad;
	public float precioUnitario;

	public ItemVenta(Producto producto, int cantidad, float precioUnitario) {
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public String toString() {
		return "ItemVenta [producto=" + producto + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario
				+ "]";
	}

}
