package datos;

import java.util.Date;

public class Venta {
	public Date fecha;
	public int nroTicket;
	public FormaPago formaPago;
	public float totalVenta;
	public Usuario vendedor;
	public Usuario cobrador;
	public Usuario cliente;
	public int ptoVenta;
	public Sucursal sucursal;

	public Venta(Date fecha, int nroTicket, FormaPago formaPago, float totalVenta, Usuario vendedor, Usuario cobrador,
			Usuario cliente, int ptoVenta, Sucursal sucursal) {
		this.fecha = fecha;
		this.nroTicket = nroTicket;
		this.formaPago = formaPago;
		this.totalVenta = totalVenta;
		this.vendedor = vendedor;
		this.cobrador = cobrador;
		this.cliente = cliente;
		this.ptoVenta = ptoVenta;
		this.sucursal = sucursal;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getNroTicket() {
		return nroTicket;
	}

	public void setNroTicket(int nroTicket) {
		this.nroTicket = nroTicket;
	}

	public FormaPago getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}

	public float getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(float totalVenta) {
		this.totalVenta = totalVenta;
	}

	public Usuario getVendedor() {
		return vendedor;
	}

	public void setVendedor(Usuario vendedor) {
		this.vendedor = vendedor;
	}

	public Usuario getCobrador() {
		return cobrador;
	}

	public void setCobrador(Usuario cobrador) {
		this.cobrador = cobrador;
	}

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public int getPtoVenta() {
		return ptoVenta;
	}

	public void setPtoVenta(int ptoVenta) {
		this.ptoVenta = ptoVenta;
	}

	public Sucursal getSucursal() {
		return sucursal;
	}

	public void setSucursal(Sucursal sucursal) {
		this.sucursal = sucursal;
	}

	public String toString() {
		return "Venta [fecha=" + fecha + ", nroTicket=" + nroTicket + ", formaPago=" + formaPago + ", totalVenta="
				+ totalVenta + ", vendedor=" + vendedor + ", cobrador=" + cobrador + ", cliente=" + cliente
				+ ", ptoVenta=" + ptoVenta + ", sucursal=" + sucursal + "]";
	}

}
