package com.inkgps.project;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

@SuppressWarnings("serial")
public class ClasificadosServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<Promocion> promocionesData =  new ArrayList<Promocion>();
		
		
 //INICIO EVENTO 
	   
	   Promocion promocion1=  new 	Promocion();
		
		 Promocion promocion2=  new 	Promocion();
		
			promocion2.setNombre("TATUAJES POR UNA NAVIDAD !!");
			promocion2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/juanMahecha.jpg");
			promocion2.setFecha(" 14 de dic - 19 de dic");
			

			 
				promocion2.setDescripcion(""+
				"Te cambio un tatuaje 5x5 cm, por un juguete o regalo para un niño de"+
				" bajos recursos"+
				""+
				": condición"+
				" llevar tu regalo entre los días 23 noviembre al 12 diciembre"+
				" para apartar tu cita,"+
				" los regalos serán entregados el domingo 20 de diciembre en fundaciones"+ 
				" o algunos sectores de bogotá."+
				""+
				"Dirección de entrega: cr 13  # 60- 75 segundo piso junto al banco bbva chapinero TRECE CHIROS STORE"+
				"   GRACIAS !!!");
				
		
		
//FIN EVENTO  

	   
	   
	   //AGREGAR  ARTISTAS 
	   promocionesData.add(promocion2);
	
	   //FIN AGREGAR  ARTISTAS 
	   Collections.shuffle(promocionesData);
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < promocionesData.size(); i++) {
		   JSONObject eventos =  new JSONObject();
		 
		   eventos.put("nombre", promocionesData.get(i).getNombre());
		   eventos.put("descripcion", promocionesData.get(i).getDescripcion());
		   eventos.put("imagen", promocionesData.get(i).getImagen());
		   eventos.put("fecha", promocionesData.get(i).getFecha());
		   eventos.put("link", promocionesData.get(i).getLink());
		  json.add(eventos);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
