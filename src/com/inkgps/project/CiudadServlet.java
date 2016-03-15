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
public class CiudadServlet extends HttpServlet {
	
	
	
	//ciudades
	public static String bogota  = "Bogotá";
	public static String cali  = "Cali";
	public static String apartado  = "Apartadó";
	public static String paipa  = "Paipa";
	public static String envigado  = "Envigado";
	public static String facatativa  = "Facatativá";
	public static String fusagasuga =  "Fusagasugá";
	public static String santaMarta =  "Santa marta";
	public static String medellin =  "Medellín";
	public static String mexico =  "México D.F";
	public static String tepic =  "Tepic, México";
	public static String savaneta =  "Savaneta, aruba";
	public static String bucaramanga =  "Bucaramanga";
	public static String manizales = "Manizales";
	public static String soacha = "Soacha";
	public static String sopo = "Sopo";
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		
	  
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONObject json = new JSONObject();
	   json.put("1", bogota);
	   json.put("2", cali);
	   json.put("3", apartado);
	   json.put("4", paipa);
	   json.put("5", envigado);
	   json.put("6", facatativa);
	   json.put("7", fusagasuga);
	   json.put("8", santaMarta);
	   json.put("9", medellin);
	   json.put("10", mexico);
	   json.put("11", tepic);
	   json.put("12", savaneta);
	   json.put("13", bucaramanga);
	   json.put("14", manizales);
	   json.put("15", soacha);
	   json.put("16", sopo);
	   
	   
		
		PrintWriter out = resp.getWriter();
		
		out.print(json.toJSONString());
		//resp.getWriter().println(data);
	}
}
