package test;

import java.io.FileWriter;
import java.io.Writer;
import java.time.LocalDate;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

import model.*;

public class cargaDatos {

	public static void main(String[] args) {
		SistemaFarmacia sf = new SistemaFarmacia();
		
		//Obra social
		ObraSocial amffa = new ObraSocial("AMFFA");
		ObraSocial osde = new ObraSocial("OSDE");
		ObraSocial osecac = new ObraSocial("OSECAC");
		ObraSocial pami = new ObraSocial("PAMI");
		ObraSocial ioma = new ObraSocial("IOMA");
		
		//usuarios
		Cliente c1 = new Cliente("45678883", "Luis", "Style", "Princes Park 345", null, false); 				sf.agregarCliente(c1);
		Cliente c2 = new Cliente("10236446", "Enrique", "Windsor", "Coronel Rosales 456", osde, true); 			sf.agregarCliente(c2);
		Cliente c3 = new Cliente("23456987", "Irene", "Modesto", "Lituania 4533", osecac, true); 				sf.agregarCliente(c3);
		Cliente c4 = new Cliente("16578346", "Catalina", "Gales", "Spano 4567", osecac, true); 					sf.agregarCliente(c4);
		Cliente c5 = new Cliente("14567832", "Felipe", "Primo", "Grecia 1929", ioma, true);						sf.agregarCliente(c5);
		Cliente c6 = new Cliente("12567432", "Ariana", "Grande", "Boca Raton 3567", null, false); 				sf.agregarCliente(c6);
		Cliente c7 = new Cliente("16727486", "Diana", "Spencer", "Gran Alma 1997", amffa, true); 				sf.agregarCliente(c7);
		Cliente c8 = new Cliente("14678289", "Estefanía", "Rinaldi", "Manuel Castro 542", pami, true); 			sf.agregarCliente(c8);
		Cliente c9 = new Cliente("15789654", "Thiago", "Bedoya", "Agüero 2345", ioma, true); 					sf.agregarCliente(c9);
		Cliente c10 = new Cliente("17653476", "Federico", "Fritzenwalden", "Gral Navarro 5677", osde, true); 	sf.agregarCliente(c10);
		Cliente c11 = new Cliente("34568217", "Delfina", "Derrico", "yrigoyen 1567", osecac, true); 			sf.agregarCliente(c11);
		
		
		Empleado e1 = new Empleado("40893284", "Homero", "Simpson", "Siempreviva 123", amffa,"23-40893284-2"); 		sf.agregarEmpleado(e1);
		Empleado e2 = new Empleado("123456784", "Lisa", "Mansilla", "Cornelia Street 1313", osde, "27-37896347-7"); sf.agregarEmpleado(e2);
		Empleado e3 = new Empleado("27895325", "Rosa", "Campo", "Salvador 3455", osecac,"23-33895689-6"); 			sf.agregarEmpleado(e3);
		Empleado e4 = new Empleado("37896347", "Jessica", "Martínez", "Yrigoyen 1767", pami, "23-45678883-4"); 		sf.agregarEmpleado(e4);
		Empleado e5 = new Empleado ("32795463", "Derek", "Shepherd", "Seattle 456", ioma, "27-34568217-2"); 		sf.agregarEmpleado(e5);
		Empleado e6 = new Empleado("30897654", "Patricio", "Ponce", "Lituania 4563", osde, "23-15789654-8"); 		sf.agregarEmpleado(e6);
		Empleado e7 = new Empleado("32098753", "Lexie", "Sloan", "Airplane 822", amffa, "23-30897654-9"); 			sf.agregarEmpleado(e7);
		Empleado e8 = new Empleado("33895689", "Andrés", "Rodriguez", "Hernandarias 2456", pami, "27-23456987-5");	sf.agregarEmpleado(e8);
		Empleado e9 = new Empleado("20985432", "Daniel", "Mussimessi", "Baigorria 5321", amffa, "23-15789654-8");	sf.agregarEmpleado(e9);
		
		//Sucursales
		Sucursal s1 = new Sucursal("Farmacia Pompeo", 1, e1, "Yrigoyen 2627");
		s1.agregarEmpleado(e1); s1.agregarEmpleado(e2); s1.agregarEmpleado(e3);
		sf.agregarSucursal(s1);
		Sucursal s2 = new Sucursal("Farmacia Pasteur", 2, e4, "Condarco 675");
		s2.agregarEmpleado(e4); s2.agregarEmpleado(e5); s2.agregarEmpleado(e6);
		sf.agregarSucursal(s2);
		Sucursal s3 = new Sucursal("Farmacia Prado", 3, e7, "Laprida 2356");
		s3.agregarEmpleado(e7); s3.agregarEmpleado(e8); s3.agregarEmpleado(e9);
		sf.agregarSucursal(s3);
		
		//Productos 
		TipoProducto med = new TipoProducto("medicamento");
		TipoProducto per = new TipoProducto("perfumeria");
		
		Laboratorio bay = new Laboratorio("Bayer");
		Laboratorio mop = new Laboratorio("Montpellier");
		Laboratorio roe = new Laboratorio("Roemmers");
		Laboratorio raf = new Laboratorio("Raffo");
		
		Producto p1 = new Producto("1245BAY", 180.5, "bayaspirina 30 com", med, bay); 			sf.agregarProducto(p1);
		Producto p2 = new Producto("3465MOP", 578.8, "Dbi 500Mg 60 Com", med, mop);				sf.agregarProducto(p2);
		Producto p3 = new Producto("3475MOP", 2716.55, "Dbi Ap 850mg 60 Com", med, mop);		sf.agregarProducto(p3);
		Producto p4 = new Producto("1234ROE", 415.65, "Amoxidal 500mg 20Com", med, roe);		sf.agregarProducto(p4);
		Producto p5 = new Producto("1222ROE", 453.4, "Amoxidal Duo Jarabe", med, roe);			sf.agregarProducto(p5);
		Producto p6 = new Producto("2727RAF", 224.75, "Aerotina 10 mg 10Com", med, raf);		sf.agregarProducto(p6);
		Producto p7 = new Producto("4098RAF", 468.99, "Flexidol Relax 10 Com", med, raf);		sf.agregarProducto(p7);
		Producto p8 = new Producto("1452BAY", 256.75, "Bayaspirina 50 com", med, bay);			sf.agregarProducto(p8);
		Producto p9 = new Producto("1456ABH", 156, "Her Secret 80 ml", per, null);				sf.agregarProducto(p9);
		Producto p10 = new Producto("1477AXX", 134.1, "Axe Marine x 150 ml", per, null);		sf.agregarProducto(p10);
		Producto p11 = new Producto("1356DOV", 156,  "Dove Invisible Care 150 ml", per, null); 	sf.agregarProducto(p11);
		
		//Forma de pago
		FormaPago ef = new FormaPago("Efectivo");
		FormaPago deb = new FormaPago("Débito");
		FormaPago cre = new FormaPago("Crédito");
		
		//ventas
		
		//Venta v = new Venta(fecha, nroTicket, formaPago, vendedor, cobrador, cliente, sucursal)
		Venta v1 = new Venta("02/02/2020", "0001-0001", ef, e2, e1, c1, s1);
		v1.agregarItemVenta(new ItemVenta(p1, 1));
		v1.agregarItemVenta(new ItemVenta(p2, 1));
		v1.agregarItemVenta(new ItemVenta(p3, 3));
		v1.calcularTotalVenta();
		sf.agregarVenta(v1);
		
		Venta v2 = new Venta("02/02/2020", "0002-0002", ef, e5, e4, c2, s2);
		v2.agregarItemVenta(new ItemVenta(p4, 1));
		v2.agregarItemVenta(new ItemVenta(p5, 1));
		v2.calcularTotalVenta();
		sf.agregarVenta(v2);
		
		Venta v3 = new Venta("02/02/2020", "0002-0003", ef, e6, e4, c3, s2);
		v3.agregarItemVenta(new ItemVenta(p6, 1));
		v3.agregarItemVenta(new ItemVenta(p7, 1));
		v3.calcularTotalVenta();
		sf.agregarVenta(v3);
		
		Venta v4 = new Venta("02/02/2020", "0003-0004", deb, e8, e7, c4, s3);
		v4.agregarItemVenta(new ItemVenta(p8, 1));
		v4.calcularTotalVenta();
		sf.agregarVenta(v4);
		
		Venta v5 = new Venta("02/02/2020", "0001-0005", deb, e3, e1, c5, s1);
		v5.agregarItemVenta(new ItemVenta(p9, 4));
		v5.agregarItemVenta(new ItemVenta(p10, 1));
		v5.agregarItemVenta(new ItemVenta(p11, 3));
		v5.calcularTotalVenta();
		sf.agregarVenta(v5);
		
		Venta v6 = new Venta("03/02/2020", "0001-0006", deb, e2, e1, c6, s1);
		v6.agregarItemVenta(new ItemVenta(p1, 1));
		v6.agregarItemVenta(new ItemVenta(p2, 1));
		v6.calcularTotalVenta();
		sf.agregarVenta(v6);
		
		Venta v7 = new Venta("03/02/2020", "0001-0007", deb, e3, e1, c7, s1);
		v7.agregarItemVenta(new ItemVenta(p3, 2));
		v7.calcularTotalVenta();
		sf.agregarVenta(v7);
		
		Venta v8 = new Venta("03/02/2020", "0001-0008", deb, e2, e1, c8, s1);
		v8.agregarItemVenta(new ItemVenta(p4, 1));
		v8.agregarItemVenta(new ItemVenta(p5, 1));
		v8.calcularTotalVenta();
		sf.agregarVenta(v8);
		
		Venta v9 = new Venta("03/02/2020", "0002-0009", deb, e5, e4, c9, s2);
		v9.agregarItemVenta(new ItemVenta(p6, 1));
		v9.agregarItemVenta(new ItemVenta(p7, 1));
		v9.calcularTotalVenta();
		sf.agregarVenta(v9);
		
		Venta v10 = new Venta("03/02/2020", "0003-0010", cre, e8, e7, c10, s3);
		v10.agregarItemVenta(new ItemVenta(p8, 1));
		v10.agregarItemVenta(new ItemVenta(p9, 4));
		v10.calcularTotalVenta();
		sf.agregarVenta(v10);
		
		Venta v11 = new Venta("03/02/2020", "0003-0011", cre, e9, e7, c11, s3);
		v11.agregarItemVenta(new ItemVenta(p10, 1));
		v11.agregarItemVenta(new ItemVenta(p11, 1));
		v11.calcularTotalVenta();
		sf.agregarVenta(v11);
		
		Venta v12 = new Venta("04/02/2020", "0001-0012", ef, e2, e1, c1, s1);
		v12.agregarItemVenta(new ItemVenta(p1, 1));
		v12.calcularTotalVenta();
		sf.agregarVenta(v12);
		
		Venta v13 = new Venta("04/02/2020", "0001-0013", ef, e3, e1, c2, s1);
		v13.agregarItemVenta(new ItemVenta(p2, 1));
		v13.agregarItemVenta(new ItemVenta(p3, 1));
		v13.agregarItemVenta(new ItemVenta(p4, 2));
		v13.agregarItemVenta(new ItemVenta(p5, 1));
		v13.calcularTotalVenta();
		sf.agregarVenta(v13);
		
		Venta v14 = new Venta("04/02/2020", "0003-0014", ef, e8, e7, c3, s3);
		v14.agregarItemVenta(new ItemVenta(p6, 1));
		v14.agregarItemVenta(new ItemVenta(p7, 1));
		v14.calcularTotalVenta();
		sf.agregarVenta(v14);
		
		Venta v15 = new Venta("04/02/2020", "0002-0015", deb, e5, e4, c4, s2);
		v15.agregarItemVenta(new ItemVenta(p8, 5));
		v15.agregarItemVenta(new ItemVenta(p9, 1));
		v15.calcularTotalVenta();
		sf.agregarVenta(v15);
		
		Venta v16 = new Venta("04/02/2020", "0002-0016", deb, e6, e4, c5, s2);
		v16.agregarItemVenta(new ItemVenta(p10, 1));
		v16.agregarItemVenta(new ItemVenta(p11, 1));
		v16.calcularTotalVenta();
		sf.agregarVenta(v16);
		
		Venta v17= new Venta("05/02/2020", "0003-0017", deb, e8, e7, c6, s3);
		v17.agregarItemVenta(new ItemVenta(p1, 1));
		v17.calcularTotalVenta();
		sf.agregarVenta(v17);
		
		Venta v18= new Venta("05/02/2020", "0003-0018", deb, e9, e7, c7, s3);
		v18.agregarItemVenta(new ItemVenta(p2, 4));
		v18.calcularTotalVenta();
		sf.agregarVenta(v18);
		
		Venta v19= new Venta("05/02/2020", "0003-0019", deb, e8, e7, c8, s3);
		v19.agregarItemVenta(new ItemVenta(p3, 1));
		v19.calcularTotalVenta();
		sf.agregarVenta(v19);
		
		Venta v20= new Venta("05/02/2020", "0002-0020", cre, e5, e4, c9, s2);
		v20.agregarItemVenta(new ItemVenta(p4, 1));
		v20.agregarItemVenta(new ItemVenta(p5, 12));
		v20.calcularTotalVenta();
		sf.agregarVenta(v20);
		
		Venta v21= new Venta("05/02/2020", "0002-0021", cre, e6, e4, c10, s2);
		v21.agregarItemVenta(new ItemVenta(p6, 1));
		v21.calcularTotalVenta();
		sf.agregarVenta(v21);
		
		Venta v22= new Venta("05/02/2020", "0001-0022", cre, e2, e1, c11, s1);
		v22.agregarItemVenta(new ItemVenta(p7, 2));
		v22.agregarItemVenta(new ItemVenta(p8, 2));
		v22.calcularTotalVenta();
		sf.agregarVenta(v22);
		
		Venta v23= new Venta("06/02/2020", "0001-0023", cre, e3, e1, c1, s1);
		v23.agregarItemVenta(new ItemVenta(p9, 6));
		v23.calcularTotalVenta();
		sf.agregarVenta(v23);
		
		Venta v24= new Venta("06/02/2020", "0002-0024", ef, e5, e4, c2, s2);
		v24.agregarItemVenta(new ItemVenta(p10, 1));
		v24.calcularTotalVenta();
		sf.agregarVenta(v24);	
		
		Venta v25= new Venta("06/02/2020", "0003-0025", cre, e8, e7, c3, s3);
		v25.agregarItemVenta(new ItemVenta(p11, 1));
		v25.agregarItemVenta(new ItemVenta(p4, 1));
		v25.agregarItemVenta(new ItemVenta(p5, 1));
		v25.calcularTotalVenta();
		sf.agregarVenta(v25);	
		
		Venta v26= new Venta("06/02/2020", "0003-0026", deb, e9, e7, c4, s3);
		v26.agregarItemVenta(new ItemVenta(p6, 3));
		v26.calcularTotalVenta();
		sf.agregarVenta(v26);

		Venta v27= new Venta("06/02/2020", "0002-0027", deb, e5, e4, c5, s2);
		v27.agregarItemVenta(new ItemVenta(p7, 1));
		v27.agregarItemVenta(new ItemVenta(p8, 2));
		v27.calcularTotalVenta();
		sf.agregarVenta(v27);
		
		Venta v28= new Venta("06/02/2020", "0002-0028", cre, e8, e7, c6, s2);
		v28.agregarItemVenta(new ItemVenta(p9, 1));
		v28.agregarItemVenta(new ItemVenta(p4, 5));
		v28.agregarItemVenta(new ItemVenta(p5, 1));
		v28.agregarItemVenta(new ItemVenta(p6, 3));
		v28.agregarItemVenta(new ItemVenta(p7, 1));
		v28.calcularTotalVenta();
		sf.agregarVenta(v28);

		Venta v29= new Venta("06/02/2020", "0001-0029", deb, e2, e1, c7, s1);
		v29.agregarItemVenta(new ItemVenta(p8, 1));
		v29.calcularTotalVenta();
		sf.agregarVenta(v29);
		
		Venta v30= new Venta("06/02/2020", "0003-0030", cre, e8, e7, c8, s3);
		v30.agregarItemVenta(new ItemVenta(p9, 5));
		v30.calcularTotalVenta();
		sf.agregarVenta(v30);
		
		Venta v31= new Venta("07/02/2020", "0001-0031", ef, e2, e1, c9, s1);
		v31.agregarItemVenta(new ItemVenta(p1, 1));
		v31.calcularTotalVenta();
		sf.agregarVenta(v31);
		
		Venta v32= new Venta("07/02/2020", "0002-0032", ef, e5, e4, c10, s2);
		v32.agregarItemVenta(new ItemVenta(p2, 2));
		v32.agregarItemVenta(new ItemVenta(p3, 2));
		v32.calcularTotalVenta();
		sf.agregarVenta(v32);
		
		Venta v33= new Venta("07/02/2020", "0002-0033", ef, e6, e4, c11, s2);
		v33.agregarItemVenta(new ItemVenta(p4, 2));
		v33.calcularTotalVenta();
		sf.agregarVenta(v33);
		
		Venta v34= new Venta("07/02/2020", "0003-0034", deb, e8, e7, c1, s3);
		v34.agregarItemVenta(new ItemVenta(p5, 1));
		v34.agregarItemVenta(new ItemVenta(p6, 1));
		v34.agregarItemVenta(new ItemVenta(p7, 3));
		v34.agregarItemVenta(new ItemVenta(p8, 1));
		v34.agregarItemVenta(new ItemVenta(p9, 4));
		v34.calcularTotalVenta();
		sf.agregarVenta(v34);
		
		Venta v35= new Venta("08/02/2020", "0001-0035", deb, e2, e1, c2, s1);
		v35.agregarItemVenta(new ItemVenta(p10, 1));
		v35.calcularTotalVenta();
		sf.agregarVenta(v35);
		
		Venta v36= new Venta("08/02/2020", "0001-0036", deb, e3, e1, c3, s1);
		v36.agregarItemVenta(new ItemVenta(p11, 1));
		v36.calcularTotalVenta();
		sf.agregarVenta(v36);
		
		Venta v37= new Venta("08/02/2020", "0001-0037", deb, e2, e1, c4, s1);
		v37.agregarItemVenta(new ItemVenta(p1, 2));
		v37.agregarItemVenta(new ItemVenta(p2, 2));
		v37.agregarItemVenta(new ItemVenta(p3, 1));
		v37.agregarItemVenta(new ItemVenta(p4, 23));
		v37.calcularTotalVenta();
		sf.agregarVenta(v37);
		
		Venta v38= new Venta("08/02/2020", "0001-0038", deb, e3, e1, c5, s1);
		v38.agregarItemVenta(new ItemVenta(p5, 1));
		v38.calcularTotalVenta();
		sf.agregarVenta(v38);
		
		Venta v39 = new Venta("08/02/2020", "0002-0039", cre, e5, e4, c6, s2);
		v39.agregarItemVenta(new ItemVenta(p6,1));
		v39.calcularTotalVenta();	sf.agregarVenta(v39);
		
		Venta v40 = new Venta("08/02/2020", "0003-0040", cre, e8, e7, c7, s3);
		v40.agregarItemVenta(new ItemVenta(p7,10));
		v40.calcularTotalVenta();	sf.agregarVenta(v40);
		
		Venta v41 = new Venta("08/02/2020", "0003-0041", cre, e9, e7, c8, s3);
		v41.agregarItemVenta(new ItemVenta(p8,1));
		v41.calcularTotalVenta();	sf.agregarVenta(v41);
		
		Venta v42 = new Venta("08/02/2020", "0001-0042", ef, e2, e1, c9, s1);
		v42.agregarItemVenta(new ItemVenta(p9,1));
		v42.agregarItemVenta(new ItemVenta(p10,2));
		v42.calcularTotalVenta();	sf.agregarVenta(v42);
		
		Venta v43 = new Venta("08/02/2020", "0001-0043", ef, e3, e1, c10, s1);
		v43.agregarItemVenta(new ItemVenta(p11,3));
		v43.calcularTotalVenta();	sf.agregarVenta(v43);
		
		Venta v44 = new Venta("08/02/2020", "0003-0044", ef, e8, e7, c11, s3);
		v44.agregarItemVenta(new ItemVenta(p1,1));
		v44.agregarItemVenta(new ItemVenta(p4,1));
		v44.calcularTotalVenta(); 	sf.agregarVenta(v44);
		
		Venta v45 = new Venta("08/02/2020", "0002-0045", deb, e5, e4, c1, s2);
		v45.agregarItemVenta(new ItemVenta(p2,1));
		v45.agregarItemVenta(new ItemVenta(p5,1));
		v45.calcularTotalVenta(); 	sf.agregarVenta(v45);

		Venta v46 = new Venta("08/02/2020", "0002-0046", deb, e6, e4, c2, s2);
		v46.agregarItemVenta(new ItemVenta(p3,2));
		v46.agregarItemVenta(new ItemVenta(p6,2));
		v46.agregarItemVenta(new ItemVenta(p7,23));
		v46.agregarItemVenta(new ItemVenta(p8,1));
		v46.calcularTotalVenta(); sf.agregarVenta(v46);

		Venta v47 = new Venta("08/02/2020", "0003-0047", deb, e9, e7, c3, s3);
		v47.agregarItemVenta(new ItemVenta(p9,1));
		v47.agregarItemVenta(new ItemVenta(p10,2));
		v47.calcularTotalVenta(); sf.agregarVenta(v47);

		Venta v48 = new Venta("09/02/2020", "0003-0048", deb, e8, e7, c4, s3);
		v48.agregarItemVenta(new ItemVenta(p11,1));
		v48.calcularTotalVenta(); sf.agregarVenta(v48);

		Venta v49 = new Venta("09/02/2020", "0003-0049", deb, e9, e7, c5, s3);
		v49.agregarItemVenta(new ItemVenta(p1,4));
		v49.agregarItemVenta(new ItemVenta(p4,12));
		v49.calcularTotalVenta(); sf.agregarVenta(v49);

		Venta v50 = new Venta("09/02/2020", "0002-0050", cre, e5, e4, c6, s2);
		v50.agregarItemVenta(new ItemVenta(p2,1));
		v50.agregarItemVenta(new ItemVenta(p5,1));
		v50.calcularTotalVenta(); sf.agregarVenta(v50);

		Venta v51 = new Venta("09/02/2020", "0002-0051", cre, e6, e4, c7, s2);
		v51.agregarItemVenta(new ItemVenta(p3,1));
		v51.agregarItemVenta(new ItemVenta(p6,1));
		v51.agregarItemVenta(new ItemVenta(p7,1));
		v51.calcularTotalVenta(); sf.agregarVenta(v51);

		Venta v52 = new Venta("09/02/2020", "0001-0052", cre, e2, e1, c8, s1);
		v52.agregarItemVenta(new ItemVenta(p8,2));
		v52.calcularTotalVenta(); sf.agregarVenta(v52);

		Venta v53 = new Venta("09/02/2020", "0001-0053", ef, e3, e1, c9, s1);
		v53.agregarItemVenta(new ItemVenta(p9,1));
		v53.agregarItemVenta(new ItemVenta(p10,1));
		v53.calcularTotalVenta(); sf.agregarVenta(v53);

		Venta v54 = new Venta("09/02/2020", "0002-0054", ef, e5, e4, c10, s2);
		v54.agregarItemVenta(new ItemVenta(p11,2));
		v54.agregarItemVenta(new ItemVenta(p1,3));
		v54.agregarItemVenta(new ItemVenta(p2,2));
		v54.agregarItemVenta(new ItemVenta(p3,1));
		v54.calcularTotalVenta(); sf.agregarVenta(v54);

		Venta v55 = new Venta("09/02/2020", "0003-0055", cre, e8, e7, c11, s3);
		v55.agregarItemVenta(new ItemVenta(p4,2));
		v55.agregarItemVenta(new ItemVenta(p5,2));
		v55.calcularTotalVenta(); sf.agregarVenta(v55);

		Venta v56 = new Venta("09/02/2020", "0003-0056", deb, e8, e7, c1, s3);
		v56.agregarItemVenta(new ItemVenta(p6,3));
		v56.agregarItemVenta(new ItemVenta(p7,1));
		v56.calcularTotalVenta(); sf.agregarVenta(v56);

		Venta v57 = new Venta("09/02/2020", "0002-0057", deb, e6, e4, c2, s2);
		v57.agregarItemVenta(new ItemVenta(p8,3));
		v57.agregarItemVenta(new ItemVenta(p9,3));
		v57.calcularTotalVenta(); sf.agregarVenta(v57);

		Venta v58 = new Venta("09/02/2020", "0002-0058", cre, e5, e4, c3, s2);
		v58.agregarItemVenta(new ItemVenta(p10,1));
		v58.agregarItemVenta(new ItemVenta(p11,1));
		v58.calcularTotalVenta(); sf.agregarVenta(v58);

		Venta v59 = new Venta("10/02/2020", "0001-0059", deb, e2, e1, c4, s1);
		v59.agregarItemVenta(new ItemVenta(p1,2));
		v59.calcularTotalVenta(); sf.agregarVenta(v59);

		Venta v60 = new Venta("10/02/2020", "0003-0060", cre, e8, e7, c5, s3);
		v60.agregarItemVenta(new ItemVenta(p2,1));
		v60.agregarItemVenta(new ItemVenta(p3,34));
		v60.calcularTotalVenta(); sf.agregarVenta(v60);

		Venta v61 = new Venta("10/02/2020", "0001-0061", ef, e2, e1, c6, s1);
		v61.agregarItemVenta(new ItemVenta(p4,1));
		v61.agregarItemVenta(new ItemVenta(p5,6));
		v61.agregarItemVenta(new ItemVenta(p6,5));
		v61.calcularTotalVenta(); sf.agregarVenta(v61);

		Venta v62 = new Venta("10/02/2020", "0002-0062", ef, e5, e4, c7, s2);
		v62.agregarItemVenta(new ItemVenta(p7,2));
		v62.agregarItemVenta(new ItemVenta(p8,5));
		v62.agregarItemVenta(new ItemVenta(p9,1));
		v62.calcularTotalVenta(); sf.agregarVenta(v62);

		Venta v63 = new Venta("10/02/2020", "0002-0063", ef, e6, e4, c8, s2);
		v63.agregarItemVenta(new ItemVenta(p10,1));
		v63.calcularTotalVenta(); sf.agregarVenta(v63);

		Venta v64 = new Venta("10/02/2020", "0003-0064", deb, e8, e7, c9, s3);
		v64.agregarItemVenta(new ItemVenta(p11,1));
		v64.calcularTotalVenta(); sf.agregarVenta(v64);

		Venta v65 = new Venta("10/02/2020", "0001-0065", deb, e3, e1, c10, s1);
		v65.agregarItemVenta(new ItemVenta(p1,6));
		v65.calcularTotalVenta(); sf.agregarVenta(v65);

		Venta v66 = new Venta("10/02/2020", "0001-0066", deb, e2, e1, c11, s1);
		v66.agregarItemVenta(new ItemVenta(p2,1));
		v66.calcularTotalVenta(); sf.agregarVenta(v66);

		Venta v67 = new Venta("10/02/2020", "0001-0067", deb, e3, e1, c1, s1);
		v67.agregarItemVenta(new ItemVenta(p3,1));
		v67.calcularTotalVenta(); sf.agregarVenta(v67);

		Venta v68 = new Venta("10/02/2020", "0001-0068", deb, e2, e1, c2, s1);
		v68.agregarItemVenta(new ItemVenta(p4,1));
		v68.calcularTotalVenta(); sf.agregarVenta(v68);

		Venta v69 = new Venta("10/02/2020", "0002-0069", cre, e5, e4, c3, s2);
		v69.agregarItemVenta(new ItemVenta(p5,1));
		v69.calcularTotalVenta(); sf.agregarVenta(v69);

		Venta v70 = new Venta("10/02/2020", "0003-0070", cre, e9, e7, c4, s3);
		v70.agregarItemVenta(new ItemVenta(p6,4));
		v70.calcularTotalVenta(); sf.agregarVenta(v70);
		
		Venta v71 = new Venta("10/02/2020", "0003-0071", cre, e8, e7, c5, s3);
		v71.agregarItemVenta(new ItemVenta(p7,6));
		v71.calcularTotalVenta(); sf.agregarVenta(v71);

		Venta v72 = new Venta("10/02/2020", "0001-0072", ef, e2, e1, c6, s1);
		v72.agregarItemVenta(new ItemVenta(p8,1));
		v72.calcularTotalVenta(); sf.agregarVenta(v72);

		Venta v73 = new Venta("10/02/2020", "0001-0073", ef, e3, e1, c7, s1);
		v73.agregarItemVenta(new ItemVenta(p9,1));
		v73.calcularTotalVenta(); sf.agregarVenta(v73);

		Venta v74 = new Venta("10/02/2020", "0003-0074", ef, e8, e7, c8, s3);
		v74.agregarItemVenta(new ItemVenta(p10,1));
		v74.calcularTotalVenta(); sf.agregarVenta(v74);

		Venta v75 = new Venta("11/02/2020", "0002-0075", deb, e5, e4, c9, s2);
		v75.agregarItemVenta(new ItemVenta(p11,4));
		v75.calcularTotalVenta(); sf.agregarVenta(v75);
		
		Venta v76 = new Venta("11/02/2020", "0002-0076", deb, e6, e4, c10, s2);
		v76.agregarItemVenta(new ItemVenta(p10,4));
		v76.calcularTotalVenta(); sf.agregarVenta(v76);
		
		Venta v77 = new Venta("11/02/2020", "0003-0077", deb, e8, e7, c11, s3);
		v77.agregarItemVenta(new ItemVenta(p1,1));
		v77.calcularTotalVenta(); sf.agregarVenta(v77);
		
		Venta v78 = new Venta("11/02/2020", "0003-0078", deb, e9, e7, c1, s3);
		v78.agregarItemVenta(new ItemVenta(p2,1));
		v78.calcularTotalVenta(); sf.agregarVenta(v78);
		
		Venta v79 = new Venta("11/02/2020", "0003-0079", deb, e8, e7, c2, s3);
		v79.agregarItemVenta(new ItemVenta(p3,2));
		v79.calcularTotalVenta(); sf.agregarVenta(v79);
		
		Venta v80 = new Venta("11/02/2020", "0002-0080", cre, e5, e4, c3, s2);
		v80.agregarItemVenta(new ItemVenta(p4,3));
		v80.calcularTotalVenta(); sf.agregarVenta(v80);
		
		Venta v81 = new Venta("12/02/2020", "0002-0081", cre, e6, e4, c4, s2);
		v81.agregarItemVenta(new ItemVenta(p5,3));
		v81.calcularTotalVenta(); sf.agregarVenta(v81);
		
		Venta v82 = new Venta("12/02/2020", "0001-0082", cre, e2, e1, c5, s1);
		v82.agregarItemVenta(new ItemVenta(p6,1));
		v82.calcularTotalVenta(); sf.agregarVenta(v82);
		
		Venta v83 = new Venta("12/02/2020", "0001-0083", ef, e2, e1, c6, s1);
		v83.agregarItemVenta(new ItemVenta(p7,1));
		v83.calcularTotalVenta(); sf.agregarVenta(v83);
		
		Venta v84 = new Venta("12/02/2020", "0002-0084", ef, e5, e4, c7, s2);
		v84.agregarItemVenta(new ItemVenta(p8,1));
		v84.calcularTotalVenta(); sf.agregarVenta(v84);
		
		Venta v85 = new Venta("12/02/2020", "0003-0085", cre, e8, e7, c8, s3);
		v85.agregarItemVenta(new ItemVenta(p9,1));
		v85.calcularTotalVenta(); sf.agregarVenta(v85);
		
		Venta v86 = new Venta("12/02/2020", "0003-0086", deb, e9, e7, c9, s3);
		v86.agregarItemVenta(new ItemVenta(p10,3));
		v86.calcularTotalVenta(); sf.agregarVenta(v86);
		
		Venta v87 = new Venta("12/02/2020", "0002-0087", deb, e5, e4, c10, s2);
		v87.agregarItemVenta(new ItemVenta(p11,2));
		v87.calcularTotalVenta(); sf.agregarVenta(v87);
		
		Venta v88 = new Venta("12/02/2020", "0002-0088", cre, e6, e4, c11, s2);
		v88.agregarItemVenta(new ItemVenta(p10,1));
		v88.calcularTotalVenta(); sf.agregarVenta(v88);
		
		Venta v89 = new Venta("12/02/2020", "0001-0089", deb, e2, e1, c1, s1);
		v89.agregarItemVenta(new ItemVenta(p11,1));
		v89.calcularTotalVenta(); sf.agregarVenta(v89);
		
		Venta v90 = new Venta("12/02/2020", "0003-0090", cre, e9, e7, c2, s3);
		v90.agregarItemVenta(new ItemVenta(p7,2));
		v90.calcularTotalVenta(); sf.agregarVenta(v90);
	
		
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
