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
public class PromocionesServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<Promocion> promocionesData =  new ArrayList<Promocion>();
		
		
 //INICIO EVENTO 
	   
	   Promocion promocion1=  new 	Promocion();
		promocion1.setDescripcion("En estos momentos ningun artista tiene promociones ");
		promocion1.setNombre("--");
		promocion1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/no_tenemos_promociones_inkgps.png");
		promocion1.setFecha("--");
		
		
		
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
				
		Promocion promocion3 =  new Promocion();
		promocion3.setNombre("Promo tattoo company");
		promocion3.setDescripcion("Solo por este Mes Ultima promo del año Todo Tatuaje a  $80.000* Aplican terminos y condiciones");
		promocion3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/tattoCompany.jpg");
		promocion3.setFecha("Hasta 31 Dic");
		
		Promocion promocion4 =  new Promocion();
		promocion4.setNombre("Promo academia tatuajes");
		promocion4.setDescripcion("Para mas información comunicate con nosotros: 4580464 ");
		promocion4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/academia.jpg");
		promocion4.setFecha("Hasta 31 Dic");
		
		Promocion promocion5 =  new Promocion();
		promocion5.setNombre("Promo rafel gomez");
		promocion5.setDescripcion("Ciudad de cali");
		promocion5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/rafaelGomez.jpg");
		promocion5.setFecha("2016");
		
		Promocion promocion7 =  new Promocion();
		promocion7.setNombre("Promo Sacramento Tatto");
		promocion7.setDescripcion("");
		promocion7.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/SACRAMENTO.jpg");
		promocion7.setFecha("febrero 15 - 29");
		
		Promocion promocion8 =  new Promocion();
		promocion8.setNombre("Promo Art de rue");
		promocion8.setDescripcion("");
		promocion8.setImagen("http://8-dot-inkdata-1019.appspot.com/img/promociones/ART.jpg");
		promocion8.setFecha("Febrero 14 - 17");
		
		
//FIN EVENTO  

	   
	   
	   //AGREGAR  ARTISTAS 
	  // promocionesData.add(promocion2);
	  // promocionesData.add(promocion3);
	  // promocionesData.add(promocion5);
	   promocionesData.add(promocion4);
	   promocionesData.add(promocion7);
	   promocionesData.add(promocion8);
	
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
