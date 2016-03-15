package com.inkgps.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@SuppressWarnings("serial")
public class MultimediaServlet extends HttpServlet  {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		
		
		List<MultimediaDTO> multimediaData =  new ArrayList<MultimediaDTO>(); 
	    MultimediaDTO video1=  new 	MultimediaDTO();
		video1.setDescripcion("Video donde aprenderas de que se trata INKGPS");
		video1.setUrl("https://www.youtube.com/embed/tWwrsBg7fsw");
		video1.setNombre("¿Que es INKGPS?");
		video1.setTipo("video");

	    MultimediaDTO video2=  new 	MultimediaDTO();
		video2.setDescripcion("Explicación de como utilizar la funcion de buscar artistas.");
		video2.setUrl("https://www.youtube.com/embed/F1LLz3l0vxQ");
		video2.setNombre("Como buscar artistas");
		video2.setTipo("Video");
		
		MultimediaDTO video3=  new 	MultimediaDTO();
		video3.setDescripcion("¿Te gustaría un tatuaje con movimiento?, si es así no te pierdas este video.");
		video3.setUrl("https://www.youtube.com/embed/hNvqyc3mKPY");
		video3.setNombre("Ink mapping");
		video3.setTipo("Video");
		
		
		MultimediaDTO video4=  new 	MultimediaDTO();
		video4.setDescripcion("Tatuajes en camara lenta.");
		video4.setUrl("https://www.youtube.com/embed/kxLoycj4pJY");
		video4.setNombre("Ink slow motion");
		video4.setTipo("Video");
		
		MultimediaDTO video5=  new 	MultimediaDTO();
		video5.setDescripcion("Conoce un poco sobre la historia de los tatuajes.");
		video5.setUrl("https://www.youtube.com/embed/MYn15yDBvxM");
		video5.setNombre("Historia del tatuaje");
		video5.setTipo("Video");
		
		
	   multimediaData.add(video1);    
	   multimediaData.add(video2);  
	   multimediaData.add(video3);
	   multimediaData.add(video4);
	   multimediaData.add(video5);
	   
	
	
	   //FIN AGREGAR  ARTISTAS 
	   Collections.shuffle(multimediaData);
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < multimediaData.size(); i++) {
		   JSONObject bocetos =  new JSONObject();
		 
		   bocetos.put("nombre", multimediaData.get(i).getNombre());
		   bocetos.put("descripcion", multimediaData.get(i).getDescripcion());
		   bocetos.put("url", multimediaData.get(i).getUrl());
		   bocetos.put("tipo", multimediaData.get(i).getTipo());
		  json.add(bocetos);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
