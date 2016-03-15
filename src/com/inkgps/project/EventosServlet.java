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
public class EventosServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<Promocion> eventosData =  new ArrayList<Promocion>();
		
		
 //INICIO EVENTO 
	   
	 
	
		
		Promocion evento5=  new 	Promocion();
		evento5.setDescripcion("Armenia expo tatto");
		evento5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/armeniaExpo.jpg");
		evento5.setFecha("Diciembre 9,10 y 11");
		evento5.setLink("https://www.facebook.com/Armenia-Expo-tattoo-2015-815228808593792/");
		evento5.setNombre("2da armenia Tattoo expo");
		
		Promocion evento4=  new 	Promocion();
		evento4.setDescripcion("Los mejores tatuadores, show , musica  y danza en vivo , invitados internacionales.");
		evento4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/expotatuajeMedellin.jpg");
		evento4.setFecha("Julio 15,16,17");
		evento4.setNombre("Expo Tattoo Medellin");
		
		Promocion evento6=  new 	Promocion();
		evento6.setDescripcion("La tercera edición del Tattoo Convention Aruba se llevará a cabo los días 11 y 12 de abril 2015 en el Salón Radisson Hotel and Casino.");
		evento6.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/arubaTatto.jpg");
		evento6.setFecha("Abril 11,12");
		evento6.setNombre("Aruba Tattoo Convention");
		

		
		
		
		Promocion evento10=  new 	Promocion();
		evento10.setDescripcion("");
		evento10.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/musicFest.jpg");
		evento10.setFecha("Mayo  21 y 22");
		evento10.setLink("https://www.facebook.com/Tattoo-MUSIC-FEST-1032405463445275/");
		evento10.setNombre("Tattoo Music Fest");
		
		/*Promocion evento11=  new 	Promocion();
		evento11.setDescripcion("INTERCAMBIO DE SABERES Y SABORES : DR CANNABIS DESDE MEXICO COMPARTIENDO SU EXPERIENCIA CON EL DIARIO 'LA DOSIS' Y LA BILIOTECA CANNABICA.      CARRERA 28 # 85A - 11    ENTRADA GRATUITA   INICIO 4:20PM");
		evento11.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/cannabis.jpg");
		evento11.setFecha("Enero 9");
	  	evento11.setLink("geo:4.673739409249658,-74.06451880931854?z=11&q=4.673739409249658,-74.06451880931854(Treasure)");
*/
		Promocion evento12=  new 	Promocion();
		evento12.setDescripcion("");
		evento12.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/bugatattoo.jpg");
		evento12.setFecha("Marzo  24,25,26 y 27");
		evento12.setLink("https://www.facebook.com/events/1515951802035759/");
		evento12.setNombre("BugaTattoo");
		
		
		Promocion evento13=  new 	Promocion();
		evento13.setDescripcion("");
		evento13.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/duitama.jpg");
		evento13.setFecha("Octubre  14,15 y 16");
		evento13.setLink("https://www.facebook.com/groups/327039517473264/");
		evento13.setNombre("Duitama Tattoo");
		
		Promocion evento14=  new 	Promocion();
		evento14.setDescripcion("En esta ocasion tendremos a eco capital capacitando sobre manejo de desechos e incorporando a los estudios a la ruta de aseo que presta esta empresa y más sorpresas.Entrada libre sólo artistas inscritos");
		evento14.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/usme.jpg");
		evento14.setFecha("Marzo  18,19");
		evento14.setLink("https://www.facebook.com/warlock0719");
		evento14.setNombre("Intercambio de conocimientos ");
		
		Promocion evento15=  new 	Promocion();
		evento15.setDescripcion("Artistas internacionales seminarios, freak show, musica en vivo, grandes premios.");
		evento15.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/usmeExpo2.jpg");
		evento15.setFecha("Agosto  27,28 y 29");
		evento15.setLink("https://www.facebook.com/2da-Convencion-De-Tatuadores-usme-2016-914584588616834/");
		evento15.setNombre("2da ExpoTatto Usme ");
		
		Promocion evento16=  new 	Promocion();
		evento16.setDescripcion("Esto es un llamado a la 2da convención internacional de tatuadores en pasto Colombia si la primera fue buena la segunda sera mejor 3 4 5 junio 2016");
		evento16.setImagen("http://8-dot-inkdata-1019.appspot.com/img/Eventos/pasto.jpg");
		evento16.setFecha("Junio  3,4 y 5");
		evento16.setLink("https://www.facebook.com/Carnaval-Ink-Pasto-Colombia-459584494106819");
		evento16.setNombre("2do Carnaval ink Pasto");
		
		
	  	
	  	//FIN EVENTO  

	   
	   

	   eventosData.add(evento14);
	   eventosData.add(evento12);
	   eventosData.add(evento6);
	   eventosData.add(evento10);
	   eventosData.add(evento16);
	   eventosData.add(evento4);
	   eventosData.add(evento15);
	   eventosData.add(evento13);
	   eventosData.add(evento5);
	 
	   //FIN AGREGAR  ARTISTAS 
	   //ollections.shuffle(eventosData);
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < eventosData.size(); i++) {
		   JSONObject eventos =  new JSONObject();
		 
		   eventos.put("nombre", eventosData.get(i).getNombre());
		   eventos.put("descripcion", eventosData.get(i).getDescripcion());
		   eventos.put("imagen", eventosData.get(i).getImagen());
		   eventos.put("fecha", eventosData.get(i).getFecha());
		   eventos.put("link", eventosData.get(i).getLink());
		  json.add(eventos);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
