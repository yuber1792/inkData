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
public class BocetosServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<Bocetos> bocetosData =  new ArrayList<Bocetos>();
		
		
 //INICIO EVENTO 
	   
	   
		
		Bocetos evento2=  new 	Bocetos();
		evento2.setDescripcion("En estos momento no hay bocetos para mostrar");
		evento2.setPrecio("0");
		evento2.setTamano("0");
		evento2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/no_tenemos_bocetos_inkgps.png");
		

		Bocetos boceto1=  new 	Bocetos();
		boceto1.setDescripcion("Codigó artista 185");
		boceto1.setPrecio("Codigo artista 185");
		boceto1.setTamano("Codigo artista 185");
		boceto1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/185_2.jpg");
		boceto1.setId("185");

		Bocetos boceto2=  new 	Bocetos();
		boceto2.setDescripcion("Codigó artista 185");
		boceto2.setPrecio("Codigo artista 185");
		boceto2.setTamano("Codigo artista 185");
		boceto2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/185_1.jpg");
		boceto2.setId("185");
		
		Bocetos boceto3=  new 	Bocetos();
		boceto3.setDescripcion("Codigó artista 186");
		boceto3.setPrecio("Codigo artista 185");
		boceto3.setTamano("Codigo artista 186");
		boceto3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/186_2.jpg");
        boceto3.setId("186");
        
		
		Bocetos boceto4=  new 	Bocetos();
		boceto4.setDescripcion("Codigó artista 186");
		boceto4.setPrecio("Codigo artista 186");
		boceto4.setTamano("Codigo artista 186");
		boceto4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/186_1.jpg");
		boceto4.setId("186");
		
		Bocetos boceto5=  new 	Bocetos();
		boceto5.setDescripcion("Codigó artista 174");
		boceto5.setPrecio("Codigo artista 174");
		boceto5.setTamano("Codigo artista 174");
		boceto5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/174_1.jpg");
		boceto5.setId("174");
		
		Bocetos boceto6=  new 	Bocetos();
		boceto6.setDescripcion("Codigó artista 145");
		boceto6.setPrecio("Codigo artista 145");
		boceto6.setTamano("Codigo artista 145");
		boceto6.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/145_1.jpg");
		boceto6.setId("145");
		
		Bocetos boceto7=  new 	Bocetos();
		boceto7.setDescripcion("Codigó artista 145");
		boceto7.setPrecio("Codigo artista 145");
		boceto7.setTamano("Codigo artista 145");
		boceto7.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/145_2.jpg");
		boceto7.setId("145");
		
		Bocetos boceto8=  new 	Bocetos();
		boceto8.setDescripcion("Codigó artista 132");
		boceto8.setPrecio("Codigo artista 132");
		boceto8.setTamano("Codigo artista 132");
		boceto8.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/132_2.jpg");
		boceto8.setId("132");
		
		Bocetos boceto9=  new 	Bocetos();
		boceto9.setDescripcion("Codigó artista 132");
		boceto9.setPrecio("Codigo artista 132");
		boceto9.setTamano("Codigo artista 132");
		boceto9.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/132_1.jpg");
		boceto9.setId("132");
		
		Bocetos boceto10=  new 	Bocetos();
		boceto10.setDescripcion("Codigó artista 146");
		boceto10.setPrecio("Codigo artista 146");
		boceto10.setTamano("Codigo artista 146");
		boceto10.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/146_2.jpg");
		boceto10.setId("146");
		
		Bocetos boceto11=  new 	Bocetos();
		boceto11.setDescripcion("Codigó artista 146");
		boceto11.setPrecio("Codigo artista 146");
		boceto11.setTamano("Codigo artista 146");
		boceto11.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/146_1.jpg");
		boceto11.setId("146");
		
		Bocetos boceto12=  new 	Bocetos();
		boceto12.setDescripcion("Codigó artista 189");
		boceto12.setPrecio("Codigo artista 189");
		boceto12.setTamano("Codigo artista 189");
		boceto12.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/189_1.jpg");
		boceto12.setId("189");
		
		Bocetos boceto13=  new 	Bocetos();
		boceto13.setDescripcion("Codigó artista 189");
		boceto13.setPrecio("Codigo artista 189");
		boceto13.setTamano("Codigo artista 189");
		boceto13.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/189_2.jpg");
		boceto13.setId("189");
		
		Bocetos boceto14=  new 	Bocetos();
		boceto14.setDescripcion("Codigó artista 103");
		boceto14.setPrecio("Codigo artista 103");
		boceto14.setTamano("Codigo artista 103");
		boceto14.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/103_1.jpg");
		boceto14.setId("103");
		
		
		Bocetos boceto15=  new 	Bocetos();
		boceto15.setDescripcion("Codigó artista 190");
		boceto15.setPrecio("Codigo artista 190");
		boceto15.setTamano("Codigo artista 190");
		boceto15.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/190_1.jpg");
		boceto15.setId("190");
		
		
		Bocetos boceto16=  new 	Bocetos();
		boceto16.setDescripcion("Codigó artista 193");
		boceto16.setPrecio("Codigo artista 193");
		boceto16.setTamano("Codigo artista 193");
		boceto16.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/193_1.jpg");
		boceto16.setId("193");
		
		Bocetos boceto17=  new 	Bocetos();
		boceto17.setDescripcion("Codigó artista 193");
		boceto17.setPrecio("Codigo artista 193");
		boceto17.setTamano("Codigo artista 193");
		boceto17.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/193_2.jpg");
		boceto17.setId("193");
		
		
		Bocetos boceto18=  new 	Bocetos();
		boceto18.setDescripcion("Codigó artista 194");
		boceto18.setPrecio("Codigo artista 194");
		boceto18.setTamano("Codigo artista 194");
		boceto18.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/194_1.jpg");
		boceto18.setId("194");
		
		Bocetos boceto19=  new 	Bocetos();
		boceto19.setDescripcion("Codigó artista 194");
		boceto19.setPrecio("Codigo artista 194");
		boceto19.setTamano("Codigo artista 194");
		boceto19.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/194_2.jpg");
		boceto19.setId("194");
		
		
		Bocetos boceto20=  new 	Bocetos();
		boceto20.setDescripcion("Codigó artista 131");
		boceto20.setPrecio("Codigo artista 131");
		boceto20.setTamano("Codigo artista 131");
		boceto20.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/131_1.jpg");
		boceto20.setId("131");
		
		Bocetos boceto21=  new 	Bocetos();
		boceto21.setDescripcion("Codigó artista 131");
		boceto21.setPrecio("Codigo artista 131");
		boceto21.setTamano("Codigo artista 131");
		boceto21.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/131_2.jpg");
		boceto21.setId("131");
		
		Bocetos boceto22=  new 	Bocetos();
		boceto22.setDescripcion("Codigó artista 192");
		boceto22.setPrecio("Codigo artista 192");
		boceto22.setTamano("Codigo artista 192");
		boceto22.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/192_2.jpg");
		boceto22.setId("192");
	
		
		Bocetos boceto23=  new 	Bocetos();
		boceto23.setDescripcion("Codigó artista 192");
		boceto23.setPrecio("Codigo artista 192");
		boceto23.setTamano("Codigo artista 192");
		boceto23.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/192_1.jpg");
		boceto23.setId("192");
		
		Bocetos boceto24=  new 	Bocetos();
		boceto24.setDescripcion("Codigó artista 203");
		boceto24.setPrecio("Codigo artista 203");
		boceto24.setTamano("Codigo artista 203");
		boceto24.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/203_1.jpg");
		boceto24.setId("203");
		
		Bocetos boceto25=  new 	Bocetos();
		boceto25.setDescripcion("Codigó artista 203");
		boceto25.setPrecio("Codigo artista 203");
		boceto25.setTamano("Codigo artista 203");
		boceto25.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/203_2.jpg");
		boceto25.setId("203");
		
		Bocetos boceto26=  new 	Bocetos();
		boceto26.setDescripcion("Codigó artista 204");
		boceto26.setPrecio("Codigo artista 204");
		boceto26.setTamano("Codigo artista 204");
		boceto26.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/204_2.jpg");
		boceto26.setId("204");
		
		Bocetos boceto27=  new 	Bocetos();
		boceto27.setDescripcion("Codigó artista 204");
		boceto27.setPrecio("Codigo artista 204");
		boceto27.setTamano("Codigo artista 204");
		boceto27.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/204_1.jpg");
		boceto27.setId("204");
		
		
		Bocetos boceto28=  new 	Bocetos();
		boceto28.setDescripcion("Codigó artista 125");
		boceto28.setPrecio("Codigo artista 125");
		boceto28.setTamano("Codigo artista 125");
		boceto28.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/125_1.jpg");
		boceto28.setId("125");
		
		Bocetos boceto29=  new 	Bocetos();
		boceto29.setDescripcion("Codigó artista 125");
		boceto29.setPrecio("Codigo artista 125");
		boceto29.setTamano("Codigo artista 125");
		boceto29.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/125_2.jpg");
		boceto29.setId("125");
		
		Bocetos boceto30=  new 	Bocetos();
		boceto30.setDescripcion("Codigó artista 208");
		boceto30.setPrecio("Codigo artista 208");
		boceto30.setTamano("Codigo artista 208");
		boceto30.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/208_1.jpg");
		boceto30.setId("208");
		
		Bocetos boceto31=  new 	Bocetos();
		boceto31.setDescripcion("Codigó artista 211");
		boceto31.setPrecio("Codigo artista 211");
		boceto31.setTamano("Codigo artista 211");
		boceto31.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/211_1.jpg");
		boceto31.setId("211");
		
		Bocetos boceto32=  new 	Bocetos();
		boceto32.setDescripcion("Codigó artista 211");
		boceto32.setPrecio("Codigo artista 211");
		boceto32.setTamano("Codigo artista 211");
		boceto32.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/211_2.jpg");
		boceto32.setId("211");
		
		Bocetos boceto33=  new 	Bocetos();
		boceto33.setDescripcion("Codigó artista 212");
		boceto33.setPrecio("Codigo artista 212");
		boceto33.setTamano("Codigo artista 212");
		boceto33.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/212_2.jpg");
		boceto33.setId("212");
		
		Bocetos bocet34=  new 	Bocetos();
		bocet34.setDescripcion("Codigó artista 212");
		bocet34.setPrecio("Codigo artista 212");
		bocet34.setTamano("Codigo artista 212");
		bocet34.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/212_1.jpg");
		bocet34.setId("212");
		
		Bocetos boceto35=  new 	Bocetos();
		boceto35.setDescripcion("Codigó artista 213");
		boceto35.setPrecio("Codigo artista 213");
		boceto35.setTamano("Codigo artista 213");
		boceto35.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/213_1.jpg");
		boceto35.setId("213");
		
		
		Bocetos boceto36=  new 	Bocetos();
		boceto36.setDescripcion("Codigó artista 213");
		boceto36.setPrecio("Codigo artista 213");
		boceto36.setTamano("Codigo artista 213");
		boceto36.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/213_2.jpg");
		boceto36.setId("213");
		
		Bocetos boceto37=  new 	Bocetos();
		boceto37.setDescripcion("Codigó artista 218");
		boceto37.setPrecio("Codigo artista 218");
		boceto37.setTamano("Codigo artista 218");
		boceto37.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/218_2.jpg");
		boceto37.setId("218");
		
		Bocetos boceto38=  new 	Bocetos();
		boceto38.setDescripcion("Codigó artista 218");
		boceto38.setPrecio("Codigo artista 218");
		boceto38.setTamano("Codigo artista 218");
		boceto38.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/218_1.jpg");
		boceto38.setId("218");
		
		
		Bocetos boceto39=  new 	Bocetos();
		boceto39.setDescripcion("Codigó artista 219");
		boceto39.setPrecio("Codigo artista 219");
		boceto39.setTamano("Codigo artista 219");
		boceto39.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/219_1.jpg");
		boceto39.setId("219");
		
		Bocetos boceto40=  new 	Bocetos();
		boceto40.setDescripcion("Codigó artista 219");
		boceto40.setPrecio("Codigo artista 219");
		boceto40.setTamano("Codigo artista 219");
		boceto40.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/219_2.jpg");
		boceto40.setId("219");
		
		Bocetos boceto41=  new 	Bocetos();
		boceto41.setDescripcion("Codigó artista 215");
		boceto41.setPrecio("Codigo artista 215");
		boceto41.setTamano("Codigo artista 215");
		boceto41.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/215_2.jpg");
		boceto41.setId("215");
		
		Bocetos boceto42=  new 	Bocetos();
		boceto42.setDescripcion("Codigó artista 215");
		boceto42.setPrecio("Codigo artista 215");
		boceto42.setTamano("Codigo artista 215");
		boceto42.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/215_1.jpg");
		boceto42.setId("215");
		
		Bocetos boceto43=  new 	Bocetos();
		boceto43.setDescripcion("Codigó artista 220");
		boceto43.setPrecio("Codigo artista 220");
		boceto43.setTamano("Codigo artista 220");
		boceto43.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/220_1.jpg");
		boceto43.setId("220");
		
		Bocetos boceto44=  new 	Bocetos();
		boceto44.setDescripcion("Codigó artista 220");
		boceto44.setPrecio("Codigo artista 220");
		boceto44.setTamano("Codigo artista 220");
		boceto44.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/220_2.jpg");
		boceto44.setId("220");
		
		Bocetos boceto45=  new 	Bocetos();
		boceto45.setDescripcion("Codigó artista 221");
		boceto45.setPrecio("Codigo artista 221");
		boceto45.setTamano("Codigo artista 221");
		boceto45.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/221_2.jpg");
		boceto45.setId("221");
		
		Bocetos boceto46=  new 	Bocetos();
		boceto46.setDescripcion("Codigó artista 221");
		boceto46.setPrecio("Codigo artista 221");
		boceto46.setTamano("Codigo artista 221");
		boceto46.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/221_1.jpg");
		boceto46.setId("221");
		
		Bocetos boceto47=  new 	Bocetos();
		boceto47.setDescripcion("Codigó artista 206");
		boceto47.setPrecio("Codigo artista 206");
		boceto47.setTamano("Codigo artista 206");
		boceto47.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/206_1.jpg");
		boceto47.setId("206");
		
		Bocetos boceto48=  new 	Bocetos();
		boceto48.setDescripcion("Codigó artista 206");
		boceto48.setPrecio("Codigo artista 206");
		boceto48.setTamano("Codigo artista 206");
		boceto48.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/206_2.jpg");
		boceto48.setId("206");
		
		Bocetos boceto49=  new 	Bocetos();
		boceto49.setDescripcion("Codigó artista 227");
		boceto49.setPrecio("Codigo artista 227");
		boceto49.setTamano("Codigo artista 227");
		boceto49.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/227_2.jpg");
		boceto49.setId("227");
		
		Bocetos boceto50=  new 	Bocetos();
		boceto50.setDescripcion("Codigó artista 227");
		boceto50.setPrecio("Codigo artista 227");
		boceto50.setTamano("Codigo artista 227");
		boceto50.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/227_1.jpg");
		boceto50.setId("227");
		
		Bocetos boceto51=  new 	Bocetos();
		boceto51.setDescripcion("Codigó artista 222");
		boceto51.setPrecio("Codigo artista 222");
		boceto51.setTamano("Codigo artista 222");
		boceto51.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/222_1.jpg");
		boceto51.setId("222");
		
		Bocetos boceto52=  new 	Bocetos();
		boceto52.setDescripcion("Codigó artista 222");
		boceto52.setPrecio("Codigo artista 222");
		boceto52.setTamano("Codigo artista 222");
		boceto52.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/222_2.jpg");
		boceto52.setId("222");
		
		Bocetos boceto53=  new 	Bocetos();
		boceto53.setDescripcion("Codigó artista 228");
		boceto53.setPrecio("Codigo artista 228");
		boceto53.setTamano("Codigo artista 228");
		boceto53.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/228_2.jpg");
		boceto53.setId("228");
		
		Bocetos boceto54=  new 	Bocetos();
		boceto54.setDescripcion("Codigó artista 228");
		boceto54.setPrecio("Codigo artista 228");
		boceto54.setTamano("Codigo artista 228");
		boceto54.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/228_1.jpg");
		boceto54.setId("228");
		
		Bocetos boceto55=  new 	Bocetos();
		boceto55.setDescripcion("Codigó artista 230");
		boceto55.setPrecio("Codigo artista 230");
		boceto55.setTamano("Codigo artista 230");
		boceto55.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/230_1.jpg");
		boceto55.setId("230");
		
		Bocetos boceto56=  new 	Bocetos();
		boceto56.setDescripcion("Codigó artista 230");
		boceto56.setPrecio("Codigo artista 230");
		boceto56.setTamano("Codigo artista 230");
		boceto56.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/230_2.jpg");
		boceto56.setId("230");
		
		Bocetos boceto57=  new 	Bocetos();
		boceto57.setDescripcion("Codigó artista 231");
		boceto57.setPrecio("Codigo artista 231");
		boceto57.setTamano("Codigo artista 231");
		boceto57.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/231_2.jpg");
		boceto57.setId("231");
		
		Bocetos boceto58=  new 	Bocetos();
		boceto58.setDescripcion("Codigó artista 231");
		boceto58.setPrecio("Codigo artista 231");
		boceto58.setTamano("Codigo artista 231");
		boceto58.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/231_1.jpg");
		boceto58.setId("231");
		
		Bocetos boceto59=  new 	Bocetos();
		boceto59.setDescripcion("Codigó artista 120");
		boceto59.setPrecio("Codigo artista 120");
		boceto59.setTamano("Codigo artista 120");
		boceto59.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/120_1.jpg");
		boceto59.setId("120");
		
		Bocetos boceto60=  new 	Bocetos();
		boceto60.setDescripcion("Codigó artista 120");
		boceto60.setPrecio("Codigo artista 120");
		boceto60.setTamano("Codigo artista 120");
		boceto60.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/120_2.jpg");
		boceto60.setId("120");
		
		Bocetos boceto61=  new 	Bocetos();
		boceto61.setDescripcion("Codigó artista 232");
		boceto61.setPrecio("Codigo artista 232");
		boceto61.setTamano("Codigo artista 232");
		boceto61.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/232_2.jpg");
		boceto61.setId("232");
		
		Bocetos boceto62=  new 	Bocetos();
		boceto62.setDescripcion("Codigó artista 232");
		boceto62.setPrecio("Codigo artista 232");
		boceto62.setTamano("Codigo artista 232");
		boceto62.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/232_1.jpg");
		boceto62.setId("232");
		
		Bocetos boceto63=  new 	Bocetos();
		boceto63.setDescripcion("Codigó artista 214");
		boceto63.setPrecio("Codigo artista 214");
		boceto63.setTamano("Codigo artista 214");
		boceto63.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/214_1.jpg");
		boceto63.setId("214");
		
		Bocetos boceto64=  new 	Bocetos();
		boceto64.setDescripcion("Codigó artista 214");
		boceto64.setPrecio("Codigo artista 214");
		boceto64.setTamano("Codigo artista 214");
		boceto64.setImagen("http://8-dot-inkdata-1019.appspot.com/img/bocetos/214_2.jpg");
		boceto64.setId("214");
		
		
		
		//FIN EVENTO  

	   
	   
	   //AGREGAR  ARTISTAS 
	 
	  //bocetosData.add(evento2);    //id9
	   
	   bocetosData.add(boceto1);    //id9
	   bocetosData.add(boceto2);    //id9
	   bocetosData.add(boceto3);    //id9
	   bocetosData.add(boceto4);    //id9
	   bocetosData.add(boceto5);    //id9
	   bocetosData.add(boceto6);    //id9
	   bocetosData.add(boceto7);    //id9
	   bocetosData.add(boceto8);    //id9
	   bocetosData.add(boceto9);    //id9
	   bocetosData.add(boceto10);    //id9
	   bocetosData.add(boceto11);    //id9
	   bocetosData.add(boceto12);    //id9
	   bocetosData.add(boceto13);    //id9
	   bocetosData.add(boceto14);    //id9
	   bocetosData.add(boceto15);    //id9
	   bocetosData.add(boceto16);    //id9
	   bocetosData.add(boceto17);    //id9
	   bocetosData.add(boceto18);    //id9
	   bocetosData.add(boceto19);    //id9
	   bocetosData.add(boceto20);    //id9
	   bocetosData.add(boceto21);    //id9
	   bocetosData.add(boceto22);    //id9
	   bocetosData.add(boceto23);    //id9
	   bocetosData.add(boceto24);    //id9
	   bocetosData.add(boceto25);    //id9
	   bocetosData.add(boceto26);    //id9
	   bocetosData.add(boceto27);    //id9
	   bocetosData.add(boceto28);    //id9
	   bocetosData.add(boceto29);    //id9
	   bocetosData.add(boceto30);    //id9
	   bocetosData.add(boceto31);    //id9
	   bocetosData.add(boceto32);    //id9
	   bocetosData.add(boceto33);    //id9
	   bocetosData.add(bocet34);    //id9
	   bocetosData.add(boceto35);    //id9
	   bocetosData.add(boceto36);    //id9
	   bocetosData.add(boceto37);    //id9
	   bocetosData.add(boceto38);    //id9
	   bocetosData.add(boceto39);    //id9
	   bocetosData.add(boceto40);    //id9
	   bocetosData.add(boceto41);    //id9
	   bocetosData.add(boceto42);    //id9
	   bocetosData.add(boceto43);    //id9
	   bocetosData.add(boceto44);    //id9
	   bocetosData.add(boceto45);    //id9
	   bocetosData.add(boceto46);    //id9
	   bocetosData.add(boceto47);    //id9
	   bocetosData.add(boceto48);    //id9
	   bocetosData.add(boceto49);    //id9
	   bocetosData.add(boceto50);    //id9
	   bocetosData.add(boceto51);    //id9
	   bocetosData.add(boceto52);    //id9
	   bocetosData.add(boceto53);    //id9
	   bocetosData.add(boceto54);    //id9
	   bocetosData.add(boceto55);    //id9
	   bocetosData.add(boceto56);    //id9
	   bocetosData.add(boceto57);    //id9
	   bocetosData.add(boceto58);    //id9
	   bocetosData.add(boceto59);    //id9
	   bocetosData.add(boceto60);    //id9
	   bocetosData.add(boceto61);    //id9
	   bocetosData.add(boceto62);    //id9
	   bocetosData.add(boceto63);    //id9
	   bocetosData.add(boceto64);    //id9
	   
	   
	  
	
	   //FIN AGREGAR  ARTISTAS 
	   Collections.shuffle(bocetosData);
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < bocetosData.size(); i++) {
		   JSONObject bocetos =  new JSONObject();
		 
		   bocetos.put("precio", bocetosData.get(i).getPrecio());
		   bocetos.put("descripcion", bocetosData.get(i).getDescripcion());
		   bocetos.put("imagen", bocetosData.get(i).getImagen());
		   bocetos.put("tamano", bocetosData.get(i).getTamano());
		   bocetos.put("id",Integer.parseInt( bocetosData.get(i).getId()));
		  json.add(bocetos);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
