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
public class InkDataServlet extends HttpServlet {
	
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
		 
		List<Artista> artistasData =  new ArrayList<Artista>();
		
		// INICIO ANDRES RAMIREZ id 101
		Artista andresRamirez=  new 	Artista();
		andresRamirez.setDescripcion("Neo tradicional, New school y tradicional, aproximadamente 3 años de experiencia. ");
		andresRamirez.setId("101");
		andresRamirez.setNombre("Andres Ramirez");
		andresRamirez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirezPerfil.jpg");
	    andresRamirez.setUsuarioFacebook("profile.php?id=707892569");
	    andresRamirez.setFacebook("Un tal Andres Ramirez");
	    andresRamirez.setCelular("+573102055321");
	    andresRamirez.setInstagram("false");
	    andresRamirez.setUsuarioInstagram("false");
	    andresRamirez.setDireccion("Calle 19 carrera 5 Via libre");
	    andresRamirez.setEspecialidad(nuevaEscuela);
	    andresRamirez.setTwitter("no");
	    andresRamirez.setUsuarioTwitter("false");
	    andresRamirez.setLatitud("4.618646");
	    andresRamirez.setLongitud("-74.13823127746582");
	    andresRamirez.setNombreEstudio("tatto tatto");
	    andresRamirez.setEmail("thesee.14@hotmail.com");
	    andresRamirez.setCiudad(bogota);
	    andresRamirez.setVerificado("false");
	   
		ArrayList<TrabajosArtista> andresRamirezTrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista andresRamirezTrabajo1 =  new TrabajosArtista();
	   andresRamirezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirez1.jpg");
	   
	   TrabajosArtista andresRamirezTrabajo2 =  new TrabajosArtista();
	   andresRamirezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirez2.jpg");
	   
	   TrabajosArtista andresRamirezTrabajo3 =  new TrabajosArtista();
	   andresRamirezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirez3.jpg");
	   
	   TrabajosArtista andresRamirezTrabajo4 =  new TrabajosArtista();
	   andresRamirezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirez4.jpg");
	   
	   TrabajosArtista andresRamirezTrabajo5 =  new TrabajosArtista();
	   andresRamirezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresRamirez/andresRamirez5.jpg");
	   
	   andresRamirezTrabajos.add(andresRamirezTrabajo1);
	   andresRamirezTrabajos.add(andresRamirezTrabajo2);
	   andresRamirezTrabajos.add(andresRamirezTrabajo3);
	   andresRamirezTrabajos.add(andresRamirezTrabajo4);
	   andresRamirezTrabajos.add(andresRamirezTrabajo5);
	   Collections.shuffle(andresRamirezTrabajos);
	   
	   andresRamirez.setTrabajosArtistas(andresRamirezTrabajos);
	   
	// FIN  ANDRES RAMIREZ
	   
	   
	   //INICIO ARLEY VARGAS id 102
	   
	   Artista arleyVargas=  new 	Artista();
		arleyVargas.setDescripcion("tatuador con mas de 10 años de experiencia app engine");
		arleyVargas.setId("102");
		arleyVargas.setNombre("Arley vargas");
		arleyVargas.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargasPerfil.jpg");
	    arleyVargas.setUsuarioFacebook("pages/Calavera-Ink/395193703898204");
	    arleyVargas.setFacebook("Cavalera ink");
	    arleyVargas.setCelular("+573204861163");
	    arleyVargas.setInstagram("false");
	    arleyVargas.setUsuarioInstagram("false");
	    arleyVargas.setDireccion("Cr 13#63 21local 203 piso 2");
	    arleyVargas.setEspecialidad(realismo);
	    arleyVargas.setTwitter("no");
	    arleyVargas.setUsuarioTwitter("false");
	    arleyVargas.setLatitud("4.649754 ");
	    arleyVargas.setLongitud("-74.063618");
	    arleyVargas.setNombreEstudio("Cavalera ink");
	    arleyVargas.setEmail("Cavaleraink@hotmail.com");
	    arleyVargas.setCiudad(bogota);
	    arleyVargas.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> arleyVargastrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista arleyVargastrabajo1 =  new TrabajosArtista();
	   arleyVargastrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargas1.jpg");
	   
	   TrabajosArtista arleyVargastrabajo2 =  new TrabajosArtista();
	   arleyVargastrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargas2.jpg");
	   
	   TrabajosArtista arleyVargastrabajo3 =  new TrabajosArtista();
	   arleyVargastrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargas3.jpg");
	   
	   TrabajosArtista arleyVargastrabajo4 =  new TrabajosArtista();
	   arleyVargastrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargas4.jpg");
	   
	   TrabajosArtista arleyVargastrabajo5 =  new TrabajosArtista();
	   arleyVargastrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/arleyVargas/arleyVargas5.jpg");
	   
	   arleyVargastrabajos.add(arleyVargastrabajo1);
	   arleyVargastrabajos.add(arleyVargastrabajo2);
	   arleyVargastrabajos.add(arleyVargastrabajo3);
	   arleyVargastrabajos.add(arleyVargastrabajo4);
	   arleyVargastrabajos.add(arleyVargastrabajo5);
	   Collections.shuffle(arleyVargastrabajos);
	   arleyVargas.setTrabajosArtistas(arleyVargastrabajos);
	   
	  
	   //FIN ARLEY VARGAS
	   
	   //INICIO CAMILO SANDOVAL  id 103
	   
	   Artista camiloSandoval=  new 	Artista();
		camiloSandoval.setDescripcion("Cuento con 8 años de experiencia en el campo Estilos: tradicional, neo tradicional, color,caligrafía ,oriental .");
		camiloSandoval.setId("103");
		camiloSandoval.setNombre("Camilo sandoval");
		camiloSandoval.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandovalPerfil.jpg");
	    camiloSandoval.setFacebook("El tatuadero");
	    camiloSandoval.setUsuarioFacebook("eltatuadero.estudio");
	    camiloSandoval.setCelular("+573213204659");
	    camiloSandoval.setInstagram("_Camilosan");
	    camiloSandoval.setUsuarioInstagram("_Camilosan");
	    camiloSandoval.setDireccion("av calle 19#4-79 local 305");
	    camiloSandoval.setEspecialidad(neotradicional);
	    camiloSandoval.setTwitter("no");
	    camiloSandoval.setUsuarioTwitter("false");
	    camiloSandoval.setLatitud("4.604222");
	    camiloSandoval.setLongitud("-74.07023400000000");
	    camiloSandoval.setNombreEstudio("el tatuadero");
	    camiloSandoval.setEmail("no");
	    camiloSandoval.setCiudad(bogota);
	    camiloSandoval.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> camiloSandovaltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista camiloSandovaltrabajo1 =  new TrabajosArtista();
	   camiloSandovaltrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandoval1.jpg");
	   
	   TrabajosArtista camiloSandovaltrabajo2 =  new TrabajosArtista();
	   camiloSandovaltrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandoval2.jpg");
	   
	   TrabajosArtista camiloSandovaltrabajo3 =  new TrabajosArtista();
	   camiloSandovaltrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandoval3.jpg");
	   
	   TrabajosArtista camiloSandovaltrabajo4 =  new TrabajosArtista();
	   camiloSandovaltrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandoval4.jpg");
	   
	   TrabajosArtista camiloSandovaltrabajo5 =  new TrabajosArtista();
	   camiloSandovaltrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloSandoval/camiloSandoval5.jpg");
	   
	   camiloSandovaltrabajos.add(camiloSandovaltrabajo1);
	   camiloSandovaltrabajos.add(camiloSandovaltrabajo2);
	   camiloSandovaltrabajos.add(camiloSandovaltrabajo3);
	   camiloSandovaltrabajos.add(camiloSandovaltrabajo4);
	   camiloSandovaltrabajos.add(camiloSandovaltrabajo5);
	   Collections.shuffle(camiloSandovaltrabajos);
	   
	   camiloSandoval.setTrabajosArtistas(camiloSandovaltrabajos);
	   
	  
	   //FIN CAMILO SANDOVAL
	   
	   //INICIO CARLOS BELTRAN   id 104
	   
	   Artista carlosBeltran=  new 	Artista();
		carlosBeltran.setDescripcion("Diseños totalmente personalizados basados en la idea principal del cliente el procedimiento de tatuado con sus respectivos cuidados en Bio seguridad mi especíalidad es el neo tradicional");
		carlosBeltran.setId("104");
		carlosBeltran.setNombre("Carlos beltran");
		carlosBeltran.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltranPerfil.jpg");
	    carlosBeltran.setFacebook("Caníbal horses tattoo");
	    carlosBeltran.setUsuarioFacebook("cannibaltattooart");
	    carlosBeltran.setCelular("+573102151230");
	    carlosBeltran.setInstagram("carlosbeltrantattoo");
	    carlosBeltran.setUsuarioInstagram("carlosbeltrantattoo");
	    carlosBeltran.setDireccion("Calle 19 carrera 5");
	    carlosBeltran.setEspecialidad(tradicional);
	    carlosBeltran.setTwitter("no");
	    carlosBeltran.setUsuarioTwitter("false");
	    carlosBeltran.setLatitud("4.604222");
	    carlosBeltran.setLongitud("-74.07023400000000");
	    carlosBeltran.setNombreEstudio("Caníbal House");
	    carlosBeltran.setEmail("cannibalhouse@hotmail.com");
	    carlosBeltran.setCiudad(bogota);
	    carlosBeltran.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> carlosBeltrantrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista carlosBeltrantrabajo1 =  new TrabajosArtista();
	   carlosBeltrantrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltran1.jpg");
	   
	   TrabajosArtista carlosBeltrantrabajo2 =  new TrabajosArtista();
	   carlosBeltrantrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltran2.jpg");
	   
	   TrabajosArtista carlosBeltrantrabajo3 =  new TrabajosArtista();
	   carlosBeltrantrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltran3.jpg");
	   
	   TrabajosArtista carlosBeltrantrabajo4 =  new TrabajosArtista();
	   carlosBeltrantrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltran4.jpg");
	   
	   TrabajosArtista carlosBeltrantrabajo5 =  new TrabajosArtista();
	   carlosBeltrantrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosBeltran/carlosBeltran5.jpg");
	   
	   carlosBeltrantrabajos.add(carlosBeltrantrabajo1);
	   carlosBeltrantrabajos.add(carlosBeltrantrabajo2);
	   carlosBeltrantrabajos.add(carlosBeltrantrabajo3);
	   carlosBeltrantrabajos.add(carlosBeltrantrabajo4);
	   carlosBeltrantrabajos.add(carlosBeltrantrabajo5);
	   Collections.shuffle(carlosBeltrantrabajos);
	   
	   carlosBeltran.setTrabajosArtistas(carlosBeltrantrabajos);
	   
	  
	   //FIN CARLOS BELTRAN
	   
//INICIO CERSAR MARTINK  id 105
	   
	   Artista cesarMartink=  new 	Artista();
		cesarMartink.setDescripcion("Artista en tourniquet tatto  especialidad en retratos ,nueva  escuela ");
		cesarMartink.setId("105");
		cesarMartink.setNombre("Cesar martink");
		cesarMartink.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartinkPerfil.jpg");
	    cesarMartink.setFacebook("Cesar Martink");
	    cesarMartink.setUsuarioFacebook("cesar.v.martin");
	    cesarMartink.setCelular("+573005312537");
	    cesarMartink.setInstagram("Cesar Martink");
	    cesarMartink.setUsuarioInstagram("Cesar Martink");
	    cesarMartink.setDireccion("via libre calle 19 ");
	    cesarMartink.setEspecialidad(realismo);
	    cesarMartink.setTwitter("no");
	    cesarMartink.setUsuarioTwitter("false");
	    cesarMartink.setLatitud("4.604222");
	    cesarMartink.setLongitud("-74.07023400000000");
	    cesarMartink.setNombreEstudio("tourniquet tatto");
	    cesarMartink.setEmail("cesarink986@hotmail.com");
	    cesarMartink.setCiudad(bogota);
	    cesarMartink.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> cesarMartinktrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista cesarMartinktrabajo1 =  new TrabajosArtista();
	   cesarMartinktrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartink1.jpg");
	   
	   TrabajosArtista cesarMartinktrabajo2 =  new TrabajosArtista();
	   cesarMartinktrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartink2.jpg");
	   
	   TrabajosArtista cesarMartinktrabajo3 =  new TrabajosArtista();
	   cesarMartinktrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartink3.jpg");
	   
	   TrabajosArtista cesarMartinktrabajo4 =  new TrabajosArtista();
	   cesarMartinktrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartink4.jpg");
	   
	   TrabajosArtista cesarMartinktrabajo5 =  new TrabajosArtista();
	   cesarMartinktrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarMartink/cesarMartink5.jpg");
	   
	   cesarMartinktrabajos.add(cesarMartinktrabajo1);
	   cesarMartinktrabajos.add(cesarMartinktrabajo2);
	   cesarMartinktrabajos.add(cesarMartinktrabajo3);
	   cesarMartinktrabajos.add(cesarMartinktrabajo4);
	   cesarMartinktrabajos.add(cesarMartinktrabajo5);
	   Collections.shuffle(cesarMartinktrabajos);
	   
	   cesarMartink.setTrabajosArtistas(cesarMartinktrabajos);
	   
	  
	   //FIN CESAR MARTINK 
	   
	   //INICIO DIEGO FERNANDEZ  id 106
	   
	   Artista diegoFernandez=  new 	Artista();
		diegoFernandez.setDescripcion("Llevo 13 años tatuado y mi lado favorito de el tatuaje es el realismo en especial los rostros y personajes de terror tanto a color como en grises. ");
		diegoFernandez.setId("106");
		diegoFernandez.setNombre("Diego fernandez");
		diegoFernandez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandezPerfil.jpg");
	    diegoFernandez.setFacebook("STM CREW");
	    diegoFernandez.setUsuarioFacebook("stmtattoo");
	    diegoFernandez.setCelular("+573136005208");
	    diegoFernandez.setInstagram("stm_crew");
	    diegoFernandez.setUsuarioInstagram("stm_crew");
	    diegoFernandez.setDireccion("Cra 5 No.  18-86 CC Vía Libre ");
	    diegoFernandez.setEspecialidad(realismo);
	    diegoFernandez.setTwitter("Stmcrew");
	    diegoFernandez.setUsuarioTwitter("false");
	    diegoFernandez.setLatitud("4.604222");
	    diegoFernandez.setLongitud("-74.07023400000000");
	    diegoFernandez.setNombreEstudio("SPECTRUM");
	    diegoFernandez.setEmail("stmtattoo@hotmail.com");
	    diegoFernandez.setCiudad(bogota);
	    diegoFernandez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> diegoFernandeztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista diegoFernandeztrabajo1 =  new TrabajosArtista();
	   diegoFernandeztrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandez1.jpg");
	   
	   TrabajosArtista diegoFernandeztrabajo2 =  new TrabajosArtista();
	   diegoFernandeztrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandez2.jpg");
	   
	   TrabajosArtista diegoFernandeztrabajo3 =  new TrabajosArtista();
	   diegoFernandeztrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandez3.jpg");
	   
	   TrabajosArtista diegoFernandeztrabajo4 =  new TrabajosArtista();
	   diegoFernandeztrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandez4.jpg");
	   
	   TrabajosArtista diegoFernandeztrabajo5 =  new TrabajosArtista();
	   diegoFernandeztrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoFernandez/diegoFernandez5.jpg");
	   
	   diegoFernandeztrabajos.add(diegoFernandeztrabajo1);
	   diegoFernandeztrabajos.add(diegoFernandeztrabajo2);
	   diegoFernandeztrabajos.add(diegoFernandeztrabajo3);
	   diegoFernandeztrabajos.add(diegoFernandeztrabajo4);
	   diegoFernandeztrabajos.add(diegoFernandeztrabajo5);
	   Collections.shuffle(diegoFernandeztrabajos);
	   
	   diegoFernandez.setTrabajosArtistas(diegoFernandeztrabajos);
	   
	  
	   //FIN DIEGO FERNANDEZ
	
   //INICIO EDISON HUERFANO  id 107
	   
	   Artista edisonHuerfano=  new 	Artista();
		edisonHuerfano.setDescripcion("Tengo una experiencia de 5 años trabajando como dermografista híbrido, ahora especializandome en realismo color y realismo sombras, 5 años que han sido una gran escuela, pasando primero por mi propio studio llamado Drained INK Tattoo, luego por Body Art Bogota y actualmente me encuentro en Power Colors Tattoo, studio en el cual la evolución ha sido mas rápida.");
		edisonHuerfano.setId("107");
		edisonHuerfano.setNombre("Edison huerfano");
		edisonHuerfano.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfanoPerfil.jpg");
	    edisonHuerfano.setFacebook("Edison Huérfano tattoo");
	    edisonHuerfano.setUsuarioFacebook("edison.huerfanopaez");
	    edisonHuerfano.setCelular("+573202398913");
	    edisonHuerfano.setInstagram("Edrainedtattooartist");
	    edisonHuerfano.setUsuarioInstagram("Edrainedtattooartist");
	    edisonHuerfano.setDireccion("Calle 19 #4-83 local 215 Cc vía libre ");
	    edisonHuerfano.setEspecialidad(realismo);
	    edisonHuerfano.setTwitter("no");
	    edisonHuerfano.setUsuarioTwitter("false");
	    edisonHuerfano.setLatitud("4.604222");
	    edisonHuerfano.setLongitud("-74.07023400000000");
	    edisonHuerfano.setNombreEstudio("Power ColorsTattoo");
	    edisonHuerfano.setEmail("Artattoo47@hotmail.com");
	    edisonHuerfano.setCiudad(bogota);
	    edisonHuerfano.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> edisonHuerfanotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista edisonHuerfanotrabajo1 =  new TrabajosArtista();
	   edisonHuerfanotrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfano1.jpg");
	   
	   TrabajosArtista edisonHuerfanotrabajo2 =  new TrabajosArtista();
	   edisonHuerfanotrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfano2.jpg");
	   
	   TrabajosArtista edisonHuerfanotrabajo3 =  new TrabajosArtista();
	   edisonHuerfanotrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfano3.jpg");
	   
	   TrabajosArtista edisonHuerfanotrabajo4 =  new TrabajosArtista();
	   edisonHuerfanotrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfano4.jpg");
	   
	   TrabajosArtista edisonHuerfanotrabajo5 =  new TrabajosArtista();
	   edisonHuerfanotrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edisonHuerfano/edisonHuerfano5.jpg");
	   
	   edisonHuerfanotrabajos.add(edisonHuerfanotrabajo1);
	   edisonHuerfanotrabajos.add(edisonHuerfanotrabajo2);
	   edisonHuerfanotrabajos.add(edisonHuerfanotrabajo3);
	   edisonHuerfanotrabajos.add(edisonHuerfanotrabajo4);
	   edisonHuerfanotrabajos.add(edisonHuerfanotrabajo5);
	   Collections.shuffle(edisonHuerfanotrabajos);
	   
	   edisonHuerfano.setTrabajosArtistas(edisonHuerfanotrabajos);
	   
	  
	   //FIN EDISON HUERFANO
	   
	   //INICIO FERNANDO URREA  id 108
	   
	   Artista fernandoUrrea =  new 	Artista();
		fernandoUrrea.setDescripcion("Especialidad Black and gray");
		fernandoUrrea.setId("108");
		fernandoUrrea.setNombre("Fernando urrea");
		fernandoUrrea.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrreaPerfil.jpg");
	    fernandoUrrea.setFacebook("Fernando urrea garcia");
	    fernandoUrrea.setUsuarioFacebook("carlos.f.garcia1");
	    fernandoUrrea.setCelular("+573138857285");
	    fernandoUrrea.setInstagram("Edrainedtattooartist");
	    fernandoUrrea.setUsuarioInstagram("Edrainedtattooartist");
	    fernandoUrrea.setDireccion("vía libre ");
	    fernandoUrrea.setEspecialidad(realismo);
	    fernandoUrrea.setTwitter("Baphomet");
	    fernandoUrrea.setLatitud("4.604222");
	    fernandoUrrea.setLongitud("-74.07023400000000");
	    fernandoUrrea.setNombreEstudio("Exótic INK tatto");
	    fernandoUrrea.setEmail("Legiontattoart@gmail.com");
	    fernandoUrrea.setCiudad(bogota);
	    fernandoUrrea.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> fernandoUrreatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista fernandoUrreatrabajo1 =  new TrabajosArtista();
	   fernandoUrreatrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrrea1.jpg");
	   
	   TrabajosArtista fernandoUrreatrabajo2 =  new TrabajosArtista();
	   fernandoUrreatrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrrea2.jpg");
	   
	   TrabajosArtista fernandoUrreatrabajo3 =  new TrabajosArtista();
	   fernandoUrreatrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrrea3.jpg");
	   
	   TrabajosArtista fernandoUrreatrabajo4 =  new TrabajosArtista();
	   fernandoUrreatrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrrea4.jpg");
	   
	   TrabajosArtista fernandoUrreatrabajo5 =  new TrabajosArtista();
	   fernandoUrreatrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/fernandoUrreaGarcia/fernandoUrrea5.jpg");
	   
	   fernandoUrreatrabajos.add(fernandoUrreatrabajo1);
	   fernandoUrreatrabajos.add(fernandoUrreatrabajo2);
	   fernandoUrreatrabajos.add(fernandoUrreatrabajo3);
	   fernandoUrreatrabajos.add(fernandoUrreatrabajo4);
	   fernandoUrreatrabajos.add(fernandoUrreatrabajo5);
	   Collections.shuffle(fernandoUrreatrabajos);
	   
	   fernandoUrrea.setTrabajosArtistas(fernandoUrreatrabajos);
	   
	  
	   //FIN FERNANDO URREA
	   
	   //INICIO JOHAN BARRETO id 109
	   
	   Artista johanBarreto =  new 	Artista();
		johanBarreto.setDescripcion("Realizo varios estilos en general  mi fuerte es la sombra y bueno a función de lo que quiere la persona y mi criterio para llegar a diseños propios o lo que las personas quieran y ya para mi lo importante es darle al cliente lo que quiera pero si tengo en  cuenta aportar y mejorar sus ideas. ");
		johanBarreto.setId("109");
		johanBarreto.setNombre("Johan barreto");
		johanBarreto.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarretoPerfil.jpg");
	    johanBarreto.setFacebook("Johan barreto");
	    johanBarreto.setUsuarioFacebook("johan.barreto.357");
	    johanBarreto.setCelular("+573142000208");
	    johanBarreto.setInstagram("Edrainedtattooartist");
	    johanBarreto.setUsuarioInstagram("Edrainedtattooartist");
	    johanBarreto.setDireccion("Calle 19 carrera 5");
	    johanBarreto.setEspecialidad(fineline);
	    johanBarreto.setTwitter("no");
	    johanBarreto.setUsuarioTwitter("false");
	    johanBarreto.setLatitud("4.604222");
	    johanBarreto.setLongitud("-74.07023400000000");
	    johanBarreto.setNombreEstudio("Power colors");
	    johanBarreto.setEmail("Sviet_13@hotmail.com");
	    johanBarreto.setCiudad(bogota);
	    johanBarreto.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> johanBarretotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista johanBarretotrabajo1 =  new TrabajosArtista();
	   johanBarretotrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarreto1.jpg");
	   
	   TrabajosArtista johanBarretotrabajo2 =  new TrabajosArtista();
	   johanBarretotrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarreto2.jpg");
	   
	   TrabajosArtista johanBarretotrabajo3 =  new TrabajosArtista();
	   johanBarretotrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarreto3.jpg");
	   
	   TrabajosArtista johanBarretotrabajo4 =  new TrabajosArtista();
	   johanBarretotrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarreto4.jpg");
	   
	   TrabajosArtista johanBarretotrabajo5 =  new TrabajosArtista();
	   johanBarretotrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johanBarreto/johanBarreto5.jpg");
	   
	   johanBarretotrabajos.add(johanBarretotrabajo1);
	   johanBarretotrabajos.add(johanBarretotrabajo2);
	   johanBarretotrabajos.add(johanBarretotrabajo3);
	   johanBarretotrabajos.add(johanBarretotrabajo4);
	   johanBarretotrabajos.add(johanBarretotrabajo5);
	   Collections.shuffle(johanBarretotrabajos);
	   
	   johanBarreto.setTrabajosArtistas(johanBarretotrabajos);
	   
	  
	   //FIN JOHAN BARRETO
	   
 //INICIO KYMBERLY ST  id 110
	   
	   Artista kymberlySt =  new 	Artista();
		kymberlySt.setDescripcion("Soy colombovenezolana, actualmente trabajando en madhouse tattoo studio en la calle 33 sur con carrera 24; reconocida mas que todo por mis tatuajes full color, acuarela y galaxias. Tengo aproximadamente 3 años de experiencia en este medio del tatuaje.");
		kymberlySt.setId("110");
		kymberlySt.setNombre("Kimberlyn st");
		kymberlySt.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kymberlinStPerfil.jpg");
	    kymberlySt.setFacebook("kimberlyn st");
	    kymberlySt.setUsuarioFacebook("Kim.Wild.Tattoo");
	    kymberlySt.setCelular("+584140738236");
	    kymberlySt.setInstagram("kimtattoo_art");
	    kymberlySt.setUsuarioInstagram("kimtattoo_art");
	    kymberlySt.setDireccion("calle 33 sur con carrera 24 quiroga central");
	    kymberlySt.setEspecialidad(fineline);
	    kymberlySt.setTwitter("no");
	    kymberlySt.setUsuarioTwitter("false");
	    kymberlySt.setLatitud("4.604222");
	    kymberlySt.setLongitud("-74.07023400000000");
	    kymberlySt.setNombreEstudio("Madhouse Tattoo Studio");
	    kymberlySt.setEmail("kimberlyn911@gmail.com");
	    kymberlySt.setCiudad(bogota);
	    kymberlySt.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> kymberlySttrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista kymberlySttrabajo1 =  new TrabajosArtista();
	   kymberlySttrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kimberlynSt1.jpg");
	   
	   TrabajosArtista kymberlySttrabajo2 =  new TrabajosArtista();
	   kymberlySttrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kimberlynSt2.jpg");
	   
	   TrabajosArtista kymberlySttrabajo3 =  new TrabajosArtista();
	   kymberlySttrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kimberlynSt3.jpg");
	   
	   TrabajosArtista kymberlySttrabajo4 =  new TrabajosArtista();
	   kymberlySttrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kimberlynSt4.jpg");
	   
	   TrabajosArtista kymberlySttrabajo5 =  new TrabajosArtista();
	   kymberlySttrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kymberlySt/kimberlynSt5.jpg");
	   
	   kymberlySttrabajos.add(kymberlySttrabajo1);
	   kymberlySttrabajos.add(kymberlySttrabajo2);
	   kymberlySttrabajos.add(kymberlySttrabajo3);
	   kymberlySttrabajos.add(kymberlySttrabajo4);
	   kymberlySttrabajos.add(kymberlySttrabajo5);
	   Collections.shuffle(kymberlySttrabajos);
	   
	   kymberlySt.setTrabajosArtistas(kymberlySttrabajos);
	   
	  
	   //FIN KYMBERLY ST
	   
	   //INICIO MIKO  id 111
	   
	   Artista miko=  new 	Artista();
		miko.setDescripcion("Tribales  corporales diseños unicos negros y maoris universales y personalizados pocos colores  matices  en negros  en pokas cesiones  uma tattoo  especial mostro miko dc");
		miko.setId("111");
		miko.setNombre("Miko");
		miko.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sinperfil.jpg");
	    miko.setFacebook("Miguel cifuentes");
	    miko.setCelular("+573002919900");
	    miko.setInstagram("Miguel cifuentes");
	    miko.setUsuarioInstagram("Miguel cifuentes");
	    miko.setDireccion("via libre calle 19 ");
	    miko.setEspecialidad(tribal);
	    miko.setTwitter("no");
	    miko.setUsuarioTwitter("false");
	    miko.setLatitud("4.6606080847201445");
	    miko.setLongitud("-74.0701675415039");
	    miko.setNombreEstudio("tatto city bogota");
	    miko.setEmail("migueldj1986@hotmail.com");
	    miko.setCiudad(bogota);
	    miko.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> mikotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista mikotrabajo1 =  new TrabajosArtista();
	   mikotrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela1.jpg");
	   
	   TrabajosArtista mikotrabajo2 =  new TrabajosArtista();
	   mikotrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela2.jpg");
	   
	   TrabajosArtista mikotrabajo3 =  new TrabajosArtista();
	   mikotrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela3.jpg");
	   
	   TrabajosArtista mikotrabajo4 =  new TrabajosArtista();
	   mikotrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela4.jpg");
	   
	   TrabajosArtista mikotrabajo5 =  new TrabajosArtista();
	   mikotrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela5.jpg");
	   
	   mikotrabajos.add(mikotrabajo1);
	   mikotrabajos.add(mikotrabajo2);
	   mikotrabajos.add(mikotrabajo3);
	   mikotrabajos.add(mikotrabajo4);
	   mikotrabajos.add(mikotrabajo5);
	   Collections.shuffle(mikotrabajos);
	   
	   miko.setTrabajosArtistas(mikotrabajos);
	   
	  
	   //FIN MIKO
	   
	   //INICIO MILLER BAUTIZTA  id 112
	   
	   Artista millerBautizta=  new 	Artista();
		millerBautizta.setDescripcion("Llevo 5 años tatuando los diseños que más me gusta tatuar son nueva escuela");
		millerBautizta.setId("112");
		millerBautizta.setNombre("Miller bautizta");
		millerBautizta.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista1.jpg");
	    millerBautizta.setFacebook("Miller Mattattoo Bautista");
	    millerBautizta.setUsuarioFacebook("miller.bautista.56");
	    millerBautizta.setCelular("+573212182961");
	    millerBautizta.setInstagram("no");
	    millerBautizta.setUsuarioInstagram("false");
	    millerBautizta.setDireccion("Calle 19 #4-83 local 129 Cc vía libre ");
	    millerBautizta.setEspecialidad(neotradicional);
	    millerBautizta.setTwitter("no");
	    millerBautizta.setUsuarioTwitter("false");
	    millerBautizta.setLatitud("4.604222");
	    millerBautizta.setLongitud("-74.07023400000000");
	    millerBautizta.setNombreEstudio("Mattattoo");
	    millerBautizta.setEmail("millerbautistamattattoo@live.com");
	    millerBautizta.setCiudad(bogota);
	   millerBautizta.setVerificado("false");
		ArrayList<TrabajosArtista> millerBautiztatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista millerBautiztatrabajo1 =  new TrabajosArtista();
	   millerBautiztatrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista1.jpg");
	   
	   TrabajosArtista millerBautiztatrabajo2 =  new TrabajosArtista();
	   millerBautiztatrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista2.jpg");
	   
	   TrabajosArtista millerBautiztatrabajo3 =  new TrabajosArtista();
	   millerBautiztatrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista3.jpg");
	   
	   TrabajosArtista millerBautiztatrabajo4 =  new TrabajosArtista();
	   millerBautiztatrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista4.jpg");
	   
	   TrabajosArtista millerBautiztatrabajo5 =  new TrabajosArtista();
	   millerBautiztatrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/millerBautizta/millerBautista5.jpg");
	   
	   millerBautiztatrabajos.add(millerBautiztatrabajo1);
	   millerBautiztatrabajos.add(millerBautiztatrabajo2);
	   millerBautiztatrabajos.add(millerBautiztatrabajo3);
	   millerBautiztatrabajos.add(millerBautiztatrabajo4);
	   millerBautiztatrabajos.add(millerBautiztatrabajo5);
	   
	   Collections.shuffle(millerBautiztatrabajos);
	   millerBautizta.setTrabajosArtistas(millerBautiztatrabajos);
	   
	  
	   //FIN MILLER BAUTISTA
	   
	   //INICIO RAE GUEDEZ  id 113
	   
	   Artista raeGuedez=  new 	Artista();
		raeGuedez.setDescripcion("3 años de experiencia,  venezolano 20 años de edad, tradicional,  realismo");
		raeGuedez.setId("113");
		raeGuedez.setNombre("Rae guedez");
		raeGuedez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sinperfil.jpg");
	    raeGuedez.setFacebook("Rae guedez");
	    raeGuedez.setCelular("+573008296000");
	    raeGuedez.setInstagram("Raeguedez");
	    raeGuedez.setUsuarioInstagram("Raeguedez");
	    raeGuedez.setDireccion("Calle 19 carrera 5 ");
	    raeGuedez.setEspecialidad(realismo);
	    raeGuedez.setTwitter("no");
	    raeGuedez.setUsuarioTwitter("false");
	    raeGuedez.setLatitud("4.604222");
	    raeGuedez.setLongitud("-74.07023400000000");
	    raeGuedez.setNombreEstudio("tatto tatto");
	    raeGuedez.setEmail("Pguedez96@gmail.com");
	    raeGuedez.setCiudad(bogota);
	    
	   
		ArrayList<TrabajosArtista> raeGuedeztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista raeGuedeztrabajo1 =  new TrabajosArtista();
	   raeGuedeztrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela1.jpg");
	   
	   TrabajosArtista raeGuedeztrabajo2 =  new TrabajosArtista();
	   raeGuedeztrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela2.jpg");
	   
	   TrabajosArtista raeGuedeztrabajo3 =  new TrabajosArtista();
	   raeGuedeztrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela3.jpg");
	   
	   TrabajosArtista raeGuedeztrabajo4 =  new TrabajosArtista();
	   raeGuedeztrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela4.jpg");
	   
	   TrabajosArtista raeGuedeztrabajo5 =  new TrabajosArtista();
	   raeGuedeztrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nuevaescuela5.jpg");
	   
	   raeGuedeztrabajos.add(raeGuedeztrabajo1);
	   raeGuedeztrabajos.add(raeGuedeztrabajo2);
	   raeGuedeztrabajos.add(raeGuedeztrabajo3);
	   raeGuedeztrabajos.add(raeGuedeztrabajo4);
	   raeGuedeztrabajos.add(raeGuedeztrabajo5);
	   Collections.shuffle(raeGuedeztrabajos);
	   
	   raeGuedez.setTrabajosArtistas(raeGuedeztrabajos);
	   
	  
	   //FIN RAE GUEDEZ
	   
 //INICIO SEIMON RODRIGUEZ  id 114
	   
	   Artista seimonRodriguez=  new 	Artista();
		seimonRodriguez.setDescripcion("Arte oriental,  nueva escuela,  neo tradicional,  realismo,  con más de 4 años de experiencia ");
		seimonRodriguez.setId("114");
		seimonRodriguez.setNombre("Seimon rodriguez");
		seimonRodriguez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguezPerfil.jpg");
	    seimonRodriguez.setFacebook("Seimon Rodríguez ");
	    seimonRodriguez.setUsuarioFacebook("ScorFetos");
	    
	    seimonRodriguez.setCelular("+573008296000");
	    seimonRodriguez.setInstagram("Scorart");
	    seimonRodriguez.setUsuarioInstagram("Scorart");
	    seimonRodriguez.setDireccion("Calle 19 carrera 5 ");
	    seimonRodriguez.setEspecialidad(arteJapones);
	    seimonRodriguez.setTwitter("Scorart");
	    seimonRodriguez.setLatitud("4.604222");
	    seimonRodriguez.setLongitud("-74.07023400000000");
	    seimonRodriguez.setNombreEstudio("tatto tatto");
	    seimonRodriguez.setEmail("Scorxd@gmail.com");
	    seimonRodriguez.setCiudad(bogota);
	    seimonRodriguez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> seimonRodrigueztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista seimonRodrigueztrabajo1 =  new TrabajosArtista();
	   seimonRodrigueztrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguez1.jpg");
	   
	   TrabajosArtista seimonRodrigueztrabajo2 =  new TrabajosArtista();
	   seimonRodrigueztrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguez2.jpg");
	   
	   TrabajosArtista seimonRodrigueztrabajo3 =  new TrabajosArtista();
	   seimonRodrigueztrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguez3.jpg");
	   
	   TrabajosArtista seimonRodrigueztrabajo4 =  new TrabajosArtista();
	   seimonRodrigueztrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguez4.jpg");
	   
	   TrabajosArtista seimonRodrigueztrabajo5 =  new TrabajosArtista();
	   seimonRodrigueztrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/seimonRodriguez/seimonRodriguez5.jpg");
	   
	   seimonRodrigueztrabajos.add(seimonRodrigueztrabajo1);
	   seimonRodrigueztrabajos.add(seimonRodrigueztrabajo2);
	   seimonRodrigueztrabajos.add(seimonRodrigueztrabajo3);
	   seimonRodrigueztrabajos.add(seimonRodrigueztrabajo4);
	   seimonRodrigueztrabajos.add(seimonRodrigueztrabajo5);
	   Collections.shuffle(seimonRodrigueztrabajos);
	   
	   seimonRodriguez.setTrabajosArtistas(seimonRodrigueztrabajos);
	   
	  
	   //FIN SEIMON RODRIGUEZ
	   
	   //INICIO SORA DON GERMENES id 115
	   
	   Artista soraDonGermenes=  new 	Artista();
		soraDonGermenes.setDescripcion("Sacramento Tatto bogota. Me especialìzo en el tatuaje tradicional , oriental y neo tradicional.");
		soraDonGermenes.setId("115");
		soraDonGermenes.setNombre("Sora don germenes");
		soraDonGermenes.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenesPerfil.jpg");
	    soraDonGermenes.setFacebook("Sora don germenes");
	    soraDonGermenes.setUsuarioFacebook("SORADONGERMENES");
	    soraDonGermenes.setCelular("+573173811838");
	    soraDonGermenes.setInstagram("dongermenes");
	    soraDonGermenes.setUsuarioInstagram("dongermenes");
	    soraDonGermenes.setDireccion("Calle71#13-86 ");
	    soraDonGermenes.setEspecialidad(tradicional);
	    soraDonGermenes.setTwitter("no");
	    soraDonGermenes.setUsuarioTwitter("false");
	    soraDonGermenes.setLatitud("4.6578668");
	    soraDonGermenes.setLongitud("-74.06184339999990");
	    soraDonGermenes.setNombreEstudio("sacramento tatto");
	    soraDonGermenes.setEmail("soradongermenes@facebook.com");
	    soraDonGermenes.setCiudad(bogota);
	    soraDonGermenes.setVerificado("false");
	   
		ArrayList<TrabajosArtista> soraDonGermenestrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista soraDonGermenestrabajo1 =  new TrabajosArtista();
	   soraDonGermenestrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenes1.jpg");
	   
	   TrabajosArtista soraDonGermenestrabajo2 =  new TrabajosArtista();
	   soraDonGermenestrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenes2.jpg");
	   
	   TrabajosArtista soraDonGermenestrabajo3 =  new TrabajosArtista();
	   soraDonGermenestrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenes3.jpg");
	   
	   TrabajosArtista soraDonGermenestrabajo4 =  new TrabajosArtista();
	   soraDonGermenestrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenes4.jpg");
	   
	   TrabajosArtista soraDonGermenestrabajo5 =  new TrabajosArtista();
	   soraDonGermenestrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/soraDonGermenes/soraDonGermenes5.jpg");
	   
	   soraDonGermenestrabajos.add(soraDonGermenestrabajo1);
	   soraDonGermenestrabajos.add(soraDonGermenestrabajo2);
	   soraDonGermenestrabajos.add(soraDonGermenestrabajo3);
	   soraDonGermenestrabajos.add(soraDonGermenestrabajo4);
	   soraDonGermenestrabajos.add(soraDonGermenestrabajo5);
	   Collections.shuffle(soraDonGermenestrabajos);
	   
	   soraDonGermenes.setTrabajosArtistas(soraDonGermenestrabajos);
	   
	  
	   //FIN SORA DON GERMENES
	   
	   //INICIO THOMAS KURO id 116
	   
	   Artista thomasKuro=  new 	Artista();
		thomasKuro.setDescripcion("Artista de Medellín residente en Bogotá en su trabajo se encuentra las escuelas Oriental new school el que diseño tipográfico en las cuales se enfoca enfoca el trabajo de este artista con aire oscurantismo  5años de carrera y como artista gráfico diseñador 7años");
		thomasKuro.setId("116");
		thomasKuro.setNombre("Thomas kuro");
		thomasKuro.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuroPerfil.jpg");
	    thomasKuro.setFacebook("Thomas Inglorion");
	    thomasKuro.setUsuarioFacebook("carodeku");
	    
	    thomasKuro.setCelular("+573102360283");
	    thomasKuro.setInstagram("no");
	    thomasKuro.setUsuarioInstagram("false");
	    thomasKuro.setDireccion("Via libre ");
	    thomasKuro.setEspecialidad(fineline);
	    thomasKuro.setTwitter("no");
	    thomasKuro.setUsuarioTwitter("false");
	    thomasKuro.setLatitud("4604222");
	    thomasKuro.setLongitud("-74.07023400000000");
	    thomasKuro.setNombreEstudio("tatto tatto");
	    thomasKuro.setEmail("Sasukeinglorion@gmail.com");
	    thomasKuro.setCiudad(bogota);
	    thomasKuro.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> thomasKurotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista thomasKurotrabajo1 =  new TrabajosArtista();
	   thomasKurotrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuro1.jpg");
	   
	   TrabajosArtista thomasKurotrabajo2 =  new TrabajosArtista();
	   thomasKurotrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuro2.jpg");
	   
	   TrabajosArtista thomasKurotrabajo3 =  new TrabajosArtista();
	   thomasKurotrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuro3.jpg");
	   
	   TrabajosArtista thomasKurotrabajo4 =  new TrabajosArtista();
	   thomasKurotrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuro4.jpg");
	   
	   TrabajosArtista thomasKurotrabajo5 =  new TrabajosArtista();
	   thomasKurotrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/thomasKuro/thomasKuro5.jpg");
	   
	   thomasKurotrabajos.add(thomasKurotrabajo1);
	   thomasKurotrabajos.add(thomasKurotrabajo2);
	   thomasKurotrabajos.add(thomasKurotrabajo3);
	   thomasKurotrabajos.add(thomasKurotrabajo4);
	   thomasKurotrabajos.add(thomasKurotrabajo5);
	   
	   Collections.shuffle(thomasKurotrabajos);
	   
	   thomasKuro.setTrabajosArtistas(thomasKurotrabajos);
	   
	  
	   //FIN THOMAS KURO
	   
 //INICIO JONATAN JOEL id 117
	   
	   Artista jonatanJoel=  new 	Artista();
		jonatanJoel.setDescripcion("Trayectoria tatuando 3 años fuertes en New school. Tradicional realismo blanco y negro. Full color. ");
		jonatanJoel.setId("117");
		jonatanJoel.setNombre("Jonatan Joel");
		jonatanJoel.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoelPerfil.jpg");
	    jonatanJoel.setFacebook("Jonatan joel");
	    jonatanJoel.setUsuarioFacebook("jonatan.j.pardo");
	    jonatanJoel.setCelular("+573104864198");
	    jonatanJoel.setInstagram("Jonatan Joel");
	    jonatanJoel.setUsuarioInstagram("Jonatan Joel");
	    jonatanJoel.setDireccion("Calle 64 #11_37");
	    jonatanJoel.setEspecialidad(fineline);
	    jonatanJoel.setTwitter("no");
	    jonatanJoel.setUsuarioTwitter("false");
	    jonatanJoel.setLatitud("4.604002808634030");
	    jonatanJoel.setLongitud("-74.07061296516980");
	    jonatanJoel.setNombreEstudio("Trece Chiros");
	    jonatanJoel.setEmail("Xjonatan _joelx@Hotmail.com");
	    jonatanJoel.setCiudad(bogota);
	    jonatanJoel.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> jonatanJoeltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jonatanJoelTrabajo1 =  new TrabajosArtista();
	   jonatanJoelTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoel1.jpg");
	   
	   TrabajosArtista jonatanJoelTrabajo2 =  new TrabajosArtista();
	   jonatanJoelTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoel2.jpg");
	   
	   TrabajosArtista jonatanJoelTrabajo3 =  new TrabajosArtista();
	   jonatanJoelTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoel3.jpg");
	   
	   TrabajosArtista jonatanJoelTrabajo4 =  new TrabajosArtista();
	   jonatanJoelTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoel4.jpg");
	   
	   TrabajosArtista jonatanJoelTrabajo5 =  new TrabajosArtista();
	   jonatanJoelTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jonathanJoel/jonathanJoel5.jpg");
	   
	   jonatanJoeltrabajos.add(jonatanJoelTrabajo1);
	   jonatanJoeltrabajos.add(jonatanJoelTrabajo2);
	   jonatanJoeltrabajos.add(jonatanJoelTrabajo3);
	   jonatanJoeltrabajos.add(jonatanJoelTrabajo4);
	   jonatanJoeltrabajos.add(jonatanJoelTrabajo5);
	   Collections.shuffle(jonatanJoeltrabajos);
	   
	   jonatanJoel.setTrabajosArtistas(jonatanJoeltrabajos);
	   
	  
	   //FIN JONATHAN JOEL
	   
//INICIO WILLLIAM RESTREPO id 118
	   
	   Artista williamRestrepo=  new 	Artista();
		williamRestrepo.setDescripcion("Tatuador con 6 años de experiencia me especializó en realismo en grises y fine Line ");
		williamRestrepo.setId("118");
		williamRestrepo.setNombre("William restrepo");
		williamRestrepo.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepoPerfil.jpg");
	    williamRestrepo.setFacebook("William restrepo");
	    williamRestrepo.setUsuarioFacebook("profile.php?id=1278425219");
	    williamRestrepo.setCelular("+573143036626");
	    williamRestrepo.setInstagram("no");
	    williamRestrepo.setUsuarioInstagram("false");
	    williamRestrepo.setDireccion("Plaza de las americas");
	    williamRestrepo.setEspecialidad(realismo);
	    williamRestrepo.setTwitter("no");
	    williamRestrepo.setUsuarioTwitter("false");
	    williamRestrepo.setLatitud("4.618728965718560");
	    williamRestrepo.setLongitud("-74.1382460296154");
	    williamRestrepo.setNombreEstudio("Eragon Tatto");
	    williamRestrepo.setEmail("Trasherand@hotmail.com");
	    williamRestrepo.setCiudad(bogota);
	    williamRestrepo.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> williamRestrepotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista williamRestrepoTrabajo1 =  new TrabajosArtista();
	   williamRestrepoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepo1.jpg");
	   
	   TrabajosArtista williamRestrepoTrabajo2 =  new TrabajosArtista();
	   williamRestrepoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepo2.jpg");
	   
	   TrabajosArtista williamRestrepoTrabajo3 =  new TrabajosArtista();
	   williamRestrepoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepo3.jpg");
	   
	   TrabajosArtista williamRestrepoTrabajo4 =  new TrabajosArtista();
	   williamRestrepoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepo4.jpg");
	   
	   TrabajosArtista williamRestrepoTrabajo5 =  new TrabajosArtista();
	   williamRestrepoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamRestrepo/williamRestrepo5.jpg");
	   
	   williamRestrepotrabajos.add(williamRestrepoTrabajo1);
	   williamRestrepotrabajos.add(williamRestrepoTrabajo2);
	   williamRestrepotrabajos.add(williamRestrepoTrabajo3);
	   williamRestrepotrabajos.add(williamRestrepoTrabajo4);
	   williamRestrepotrabajos.add(williamRestrepoTrabajo5);
	   Collections.shuffle(williamRestrepotrabajos);
	   williamRestrepo.setTrabajosArtistas(williamRestrepotrabajos);
	   
	  
	   //FIN WILLIAM RESTREPO
	   
	   
//INICIO JHON INK id 119
	   
	   Artista jhonInk=  new 	Artista();
		jhonInk.setDescripcion("Experiencia de 1año manejo realismo en sombras, Sub realismo, ole school,  New school, tradicional, oriental, cubrimiento garantía y satisfacción ");
		jhonInk.setId("119");
		jhonInk.setNombre("Jhon ink");
		jhonInk.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInkPerfil.jpg");
	    jhonInk.setFacebook("Jhon ink");
	    jhonInk.setUsuarioFacebook("jhonjairo.cameloduarte");
	    jhonInk.setCelular("+573114428936");
	    jhonInk.setInstagram("no");
	    jhonInk.setUsuarioInstagram("false");
	    jhonInk.setDireccion("Plaza de las americas");
	    jhonInk.setEspecialidad(nuevaEscuela);
	    jhonInk.setTwitter("no");
	    jhonInk.setUsuarioTwitter("false");
	    jhonInk.setLatitud("4.618728965718560");
	    jhonInk.setLongitud("-74.1382460296154");
	    jhonInk.setNombreEstudio("Eragon Tatto");
	    jhonInk.setEmail("Jhonsis_25@hotmail.com");
	    jhonInk.setCiudad(bogota);
	    jhonInk.setVerificado("false");
	   
		ArrayList<TrabajosArtista> jhonInktrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jhonInkTrabajo1 =  new TrabajosArtista();
	   jhonInkTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInk1.jpg");
	   
	   TrabajosArtista jhonInkTrabajo2 =  new TrabajosArtista();
	   jhonInkTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInk2.jpg");
	   
	   TrabajosArtista jhonInkTrabajo3 =  new TrabajosArtista();
	   jhonInkTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInk3.jpg");
	   
	   TrabajosArtista jhonInkTrabajo4 =  new TrabajosArtista();
	   jhonInkTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInk4.jpg");
	   
	   TrabajosArtista jhonInkTrabajo5 =  new TrabajosArtista();
	   jhonInkTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonInk/jhonInk5.jpg");
	   
	   jhonInktrabajos.add(jhonInkTrabajo1);
	   jhonInktrabajos.add(jhonInkTrabajo2);
	   jhonInktrabajos.add(jhonInkTrabajo3);
	   jhonInktrabajos.add(jhonInkTrabajo4);
	   jhonInktrabajos.add(jhonInkTrabajo5);
	   Collections.shuffle(jhonInktrabajos);
	   
	   jhonInk.setTrabajosArtistas(jhonInktrabajos);
	   
	  
	   //FIN JHON INK
	   
//INICIO CAMILO CORTES id 120
	   
	   Artista camiloCortes=  new 	Artista();
		camiloCortes.setDescripcion("Artista tatuador en Art de rue tattoo");
		camiloCortes.setId("120");
		camiloCortes.setNombre("Camilo cortes");
		camiloCortes.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortesPerfil.jpg");
	    camiloCortes.setFacebook("Camilo cortes bass tattoo");
	    camiloCortes.setUsuarioFacebook("Camilo.BassTattoo");
	    camiloCortes.setCelular("+573212957077");
	    camiloCortes.setInstagram("Basstattoooart");
	    camiloCortes.setUsuarioInstagram("Basstattoooart");
	    camiloCortes.setDireccion("Cll 62 # 22-89");
	    camiloCortes.setEspecialidad(neotradicional);
	    camiloCortes.setTwitter("no");
	    camiloCortes.setUsuarioTwitter("false");
	    camiloCortes.setLatitud("4.650000190607478");
	    camiloCortes.setLongitud("-74.07136380672455");
	    camiloCortes.setNombreEstudio("Feel INK studio");
	    camiloCortes.setEmail("basstatto@hotmail.com");
	    camiloCortes.setCiudad(bogota);
	    camiloCortes.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> camiloCortestrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista camiloCortesTrabajo1 =  new TrabajosArtista();
	   camiloCortesTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortes1.jpg");
	   
	   TrabajosArtista camiloCortesTrabajo2 =  new TrabajosArtista();
	   camiloCortesTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortes2.jpg");
	   
	   TrabajosArtista camiloCortesTrabajo3 =  new TrabajosArtista();
	   camiloCortesTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortes3.jpg");
	   
	   TrabajosArtista camiloCortesTrabajo4 =  new TrabajosArtista();
	   camiloCortesTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortes4.jpg");
	   
	   TrabajosArtista camiloCortesTrabajo5 =  new TrabajosArtista();
	   camiloCortesTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/camiloCortes/camiloCortes5.jpg");
	   
	   camiloCortestrabajos.add(camiloCortesTrabajo1);
	   camiloCortestrabajos.add(camiloCortesTrabajo2);
	   camiloCortestrabajos.add(camiloCortesTrabajo3);
	   camiloCortestrabajos.add(camiloCortesTrabajo4);
	   camiloCortestrabajos.add(camiloCortesTrabajo5);
	   Collections.shuffle(camiloCortestrabajos);
	   
	   camiloCortes.setTrabajosArtistas(camiloCortestrabajos);
	   
	  
	   //FIN CAMILO CORTES
//INICIO JULIAN MERCHAN id 121
	   
	   Artista julianMerchan=  new 	Artista();
		julianMerchan.setDescripcion("Llevo 5 años en este arte,  me gustan varios estilos el más interesante y que mas me llama la atención es el neo tradicional. ");
		julianMerchan.setId("121");
		julianMerchan.setNombre("Julian merchan");
		julianMerchan.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchanPerfil.jpg");
	    julianMerchan.setFacebook("Julian Merchan");
	    julianMerchan.setUsuarioFacebook("JulianInkArt");
	    julianMerchan.setCelular("+573114428936");
	    julianMerchan.setInstagram("Julian merchan");
	    julianMerchan.setUsuarioInstagram("andresj_ink");
	    julianMerchan.setDireccion("Cll 6 # 71d 37 2do piso");
	    julianMerchan.setEspecialidad(neotradicional);
	    julianMerchan.setTwitter("no");
	    julianMerchan.setUsuarioTwitter("false");
	    julianMerchan.setLatitud("4.618728965718560");
	    julianMerchan.setLongitud("-74.1382460296154");
	    julianMerchan.setNombreEstudio("Feel INK studio");
	    julianMerchan.setEmail("andresjmg_@hormail.com");
	    julianMerchan.setCiudad(bogota);
	    julianMerchan.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> julianMerchantrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista julianMerchanTrabajo1 =  new TrabajosArtista();
	   julianMerchanTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchan1.jpg");
	   
	   TrabajosArtista julianMerchanTrabajo2 =  new TrabajosArtista();
	   julianMerchanTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchan2.jpg");
	   
	   TrabajosArtista julianMerchanTrabajo3 =  new TrabajosArtista();
	   julianMerchanTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchan3.jpg");
	   
	   TrabajosArtista julianMerchanTrabajo4 =  new TrabajosArtista();
	   julianMerchanTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchan4.jpg");
	   
	   TrabajosArtista julianMerchanTrabajo5 =  new TrabajosArtista();
	   julianMerchanTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianMerchan/julianMerchan5.jpg");
	   
	   julianMerchantrabajos.add(julianMerchanTrabajo1);
	   julianMerchantrabajos.add(julianMerchanTrabajo2);
	   julianMerchantrabajos.add(julianMerchanTrabajo3);
	   julianMerchantrabajos.add(julianMerchanTrabajo4);
	   julianMerchantrabajos.add(julianMerchanTrabajo5);
	   Collections.shuffle(julianMerchantrabajos);
	   
	   julianMerchan.setTrabajosArtistas(julianMerchantrabajos);
	   
	  
	   //FIN JULIAN MERCHAN
	   
//INICIO JHON MAD id 122
	   
	   Artista jhonMad=  new 	Artista();
		jhonMad.setDescripcion("Mi especialidad  es el neo tradicional, letting y estilo propio tengo una experiencia de 4 años ");
		jhonMad.setId("122");
		jhonMad.setNombre("Jhon mad house");
		jhonMad.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMadPerfil.jpg");
	    jhonMad.setFacebook("Jhon mad");
	    jhonMad.setUsuarioFacebook("rudeMr.Andy");
	    jhonMad.setCelular("+573133599185");
	    jhonMad.setInstagram("jhonmadhousetattoo");
	    jhonMad.setUsuarioInstagram("jhonmadhousetattoo");
	    jhonMad.setDireccion("Zona rosa");
	    jhonMad.setEspecialidad(neotradicional);
	    jhonMad.setTwitter("no");
	    jhonMad.setUsuarioTwitter("false");
	    jhonMad.setLatitud("4.618728965718560");
	    jhonMad.setLongitud("-74.1382460296154");
	    jhonMad.setNombreEstudio("Odd tattoo Bogotá ");
	    jhonMad.setEmail("Jhonska-p@hotmail.com");
	    jhonMad.setCiudad(bogota);
	    jhonMad.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> jhonMadtrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jhonMadTrabajo1 =  new TrabajosArtista();
	   jhonMadTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMad1.jpg");
	   
	   TrabajosArtista jhonMadTrabajo2 =  new TrabajosArtista();
	   jhonMadTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMad2.jpg");
	   
	   TrabajosArtista jhonMadTrabajo3 =  new TrabajosArtista();
	   jhonMadTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMad3.jpg");
	   
	   TrabajosArtista jhonMadTrabajo4 =  new TrabajosArtista();
	   jhonMadTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMad4.jpg");
	   
	   TrabajosArtista jhonMadTrabajo5 =  new TrabajosArtista();
	   jhonMadTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonMad/jhonMad5.jpg");
	   
	   jhonMadtrabajos.add(jhonMadTrabajo1);
	   jhonMadtrabajos.add(jhonMadTrabajo2);
	   jhonMadtrabajos.add(jhonMadTrabajo3);
	   jhonMadtrabajos.add(jhonMadTrabajo4);
	   jhonMadtrabajos.add(jhonMadTrabajo5);
	   Collections.shuffle(jhonMadtrabajos);
	   
	   jhonMad.setTrabajosArtistas(jhonMadtrabajos);
	   
	  
	   //FIN JHON MAD
	   
//INICIO DIEGO ALEJANDRO id 123
	   
	   Artista diegoAlejandro=  new 	Artista();
		diegoAlejandro.setDescripcion("Artista plástico con experiencia de más de 10 años  en murales o,  escultura y diseño basado en realismo,  y 4 años de experiencia en le industria del tatuaje");
		diegoAlejandro.setId("123");
		diegoAlejandro.setNombre("Diego alejandroi lozano");
		diegoAlejandro.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandroPerfil.jpg");
	    diegoAlejandro.setFacebook("Diego alejandro");
	    diegoAlejandro.setUsuarioFacebook("profile.php?id=100005570505575");
	    diegoAlejandro.setCelular("+573219243329");
	    diegoAlejandro.setInstagram("no");
	    diegoAlejandro.setUsuarioInstagram("false");
	    diegoAlejandro.setDireccion("Cll 6 sur # 71d 55");
	    diegoAlejandro.setEspecialidad(realismo);
	    diegoAlejandro.setTwitter("no");
	    diegoAlejandro.setUsuarioTwitter("false");
	    diegoAlejandro.setLatitud("4.618728965718560");
	    diegoAlejandro.setLongitud("-74.1382460296154");
	    diegoAlejandro.setNombreEstudio("Experimental tattoo estudio ");
	    diegoAlejandro.setEmail("Royalimperial777@gmail.com");
	    diegoAlejandro.setCiudad(bogota);
	    diegoAlejandro.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> diegoAlejandrotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista diegoAlejandroTrabajo1 =  new TrabajosArtista();
	   diegoAlejandroTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandro1.jpg");
	   
	   TrabajosArtista diegoAlejandroTrabajo2 =  new TrabajosArtista();
	   diegoAlejandroTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandro2.jpg");
	   
	   TrabajosArtista diegoAlejandroTrabajo3 =  new TrabajosArtista();
	   diegoAlejandroTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandro3.jpg");
	   
	   TrabajosArtista diegoAlejandroTrabajo4 =  new TrabajosArtista();
	   diegoAlejandroTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandro4.jpg");
	   
	   TrabajosArtista diegoAlejandroTrabajo5 =  new TrabajosArtista();
	   diegoAlejandroTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoAlejandro/diegoAlejandro5.jpg");
	   
	   diegoAlejandrotrabajos.add(diegoAlejandroTrabajo1);
	   diegoAlejandrotrabajos.add(diegoAlejandroTrabajo2);
	   diegoAlejandrotrabajos.add(diegoAlejandroTrabajo3);
	   diegoAlejandrotrabajos.add(diegoAlejandroTrabajo4);
	   diegoAlejandrotrabajos.add(diegoAlejandroTrabajo5);
	   Collections.shuffle(diegoAlejandrotrabajos);
	   
	   diegoAlejandro.setTrabajosArtistas(diegoAlejandrotrabajos);
	   
	  
	   //FIN DIEGO ALEJANDRO
	   
//INICIO JHON GAVIRIA id 124
	   
	   Artista jhonGaviria=  new 	Artista();
		jhonGaviria.setDescripcion("Modificador corporal especialista  en reconstrucción  de  lóbulo~remoción de queloide ~bifurcación  de  lengua~ escarificacion ~microdermales ");
		jhonGaviria.setId("124");
		jhonGaviria.setNombre("Jhon gaviria");
		jhonGaviria.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviriaPerfil.jpg");
	    jhonGaviria.setFacebook("Jhon gaviria");
	    jhonGaviria.setUsuarioFacebook("jhonpropiercer");
	    jhonGaviria.setCelular("+573219904489");
	    jhonGaviria.setInstagram("Jhon gaviria");
	    jhonGaviria.setUsuarioInstagram("Jhonpropiercer");
	    jhonGaviria.setDireccion("Carrera 7ma#48a-68 chapinero ");
	    jhonGaviria.setEspecialidad(modificador);
	    jhonGaviria.setTwitter("no");
	    jhonGaviria.setUsuarioTwitter("false");
	    jhonGaviria.setLatitud("4.635066528699770");
	    jhonGaviria.setLongitud("-74.06370609998700");
	    jhonGaviria.setNombreEstudio("TLZ TATTOO ");
	    jhonGaviria.setEmail("Jhonbodymod@icloud.com");
	    jhonGaviria.setCiudad(bogota);
	    jhonGaviria.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> jhonGaviriatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jhonGaviriaTrabajo1 =  new TrabajosArtista();
	   jhonGaviriaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviria1.jpg");
	   
	   TrabajosArtista jhonGaviriaTrabajo2 =  new TrabajosArtista();
	   jhonGaviriaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviria2.jpg");
	   
	   TrabajosArtista jhonGaviriaTrabajo3 =  new TrabajosArtista();
	   jhonGaviriaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviria3.jpg");
	   
	   TrabajosArtista jhonGaviriaTrabajo4 =  new TrabajosArtista();
	   jhonGaviriaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviria4.jpg");
	   
	   TrabajosArtista jhonGaviriaTrabajo5 =  new TrabajosArtista();
	   jhonGaviriaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jhonGaviria/jhonGaviria5.jpg");
	   
	   jhonGaviriatrabajos.add(jhonGaviriaTrabajo1);
	   jhonGaviriatrabajos.add(jhonGaviriaTrabajo2);
	   jhonGaviriatrabajos.add(jhonGaviriaTrabajo3);
	   jhonGaviriatrabajos.add(jhonGaviriaTrabajo4);
	   jhonGaviriatrabajos.add(jhonGaviriaTrabajo5);
	   Collections.shuffle(jhonGaviriatrabajos);
	   
	   jhonGaviria.setTrabajosArtistas(jhonGaviriatrabajos);
	   
	  
	   //FIN JHON GAVIRIA
	   
//INICIO JUAN DAVID PARRA id 125
	   
	   Artista juanDavidParra=  new 	Artista();
		juanDavidParra.setDescripcion("4 años de experiencia ");
		juanDavidParra.setId("125");
		juanDavidParra.setNombre("Juan david parra");
		juanDavidParra.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParraPerfil.jpg");
	    juanDavidParra.setFacebook("Juan david parra");
	    juanDavidParra.setUsuarioFacebook("juandavid.parracastellanos");
	    juanDavidParra.setCelular("+573114619556");
	    juanDavidParra.setInstagram("no");
	    juanDavidParra.setUsuarioInstagram("false");
	    juanDavidParra.setDireccion("Av calle 72#98b-12 ");
	    juanDavidParra.setEspecialidad(realismo);
	    juanDavidParra.setTwitter("no");
	    juanDavidParra.setUsuarioTwitter("false");
	    juanDavidParra.setLatitud("4.702669157816866");
	    juanDavidParra.setLongitud("-74.11540567874908");
	    juanDavidParra.setNombreEstudio("West site store");
	    juanDavidParra.setEmail("Juandavidart24@Gmail.com");
	    juanDavidParra.setCiudad(bogota);
	    juanDavidParra.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> juanDavidParratrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanDavidParraTrabajo1 =  new TrabajosArtista();
	   juanDavidParraTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParra1.jpg");
	   
	   TrabajosArtista juanDavidParraTrabajo2 =  new TrabajosArtista();
	   juanDavidParraTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParra2.jpg");
	   
	   TrabajosArtista juanDavidParraTrabajo3 =  new TrabajosArtista();
	   juanDavidParraTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParra3.jpg");
	   
	   TrabajosArtista juanDavidParraTrabajo4 =  new TrabajosArtista();
	   juanDavidParraTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParra4.jpg");
	   
	   TrabajosArtista juanDavidParraTrabajo5 =  new TrabajosArtista();
	   juanDavidParraTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDavidParra/juanDavidParra5.jpg");
	   
	   juanDavidParratrabajos.add(juanDavidParraTrabajo1);
	   juanDavidParratrabajos.add(juanDavidParraTrabajo2);
	   juanDavidParratrabajos.add(juanDavidParraTrabajo3);
	   juanDavidParratrabajos.add(juanDavidParraTrabajo4);
	   juanDavidParratrabajos.add(juanDavidParraTrabajo5);
	   Collections.shuffle(juanDavidParratrabajos);
	   
	   juanDavidParra.setTrabajosArtistas(juanDavidParratrabajos);
	   
	  
	   //FIN JUAN DAVID PARRA
	   
//INICIO JUAN DIEGO DRAGON id 126
	   
	   Artista juanDiegoDragon=  new 	Artista();
		juanDiegoDragon.setDescripcion("Siete años en el mundo del tattoo,  con una inclinación hacia el full color. ");
		juanDiegoDragon.setId("126");
		juanDiegoDragon.setNombre("Juan diego dragon");
		juanDiegoDragon.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragonPerfil.jpg");
	    juanDiegoDragon.setFacebook("Juan diego dragon");
	    juanDiegoDragon.setUsuarioFacebook("juan.diego.100");
	    juanDiegoDragon.setCelular("+573012378246");
	    juanDiegoDragon.setInstagram("no");
	    juanDiegoDragon.setUsuarioInstagram("false");
	    juanDiegoDragon.setDireccion("Cll 64 Cra 11-37 Cc cosmos 64 local 210");
	    juanDiegoDragon.setEspecialidad(nuevaEscuela);
	    juanDiegoDragon.setTwitter("no");
	    juanDiegoDragon.setUsuarioTwitter("false");
	    juanDiegoDragon.setLatitud("4.650449318397660");
	    juanDiegoDragon.setLongitud("-74.06304895877830");
	    juanDiegoDragon.setNombreEstudio("West site store");
	    juanDiegoDragon.setEmail("Juandiego6870@gmail.com");
	    juanDiegoDragon.setCiudad(bogota);
	    juanDiegoDragon.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> juanDiegoDragontrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanDiegoDragonTrabajo1 =  new TrabajosArtista();
	   juanDiegoDragonTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragon1.jpg");
	   
	   TrabajosArtista juanDiegoDragonTrabajo2 =  new TrabajosArtista();
	   juanDiegoDragonTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragon2.jpg");
	   
	   TrabajosArtista juanDiegoDragonTrabajo3 =  new TrabajosArtista();
	   juanDiegoDragonTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragon3.jpg");
	   
	   TrabajosArtista juanDiegoDragonTrabajo4 =  new TrabajosArtista();
	   juanDiegoDragonTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragon4.jpg");
	   
	   TrabajosArtista juanDiegoDragonTrabajo5 =  new TrabajosArtista();
	   juanDiegoDragonTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanDiegoDragon/juanDiegoDragon5.jpg");
	   
	   juanDiegoDragontrabajos.add(juanDiegoDragonTrabajo1);
	   juanDiegoDragontrabajos.add(juanDiegoDragonTrabajo2);
	   juanDiegoDragontrabajos.add(juanDiegoDragonTrabajo3);
	   juanDiegoDragontrabajos.add(juanDiegoDragonTrabajo4);
	   juanDiegoDragontrabajos.add(juanDiegoDragonTrabajo5);
	   Collections.shuffle(juanDiegoDragontrabajos);
	   
	   juanDiegoDragon.setTrabajosArtistas(juanDiegoDragontrabajos);
	   
	  
	   //FIN JUAN DIEGO DRAGON
	   
//INICIO NICOLAS RINCON  id 127
	   
	   Artista nicolasRincon=  new 	Artista();
		nicolasRincon.setDescripcion("Encantando de recibir nuevas ideas,los diseños son personalizados para cada clientes únicos para cada persona.  me encanta trabajar todo lo relacionado con el full color el New school,  y el New tradicional. 3 años de experiencia. Primer lugar new school expotattoo duitama 2015"
    +"Primer lugar new school expotattoo Villavicencio 2014."
+"Segundo lugar tattoo Music festival 2015."
+"Tercer lugar newtraditional "
+"Expotattoo duitama 2015.");
		nicolasRincon.setId("127");
		nicolasRincon.setNombre("Nicolas rincon");
		nicolasRincon.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRinconPerfil.jpg");
	    nicolasRincon.setFacebook("Nicolás rincon");
	    nicolasRincon.setUsuarioFacebook("profile.php?id=100000590835821");
	    nicolasRincon.setCelular("+573143565488");
	    nicolasRincon.setInstagram("nicolas rincon");
	    nicolasRincon.setUsuarioInstagram("Nicolasblackpanther");
	    nicolasRincon.setDireccion("Cra 7 no 48 a11");
	    nicolasRincon.setEspecialidad(nuevaEscuela);
	    nicolasRincon.setTwitter("no");
	    nicolasRincon.setUsuarioTwitter("false");
	    nicolasRincon.setLatitud("4.634911469328660");
	    nicolasRincon.setLongitud("-74.06385362148280");
	    nicolasRincon.setNombreEstudio("Black panther studio. ");
	    nicolasRincon.setEmail("Nikkyblackpanther@gmail.com");
	    nicolasRincon.setCiudad(bogota);
	    nicolasRincon.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> nicolasRincontrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista nicolasRinconTrabajo1 =  new TrabajosArtista();
	   nicolasRinconTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRincon1.jpg");
	   
	   TrabajosArtista nicolasRinconTrabajo2 =  new TrabajosArtista();
	   nicolasRinconTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRincon2.jpg");
	   
	   TrabajosArtista nicolasRinconTrabajo3 =  new TrabajosArtista();
	   nicolasRinconTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRincon3.jpg");
	   
	   TrabajosArtista nicolasRinconTrabajo4 =  new TrabajosArtista();
	   nicolasRinconTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRincon4.jpg");
	   
	   TrabajosArtista nicolasRinconTrabajo5 =  new TrabajosArtista();
	   nicolasRinconTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasRincon/nicolasRincon5.jpg");
	   
	   nicolasRincontrabajos.add(nicolasRinconTrabajo1);
	   nicolasRincontrabajos.add(nicolasRinconTrabajo2);
	   nicolasRincontrabajos.add(nicolasRinconTrabajo3);
	   nicolasRincontrabajos.add(nicolasRinconTrabajo4);
	   nicolasRincontrabajos.add(nicolasRinconTrabajo5);
	   Collections.shuffle(nicolasRincontrabajos);
	   
	   nicolasRincon.setTrabajosArtistas(nicolasRincontrabajos);
	   
	  
	   //FIN NICOLAS RINCON
	   
//INICIO DANIEL ZOMBIE  id 128
	   
	   Artista danielZombie=  new 	Artista();
		danielZombie.setDescripcion("Tatuador en the last zombie ");
		danielZombie.setId("128");
		danielZombie.setNombre("Daniel zombie");
		danielZombie.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombiePerfil.jpg");
	    danielZombie.setFacebook("The Last Zombie Tattoo ");
	    danielZombie.setUsuarioFacebook("profile.php?id=100000590835821");
	    danielZombie.setCelular("+573134787405");
	    danielZombie.setInstagram("TLZ_tattoo");
	    danielZombie.setUsuarioInstagram("TLZ_tattoo");
	    danielZombie.setDireccion("Cra 7 #48a-68");
	    danielZombie.setEspecialidad(realismo);
	    danielZombie.setTwitter("no");
	    danielZombie.setUsuarioTwitter("false");
	    danielZombie.setLatitud("4.635066528699770");
	    danielZombie.setLongitud("-74.06370609998700");
	    danielZombie.setNombreEstudio("TLZ TATTOO ");
	    danielZombie.setEmail("daguante@hotmail.com");
	    danielZombie.setCiudad(bogota);
	    danielZombie.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> danielZombietrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista danielZombieTrabajo1 =  new TrabajosArtista();
	   danielZombieTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombie1.jpg");
	   
	   TrabajosArtista danielZombieTrabajo2 =  new TrabajosArtista();
	   danielZombieTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombie2.jpg");
	   
	   TrabajosArtista danielZombieTrabajo3 =  new TrabajosArtista();
	   danielZombieTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombie3.jpg");
	   
	   TrabajosArtista danielZombieTrabajo4 =  new TrabajosArtista();
	   danielZombieTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombie4.jpg");
	   
	   TrabajosArtista danielZombieTrabajo5 =  new TrabajosArtista();
	   danielZombieTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielZombie/danielZombie5.jpg");
	   
	   danielZombietrabajos.add(danielZombieTrabajo1);
	   danielZombietrabajos.add(danielZombieTrabajo2);
	   danielZombietrabajos.add(danielZombieTrabajo3);
	   danielZombietrabajos.add(danielZombieTrabajo4);
	   danielZombietrabajos.add(danielZombieTrabajo5);
	   Collections.shuffle(danielZombietrabajos);
	   
	   
	   danielZombie.setTrabajosArtistas(danielZombietrabajos);
	   
	  
	   //FIN DANIEL ZOMBIE
	   
//INICIO TATE MUNEVAR id 129
	   
	   Artista tateMunevar=  new 	Artista();
		tateMunevar.setDescripcion("Con amor al arte");
		tateMunevar.setId("129");
		tateMunevar.setNombre("Tate munevar");
		tateMunevar.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevarPerfil.jpg");
	    tateMunevar.setFacebook("Tate munevar");
	    tateMunevar.setUsuarioFacebook("checho.iiho");
	    tateMunevar.setCelular("+573164759082");
	    tateMunevar.setInstagram("yosoytate");
	    tateMunevar.setUsuarioInstagram("yosoytate");
	    tateMunevar.setDireccion("Cra 13a #60-41");
	    tateMunevar.setEspecialidad(fineline);
	    tateMunevar.setTwitter("no");
	    tateMunevar.setUsuarioTwitter("false");
	    tateMunevar.setLatitud("4.646792126637230");
	    tateMunevar.setLongitud("-74.06462609767910");
	    tateMunevar.setNombreEstudio("Amano Tattoo Shop ");
	    tateMunevar.setEmail("Info@amanotattoo.com");
	    tateMunevar.setCiudad(bogota);
	    tateMunevar.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> tateMunevartrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista tateMunevarTrabajo1 =  new TrabajosArtista();
	   tateMunevarTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevar1.jpg");
	   
	   TrabajosArtista tateMunevarTrabajo2 =  new TrabajosArtista();
	   tateMunevarTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevar2.jpg");
	   
	   TrabajosArtista tateMunevarTrabajo3 =  new TrabajosArtista();
	   tateMunevarTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevar3.jpg");
	   
	   TrabajosArtista tateMunevarTrabajo4 =  new TrabajosArtista();
	   tateMunevarTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevar4.jpg");
	   
	   TrabajosArtista tateMunevarTrabajo5 =  new TrabajosArtista();
	   tateMunevarTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tateMunevar/tateMunevar5.jpg");
	   
	   tateMunevartrabajos.add(tateMunevarTrabajo1);
	   tateMunevartrabajos.add(tateMunevarTrabajo2);
	   tateMunevartrabajos.add(tateMunevarTrabajo3);
	   tateMunevartrabajos.add(tateMunevarTrabajo4);
	   tateMunevartrabajos.add(tateMunevarTrabajo5);
	   Collections.shuffle(tateMunevartrabajos);
	   
	   
	   tateMunevar.setTrabajosArtistas(tateMunevartrabajos);
	   
	  
	   //FIN TATE MUNEVAR
	   
//INICIO ELOISE RICO id 130
	   
	   Artista eloiseRico=  new 	Artista();
		eloiseRico.setDescripcion("Hola! Soy Eloise, mi estudio es Amano Tattoo Shop, trabajamos por y para ustedes, amamos lo que hacemos. ");
		eloiseRico.setId("130");
		eloiseRico.setNombre("Eloise rico");
		eloiseRico.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRicoPerfil.jpg");
	    eloiseRico.setFacebook("Elosie rico");
	    eloiseRico.setUsuarioFacebook("YingMindfreak");
	    eloiseRico.setCelular("+573165017435");
	    eloiseRico.setInstagram("Whiteinkblacksoul");
	    eloiseRico.setUsuarioInstagram("Whiteinkblacksoul");
	    eloiseRico.setDireccion("Cra 13a #60-41");
	    eloiseRico.setEspecialidad(nuevaEscuela);
	    eloiseRico.setTwitter(" Amanoshop");
	    eloiseRico.setUsuarioTwitter("Amanoshop");
	    eloiseRico.setLatitud("4.646792126637230");
	    eloiseRico.setLongitud("-74.06462609767910");
	    eloiseRico.setNombreEstudio("Amano Tattoo Shop ");
	    eloiseRico.setEmail("Amanoshop@hotmail.com");
	    eloiseRico.setCiudad(bogota);
	    eloiseRico.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> eloiseRicotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista eloiseRicoTrabajo1 =  new TrabajosArtista();
	   eloiseRicoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRico1.jpg");
	   
	   TrabajosArtista eloiseRicoTrabajo2 =  new TrabajosArtista();
	   eloiseRicoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRico2.jpg");
	   
	   TrabajosArtista eloiseRicoTrabajo3 =  new TrabajosArtista();
	   eloiseRicoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRico3.jpg");
	   
	   TrabajosArtista eloiseRicoTrabajo4 =  new TrabajosArtista();
	   eloiseRicoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRico4.jpg");
	   
	   TrabajosArtista eloiseRicoTrabajo5 =  new TrabajosArtista();
	   eloiseRicoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/eloiseRico/eloiseRico5.jpg");
	   
	   eloiseRicotrabajos.add(eloiseRicoTrabajo1);
	   eloiseRicotrabajos.add(eloiseRicoTrabajo2);
	   eloiseRicotrabajos.add(eloiseRicoTrabajo3);
	   eloiseRicotrabajos.add(eloiseRicoTrabajo4);
	   eloiseRicotrabajos.add(eloiseRicoTrabajo5);
	   Collections.shuffle(eloiseRicotrabajos);
	   
	   
	   eloiseRico.setTrabajosArtistas(eloiseRicotrabajos);
	   
	  
	   //FIN ELOISE RICO
//INICIO ANDRES TRIVINO id 131
	   
	   Artista andresTrivino=  new 	Artista();
		andresTrivino.setDescripcion("Tatuador y pintor, llevo en este oficio 5 años especializándome en watercolor style o estilo acuarela mezclándolo con otros estilos de tatuaje, estudios en diseño  gráfico,  teoría  del color y composición.  ");
		andresTrivino.setId("131");
		andresTrivino.setNombre("Andres triviño");
		andresTrivino.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivinoPerfil.jpg");
	    andresTrivino.setFacebook("Andres triviño");
	    andresTrivino.setUsuarioFacebook("andres.trivino.100");
	    andresTrivino.setCelular("+573203562761");
	    andresTrivino.setInstagram("CHESTER_TATTOO");
	    andresTrivino.setUsuarioInstagram("CHESTER_TATTOO");
	    andresTrivino.setDireccion("Calle 59 No13-33 Pasaje Gálvez Chapinero");
	    andresTrivino.setEspecialidad(acuarela);
	    andresTrivino.setTwitter("no");
	    andresTrivino.setUsuarioTwitter("false");
	    andresTrivino.setLatitud("4.646011495528870");
	    andresTrivino.setLongitud("-74.06460732221600");
	    andresTrivino.setNombreEstudio("Bogotatuajes");
	    andresTrivino.setEmail("andrestrivino_27@hotmail.com");
	    andresTrivino.setCiudad(bogota);
	    andresTrivino.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> andresTrivinotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista andresTrivinoTrabajo1 =  new TrabajosArtista();
	   andresTrivinoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivino1.jpg");
	   
	   TrabajosArtista andresTrivinoTrabajo2 =  new TrabajosArtista();
	   andresTrivinoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivino2.jpg");
	   
	   TrabajosArtista andresTrivinoTrabajo3 =  new TrabajosArtista();
	   andresTrivinoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivino3.jpg");
	   
	   TrabajosArtista andresTrivinoTrabajo4 =  new TrabajosArtista();
	   andresTrivinoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivino4.jpg");
	   
	   TrabajosArtista andresTrivinoTrabajo5 =  new TrabajosArtista();
	   andresTrivinoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresTrivino/andresTrivino5.jpg");
	   
	   andresTrivinotrabajos.add(andresTrivinoTrabajo1);
	   andresTrivinotrabajos.add(andresTrivinoTrabajo2);
	   andresTrivinotrabajos.add(andresTrivinoTrabajo3);
	   andresTrivinotrabajos.add(andresTrivinoTrabajo4);
	   andresTrivinotrabajos.add(andresTrivinoTrabajo5);
	   Collections.shuffle(andresTrivinotrabajos);
	   
	   
	   andresTrivino.setTrabajosArtistas(andresTrivinotrabajos);
	   
	  
	   //FIN ANDRES TRIVINO
	   
//INICIO JOSE CABIATIVA  id 132
	   
	   Artista joseCabiativa=  new 	Artista();
		joseCabiativa.setDescripcion("Tatuador en Tattoo Company.Citas disponibles www.tattoocompany.tk");
		joseCabiativa.setId("132");
		joseCabiativa.setNombre("Jose cabiativa");
		joseCabiativa.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativaPerfil.jpg");
	    joseCabiativa.setFacebook("Jose cabiativa");
	    joseCabiativa.setUsuarioFacebook("JoseCabiativa21");
	    joseCabiativa.setCelular("+573208418701");
	    joseCabiativa.setInstagram("josecabiativa");
	    joseCabiativa.setUsuarioInstagram("josecabiativa");
	    joseCabiativa.setDireccion("Calle 57 # 13 - 65, local 201");
	    joseCabiativa.setEspecialidad(escritura);
	    joseCabiativa.setTwitter("Josecabiativa");
	    joseCabiativa.setUsuarioTwitter("Josecabiativa");
	    joseCabiativa.setLatitud("4.6441708601961400");
	    joseCabiativa.setLongitud("-74.06444974243640");
	    joseCabiativa.setNombreEstudio("Tatto company");
	    joseCabiativa.setEmail("Josecabiativa@live.com");
	    joseCabiativa.setCiudad(bogota);
	    joseCabiativa.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> joseCabiativatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista joseCabiativaTrabajo1 =  new TrabajosArtista();
	   joseCabiativaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativa1.jpg");
	   
	   TrabajosArtista joseCabiativaTrabajo2 =  new TrabajosArtista();
	   joseCabiativaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativa2.jpg");
	   
	   TrabajosArtista joseCabiativaTrabajo3 =  new TrabajosArtista();
	   joseCabiativaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativa3.jpg");
	   
	   TrabajosArtista joseCabiativaTrabajo4 =  new TrabajosArtista();
	   joseCabiativaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativa4.jpg");
	   
	   TrabajosArtista joseCabiativaTrabajo5 =  new TrabajosArtista();
	   joseCabiativaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/joseCabiativa/joseCabiativa5.jpg");
	   
	   joseCabiativatrabajos.add(joseCabiativaTrabajo1);
	   joseCabiativatrabajos.add(joseCabiativaTrabajo2);
	   joseCabiativatrabajos.add(joseCabiativaTrabajo3);
	   joseCabiativatrabajos.add(joseCabiativaTrabajo4);
	   joseCabiativatrabajos.add(joseCabiativaTrabajo5);
	   Collections.shuffle(joseCabiativatrabajos);
	   
	   
	   joseCabiativa.setTrabajosArtistas(joseCabiativatrabajos);
	   
	  
	   //FIN JOSE CABIATIVA
	   
//INICIO HERNAN BERROCAL  id 133
	   
	   Artista hernanBerrocal=  new 	Artista();
		hernanBerrocal.setDescripcion("Mi motivación por el artículo es cada vez hacerlo  mejor me gustan todos los estilos pero me aferró más al realismo");
		hernanBerrocal.setId("133");
		hernanBerrocal.setNombre("Hernan berrocal");
		hernanBerrocal.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocalPerfil.jpg");
	    hernanBerrocal.setFacebook("Hernan berrocal");
	    hernanBerrocal.setUsuarioFacebook("hippiiie.tattoo");
	    hernanBerrocal.setCelular("+573185225597");
	    hernanBerrocal.setInstagram("no");
	    hernanBerrocal.setUsuarioInstagram("false");
	    hernanBerrocal.setDireccion("Calle 99-29");
	    hernanBerrocal.setEspecialidad(realismo);
	    hernanBerrocal.setTwitter("no");
	    hernanBerrocal.setUsuarioTwitter("false");
	    hernanBerrocal.setLatitud("7.879876061655170");
	    hernanBerrocal.setLongitud("-76.63384437561030");
	    hernanBerrocal.setNombreEstudio("Rasta punk");
	    hernanBerrocal.setEmail("Hiroru17@hotmail.es");
	    hernanBerrocal.setCiudad(apartado);
	    hernanBerrocal.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> hernanBerrocaltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista hernanBerrocalTrabajo1 =  new TrabajosArtista();
	   hernanBerrocalTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocal1.jpg");
	   
	   TrabajosArtista hernanBerrocalTrabajo2 =  new TrabajosArtista();
	   hernanBerrocalTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocal2.jpg");
	   
	   TrabajosArtista hernanBerrocalTrabajo3 =  new TrabajosArtista();
	   hernanBerrocalTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocal3.jpg");
	   
	   TrabajosArtista hernanBerrocalTrabajo4 =  new TrabajosArtista();
	   hernanBerrocalTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocal4.jpg");
	   
	   TrabajosArtista hernanBerrocalTrabajo5 =  new TrabajosArtista();
	   hernanBerrocalTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hernanBerrocal/hernanBerrocal5.jpg");
	   
	   hernanBerrocaltrabajos.add(hernanBerrocalTrabajo1);
	   hernanBerrocaltrabajos.add(hernanBerrocalTrabajo2);
	   hernanBerrocaltrabajos.add(hernanBerrocalTrabajo3);
	   hernanBerrocaltrabajos.add(hernanBerrocalTrabajo4);
	   hernanBerrocaltrabajos.add(hernanBerrocalTrabajo5);
	   Collections.shuffle(hernanBerrocaltrabajos);
	   
	   
	   hernanBerrocal.setTrabajosArtistas(hernanBerrocaltrabajos);
	   
	  
	   //FIN HERNAN BERROCAL
	   
//INICIO CHRISTIAN LOPEZ  id 134
	   
	   Artista christianLopez=  new 	Artista();
		christianLopez.setDescripcion("Artista tatuador de Paipa Boyacá  especialidad sombras con 10 años de experiencia");
		christianLopez.setId("134");
		christianLopez.setNombre("Christian lopez");
		christianLopez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopezPerfil.jpg");
	    christianLopez.setFacebook("Christian López agata");
	    christianLopez.setUsuarioFacebook("christianlopezt");
	    christianLopez.setCelular("+573114987027");
	    christianLopez.setInstagram("no");
	    christianLopez.setUsuarioInstagram("false");
	    christianLopez.setDireccion("Calle 24#17 a 23");
	    christianLopez.setEspecialidad(tradicional);
	    christianLopez.setTwitter("no");
	    christianLopez.setUsuarioTwitter("false");
	    christianLopez.setLatitud("5.776828194938020");
	    christianLopez.setLongitud("-73.11841249465940");
	    christianLopez.setNombreEstudio("Ágata tattoo");
	    christianLopez.setEmail("Canavinol@Hotmail.com ");
	    christianLopez.setCiudad(paipa);
	    christianLopez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> christianLopeztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista christianLopezTrabajo1 =  new TrabajosArtista();
	   christianLopezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopez1.jpg");
	   
	   TrabajosArtista christianLopezTrabajo2 =  new TrabajosArtista();
	   christianLopezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopez2.jpg");
	   
	   TrabajosArtista christianLopezTrabajo3 =  new TrabajosArtista();
	   christianLopezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopez3.jpg");
	   
	   TrabajosArtista christianLopezTrabajo4 =  new TrabajosArtista();
	   christianLopezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopez4.jpg");
	   
	   TrabajosArtista christianLopezTrabajo5 =  new TrabajosArtista();
	   christianLopezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/christianLopez/christianLopez5.jpg");
	   
	   christianLopeztrabajos.add(christianLopezTrabajo1);
	   christianLopeztrabajos.add(christianLopezTrabajo2);
	   christianLopeztrabajos.add(christianLopezTrabajo3);
	   christianLopeztrabajos.add(christianLopezTrabajo4);
	   christianLopeztrabajos.add(christianLopezTrabajo5);
	   Collections.shuffle(christianLopeztrabajos);
	   
	   
	   christianLopez.setTrabajosArtistas(christianLopeztrabajos);
	   
	  
	   //FIN CHRISTIAN LOPEZ
	   
//INICIO NICOLAS GUTIERREZ LOPEZ  id 135
	   
	   Artista nicolasGutierrez=  new 	Artista();
		nicolasGutierrez.setDescripcion("Mi nombre es Nicolás Gutierrez, tatuador desde hace 5 años especializado en los en los tatuajes tradicional,neo tradicional y tradicional japones. Apasionado en pintar y sacar nuevas ideas mis"
         +" Premios son:"
         +" 3 Lugar categoria Oriental Convencion nacional Bosa tattoo 2014"
         +", 1 Lugar categoria Oriental Expo tattoo Subliminal 2014"
         +", 2 Lugar categoría tradicional Convencion internacional de medellin 2015"
         +", 1 Lugar categoría tradicional Buga tattoo 2015" 
         +", 1 Lugar categoría tradicional Expo tattoo Subliminal 2015 "
         +", 1 Lugar categoria tradicional Out the box 2015  ");
		nicolasGutierrez.setId("135");
		nicolasGutierrez.setNombre("Nicolas gutierrez");
		nicolasGutierrez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrezPerfil.jpg");
	    nicolasGutierrez.setFacebook("Free Ink tattoo studio");
	    nicolasGutierrez.setUsuarioFacebook("Free.Ink.Tattoo.Studio");
	    nicolasGutierrez.setCelular("+573212155087");
	    nicolasGutierrez.setInstagram("freeinktattoo");
	    nicolasGutierrez.setUsuarioInstagram("freeinktattoo");
	    nicolasGutierrez.setDireccion("Carrera 77a # 63f-80segundo piso");
	    nicolasGutierrez.setEspecialidad(tradicional);
	    nicolasGutierrez.setTwitter("no");
	    nicolasGutierrez.setUsuarioTwitter("false");
	    nicolasGutierrez.setLatitud("4.683373880982310");
	    nicolasGutierrez.setLongitud("-74.10460710525510");
	    nicolasGutierrez.setNombreEstudio("Free INK Tattoo  ");
	    nicolasGutierrez.setEmail("freeinktattoostudio@gmail.com ");
	    nicolasGutierrez.setCiudad(bogota);
	    nicolasGutierrez.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> nicolasGutierreztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista nicolasGutierrezTrabajo1 =  new TrabajosArtista();
	   nicolasGutierrezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrez1.jpg");
	   
	   TrabajosArtista nicolasGutierrezTrabajo2 =  new TrabajosArtista();
	   nicolasGutierrezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrez2.jpg");
	   
	   TrabajosArtista nicolasGutierrezTrabajo3 =  new TrabajosArtista();
	   nicolasGutierrezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrez3.jpg");
	   
	   TrabajosArtista nicolasGutierrezTrabajo4 =  new TrabajosArtista();
	   nicolasGutierrezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrez4.jpg");
	   
	   TrabajosArtista nicolasGutierrezTrabajo5 =  new TrabajosArtista();
	   nicolasGutierrezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasGutierrez/nicolasGutierrez5.jpg");
	   
	   nicolasGutierreztrabajos.add(nicolasGutierrezTrabajo1);
	   nicolasGutierreztrabajos.add(nicolasGutierrezTrabajo2);
	   nicolasGutierreztrabajos.add(nicolasGutierrezTrabajo3);
	   nicolasGutierreztrabajos.add(nicolasGutierrezTrabajo4);
	   nicolasGutierreztrabajos.add(nicolasGutierrezTrabajo5);
	   Collections.shuffle(nicolasGutierreztrabajos);
	   
	   
	   nicolasGutierrez.setTrabajosArtistas(nicolasGutierreztrabajos);
	   
	  
	   //FIN NICOLAS GUTIERREZ 
//INICIO LUIS VEGA  id 136
	   
	   Artista luisVega=  new 	Artista();
		luisVega.setDescripcion("3 años en tatuajes pictóricos acuarela ");
		luisVega.setId("136");
		luisVega.setNombre("Luis castellanos");
		luisVega.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVegaPerfil.jpg");
	    luisVega.setFacebook("Luis vega vega ");
	    luisVega.setUsuarioFacebook("luisdavid.castellano");
	    luisVega.setCelular("+57321456987");
	    luisVega.setInstagram("luiscastellano");
	    luisVega.setUsuarioInstagram("luiscastellano");
	    luisVega.setDireccion("Cll 48 sur n42 a 75 ");
	    luisVega.setEspecialidad(realismo);
	    luisVega.setTwitter("no");
	    luisVega.setUsuarioTwitter("false");
	    luisVega.setLatitud("6.158764");
	    luisVega.setLongitud("-75.597149");
	    luisVega.setNombreEstudio("La familia tatto  ");
	    luisVega.setEmail("no");
	    luisVega.setCiudad(envigado);
	    luisVega.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> luisVegatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista luisVegaTrabajo1 =  new TrabajosArtista();
	   luisVegaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVega1.jpg");
	   
	   TrabajosArtista luisVegaTrabajo2 =  new TrabajosArtista();
	   luisVegaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVega2.jpg");
	   
	   TrabajosArtista luisVegaTrabajo3 =  new TrabajosArtista();
	   luisVegaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVega3.jpg");
	   
	   TrabajosArtista luisVegaTrabajo4 =  new TrabajosArtista();
	   luisVegaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVega4.jpg");
	   
	   TrabajosArtista luisVegaTrabajo5 =  new TrabajosArtista();
	   luisVegaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/luisVega/luisVega5.jpg");
	   
	   luisVegatrabajos.add(luisVegaTrabajo1);
	   luisVegatrabajos.add(luisVegaTrabajo2);
	   luisVegatrabajos.add(luisVegaTrabajo3);
	   luisVegatrabajos.add(luisVegaTrabajo4);
	   luisVegatrabajos.add(luisVegaTrabajo5);
	   Collections.shuffle(luisVegatrabajos);
	   
	   
	   luisVega.setTrabajosArtistas(luisVegatrabajos);
	   
	  
	   //FIN LUIS VEGA
//INICIO DAVID SANCHEZ id 137
	   
	   Artista davidSanchez=  new 	Artista();
		davidSanchez.setDescripcion("Llevo 5 años tatuando me gusta trabajar ola school y oriental mi studio queda en facultativa ");
		davidSanchez.setId("137");
		davidSanchez.setNombre("David sanchez");
		davidSanchez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchezPerfil.jpg");
	    davidSanchez.setFacebook("Ink side tatto ");
	    davidSanchez.setUsuarioFacebook("pages/Ink-Side-Tattoo/925177377540646");
	    davidSanchez.setCelular("+573202709792");
	    davidSanchez.setInstagram("Davidinkside");
	    davidSanchez.setUsuarioInstagram("Davidinkside");
	    davidSanchez.setDireccion("Cc el portico");
	    davidSanchez.setEspecialidad(tradicional);
	    davidSanchez.setTwitter("no");
	    davidSanchez.setUsuarioTwitter("false");
	    davidSanchez.setLatitud("4.818044644600220");
	    davidSanchez.setLongitud("-74.3584218621254");
	    davidSanchez.setNombreEstudio("Ink side tatto shop ");
	    davidSanchez.setEmail("Hairmansionpeluqueria@gmail.com");
	    davidSanchez.setCiudad(facatativa);
	    davidSanchez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> davidSancheztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista davidSanchezTrabajo1 =  new TrabajosArtista();
	   davidSanchezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchez1.jpg");
	   
	   TrabajosArtista davidSanchezTrabajo2 =  new TrabajosArtista();
	   davidSanchezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchez2.jpg");
	   
	   TrabajosArtista davidSanchezTrabajo3 =  new TrabajosArtista();
	   davidSanchezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchez3.jpg");
	   
	   TrabajosArtista davidSanchezTrabajo4 =  new TrabajosArtista();
	   davidSanchezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchez4.jpg");
	   
	   TrabajosArtista davidSanchezTrabajo5 =  new TrabajosArtista();
	   davidSanchezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidSanchez/davidSanchez5.jpg");
	   
	   davidSancheztrabajos.add(davidSanchezTrabajo1);
	   davidSancheztrabajos.add(davidSanchezTrabajo2);
	   davidSancheztrabajos.add(davidSanchezTrabajo3);
	   davidSancheztrabajos.add(davidSanchezTrabajo4);
	   davidSancheztrabajos.add(davidSanchezTrabajo5);
	   Collections.shuffle(davidSancheztrabajos);
	   
	   
	   davidSanchez.setTrabajosArtistas(davidSancheztrabajos);
	   
	  
	   //FIN DAVID SANCHEZ
	   
//INICIO PRISE GIRALDO id 138
	   
	   Artista priseGiraldo=  new 	Artista();
		priseGiraldo.setDescripcion("4 años de nada más que pasión y sentimiento, me destacó en las ramas oriental, neo tradicional, New school y sombras... ");
		priseGiraldo.setId("138");
		priseGiraldo.setNombre("Prise giraldo");
		priseGiraldo.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldoPerfil.jpg");
	    priseGiraldo.setFacebook("Prise Giraldo taborda");
	    priseGiraldo.setUsuarioFacebook("priseink");
	    priseGiraldo.setCelular("+573202362310");
	    priseGiraldo.setInstagram("Prise giraldo");
	    priseGiraldo.setUsuarioInstagram("prisegiraldo");
	    priseGiraldo.setDireccion("Cll 2b # 38 a 23 carabelas");
	    priseGiraldo.setEspecialidad(neotradicional);
	    priseGiraldo.setTwitter("no");
	    priseGiraldo.setUsuarioTwitter("false");
	    priseGiraldo.setLatitud("4.608398491039670");
	    priseGiraldo.setLongitud("-74.11013647913930");
	    priseGiraldo.setNombreEstudio("Jammink");
	    priseGiraldo.setEmail("Jsgt_702@hotmail.com");
	    priseGiraldo.setCiudad(bogota);
	    priseGiraldo.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> priseGiraldotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista priseGiraldoTrabajo1 =  new TrabajosArtista();
	   priseGiraldoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldo1.jpg");
	   
	   TrabajosArtista priseGiraldoTrabajo2 =  new TrabajosArtista();
	   priseGiraldoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldo2.jpg");
	   
	   TrabajosArtista priseGiraldoTrabajo3 =  new TrabajosArtista();
	   priseGiraldoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldo3.jpg");
	   
	   TrabajosArtista priseGiraldoTrabajo4 =  new TrabajosArtista();
	   priseGiraldoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldo4.jpg");
	   
	   TrabajosArtista priseGiraldoTrabajo5 =  new TrabajosArtista();
	   priseGiraldoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/priseGiraldo/priseGiraldo5.jpg");
	   
	   priseGiraldotrabajos.add(priseGiraldoTrabajo1);
	   priseGiraldotrabajos.add(priseGiraldoTrabajo2);
	   priseGiraldotrabajos.add(priseGiraldoTrabajo3);
	   priseGiraldotrabajos.add(priseGiraldoTrabajo4);
	   priseGiraldotrabajos.add(priseGiraldoTrabajo5);
	   Collections.shuffle(priseGiraldotrabajos);
	   
	   
	   priseGiraldo.setTrabajosArtistas(priseGiraldotrabajos);
	   
	  
	   //FIN PRISE GIRALDO
//INICIO MAURICIO INSIGNARES id 139
	   
	   Artista mauricioInsignares=  new 	Artista();
		mauricioInsignares.setDescripcion("Años de experiencia 20 años");
		mauricioInsignares.setId("139");
		mauricioInsignares.setNombre("Mauricio insignares");
		mauricioInsignares.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignaresPerfil.jpg");
	    mauricioInsignares.setFacebook("Mauricio insignares");
	    mauricioInsignares.setUsuarioFacebook("mauricio.insignares.5");
	    mauricioInsignares.setCelular("+573112604676");
	    mauricioInsignares.setInstagram("Mauricioyakuza");
	    mauricioInsignares.setUsuarioInstagram("Mauricioyakuza");
	    mauricioInsignares.setDireccion("Cll 63# 1087centro comercial Lourdes local 1066");
	    mauricioInsignares.setEspecialidad(arteJapones);
	    mauricioInsignares.setTwitter("no");
	    mauricioInsignares.setUsuarioTwitter("false");
	    mauricioInsignares.setLatitud("4.648923");
	    mauricioInsignares.setLongitud("-74.06241");
	    mauricioInsignares.setNombreEstudio("Yakuza tattoo ");
	    mauricioInsignares.setEmail("Yakuzatatoo@hotmail.com");
	    mauricioInsignares.setCiudad(bogota);
	    mauricioInsignares.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> mauricioInsignarestrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista mauricioInsignaresTrabajo1 =  new TrabajosArtista();
	   mauricioInsignaresTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignares1.jpg");
	   
	   TrabajosArtista mauricioInsignaresTrabajo2 =  new TrabajosArtista();
	   mauricioInsignaresTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignares2.jpg");
	   
	   TrabajosArtista mauricioInsignaresTrabajo3 =  new TrabajosArtista();
	   mauricioInsignaresTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignares3.jpg");
	   
	   TrabajosArtista mauricioInsignaresTrabajo4 =  new TrabajosArtista();
	   mauricioInsignaresTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignares4.jpg");
	   
	   TrabajosArtista mauricioInsignaresTrabajo5 =  new TrabajosArtista();
	   mauricioInsignaresTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioInsignares/mauricioInsignares5.jpg");
	   
	   mauricioInsignarestrabajos.add(mauricioInsignaresTrabajo1);
	   mauricioInsignarestrabajos.add(mauricioInsignaresTrabajo2);
	   mauricioInsignarestrabajos.add(mauricioInsignaresTrabajo3);
	   mauricioInsignarestrabajos.add(mauricioInsignaresTrabajo4);
	   mauricioInsignarestrabajos.add(mauricioInsignaresTrabajo5);
	   Collections.shuffle(mauricioInsignarestrabajos);
	   
	   
	   mauricioInsignares.setTrabajosArtistas(mauricioInsignarestrabajos);
	   
	  
	   //FIN MAURICIO INSIGNARES
	   
//INICIO JUAN MAHECHA  id 140
	   
	   Artista juanMahecha=  new 	Artista();
		juanMahecha.setDescripcion("Especialidad estilo libre");
		juanMahecha.setId("140");
		juanMahecha.setNombre("Juan mahecha");
		juanMahecha.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahechaPerfil.jpg");
	    juanMahecha.setFacebook("Juan mahecha");
	    juanMahecha.setUsuarioFacebook("juanmanuel.mahecha");
	    juanMahecha.setCelular("+573204687691");
	    juanMahecha.setInstagram("juanmanuelmahecha");
	    juanMahecha.setUsuarioInstagram("juanmanuelmahecha");
	    juanMahecha.setDireccion("Cr 13#60_75");
	    juanMahecha.setEspecialidad(estiloLibre);
	    juanMahecha.setTwitter("no");
	    juanMahecha.setUsuarioTwitter("false");
	    juanMahecha.setLatitud("4.647625");
	    juanMahecha.setLongitud("-74.06385419999990");
	    juanMahecha.setNombreEstudio("Trece chiros store");
	    juanMahecha.setEmail("Juanmahecha@hotmail.com");
	    juanMahecha.setCiudad(bogota);
	    juanMahecha.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> juanMahechatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanMahechaTrabajo1 =  new TrabajosArtista();
	   juanMahechaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahecha1.jpg");
	   
	   TrabajosArtista juanMahechaTrabajo2 =  new TrabajosArtista();
	   juanMahechaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahecha2.jpg");
	   
	   TrabajosArtista juanMahechaTrabajo3 =  new TrabajosArtista();
	   juanMahechaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahecha3.jpg");
	   
	   TrabajosArtista juanMahechaTrabajo4 =  new TrabajosArtista();
	   juanMahechaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahecha4.jpg");
	   
	   TrabajosArtista juanMahechaTrabajo5 =  new TrabajosArtista();
	   juanMahechaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanMahecha/juanMahecha5.jpg");
	   
	   juanMahechatrabajos.add(juanMahechaTrabajo1);
	   juanMahechatrabajos.add(juanMahechaTrabajo2);
	   juanMahechatrabajos.add(juanMahechaTrabajo3);
	   juanMahechatrabajos.add(juanMahechaTrabajo4);
	   juanMahechatrabajos.add(juanMahechaTrabajo5);
	   Collections.shuffle(juanMahechatrabajos);
	   
	   
	   juanMahecha.setTrabajosArtistas(juanMahechatrabajos);
	   
	  
	   //FIN JUAN MAHECHA
	   
//INICIO PEPO TATTO  id 141
	   
	   Artista pepoTatto=  new 	Artista();
		pepoTatto.setDescripcion("Realizo realismo en grises y color, neo tradicional, cover ups, geometrías y estilo libre.");
		pepoTatto.setId("141");
		pepoTatto.setNombre("Pepo perez");
		pepoTatto.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerezPerfil.jpg");
	    pepoTatto.setFacebook("Juan mahecha");
	    pepoTatto.setUsuarioFacebook("pipe.perez.1029");
	    pepoTatto.setCelular("+573008282091");
	    pepoTatto.setInstagram("Pepotattoo7");
	    pepoTatto.setUsuarioInstagram("Pepotattoo7");
	    pepoTatto.setDireccion("Cr 13#60_75");
	    pepoTatto.setEspecialidad(estiloLibre);
	    pepoTatto.setTwitter("no");
	    pepoTatto.setUsuarioTwitter("false");
	    pepoTatto.setLatitud("4.647625");
	    pepoTatto.setLongitud("-74.06385419999990");
	    pepoTatto.setNombreEstudio("Trece chiros store");
	    pepoTatto.setEmail("pepopereztattoo@Gmail.com");
	    pepoTatto.setCiudad(bogota);
	    pepoTatto.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> pepoTattotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista pepoTattoTrabajo1 =  new TrabajosArtista();
	   pepoTattoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerez1.jpg");
	   
	   TrabajosArtista pepoTattoTrabajo2 =  new TrabajosArtista();
	   pepoTattoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerez2.jpg");
	   
	   TrabajosArtista pepoTattoTrabajo3 =  new TrabajosArtista();
	   pepoTattoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerez3.jpg");
	   
	   TrabajosArtista pepoTattoTrabajo4 =  new TrabajosArtista();
	   pepoTattoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerez4.jpg");
	   
	   TrabajosArtista pepoTattoTrabajo5 =  new TrabajosArtista();
	   pepoTattoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pepoPerez/pepoPerez5.jpg");
	   
	   pepoTattotrabajos.add(pepoTattoTrabajo1);
	   pepoTattotrabajos.add(pepoTattoTrabajo2);
	   pepoTattotrabajos.add(pepoTattoTrabajo3);
	   pepoTattotrabajos.add(pepoTattoTrabajo4);
	   pepoTattotrabajos.add(pepoTattoTrabajo5);
	   Collections.shuffle(pepoTattotrabajos);
	   
	   
	   pepoTatto.setTrabajosArtistas(pepoTattotrabajos);
	   //FIN  PEPO TATTO
	   
//INICIO ANGEL CASTRO id 142
	   
	   Artista angelCastro=  new 	Artista();
		angelCastro.setDescripcion("Diseñador gráfico ,ganador mejor diseñador incap 2013 Tatuador enfatizado en zombies");
		angelCastro.setId("142");
		angelCastro.setNombre("Angel castro");
		angelCastro.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastroPerfil.jpg");
	    angelCastro.setFacebook("The joker zombie");
	    angelCastro.setUsuarioFacebook("estapadosropa");
	    angelCastro.setCelular("+573163276357");
	    angelCastro.setInstagram("the_joker_ghetto");
	    angelCastro.setUsuarioInstagram("xhe_joker_ghetto");
	    angelCastro.setDireccion("Cra 13#61-75");
	    angelCastro.setEspecialidad(nuevaEscuela);
	    angelCastro.setTwitter("no");
	    angelCastro.setUsuarioTwitter("false");
	    angelCastro.setLatitud("4.5930336");
	    angelCastro.setLongitud("-74.0865177");
	    angelCastro.setNombreEstudio("Zombie ink");
	    angelCastro.setEmail("Zneider.mc@gmail.com");
	    angelCastro.setCiudad(bogota);
	    angelCastro.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> angelCastrotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista angelCastroTrabajo1 =  new TrabajosArtista();
	   angelCastroTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastro1.jpg");
	   
	   TrabajosArtista angelCastroTrabajo2 =  new TrabajosArtista();
	   angelCastroTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastro2.jpg");
	   
	   TrabajosArtista angelCastroTrabajo3 =  new TrabajosArtista();
	   angelCastroTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastro3.jpg");
	   
	   TrabajosArtista angelCastroTrabajo4 =  new TrabajosArtista();
	   angelCastroTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastro4.jpg");
	   
	   TrabajosArtista angelCastroTrabajo5 =  new TrabajosArtista();
	   angelCastroTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/angelCastro/angelCastro5.jpg");
	   
	   angelCastrotrabajos.add(angelCastroTrabajo1);
	   angelCastrotrabajos.add(angelCastroTrabajo2);
	   angelCastrotrabajos.add(angelCastroTrabajo3);
	   angelCastrotrabajos.add(angelCastroTrabajo4);
	   angelCastrotrabajos.add(angelCastroTrabajo5);
	   Collections.shuffle(angelCastrotrabajos);
	   
	   
	   angelCastro.setTrabajosArtistas(angelCastrotrabajos);
	   //FIN  ANGEL CASTRO
	   
//INICIO MARIO TOLOZA id 143 
	   
	   Artista marioToloza=  new 	Artista();
		marioToloza.setDescripcion("Realismo,Surrealismo,Color,Sombras");
		marioToloza.setId("143");
		marioToloza.setNombre("Mario toloza");
		marioToloza.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioTolozaPerfil.jpg");
	    marioToloza.setFacebook("Mario Toloza -  Ink&Art");
	    marioToloza.setUsuarioFacebook("Mario-Toloza-InkArt-342789545821364");
	    marioToloza.setCelular("+573202825465");
	    marioToloza.setInstagram("Mariotolo");
	    marioToloza.setUsuarioInstagram("Mariotolo");
	    marioToloza.setDireccion("kra 15 # 83-24");
	    marioToloza.setEspecialidad(realismo);
	    marioToloza.setTwitter("no");
	    marioToloza.setUsuarioTwitter("false");
	    marioToloza.setLatitud("4.668671");
	    marioToloza.setLongitud("-74.055871");
	    marioToloza.setNombreEstudio("---");
	    marioToloza.setEmail("Mariotoloza2283@gmail.com");
	    marioToloza.setCiudad(bogota);
	    marioToloza.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> marioTolozatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista marioTolozaTrabajo1 =  new TrabajosArtista();
	   marioTolozaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza1.jpg");
	   
	   TrabajosArtista marioTolozaTrabajo2 =  new TrabajosArtista();
	   marioTolozaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza2.jpg");
	   
	   TrabajosArtista marioTolozaTrabajo3 =  new TrabajosArtista();
	   marioTolozaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza3.jpg");
	   
	   TrabajosArtista marioTolozaTrabajo4 =  new TrabajosArtista();
	   marioTolozaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza4.jpg");
	   
	   TrabajosArtista marioTolozaTrabajo5 =  new TrabajosArtista();
	   marioTolozaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza5.jpg");
	   
	   TrabajosArtista marioTolozaTrabajo6 =  new TrabajosArtista();
	   marioTolozaTrabajo6.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza6.jpg");
	   TrabajosArtista marioTolozaTrabajo7 =  new TrabajosArtista();
	   marioTolozaTrabajo7.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza7.jpg");
	   TrabajosArtista marioTolozaTrabajo8 =  new TrabajosArtista();
	   marioTolozaTrabajo8.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza8.jpg");
	   TrabajosArtista marioTolozaTrabajo9 =  new TrabajosArtista();
	   marioTolozaTrabajo9.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza9.jpg");
	   TrabajosArtista marioTolozaTrabajo10 =  new TrabajosArtista();
	   marioTolozaTrabajo10.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marioToloza/marioToloza10.jpg");
	   
	   marioTolozatrabajos.add(marioTolozaTrabajo1);
	   marioTolozatrabajos.add(marioTolozaTrabajo2);
	   marioTolozatrabajos.add(marioTolozaTrabajo3);
	   marioTolozatrabajos.add(marioTolozaTrabajo4);
	   marioTolozatrabajos.add(marioTolozaTrabajo5);
	   marioTolozatrabajos.add(marioTolozaTrabajo6);
	   marioTolozatrabajos.add(marioTolozaTrabajo7);
	   marioTolozatrabajos.add(marioTolozaTrabajo8);
	   marioTolozatrabajos.add(marioTolozaTrabajo9);
	   marioTolozatrabajos.add(marioTolozaTrabajo10);
	   Collections.shuffle(marioTolozatrabajos);
	   
	   
	   marioToloza.setTrabajosArtistas(marioTolozatrabajos);
	   
	   VideoDTO video1  =  new  VideoDTO();
	   video1.setId("1");
	   video1.setUrl("https://video-mia1-1.xx.fbcdn.net/hvideo-xtf1/v/t42.1790-2/12025092_689338737833108_1212354043_n.mp4?efg=eyJybHIiOjc4MywicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoicmVzXzQyNl9jcmZfMjNfbWFpbl8zLjBfc2QifQ%3D%3D&rl=783&vabr=435&oh=375cfd01cb154f2e7563268b6b0f30da&oe=5621B72B");
	   
	   VideoDTO video2  =  new VideoDTO();
	   video2.setId("2");
	   video2.setUrl("https://fbcdn-video-p-a.akamaihd.net/hvideo-ak-xtp1/v/t42.1790-2/12094522_10153685375753139_1075975740_n.mp4?efg=eyJybHIiOjU5NSwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoidjJfNDI2X2NyZl8yM19tYWluXzMuMF9zZCJ9&rl=595&vabr=331&oh=2331d94fc05c8ef7642c06f6de2ebfdd&oe=5621B6B4&__gda__=1445052837_69ccfacdebbfbef65bc8c6011c53d3a0");
	   
	   
	   VideoDTO video3  =  new VideoDTO();
	   video3.setId("3");
	   video3.setUrl("https://fbcdn-video-k-a.akamaihd.net/hvideo-ak-xta1/v/t42.1790-2/12067683_985278538201105_260823119_n.mp4?efg=eyJybHIiOjMwMCwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic2QifQ%3D%3D&rl=300&vabr=135&oh=2bdecdf5c1c906ad6d91a41c8718b755&oe=5621B73D&__gda__=1445050258_6be6e12eaa72f91d04b13d66c74f1a8c");
	   
	   VideoDTO video4  =  new VideoDTO();
	   video4.setId("4");
	   video4.setUrl("https://fbcdn-video-b-a.akamaihd.net/hvideo-ak-xpl1/v/t42.1790-2/12130285_10153665738463139_1775278427_n.mp4?efg=eyJybHIiOjQ5MSwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoic2QifQ%3D%3D&rl=491&vabr=273&oh=72ddb17433f57db1dc2f7ee0100e11dc&oe=5621C614&__gda__=1445053185_b393cef98fb97f4b06fc22fe6568cb89");
	   
	   VideoDTO video5  =  new VideoDTO();
	   video5.setId("5");
	   video5.setUrl("https://fbcdn-video-g-a.akamaihd.net/hvideo-ak-xtf1/v/t42.1790-2/12048075_10153648533883139_1270542163_n.mp4?efg=eyJybHIiOjU2OCwicmxhIjo1MTIsInZlbmNvZGVfdGFnIjoicmVzXzQyNl9jcmZfMjNfbWFpbl8zLjBfc2QifQ%3D%3D&rl=568&vabr=316&oh=4b2a3bff48bc2529574a76ace00df5f9&oe=5621C7AC&__gda__=1445052719_627bd0262f187eca65276fad0156c520");
	   
	   ArrayList<VideoDTO> videos =  new ArrayList<VideoDTO>();
	   videos.add(video1);
	   videos.add(video2);
	   videos.add(video3);
	   videos.add(video4);
	   videos.add(video5);
	   
	   marioToloza.setVideoOpcion("false");
	   marioToloza.setVideosArtistas(videos);
	   
	   //FIN MARIO TOLOZA
	   
//INICIO DAVID MALDONADO id 144 
	   
	   Artista davidMaldonado=  new 	Artista();
		davidMaldonado.setDescripcion("Me especializó en técnica realismo más de 5 años de experiencia premios en Colombia y México ");
		davidMaldonado.setId("144");
		davidMaldonado.setNombre("David maldonado");
		davidMaldonado.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonadoPerfil.jpg");
	    davidMaldonado.setFacebook("David maldonado ART");
	    davidMaldonado.setUsuarioFacebook("David-Maldonado-ART-461849523933316");
	    davidMaldonado.setCelular("+573015731556");
	    davidMaldonado.setInstagram("Davidmaldonadoart");
	    davidMaldonado.setUsuarioInstagram("Davidmaldonadoart");
	    davidMaldonado.setDireccion("---");
	    davidMaldonado.setEspecialidad(realismo);
	    davidMaldonado.setTwitter("no");
	    davidMaldonado.setUsuarioTwitter("false");
	    davidMaldonado.setLatitud("4.668671");
	    davidMaldonado.setLongitud("-74.055871");
	    davidMaldonado.setNombreEstudio("---");
	    davidMaldonado.setEmail("pilon98@hotmail.es");
	    davidMaldonado.setCiudad(bogota);
	    davidMaldonado.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> davidMaldonadotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista davidMaldonadoTrabajo1 =  new TrabajosArtista();
	   davidMaldonadoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonado1.jpg");
	   
	   TrabajosArtista davidMaldonadoTrabajo2 =  new TrabajosArtista();
	   davidMaldonadoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonado2.jpg");
	   
	   TrabajosArtista davidMaldonadoTrabajo3 =  new TrabajosArtista();
	   davidMaldonadoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonado3.jpg");
	   
	   TrabajosArtista davidMaldonadoTrabajo4 =  new TrabajosArtista();
	   davidMaldonadoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonado4.jpg");
	   
	   TrabajosArtista davidMaldonadoTrabajo5 =  new TrabajosArtista();
	   davidMaldonadoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado/davidMaldonado5.jpg");
	   
	   davidMaldonadotrabajos.add(davidMaldonadoTrabajo1);
	   davidMaldonadotrabajos.add(davidMaldonadoTrabajo2);
	   davidMaldonadotrabajos.add(davidMaldonadoTrabajo3);
	   davidMaldonadotrabajos.add(davidMaldonadoTrabajo4);
	   davidMaldonadotrabajos.add(davidMaldonadoTrabajo5);
	   Collections.shuffle(davidMaldonadotrabajos);
	   
	   
	   davidMaldonado.setTrabajosArtistas(davidMaldonadotrabajos);
	   //FIN DAVID MALDONADO
	   
//INICIO SEBASTIAN GARCIA id 145 
	   
	   Artista sebastianGarcia=  new 	Artista();
		sebastianGarcia.setDescripcion("Me gusta el estilo vieja escuela y neo tradicional, hacer mis propios diseños y personalizar mi estilo");
		sebastianGarcia.setId("145");
		sebastianGarcia.setNombre("Sebastian garcia");
		sebastianGarcia.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarciaPerfil.jpg");
	    sebastianGarcia.setFacebook("Sebastian garcia");
	    sebastianGarcia.setUsuarioFacebook("sebastian.garciia");
	    sebastianGarcia.setCelular("+573223595190");
	    sebastianGarcia.setInstagram("segarciaa");
	    sebastianGarcia.setUsuarioInstagram("segarciaa");
	    sebastianGarcia.setDireccion("Carrera 15 #83-24 segundo piso oficina 207");
	    sebastianGarcia.setEspecialidad(tradicional);
	    sebastianGarcia.setTwitter("no");
	    sebastianGarcia.setUsuarioTwitter("false");
	    sebastianGarcia.setLatitud("4.668671");
	    sebastianGarcia.setLongitud("-74.055871");
	    sebastianGarcia.setNombreEstudio("---");
	    sebastianGarcia.setEmail("sebastianarttattoo@hotmail.com");
	    sebastianGarcia.setCiudad(bogota);
	    sebastianGarcia.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> sebastianGarciatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista sebastianGarciaTrabajo1 =  new TrabajosArtista();
	   sebastianGarciaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarcia1.jpg");
	   
	   TrabajosArtista sebastianGarciaTrabajo2 =  new TrabajosArtista();
	   sebastianGarciaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarcia2.jpg");
	   
	   TrabajosArtista sebastianGarciaTrabajo3 =  new TrabajosArtista();
	   sebastianGarciaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarcia3.jpg");
	   
	   TrabajosArtista sebastianGarciaTrabajo4 =  new TrabajosArtista();
	   sebastianGarciaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarcia4.jpg");
	   
	   TrabajosArtista sebastianGarciaTrabajo5 =  new TrabajosArtista();
	   sebastianGarciaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianGarcia/sebastianGarcia5.jpg");
	   
	   sebastianGarciatrabajos.add(sebastianGarciaTrabajo1);
	   sebastianGarciatrabajos.add(sebastianGarciaTrabajo2);
	   sebastianGarciatrabajos.add(sebastianGarciaTrabajo3);
	   sebastianGarciatrabajos.add(sebastianGarciaTrabajo4);
	   sebastianGarciatrabajos.add(sebastianGarciaTrabajo5);
	   Collections.shuffle(sebastianGarciatrabajos);
	   
	   
	   sebastianGarcia.setTrabajosArtistas(sebastianGarciatrabajos);
	   //FIN SEBASTIAN GARCIA 
	   
//INICIO PEDRO LEON  id 146 
	   
	   Artista pedroLeon=  new 	Artista();
		pedroLeon.setDescripcion("Artísta tatuador Venezolano con 9 años de experiencia,  dedicado  a diversos estilos como puntillismo,  geométrico,  Black and gray, full color,  trash polka,  entre otros. ");
		pedroLeon.setId("146");
		pedroLeon.setNombre("Pedro leon");
		pedroLeon.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeonPerfil.jpg");
	    pedroLeon.setFacebook("Pedro leon");
	    pedroLeon.setUsuarioFacebook("pltattoostudio");
	    pedroLeon.setCelular("+573004894282");
	    pedroLeon.setInstagram("pedroleon00");
	    pedroLeon.setUsuarioInstagram("pedroleon00");
	    pedroLeon.setDireccion("Calle 57#13-65 chapinero");
	    pedroLeon.setEspecialidad(fineline);
	    pedroLeon.setTwitter("no");
	    pedroLeon.setUsuarioTwitter("false");
	    pedroLeon.setLatitud("4.6441708601961400");
	    pedroLeon.setLongitud("-74.06444974243640");
	    pedroLeon.setNombreEstudio("Tattoo Company");
	    pedroLeon.setEmail("Gleon.impresion.digital@gmail.com");
	    pedroLeon.setCiudad(bogota);
	    pedroLeon.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> pedroLeontrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista pedroLeonTrabajo1 =  new TrabajosArtista();
	   pedroLeonTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeon1.jpg");
	   
	   TrabajosArtista pedroLeonTrabajo2 =  new TrabajosArtista();
	   pedroLeonTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeon2.jpg");
	   
	   TrabajosArtista pedroLeonTrabajo3 =  new TrabajosArtista();
	   pedroLeonTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeon3.jpg");
	   
	   TrabajosArtista pedroLeonTrabajo4 =  new TrabajosArtista();
	   pedroLeonTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeon4.jpg");
	   
	   TrabajosArtista pedroLeonTrabajo5 =  new TrabajosArtista();
	   pedroLeonTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroLeon/pedroLeon5.jpg");
	   
	   pedroLeontrabajos.add(pedroLeonTrabajo1);
	   pedroLeontrabajos.add(pedroLeonTrabajo2);
	   pedroLeontrabajos.add(pedroLeonTrabajo3);
	   pedroLeontrabajos.add(pedroLeonTrabajo4);
	   pedroLeontrabajos.add(pedroLeonTrabajo5);
	   Collections.shuffle(pedroLeontrabajos);
	   
	   
	   pedroLeon.setTrabajosArtistas(pedroLeontrabajos);
	   //FIN PEDRO LEON
	   
//INICIO KENNY OVALLE  id 147 
	   
	   Artista kennyOvalle=  new 	Artista();
		kennyOvalle.setDescripcion("Aprendiz del tatuaje, enfocado principalmente en Realismo Sombras y Color.");
		kennyOvalle.setId("147");
		kennyOvalle.setNombre("kenny ovalle");
		kennyOvalle.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvallePerfil.jpg");
	    kennyOvalle.setFacebook("Kenny ovalle");
	    kennyOvalle.setUsuarioFacebook("gustavo.ovalle1");
	    kennyOvalle.setCelular("+573134417413");
	    kennyOvalle.setInstagram("kennyovalle");
	    kennyOvalle.setUsuarioInstagram("kennyovalle");
	    kennyOvalle.setDireccion("cra 114-79b-28");
	    kennyOvalle.setEspecialidad(realismo);
	    kennyOvalle.setTwitter("@kennyovalle");
	    kennyOvalle.setUsuarioTwitter("kennyovalle");
	    kennyOvalle.setLatitud("4.7207128857030085");
	    kennyOvalle.setLongitud("-74.12107586860657");
	    kennyOvalle.setNombreEstudio("Subterranea Tattoo Zona 80");
	    kennyOvalle.setEmail("kennyovalletattoo@gmail.com");
	    kennyOvalle.setCiudad(bogota);
	    kennyOvalle.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> kennyOvalletrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista kennyOvalleTrabajo1 =  new TrabajosArtista();
	   kennyOvalleTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvalle1.jpg");
	   
	   TrabajosArtista kennyOvalleTrabajo2 =  new TrabajosArtista();
	   kennyOvalleTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvalle2.jpg");
	   
	   TrabajosArtista kennyOvalleTrabajo3 =  new TrabajosArtista();
	   kennyOvalleTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvalle3.jpg");
	   
	   TrabajosArtista kennyOvalleTrabajo4 =  new TrabajosArtista();
	   kennyOvalleTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvalle4.jpg");
	   
	   TrabajosArtista kennyOvalleTrabajo5 =  new TrabajosArtista();
	   kennyOvalleTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/kennyOvalle/kennyOvalle5.jpg");
	   
	   kennyOvalletrabajos.add(kennyOvalleTrabajo1);
	   kennyOvalletrabajos.add(kennyOvalleTrabajo2);
	   kennyOvalletrabajos.add(kennyOvalleTrabajo3);
	   kennyOvalletrabajos.add(kennyOvalleTrabajo4);
	   kennyOvalletrabajos.add(kennyOvalleTrabajo5);
	   Collections.shuffle(kennyOvalletrabajos);
	   
	   
	   kennyOvalle.setTrabajosArtistas(kennyOvalletrabajos);
	   //FIN KENNY OVALLE
	   //INICIO VICTHOR GONZALEZ   id 156
	   
	   Artista victhorGonzalez=  new 	Artista();
		victhorGonzalez.setDescripcion("Soy de la ciudad de bogotá,  llevo cerca de 7 años en el mundo del tatuaje."+
          "tambien soy aerografista titulado de la Academia de Artes Guerreo."+ 
          "me especializó en realismo e ilustración."+ 
          "Quedan cordialmente invitados a conocer mi trabajo.");
		victhorGonzalez.setId("156");
		victhorGonzalez.setNombre("Victhor gonzalez");
		victhorGonzalez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalezPerfil.jpg");
	    victhorGonzalez.setFacebook("Victhor Gonzalez");
	    victhorGonzalez.setUsuarioFacebook("victhor.gonzalez.art");
	    victhorGonzalez.setCelular("+573007894445");
	    victhorGonzalez.setInstagram("VICTHOR_TATTOO_ARTIST");
	    victhorGonzalez.setUsuarioInstagram("VICTHOR_TATTOO_ARTIST");
	    victhorGonzalez.setDireccion("Carrera  14 # 83-26 edificio centro country local 6");
	    victhorGonzalez.setEspecialidad(realismo);
	    victhorGonzalez.setTwitter("false");
	    victhorGonzalez.setUsuarioTwitter("false");
	    victhorGonzalez.setLatitud("4.668253796230214");
	    victhorGonzalez.setLongitud("-74.05493611469865");
	    victhorGonzalez.setNombreEstudio("One Way tattoo ");
	    victhorGonzalez.setEmail("vhgonzo@hotmail.com");
	    victhorGonzalez.setCiudad(bogota);
	    victhorGonzalez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> victhorGonzaleztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista victhorGonzalezTrabajo1 =  new TrabajosArtista();
	   victhorGonzalezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalez1.jpg");
	   
	   TrabajosArtista victhorGonzalezTrabajo2 =  new TrabajosArtista();
	   victhorGonzalezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalez2.jpg");
	   
	   TrabajosArtista victhorGonzalezTrabajo3 =  new TrabajosArtista();
	   victhorGonzalezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalez3.jpg");
	   
	   TrabajosArtista victhorGonzalezTrabajo4 =  new TrabajosArtista();
	   victhorGonzalezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalez4.jpg");
	   
	   TrabajosArtista victhorGonzalezTrabajo5 =  new TrabajosArtista();
	   victhorGonzalezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/victhorGonzalez/victhorGonzalez5.jpg");
	   
	   victhorGonzaleztrabajos.add(victhorGonzalezTrabajo1);
	   victhorGonzaleztrabajos.add(victhorGonzalezTrabajo2);
	   victhorGonzaleztrabajos.add(victhorGonzalezTrabajo3);
	   victhorGonzaleztrabajos.add(victhorGonzalezTrabajo4);
	   victhorGonzaleztrabajos.add(victhorGonzalezTrabajo5);
	   Collections.shuffle(victhorGonzaleztrabajos);
	   
	   
	   victhorGonzalez.setTrabajosArtistas(victhorGonzaleztrabajos);
	   //FIN VICTHOR GONZALEZ 
	   //INICIO NICK REY   id 167
	   
	   Artista nickRey=  new 	Artista();
		nickRey.setDescripcion("llevo tres años y medio en este hermoso arte de los cuales dure 6 meses en Brasil como tatuador y perforador."
						+"Uno de mis fuertes es el realismo sombras de el cual me gane el primer puesto en la convención internacional de tatuadores en Duitama."
						+"Me gusta mucho realizar freehand con el cual también me gane tercer puesto en esta misma convención internacional.");
		nickRey.setId("167");
		nickRey.setNombre("Nick rey");
		nickRey.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickReyPerfil.jpg");
	    nickRey.setFacebook("Nick rey");
	    nickRey.setUsuarioFacebook("nick.rey85");
	    nickRey.setCelular("+573193829620");
	    nickRey.setInstagram("Nicolastattoo85");
	    nickRey.setUsuarioInstagram("Nicolastattoo85");
	    nickRey.setDireccion("Cra 57 # 2 b 42");
	    nickRey.setEspecialidad(nuevaEscuela);
	    nickRey.setTwitter("false");
	    nickRey.setUsuarioTwitter("false");
	    nickRey.setLatitud("4.618966907074985");
	    nickRey.setLongitud("-74.12134040147066");
	    nickRey.setNombreEstudio("Grafotatto");
	    nickRey.setEmail("grafotattoo@hotmail.com");
	    nickRey.setCiudad(bogota);
	    nickRey.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> nickReytrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista nickReyTrabajo1 =  new TrabajosArtista();
	   nickReyTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickRey1.jpg");
	   
	   TrabajosArtista nickReyTrabajo2 =  new TrabajosArtista();
	   nickReyTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickRey2.jpg");
	   
	   TrabajosArtista nickReyTrabajo3 =  new TrabajosArtista();
	   nickReyTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickRey3.jpg");
	   
	   TrabajosArtista nickReyTrabajo4 =  new TrabajosArtista();
	   nickReyTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickRey4.jpg");
	   
	   TrabajosArtista nickReyTrabajo5 =  new TrabajosArtista();
	   nickReyTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nickRey/nickRey5.jpg");
	   
	   nickReytrabajos.add(nickReyTrabajo1);
	   nickReytrabajos.add(nickReyTrabajo2);
	   nickReytrabajos.add(nickReyTrabajo3);
	   nickReytrabajos.add(nickReyTrabajo4);
	   nickReytrabajos.add(nickReyTrabajo5);
	   Collections.shuffle(nickReytrabajos);
	   
	   
	   nickRey.setTrabajosArtistas(nickReytrabajos);
	   //FIN NICK REY 
	   
  //INICIO SEBASTIAN IVERSON   id 175
	   
	   Artista sebastianBarrero=  new 	Artista();
		sebastianBarrero.setDescripcion("Llevo 5 años. Estilo libre (grises, nueva escuela, neotradicional)  también diseños personalizados ");
		sebastianBarrero.setId("175");
		sebastianBarrero.setNombre("Sebastian barrero");
		sebastianBarrero.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarreroPerfil.jpg");
	    sebastianBarrero.setFacebook("Sebastian barrero");
	    sebastianBarrero.setUsuarioFacebook("sebastian.barreroiverson");
	    sebastianBarrero.setCelular("+573005160217");
	    sebastianBarrero.setInstagram("Iversontattoo");
	    sebastianBarrero.setUsuarioInstagram("Iversontattoo");
	    sebastianBarrero.setDireccion("Cra 13 # 52 a 40");
	    sebastianBarrero.setEspecialidad(nuevaEscuela);
	    sebastianBarrero.setTwitter("false");
	    sebastianBarrero.setUsuarioTwitter("false");
	    sebastianBarrero.setLatitud("4.639392136749708");
	    sebastianBarrero.setLongitud("-74.06503546983004");
	    sebastianBarrero.setNombreEstudio("Store tatto");
	    sebastianBarrero.setEmail("lion-tattoo@hotmail.es");
	    sebastianBarrero.setCiudad(bogota);
	    sebastianBarrero.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> sebastianBarrerotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista sebastianBarreroTrabajo1 =  new TrabajosArtista();
	   sebastianBarreroTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarrero1.jpg");
	   
	   TrabajosArtista sebastianBarreroTrabajo2 =  new TrabajosArtista();
	   sebastianBarreroTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarrero2.jpg");
	   
	   TrabajosArtista sebastianBarreroTrabajo3 =  new TrabajosArtista();
	   sebastianBarreroTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarrero3.jpg");
	   
	   TrabajosArtista sebastianBarreroTrabajo4 =  new TrabajosArtista();
	   sebastianBarreroTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarrero4.jpg");
	   
	   TrabajosArtista sebastianBarreroTrabajo5 =  new TrabajosArtista();
	   sebastianBarreroTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianBarrero/sebastianBarrero5.jpg");
	   
	   sebastianBarrerotrabajos.add(sebastianBarreroTrabajo1);
	   sebastianBarrerotrabajos.add(sebastianBarreroTrabajo2);
	   sebastianBarrerotrabajos.add(sebastianBarreroTrabajo3);
	   sebastianBarrerotrabajos.add(sebastianBarreroTrabajo4);
	   sebastianBarrerotrabajos.add(sebastianBarreroTrabajo5);
	   Collections.shuffle(sebastianBarrerotrabajos);
	   
	   
	   sebastianBarrero.setTrabajosArtistas(sebastianBarrerotrabajos);
	   //FIN SEBASTIAN IVERSON 
	   
	   
 //INICIO HUEVO  id 179
	   
	   Artista xegg=  new 	Artista();
		xegg.setDescripcion("8 años de experiencia ,  5 premios en diferentes convenciones.");
		xegg.setId("179");
		xegg.setNombre("xEGGx");
		xegg.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggxPerfil.jpg");
	    xegg.setFacebook("xEGGx");
	    xegg.setUsuarioFacebook("xeggxdesignerx");
	    xegg.setCelular("+573133296306");
	    xegg.setInstagram("xeggxdesignerx");
	    xegg.setUsuarioInstagram("xeggxdesignerx");
	    xegg.setDireccion("Av 19 No 150-21 piso 3.");
	    xegg.setEspecialidad(tradicional);
	    xegg.setTwitter("false");
	    xegg.setUsuarioTwitter("false");
	    xegg.setLatitud("4.630986851852436");
	    xegg.setLongitud("-74.08652532845736");
	    xegg.setNombreEstudio("Cachalote");
	    xegg.setEmail("xeggxdesignerx@outlook.com");
	    xegg.setCiudad(bogota);
	    xegg.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> xeggxtrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista xeggxTrabajo1 =  new TrabajosArtista();
	   xeggxTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggx1.jpg");
	   
	   TrabajosArtista xeggxTrabajo2 =  new TrabajosArtista();
	   xeggxTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggx2.jpg");
	   
	   TrabajosArtista xeggxTrabajo3 =  new TrabajosArtista();
	   xeggxTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggx3.jpg");
	   
	   TrabajosArtista xeggxTrabajo4 =  new TrabajosArtista();
	   xeggxTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggx4.jpg");
	   
	   TrabajosArtista xeggxTrabajo5 =  new TrabajosArtista();
	   xeggxTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/xeggx/xeggx5.jpg");
	   
	   xeggxtrabajos.add(xeggxTrabajo1);
	   xeggxtrabajos.add(xeggxTrabajo2);
	   xeggxtrabajos.add(xeggxTrabajo3);
	   xeggxtrabajos.add(xeggxTrabajo4);
	   xeggxtrabajos.add(xeggxTrabajo5);
	   Collections.shuffle(xeggxtrabajos);
	   
	   
	   xegg.setTrabajosArtistas(xeggxtrabajos);
	   //FIN HUEVO
	   
 //INICIO JULIAN GONZALES  id 176
	   
	   Artista julianGonzales=  new 	Artista();
		julianGonzales.setDescripcion("Encantado por el arte y el realismo en color y gris.Arte en el lienzo de tu piel. ");
		julianGonzales.setId("176");
		julianGonzales.setNombre("Julian gonzales");
		julianGonzales.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalezPerfil.jpg");
	    julianGonzales.setFacebook("Julian gonzales");
	    julianGonzales.setUsuarioFacebook("angelrosetattoo");
	    julianGonzales.setCelular("+573138514133");
	    julianGonzales.setInstagram("angelrosetattoo");
	    julianGonzales.setUsuarioInstagram("angelrosetattoo");
	    julianGonzales.setDireccion("Cra 1 # 65 d sur 58 centro comercial alta vista local 132");
	    julianGonzales.setEspecialidad(realismo);
	    julianGonzales.setTwitter("false");
	    julianGonzales.setUsuarioTwitter("false");
	    julianGonzales.setLatitud("4.506949262968169");
	    julianGonzales.setLongitud("-74.11205735988915");
	    julianGonzales.setNombreEstudio("Angel rose tattoo");
	    julianGonzales.setEmail("julianangelrose@gmail.com");
	    julianGonzales.setCiudad(bogota);
	    julianGonzales.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> julianGonzaleztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista julianGonzalezTrabajo1 =  new TrabajosArtista();
	   julianGonzalezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalez1.jpg");
	   
	   TrabajosArtista julianGonzalezTrabajo2 =  new TrabajosArtista();
	   julianGonzalezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalez2.jpg");
	   
	   TrabajosArtista julianGonzalezTrabajo3 =  new TrabajosArtista();
	   julianGonzalezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalez3.jpg");
	   
	   TrabajosArtista julianGonzalezTrabajo4 =  new TrabajosArtista();
	   julianGonzalezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalez4.jpg");
	   
	   TrabajosArtista julianGonzalezTrabajo5 =  new TrabajosArtista();
	   julianGonzalezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/julianGonzalez/julianGonzalez5.jpg");
	   
	   julianGonzaleztrabajos.add(julianGonzalezTrabajo1);
	   julianGonzaleztrabajos.add(julianGonzalezTrabajo2);
	   julianGonzaleztrabajos.add(julianGonzalezTrabajo3);
	   julianGonzaleztrabajos.add(julianGonzalezTrabajo4);
	   julianGonzaleztrabajos.add(julianGonzalezTrabajo5);
	   Collections.shuffle(julianGonzaleztrabajos);
	   
	   
	   julianGonzales.setTrabajosArtistas(julianGonzaleztrabajos);
	   //FIN JULIAN GONZALES
	   
	   
 //INICIO SNYDER MAYORGA  id 161
	   
	   Artista snyderMayorga=  new 	Artista();
		snyderMayorga.setDescripcion("Especialista En Letras.");
		snyderMayorga.setId("161");
		snyderMayorga.setNombre("Snyder Mayorga");
		snyderMayorga.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorgaPerfil.jpg");
	    snyderMayorga.setFacebook("Snyder mayorga");
	    snyderMayorga.setUsuarioFacebook("hiken22");
	    snyderMayorga.setCelular("+573138449990");
	    snyderMayorga.setInstagram("SnyderMayorga");
	    snyderMayorga.setUsuarioInstagram("SnyderMayorga");
	    snyderMayorga.setDireccion("Fusagasuga");
	    snyderMayorga.setEspecialidad(escritura);
	    snyderMayorga.setTwitter("false");
	    snyderMayorga.setUsuarioTwitter("false");
	    snyderMayorga.setLatitud("4.345127516557044");
	    snyderMayorga.setLongitud("-74.36205801554024");
	    snyderMayorga.setNombreEstudio("Hard Colors Tattoo  ");
	    snyderMayorga.setEmail("mcscayber@hotmail.com");
	    snyderMayorga.setCiudad(fusagasuga);
	    snyderMayorga.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> snyderMayorgatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista snyderMayorgaTrabajo1 =  new TrabajosArtista();
	   snyderMayorgaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorga1.jpg");
	   
	   TrabajosArtista snyderMayorgaTrabajo2 =  new TrabajosArtista();
	   snyderMayorgaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorga2.jpg");
	   
	   TrabajosArtista snyderMayorgaTrabajo3 =  new TrabajosArtista();
	   snyderMayorgaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorga3.jpg");
	   
	   TrabajosArtista snyderMayorgaTrabajo4 =  new TrabajosArtista();
	   snyderMayorgaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorga4.jpg");
	   
	   TrabajosArtista snyderMayorgaTrabajo5 =  new TrabajosArtista();
	   snyderMayorgaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/snyderMayorga/snyderMayorga5.jpg");
	   
	   snyderMayorgatrabajos.add(snyderMayorgaTrabajo1);
	   snyderMayorgatrabajos.add(snyderMayorgaTrabajo2);
	   snyderMayorgatrabajos.add(snyderMayorgaTrabajo3);
	   snyderMayorgatrabajos.add(snyderMayorgaTrabajo4);
	   snyderMayorgatrabajos.add(snyderMayorgaTrabajo5);
	   Collections.shuffle(snyderMayorgatrabajos);
	   
	   
	   snyderMayorga.setTrabajosArtistas(snyderMayorgatrabajos);
	   //FIN SNYDER MAYORGA
	   
 //INICIO HECTOR RAUL MESA  id 169
	   
	   Artista hectorMesa=  new 	Artista();
		hectorMesa.setDescripcion("3 años tatuando estilo libre.");
		hectorMesa.setId("169");
		hectorMesa.setNombre("Hector raul meza");
		hectorMesa.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMezaPerfil.jpg");
	    hectorMesa.setFacebook("Hector raul meza");
	    hectorMesa.setUsuarioFacebook("toshiro.borrachosinfronteras");
	    hectorMesa.setCelular("+523111100436");
	    hectorMesa.setInstagram("Toshebrio");
	    hectorMesa.setUsuarioInstagram("Toshebrio");
	    hectorMesa.setDireccion("Av Juan escupía 173 entre lerdo e hidalgo");
	    hectorMesa.setEspecialidad(estiloLibre);
	    hectorMesa.setTwitter("false");
	    hectorMesa.setUsuarioTwitter("false");
	    hectorMesa.setLatitud("21.504824348033203");
	    hectorMesa.setLongitud("-104.89208042621613");
	    hectorMesa.setNombreEstudio("Aztlan arte primitivo");
	    hectorMesa.setEmail("toshirokuin@hotmail.com");
	    hectorMesa.setCiudad(tepic);
	    hectorMesa.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> hectorMezatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista hectorMezaTrabajo1 =  new TrabajosArtista();
	   hectorMezaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMeza1.jpg");
	   
	   TrabajosArtista hectorMezaTrabajo2 =  new TrabajosArtista();
	   hectorMezaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMeza2.jpg");
	   
	   TrabajosArtista hectorMezaTrabajo3 =  new TrabajosArtista();
	   hectorMezaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMeza3.jpg");
	   
	   TrabajosArtista hectorMezaTrabajo4 =  new TrabajosArtista();
	   hectorMezaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMeza4.jpg");
	   
	   TrabajosArtista hectorMezaTrabajo5 =  new TrabajosArtista();
	   hectorMezaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorMeza/hectorMeza5.jpg");
	   
	   hectorMezatrabajos.add(hectorMezaTrabajo1);
	   hectorMezatrabajos.add(hectorMezaTrabajo2);
	   hectorMezatrabajos.add(hectorMezaTrabajo3);
	   hectorMezatrabajos.add(hectorMezaTrabajo4);
	   hectorMezatrabajos.add(hectorMezaTrabajo5);
	   Collections.shuffle(hectorMezatrabajos);
	   
	   
	   hectorMesa.setTrabajosArtistas(hectorMezatrabajos);
	   //FIN HECTOR RAUL MESA
	   
 //INICIO STIVE KRANIUM  id 174
	   
	   Artista stiveKranium=  new 	Artista();
		stiveKranium.setDescripcion("Llevo 6 años tatuando, mi especíalidad es color realismo color,  realismo sombras y free style, trabajo en ácid he concursado en diferentes  convenciones nacionales he internacionales ganando primeros lugares en color y sombras y un primer lugar en color en México.");
		stiveKranium.setId("174");
		stiveKranium.setNombre("Stive kranium");
		stiveKranium.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKraniumPerfil.jpg");
	    stiveKranium.setFacebook("Stive kranium");
	    stiveKranium.setUsuarioFacebook("stive.alfonso");
	    stiveKranium.setCelular("+573152399695");
	    stiveKranium.setInstagram("Stivekranium");
	    stiveKranium.setUsuarioInstagram("Stivekranium");
	    stiveKranium.setDireccion("Cll 45 # 13_41");
	    stiveKranium.setEspecialidad(realismo);
	    stiveKranium.setTwitter("false");
	    stiveKranium.setUsuarioTwitter("false");
	    stiveKranium.setLatitud("4.6321203948321275");
	    stiveKranium.setLongitud("-74.06654790043831");
	    stiveKranium.setNombreEstudio("Acid Ink tattoo art ");
	    stiveKranium.setEmail("stivekraniumtattoo1@gmail.com");
	    stiveKranium.setCiudad(bogota);
	    stiveKranium.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> stiveKraniumtrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista stiveKraniumTrabajo1 =  new TrabajosArtista();
	   stiveKraniumTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKranium1.jpg");
	   
	   TrabajosArtista stiveKraniumTrabajo2 =  new TrabajosArtista();
	   stiveKraniumTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKranium2.jpg");
	   
	   TrabajosArtista stiveKraniumTrabajo3 =  new TrabajosArtista();
	   stiveKraniumTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKranium3.jpg");
	   
	   TrabajosArtista stiveKraniumTrabajo4 =  new TrabajosArtista();
	   stiveKraniumTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKranium4.jpg");
	   
	   TrabajosArtista stiveKraniumTrabajo5 =  new TrabajosArtista();
	   stiveKraniumTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/stiveKranium/stiveKranium5.jpg");
	   
	   stiveKraniumtrabajos.add(stiveKraniumTrabajo1);
	   stiveKraniumtrabajos.add(stiveKraniumTrabajo2);
	   stiveKraniumtrabajos.add(stiveKraniumTrabajo3);
	   stiveKraniumtrabajos.add(stiveKraniumTrabajo4);
	   stiveKraniumtrabajos.add(stiveKraniumTrabajo5);
	   Collections.shuffle(stiveKraniumtrabajos);
	   
	   
	   stiveKranium.setTrabajosArtistas(stiveKraniumtrabajos);
	   //FIN STIVE KRANIUM
	   
	   
 //INICIO MAURO SCORPION  id 164
	   
	   Artista mauroScorpions=  new 	Artista();
		mauroScorpions.setDescripcion("Artista de 20 años de tatuar todas las técnicas especialidad cover up.");
		mauroScorpions.setId("164");
		mauroScorpions.setNombre("Mauro Scorpions");
		mauroScorpions.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpionsPerfil.jpg");
	    mauroScorpions.setFacebook("Mauro scorpions");
	    mauroScorpions.setUsuarioFacebook("maurosscorpions13");
	    mauroScorpions.setCelular("+573057128963");
	    mauroScorpions.setInstagram("Mauroscorpions");
	    mauroScorpions.setUsuarioInstagram("Mauroscorpions");
	    mauroScorpions.setDireccion("Calle 72 # 99 - 12 ");
	    mauroScorpions.setEspecialidad(estiloLibre);
	    mauroScorpions.setTwitter("false");
	    mauroScorpions.setUsuarioTwitter("false");
	    mauroScorpions.setLatitud("4.702909743934108");
	    mauroScorpions.setLongitud("-74.11538422107697");
	    mauroScorpions.setNombreEstudio("Scorpions tattoo");
	    mauroScorpions.setEmail("viejoguepardo@hotmail.com");
	    mauroScorpions.setCiudad(bogota);
	    mauroScorpions.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> mauroScorpionstrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista mauroScorpionsTrabajo1 =  new TrabajosArtista();
	   mauroScorpionsTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpions1.jpg");
	   
	   TrabajosArtista mauroScorpionsTrabajo2 =  new TrabajosArtista();
	   mauroScorpionsTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpions2.jpg");
	   
	   TrabajosArtista mauroScorpionsTrabajo3 =  new TrabajosArtista();
	   mauroScorpionsTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpions3.jpg");
	   
	   TrabajosArtista mauroScorpionsTrabajo4 =  new TrabajosArtista();
	   mauroScorpionsTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpions4.jpg");
	   
	   TrabajosArtista mauroScorpionsTrabajo5 =  new TrabajosArtista();
	   mauroScorpionsTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauroScorpions/mauroScorpions5.jpg");
	   
	   mauroScorpionstrabajos.add(mauroScorpionsTrabajo1);
	   mauroScorpionstrabajos.add(mauroScorpionsTrabajo2);
	   mauroScorpionstrabajos.add(mauroScorpionsTrabajo3);
	   mauroScorpionstrabajos.add(mauroScorpionsTrabajo4);
	   mauroScorpionstrabajos.add(mauroScorpionsTrabajo5);
	   Collections.shuffle(mauroScorpionstrabajos);
	   
	   
	   mauroScorpions.setTrabajosArtistas(mauroScorpionstrabajos);
	   //FIN MAURO SCORPIONS
	   
	   //INICIO FELIPE CHALARCA  id 180
	   
	   Artista felipeChalarca=  new 	Artista();
		felipeChalarca.setDescripcion("Soy de la ciudad de Pereira actualmente vivo en Bogotá y llevo 7años tatuando.");
		felipeChalarca.setId("180");
		felipeChalarca.setNombre("Felipe chalarca");
		felipeChalarca.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarcaPerfil.jpg");
	    felipeChalarca.setFacebook("Felipe chalarca");
	    felipeChalarca.setUsuarioFacebook("Felipe-Chalarca-Tattoo-Art-718972404888066");
	    felipeChalarca.setCelular("+573214653708");
	    felipeChalarca.setInstagram("Chalarcatattooart");
	    felipeChalarca.setUsuarioInstagram("Chalarcatattooart");
	    felipeChalarca.setDireccion("Cra 14 a # 83 - 64");
	    felipeChalarca.setEspecialidad(realismo);
	    felipeChalarca.setTwitter("false");
	    felipeChalarca.setUsuarioTwitter("false");
	    felipeChalarca.setLatitud("4.668959550017782");
	    felipeChalarca.setLongitud("-74.05520349740982");
	    felipeChalarca.setNombreEstudio("Subterránea tattoo zona rosa ");
	    felipeChalarca.setEmail("f.chalarca.25@gmail.com");
	    felipeChalarca.setCiudad(bogota);
	    felipeChalarca.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> felipeChalarcatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista felipeChalarcaTrabajo1 =  new TrabajosArtista();
	   felipeChalarcaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarca1.jpg");
	   
	   TrabajosArtista felipeChalarcaTrabajo2 =  new TrabajosArtista();
	   felipeChalarcaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarca2.jpg");
	   
	   TrabajosArtista felipeChalarcaTrabajo3 =  new TrabajosArtista();
	   felipeChalarcaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarca3.jpg");
	   
	   TrabajosArtista felipeChalarcaTrabajo4 =  new TrabajosArtista();
	   felipeChalarcaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarca4.jpg");
	   
	   TrabajosArtista felipeChalarcaTrabajo5 =  new TrabajosArtista();
	   felipeChalarcaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/felipeChalarca/felipeChalarca5.jpg");
	   
	   felipeChalarcatrabajos.add(felipeChalarcaTrabajo1);
	   felipeChalarcatrabajos.add(felipeChalarcaTrabajo2);
	   felipeChalarcatrabajos.add(felipeChalarcaTrabajo3);
	   felipeChalarcatrabajos.add(felipeChalarcaTrabajo4);
	   felipeChalarcatrabajos.add(felipeChalarcaTrabajo5);
	   Collections.shuffle(felipeChalarcatrabajos);
	   
	   
	   felipeChalarca.setTrabajosArtistas(felipeChalarcatrabajos);
	   //FIN FELIPE CHALARCA
	   
 //INICIO  TONY CHACAL SERRANO    id 148
	   
	   Artista tonyChacal=  new 	Artista();
		tonyChacal.setDescripcion("Artista mexicano especializado en full color");
		tonyChacal.setId("148");
		tonyChacal.setNombre("Tony chacal");
		tonyChacal.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacalPerfil.jpg");
	    tonyChacal.setFacebook("Tony chacal");
	    tonyChacal.setUsuarioFacebook("tatuajesmexico");
	    tonyChacal.setCelular("+5523603221");
	    tonyChacal.setInstagram("Tatuajesmexico");
	    tonyChacal.setUsuarioInstagram("Tatuajesmexico");
	    tonyChacal.setDireccion("Insurgentes sur 221 piso 3 colonia Roma");
	    tonyChacal.setEspecialidad(realismo);
	    tonyChacal.setTwitter("false");
	    tonyChacal.setUsuarioTwitter("false");
	    tonyChacal.setLatitud("19.443284370423218");
	    tonyChacal.setLongitud("-99.13856506347656");
	    tonyChacal.setNombreEstudio("Tatuajes méxico");
	    tonyChacal.setEmail("tatuajes_mexico@yahoo.com.mx");
	    tonyChacal.setCiudad(mexico);
	    tonyChacal.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> tonyChacaltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista tonyChacalTrabajo1 =  new TrabajosArtista();
	   tonyChacalTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacal1.jpg");
	   
	   TrabajosArtista tonyChacalTrabajo2 =  new TrabajosArtista();
	   tonyChacalTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacal2.jpg");
	   
	   TrabajosArtista tonyChacalTrabajo3 =  new TrabajosArtista();
	   tonyChacalTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacal3.jpg");
	   
	   TrabajosArtista tonyChacalTrabajo4 =  new TrabajosArtista();
	   tonyChacalTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacal4.jpg");
	   
	   TrabajosArtista tonyChacalTrabajo5 =  new TrabajosArtista();
	   tonyChacalTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/tonyChacal/tonyChacal5.jpg");
	   
	   tonyChacaltrabajos.add(tonyChacalTrabajo1);
	   tonyChacaltrabajos.add(tonyChacalTrabajo2);
	   tonyChacaltrabajos.add(tonyChacalTrabajo3);
	   tonyChacaltrabajos.add(tonyChacalTrabajo4);
	   tonyChacaltrabajos.add(tonyChacalTrabajo5);
	   Collections.shuffle(tonyChacaltrabajos);
	   
	   
	   tonyChacal.setTrabajosArtistas(tonyChacaltrabajos);
	   //FIN TONY CHACAL SERRANO
	   
 //INICIO  LOUIS RYAN TRUMP    id 151
	   
	   Artista clinchi=  new 	Artista();
		clinchi.setDescripcion("Artista de tattoo de Aruba  especialista en realismo.");
		clinchi.setId("151");
		clinchi.setNombre("Louis ryan tromp");
		clinchi.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchiPerfil.jpg");
	    clinchi.setFacebook("Louis ryan tromp");
	    clinchi.setUsuarioFacebook("Inkspiration.Aruba");
	    clinchi.setCelular("+2975940099");
	    clinchi.setInstagram("Clinchitattooartist");
	    clinchi.setUsuarioInstagram("Clinchitattooartist");
	    clinchi.setDireccion("J. E Irasquin blvd ");
	    clinchi.setEspecialidad(realismo);
	    clinchi.setTwitter("false");
	    clinchi.setUsuarioTwitter("false");
	    clinchi.setLatitud("12.518368703890955");
	    clinchi.setLongitud("-70.00556945800781");
	    clinchi.setNombreEstudio("Inkspiration tattoo studio");
	    clinchi.setEmail("inkspiration.aruba@gmaill.com");
	    clinchi.setCiudad(savaneta);
	    clinchi.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> clinchitrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista clinchiTrabajo1 =  new TrabajosArtista();
	   clinchiTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchi1.jpg");
	   
	   TrabajosArtista clinchiTrabajo2 =  new TrabajosArtista();
	   clinchiTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchi2.jpg");
	   
	   TrabajosArtista clinchiTrabajo3 =  new TrabajosArtista();
	   clinchiTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchi3.jpg");
	   
	   TrabajosArtista clinchiTrabajo4 =  new TrabajosArtista();
	   clinchiTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchi4.jpg");
	   
	   TrabajosArtista clinchiTrabajo5 =  new TrabajosArtista();
	   clinchiTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clinchi/clinchi5.jpg");
	   
	   clinchitrabajos.add(clinchiTrabajo1);
	   clinchitrabajos.add(clinchiTrabajo2);
	   clinchitrabajos.add(clinchiTrabajo3);
	   clinchitrabajos.add(clinchiTrabajo4);
	   clinchitrabajos.add(clinchiTrabajo5);
	   Collections.shuffle(clinchitrabajos);
	   
	   
	   clinchi.setTrabajosArtistas(clinchitrabajos);
	   //FIN LOUIS RYAN TRUMP
	   
	   //INICIO  DS SANGUINO    id 157
	   
	   Artista dsSanguino=  new 	Artista();
		dsSanguino.setDescripcion("artista de Bucaramanga,  con 6 años de experiencia,  desarrollado en los estilos realismo color,  New school,  oriental, neo tradicional. Tatuaje profesional. ");
		dsSanguino.setId("157");
		dsSanguino.setNombre("Ds sanguino");
		dsSanguino.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguinoPerfil.jpg");
	    dsSanguino.setFacebook("D.s sanguino");
	    dsSanguino.setUsuarioFacebook("ssanguino1");
	    dsSanguino.setCelular("+573185685134");
	    dsSanguino.setInstagram("Desergem");
	    dsSanguino.setUsuarioInstagram("Desergem");
	    dsSanguino.setDireccion("Calle 49 No 34-17 local 203 piso 2"); 	
	    dsSanguino.setEspecialidad(realismo);
	    dsSanguino.setTwitter("false");
	    dsSanguino.setUsuarioTwitter("false");
	    dsSanguino.setLatitud("7.116138269660809");
	    dsSanguino.setLongitud("-73.11021566390991");
	    dsSanguino.setNombreEstudio("Subterránea zona cabecera ");
	    dsSanguino.setEmail("angus23sms@gmail.com");
	    dsSanguino.setCiudad(bucaramanga);
	    dsSanguino.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> dsSanguinotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista dsSanguinoTrabajo1 =  new TrabajosArtista();
	   dsSanguinoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguino1.jpg");
	   
	   TrabajosArtista dsSanguinoTrabajo2 =  new TrabajosArtista();
	   dsSanguinoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguino2.jpg");
	   
	   TrabajosArtista dsSanguinoTrabajo3 =  new TrabajosArtista();
	   dsSanguinoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguino3.jpg");
	   
	   TrabajosArtista dsSanguinoTrabajo4 =  new TrabajosArtista();
	   dsSanguinoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguino4.jpg");
	   
	   TrabajosArtista dsSanguinoTrabajo5 =  new TrabajosArtista();
	   dsSanguinoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dsSanguino/dsSanguino5.jpg");
	   
	   dsSanguinotrabajos.add(dsSanguinoTrabajo1);
	   dsSanguinotrabajos.add(dsSanguinoTrabajo2);
	   dsSanguinotrabajos.add(dsSanguinoTrabajo3);
	   dsSanguinotrabajos.add(dsSanguinoTrabajo4);
	   dsSanguinotrabajos.add(dsSanguinoTrabajo5);
	   Collections.shuffle(dsSanguinotrabajos);
	   
	   
	   dsSanguino.setTrabajosArtistas(dsSanguinotrabajos);
	   //FIN DS SANGUINO
	   //INICIO  JUAN VILLAMIL   id 162
	   
	   Artista juanVillamil=  new 	Artista();
		juanVillamil.setDescripcion("Artista del tatto espacialidad arte oriental.");
		juanVillamil.setId("162");
		juanVillamil.setNombre("Juan villamil");
		juanVillamil.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamilPerfil.jpg");
	    juanVillamil.setFacebook("Juan villamil");
	    juanVillamil.setUsuarioFacebook("juanpablo.villamil.92");
	    juanVillamil.setCelular("+573005906993");
	    juanVillamil.setInstagram("jpablotattoo");
	    juanVillamil.setUsuarioInstagram("jpablotattoo");
	    juanVillamil.setDireccion("Ir 01 .8-31local 06 rodadero"); 	
	    juanVillamil.setEspecialidad(arteJapones);
	    juanVillamil.setTwitter("false");
	    juanVillamil.setUsuarioTwitter("false");
	    juanVillamil.setLatitud("11.247776279549914");
	    juanVillamil.setLongitud("-74.21189546585083");
	    juanVillamil.setNombreEstudio("Kattattoo");
	    juanVillamil.setEmail("Jpablotattoo@hotmail.com");
	    juanVillamil.setCiudad(santaMarta);
	    juanVillamil.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> juanVillamiltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanVillamilTrabajo1 =  new TrabajosArtista();
	   juanVillamilTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamil1.jpg");
	   
	   TrabajosArtista juanVillamilTrabajo2 =  new TrabajosArtista();
	   juanVillamilTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamil2.jpg");
	   
	   TrabajosArtista juanVillamilTrabajo3 =  new TrabajosArtista();
	   juanVillamilTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamil3.jpg");
	   
	   TrabajosArtista juanVillamilTrabajo4 =  new TrabajosArtista();
	   juanVillamilTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamil4.jpg");
	   
	   TrabajosArtista juanVillamilTrabajo5 =  new TrabajosArtista();
	   juanVillamilTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanVillamil/juanVillamil5.jpg");
	   
	   juanVillamiltrabajos.add(juanVillamilTrabajo1);
	   juanVillamiltrabajos.add(juanVillamilTrabajo2);
	   juanVillamiltrabajos.add(juanVillamilTrabajo3);
	   juanVillamiltrabajos.add(juanVillamilTrabajo4);
	   juanVillamiltrabajos.add(juanVillamilTrabajo5);
	   Collections.shuffle(juanVillamiltrabajos);
	   
	   
	   juanVillamil.setTrabajosArtistas(juanVillamiltrabajos);
	   //FIN JUAN VILLAMIL
	   
  //INICIO  PALACIO VELEZ   id 156
	   
	   Artista palacioVelez=  new 	Artista();
		palacioVelez.setDescripcion("Me especializó en trabajos realistas a color y sombra.");
		palacioVelez.setId("156");
		palacioVelez.setNombre("Palacio velez");
		palacioVelez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelezPerfil.jpg");
	    palacioVelez.setFacebook("Palacio velez");
	    palacioVelez.setUsuarioFacebook("palacioartista");
	    palacioVelez.setCelular("+573146350090");
	    palacioVelez.setInstagram("Palacioartist");
	    palacioVelez.setUsuarioInstagram("Palacioartist");
	    palacioVelez.setDireccion("Transversal 39b circular 3-28"); 	
	    palacioVelez.setEspecialidad(realismo);
	    palacioVelez.setTwitter("false");
	    palacioVelez.setUsuarioTwitter("false");
	    palacioVelez.setLatitud("6.245382425098234");
	    palacioVelez.setLongitud("-75.59655904769897");
	    palacioVelez.setNombreEstudio("Canvas tattoo studio ");
	    palacioVelez.setEmail("palacioartist@gmail.com");
	    palacioVelez.setCiudad(medellin);
	    palacioVelez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> palacioVeleztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista palacioVelezTrabajo1 =  new TrabajosArtista();
	   palacioVelezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelez1.jpg");
	   
	   TrabajosArtista palacioVelezTrabajo2 =  new TrabajosArtista();
	   palacioVelezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelez2.jpg");
	   
	   TrabajosArtista palacioVelezTrabajo3 =  new TrabajosArtista();
	   palacioVelezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelez3.jpg");
	   
	   TrabajosArtista palacioVelezTrabajo4 =  new TrabajosArtista();
	   palacioVelezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelez4.jpg");
	   
	   TrabajosArtista palacioVelezTrabajo5 =  new TrabajosArtista();
	   palacioVelezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/palacioVelez/palacioVelez5.jpg");
	   
	   palacioVeleztrabajos.add(palacioVelezTrabajo1);
	   palacioVeleztrabajos.add(palacioVelezTrabajo2);
	   palacioVeleztrabajos.add(palacioVelezTrabajo3);
	   palacioVeleztrabajos.add(palacioVelezTrabajo4);
	   palacioVeleztrabajos.add(palacioVelezTrabajo5);
	   Collections.shuffle(palacioVeleztrabajos);
	   
	   
	   palacioVelez.setTrabajosArtistas(palacioVeleztrabajos);
	   //FIN PALACIO VELEZ
	    
  //INICIO  EDWIN RAMIREZ   id 177  
	   
	   Artista edwinRamirez=  new 	Artista();
		edwinRamirez.setDescripcion("Tatuador de la ciudad de manizales les especializado en realismo color y sombras con una trayectoria de 9 años en el medio.");
		edwinRamirez.setId("177");
		edwinRamirez.setNombre("Edwin rámirez");
		edwinRamirez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirezPerfil.jpg");
	    edwinRamirez.setFacebook("Edwin ramirez");
	    edwinRamirez.setUsuarioFacebook("edwin.r.naranjo");
	    edwinRamirez.setCelular("+573193882563");
	    edwinRamirez.setInstagram("Edwinramireztattoo");
	    edwinRamirez.setUsuarioInstagram("Edwinramireztattoo");
	    edwinRamirez.setDireccion("Multicentro estrella local 32"); 	
	    edwinRamirez.setEspecialidad(realismo);
	    edwinRamirez.setTwitter("false");
	    edwinRamirez.setUsuarioTwitter("false");
	    edwinRamirez.setLatitud("5.070254755652264");
	    edwinRamirez.setLongitud("-75.51375389099121");
	    edwinRamirez.setNombreEstudio("Tattoo parlour bajo tierra");
	    edwinRamirez.setEmail("Edwinramireztattoo@hotmail.com");
	    edwinRamirez.setCiudad(manizales);
	    edwinRamirez.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> edwinRamireztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista edwinRamirezTrabajo1 =  new TrabajosArtista();
	   edwinRamirezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirez1.jpg");
	   
	   TrabajosArtista edwinRamirezTrabajo2 =  new TrabajosArtista();
	   edwinRamirezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirez2.jpg");
	   
	   TrabajosArtista edwinRamirezTrabajo3 =  new TrabajosArtista();
	   edwinRamirezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirez3.jpg");
	   
	   TrabajosArtista edwinRamirezTrabajo4 =  new TrabajosArtista();
	   edwinRamirezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirez4.jpg");
	   
	   TrabajosArtista edwinRamirezTrabajo5 =  new TrabajosArtista();
	   edwinRamirezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/edwinRamirez/edwinRamirez5.jpg");
	   
	   edwinRamireztrabajos.add(edwinRamirezTrabajo1);
	   edwinRamireztrabajos.add(edwinRamirezTrabajo2);
	   edwinRamireztrabajos.add(edwinRamirezTrabajo3);
	   edwinRamireztrabajos.add(edwinRamirezTrabajo4);
	   edwinRamireztrabajos.add(edwinRamirezTrabajo5);
	   Collections.shuffle(edwinRamireztrabajos);
	   
	   
	   edwinRamirez.setTrabajosArtistas(edwinRamireztrabajos);
	   //FIN EDWIN RAMIREZ
	   
  //INICIO  LEO TATTTO  id 159  
	   
	   Artista leoTattoo=  new 	Artista();
		leoTattoo.setDescripcion("10 años de experiencia un artista versátil aúnque me gusta mucho el color.");
		leoTattoo.setId("159");
		leoTattoo.setNombre("Leo tattoo");
		leoTattoo.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattooPerfil.jpg");
	    leoTattoo.setFacebook("Leo Tattoo");
	    leoTattoo.setUsuarioFacebook("leitoTmrtattos");
	    leoTattoo.setCelular("+57301 762 65 70");
	    leoTattoo.setInstagram("Leo_Tattoo1804");
	    leoTattoo.setUsuarioInstagram("Leo_Tattoo1804");
	    leoTattoo.setDireccion("Calle 20a # 78-32"); 	
	    leoTattoo.setEspecialidad(nuevaEscuela);
	    leoTattoo.setTwitter("false");
	    leoTattoo.setUsuarioTwitter("false");
	    leoTattoo.setLatitud("6.225256878796178");
	    leoTattoo.setLongitud("-75.59877455234528");
	    leoTattoo.setNombreEstudio("Pasión en la sangre tattoo studio ");
	    leoTattoo.setEmail("leonardotrillossuarez@gmail.com");
	    leoTattoo.setCiudad(medellin);
	    leoTattoo.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> leoTattootrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista leoTattooTrabajo1 =  new TrabajosArtista();
	   leoTattooTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattoo1.jpg");
	   
	   TrabajosArtista leoTattooTrabajo2 =  new TrabajosArtista();
	   leoTattooTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattoo2.jpg");
	   
	   TrabajosArtista leoTattooTrabajo3 =  new TrabajosArtista();
	   leoTattooTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattoo3.jpg");
	   
	   TrabajosArtista leoTattooTrabajo4 =  new TrabajosArtista();
	   leoTattooTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattoo4.jpg");
	   
	   TrabajosArtista leoTattooTrabajo5 =  new TrabajosArtista();
	   leoTattooTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/leoTattoo/leoTattoo5.jpg");
	   
	   leoTattootrabajos.add(leoTattooTrabajo1);
	   leoTattootrabajos.add(leoTattooTrabajo2);
	   leoTattootrabajos.add(leoTattooTrabajo3);
	   leoTattootrabajos.add(leoTattooTrabajo4);
	   leoTattootrabajos.add(leoTattooTrabajo5);
	   Collections.shuffle(leoTattootrabajos);
	   
	   
	   leoTattoo.setTrabajosArtistas(leoTattootrabajos);
	   //FIN LEO TATTOO
	   
//INICIO  CHIVO TATTTO  id 160  
	   
	   Artista chivoTatto=  new 	Artista();
		chivoTatto.setDescripcion("Me conocen como chivo y llevo trabajando en el mundo del tatuaje aproximadamente siete años en Bogotá, Colombia y mi estilo se basa en caligrafía y sombras.");
		chivoTatto.setId("160");
		chivoTatto.setNombre("Chivo tattoo 19");
		chivoTatto.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivoPerfil.jpg");
	    chivoTatto.setFacebook("Chivo tattoo 19 ");
	    chivoTatto.setUsuarioFacebook("ChivoTattoo19");
	    chivoTatto.setCelular("+573125555392");
	    chivoTatto.setInstagram("chivotattoo19");
	    chivoTatto.setUsuarioInstagram("chivotattoo19");
	    chivoTatto.setDireccion("Cra 71 f # 64 - 03 sur"); 	
	    chivoTatto.setEspecialidad(escritura);
	    chivoTatto.setTwitter("false");
	    chivoTatto.setUsuarioTwitter("false");
	    chivoTatto.setLatitud("4.58737080621643");
	    chivoTatto.setLongitud("-74.16510432958603");
	    chivoTatto.setNombreEstudio("Chivo tatto 19 ");
	    chivoTatto.setEmail("xchivo19x@hotmail.com");
	    chivoTatto.setCiudad(bogota);
	    chivoTatto.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> chivoTattotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista chivoTattoTrabajo1 =  new TrabajosArtista();
	   chivoTattoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivo1.jpg");
	   
	   TrabajosArtista chivoTattoTrabajo2 =  new TrabajosArtista();
	   chivoTattoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivo2.jpg");
	   
	   TrabajosArtista chivoTattoTrabajo3 =  new TrabajosArtista();
	   chivoTattoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivo3.jpg");
	   
	   TrabajosArtista chivoTattoTrabajo4 =  new TrabajosArtista();
	   chivoTattoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivo4.jpg");
	   
	   TrabajosArtista chivoTattoTrabajo5 =  new TrabajosArtista();
	   chivoTattoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/chivo/chivo5.jpg");
	   
	   chivoTattotrabajos.add(chivoTattoTrabajo1);
	   chivoTattotrabajos.add(chivoTattoTrabajo2);
	   chivoTattotrabajos.add(chivoTattoTrabajo3);
	   chivoTattotrabajos.add(chivoTattoTrabajo4);
	   chivoTattotrabajos.add(chivoTattoTrabajo5);
	   Collections.shuffle(chivoTattotrabajos);
	   
	   
	   chivoTatto.setTrabajosArtistas(chivoTattotrabajos);
	   //FIN CHIVO TATTOO
	   
//INICIO  ANDRES NIÑO  id 166
	   
	   Artista andresNino=  new 	Artista();
		andresNino.setDescripcion("15 años de experiencia aproximadamente 30 reconocimientos en diferentes convenciones en varios países.");
		andresNino.setId("166");
		andresNino.setNombre("Andres niño");
		andresNino.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNinoPerfil.jpg");
	    andresNino.setFacebook("Español tattoo");
	    andresNino.setUsuarioFacebook("espanoltattoo.1");
	    andresNino.setCelular("+573208627396");
	    andresNino.setInstagram("espanoltattoo");
	    andresNino.setUsuarioInstagram("espanoltattoo");
	    andresNino.setDireccion("Carrera 15 # 82-45"); 	
	    andresNino.setEspecialidad(arteJapones);
	    andresNino.setTwitter("false");
	    andresNino.setUsuarioTwitter("false");
	    andresNino.setLatitud("4.6678131574333275");
	    andresNino.setLongitud("-74.05639582608273");
	    andresNino.setNombreEstudio("Español tattoo");
	    andresNino.setEmail("jangtattoo@hotmail.com");
	    andresNino.setCiudad(bogota);
	    andresNino.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> andresNinotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista andresNinoTrabajo1 =  new TrabajosArtista();
	   andresNinoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNino1.jpg");
	   
	   TrabajosArtista andresNinoTrabajo2 =  new TrabajosArtista();
	   andresNinoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNino2.jpg");
	   
	   TrabajosArtista andresNinoTrabajo3 =  new TrabajosArtista();
	   andresNinoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNino3.jpg");
	   
	   TrabajosArtista andresNinoTrabajo4 =  new TrabajosArtista();
	   andresNinoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNino4.jpg");
	   
	   TrabajosArtista andresNinoTrabajo5 =  new TrabajosArtista();
	   andresNinoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresNino/andresNino5.jpg");
	   
	   andresNinotrabajos.add(andresNinoTrabajo1);
	   andresNinotrabajos.add(andresNinoTrabajo2);
	   andresNinotrabajos.add(andresNinoTrabajo3);
	   andresNinotrabajos.add(andresNinoTrabajo4);
	   andresNinotrabajos.add(andresNinoTrabajo5);
	   Collections.shuffle(andresNinotrabajos);
	   
	   
	   andresNino.setTrabajosArtistas(andresNinotrabajos);
	   //FIN ANDRES NIÑO
	   
//INICIO CARLOX ANGARITA  id 178
	   
	   Artista carloxAngarita=  new 	Artista();
		carloxAngarita.setDescripcion("12 años de experiencia aproximadamente, especialidad realismo");
		carloxAngarita.setId("178");
		carloxAngarita.setNombre("Carlox angarita");
		carloxAngarita.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngaritaPerfil.jpg");
	    carloxAngarita.setFacebook("Carlox angarita");
	    carloxAngarita.setUsuarioFacebook("CARLOX.ANGARITA.ARTIST");
	    carloxAngarita.setCelular("+573154259263");
	    carloxAngarita.setInstagram("Carloxangarita");
	    carloxAngarita.setUsuarioInstagram("Carloxangarita");
	    carloxAngarita.setDireccion("Carrera 14 a # 83 64"); 	
	    carloxAngarita.setEspecialidad(realismo);
	    carloxAngarita.setTwitter("false");
	    carloxAngarita.setUsuarioTwitter("false");
	    carloxAngarita.setLatitud("4.668924797006963");
	    carloxAngarita.setLongitud("-74.05520483851433");
	    carloxAngarita.setNombreEstudio("Subterránea tattoo ");
	    carloxAngarita.setEmail("carloxangarita@gmail.com");
	    carloxAngarita.setCiudad(bogota);
	    carloxAngarita.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> carloxAngaritatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista carloxAngaritaTrabajo1 =  new TrabajosArtista();
	   carloxAngaritaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngarita1.jpg");
	   
	   TrabajosArtista carloxAngaritaTrabajo2 =  new TrabajosArtista();
	   carloxAngaritaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngarita2.jpg");
	   
	   TrabajosArtista carloxAngaritaTrabajo3 =  new TrabajosArtista();
	   carloxAngaritaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngarita3.jpg");
	   
	   TrabajosArtista carloxAngaritaTrabajo4 =  new TrabajosArtista();
	   carloxAngaritaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngarita4.jpg");
	   
	   TrabajosArtista carloxAngaritaTrabajo5 =  new TrabajosArtista();
	   carloxAngaritaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carloxAngarita/carloxAngarita5.jpg");
	   
	   carloxAngaritatrabajos.add(carloxAngaritaTrabajo1);
	   carloxAngaritatrabajos.add(carloxAngaritaTrabajo2);
	   carloxAngaritatrabajos.add(carloxAngaritaTrabajo3);
	   carloxAngaritatrabajos.add(carloxAngaritaTrabajo4);
	   carloxAngaritatrabajos.add(carloxAngaritaTrabajo5);
	   Collections.shuffle(carloxAngaritatrabajos);
	   
	   
	   carloxAngarita.setTrabajosArtistas(carloxAngaritatrabajos);
	   //FIN CARLOX ANGARITA
	   
	   
//INICIO CARLOS ROJASid 184
	   
	   Artista carlosRojas=  new 	Artista();
		carlosRojas.setDescripcion("12 años de experiencia aproximadamente, especialidad realismo");
		carlosRojas.setId("184");
		carlosRojas.setNombre("Carlos Rojas");
		carlosRojas.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojasPerfil.jpg");
	    carlosRojas.setFacebook("Carlos Rojas");
	    carlosRojas.setUsuarioFacebook("nesta.tattoo");
	    carlosRojas.setCelular("+573112653130");
	    carlosRojas.setInstagram("false");
	    carlosRojas.setUsuarioInstagram("false");
	    carlosRojas.setDireccion("Cra 38 a # 0 -16"); 	
	    carlosRojas.setEspecialidad(estiloLibre);
	    carlosRojas.setTwitter("false");
	    carlosRojas.setUsuarioTwitter("false");
	    carlosRojas.setLatitud("4.60444632290078");
	    carlosRojas.setLongitud("-74.11337792873383");
	    carlosRojas.setNombreEstudio("Tox-ink tattoo shop");
	    carlosRojas.setEmail("toxinktattoo@gmail.com");
	    carlosRojas.setCiudad(bogota);
	    carlosRojas.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> carloRojastrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista carlosRojasTrabajo1 =  new TrabajosArtista();
	   carlosRojasTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojas1.jpg");
	   
	   TrabajosArtista carlosRojasTrabajo2 =  new TrabajosArtista();
	   carlosRojasTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojas2.jpg");
	   
	   TrabajosArtista carlosRojasTrabajo3 =  new TrabajosArtista();
	   carlosRojasTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojas3.jpg");
	   
	   TrabajosArtista carlosRojasTrabajo4 =  new TrabajosArtista();
	   carlosRojasTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojas4.jpg");
	   
	   TrabajosArtista carlosRojasTrabajo5 =  new TrabajosArtista();
	   carlosRojasTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/carlosRojas/carlosRojas5.jpg");
	   
	   carloRojastrabajos.add(carlosRojasTrabajo1);
	   carloRojastrabajos.add(carlosRojasTrabajo2);
	   carloRojastrabajos.add(carlosRojasTrabajo3);
	   carloRojastrabajos.add(carlosRojasTrabajo4);
	   carloRojastrabajos.add(carlosRojasTrabajo5);
	   Collections.shuffle(carloRojastrabajos);
	   
	   
	   carlosRojas.setTrabajosArtistas(carloRojastrabajos);
	   //FIN CARLOS ROJAS
	   
	   //INICIO DIEGO PERDOMO id 185
	   
	   Artista diegoPerdomo=  new 	Artista();
		diegoPerdomo.setDescripcion("Trabajo hace 3 años en dracul tattoo, los estilos que manejo son libres, pero me llama la atención el oriental, sombras y realismo, reconocimiento en el tattoo music fest 2do puesto categoria libre");
		diegoPerdomo.setId("185");
		diegoPerdomo.setNombre("Diego perdomo");
		diegoPerdomo.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomoPerfil.jpg");
	    diegoPerdomo.setFacebook("Diego perdomo");
	    diegoPerdomo.setUsuarioFacebook("diegoperdomofonseca");
	    diegoPerdomo.setCelular("+573208727591");
	    diegoPerdomo.setInstagram("false");
	    diegoPerdomo.setUsuarioInstagram("false");
	    diegoPerdomo.setDireccion("Av. Caracas #44-40"); 	
	    diegoPerdomo.setEspecialidad(estiloLibre);
	    diegoPerdomo.setTwitter("false");
	    diegoPerdomo.setUsuarioTwitter("false");
	    diegoPerdomo.setLatitud("4.632195251380057");
	    diegoPerdomo.setLongitud("-74.06754434108734");
	    diegoPerdomo.setNombreEstudio("Dracul tattoo studio");
	    diegoPerdomo.setEmail("Perdomof_91@hotmail.com");
	    diegoPerdomo.setCiudad(bogota);
	    diegoPerdomo.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> diegoPerdomotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista diegoPerdomoTrabajo1 =  new TrabajosArtista();
	   diegoPerdomoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomo1.jpg");
	   
	   TrabajosArtista diegoPerdomoTrabajo2 =  new TrabajosArtista();
	   diegoPerdomoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomo2.jpg");
	   
	   TrabajosArtista diegoPerdomoTrabajo3 =  new TrabajosArtista();
	   diegoPerdomoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomo3.jpg");
	   
	   TrabajosArtista diegoPerdomoTrabajo4 =  new TrabajosArtista();
	   diegoPerdomoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomo4.jpg");
	   
	   TrabajosArtista diegoPerdomoTrabajo5 =  new TrabajosArtista();
	   diegoPerdomoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoPerdomo/diegoPerdomo5.jpg");
	   
	   diegoPerdomotrabajos.add(diegoPerdomoTrabajo1);
	   diegoPerdomotrabajos.add(diegoPerdomoTrabajo2);
	   diegoPerdomotrabajos.add(diegoPerdomoTrabajo3);
	   diegoPerdomotrabajos.add(diegoPerdomoTrabajo4);
	   diegoPerdomotrabajos.add(diegoPerdomoTrabajo5);
	   Collections.shuffle(diegoPerdomotrabajos);
	   
	   
	   diegoPerdomo.setTrabajosArtistas(diegoPerdomotrabajos);
	   //FIN DIEGO PERDOMO
	   
	   //INICIO DANIEL MARIN id 186
	   
	   Artista danielMarin=  new 	Artista();
		danielMarin.setDescripcion("Llevo trabajando alrededor de 8 años en el medio del tattoo,  el estilo que más me gusta es el realismo a sombras aunque todos los proyectos son bienvenidos. ");
		danielMarin.setId("186");
		danielMarin.setNombre("Daniel marin");
		danielMarin.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarinPerfil.jpg");
	    danielMarin.setFacebook("Daniel marin");
	    danielMarin.setUsuarioFacebook("dammotattoo");
	    danielMarin.setCelular("+573204584916");
	    danielMarin.setInstagram("false");
	    danielMarin.setUsuarioInstagram("false");
	    danielMarin.setDireccion("Av. Caracas #44-40"); 	
	    danielMarin.setEspecialidad(estiloLibre);
	    danielMarin.setTwitter("false");
	    danielMarin.setUsuarioTwitter("false");
	    danielMarin.setLatitud("4.632195251380057");
	    danielMarin.setLongitud("-74.06754434108734");
	    danielMarin.setNombreEstudio("Dracul tattoo studio");
	    danielMarin.setEmail("Rapdamo@hotmail.com");
	    danielMarin.setCiudad(bogota);
	    danielMarin.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> danielMarintrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista danielMarinTrabajo1 =  new TrabajosArtista();
	   danielMarinTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarin1.jpg");
	   
	   TrabajosArtista danielMarinTrabajo2 =  new TrabajosArtista();
	   danielMarinTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarin2.jpg");
	   
	   TrabajosArtista danielMarinTrabajo3 =  new TrabajosArtista();
	   danielMarinTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarin3.jpg");
	   
	   TrabajosArtista danielMarinTrabajo4 =  new TrabajosArtista();
	   danielMarinTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarin4.jpg");
	   
	   TrabajosArtista danielMarinTrabajo5 =  new TrabajosArtista();
	   danielMarinTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielMarin/danielMarin5.jpg");
	   
	   danielMarintrabajos.add(danielMarinTrabajo1);
	   danielMarintrabajos.add(danielMarinTrabajo2);
	   danielMarintrabajos.add(danielMarinTrabajo3);
	   danielMarintrabajos.add(danielMarinTrabajo4);
	   danielMarintrabajos.add(danielMarinTrabajo5);
	   Collections.shuffle(danielMarintrabajos);
	   
	   
	   danielMarin.setTrabajosArtistas(danielMarintrabajos);
	   //FIN DANIEL MARIN
	   
  //INICIO SEBASTIAN VINASCO id 168
	   
	   Artista sebastianVinasco=  new 	Artista();
		sebastianVinasco.setDescripcion("7 años de experiencia, especialidad en realismo.");
		sebastianVinasco.setId("168");
		sebastianVinasco.setNombre("Sebastian vinasco");
		sebastianVinasco.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinascoPerfil.jpg");
	    sebastianVinasco.setFacebook("Sebastian vinasco");
	    sebastianVinasco.setUsuarioFacebook("sebastianvinasco");
	    sebastianVinasco.setCelular("+573133648879");
	    sebastianVinasco.setInstagram("Sebastianvinasco");
	    sebastianVinasco.setUsuarioInstagram("Sebastianvinasco");
	    sebastianVinasco.setDireccion("Cra13#52a_40"); 	
	    sebastianVinasco.setEspecialidad(realismo);
	    sebastianVinasco.setTwitter("false");
	    sebastianVinasco.setUsuarioTwitter("false");
	    sebastianVinasco.setLatitud("4.639917463735311");
	    sebastianVinasco.setLongitud("-74.06508073210716");
	    sebastianVinasco.setNombreEstudio("Store tattoo");
	    sebastianVinasco.setEmail("Svinasco@hotmail.com");
	    sebastianVinasco.setCiudad(bogota);
	    sebastianVinasco.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> sebastianVinascotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista sebastianVinascoTrabajo1 =  new TrabajosArtista();
	   sebastianVinascoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinasco1.jpg");
	   
	   TrabajosArtista sebastianVinascoTrabajo2 =  new TrabajosArtista();
	   sebastianVinascoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinasco2.jpg");
	   
	   TrabajosArtista sebastianVinascoTrabajo3 =  new TrabajosArtista();
	   sebastianVinascoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinasco3.jpg");
	   
	   TrabajosArtista sebastianVinascoTrabajo4 =  new TrabajosArtista();
	   sebastianVinascoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinasco4.jpg");
	   
	   TrabajosArtista sebastianVinascoTrabajo5 =  new TrabajosArtista();
	   sebastianVinascoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianVinasco/sebastianVinasco5.jpg");
	   
	   sebastianVinascotrabajos.add(sebastianVinascoTrabajo1);
	   sebastianVinascotrabajos.add(sebastianVinascoTrabajo2);
	   sebastianVinascotrabajos.add(sebastianVinascoTrabajo3);
	   sebastianVinascotrabajos.add(sebastianVinascoTrabajo4);
	   sebastianVinascotrabajos.add(sebastianVinascoTrabajo5);
	   Collections.shuffle(sebastianVinascotrabajos);
	   
	   
	   sebastianVinasco.setTrabajosArtistas(sebastianVinascotrabajos);
	   //FIN SEBASTIAN VINASCO
	   
  //INICIO TITO MONSTA id 173
	   
	   Artista titoMonsta=  new 	Artista();
		titoMonsta.setDescripcion("7 años de experiencia en tatuajes tradicionales/vieja escuela..");
		titoMonsta.setId("173");
		titoMonsta.setNombre("Tito monsta");
		titoMonsta.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonstaPerfil.jpg");
	    titoMonsta.setFacebook("Tito monsta");
	    titoMonsta.setUsuarioFacebook("titomonstabilly");
	    titoMonsta.setCelular("+573007104528");
	    titoMonsta.setInstagram("false");
	    titoMonsta.setUsuarioInstagram("false");
	    titoMonsta.setDireccion("Cra 37#10_26 3er piso of 202"); 	
	    titoMonsta.setEspecialidad(tradicional);
	    titoMonsta.setTwitter("false");
	    titoMonsta.setUsuarioTwitter("false");
	    titoMonsta.setLatitud("6.227784613016048");
	    titoMonsta.setLongitud("-75.54325819015503");
	    titoMonsta.setNombreEstudio("Pantera negra tattoo");
	    titoMonsta.setEmail("Marrano_en_chanclas@hotmail.com");
	    titoMonsta.setCiudad(medellin);
	    titoMonsta.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> titoMonstatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista titoMonstaTrabajo1 =  new TrabajosArtista();
	   titoMonstaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonsta1.jpg");
	   
	   TrabajosArtista titoMonstaTrabajo2 =  new TrabajosArtista();
	   titoMonstaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonsta2.jpg");
	   
	   TrabajosArtista titoMonstaTrabajo3 =  new TrabajosArtista();
	   titoMonstaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonsta3.jpg");
	   
	   TrabajosArtista titoMonstaTrabajo4 =  new TrabajosArtista();
	   titoMonstaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonsta4.jpg");
	   
	   TrabajosArtista titoMonstaTrabajo5 =  new TrabajosArtista();
	   titoMonstaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/titoMonsta/titoMonsta5.jpg");
	   
	   titoMonstatrabajos.add(titoMonstaTrabajo1);
	   titoMonstatrabajos.add(titoMonstaTrabajo2);
	   titoMonstatrabajos.add(titoMonstaTrabajo3);
	   titoMonstatrabajos.add(titoMonstaTrabajo4);
	   titoMonstatrabajos.add(titoMonstaTrabajo5);
	   Collections.shuffle(titoMonstatrabajos);
	   
	   
	   titoMonsta.setTrabajosArtistas(titoMonstatrabajos);
	   //FIN TITO MONSTA
	   
  //INICIO DWAYNE id 173
	   
	   Artista dwayne=  new 	Artista();
		dwayne.setDescripcion("Me gusta tradicional y Letter soy de Aruba y trabajo en inkspiration tattoo studio");
		dwayne.setId("150");
		dwayne.setNombre("Dwayne");
		dwayne.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwaynePerfil.jpg");
	    dwayne.setFacebook("Dwayne");
	    dwayne.setUsuarioFacebook("Tattoo-by-Dwayne-529967933745935/");
	    dwayne.setCelular("+297 6608879");
	    dwayne.setInstagram("Tattoobydwayne");
	    dwayne.setUsuarioInstagram("Tattoobydwayne");
	    dwayne.setDireccion("J. E Irasquin blvd "); 	
	    dwayne.setEspecialidad(tradicional);
	    dwayne.setTwitter("false");
	    dwayne.setUsuarioTwitter("false");
	    dwayne.setLatitud("12.45484792984284");
	    dwayne.setLongitud("-69.95321273803711");
	    dwayne.setNombreEstudio("Inkspiration tattoo studio");
	    dwayne.setEmail("tattoobydwayne@gmail.com");
	    dwayne.setCiudad(savaneta);
	    dwayne.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> dwaynetrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista dwayneTrabajo1 =  new TrabajosArtista();
	   dwayneTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwayne1.jpg");
	   
	   TrabajosArtista dwayneTrabajo2 =  new TrabajosArtista();
	   dwayneTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwayne2.jpg");
	   
	   TrabajosArtista dwayneTrabajo3 =  new TrabajosArtista();
	   dwayneTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwayne3.jpg");
	   
	   TrabajosArtista dwayneTrabajo4 =  new TrabajosArtista();
	   dwayneTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwayne4.jpg");
	   
	   TrabajosArtista dwayneTrabajo5 =  new TrabajosArtista();
	   dwayneTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dwayne/dwayne5.jpg");
	   
	   dwaynetrabajos.add(dwayneTrabajo1);
	   dwaynetrabajos.add(dwayneTrabajo2);
	   dwaynetrabajos.add(dwayneTrabajo3);
	   dwaynetrabajos.add(dwayneTrabajo4);
	   dwaynetrabajos.add(dwayneTrabajo5);
	   Collections.shuffle(dwaynetrabajos);
	   
	   
	   dwayne.setTrabajosArtistas(dwaynetrabajos);
	   //FIN DWAYNE
	   
	   //INICIO JAEL RIVERO id 163
	   
	   Artista jaelRivero=  new 	Artista();
		jaelRivero.setDescripcion("Tengo doce años tatuando  mi especialidad es el Lettering transploka oriental y estilo libre  ");
		jaelRivero.setId("163");
		jaelRivero.setNombre("Jael rivero");
		jaelRivero.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRiveroPerfil.jpg");
	    jaelRivero.setFacebook("Jael rivero");
	    jaelRivero.setUsuarioFacebook("jaelriverotattoo/");
	    jaelRivero.setCelular("+573045565253");
	    jaelRivero.setInstagram("Jaeltattoo13");
	    jaelRivero.setUsuarioInstagram("Jaeltattoo13");
	    jaelRivero.setDireccion("Av Calle 72 no. 99_12"); 	
	    jaelRivero.setEspecialidad(estiloLibre);
	    jaelRivero.setTwitter("false");
	    jaelRivero.setUsuarioTwitter("false");
	    jaelRivero.setLatitud("4.702909743934108");
	    jaelRivero.setLongitud("-74.11538422107697");
	    jaelRivero.setNombreEstudio("Scorpions tattoo");
	    jaelRivero.setEmail("codigotinta666@hotmail.com");
	    jaelRivero.setCiudad(bogota);
	    jaelRivero.setVerificado("false");
	    
	    
		ArrayList<TrabajosArtista> jaelRiverotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jaelRiveroTrabajo1 =  new TrabajosArtista();
	   jaelRiveroTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRivero1.jpg");
	   
	   TrabajosArtista jaelRiveroTrabajo2 =  new TrabajosArtista();
	   jaelRiveroTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRivero2.jpg");
	   
	   TrabajosArtista jaelRiveroTrabajo3 =  new TrabajosArtista();
	   jaelRiveroTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRivero3.jpg");
	   
	   TrabajosArtista jaelRiveroTrabajo4 =  new TrabajosArtista();
	   jaelRiveroTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRivero4.jpg");
	   
	   TrabajosArtista jaelRiveroTrabajo5 =  new TrabajosArtista();
	   jaelRiveroTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jaelRivero/jaelRivero5.jpg");
	   
	   jaelRiverotrabajos.add(jaelRiveroTrabajo1);
	   jaelRiverotrabajos.add(jaelRiveroTrabajo2);
	   jaelRiverotrabajos.add(jaelRiveroTrabajo3);
	   jaelRiverotrabajos.add(jaelRiveroTrabajo4);
	   jaelRiverotrabajos.add(jaelRiveroTrabajo5);
	   Collections.shuffle(jaelRiverotrabajos);
	   
	   
	   jaelRivero.setTrabajosArtistas(jaelRiverotrabajos);
	   //FIN JAEL RIVERO
	   
//INICIO CLAU GIRALDO id 187
	   
	   Artista clauGiraldo=  new 	Artista();
		clauGiraldo.setDescripcion("Tatuadora con dos años de experiencia,  actualmente trabajando en TATTOO COMPANY  ");
		clauGiraldo.setId("187");
		clauGiraldo.setNombre("Clau giraldo");
		clauGiraldo.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldoPerfil.jpg");
	    clauGiraldo.setFacebook("Clau giraldo");
	    clauGiraldo.setUsuarioFacebook("claugiraldotattoo");
	    clauGiraldo.setCelular("+573167552786");
	    clauGiraldo.setInstagram("Claugi_tattoo");
	    clauGiraldo.setUsuarioInstagram("Claugi_tattoo");
	    clauGiraldo.setDireccion("Calle 57 # 13-65"); 	
	    clauGiraldo.setEspecialidad(neotradicional);
	    clauGiraldo.setTwitter("claugi_tattoo ");
	    clauGiraldo.setUsuarioTwitter("claugi_tattoo");
	    clauGiraldo.setLatitud("4.6441708601961400");
	    clauGiraldo.setLongitud("-74.06444974243640");
	    clauGiraldo.setNombreEstudio("Tattoo company");
	    clauGiraldo.setEmail("Claudiapgiraldol@hotmail.com");
	    clauGiraldo.setCiudad(bogota);
	    clauGiraldo.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> clauGiraldotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista clauGiraldoTrabajo1 =  new TrabajosArtista();
	   clauGiraldoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldo1.jpg");
	   
	   TrabajosArtista clauGiraldoTrabajo2 =  new TrabajosArtista();
	   clauGiraldoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldo2.jpg");
	   
	   TrabajosArtista clauGiraldoTrabajo3 =  new TrabajosArtista();
	   clauGiraldoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldo3.jpg");
	   
	   TrabajosArtista clauGiraldoTrabajo4 =  new TrabajosArtista();
	   clauGiraldoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldo4.jpg");
	   
	   TrabajosArtista clauGiraldoTrabajo5 =  new TrabajosArtista();
	   clauGiraldoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/clauGiraldo/clauGiraldo5.jpg");
	   
	   clauGiraldotrabajos.add(clauGiraldoTrabajo1);
	   clauGiraldotrabajos.add(clauGiraldoTrabajo2);
	   clauGiraldotrabajos.add(clauGiraldoTrabajo3);
	   clauGiraldotrabajos.add(clauGiraldoTrabajo4);
	   clauGiraldotrabajos.add(clauGiraldoTrabajo5);
	   Collections.shuffle(clauGiraldotrabajos);
	   
	   
	   clauGiraldo.setTrabajosArtistas(clauGiraldotrabajos);
	   //FIN CLAU GIRALDO
	   
	   
//INICIO CESAR GARCIA id 188
	   
	   Artista cesarGarcia=  new 	Artista();
		cesarGarcia.setDescripcion("Artista Bogotano,  mi trabajo se desarrolla por el área del Realismo,  Free Style,  Color y Sombras.");
		cesarGarcia.setId("188");
		cesarGarcia.setNombre("Cesar garcia");
		cesarGarcia.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarciaPerfil.jpg");
	    cesarGarcia.setFacebook("Cesar garcia");
	    cesarGarcia.setUsuarioFacebook("cesar.rocker1");
	    cesarGarcia.setCelular("+573138001908");
	    cesarGarcia.setInstagram("dynastyinktattoo");
	    cesarGarcia.setUsuarioInstagram("dynastyinktattoo");
	    cesarGarcia.setDireccion("Av Cra 70#65a-71 L.216"); 	
	    cesarGarcia.setEspecialidad(realismo);
	    cesarGarcia.setTwitter("false ");
	    cesarGarcia.setUsuarioTwitter("false");
	    cesarGarcia.setLatitud("4.677608");
	    cesarGarcia.setLongitud("-74.095992");
	    cesarGarcia.setNombreEstudio("Dynasty ink tattoo");
	    cesarGarcia.setEmail("Dynasty-ink-tattoo@hotmail.com");
	    cesarGarcia.setCiudad(bogota);
	    cesarGarcia.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> cesarGarciatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista cesarGarciaTrabajo1 =  new TrabajosArtista();
	   cesarGarciaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarcia1.jpg");
	   
	   TrabajosArtista cesarGarciaTrabajo2 =  new TrabajosArtista();
	   cesarGarciaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarcia2.jpg");
	   
	   TrabajosArtista cesarGarciaTrabajo3 =  new TrabajosArtista();
	   cesarGarciaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarcia3.jpg");
	   
	   TrabajosArtista cesarGarciaTrabajo4 =  new TrabajosArtista();
	   cesarGarciaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarcia4.jpg");
	   
	   TrabajosArtista cesarGarciaTrabajo5 =  new TrabajosArtista();
	   cesarGarciaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cesarGarcia/cesarGarcia5.jpg");
	   
	   cesarGarciatrabajos.add(cesarGarciaTrabajo1);
	   cesarGarciatrabajos.add(cesarGarciaTrabajo2);
	   cesarGarciatrabajos.add(cesarGarciaTrabajo3);
	   cesarGarciatrabajos.add(cesarGarciaTrabajo4);
	   cesarGarciatrabajos.add(cesarGarciaTrabajo5);
	   Collections.shuffle(cesarGarciatrabajos);
	   
	   
	   cesarGarcia.setTrabajosArtistas(cesarGarciatrabajos);
	   //FIN CESAR GARCIA
	   
	   
//INICIO JUAN BALLEN id 189
	   
	   Artista juanBallen=  new 	Artista();
		juanBallen.setDescripcion("Cuento con 5 años de experiencia en el mundo del tatuaje donde e podido tatuar en diferentes ciudades de Colombia y en el exterior en studios de renombre como mandinga Tattoo en Argentina , dermografic studio en Bogotá y Rasec Tattoo en Cali ");
		juanBallen.setId("189");
		juanBallen.setNombre("Juan ballen");
		juanBallen.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallenPerfil.jpg");
	    juanBallen.setFacebook("Juan ballen");
	    juanBallen.setUsuarioFacebook("Juantattooballen");
	    juanBallen.setCelular("+573202785948");
	    juanBallen.setInstagram("tattoojuanballen13");
	    juanBallen.setUsuarioInstagram("tattoojuanballen13");
	    juanBallen.setDireccion("Calle 66#10-58"); 	
	    juanBallen.setEspecialidad(realismo);
	    juanBallen.setTwitter("false");
	    juanBallen.setUsuarioTwitter("false");
	    juanBallen.setLatitud("4.651769");
	    juanBallen.setLongitud("-74.061255");
	    juanBallen.setNombreEstudio("Tinta Colombiana");
	    juanBallen.setEmail("Ballenjuan46@gmail.com");
	    juanBallen.setCiudad(bogota);
	    juanBallen.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> juanBallentrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanBallenTrabajo1 =  new TrabajosArtista();
	   juanBallenTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallen1.jpg");
	   
	   TrabajosArtista juanBallenTrabajo2 =  new TrabajosArtista();
	   juanBallenTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallen2.jpg");
	   
	   TrabajosArtista juanBallenTrabajo3 =  new TrabajosArtista();
	   juanBallenTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallen3.jpg");
	   
	   TrabajosArtista juanBallenTrabajo4 =  new TrabajosArtista();
	   juanBallenTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallen4.jpg");
	   
	   TrabajosArtista juanBallenTrabajo5 =  new TrabajosArtista();
	   juanBallenTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanBallen/juanBallen5.jpg");
	   
	   juanBallentrabajos.add(juanBallenTrabajo1);
	   juanBallentrabajos.add(juanBallenTrabajo2);
	   juanBallentrabajos.add(juanBallenTrabajo3);
	   juanBallentrabajos.add(juanBallenTrabajo4);
	   juanBallentrabajos.add(juanBallenTrabajo5);
	   Collections.shuffle(juanBallentrabajos);
	   
	   
	   juanBallen.setTrabajosArtistas(juanBallentrabajos);
	   //FIN JUAN BALLEN
	   
//INICIO JUAN GUZMAN id 190
	   
	   Artista juanGuzman=  new 	Artista();
		juanGuzman.setDescripcion("Un artista con 3 años de experiencia y mucho pasión  y amor y dedicación por lo que  hace.");
		juanGuzman.setId("190");
		juanGuzman.setNombre("Juan Guzman");
		juanGuzman.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzmanPerfil.jpg");
	    juanGuzman.setFacebook("juAn Guzman");
	    juanGuzman.setUsuarioFacebook("1132045844");
	    juanGuzman.setCelular("+573192496331");
	    juanGuzman.setInstagram("Juaninkguzman");
	    juanGuzman.setUsuarioInstagram("Juaninkguzman");
	    juanGuzman.setDireccion("Calle 19 no 4-85"); 	
	    juanGuzman.setEspecialidad(arteJapones);
	    juanGuzman.setTwitter("uandelajauria");
	    juanGuzman.setUsuarioTwitter("uandelajauria");
	    juanGuzman.setLatitud("4.604222");
	    juanGuzman.setLongitud("-74.07023400000000");
	    juanGuzman.setNombreEstudio("Torniquet");
	    juanGuzman.setEmail("Juaninkguzman1117@outlook.com");
	    juanGuzman.setCiudad(bogota);
	    juanGuzman.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> juanGuzmantrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista juanGuzmanTrabajo1 =  new TrabajosArtista();
	   juanGuzmanTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzman1.jpg");
	   
	   TrabajosArtista juanGuzmanTrabajo2 =  new TrabajosArtista();
	   juanGuzmanTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzman2.jpg");
	   
	   TrabajosArtista juanGuzmanTrabajo3 =  new TrabajosArtista();
	   juanGuzmanTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzman3.jpg");
	   
	   TrabajosArtista juanGuzmanTrabajo4 =  new TrabajosArtista();
	   juanGuzmanTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzman4.jpg");
	   
	   TrabajosArtista juanGuzmanTrabajo5 =  new TrabajosArtista();
	   juanGuzmanTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/juanGuzman/juanGuzman5.jpg");
	   
	   juanGuzmantrabajos.add(juanGuzmanTrabajo1);
	   juanGuzmantrabajos.add(juanGuzmanTrabajo2);
	   juanGuzmantrabajos.add(juanGuzmanTrabajo3);
	   juanGuzmantrabajos.add(juanGuzmanTrabajo4);
	   juanGuzmantrabajos.add(juanGuzmanTrabajo5);
	   Collections.shuffle(juanGuzmantrabajos);
	   
	   
	   juanGuzman.setTrabajosArtistas(juanGuzmantrabajos);
	   //FIN JUAN INK GUZMAN
	   
//INICIO PEDRO TORRES id 193 pedroTorres
	   
	   Artista pedroTorres=  new 	Artista();
		pedroTorres.setDescripcion("Influenciado por la ilustración y el diseño gráfico, además de el arte vanguardista,  mi tendencia es el tattoo ilustrativo, neo tradicional y tradicional moderno,  siempre con la idea de personalizar todas las ideas.");
		pedroTorres.setId("193");
		pedroTorres.setNombre("Pedro torres");
		pedroTorres.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorresPerfil.jpg");
	    pedroTorres.setFacebook("Pedro torres");
	    pedroTorres.setUsuarioFacebook("Pedrosickmind");
	    pedroTorres.setCelular("-----------");
	    pedroTorres.setInstagram("pedrotorrestattoo");
	    pedroTorres.setUsuarioInstagram("pedrotorrestattoo");
	    pedroTorres.setDireccion("Calle 59 No13-33 Pasaje Gálvez Chapinero"); 	
	    pedroTorres.setEspecialidad(neotradicional);
	    pedroTorres.setTwitter("false");
	    pedroTorres.setUsuarioTwitter("false");
	    pedroTorres.setLatitud("4.646011495528870");
	    pedroTorres.setLongitud("-74.06460732221600");
	    pedroTorres.setNombreEstudio("Bogotatuajes");
	    pedroTorres.setEmail("Pedrohxcsk8@hotmail.com");
	    pedroTorres.setCiudad(bogota);
	    pedroTorres.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> pedroTorrestrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista pedroTorresTrabajo1 =  new TrabajosArtista();
	   pedroTorresTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorres1.jpg");
	   
	   TrabajosArtista pedroTorresTrabajo2 =  new TrabajosArtista();
	   pedroTorresTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorres2.jpg");
	   
	   TrabajosArtista pedroTorresTrabajo3 =  new TrabajosArtista();
	   pedroTorresTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorres3.jpg");
	   
	   TrabajosArtista pedroTorresTrabajo4 =  new TrabajosArtista();
	   pedroTorresTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorres4.jpg");
	   
	   TrabajosArtista pedroTorresTrabajo5 =  new TrabajosArtista();
	   pedroTorresTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/pedroTorres/pedroTorres5.jpg");
	   
	   pedroTorrestrabajos.add(pedroTorresTrabajo1);
	   pedroTorrestrabajos.add(pedroTorresTrabajo2);
	   pedroTorrestrabajos.add(pedroTorresTrabajo3);
	   pedroTorrestrabajos.add(pedroTorresTrabajo4);
	   pedroTorrestrabajos.add(pedroTorresTrabajo5);
	   Collections.shuffle(pedroTorrestrabajos);
	   
	   
	   pedroTorres.setTrabajosArtistas(pedroTorrestrabajos);
	   //FIN PEDRO TORRES 
	   
//INICIO DANIELA DUQUE 194 danielaDuque
	   
	   Artista danielDuque=  new 	Artista();
		danielDuque.setDescripcion("Tatuadora de la cuidad de bogotá, tatuo desde el año 2014. Mi estilo es realismo y full color.");
		danielDuque.setId("194");
		danielDuque.setNombre("Daniela  duque");
		danielDuque.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuquePerfil.jpg");
	    danielDuque.setFacebook("Daniela duque");
	    danielDuque.setUsuarioFacebook("1616576331");
	    danielDuque.setCelular("+573132922637");
	    danielDuque.setInstagram("danieladuquetattoo");
	    danielDuque.setUsuarioInstagram("danieladuquetattoo");
	    danielDuque.setDireccion("kra 15 n 80 25"); 	
	    danielDuque.setEspecialidad(realismo);
	    danielDuque.setTwitter("false");
	    danielDuque.setUsuarioTwitter("false");
	    danielDuque.setLatitud("4.666753");
	    danielDuque.setLongitud("-74.057059");
	    danielDuque.setNombreEstudio("Gotink Tattoo");
	    danielDuque.setEmail("daniela.duque_dd@hotmail.com");
	    danielDuque.setCiudad(bogota);
	    danielDuque.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> danielaDuquetrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista danielaDuqueTrabajo1 =  new TrabajosArtista();
	   danielaDuqueTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuque1.jpg");
	   
	   TrabajosArtista danielaDuqueTrabajo2 =  new TrabajosArtista();
	   danielaDuqueTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuque2.jpg");
	   
	   TrabajosArtista danielaDuqueTrabajo3 =  new TrabajosArtista();
	   danielaDuqueTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuque3.jpg");
	   
	   TrabajosArtista danielaDuqueTrabajo4 =  new TrabajosArtista();
	   danielaDuqueTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuque4.jpg");
	   
	   TrabajosArtista danielaDuqueTrabajo5 =  new TrabajosArtista();
	   danielaDuqueTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/danielaDuque/danielaDuque5.jpg");
	   
	   danielaDuquetrabajos.add(danielaDuqueTrabajo1);
	   danielaDuquetrabajos.add(danielaDuqueTrabajo2);
	   danielaDuquetrabajos.add(danielaDuqueTrabajo3);
	   danielaDuquetrabajos.add(danielaDuqueTrabajo4);
	   danielaDuquetrabajos.add(danielaDuqueTrabajo5);
	   Collections.shuffle(danielaDuquetrabajos);
	   
	   
	   danielDuque.setTrabajosArtistas(danielaDuquetrabajos);
	   //FIN DANIELA DUQUE 
	   
//INICIO IVAN KNIGHT 196 ivanKnight
	   
	   Artista ivanKnight=  new 	Artista();
		ivanKnight.setDescripcion("Diseñador gráfico e ilustrador, apasionado por el arte y el rock and roll. Emprendió en el mundo del tattoo en el 2012; tatuando como todos a los pareceros y familiares. En el 2014 culminó sus estudios básicos en dermopigmentación aumentando más sus conocimientos y experiencia.");
		ivanKnight.setId("196");
		ivanKnight.setNombre("Ivan knight");
		ivanKnight.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnightPerfil.jpg");
	    ivanKnight.setFacebook("Ivan knight");
	    ivanKnight.setUsuarioFacebook("ivan.knight1");
	    ivanKnight.setCelular("+573193689701");
	    ivanKnight.setInstagram("false");
	    ivanKnight.setUsuarioInstagram("false");
	    ivanKnight.setDireccion("Carrera 15 # 73 - 45"); 	
	    ivanKnight.setEspecialidad(arteJapones);
	    ivanKnight.setTwitter("guananaknight");
	    ivanKnight.setUsuarioTwitter("guananaknight");
	    ivanKnight.setLatitud("4.63088");
	    ivanKnight.setLongitud("-74.08657");
	    ivanKnight.setNombreEstudio("Rocker machine");
	    ivanKnight.setEmail("Iguanana_knight.0304@hotmail.com");
	    ivanKnight.setCiudad(bogota);
	    ivanKnight.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> ivanKnighttrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista ivanKnightTrabajo1 =  new TrabajosArtista();
	   ivanKnightTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnight1.jpg");
	   
	   TrabajosArtista ivanKnightTrabajo2 =  new TrabajosArtista();
	   ivanKnightTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnight2.jpg");
	   
	   TrabajosArtista ivanKnightTrabajo3 =  new TrabajosArtista();
	   ivanKnightTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnight3.jpg");
	   
	   TrabajosArtista ivanKnightTrabajo4 =  new TrabajosArtista();
	   ivanKnightTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnight4.jpg");
	   
	   TrabajosArtista ivanKnightTrabajo5 =  new TrabajosArtista();
	   ivanKnightTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ivanKnight/ivanKnight5.jpg");
	   
	   ivanKnighttrabajos.add(ivanKnightTrabajo1);
	   ivanKnighttrabajos.add(ivanKnightTrabajo2);
	   ivanKnighttrabajos.add(ivanKnightTrabajo3);
	   ivanKnighttrabajos.add(ivanKnightTrabajo4);
	   ivanKnighttrabajos.add(ivanKnightTrabajo5);
	   Collections.shuffle(ivanKnighttrabajos);
	   
	   
	   ivanKnight.setTrabajosArtistas(ivanKnighttrabajos);
	   //FIN IVAN KNIGHT
	   
	   
//INICIO GABRIEL BERNAL 192 gabrielBernal
	   
	   Artista gabrielBernal=  new 	Artista();
		gabrielBernal.setDescripcion("Con 1 año y medio de experiencia, diseños personalizados, manejo de un estilo ilustrativo.");
		gabrielBernal.setId("192");
		gabrielBernal.setNombre("Gabriel bernal");
		gabrielBernal.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernalPerfil.jpg");
	    gabrielBernal.setFacebook("Gabriel bernal");
	    gabrielBernal.setUsuarioFacebook("luisgabrielbernalrodriguez");
	    gabrielBernal.setCelular("+573014358849");
	    gabrielBernal.setInstagram("false");
	    gabrielBernal.setUsuarioInstagram("false");
	    gabrielBernal.setDireccion("Cll 19#4-71 Cc los Ángeles la.130"); 	
	    gabrielBernal.setEspecialidad(neotradicional);
	    gabrielBernal.setTwitter("false");
	    gabrielBernal.setUsuarioTwitter("false");
	    gabrielBernal.setLatitud("4.604222");
	    gabrielBernal.setLongitud("-74.07023400000000");
	    gabrielBernal.setNombreEstudio("Clásico Tattoo ");
	    gabrielBernal.setEmail("gabopunrad@yahoo.es");
	    gabrielBernal.setCiudad(bogota);
	    gabrielBernal.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> gabrielBernaltrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista gabrielBernalTrabajo1 =  new TrabajosArtista();
	   gabrielBernalTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernal1.jpg");
	   
	   TrabajosArtista gabrielBernalTrabajo2 =  new TrabajosArtista();
	   gabrielBernalTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernal2.jpg");
	   
	   TrabajosArtista gabrielBernalTrabajo3 =  new TrabajosArtista();
	   gabrielBernalTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernal3.jpg");
	   
	   TrabajosArtista gabrielBernalTrabajo4 =  new TrabajosArtista();
	   gabrielBernalTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernal4.jpg");
	   
	   TrabajosArtista gabrielBernalTrabajo5 =  new TrabajosArtista();
	   gabrielBernalTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/gabrielBernal/gabrielBernal5.jpg");
	   
	   gabrielBernaltrabajos.add(gabrielBernalTrabajo1);
	   gabrielBernaltrabajos.add(gabrielBernalTrabajo2);
	   gabrielBernaltrabajos.add(gabrielBernalTrabajo3);
	   gabrielBernaltrabajos.add(gabrielBernalTrabajo4);
	   gabrielBernaltrabajos.add(gabrielBernalTrabajo5);
	   Collections.shuffle(gabrielBernaltrabajos);
	   
	   
	   gabrielBernal.setTrabajosArtistas(gabrielBernaltrabajos);
	   //FIN GABRIEL BERNAL
	   
	   
//INICIO HARSON RODRIGUEZ 197 harsonRodriguez
	   
	   Artista harsonRodriguez=  new 	Artista();
		harsonRodriguez.setDescripcion("Gerente propietario de el studio Rocker Machine Tattoo. En este largo camino de ser tatuador llevo 3 años realizando grandes piezas de realismo dedicando todo mi esfuerzo para ser cada día mejor.  Graduado de el studio dermografic certificado en realismo por Daniel fonseca. Los invito a visitar nuestros studios.  Tinta arte y rock and roll ");
		harsonRodriguez.setId("197");
		harsonRodriguez.setNombre("Harson rodriguez");
		harsonRodriguez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguezPerfil.jpg");
	    harsonRodriguez.setFacebook("Harson rodriguez");
	    harsonRodriguez.setUsuarioFacebook("harsonysandra");
	    harsonRodriguez.setCelular("+573108558594");
	    harsonRodriguez.setInstagram("false");
	    harsonRodriguez.setUsuarioInstagram("false");
	    harsonRodriguez.setDireccion("Carrera 15 # 73 - 45"); 	
	    harsonRodriguez.setEspecialidad(realismo);
	    harsonRodriguez.setTwitter("false");
	    harsonRodriguez.setUsuarioTwitter("false");
	    harsonRodriguez.setLatitud("4.63088");
	    harsonRodriguez.setLongitud("-74.08657");
	    harsonRodriguez.setNombreEstudio("Rocker Machine Tattoo");
	    harsonRodriguez.setEmail("Rockermachinetattoo@gmail.com");
	    harsonRodriguez.setCiudad(bogota);
	    harsonRodriguez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> harsonRodrigueztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista harsonRodriguezTrabajo1 =  new TrabajosArtista();
	   harsonRodriguezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguez1.jpg");
	   
	   TrabajosArtista harsonRodriguezTrabajo2 =  new TrabajosArtista();
	   harsonRodriguezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguez2.jpg");
	   
	   TrabajosArtista harsonRodriguezTrabajo3 =  new TrabajosArtista();
	   harsonRodriguezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguez3.jpg");
	   
	   TrabajosArtista harsonRodriguezTrabajo4 =  new TrabajosArtista();
	   harsonRodriguezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguez4.jpg");
	   
	   TrabajosArtista harsonRodriguezTrabajo5 =  new TrabajosArtista();
	   harsonRodriguezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/harsonRodriguez/harsonRodriguez5.jpg");
	   
	   harsonRodrigueztrabajos.add(harsonRodriguezTrabajo1);
	   harsonRodrigueztrabajos.add(harsonRodriguezTrabajo2);
	   harsonRodrigueztrabajos.add(harsonRodriguezTrabajo3);
	   harsonRodrigueztrabajos.add(harsonRodriguezTrabajo4);
	   harsonRodrigueztrabajos.add(harsonRodriguezTrabajo5);
	   Collections.shuffle(harsonRodrigueztrabajos);
	   
	   
	   harsonRodriguez.setTrabajosArtistas(harsonRodrigueztrabajos);
	   //FIN HARSON RODRIGUEZ
	   
//INICIO RAFAEL GOMEZ 201 rafaelGomez
	   
	   Artista rafaelGomez=  new 	Artista();
		rafaelGomez.setDescripcion("Soy de la ciudad de Cali, llevo 10 años como artista. "
				+ "He ganado en las siguientes convenciones:  Tattoo Christmas (Buga) - Primer lugar categoría libre  Out of the box INK (Bogotá) - Segundo lugar categoría Realismo color                                         - Segundo lugar mejor tatuaje del día"
                 +"- Tercer lugar categoría libre"
		          +" Armenia Expo tattoo 2015   - Segundo lugar lettering"
                                         +"- Mejor manejo de Bioseguridad");
		rafaelGomez.setId("201");
		rafaelGomez.setNombre("Rafael gomez");
		rafaelGomez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomezPerfil.jpg");
	    rafaelGomez.setFacebook("Rafael gomez");
	    rafaelGomez.setUsuarioFacebook("elfostattoostudio");
	    rafaelGomez.setCelular("+573185294486");
	    rafaelGomez.setInstagram("Rafagotattoo");
	    rafaelGomez.setUsuarioInstagram("Rafagotattoo");
	    rafaelGomez.setDireccion("Calle 14 # 43a - 11, Barrio el Guabal"); 	
	    rafaelGomez.setEspecialidad(realismo);
	    rafaelGomez.setTwitter("false");
	    rafaelGomez.setUsuarioTwitter("false");
	    rafaelGomez.setLatitud("3.413878691032202");
	    rafaelGomez.setLongitud("-76.52840673923492");
	    rafaelGomez.setNombreEstudio("Rafael Gómez Tattoo");
	    rafaelGomez.setEmail("areasurtattoo@live.com");
	    rafaelGomez.setCiudad(cali);
	    rafaelGomez.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> rafaelGomeztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista rafaelGomezTrabajo1 =  new TrabajosArtista();
	   rafaelGomezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomez1.jpg");
	   
	   TrabajosArtista rafaelGomezTrabajo2 =  new TrabajosArtista();
	   rafaelGomezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomez2.jpg");
	   
	   TrabajosArtista rafaelGomezTrabajo3 =  new TrabajosArtista();
	   rafaelGomezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomez3.jpg");
	   
	   TrabajosArtista rafaelGomezTrabajo4 =  new TrabajosArtista();
	   rafaelGomezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomez4.jpg");
	   
	   TrabajosArtista rafaelGomezTrabajo5 =  new TrabajosArtista();
	   rafaelGomezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rafaelGomez/rafaelGomez5.jpg");
	   
	   rafaelGomeztrabajos.add(rafaelGomezTrabajo1);
	   rafaelGomeztrabajos.add(rafaelGomezTrabajo2);
	   rafaelGomeztrabajos.add(rafaelGomezTrabajo3);
	   rafaelGomeztrabajos.add(rafaelGomezTrabajo4);
	   rafaelGomeztrabajos.add(rafaelGomezTrabajo5);
	   Collections.shuffle(rafaelGomeztrabajos);
	   
	   
	   rafaelGomez.setTrabajosArtistas(rafaelGomeztrabajos);
	   //FIN RAFAEL GOMEZ
	   
//INICIO KORY ANGARITA 202 koryAngarita
	   
	   Artista koryAngarita=  new 	Artista();
		koryAngarita.setDescripcion("Kory Angarita Figueroa nació el 26 de julio de 1984 en Piedecuesta, Santander (Colombia). En su época de estudiante mostró gran interés por el arte; "+
	   " Su gran compromiso con el arte del tattoo lo llevo a querer mejorar aun mas su técnica y sus trazos por lo que empezó a pintar sobre lienzo desarrollando una gran técnica en su principal estilo (arte realista) y otros que disfruta haciendo; y con esto conseguir acercarse a sus objetivos artísticos. "+
				" Con gran esfuerzo logro participar en sus primeras convenciones y fruto de la calidad de su trabajo empezó a recibir invitaciones de diferentes partes del mundo, recibiendo gran acogida y alto reconocimiento de patrocinadores (Kwadron needles, Radiant Colors Ink, Sorry Mom y DragonFly machines) y de los amantes y seguidores del tattoo. actualmente a realizado trabajos en varios países del continente americano y europeo, este ultimo, lugar donde reside actualmente y desarrolla sus nuevos proyectos."+  

" Premios:" +
"1 lugar en sombras (Puerto Rico),"+
"1 lugar en realismo (Dinamarca),"+
"1 mejor de la convención (Rusia),");
		koryAngarita.setId("202");
		koryAngarita.setNombre("Kory angarita");
		koryAngarita.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngaritaPerfil.jpg");
	    koryAngarita.setFacebook("Kory angarita");
	    koryAngarita.setUsuarioFacebook("KoryTattoo");
	    koryAngarita.setCelular("+34697935914");
	    koryAngarita.setInstagram("koryangarita");
	    koryAngarita.setUsuarioInstagram("koryangarita");
	    koryAngarita.setDireccion("carrera 15# 83-24 oficia 207 Alfrente de la clinica contry"); 	
	    koryAngarita.setEspecialidad(realismo);
	    koryAngarita.setTwitter("koryangarita");
	    koryAngarita.setUsuarioTwitter("koryangarita");
	    koryAngarita.setLatitud("4.668671");
	    koryAngarita.setLongitud("-74.055871");
	    koryAngarita.setNombreEstudio("Kory angarita tattoo shop");
	    koryAngarita.setEmail("koryangarita.com@gmail.com");
	    koryAngarita.setCiudad(bogota);
	    koryAngarita.setVerificado("true");
	    
	   
		ArrayList<TrabajosArtista> koryAngaritatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista koryAngaritaTrabajo1 =  new TrabajosArtista();
	   koryAngaritaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngarita1.jpg");
	   
	   TrabajosArtista koryAngaritaTrabajo2 =  new TrabajosArtista();
	   koryAngaritaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngarita2.jpg");
	   
	   TrabajosArtista koryAngaritaTrabajo3 =  new TrabajosArtista();
	   koryAngaritaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngarita3.jpg");
	   
	   TrabajosArtista koryAngaritaTrabajo4 =  new TrabajosArtista();
	   koryAngaritaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngarita4.jpg");
	   
	   TrabajosArtista koryAngaritaTrabajo5 =  new TrabajosArtista();
	   koryAngaritaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/koryAngarita/koryAngarita5.jpg");
	   
	   koryAngaritatrabajos.add(koryAngaritaTrabajo1);
	   koryAngaritatrabajos.add(koryAngaritaTrabajo2);
	   koryAngaritatrabajos.add(koryAngaritaTrabajo3);
	   koryAngaritatrabajos.add(koryAngaritaTrabajo4);
	   koryAngaritatrabajos.add(koryAngaritaTrabajo5);
	   Collections.shuffle(koryAngaritatrabajos);
	   
	   
	   koryAngarita.setTrabajosArtistas(koryAngaritatrabajos);
	   //FIN KORY ANGARITA
	   
//INICIO JOSUE BELTRAN 191 josueBeltran
	   
	   Artista josueBeltran=  new 	Artista();
		josueBeltran.setDescripcion("Estudie plásticas en la escuela de artes y letras tatuador profesional clásico tatto suply");
		josueBeltran.setId("191");
		josueBeltran.setNombre("Josue beltran");
		josueBeltran.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltranPerfil.jpg");
	    josueBeltran.setFacebook("Josue beltran");
	    josueBeltran.setUsuarioFacebook("josue.beltran.370");
	    josueBeltran.setCelular("+573125548855");
	    josueBeltran.setInstagram("false");
	    josueBeltran.setUsuarioInstagram("false");
	    josueBeltran.setDireccion("Call19#4_71 loc130"); 	
	    josueBeltran.setEspecialidad(realismo);
	    josueBeltran.setTwitter("false");
	    josueBeltran.setUsuarioTwitter("false");
	    josueBeltran.setLatitud("4.604222");
	    josueBeltran.setLongitud("-74.07023400000000");
	    josueBeltran.setNombreEstudio("classic tattoo supply ");
	    josueBeltran.setEmail("artebaruc12@hotmail.com");
	    josueBeltran.setCiudad(bogota);
	    josueBeltran.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> josueBeltrantrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista josueBeltranTrabajo1 =  new TrabajosArtista();
	   josueBeltranTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltran1.jpg");
	   
	   TrabajosArtista josueBeltranTrabajo2 =  new TrabajosArtista();
	   josueBeltranTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltran2.jpg");
	   
	   TrabajosArtista josueBeltranTrabajo3 =  new TrabajosArtista();
	   josueBeltranTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltran3.jpg");
	   
	   TrabajosArtista josueBeltranTrabajo4 =  new TrabajosArtista();
	   josueBeltranTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltran4.jpg");
	   
	   TrabajosArtista josueBeltranTrabajo5 =  new TrabajosArtista();
	   josueBeltranTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/josueBeltran/josueBeltran5.jpg");
	   
	   josueBeltrantrabajos.add(josueBeltranTrabajo1);
	   josueBeltrantrabajos.add(josueBeltranTrabajo2);
	   josueBeltrantrabajos.add(josueBeltranTrabajo3);
	   josueBeltrantrabajos.add(josueBeltranTrabajo4);
	   josueBeltrantrabajos.add(josueBeltranTrabajo5);
	   Collections.shuffle(josueBeltrantrabajos);
	   
	   
	   josueBeltran.setTrabajosArtistas(josueBeltrantrabajos);
	   //FIN JOSUE BELTRAN 
	   
//INICIO SEBASTIAN HERRERA 203 sebastianHerrerasebastianHerrera
	   
	   Artista sebastianHerrera=  new 	Artista();
		sebastianHerrera.setDescripcion("Hola, mi nombre es Sebastián Herrera, de bogota. Trabajó en boda art tattoo en el centro de la ciudad, me gusta el estilo tradicional americano, acuarelas y nueva escuela para hacer mis tatuajes, en ocasiones , también linework y puntillismo.");
		sebastianHerrera.setId("203");
		sebastianHerrera.setNombre("Sebastian herrera");
		sebastianHerrera.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerreraPerfil.jpg");
	    sebastianHerrera.setFacebook("Sebastian herrera");
	    sebastianHerrera.setUsuarioFacebook("johansebastian.herrera");
	    sebastianHerrera.setCelular("+573202874726");
	    sebastianHerrera.setInstagram("Sebastianherreratattoo");
	    sebastianHerrera.setUsuarioInstagram("Sebastianherreratattoo");
	    sebastianHerrera.setDireccion("Cll 19#4-20"); 	
	    sebastianHerrera.setEspecialidad(tradicional);
	    sebastianHerrera.setTwitter("false");
	    sebastianHerrera.setUsuarioTwitter("false");
	    sebastianHerrera.setLatitud("4.603973772323143");
	    sebastianHerrera.setLongitud("-74.0691590309143");
	    sebastianHerrera.setNombreEstudio("Body art tattoo");
	    sebastianHerrera.setEmail("Joan178b@hotmail.com");
	    sebastianHerrera.setCiudad(bogota);
	    sebastianHerrera.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> sebastianHerreratrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista sebastianHerreraTrabajo1 =  new TrabajosArtista();
	   sebastianHerreraTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerrera1.jpg");
	   
	   TrabajosArtista sebastianHerreraTrabajo2 =  new TrabajosArtista();
	   sebastianHerreraTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerrera2.jpg");
	   
	   TrabajosArtista sebastianHerreraTrabajo3 =  new TrabajosArtista();
	   sebastianHerreraTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerrera3.jpg");
	   
	   TrabajosArtista sebastianHerreraTrabajo4 =  new TrabajosArtista();
	   sebastianHerreraTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerrera4.jpg");
	   
	   TrabajosArtista sebastianHerreraTrabajo5 =  new TrabajosArtista();
	   sebastianHerreraTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sebastianHerrera/sebastianHerrera5.jpg");
	   
	   sebastianHerreratrabajos.add(sebastianHerreraTrabajo1);
	   sebastianHerreratrabajos.add(sebastianHerreraTrabajo2);
	   sebastianHerreratrabajos.add(sebastianHerreraTrabajo3);
	   sebastianHerreratrabajos.add(sebastianHerreraTrabajo4);
	   sebastianHerreratrabajos.add(sebastianHerreraTrabajo5);
	   Collections.shuffle(sebastianHerreratrabajos);
	   
	   
	   sebastianHerrera.setTrabajosArtistas(sebastianHerreratrabajos);
	   //FIN SEBASTIAN HERRERA
	   
//INICIO NICOLAS VERA 204 nicolasVera
	   
	   Artista nicolasVera=  new 	Artista();
		nicolasVera.setDescripcion("Llevo 2 años como tatuador me gusta trabajar en todos los estilos de tatuaje pero los estilos que más me gusta trabajar son realismo(color y sombra) , y nueva escuela, procuro realizar mis propios diseños,  combinando estilos para que el cliente se lleve una pieza original y no una simple copia.");
		nicolasVera.setId("204");
		nicolasVera.setNombre("Nicolas vera");
		nicolasVera.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVeraPerfil.jpg");
	    nicolasVera.setFacebook("Nicolas vera");
	    nicolasVera.setUsuarioFacebook("nikolasvera1222");
	    nicolasVera.setCelular("+573112838356");
	    nicolasVera.setInstagram("nicolasveratattoos");
	    nicolasVera.setUsuarioInstagram("nicolasveratattoos");
	    nicolasVera.setDireccion("Carrera 13 número 63-21 oficina 204 2 piso"); 	
	    nicolasVera.setEspecialidad(nuevaEscuela);
	    nicolasVera.setTwitter("false");
	    nicolasVera.setUsuarioTwitter("false");
	    nicolasVera.setLatitud("4.649790330202592");
	    nicolasVera.setLongitud("-74.06349990516901");
	    nicolasVera.setNombreEstudio("Subterránea Lourdes ");
	    nicolasVera.setEmail("nico-skate10@hotmail.com");
	    nicolasVera.setCiudad(bogota);
	    nicolasVera.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> nicolasVeratrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista nicolasVeraTrabajo1 =  new TrabajosArtista();
	   nicolasVeraTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVera1.jpg");
	   
	   TrabajosArtista nicolasVeraTrabajo2 =  new TrabajosArtista();
	   nicolasVeraTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVera2.jpg");
	   
	   TrabajosArtista nicolasVeraTrabajo3 =  new TrabajosArtista();
	   nicolasVeraTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVera3.jpg");
	   
	   TrabajosArtista nicolasVeraTrabajo4 =  new TrabajosArtista();
	   nicolasVeraTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVera4.jpg");
	   
	   TrabajosArtista nicolasVeraTrabajo5 =  new TrabajosArtista();
	   nicolasVeraTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nicolasVera/nicolasVera5.jpg");
	   
	   nicolasVeratrabajos.add(nicolasVeraTrabajo1);
	   nicolasVeratrabajos.add(nicolasVeraTrabajo2);
	   nicolasVeratrabajos.add(nicolasVeraTrabajo3);
	   nicolasVeratrabajos.add(nicolasVeraTrabajo4);
	   nicolasVeratrabajos.add(nicolasVeraTrabajo5);
	   Collections.shuffle(nicolasVeratrabajos);
	   
	   
	   nicolasVera.setTrabajosArtistas(nicolasVeratrabajos);
	   //FIN NICOLAS VERA 204
	   
//INICIO sainy silva 207 
	   
	   Artista sainySilva=  new 	Artista();
		sainySilva.setDescripcion("Tatuadora empírica ya hace 3 años,  trabajo varios estilos, old school new school, tribal, céltico, Maori, caligrafías¡ obvio me considero una aprendiz aún, y muy abierta a él conocimiento que este campo me brinde a diario ya que es lo que amo hacer¡ claramente pensando en tener el nivel sería mi surgir.");
		sainySilva.setId("207");
		sainySilva.setNombre("Sainy silva");
		sainySilva.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilvaPerfil.jpg");
	    sainySilva.setFacebook("Sainy silva");
	    sainySilva.setUsuarioFacebook("yaya.sp.9");
	    sainySilva.setCelular("+573202869616");
	    sainySilva.setInstagram("false");
	    sainySilva.setUsuarioInstagram("false");
	    sainySilva.setDireccion("Calle 6 sur No. 71 D 61 "); 	
	    sainySilva.setEspecialidad(escritura);
	    sainySilva.setTwitter("false");
	    sainySilva.setUsuarioTwitter("false");
	    sainySilva.setLatitud("4.618728965718560");
	    sainySilva.setLongitud("-74.1382460296154");
	    sainySilva.setNombreEstudio("Sirrion studio");
	    sainySilva.setEmail("Linis1000000@hotmail.com");
	    sainySilva.setCiudad(bogota);
	    sainySilva.setVerificado("false");
	    
	   
		ArrayList<TrabajosArtista> sainySilvatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista sainySilvaTrabajo1 =  new TrabajosArtista();
	   sainySilvaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilva1.jpg");
	   
	   TrabajosArtista sainySilvaTrabajo2 =  new TrabajosArtista();
	   sainySilvaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilva2.jpg");
	   
	   TrabajosArtista sainySilvaTrabajo3 =  new TrabajosArtista();
	   sainySilvaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilva3.jpg");
	   
	   TrabajosArtista sainySilvaTrabajo4 =  new TrabajosArtista();
	   sainySilvaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilva4.jpg");
	   
	   TrabajosArtista sainySilvaTrabajo5 =  new TrabajosArtista();
	   sainySilvaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/sainySilva/sainySilva5.jpg");
	   
	   sainySilvatrabajos.add(sainySilvaTrabajo1);
	   sainySilvatrabajos.add(sainySilvaTrabajo2);
	   sainySilvatrabajos.add(sainySilvaTrabajo3);
	   sainySilvatrabajos.add(sainySilvaTrabajo4);
	   sainySilvatrabajos.add(sainySilvaTrabajo5);
	   Collections.shuffle(sainySilvatrabajos);
	   
	   
	   sainySilva.setTrabajosArtistas(sainySilvatrabajos);
	   //FIN sainy silva 207
	   
//INICIO DIEGO SOLARTE 208 diegoSolartediegoSolarte
	   
	   Artista diegoSolarte=  new 	Artista();
		diegoSolarte.setDescripcion("Me especializo en el estilo acuarela, full color. Ocho años de experiencia en el gremio. Trabajo en Bogotá. ");
		diegoSolarte.setId("208");
		diegoSolarte.setNombre("Diego solarte");
		diegoSolarte.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolartePerfil.jpg");
	    diegoSolarte.setFacebook("Diego solarte");
	    diegoSolarte.setUsuarioFacebook("HOMAHORVAT");
	    diegoSolarte.setCelular("+573012049823");
	    diegoSolarte.setInstagram("DIEGOSOLARTELLANOS");
	    diegoSolarte.setUsuarioInstagram("DIEGOSOLARTELLANOS");
	    diegoSolarte.setDireccion("Cra 11 #64-60"); 	
	    diegoSolarte.setEspecialidad(acuarela);
	    diegoSolarte.setTwitter("false");
	    diegoSolarte.setUsuarioTwitter("false");
	    diegoSolarte.setLatitud("4.651251331596414");
	    diegoSolarte.setLongitud("-74.06314551830292");
	    diegoSolarte.setNombreEstudio("CarpeDiem");
	    diegoSolarte.setEmail("diegosolartellanos@hotmail.com");
	    diegoSolarte.setCiudad(bogota);
	    diegoSolarte.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> diegoSolartetrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista diegoSolarteTrabajo1 =  new TrabajosArtista();
	   diegoSolarteTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolarte1.jpg");
	   
	   TrabajosArtista diegoSolarteTrabajo2 =  new TrabajosArtista();
	   diegoSolarteTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolarte2.jpg");
	   
	   TrabajosArtista diegoSolarteTrabajo3 =  new TrabajosArtista();
	   diegoSolarteTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolarte3.jpg");
	   
	   TrabajosArtista diegoSolarteTrabajo4 =  new TrabajosArtista();
	   diegoSolarteTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolarte4.jpg");
	   
	   TrabajosArtista diegoSolarteTrabajo5 =  new TrabajosArtista();
	   diegoSolarteTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/diegoSolarte/diegoSolarte5.jpg");
	   
	   diegoSolartetrabajos.add(diegoSolarteTrabajo1);
	   diegoSolartetrabajos.add(diegoSolarteTrabajo2);
	   diegoSolartetrabajos.add(diegoSolarteTrabajo3);
	   diegoSolartetrabajos.add(diegoSolarteTrabajo4);
	   diegoSolartetrabajos.add(diegoSolarteTrabajo5);
	   Collections.shuffle(diegoSolartetrabajos);
	   
	   
	   diegoSolarte.setTrabajosArtistas(diegoSolartetrabajos);
	   //FIN DIEGO SOLARTE 208
	   
	   //INICIO EVALO VALENCIA 210  evaloValenciaevaloValencia
	   
	   Artista evaloValencia=  new 	Artista();
		evaloValencia.setDescripcion("soy Evalo valencia tatuador procedente de Colombia " 
					+"estoy dedicado  al tatuaje 9 años,  LOS TEMAS QUE MAS  DISFRUTO  SON ANIMALES Y NATURALEZA, he ganado "
					+"10 premios  en mi carrera  6 internacionales y 4 nacionales.");
		evaloValencia.setId("210");
		evaloValencia.setNombre("Evalo valencia");
		evaloValencia.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValenciaPerfil.jpg");
	    evaloValencia.setFacebook("Evalo valencia");
	    evaloValencia.setUsuarioFacebook("evaloart");
	    evaloValencia.setCelular("+50768373202");
	    evaloValencia.setInstagram("evalotat2");	
	    evaloValencia.setUsuarioInstagram("evalotat2");
	    evaloValencia.setDireccion("calle 31 #29 07 Carmen de Viboral antioquia"); 	
	    evaloValencia.setEspecialidad(realismo);
	    evaloValencia.setTwitter("evalotat2");
	    evaloValencia.setUsuarioTwitter("evalotat2");
	    evaloValencia.setLatitud("6.084111226746145");
	    evaloValencia.setLongitud("-75.33447504043579");
	    evaloValencia.setNombreEstudio("Academia tatuajes");
	    evaloValencia.setEmail("evalotat2@gmail.com");
	    evaloValencia.setCiudad(medellin);
	    evaloValencia.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> evaloValenciatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista evaloValenciaTrabajo1 =  new TrabajosArtista();
	   evaloValenciaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValencia1.jpg");
	   
	   TrabajosArtista evaloValenciaTrabajo2 =  new TrabajosArtista();
	   evaloValenciaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValencia2.jpg");
	   
	   TrabajosArtista evaloValenciaTrabajo3 =  new TrabajosArtista();
	   evaloValenciaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValencia3.jpg");
	   
	   TrabajosArtista evaloValenciaTrabajo4 =  new TrabajosArtista();
	   evaloValenciaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValencia4.jpg");
	   
	   TrabajosArtista evaloValenciaTrabajo5 =  new TrabajosArtista();
	   evaloValenciaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/evaloValencia/evaloValencia5.jpg");
	   
	   evaloValenciatrabajos.add(evaloValenciaTrabajo1);
	   evaloValenciatrabajos.add(evaloValenciaTrabajo2);
	   evaloValenciatrabajos.add(evaloValenciaTrabajo3);
	   evaloValenciatrabajos.add(evaloValenciaTrabajo4);
	   evaloValenciatrabajos.add(evaloValenciaTrabajo5);
	   Collections.shuffle(evaloValenciatrabajos);
	   
	   
	   evaloValencia.setTrabajosArtistas(evaloValenciatrabajos);
	   //FIN EVALO VALENCIA 210
	   
   //INICIO MARCO BARRERA 211 marcoBarrera
	   
	   Artista marcoBarrera=  new 	Artista();
		marcoBarrera.setDescripcion("mi nombre es marco barrera , tengo un estudio de tatuaje hace casi "+
	   "6 años HAND MADE TATTOO. , llevo tatuando aproximadamente 15 años, he tatuado en diferentes "+
	   "tiendas de tatuajes  y por ende aprendido de muy buenos tatuadores, mi trabajo se basa en colores "+
	   "solidos y brillates, bloques de negro y buen manejo de linea, me especializo en tatuaje tradicional "+
	   "pero por mi trayectoria no solo tatuo este tipo de tatuaje sino tatuaje comercial, sombras y demas,"+
	   "cuento con instalaciones y equipos profesionales y buena disposicion para hacer que los clientes salgan "+
	   "a gusto y con ideas bien desarrolladas.");
		marcoBarrera.setId("211");
		marcoBarrera.setNombre("Marco barrera");
		marcoBarrera.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarreraPerfil.jpg");
	    marcoBarrera.setFacebook("Marco barrera");
	    marcoBarrera.setUsuarioFacebook("marcohandmadeta2");
	    marcoBarrera.setCelular("+573112843617");
	    marcoBarrera.setInstagram("marcohandmade");	
	    marcoBarrera.setUsuarioInstagram("marcohandmade");
	    marcoBarrera.setDireccion("calle 140 n 11- 58 centro comercial puerta del sol local 48"); 	
	    marcoBarrera.setEspecialidad(tradicional);
	    marcoBarrera.setTwitter("false");
	    marcoBarrera.setUsuarioTwitter("false");
	    marcoBarrera.setLatitud("4.719782642744481");
	    marcoBarrera.setLongitud("-74.03607130050659");
	    marcoBarrera.setNombreEstudio("Hand made tattoo");
	    marcoBarrera.setEmail("tatuajesvacanos@gmail.com");
	    marcoBarrera.setCiudad(bogota);
	    marcoBarrera.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> marcoBarreratrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista marcoBarreraTrabajo1 =  new TrabajosArtista();
	   marcoBarreraTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarrera1.jpg");
	   
	   TrabajosArtista marcoBarreraTrabajo2 =  new TrabajosArtista();
	   marcoBarreraTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarrera2.jpg");
	   
	   TrabajosArtista marcoBarreraTrabajo3 =  new TrabajosArtista();
	   marcoBarreraTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarrera3.jpg");
	   
	   TrabajosArtista marcoBarreraTrabajo4 =  new TrabajosArtista();
	   marcoBarreraTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarrera4.jpg");
	   
	   TrabajosArtista marcoBarreraTrabajo5 =  new TrabajosArtista();
	   marcoBarreraTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/marcoBarrera/marcoBarrera5.jpg");
	   
	   marcoBarreratrabajos.add(marcoBarreraTrabajo1);
	   marcoBarreratrabajos.add(marcoBarreraTrabajo2);
	   marcoBarreratrabajos.add(marcoBarreraTrabajo3);
	   marcoBarreratrabajos.add(marcoBarreraTrabajo4);
	   marcoBarreratrabajos.add(marcoBarreraTrabajo5);
	   Collections.shuffle(marcoBarreratrabajos);
	   
	   
	   marcoBarrera.setTrabajosArtistas(marcoBarreratrabajos);
	   //FIN MARCO BARERA 211
	   
  //INICIO IRON FONTECHA 212 
	   
	   Artista ironFontecha=  new 	Artista();
		ironFontecha.setDescripcion("Tattoo artist Bogotá recibo citas en subterránea tattoo zona rosa para otras ciudades en fechas de convenciones ");
		ironFontecha.setId("212");
		ironFontecha.setNombre("Fontecha iron");
		ironFontecha.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontechaPefil.jpg");
	    ironFontecha.setFacebook("Fontecha iron");
	    ironFontecha.setUsuarioFacebook("gerson.fontecha");
	    ironFontecha.setCelular("+573044670442");
	    ironFontecha.setInstagram("fontecha_iron");	
	    ironFontecha.setUsuarioInstagram("fontecha_iron");
	    ironFontecha.setDireccion("Cr 14 N 83-64"); 	
	    ironFontecha.setEspecialidad(neotradicional);
	    ironFontecha.setTwitter("false");
	    ironFontecha.setUsuarioTwitter("false");
	    ironFontecha.setLatitud("4.668924797006963");
	    ironFontecha.setLongitud("-74.05520483851433");
	    ironFontecha.setNombreEstudio("Subterránea tattoo zona rosa");
	    ironFontecha.setEmail("Fontechairon@gmail.com");
	    ironFontecha.setCiudad(bogota);
	    ironFontecha.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> ironFontechatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista ironFontechaTrabajo1 =  new TrabajosArtista();
	   ironFontechaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontecha1.jpg");
	   
	   TrabajosArtista ironFontechaTrabajo2 =  new TrabajosArtista();
	   ironFontechaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontecha2.jpg");
	   
	   TrabajosArtista ironFontechaTrabajo3 =  new TrabajosArtista();
	   ironFontechaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontecha3.jpg");
	   
	   TrabajosArtista ironFontechaTrabajo4 =  new TrabajosArtista();
	   ironFontechaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontecha4.jpg");
	   
	   TrabajosArtista ironFontechaTrabajo5 =  new TrabajosArtista();
	   ironFontechaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/ironFontecha/ironFontecha5.jpg");
	   
	   ironFontechatrabajos.add(ironFontechaTrabajo1);
	   ironFontechatrabajos.add(ironFontechaTrabajo2);
	   ironFontechatrabajos.add(ironFontechaTrabajo3);
	   ironFontechatrabajos.add(ironFontechaTrabajo4);
	   ironFontechatrabajos.add(ironFontechaTrabajo5);
	   Collections.shuffle(ironFontechatrabajos);
	   
	   
	   ironFontecha.setTrabajosArtistas(ironFontechatrabajos);
	   //FIN IRON FONTECHA 212
	   
	   //INICIO DROPS 19 213  dropsDiecinuevedropsDiecinueve
	   
	   Artista dropsDiecinueve=  new 	Artista();
		dropsDiecinueve.setDescripcion("CUSTOM TATTOOS");
		dropsDiecinueve.setId("213");
		dropsDiecinueve.setNombre("Drops diecinueve");
		dropsDiecinueve.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops19Perfil.jpg");
	    dropsDiecinueve.setFacebook("Drops diecinueve");
	    dropsDiecinueve.setUsuarioFacebook("drops19");
	    dropsDiecinueve.setCelular("+573163792393");
	    dropsDiecinueve.setInstagram("DROPS19");	
	    dropsDiecinueve.setUsuarioInstagram("DROPS19");
	    dropsDiecinueve.setDireccion("calle 140 n 11- 58 centro comercial puerta del sol local 48"); 	
	    dropsDiecinueve.setEspecialidad(tradicional);
	    dropsDiecinueve.setTwitter("false");
	    dropsDiecinueve.setUsuarioTwitter("false");
	    dropsDiecinueve.setLatitud("4.719782642744481");
	    dropsDiecinueve.setLongitud("-74.03607130050659");
	    dropsDiecinueve.setNombreEstudio("HAND  MADE TATTOO");
	    dropsDiecinueve.setEmail("TATTOOSBYDROPS19@GMAIL.COM");
	    dropsDiecinueve.setCiudad(bogota);
	    dropsDiecinueve.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> dropsDiecinuevetrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista dropsDiecinueveTrabajo1 =  new TrabajosArtista();
	   dropsDiecinueveTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops191.jpg");
	   
	   TrabajosArtista dropsDiecinueveTrabajo2 =  new TrabajosArtista();
	   dropsDiecinueveTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops192.jpg");
	   
	   TrabajosArtista dropsDiecinueveTrabajo3 =  new TrabajosArtista();
	   dropsDiecinueveTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops193.jpg");
	   
	   TrabajosArtista dropsDiecinueveTrabajo4 =  new TrabajosArtista();
	   dropsDiecinueveTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops194.jpg");
	   
	   TrabajosArtista dropsDiecinueveTrabajo5 =  new TrabajosArtista();
	   dropsDiecinueveTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/dropsDiecinueve/drops195.jpg");
	   
	   dropsDiecinuevetrabajos.add(dropsDiecinueveTrabajo1);
	   dropsDiecinuevetrabajos.add(dropsDiecinueveTrabajo2);
	   dropsDiecinuevetrabajos.add(dropsDiecinueveTrabajo3);
	   dropsDiecinuevetrabajos.add(dropsDiecinueveTrabajo4);
	   dropsDiecinuevetrabajos.add(dropsDiecinueveTrabajo5);
	   Collections.shuffle(dropsDiecinuevetrabajos);
	   
	   
	   dropsDiecinueve.setTrabajosArtistas(dropsDiecinuevetrabajos);
	   //FIN DROPS 19 213
	   
 //INICIO jorge carpediem 209 jorgeCarpediem
	   
	   Artista jorgeCarpediem=  new 	Artista();
		jorgeCarpediem.setDescripcion("22 años de experiencia. domino varios estilos, principalmente la caligrafía, realismo en grises y oriental tradicional.");
		jorgeCarpediem.setId("209");
		jorgeCarpediem.setNombre("Jorge carpediem");
		jorgeCarpediem.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediemPerfil.jpg");
	    jorgeCarpediem.setFacebook("Jorge carpediem");
	    jorgeCarpediem.setUsuarioFacebook("carpediembogota");
	    jorgeCarpediem.setCelular("+573123631712");
	    jorgeCarpediem.setInstagram("jorgecarpediem");	
	    jorgeCarpediem.setUsuarioInstagram("jorgecarpediem");
	    jorgeCarpediem.setDireccion("Carrera 11 No. 64-60"); 	
	    jorgeCarpediem.setEspecialidad(estiloLibre);
	    jorgeCarpediem.setTwitter("false");
	    jorgeCarpediem.setUsuarioTwitter("false");
	    jorgeCarpediem.setLatitud("4.651251331596414");
	    jorgeCarpediem.setLongitud("-74.06314551830292");
	    jorgeCarpediem.setNombreEstudio("CarpediemTattoo");
	    jorgeCarpediem.setEmail("Jorgeivantattoo@hotmail.es");
	    jorgeCarpediem.setCiudad(bogota);
	    jorgeCarpediem.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> jorgeCarpediemtrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista jorgeCarpediemTrabajo1 =  new TrabajosArtista();
	   jorgeCarpediemTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediem1.jpg");
	   
	   TrabajosArtista jorgeCarpediemTrabajo2 =  new TrabajosArtista();
	   jorgeCarpediemTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediem2.jpg");
	   
	   TrabajosArtista jorgeCarpediemTrabajo3 =  new TrabajosArtista();
	   jorgeCarpediemTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediem3.jpg");
	   
	   TrabajosArtista jorgeCarpediemTrabajo4 =  new TrabajosArtista();
	   jorgeCarpediemTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediem4.jpg");
	   
	   TrabajosArtista jorgeCarpediemTrabajo5 =  new TrabajosArtista();
	   jorgeCarpediemTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/jorgeCarpediem/jorgeCarpediem5.jpg");
	   
	   jorgeCarpediemtrabajos.add(jorgeCarpediemTrabajo1);
	   jorgeCarpediemtrabajos.add(jorgeCarpediemTrabajo2);
	   jorgeCarpediemtrabajos.add(jorgeCarpediemTrabajo3);
	   jorgeCarpediemtrabajos.add(jorgeCarpediemTrabajo4);
	   jorgeCarpediemtrabajos.add(jorgeCarpediemTrabajo5);
	   Collections.shuffle(jorgeCarpediemtrabajos);
	   
	   
	   jorgeCarpediem.setTrabajosArtistas(jorgeCarpediemtrabajos);
	   //FIN jorge carpediem 209
	   
	   
 //INICIO badu 218  badu
	   
	   Artista badu=  new 	Artista();
		badu.setDescripcion("Tengo 6 años de experiencia en el mundo del tatuaje y he forjado mi carrera mezclando un poco del estilo Black & Grey,vieja escuela y nueva escuela ,independientemente del estilo le doy mucha importancia a aspectos básicos como bioseguridad y prestarle un servicio amable a los clientes tratando de asesorarlos para así lograr el mejor resultado en sus ideas.");
		badu.setId("218");
		badu.setNombre("Badu");
		badu.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/baduPerfil.jpg");
	    badu.setFacebook("Jairo andres romero");
	    badu.setUsuarioFacebook("jairoandresromerovillamizar");
	    badu.setCelular("+573017014846");
	    badu.setInstagram("baduta2");	
	    badu.setUsuarioInstagram("baduta2");
	    badu.setDireccion("calle 140#11-48 "); 	
	    badu.setEspecialidad(nuevaEscuela);
	    badu.setTwitter("false");
	    badu.setUsuarioTwitter("false");
	    badu.setLatitud("4.719782642744481");
	    badu.setLongitud("-74.03607130050659");
	    badu.setNombreEstudio("HAND  MADE TATTOO");
	    badu.setEmail("baduhustla@gmail.com");
	    badu.setCiudad(bogota);
	    badu.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> badutrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista baduTrabajo1 =  new TrabajosArtista();
	   baduTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/badu1.jpg");
	   
	   TrabajosArtista baduTrabajo2 =  new TrabajosArtista();
	   baduTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/badu2.jpg");
	   
	   TrabajosArtista baduTrabajo3 =  new TrabajosArtista();
	   baduTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/badu3.jpg");
	   
	   TrabajosArtista baduTrabajo4 =  new TrabajosArtista();
	   baduTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/badu4.jpg");
	   
	   TrabajosArtista baduTrabajo5 =  new TrabajosArtista();
	   baduTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/badu/badu5.jpg");
	   
	   badutrabajos.add(baduTrabajo1);
	   badutrabajos.add(baduTrabajo2);
	   badutrabajos.add(baduTrabajo3);
	   badutrabajos.add(baduTrabajo4);
	   badutrabajos.add(baduTrabajo5);
	   Collections.shuffle(badutrabajos);
	   
	   
	   badu.setTrabajosArtistas(badutrabajos);
	   //FIN  badu 218
//INICIO rago 219 rago
	   
	   Artista rago=  new 	Artista();
		rago.setDescripcion("Artista plástico formado en U. El Bosque, Dos años de experiencia Tatuando, aprendizaje empírico, entusiasta y amante a los retos, dibujante hace 10 años, integro y respetuoso, aprendiendo día a día y sobre todo amante de mi trabajo como artista tatuador ");
		rago.setId("219");
		rago.setNombre("Rago");
		rago.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzalesPerfil.jpg");
	    rago.setFacebook("Armando gonzales");
	    rago.setUsuarioFacebook("Rago.Arttattoo");
	    rago.setCelular("+573102233410");
	    rago.setInstagram("rago_art_tattoo");	
	    rago.setUsuarioInstagram("rago_art_tattoo");
	    rago.setDireccion("calle 61a #77-22 sur  "); 	
	    rago.setEspecialidad(realismo);
	    rago.setTwitter("false");
	    rago.setUsuarioTwitter("false");
	    rago.setLatitud("4.591653927230176");
	    rago.setLongitud("-74.17299270629883");
	    rago.setNombreEstudio("Rago art tattoo ");
	    rago.setEmail("carlos_tremente@hotmail.com");
	    rago.setCiudad(bogota);
	    rago.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> ragotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista ragoTrabajo1 =  new TrabajosArtista();
	   ragoTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzales1.jpg");
	   
	   TrabajosArtista ragoTrabajo2 =  new TrabajosArtista();
	   ragoTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzales2.jpg");
	   
	   TrabajosArtista ragoTrabajo3 =  new TrabajosArtista();
	   ragoTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzales3.jpg");
	   
	   TrabajosArtista ragoTrabajo4 =  new TrabajosArtista();
	   ragoTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzales4.jpg");
	   
	   TrabajosArtista ragoTrabajo5 =  new TrabajosArtista();
	   ragoTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/rago/armandoGonzales5.jpg");
	   
	   ragotrabajos.add(ragoTrabajo1);
	   ragotrabajos.add(ragoTrabajo2);
	   ragotrabajos.add(ragoTrabajo3);
	   ragotrabajos.add(ragoTrabajo4);
	   ragotrabajos.add(ragoTrabajo5);
	   Collections.shuffle(ragotrabajos);
	   
	   
	   rago.setTrabajosArtistas(ragotrabajos);
	   //FIN  rago 219
	   
//INICIO charlye osorio 215  charlyeOsorio
	   
	   Artista charlyeOsorio=  new 	Artista();
		charlyeOsorio.setDescripcion("Tatuador hace 7 años de la ciudad de Bogotá mis especialidades: color, dotwork, oriental,  neotradicional y vieja escuela");
		charlyeOsorio.setId("215");
		charlyeOsorio.setNombre("Charlye osorio");
		charlyeOsorio.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorioPerfil.jpg");
	    charlyeOsorio.setFacebook("Charlye osorio");
	    charlyeOsorio.setUsuarioFacebook("charlye.tattoo");
	    charlyeOsorio.setCelular("+573044699371");
	    charlyeOsorio.setInstagram("lyeosorio");	
	    charlyeOsorio.setUsuarioInstagram("lyeosorio");
	    charlyeOsorio.setDireccion("Cra 13 #60 - 75 "); 	
	    charlyeOsorio.setEspecialidad(neotradicional);
	    charlyeOsorio.setTwitter("false");
	    charlyeOsorio.setUsuarioTwitter("false");
	    charlyeOsorio.setLatitud("4.647625");
	    charlyeOsorio.setLongitud("-74.06385419999990");
	    charlyeOsorio.setNombreEstudio("Trece chiros store ");
	    charlyeOsorio.setEmail("Lyeosorio@gmail.com");
	    charlyeOsorio.setCiudad(bogota);
	    charlyeOsorio.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> charlyeOsoriotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista charlyeOsorioTrabajo1 =  new TrabajosArtista();
	   charlyeOsorioTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorio1.jpg");
	   
	   TrabajosArtista charlyeOsorioTrabajo2 =  new TrabajosArtista();
	   charlyeOsorioTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorio2.jpg");
	   
	   TrabajosArtista charlyeOsorioTrabajo3 =  new TrabajosArtista();
	   charlyeOsorioTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorio3.jpg");
	   
	   TrabajosArtista charlyeOsorioTrabajo4 =  new TrabajosArtista();
	   charlyeOsorioTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorio4.jpg");
	   
	   TrabajosArtista charlyeOsorioTrabajo5 =  new TrabajosArtista();
	   charlyeOsorioTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/charlyeOsorio/charlyeOsorio5.jpg");
	   
	   charlyeOsoriotrabajos.add(charlyeOsorioTrabajo1);
	   charlyeOsoriotrabajos.add(charlyeOsorioTrabajo2);
	   charlyeOsoriotrabajos.add(charlyeOsorioTrabajo3);
	   charlyeOsoriotrabajos.add(charlyeOsorioTrabajo4);
	   charlyeOsoriotrabajos.add(charlyeOsorioTrabajo5);
	   Collections.shuffle(charlyeOsoriotrabajos);
	   
	   
	   charlyeOsorio.setTrabajosArtistas(charlyeOsoriotrabajos);
	   //FIN  charlye osorio 215
	   
//INICIO Andres perez 220 andresPerezandresPerez
	   
	   Artista andresPerez=  new 	Artista();
		andresPerez.setDescripcion("14 años de trayectoria con 4 premios internacionales ( 2 en venezuela, 1 en peru y uno en ecuador) 2 premios nacionales (uno en pereira y uno en cali). ");
		andresPerez.setId("220");
		andresPerez.setNombre("Andres perez");
		andresPerez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerezPerfil.jpg");
	    andresPerez.setFacebook("Andres perez");
	    andresPerez.setUsuarioFacebook("andres.perez.90281");
	    andresPerez.setCelular("+573186233367");
	    andresPerez.setInstagram("andresperezanubisart");	
	    andresPerez.setUsuarioInstagram("andresperezanubisart");
	    andresPerez.setDireccion("calle 5 # 5 - 40 Barrio San Antonio, Cali - valle"); 	
	    andresPerez.setEspecialidad(arteJapones);
	    andresPerez.setTwitter("false");
	    andresPerez.setUsuarioTwitter("false");
	    andresPerez.setLatitud("3.4486259967844606");
	    andresPerez.setLongitud("-76.537064909935");
	    andresPerez.setNombreEstudio("Anubis Art Tattoo");
	    andresPerez.setEmail("sanfa84@hotmail.com");
	    andresPerez.setCiudad(cali);
	    andresPerez.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> andresPereztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista andresPerezTrabajo1 =  new TrabajosArtista();
	   andresPerezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerez1.jpg");
	   
	   TrabajosArtista andresPerezTrabajo2 =  new TrabajosArtista();
	   andresPerezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerez2.jpg");
	   
	   TrabajosArtista andresPerezTrabajo3 =  new TrabajosArtista();
	   andresPerezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerez3.jpg");
	   
	   TrabajosArtista andresPerezTrabajo4 =  new TrabajosArtista();
	   andresPerezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerez4.jpg");
	   
	   TrabajosArtista andresPerezTrabajo5 =  new TrabajosArtista();
	   andresPerezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/andresPerez/andresPerez5.jpg");
	   
	   andresPereztrabajos.add(andresPerezTrabajo1);
	   andresPereztrabajos.add(andresPerezTrabajo2);
	   andresPereztrabajos.add(andresPerezTrabajo3);
	   andresPereztrabajos.add(andresPerezTrabajo4);
	   andresPereztrabajos.add(andresPerezTrabajo5);
	   Collections.shuffle(andresPereztrabajos);
	   
	   
	   andresPerez.setTrabajosArtistas(andresPereztrabajos);
	   //FIN andres prez 220
	   
	   
//INICIO santiago kaozink 220 santiagoKaozink
	   
	   Artista santiagoKaoz=  new 	Artista();
		santiagoKaoz.setDescripcion("Tengo 2 años de experiencia tatuando profesionalmente y 1 año como perforador. Me reconocen por mis trabajos a color, es en lo que mejor me desempeño pero con gusto realizo cualquier otro tipo de estilo de tatuaje. ");
		santiagoKaoz.setId("221");
		santiagoKaoz.setNombre("Santiago kaozink");
		santiagoKaoz.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozinkPerfil.jpg");
	    santiagoKaoz.setFacebook("KTS Tattoo");
	    santiagoKaoz.setUsuarioFacebook("kaozinktattoostudio");
	    santiagoKaoz.setCelular("+573142926901");
	    santiagoKaoz.setInstagram("santiagokaozink");	
	    santiagoKaoz.setUsuarioInstagram("santiagokaozink");
	    santiagoKaoz.setDireccion("Carrera 77a # 64c31"); 	
	    santiagoKaoz.setEspecialidad(neotradicional);
	    santiagoKaoz.setTwitter("false");
	    santiagoKaoz.setUsuarioTwitter("false");
	    santiagoKaoz.setLatitud("4.680485");
	    santiagoKaoz.setLongitud("-74.077858");
	    santiagoKaoz.setNombreEstudio("KTS Tattoo");
	    santiagoKaoz.setEmail("santiago_marquezg19@hotmail.com");
	    santiagoKaoz.setCiudad(bogota);
	    santiagoKaoz.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> santiagoKaozinktrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista santiagoKaozinkTrabajo1 =  new TrabajosArtista();
	   santiagoKaozinkTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozink1.jpg");
	   
	   TrabajosArtista santiagoKaozinkTrabajo2 =  new TrabajosArtista();
	   santiagoKaozinkTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozink2.jpg");
	   
	   TrabajosArtista santiagoKaozinkTrabajo3 =  new TrabajosArtista();
	   santiagoKaozinkTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozink3.jpg");
	   
	   TrabajosArtista santiagoKaozinkTrabajo4 =  new TrabajosArtista();
	   santiagoKaozinkTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozink4.jpg");
	   
	   TrabajosArtista santiagoKaozinkTrabajo5 =  new TrabajosArtista();
	   santiagoKaozinkTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/santiagoKaozink/santiagoKaozink5.jpg");
	   
	   santiagoKaozinktrabajos.add(santiagoKaozinkTrabajo1);
	   santiagoKaozinktrabajos.add(santiagoKaozinkTrabajo2);
	   santiagoKaozinktrabajos.add(santiagoKaozinkTrabajo3);
	   santiagoKaozinktrabajos.add(santiagoKaozinkTrabajo4);
	   santiagoKaozinktrabajos.add(santiagoKaozinkTrabajo5);
	   Collections.shuffle(santiagoKaozinktrabajos);
	   
	   
	   santiagoKaoz.setTrabajosArtistas(santiagoKaozinktrabajos);
	   //FIN SANTIAGO KAOSINK 220
	   
//INICIO  johnny asgard 206 johnnyAsgard
	   
	   Artista johnnyAsgard=  new 	Artista();
		johnnyAsgard.setDescripcion("Tatuador y dueño de la marca Asgard Stencil Gel de la ciudad de Medellín desde  hace más de 8 años, desarrollando estilos propios y manejando también varios estilos del tatuaje como el Realismo, el Neo tradicional, la vieja escuela, oriental tradicional y fusion.");
		johnnyAsgard.setId("206");
		johnnyAsgard.setNombre("Jhonny henao asgard");
		johnnyAsgard.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgardPerfil.jpg");
	    johnnyAsgard.setFacebook("Johnny henao asgard");
	    johnnyAsgard.setUsuarioFacebook("ASGARDSTUDIO");
	    johnnyAsgard.setCelular("+573168804003");
	    johnnyAsgard.setInstagram("ASGARDSTENCIL");	
	    johnnyAsgard.setUsuarioInstagram("ASGARDSTENCIL");
	    johnnyAsgard.setDireccion("Calle 11 # 55-52 int 502"); 	
	    johnnyAsgard.setEspecialidad(arteJapones);
	    johnnyAsgard.setTwitter("false");
	    johnnyAsgard.setUsuarioTwitter("false");
	    johnnyAsgard.setLatitud("3.4070779458634886");
	    johnnyAsgard.setLongitud("-76.53855085372925");
	    johnnyAsgard.setNombreEstudio("Asgard tattoo");
	    johnnyAsgard.setEmail("Johnnyal74@hotmail.com");
	    johnnyAsgard.setCiudad(cali);
	    johnnyAsgard.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> johnnyAsgardtrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista johnnyAsgardTrabajo1 =  new TrabajosArtista();
	   johnnyAsgardTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgard1.jpg");
	   
	   TrabajosArtista johnnyAsgardTrabajo2 =  new TrabajosArtista();
	   johnnyAsgardTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgard2.jpg");
	   
	   TrabajosArtista johnnyAsgardTrabajo3 =  new TrabajosArtista();
	   johnnyAsgardTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgard3.jpg");
	   
	   TrabajosArtista johnnyAsgardTrabajo4 =  new TrabajosArtista();
	   johnnyAsgardTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgard4.jpg");
	   
	   TrabajosArtista johnnyAsgardTrabajo5 =  new TrabajosArtista();
	   johnnyAsgardTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/johnnyAsgard/johnnyAsgard5.jpg");
	   
	   johnnyAsgardtrabajos.add(johnnyAsgardTrabajo1);
	   johnnyAsgardtrabajos.add(johnnyAsgardTrabajo2);
	   johnnyAsgardtrabajos.add(johnnyAsgardTrabajo3);
	   johnnyAsgardtrabajos.add(johnnyAsgardTrabajo4);
	   johnnyAsgardtrabajos.add(johnnyAsgardTrabajo5);
	   Collections.shuffle(johnnyAsgardtrabajos);
	   
	   
	   johnnyAsgard.setTrabajosArtistas(johnnyAsgardtrabajos);
	   //FIN SANTIAGO KAOSINK 220
	   
	   
//INICIO  JAVIER MARTINEZ 226 javierMartinez
	   
	   Artista javierMartinez=  new 	Artista();
		javierMartinez.setDescripcion("Llevo 4 años como artista en el arte del tatuaje, siempre en un constante aprendizaje,"+
        ",muy autocrítico, "+
        "he ganado varios premios en diferentes eventos a los que he asistido a nivel nacional,"+
        "me enfoco más en realismo black and gray y watercolor "+
        "aunque el artista del tatuaje debe ser completo. ");
		javierMartinez.setId("226");
		javierMartinez.setNombre("Javier martinez");
		javierMartinez.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinezPerfil.jpg");
	    javierMartinez.setFacebook("Javier martinez");
	    javierMartinez.setUsuarioFacebook("javimartin1980");
	    javierMartinez.setCelular("+573132288044");
	    javierMartinez.setInstagram("JAVIER_MARTINEZ_TATTOO");	
	    javierMartinez.setUsuarioInstagram("JAVIER_MARTINEZ_TATTOO");
	    javierMartinez.setDireccion("Calle 13 Número 5 - 97 local 105a Cc Tequendama Plaza. Soacha - Centro."); 	
	    javierMartinez.setEspecialidad(realismo);
	    javierMartinez.setTwitter("false");
	    javierMartinez.setUsuarioTwitter("false");
	    javierMartinez.setLatitud("4.581656000000001");
	    javierMartinez.setLongitud("-74.21938290000003");
	    javierMartinez.setNombreEstudio("tattoo studio soacha");
	    javierMartinez.setEmail("javimartin1980@hotmail.com");
	    javierMartinez.setCiudad(soacha);
	    javierMartinez.setVerificado("false");
	    
	    
	   
		ArrayList<TrabajosArtista> javierMartineztrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista javierMartinezTrabajo1 =  new TrabajosArtista();
	   javierMartinezTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinez1.jpg");
	   
	   TrabajosArtista javierMartinezTrabajo2 =  new TrabajosArtista();
	   javierMartinezTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinez2.jpg");
	   
	   TrabajosArtista javierMartinezTrabajo3 =  new TrabajosArtista();
	   javierMartinezTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinez3.jpg");
	   
	   TrabajosArtista javierMartinezTrabajo4 =  new TrabajosArtista();
	   javierMartinezTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinez4.jpg");
	   
	   TrabajosArtista javierMartinezTrabajo5 =  new TrabajosArtista();
	   javierMartinezTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/javierMartinez/javierMartinez5.jpg");
	   
	   javierMartineztrabajos.add(javierMartinezTrabajo1);
	   javierMartineztrabajos.add(javierMartinezTrabajo2);
	   javierMartineztrabajos.add(javierMartinezTrabajo3);
	   javierMartineztrabajos.add(javierMartinezTrabajo4);
	   javierMartineztrabajos.add(javierMartinezTrabajo5);
	   Collections.shuffle(javierMartineztrabajos);
	   
	   
	   javierMartinez.setTrabajosArtistas(javierMartineztrabajos);
	   //FIN JAVIER MARTINEZ 226
	   
//INICIO  cristhian cassiani 227 cristhianCassiani
	   
	   Artista cristhianCassiani=  new 	Artista();
		cristhianCassiani.setDescripcion("Inicié mi oficio en el mundo del tatuaje hace 4 años, tras finalizar mis estudios. He tenido la fortuna de construir mi carrera de tatuador al lado de grandes artistas y de grandes personas. He trabajado en Bogotá, en Medellín y actualmente en mi estudio en Sopó ( Cund.) Me he inclinado por el estilo en color, especialmente el estilo Neo Tradicional, sin dejar a un lado el tatuaje comercial. Estoy siempre dispuesto a brindar el mejor servicio y a hacer del tatuaje una conexión interpersonal e indestructible.");
		cristhianCassiani.setId("227");
		cristhianCassiani.setNombre("Cristhian cassiani");
		cristhianCassiani.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassianiPerfil.jpg");
	    cristhianCassiani.setFacebook("Cristhian cassiani");
	    cristhianCassiani.setUsuarioFacebook("cristhian.cano.507");
	    cristhianCassiani.setCelular("+573194199569");
	    cristhianCassiani.setInstagram("Cristhiancassiani");	
	    cristhianCassiani.setUsuarioInstagram("Cristhiancassiani");
	    cristhianCassiani.setDireccion("Cr4 # 3 a 20"); 	
	    cristhianCassiani.setEspecialidad(neotradicional);
	    cristhianCassiani.setTwitter("false");
	    cristhianCassiani.setUsuarioTwitter("false");
	    cristhianCassiani.setLatitud("4.908960836057547");
	    cristhianCassiani.setLongitud("-73.94150599837303");
	    cristhianCassiani.setNombreEstudio("Madre Santa Tattoo");
	    cristhianCassiani.setEmail("Kanoc3@gmail.com");
	    cristhianCassiani.setCiudad(sopo);
	    cristhianCassiani.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> cristhianCassianitrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista cristhianCassianiTrabajo1 =  new TrabajosArtista();
	   cristhianCassianiTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassiani1.jpg");
	   
	   TrabajosArtista cristhianCassianiTrabajo2 =  new TrabajosArtista();
	   cristhianCassianiTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassiani2.jpg");
	   
	   TrabajosArtista cristhianCassianiTrabajo3 =  new TrabajosArtista();
	   cristhianCassianiTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassiani3.jpg");
	   
	   TrabajosArtista cristhianCassianiTrabajo4 =  new TrabajosArtista();
	   cristhianCassianiTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassiani4.jpg");
	   
	   TrabajosArtista cristhianCassianiTrabajo5 =  new TrabajosArtista();
	   cristhianCassianiTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/cristhianCassiani/cristhianCassiani5.jpg");
	   
	   cristhianCassianitrabajos.add(cristhianCassianiTrabajo1);
	   cristhianCassianitrabajos.add(cristhianCassianiTrabajo2);
	   cristhianCassianitrabajos.add(cristhianCassianiTrabajo3);
	   cristhianCassianitrabajos.add(cristhianCassianiTrabajo4);
	   cristhianCassianitrabajos.add(cristhianCassianiTrabajo5);
	   Collections.shuffle(cristhianCassianitrabajos);
	   
	   
	   cristhianCassiani.setTrabajosArtistas(cristhianCassianitrabajos);
	   //FIN Cristhian cassiani  227
	   
	   
//INICIO  AIORI ART aioriArt
	   
	   Artista aioriArt=  new 	Artista();
		aioriArt.setDescripcion("5 años de experiencia me gusta el neo tradicional new school y old school,nuestro local queda ubicado en Bosa Santafe ven y conoce nuestro trabajo y poder hacerte Arte en la piel.5 años de experiencia me gusta el neo tradicional new school y old school,nuestro local queda ubicado en Bosa Santafe ven y conoce nuestro trabajo y poder hacerte Arte en la piel.");
		aioriArt.setId("222");
		aioriArt.setNombre("Aiori Art");
		aioriArt.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArtPerfil.jpg");
	    aioriArt.setFacebook("Aiori Art");
	    aioriArt.setUsuarioFacebook("Aiori.Art.Tattoo.");
	    aioriArt.setCelular("+573016268648");
	    aioriArt.setInstagram("false");	
	    aioriArt.setUsuarioInstagram("false");
	    aioriArt.setDireccion("Calle 56fsur 98d27 piso 2"); 	
	    aioriArt.setEspecialidad(nuevaEscuela);
	    aioriArt.setTwitter("false");
	    aioriArt.setUsuarioTwitter("false");
	    aioriArt.setLatitud("4.638600803758752");
	    aioriArt.setLongitud("-74.19378519058228");
	    aioriArt.setNombreEstudio("Samurai art");
	    aioriArt.setEmail("Samurai_art@outlook.com");
	    aioriArt.setCiudad(bogota);
	    aioriArt.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> aioriArttrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista aioriArtTrabajo1 =  new TrabajosArtista();
	   aioriArtTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArt1.jpg");
	   
	   TrabajosArtista aioriArtTrabajo2 =  new TrabajosArtista();
	   aioriArtTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArt2.jpg");
	   
	   TrabajosArtista aioriArtTrabajo3 =  new TrabajosArtista();
	   aioriArtTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArt3.jpg");
	   
	   TrabajosArtista aioriArtTrabajo4 =  new TrabajosArtista();
	   aioriArtTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArt4.jpg");
	   
	   TrabajosArtista aioriArtTrabajo5 =  new TrabajosArtista();
	   aioriArtTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/aioriArt/aioriArt5.jpg");
	   
	   aioriArttrabajos.add(aioriArtTrabajo1);
	   aioriArttrabajos.add(aioriArtTrabajo2);
	   aioriArttrabajos.add(aioriArtTrabajo3);
	   aioriArttrabajos.add(aioriArtTrabajo4);
	   aioriArttrabajos.add(aioriArtTrabajo5);
	   Collections.shuffle(aioriArttrabajos);
	   
	   
	   aioriArt.setTrabajosArtistas(aioriArttrabajos);
	   //FIN AIORI ART  222
	   
//INICIO  NESTOR PALACIOS  228  nestorPalaciosnestorPalacios
	   
	   Artista nestorPalacios=  new 	Artista();
		nestorPalacios.setDescripcion("Tatuador con 20 años de experiencia y ganador de diferentes premios dentro y fuera del país.");
		nestorPalacios.setId("228");
		nestorPalacios.setNombre("Néstor palacios");
		nestorPalacios.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalaciosPerfil.jpg");
	    nestorPalacios.setFacebook("Néstor palacios");
	    nestorPalacios.setUsuarioFacebook("nestor.palacios.3762");
	    nestorPalacios.setCelular("+573123694240");
	    nestorPalacios.setInstagram("Nestorpalaciostattoo");	
	    nestorPalacios.setUsuarioInstagram("Nestorpalaciostattoo");
	    nestorPalacios.setDireccion("Calle 63 17-45 "); 	
	    nestorPalacios.setEspecialidad(realismo);
	    nestorPalacios.setTwitter("false");
	    nestorPalacios.setUsuarioTwitter("false");
	    nestorPalacios.setLatitud("4.650267528612326");
	    nestorPalacios.setLongitud("-74.06909465789795");
	    nestorPalacios.setNombreEstudio("Dermoline Tattoo Studio");
	    nestorPalacios.setEmail("dermolinetm@hotmail.com");
	    nestorPalacios.setCiudad(bogota);
	    nestorPalacios.setVerificado("true");
	    
	    
	   
	   ArrayList<TrabajosArtista> nestorPalaciostrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista nestorPalaciosTrabajo1 =  new TrabajosArtista();
	   nestorPalaciosTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalacios1.jpg");
	   
	   TrabajosArtista nestorPalaciosTrabajo2 =  new TrabajosArtista();
	   nestorPalaciosTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalacios2.jpg");
	   
	   TrabajosArtista nestorPalaciosTrabajo3 =  new TrabajosArtista();
	   nestorPalaciosTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalacios3.jpg");
	   
	   TrabajosArtista nestorPalaciosTrabajo4 =  new TrabajosArtista();
	   nestorPalaciosTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalacios4.jpg");
	   
	   TrabajosArtista nestorPalaciosTrabajo5 =  new TrabajosArtista();
	   nestorPalaciosTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/nestorPalacios/nestorPalacios5.jpg");
	   
	   nestorPalaciostrabajos.add(nestorPalaciosTrabajo1);
	   nestorPalaciostrabajos.add(nestorPalaciosTrabajo2);
	   nestorPalaciostrabajos.add(nestorPalaciosTrabajo3);
	   nestorPalaciostrabajos.add(nestorPalaciosTrabajo4);
	   nestorPalaciostrabajos.add(nestorPalaciosTrabajo5);
	   Collections.shuffle(nestorPalaciostrabajos);
	   
	   
	   nestorPalacios.setTrabajosArtistas(nestorPalaciostrabajos);
	   //FIN NESTOR PALACIOS 228
	   
//INICIO  ALEJO PACHO 154 alejoPachon
	   
	   Artista alejandroPachon=  new 	Artista();
		alejandroPachon.setDescripcion("Tatuador con 3 a los de experiencia, influencias del surrealismo pop y me gusta la parte pictorica.");
		alejandroPachon.setId("154");
		alejandroPachon.setNombre("Alejo pachon");
		alejandroPachon.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachonPerfil.jpg");
	    alejandroPachon.setFacebook("Alejo pachon");
	    alejandroPachon.setUsuarioFacebook("AlejoPachonart");
	    alejandroPachon.setCelular("+573042507466");
	    alejandroPachon.setInstagram("Alejopachon_art");	
	    alejandroPachon.setUsuarioInstagram("Alejopachon_art");
	    alejandroPachon.setDireccion("-- "); 	
	    alejandroPachon.setEspecialidad(nuevaEscuela);
	    alejandroPachon.setTwitter("false");
	    alejandroPachon.setUsuarioTwitter("false");
	    alejandroPachon.setLatitud("--");
	    alejandroPachon.setLongitud("--");
	    alejandroPachon.setNombreEstudio("Mórbida tattoo");
	    alejandroPachon.setEmail("Alejotattooart@gmail.com");
	    alejandroPachon.setCiudad(bogota);
	    alejandroPachon.setVerificado("true");
	    
	    
	   
	   ArrayList<TrabajosArtista> alejandroPachontrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista alejandroPachonTrabajo1 =  new TrabajosArtista();
	   alejandroPachonTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachon1.jpg");
	   
	   TrabajosArtista alejandroPachonTrabajo2 =  new TrabajosArtista();
	   alejandroPachonTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachon2.jpg");
	   
	   TrabajosArtista alejandroPachonTrabajo3 =  new TrabajosArtista();
	   alejandroPachonTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachon3.jpg");
	   
	   TrabajosArtista alejandroPachonTrabajo4 =  new TrabajosArtista();
	   alejandroPachonTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachon4.jpg");
	   
	   TrabajosArtista alejandroPachonTrabajo5 =  new TrabajosArtista();
	   alejandroPachonTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alejoPachon/alejoPachon5.jpg");
	   
	   alejandroPachontrabajos.add(alejandroPachonTrabajo1);
	   alejandroPachontrabajos.add(alejandroPachonTrabajo2);
	   alejandroPachontrabajos.add(alejandroPachonTrabajo3);
	   alejandroPachontrabajos.add(alejandroPachonTrabajo4);
	   alejandroPachontrabajos.add(alejandroPachonTrabajo5);
	   Collections.shuffle(alejandroPachontrabajos);
	   
	   
	   alejandroPachon.setTrabajosArtistas(alejandroPachontrabajos);
	   //FIN   ALEJO PACHO 154
	   
	   
//INICIO  DAMIAN CARNICERO  229 damianCarnicerodamianCarnicero
	   
	   Artista damianCarnicero=  new 	Artista();
		damianCarnicero.setDescripcion("Ya son 6 años de experiencia de los cuales he recorrí Colombia dando a conocer aun más la modificación corporal. he recibido reconocimiento en venezuela , ecuador , peru , argentina y Panamá .");
		damianCarnicero.setId("229");
		damianCarnicero.setNombre("Damian carnicero");
		damianCarnicero.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarniceroPerfil.jpg");
	    damianCarnicero.setFacebook("Damian carnicero");
	    damianCarnicero.setUsuarioFacebook("100009237216895");
	    damianCarnicero.setCelular("+573156080171");
	    damianCarnicero.setInstagram("DAMIAN_MODIFICADOR");	
	    damianCarnicero.setUsuarioInstagram("DAMIAN_MODIFICADOR");
	    damianCarnicero.setDireccion("calle 57 # 13-65 local 201"); 	
	    damianCarnicero.setEspecialidad(modificador);
	    damianCarnicero.setTwitter("false");
	    damianCarnicero.setUsuarioTwitter("false");
	    damianCarnicero.setLatitud("--");
	    damianCarnicero.setLongitud("--");
	    damianCarnicero.setNombreEstudio("Tattoo company ");
	    damianCarnicero.setEmail("tattoo@gmail.com");
	    damianCarnicero.setCiudad(bogota);
	    damianCarnicero.setVerificado("true");
	    
	    
	   
	   ArrayList<TrabajosArtista> damianCarnicerotrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista damianCarniceroTrabajo1 =  new TrabajosArtista();
	   damianCarniceroTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarnicero1.jpg");
	   
	   TrabajosArtista damianCarniceroTrabajo2 =  new TrabajosArtista();
	   damianCarniceroTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarnicero2.jpg");
	   
	   TrabajosArtista damianCarniceroTrabajo3 =  new TrabajosArtista();
	   damianCarniceroTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarnicero3.jpg");
	   
	   TrabajosArtista damianCarniceroTrabajo4 =  new TrabajosArtista();
	   damianCarniceroTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarnicero4.jpg");
	   
	   TrabajosArtista damianCarniceroTrabajo5 =  new TrabajosArtista();
	   damianCarniceroTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/damianCarnicero/damianCarnicero5.jpg");
	   
	   damianCarnicerotrabajos.add(damianCarniceroTrabajo1);
	   damianCarnicerotrabajos.add(damianCarniceroTrabajo2);
	   damianCarnicerotrabajos.add(damianCarniceroTrabajo3);
	   damianCarnicerotrabajos.add(damianCarniceroTrabajo4);
	   damianCarnicerotrabajos.add(damianCarniceroTrabajo5);
	   Collections.shuffle(damianCarnicerotrabajos);
	   
	   
	   damianCarnicero.setTrabajosArtistas(damianCarnicerotrabajos);
	   //FIN   DAMIAN CARNICERO 
	   
//INICIO  HECTOR VELANDIA 230 hectorVelandiahectorVelandia
	   
	   Artista hectorVelandia=  new 	Artista();
		hectorVelandia.setDescripcion("Soy Hector velandia, tatuador de la ciudad de Bogota,  tengo 5 años de experiencia como tatuador... Estoy ubicado en el sur de la ciudad en la localidad de bosa.... Me gusta trabajar todo lo relacionado, en estilos de watercolor, realismo a color, libre y sombras. He ganado 4 premios en mi carrera, y 2 reconocimientos.");
		hectorVelandia.setId("230");
		hectorVelandia.setNombre("Hector velandia");
		hectorVelandia.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandiaPerfil.jpg");
	    hectorVelandia.setFacebook("Hector velandia");
	    hectorVelandia.setUsuarioFacebook("hector.velandia.tattoo");
	    hectorVelandia.setCelular("+573134234140");
	    hectorVelandia.setInstagram("HECTOR_TATTOOART");	
	    hectorVelandia.setUsuarioInstagram("HECTOR_TATTOOART");
	    hectorVelandia.setDireccion("Calle 65 sur no. 79 C - 04 local 247 "); 	
	    hectorVelandia.setEspecialidad(realismo);
	    hectorVelandia.setTwitter("false");
	    hectorVelandia.setUsuarioTwitter("false");
	    hectorVelandia.setLatitud("--");
	    hectorVelandia.setLongitud("--");
	    hectorVelandia.setNombreEstudio("Hector_tattoo@hotmail.com");
	    hectorVelandia.setEmail("Hector_tattoo@hotmail.com");
	    hectorVelandia.setCiudad(bogota);
	    hectorVelandia.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> hectorVelandiatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista hectorVelandiaTrabajo1 =  new TrabajosArtista();
	   hectorVelandiaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandia1.jpg");
	   
	   TrabajosArtista hectorVelandiaTrabajo2 =  new TrabajosArtista();
	   hectorVelandiaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandia2.jpg");
	   
	   TrabajosArtista hectorVelandiaTrabajo3 =  new TrabajosArtista();
	   hectorVelandiaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandia3.jpg");
	   
	   TrabajosArtista hectorVelandiaTrabajo4 =  new TrabajosArtista();
	   hectorVelandiaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandia4.jpg");
	   
	   TrabajosArtista hectorVelandiaTrabajo5 =  new TrabajosArtista();
	   hectorVelandiaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/hectorVelandia/hectorVelandia5.jpg");
	   
	   hectorVelandiatrabajos.add(hectorVelandiaTrabajo1);
	   hectorVelandiatrabajos.add(hectorVelandiaTrabajo2);
	   hectorVelandiatrabajos.add(hectorVelandiaTrabajo3);
	   hectorVelandiatrabajos.add(hectorVelandiaTrabajo4);
	   hectorVelandiatrabajos.add(hectorVelandiaTrabajo5);
	   Collections.shuffle(hectorVelandiatrabajos);
	   
	   
	   hectorVelandia.setTrabajosArtistas(hectorVelandiatrabajos);
	   //FIN   HECTOR VELANDIA
	   
	   //INICIO  MAURICIO SOSA 231 mauricioSosa
	   
	   Artista mauricioSosa=  new 	Artista();
		mauricioSosa.setDescripcion("Tatuajes con cariño y respeto. Lineas solidas y colores duraderos.");
		mauricioSosa.setId("231");
		mauricioSosa.setNombre("Mauricio sosa");
		mauricioSosa.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosaPerfil.jpg");
	    mauricioSosa.setFacebook("Mauricio sosa");
	    mauricioSosa.setUsuarioFacebook("mauriciososa12");
	    mauricioSosa.setCelular("+573112758880");
	    mauricioSosa.setInstagram("sailorfromhell26");	
	    mauricioSosa.setUsuarioInstagram("sailorfromhell26");
	    mauricioSosa.setDireccion("Cll 62 # 22 - 89 "); 	
	    mauricioSosa.setEspecialidad(tradicional);
	    mauricioSosa.setTwitter("false");
	    mauricioSosa.setUsuarioTwitter("false");
	    mauricioSosa.setLatitud("--");
	    mauricioSosa.setLongitud("--");
	    mauricioSosa.setNombreEstudio("Art De Rue Collective");
	    mauricioSosa.setEmail("mauriciososatatuajes@gmail.com");
	    mauricioSosa.setCiudad(bogota);
	    mauricioSosa.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> mauricioSosatrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista mauricioSosaTrabajo1 =  new TrabajosArtista();
	   mauricioSosaTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosa1.jpg");
	   
	   TrabajosArtista mauricioSosaTrabajo2 =  new TrabajosArtista();
	   mauricioSosaTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosa2.jpg");
	   
	   TrabajosArtista mauricioSosaTrabajo3 =  new TrabajosArtista();
	   mauricioSosaTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosa3.jpg");
	   
	   TrabajosArtista mauricioSosaTrabajo4 =  new TrabajosArtista();
	   mauricioSosaTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosa4.jpg");
	   
	   TrabajosArtista mauricioSosaTrabajo5 =  new TrabajosArtista();
	   mauricioSosaTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/mauricioSosa/mauricioSosa5.jpg");
	   
	   mauricioSosatrabajos.add(mauricioSosaTrabajo1);
	   mauricioSosatrabajos.add(mauricioSosaTrabajo2);
	   mauricioSosatrabajos.add(mauricioSosaTrabajo3);
	   mauricioSosatrabajos.add(mauricioSosaTrabajo4);
	   mauricioSosatrabajos.add(mauricioSosaTrabajo5);
	   Collections.shuffle(mauricioSosatrabajos);
	   
	   
	   mauricioSosa.setTrabajosArtistas(mauricioSosatrabajos);
	   //FIN  MAURICIO SOSA
	   
  //INICIO  ALFREDO VARGAS 200 alfredoVargas
	   
	   Artista alfredoVargas=  new 	Artista();
		alfredoVargas.setDescripcion("Artista tatuador,  artista plástico,  con más de 15 años de experiencia,  jefe en estudio warlock,  organizador de las convenciónes de tatuadores usme y de ciudad  bolivar");
		alfredoVargas.setId("200");
		alfredoVargas.setNombre("Alfredo vargas");
		alfredoVargas.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargasPerfil.jpg");
	    alfredoVargas.setFacebook("Alfredo vargas");
	    alfredoVargas.setUsuarioFacebook("warlock0719");
	    alfredoVargas.setCelular("+573202266067");
	    alfredoVargas.setInstagram("false");	
	    alfredoVargas.setUsuarioInstagram("false");
	    alfredoVargas.setDireccion("Cra 72 # 64-35 perdomo- calle  "); 	
	    alfredoVargas.setEspecialidad(tradicional);
	    alfredoVargas.setTwitter("warlockbodyart");
	    alfredoVargas.setUsuarioTwitter("warlockbodyart");
	    alfredoVargas.setLatitud("--");
	    alfredoVargas.setLongitud("--");
	    alfredoVargas.setNombreEstudio("Warlock body art");
	    alfredoVargas.setEmail("studiowarlock@hotmail.com");
	    alfredoVargas.setCiudad(bogota);
	    alfredoVargas.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> alfredoVargastrabajos =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista alfredoVargasTrabajo1 =  new TrabajosArtista();
	   alfredoVargasTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargas1.jpg");
	   
	   TrabajosArtista alfredoVargasTrabajo2 =  new TrabajosArtista();
	   alfredoVargasTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargas2.jpg");
	   
	   TrabajosArtista alfredoVargasTrabajo3 =  new TrabajosArtista();
	   alfredoVargasTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargas3.jpg");
	   
	   TrabajosArtista alfredoVargasTrabajo4 =  new TrabajosArtista();
	   alfredoVargasTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargas4.jpg");
	   
	   TrabajosArtista alfredoVargasTrabajo5 =  new TrabajosArtista();
	   alfredoVargasTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/alfredoVargas/alfredoVargas5.jpg");
	   
	   alfredoVargastrabajos.add(alfredoVargasTrabajo1);
	   alfredoVargastrabajos.add(alfredoVargasTrabajo2);
	   alfredoVargastrabajos.add(alfredoVargasTrabajo3);
	   alfredoVargastrabajos.add(alfredoVargasTrabajo4);
	   alfredoVargastrabajos.add(alfredoVargasTrabajo5);
	   Collections.shuffle(alfredoVargastrabajos);
	   
	   
	   alfredoVargas.setTrabajosArtistas(alfredoVargastrabajos);
	   //FIN  ALFREDO VARGAS
	   
  //INICIO  ALFREDO VARGAS 232 davidMaldonado1
	   
	   Artista davidMaldonado1=  new 	Artista();
		davidMaldonado1.setDescripcion("Tatuador con 5 años de experiencia ");
		davidMaldonado1.setId("232");
		davidMaldonado1.setNombre("David maldonado");
		davidMaldonado1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado1Perfil.jpg");
	    davidMaldonado1.setFacebook("David maldonado");
	    davidMaldonado1.setUsuarioFacebook("Drummerink");
	    davidMaldonado1.setCelular("+573175302175");
	    davidMaldonado1.setInstagram("david.tattoo");	
	    davidMaldonado1.setUsuarioInstagram("david.tattoo");
	    davidMaldonado1.setDireccion("Cra 9 # 60-70 "); 	
	    davidMaldonado1.setEspecialidad(neotradicional);
	    davidMaldonado1.setTwitter("false");
	    davidMaldonado1.setUsuarioTwitter("false");
	    davidMaldonado1.setLatitud("4.646353690093737");
	    davidMaldonado1.setLongitud("-74.0619546175003-");
	    davidMaldonado1.setNombreEstudio("Arkham Tattoo");
	    davidMaldonado1.setEmail("davidmaldonadotatuajes@gmail.com");
	    davidMaldonado1.setCiudad(bogota);
	    davidMaldonado1.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> davidMaldonado1trabajoss =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista davidMaldonado1Trabajo1 =  new TrabajosArtista();
	   davidMaldonado1Trabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado11.jpg");
	   
	   TrabajosArtista davidMaldonado1Trabajo2 =  new TrabajosArtista();
	   davidMaldonado1Trabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado12.jpg");
	   
	   TrabajosArtista davidMaldonado1Trabajo3 =  new TrabajosArtista();
	   davidMaldonado1Trabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado13.jpg");
	   
	   TrabajosArtista davidMaldonado1Trabajo4 =  new TrabajosArtista();
	   davidMaldonado1Trabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado14.jpg");
	   
	   TrabajosArtista davidMaldonado1Trabajo5 =  new TrabajosArtista();
	   davidMaldonado1Trabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/davidMaldonado1/davidMaldonado15.jpg");
	   
	  davidMaldonado1trabajoss.add(davidMaldonado1Trabajo1);
	  davidMaldonado1trabajoss.add(davidMaldonado1Trabajo2);
	  davidMaldonado1trabajoss.add(davidMaldonado1Trabajo3);
	  davidMaldonado1trabajoss.add(davidMaldonado1Trabajo4);
	  davidMaldonado1trabajoss.add(davidMaldonado1Trabajo5);
	   Collections.shuffle(davidMaldonado1trabajoss);
	   
	   
	   davidMaldonado1.setTrabajosArtistas(davidMaldonado1trabajoss);
	   //FIN  ALFREDO SOSA
	   
 //INICIO  WILLIAM art legion 214 williamArt
	   
	   Artista williamArtLegion=  new 	Artista();
		williamArtLegion.setDescripcion("Artista independiente dedicado al Black and Grey ");
		williamArtLegion.setId("214");
		williamArtLegion.setNombre("William Art Légion");
		williamArtLegion.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArtPerfil.jpg");
	    williamArtLegion.setFacebook("William Art Lé gion");
	    williamArtLegion.setUsuarioFacebook("william.legion.773");
	    williamArtLegion.setCelular("+573115541760");
	    williamArtLegion.setInstagram("William.art.legion");	
	    williamArtLegion.setUsuarioInstagram("William.art.legion");
	    williamArtLegion.setDireccion("Cra 13 #60 - 75 "); 	
	    williamArtLegion.setEspecialidad(realismo);
	    williamArtLegion.setTwitter("false");
	    williamArtLegion.setUsuarioTwitter("false");
	    williamArtLegion.setLatitud("4.647625");
	    williamArtLegion.setLongitud("-74.06385419999990");
	    williamArtLegion.setNombreEstudio("Trece chiros store");
	    williamArtLegion.setEmail("wlegion.arte@gmail.com");
	    williamArtLegion.setCiudad(bogota);
	    williamArtLegion.setVerificado("false");
	    
	    
	   
	   ArrayList<TrabajosArtista> williamArttrabajoss =  new ArrayList<TrabajosArtista>();
	   TrabajosArtista williamArtTrabajo1 =  new TrabajosArtista();
	   williamArtTrabajo1.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArt1.jpg");
	   
	   TrabajosArtista williamArtTrabajo2 =  new TrabajosArtista();
	   williamArtTrabajo2.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArt2.jpg");
	   
	   TrabajosArtista williamArtTrabajo3 =  new TrabajosArtista();
	   williamArtTrabajo3.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArt3.jpg");
	   
	   TrabajosArtista williamArtTrabajo4 =  new TrabajosArtista();
	   williamArtTrabajo4.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArt4.jpg");
	   
	   TrabajosArtista williamArtTrabajo5 =  new TrabajosArtista();
	   williamArtTrabajo5.setImagen("http://8-dot-inkdata-1019.appspot.com/img/williamArt/williamArt5.jpg");
	   
	  williamArttrabajoss.add(williamArtTrabajo1);
	  williamArttrabajoss.add(williamArtTrabajo2);
	  williamArttrabajoss.add(williamArtTrabajo3);
	  williamArttrabajoss.add(williamArtTrabajo4);
	  williamArttrabajoss.add(williamArtTrabajo5);
	   Collections.shuffle(williamArttrabajoss);
	   
	   
	   williamArtLegion.setTrabajosArtistas(williamArttrabajoss);
	   //FIN WILLIAM ART
	   
	   
	   //AGREGAR  ARTISTAS 
	   artistasData.add(andresRamirez);        // id101
	  // artistasData.add(arleyVargas);          // id102
	   artistasData.add(camiloSandoval);       // id103
	   artistasData.add(carlosBeltran);        // id104
	   artistasData.add(cesarMartink);         // id105
	   artistasData.add(diegoFernandez);       // id106
	   artistasData.add(edisonHuerfano);       // id107
	   artistasData.add(fernandoUrrea);        // id108  
	   artistasData.add(johanBarreto);         // id109
	   artistasData.add(kymberlySt);           // id110
	   //artistasData.add(miko);               // id111
	   artistasData.add(millerBautizta);       // id112
	  // artistasData.add(raeGuedez);          // id113
	   artistasData.add(seimonRodriguez);      // id114
	   artistasData.add(soraDonGermenes);      // id115
	   artistasData.add(thomasKuro);           // id116
	   artistasData.add(jonatanJoel);          // id117
	   artistasData.add(williamRestrepo);      // id118
	   //artistasData.add(jhonInk);              // id119
	   artistasData.add(camiloCortes);         // id120 
	   artistasData.add(julianMerchan);        // id121
	   artistasData.add(jhonMad);              // id122
	   //artistasData.add(diegoAlejandro) ;      // id123
	   artistasData.add(jhonGaviria);          // id124
	   artistasData.add(juanDavidParra);       // id125
	   artistasData.add(juanDiegoDragon);      // id126
	   artistasData.add(nicolasRincon);        // id127
	   artistasData.add(danielZombie);         // id128
	   artistasData.add(tateMunevar);          // id129
	   artistasData.add(eloiseRico);           // id130
	   artistasData.add(andresTrivino);        // id131
	   artistasData.add(joseCabiativa);        // id132
	   artistasData.add(hernanBerrocal);       // id133
	   artistasData.add(christianLopez);       // id134
	   artistasData.add(nicolasGutierrez);     // id135
	   artistasData.add(luisVega);             // id136
	   artistasData.add(davidSanchez);         // id137
	   artistasData.add(priseGiraldo);         // id138
	   artistasData.add(mauricioInsignares);   // id139
	   artistasData.add(juanMahecha);          // id140
	   artistasData.add(pepoTatto);            // id141
	   artistasData.add(angelCastro);          // id142
	   artistasData.add(marioToloza);          // id143
	   artistasData.add(davidMaldonado);       // id144
	   artistasData.add(sebastianGarcia);      // id145
	   artistasData.add(pedroLeon);            // id146
	   artistasData.add(kennyOvalle);          // id147
	   artistasData.add(victhorGonzalez);      // id156
	   artistasData.add(nickRey);              // id167
	   artistasData.add(sebastianBarrero);     // id175
	   artistasData.add(xegg);                 // id179
	   artistasData.add(julianGonzales);       // id176
	   artistasData.add(snyderMayorga);        // id161
	   artistasData.add(hectorMesa);           // id169
	   artistasData.add(stiveKranium);         // id174
	   artistasData.add(mauroScorpions);       // id164
	   artistasData.add(felipeChalarca);       // id180
	   artistasData.add(tonyChacal);           // id148
	   artistasData.add(clinchi);              // id151
	   artistasData.add(dsSanguino);           // id157
	   artistasData.add(juanVillamil);         // id162
	   artistasData.add(palacioVelez);         // id156
	   artistasData.add(edwinRamirez);         // id177
	   artistasData.add(leoTattoo);            // id159
	   artistasData.add(chivoTatto);           // id160
	   artistasData.add(andresNino);           // id166
	   artistasData.add(carloxAngarita);       // id178
	   artistasData.add(carlosRojas);          // id184
	   artistasData.add(diegoPerdomo);         // id185
	   artistasData.add(danielMarin);          // id186
	   artistasData.add(sebastianVinasco);     // id168
	   artistasData.add(titoMonsta);           // id173
	   artistasData.add(dwayne);               // id150
	   artistasData.add(jaelRivero);           // id163
	   artistasData.add(clauGiraldo);          // id187
	   artistasData.add(cesarGarcia);          // id188
	   artistasData.add(juanBallen);           // id189
	   artistasData.add(juanGuzman);           // id190
	   artistasData.add(pedroTorres);          // id193
	   artistasData.add(danielDuque);          // id194
	   artistasData.add(ivanKnight);           // id196
	   artistasData.add(gabrielBernal);        // id192
	   artistasData.add(harsonRodriguez);      // id197
	   artistasData.add(rafaelGomez);          // id201
	   artistasData.add(koryAngarita);         // id201
	   artistasData.add(josueBeltran);         // id191
	   artistasData.add(sebastianHerrera);     // id203
	   artistasData.add(nicolasVera);          // id204
	   artistasData.add(sainySilva);           // id207
	   artistasData.add(diegoSolarte);         // id208
	   artistasData.add(evaloValencia);        // id210
	   artistasData.add(marcoBarrera);         // id211
	   artistasData.add(ironFontecha);         // id212
	   artistasData.add(dropsDiecinueve);      // id213
	   artistasData.add(jorgeCarpediem);       // id209
	   artistasData.add(badu);                 // id218
	   artistasData.add(rago);      		   // id219
	   artistasData.add(charlyeOsorio);        // id215
	   artistasData.add(andresPerez);          // id220
	   artistasData.add(santiagoKaoz);         // id221
	   artistasData.add(johnnyAsgard);         // id206
	   artistasData.add(javierMartinez);       // id226
	   artistasData.add(cristhianCassiani);    // id227
	   artistasData.add(aioriArt);             // id227
	   artistasData.add(nestorPalacios);       // id228
	   artistasData.add(alejandroPachon);      // id154
	   artistasData.add(damianCarnicero);	   //id229	
	   artistasData.add(hectorVelandia);      // id230
	   artistasData.add(mauricioSosa);      // id231
	   artistasData.add(alfredoVargas);      // id231
	   artistasData.add(davidMaldonado1);      // id231
	   artistasData.add(williamArtLegion);      // id214
	   
	   //FIN AGREGAR  ARTISTAS 
	   
	   //INICIO RANDOM
	   
	   Collections.shuffle(artistasData);
	   //FIN RANDOM
	  
	  
	  
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < artistasData.size(); i++) {
		   JSONObject artistas =  new JSONObject();
		   artistas.put("id", artistasData.get(i).getId());
		   artistas.put("nombre", artistasData.get(i).getNombre());
		   artistas.put("especialidad", artistasData.get(i).getEspecialidad());
		   artistas.put("descripcion", artistasData.get(i).getDescripcion());
		   artistas.put("imagen", artistasData.get(i).getImagen());
		   artistas.put("direccion", artistasData.get(i).getDireccion());
		   artistas.put("celular", artistasData.get(i).getCelular());
		   artistas.put("facebook", artistasData.get(i).getFacebook());
		   artistas.put("twitter", artistasData.get(i).getTwitter());
		   artistas.put("instagram", artistasData.get(i).getInstagram());
		   artistas.put("latitud", artistasData.get(i).getLatitud());
		   artistas.put("longitud", artistasData.get(i).getLongitud());
		   artistas.put("ciudad", artistasData.get(i).getCiudad());
		   artistas.put("usuarioFacebook", artistasData.get(i).getUsuarioFacebook());
		   artistas.put("usuarioTwitter", artistasData.get(i).getUsuarioTwitter());
		   artistas.put("usuarioInstagram", artistasData.get(i).getUsuarioInstagram());
		   artistas.put("verificado", artistasData.get(i).getVerificado());
		   artistas.put("estudio", artistasData.get(i).getNombreEstudio());
		   
		 
			   artistas.put("opcionVideo","false");
			   JSONArray videosJson =  new JSONArray();
			   if(artistasData.get(i).getVideosArtistas().size() > 0 )
			   {
				   for (int j = 0; j < artistasData.get(i).getVideosArtistas().size(); j++) {
					   videosJson.add(artistasData.get(i).getVideosArtistas().get(j).getUrl());
					
				   }  
			   }
			   artistas.put("videos", videosJson);
		
		   
	
		   JSONArray imagenes =  new JSONArray();
		   for (int j = 0; j < artistasData.get(i).getTrabajosArtistas().size(); j++) {
			 imagenes.add(artistasData.get(i).getTrabajosArtistas().get(j).getImagen());
			
		   }
		   artistas.put("trabajos", imagenes);
		   
		   
		  
		  
		   json.add(artistas);
		   
		   
		   
	   }
		
	
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
