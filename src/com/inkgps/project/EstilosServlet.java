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
public class EstilosServlet extends HttpServlet {
	
	public static String realismo = "Realismo";
	public static String tribal = "Tribales, Maori";
	public static String fineline = "Fine line";
	public static String neotradicional = "Neo tradicional";
	public static String tradicional = "Tradicional";
	public static String nuevaEscuela = "Nueva escuela";
	public static String arteJapones = "Arte japones";
	public static String escritura = "Escritura";
	public static String todos  =  "Todos";
	public static  String  modificador  = "Modificación corporal";
	public static String acuarela  = "Acuarela";
	public static String estiloLibre =  "Estilo libre";
	

	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		
	  
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONObject json = new JSONObject();
	   json.put("1", realismo);
	   json.put("2", tribal);
	   json.put("3", fineline);
	   json.put("4", neotradicional);
	   json.put("5", tradicional);
	   json.put("6", nuevaEscuela);
	   json.put("7", arteJapones);
	   json.put("8", escritura);
	   json.put("9", todos);
	   json.put("10", modificador);
	   json.put("11", acuarela);
	   json.put("12", estiloLibre);
	
	   
	   
		
		PrintWriter out = resp.getWriter();
		
		out.print(json.toJSONString());
		//resp.getWriter().println(data);
	}
}
