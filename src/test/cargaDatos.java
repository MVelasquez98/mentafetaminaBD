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
		/*
		02/02/2020	0001-0001	Efectivo	8908,95	23-33895689-6	23-40893284-2	40893284	0001	Farmacia Pompeo  
		02/02/2020	0002-0002	Efectivo	869,05	23-30897654-9	23-45678883-4	12356784	0002	Farmacia Pasteur
		02/02/2020	0002-0003	Efectivo	693,74	23-30897654-9	23-45678883-4	27895325	0002	Farmacia Pasteur
		02/02/2020	0003-0004	Debito	256,75	23-15789654-8	27-14678289-1	37896347	0003	Farmacia Prado
		02/02/2020	0001-0005	Debito	7910,06	23-33895689-6	23-40893284-2	32795463	0001	Farmacia Pompeo  
		03/02/2020	0001-0006	Debito	759,3	23-33895689-6	23-40893284-2	30897654	0001	Farmacia Pompeo  
		03/02/2020	0001-0007	Debito	5433,1	23-33895689-6	23-40893284-2	32098753	0001	Farmacia Pompeo  
		03/02/2020	0001-0008	Debito	869,05	23-33895689-6	23-40893284-2	33895689	0001	Farmacia Pompeo  
		03/02/2020	0002-0009	Crédito	693,74	23-30897654-9	23-45678883-4	20985432	0002	Farmacia Pasteur
		04/02/2020	0003-0010	Crédito	7564,71	23-15789654-8	27-14678289-1	23456987	0003	Farmacia Prado
		04/02/2020	0003-0011	Crédito	290,1	23-15789654-8	27-14678289-1	45678883	0003	Farmacia Prado
		04/02/2020	0001-0012	Efectivo	180,5	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		04/02/2020	0001-0013	Efectivo	4580,05	23-33895689-6	23-40893284-2	16578346	0001	Farmacia Pompeo  
		04/02/2020	0003-0014	Efectivo	693,74	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		04/02/2020	0002-0015	Debito	3110,74	23-30897654-9	23-45678883-4	12567432	0002	Farmacia Pasteur
		04/02/2020	0002-0016	Debito	290,1	23-30897654-9	23-45678883-4	16727486	0002	Farmacia Pasteur
		05/02/2020	0003-0017	Debito	180,5	23-15789654-8	27-14678289-1	14678289	0003	Farmacia Prado
		05/02/2020	0003-0018	Debito	2315,2	23-15789654-8	27-14678289-1	15789654	0003	Farmacia Prado
		05/02/2020	0003-0019	Debito	2716,55	23-15789654-8	27-14678289-1	17653476	0003	Farmacia Prado
		05/02/2020	0002-0020	Crédito	5856,45	23-30897654-9	23-45678883-4	34568217	0002	Farmacia Pasteur
		05/02/2020	0002-0021	Crédito	224,75	23-30897654-9	23-45678883-4	23456987	0002	Farmacia Pasteur
		05/02/2020	0001-0022	Crédito	1451,48	23-33895689-6	23-40893284-2	45678883	0001	Farmacia Pompeo  
		06/02/2020	0001-0023	Efectivo	10961,94	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		06/02/2020	0002-0024	Efectivo	134,1	23-30897654-9	23-45678883-4	16578346	0002	Farmacia Pasteur
		06/02/2020	0003-0025	Crédito	1025,05	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		06/02/2020	0003-0026	Debito	674,25	23-15789654-8	27-14678289-1	12567432	0003	Farmacia Prado
		06/02/2020	0002-0027	Debito	982,49	23-30897654-9	23-45678883-4	14678289	0002	Farmacia Pasteur
		06/02/2020	0002-0028	Crédito	5501,88	23-30897654-9	23-45678883-4	15789654	0002	Farmacia Pasteur
		06/02/2020	0001-0029	Debito	256,75	23-33895689-6	23-40893284-2	17653476	0001	Farmacia Pompeo  
		06/02/2020	0003-0030	Crédito	9134,95	23-33895689-6	23-40893284-2	45678883	0003	Farmacia Prado
		07/02/2020	0001-0031	Efectivo	180,5	23-33895689-6	23-40893284-2	40893284	0001	Farmacia Pompeo  
		07/02/2020	0002-0032	Efectivo	3874,15	23-30897654-9	23-45678883-4	12356784	0002	Farmacia Pasteur
		07/02/2020	0002-0033	Efectivo	831,3	23-30897654-9	23-45678883-4	27895325	0002	Farmacia Pasteur
		07/02/2020	0003-0034	Debito	9649,83	23-15789654-8	27-14678289-1	37896347	0003	Farmacia Prado
		08/02/2020	0001-0035	Debito	134,1	23-33895689-6	23-40893284-2	32795463	0001	Farmacia Pompeo  
		08/02/2020	0001-0036	Debito	156	23-33895689-6	23-40893284-2	30897654	0001	Farmacia Pompeo  
		08/02/2020	0001-0037	Debito	13795,1	23-33895689-6	23-40893284-2	32098753	0001	Farmacia Pompeo  
		08/02/2020	0001-0038	Debito	453,4	23-33895689-6	23-40893284-2	33895689	0001	Farmacia Pompeo  
		08/02/2020	0002-0039	Crédito	224,75	23-30897654-9	23-45678883-4	20985432	0002	Farmacia Pasteur
		08/02/2020	0003-0040	Crédito	4689,9	23-15789654-8	27-14678289-1	23456987	0003	Farmacia Prado
		08/02/2020	0003-0041	Crédito	2083,74	23-15789654-8	27-14678289-1	45678883	0003	Farmacia Prado
		08/02/2020	0001-0042	Efectivo	268,2	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		08/02/2020	0001-0043	Efectivo	6660,4	23-33895689-6	23-40893284-2	16578346	0001	Farmacia Pompeo  
		08/02/2020	0003-0044	Efectivo	415,65	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		08/02/2020	0002-0045	Debito	902,9	23-30897654-9	23-45678883-4	12567432	0002	Farmacia Pasteur
		08/02/2020	0002-0046	Debito	11043,52	23-30897654-9	23-45678883-4	16727486	0002	Farmacia Pasteur
		08/02/2020	0003-0047	Debito	2095,19	23-15789654-8	27-14678289-1	14678289	0003	Farmacia Prado
		09/02/2020	0003-0048	Debito	4173,35	23-15789654-8	27-14678289-1	15789654	0003	Farmacia Prado
		09/02/2020	0003-0049	Debito	4987,8	23-15789654-8	27-14678289-1	17653476	0003	Farmacia Prado
		09/02/2020	0002-0050	Crédito	678,15	23-30897654-9	23-45678883-4	34568217	0002	Farmacia Pasteur
		09/02/2020	0002-0051	Crédito	468,99	23-30897654-9	23-45678883-4	23456987	0002	Farmacia Pasteur
		09/02/2020	0001-0052	Crédito	2340,49	23-33895689-6	23-40893284-2	45678883	0001	Farmacia Pompeo  
		09/02/2020	0001-0053	Efectivo	134,1	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		09/02/2020	0002-0054	Efectivo	4727,65	23-30897654-9	23-45678883-4	16578346	0002	Farmacia Pasteur
		09/02/2020	0003-0055	Crédito	1738,1	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		09/02/2020	0003-0056	Debito	1143,24	23-15789654-8	27-14678289-1	12567432	0003	Farmacia Prado
		09/02/2020	0002-0057	Debito	6251,22	23-30897654-9	23-45678883-4	14678289	0002	Farmacia Pasteur
		09/02/2020	0002-0058	Crédito	290,1	23-30897654-9	23-45678883-4	15789654	0002	Farmacia Pasteur
		10/02/2020	0001-0059	Debito	361	23-33895689-6	23-40893284-2	17653476	0001	Farmacia Pompeo  
		10/02/2020	0003-0060	Crédito	92941,5	23-33895689-6	23-40893284-2	45678883	0003	Farmacia Prado
		10/02/2020	0001-0061	Efectivo	4259,8	23-33895689-6	23-40893284-2	40893284	0001	Farmacia Pompeo  
		10/02/2020	0002-0062	Efectivo	4048,72	23-30897654-9	23-45678883-4	12356784	0002	Farmacia Pasteur
		10/02/2020	0002-0063	Efectivo	134,1	23-30897654-9	23-45678883-4	27895325	0002	Farmacia Pasteur
		10/02/2020	0003-0064	Debito	156	23-15789654-8	27-14678289-1	37896347	0003	Farmacia Prado
		10/02/2020	0001-0065	Debito	1083	23-33895689-6	23-40893284-2	32795463	0001	Farmacia Pompeo  
		10/02/2020	0001-0066	Debito	578,8	23-33895689-6	23-40893284-2	30897654	0001	Farmacia Pompeo  
		10/02/2020	0001-0067	Debito	2716,55	23-33895689-6	23-40893284-2	32098753	0001	Farmacia Pompeo  
		10/02/2020	0001-0068	Debito	415,65	23-33895689-6	23-40893284-2	33895689	0001	Farmacia Pompeo  
		10/02/2020	0002-0069	Crédito	453,4	23-30897654-9	23-45678883-4	20985432	0002	Farmacia Pasteur
		10/02/2020	0003-0070	Crédito	899	23-15789654-8	27-14678289-1	23456987	0003	Farmacia Prado
		10/02/2020	0003-0071	Crédito	2813,94	23-15789654-8	27-14678289-1	45678883	0003	Farmacia Prado
		10/02/2020	0001-0072	Efectivo	256,75	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		10/02/2020	0001-0073	Efectivo	1826,99	23-33895689-6	23-40893284-2	16578346	0001	Farmacia Pompeo  
		10/02/2020	0003-0074	Efectivo	134,1	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		11/02/2020	0002-0075	Debito	624	23-30897654-9	23-45678883-4	12567432	0002	Farmacia Pasteur
		11/02/2020	0002-0076	Debito	536,4	23-30897654-9	23-45678883-4	16727486	0002	Farmacia Pasteur
		11/02/2020	0003-0077	Debito	180,5	23-15789654-8	27-14678289-1	14678289	0003	Farmacia Prado
		11/02/2020	0003-0078	Debito	578,8	23-15789654-8	27-14678289-1	15789654	0003	Farmacia Prado
		11/02/2020	0003-0079	Debito	5433,1	23-15789654-8	27-14678289-1	17653476	0003	Farmacia Prado
		11/02/2020	0002-0080	Crédito	1246,95	23-30897654-9	23-45678883-4	34568217	0002	Farmacia Pasteur
		12/02/2020	0002-0081	Crédito	1360,2	23-30897654-9	23-45678883-4	23456987	0002	Farmacia Pasteur
		12/02/2020	0001-0082	Crédito	224,75	23-33895689-6	23-40893284-2	45678883	0001	Farmacia Pompeo  
		12/02/2020	0001-0083	Efectivo	468,99	23-33895689-6	23-40893284-2	10236446	0001	Farmacia Pompeo  
		12/02/2020	0002-0084	Efectivo	256,75	23-30897654-9	23-45678883-4	16578346	0002	Farmacia Pasteur
		12/02/2020	0003-0085	Crédito	1826,99	23-15789654-8	27-14678289-1	14567832	0003	Farmacia Prado
		12/02/2020	0003-0086	Debito	402,3	23-15789654-8	27-14678289-1	12567432	0003	Farmacia Prado
		12/02/2020	0002-0087	Debito	312	23-30897654-9	23-45678883-4	14678289	0002	Farmacia Pasteur
		12/02/2020	0002-0088	Crédito	134,1	23-30897654-9	23-45678883-4	15789654	0002	Farmacia Pasteur
		12/02/2020	0001-0089	Debito	156	23-33895689-6	23-40893284-2	17653476	0001	Farmacia Pompeo  
		12/02/2020	0003-0090	Crédito	937,98	23-33895689-6	23-40893284-2	45678883	0003	Farmacia Prado
		*/
		
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
