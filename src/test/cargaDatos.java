package test;

import java.io.FileWriter;
import java.io.Writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import model.*;

public class cargaDatos {

	public static void main(String[] args) {
		SistemaFarmacia sf = new SistemaFarmacia();
		
		//usuarios
		Cliente c1 = new Cliente("45678883", "Luis", "Style", "Princes Park 345", null, false);
		Cliente c2 = new Cliente("10236446", "Enrique", "Windsor", "Coronel Rosales 456", new ObraSocial("OSDE"), true);
		sf.agregaCliente(c1);
		sf.agregaCliente(c2);
		
		Empleado e1 = new Empleado("40893284", "homero", "simpson", "siempreviva 123", new ObraSocial("AMFFA"),"23-40893284-2");
		Empleado e2 = new Empleado("123456784", "Lisa", "Mansilla", "Cornelia Street 1313", new ObraSocial("OSDE"), "27-37896347-7");
		Empleado e3 = new Empleado("27895325", "Rosa", "Campo", "Salvador 3455", new ObraSocial("OSECAC"),"23-33895689-6");
		sf.agregarEmpleado(e1);
		sf.agregarEmpleado(e2);
		
		//Sucursales
		Sucursal s1 = new Sucursal("Farmacia Pompeo", 1, e1, "Yrigoyen 2627");
		s1.agregarEmpleado(e1);
		s1.agregarEmpleado(e2);
		s1.agregarEmpleado(e3);
		sf.agregarSucursal(s1);
		
		//Productos 
		TipoProducto med = new TipoProducto("medicamento");
		TipoProducto per = new TipoProducto("perfumeria");
		
		Laboratorio bay = new Laboratorio("Bayer");
		Laboratorio mop = new Laboratorio("Montpellier");
		Laboratorio roe = new Laboratorio("Roemmers");
		Laboratorio raf = new Laboratorio("Raffo");
		
		Producto p1 = new Producto("1245BAY", 180.5, "bayaspirina 30 com", med, bay);
		Producto p2 = new Producto("3465MOP", 578.8, "Dbi 500Mg 60 Com", med, mop);
		Producto p3 = new Producto("1456ABH", 156, "Her Secret 80 ml", per, null);
		sf.agregarProducto(p1);
		sf.agregarProducto(p2);
		sf.agregarProducto(p3);
		
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String sfJson = gson.toJson(sf);
		try {
			Writer w = new FileWriter("./json/database.json");
			gson.toJson(sf, w);
			w.close();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(sfJson);
		
		
		
		
	}
	

}
