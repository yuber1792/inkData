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
public class PublicidadServlet extends HttpServlet {

	public static String bogota  = "Bogotá";
	public static String savaneta =  "Savaneta, aruba";
	public static String mexico =  "México D.F";
	public static String santaMarta =  "Santa marta";
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		//resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("application/json");
		resp.addHeader("Access-Control-Allow-Origin", "*");
		 // resp.addHeader("Content-Type", "application/json");
		 
		List<PublicidadDTO> publicidadData =  new ArrayList<PublicidadDTO>();
		
	   
		PublicidadDTO publicidad1=  new 	PublicidadDTO();
		publicidad1.setDescripcion("Parafernalia para fumadores en general , whatsapp 3108527545 , www.zombiehs.com");
		publicidad1.setNombre("Zombie Head Shop");
		publicidad1.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/zombiehs.jpg");
		publicidad1.setRedireccion("http://www.zombiehs.com");
		publicidad1.setTieneImagen("false");
		publicidad1.setTieneVideo("false");
		publicidad1.setTieneRedes("false");
		publicidad1.setId("10");
		publicidad1.setCiudad(bogota);
		
		PublicidadDTO publicidad2=  new 	PublicidadDTO();
		publicidad2.setDescripcion("Insurgentes Sur 221. Col. Roma, 06700 México, D. F.  Whatsapp +5564299028");
		publicidad2.setNombre("Tatuajes méxico");
		publicidad2.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/tatuajesMexico.png");
		publicidad2.setRedireccion("https://www.facebook.com/tatuajesmexico/");
		publicidad2.setTieneImagen("false");
		publicidad2.setTieneVideo("false");
		publicidad2.setTieneRedes("false");
		publicidad2.setId("11");
		publicidad2.setCiudad(bogota);
		
		PublicidadDTO publicidad3=  new 	PublicidadDTO();
		publicidad3.setDescripcion("Palm Beach, Aruba  +297 600 0020  ,inkspiration.aruba@gmail.com");
		publicidad3.setNombre("Inkspiration tatto");
		publicidad3.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/inkspiration.jpg");
		publicidad3.setRedireccion("https://www.facebook.com/Inkspiration.Aruba/");
		publicidad3.setTieneImagen("false");
		publicidad3.setTieneVideo("false");
		publicidad3.setTieneRedes("false");
		publicidad3.setId("12");
		publicidad3.setCiudad(savaneta);
		
		
		PublicidadDTO publicidad4=  new 	PublicidadDTO();
		publicidad4.setDescripcion("Estación de transmillenio (Calle 72) ,540 74 66 - 317 381 18 39 ,sacramento_tattoo@hotmail.com");
		publicidad4.setNombre("Sacramento tatto");
		publicidad4.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/sacramento.jpg");
		publicidad4.setRedireccion("https://www.facebook.com/sacramentotattoo/");
		publicidad4.setTieneImagen("false");
		publicidad4.setTieneVideo("false");
		publicidad4.setTieneRedes("false");
		publicidad4.setId("13");
		publicidad4.setCiudad(bogota);
		
		PublicidadDTO publicidad5=  new 	PublicidadDTO();
		publicidad5.setDescripcion("cll 2b # 38 a 23, 57 Bogotá , 320-236-2310 , nattadread192@hotmail.com.");
		publicidad5.setNombre("jammink tatto");
		publicidad5.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/jammink.jpg");
		publicidad5.setRedireccion("https://www.facebook.com/jamminktattooshop/");
		publicidad5.setTieneImagen("false");
		publicidad5.setTieneVideo("false");
		publicidad5.setTieneRedes("false");
		publicidad5.setId("14");
		publicidad2.setCiudad(bogota);
		//INICIO FREE  INK TATTTO
		
		PublicidadDTO freeInkTattoo=  new 	PublicidadDTO();
		freeInkTattoo.setDescripcion("Carrera 77a N° 63f - 80, Bogotá ,3212155087 - 3185590536 ");
		freeInkTattoo.setNombre("Free ink tatto");
		freeInkTattoo.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattoo.setRedireccion("https://www.facebook.com/Free.Ink.Tattoo.Studio/");
		freeInkTattoo.setId("15");
		freeInkTattoo.setCiudad(bogota);
		
		List<PublicidadImagenesDTO> freeInkTattoImagenes  =  new  ArrayList<PublicidadImagenesDTO>();
		PublicidadImagenesDTO  freeInkTattooImagen1 =  new PublicidadImagenesDTO();
		freeInkTattooImagen1.setNombreImagen("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattooImagen1.setDescripcion("imagen 1");
		
		PublicidadImagenesDTO  freeInkTattooImagen2 =  new PublicidadImagenesDTO();
		freeInkTattooImagen2.setNombreImagen("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattooImagen2.setDescripcion("imagen 2");
		
		PublicidadImagenesDTO  freeInkTattooImagen3 =  new PublicidadImagenesDTO();
		freeInkTattooImagen3.setNombreImagen("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattooImagen3.setDescripcion("imagen 3");
		
		PublicidadImagenesDTO  freeInkTattooImagen4 =  new PublicidadImagenesDTO();
		freeInkTattooImagen4.setNombreImagen("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattooImagen4.setDescripcion("imagen 4");
		
		PublicidadImagenesDTO  freeInkTattooImagen5=  new PublicidadImagenesDTO();
		freeInkTattooImagen5.setNombreImagen("http://8-dot-inkdata-1019.appspot.com/img/publicidad/freeink.jpg");
		freeInkTattooImagen5.setDescripcion("imagen 5");
		
		freeInkTattoImagenes.add(freeInkTattooImagen1);
		freeInkTattoImagenes.add(freeInkTattooImagen2);
		freeInkTattoImagenes.add(freeInkTattooImagen3);
		freeInkTattoImagenes.add(freeInkTattooImagen4);
		freeInkTattoImagenes.add(freeInkTattooImagen5);
		
		List<PublicidadVideoDTO> freeInkTattooVideosDtos = new ArrayList<PublicidadVideoDTO>();
		PublicidadVideoDTO  freeInkTattooVideo1 =  new PublicidadVideoDTO();
		freeInkTattooVideo1.setUrl("https://www.youtube.com/embed/tWwrsBg7fsw");
		freeInkTattooVideo1.setNombre("video1");
		
		PublicidadVideoDTO  freeInkTattooVideo2 =  new PublicidadVideoDTO();
		freeInkTattooVideo2.setUrl("https://www.youtube.com/embed/F1LLz3l0vxQ");
		freeInkTattooVideo2.setNombre("video2");
		
		freeInkTattooVideosDtos.add(freeInkTattooVideo1);
		freeInkTattooVideosDtos.add(freeInkTattooVideo2);
		
		PublicidadRedesSocialesDTO publicidadRedesSocialesDTO  = new  PublicidadRedesSocialesDTO();
		publicidadRedesSocialesDTO.setNombreFacebook("free ink tattoo");
		publicidadRedesSocialesDTO.setNombreTwitter("NOMBRE TWITTER");
		publicidadRedesSocialesDTO.setNombreInstagram("NOMBRE INSTAGRAM");
		publicidadRedesSocialesDTO.setNombreGoogle("NOMBRE GOOGLE");
		publicidadRedesSocialesDTO.setUsuarioFacebook("USUARIO FACEBOOK");
		publicidadRedesSocialesDTO.setUsuarioTwitter("USUARIO TWITTER");
		publicidadRedesSocialesDTO.setUsuarioGoogle("USUARIO google");
		publicidadRedesSocialesDTO.setPaginaWeb("www.inkgps.com");
		publicidadRedesSocialesDTO.setDireccion("cra 72");
		publicidadRedesSocialesDTO.setCiudad("Bogota");
		publicidadRedesSocialesDTO.setCelular("311231231");
		
		
		//freeInkTattoo.setListaImagenes(freeInkTattoImagenes);
		//freeInkTattoo.setListaVIdeos(freeInkTattooVideosDtos);
		//freeInkTattoo.setListaRedesSociales(publicidadRedesSocialesDTO);
		freeInkTattoo.setTieneImagen("false");
		freeInkTattoo.setTieneVideo("false");
		freeInkTattoo.setTieneRedes("false");
		
		//FIN FREE INK TATTO
		
		
	
		
		
		PublicidadDTO publicidad7=  new 	PublicidadDTO();
		publicidad7.setDescripcion("Barrio Los Fundadores/ Calle del Banco BBVA Apartadó, Colombia -318 5225597 ");
		publicidad7.setNombre("Rasta punk");
		publicidad7.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/rastaPunk.jpg");
		publicidad7.setRedireccion("https://www.facebook.com/profile.php?id=100008288052662");
		publicidad7.setTieneImagen("false");
		publicidad7.setTieneVideo("false");
		publicidad7.setTieneRedes("false");
		publicidad7.setId("16");
		publicidad7.setCiudad(santaMarta);
		
		
		PublicidadDTO publicidad8=  new 	PublicidadDTO();
		publicidad8.setDescripcion("TATTOO--- DISEÑOS PERSONALIZADOS--- TATUANDO CON RESPONSABILIDAD  -Kr 5 19-79, Bogotá  - 310-215-1230 ");
		publicidad8.setNombre("Cannibal house tattoo");
		publicidad8.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/cannibalHouse.jpg");
		publicidad8.setRedireccion("https://www.facebook.com/cannibaltattooart/");
		publicidad8.setTieneImagen("false");
		publicidad8.setTieneVideo("false");
		publicidad8.setTieneRedes("false");
		publicidad8.setId("17");
		publicidad8.setCiudad(bogota);

		PublicidadDTO publicidad9=  new 	PublicidadDTO();
		publicidad9.setDescripcion("Estudio de tatuajes y body piercing fundado en el 2012. Calle 19 No. 4 - 83 Local 215, Bogotá - 301-403-9014");
		publicidad9.setNombre("Power colors tattoo");
		publicidad9.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/powerColors.jpg");
		publicidad9.setRedireccion("https://www.facebook.com/Power-Colors-Tattoo-352448458168396/");
		publicidad9.setTieneImagen("false");
		publicidad9.setTieneVideo("false");
		publicidad9.setTieneRedes("false");
		publicidad9.setId("18");
		publicidad9.setCiudad(bogota);
		
		PublicidadDTO publicidad10=  new 	PublicidadDTO();
		publicidad10.setDescripcion("Carrera 13 # 60-75 segundo piso ; Chapinero ; Bogota Colombia, 1 Bogotá. -Ropa - Tattoo - Piercing - Modificacion Corporal - 3208938279");
		publicidad10.setNombre("Trece chiros store");
		publicidad10.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/treceChiros.jpg");
		publicidad10.setRedireccion("https://www.facebook.com/TreceChiros/");
		publicidad10.setTieneImagen("false");
		publicidad10.setTieneVideo("false");
		publicidad10.setTieneRedes("false");
		publicidad10.setId("19");
		publicidad10.setCiudad(bogota);

		PublicidadDTO publicidad11=  new 	PublicidadDTO();
		publicidad11.setDescripcion("calle 64 #11-55 Cc Cosmos 64 local 210, 57 Bogotá - 3004921873  - Lun-Sáb: 10:00-20:30");
		publicidad11.setNombre("West site store");
		publicidad11.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/westSite.jpg");
		publicidad11.setRedireccion("https://www.facebook.com/westsitestore/");
		publicidad11.setTieneImagen("false");
		publicidad11.setTieneVideo("false");
		publicidad11.setTieneRedes("false");
		publicidad11.setId("20");
		publicidad11.setCiudad(bogota);
		
		PublicidadDTO publicidad12=  new 	PublicidadDTO();
		publicidad12.setDescripcion("Modificación Corporal, Tattoos, Perforaciones, Expansiones, Dibujos. Cra. 7 #48a-68 Local 101 TLZtattoo. 313 478 74 05");
		publicidad12.setNombre("TLZ tattoo");
		publicidad12.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/tlz.png");
		publicidad12.setRedireccion("https://www.facebook.com/TLZtattoo/");
		publicidad12.setTieneImagen("false");
		publicidad12.setTieneVideo("false");
		publicidad12.setTieneRedes("false");
		publicidad12.setId("21");
		publicidad12.setCiudad(bogota);
		
		PublicidadDTO publicidad13=  new 	PublicidadDTO();
		publicidad13.setDescripcion("dedicados a la imagen desde un punto de vista artístico alternativo enfocados en las areas de, peluqueria, tattoo, body piercing, ropa y accesorios - 2723989 - 3143565488");
		publicidad13.setNombre("Black panther studio");
		publicidad13.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/blackPanther.jpg");
		publicidad13.setRedireccion("https://www.facebook.com/Black-Panther-Studio-115553731923109/");
		publicidad13.setTieneImagen("false");
		publicidad13.setTieneVideo("false");
		publicidad13.setTieneRedes("false");
		publicidad13.setId("22");
		publicidad13.setCiudad(bogota);
		
		PublicidadDTO publicidad14=  new 	PublicidadDTO();
		publicidad14.setDescripcion("TATTOO - PIERCING - MODIFICACIONES - ACADEMIA - ACCESORIOS. Calle 57 # 13 - 65, local 201, 110231321 Bogotá");
		publicidad14.setNombre("Tattoo Company");
		publicidad14.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/tattoKompany.jpg");
		publicidad14.setRedireccion("https://www.facebook.com/TTattooCompany/");
		publicidad14.setTieneImagen("false");
		publicidad14.setTieneVideo("false");
		publicidad14.setTieneRedes("false");
		publicidad14.setId("23");
		publicidad14.setCiudad(bogota);
		
		PublicidadDTO publicidad15=  new 	PublicidadDTO();
		publicidad15.setDescripcion("TATTOO av calle 19#4-79 local 305  Bogotá");
		publicidad15.setNombre("El Tatuadero");
		publicidad15.setUrl("http://8-dot-inkdata-1019.appspot.com/img/publicidad/elTatuadero.jpg");
		publicidad15.setRedireccion("https://www.facebook.com/eltatuadero.estudio/");
		publicidad15.setTieneImagen("false");
		publicidad15.setTieneVideo("false");
		publicidad15.setTieneRedes("false");
		publicidad15.setId("24");
		publicidad15.setCiudad(bogota);
		
		


	   
	  
		
		   publicidadData.add(publicidad2);
		   publicidadData.add(publicidad3);
		   publicidadData.add(publicidad4);
		   publicidadData.add(publicidad5);
		   publicidadData.add(freeInkTattoo);
		   publicidadData.add(publicidad7);
		   publicidadData.add(publicidad8);
		   publicidadData.add(publicidad9);
		   publicidadData.add(publicidad10);
		   publicidadData.add(publicidad11);
		   publicidadData.add(publicidad12);
		   publicidadData.add(publicidad13);
		   publicidadData.add(publicidad14);
		   publicidadData.add(publicidad15);


	   
	  

	   Collections.shuffle(publicidadData);
	   
	   //LOGICA QUE CREA EL  JSON  NO TOCAR 
	   JSONArray json = new JSONArray();
	   for (int i = 0; i < publicidadData.size(); i++) {
		   JSONObject publicaciones =  new JSONObject();
		 
		   publicaciones.put("nombre", publicidadData.get(i).getNombre());
		   publicaciones.put("descripcion", publicidadData.get(i).getDescripcion());
		   publicaciones.put("imagen", publicidadData.get(i).getUrl());
		   publicaciones.put("redireccion", publicidadData.get(i).getRedireccion());
		   publicaciones.put("tieneRedes",  publicidadData.get(i).getTieneRedes());
		   publicaciones.put("tieneVideos",  publicidadData.get(i).getTieneVideo());
		   publicaciones.put("tieneImagenes",  publicidadData.get(i).getTieneImagen());
		   
		
		   if(publicidadData.get(i).getListaImagenes() != null){
			   
			   JSONArray imagenes =  new JSONArray();
			   for (int j = 0; j < publicidadData.get(i).getListaImagenes().size(); j++) {
				   JSONObject imagenesData = new JSONObject();
					 imagenesData.put("id", publicidadData.get(i).getListaImagenes().get(j).getId());
					 imagenesData.put("imagen", publicidadData.get(i).getListaImagenes().get(j).getNombreImagen());
					 imagenesData.put("descripcion", publicidadData.get(i).getListaImagenes().get(j).getDescripcion());
					 imagenes.add(imagenesData);
					
				   }
			   publicaciones.put("imagenes", imagenes);
		   }
		  
		   if(publicidadData.get(i).getListaVIdeos() != null){
			  
			   JSONArray videos =  new JSONArray();
			   for (int j = 0; j < publicidadData.get(i).getListaVIdeos().size(); j++) {
				   JSONObject videosData = new JSONObject();
				   videosData.put("id",publicidadData.get(i).getListaVIdeos().get(j).getId());
				   videosData.put("nombre",publicidadData.get(i).getListaVIdeos().get(j).getNombre());
				   videosData.put("url",publicidadData.get(i).getListaVIdeos().get(j).getUrl());
				   videos.add(videosData);
				   
			   	} 
			   publicaciones.put("videos", videos);
			   
		   }
		   
		   if(publicidadData.get(i).getListaRedesSociales() != null){
			   JSONObject redes =  new JSONObject();
			  
				   redes.put("nombreFacebook",publicidadData.get(i).getListaRedesSociales().getNombreFacebook());
				   redes.put("nombreGoogle",publicidadData.get(i).getListaRedesSociales().getNombreGoogle());
				   redes.put("nombreInstagram",publicidadData.get(i).getListaRedesSociales().getNombreInstagram());
				   redes.put("nombreTwitter",publicidadData.get(i).getListaRedesSociales().getNombreTwitter());
				   redes.put("paginaWeb",publicidadData.get(i).getListaRedesSociales().getPaginaWeb());
				   redes.put("usuarioFacebook",publicidadData.get(i).getListaRedesSociales().getUsuarioFacebook());
				   redes.put("usuarioGoogle",publicidadData.get(i).getListaRedesSociales().getUsuarioGoogle());
				   redes.put("usuarioTwitter",publicidadData.get(i).getListaRedesSociales().getUsuarioTwitter());
				   redes.put("ciudad",publicidadData.get(i).getListaRedesSociales().getCiudad());
				   redes.put("direccion",publicidadData.get(i).getListaRedesSociales().getDireccion());
				   redes.put("latitud",publicidadData.get(i).getListaRedesSociales().getLatitud());
				   redes.put("longitud",publicidadData.get(i).getListaRedesSociales().getLongitud());
				   redes.put("celular",publicidadData.get(i).getListaRedesSociales().getCelular());
			       publicaciones.put("redes",redes);
		   }
			   
		  
		   
		
		  json.add(publicaciones);
	   }
	   
	   
		
		String  data  = json.toString();
		
		PrintWriter out = resp.getWriter();
		out.print(data);
		//resp.getWriter().println(data);
	}
}
