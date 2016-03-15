package com.inkgps.project;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

@SuppressWarnings("serial")
public class NoticiasServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<Promocion> eventosData =  new ArrayList<Promocion>();
		
		
 //INICIO EVENTO 
	   
	   Promocion evento1=  new 	Promocion();
		evento1.setDescripcion("Mas de 100 Artistas Corporales - Shows en vivo - Exposición de motos de alto cilindraje - MISS TATTOO - Bandas - DeeJays - Campeonato de boxeo tailandes - Comediantes.  mas info https://www.facebook.com/events/799794746770901/");
		evento1.setNombre("CALI INK");
		evento1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/caliink.webp");
		evento1.setFecha("Septiembre 11,12,13");
		
		Promocion evento2=  new 	Promocion();
		evento2.setDescripcion("Invitados locales, nacionales e internacionales! Muestra de suspensión corporal, exhibición de motos de alto cilindraje, Modelos, bandas en vivo, bodypaint, galería de arte y mucho mas!. mas info https://www.facebook.com/events/911687058874710/");
		evento2.setNombre("FACATATIVA INK");
		evento2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/facatativaInk.webp");
		evento2.setFecha("Octubre 10,11");	
	

	   
	   
	   //AGREGAR  ARTISTAS 
				 eventosData.add(evento1);
	   eventosData.add(evento2);    //id9
	  
	
	   //FIN AGREGAR  ARTISTAS 
	   
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < eventosData.size(); i++) {
		   JSONObject eventos =  new JSONObject();
		 
		   eventos.put("nombre", eventosData.get(i).getNombre());
		   eventos.put("descripcion", eventosData.get(i).getDescripcion());
		   eventos.put("imagen", eventosData.get(i).getImagen());
		   eventos.put("fecha", eventosData.get(i).getFecha());
		  json.add(eventos);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
