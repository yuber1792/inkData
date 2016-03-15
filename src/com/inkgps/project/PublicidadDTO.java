package com.inkgps.project;

import java.util.List;

public class PublicidadDTO {
		private String url;
		private String descripcion;
		private String redireccion;
		private String nombre;
		private List<PublicidadImagenesDTO> listaImagenes;
		private List<PublicidadVideoDTO> listaVIdeos;
		private PublicidadRedesSocialesDTO listaRedesSociales;
		private String tieneImagen;
		private String tieneVideo;
		private String tieneRedes;
		private String ciudad;
		private String id ;
		
	
		
		
		public String getCiudad() {
			return ciudad;
		}
		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getTieneImagen() {
			return tieneImagen;
		}
		public void setTieneImagen(String tieneImagen) {
			this.tieneImagen = tieneImagen;
		}
		public String getTieneVideo() {
			return tieneVideo;
		}
		public void setTieneVideo(String tieneVideo) {
			this.tieneVideo = tieneVideo;
		}
		public String getTieneRedes() {
			return tieneRedes;
		}
		public void setTieneRedes(String tieneRedes) {
			this.tieneRedes = tieneRedes;
		}
		public List<PublicidadImagenesDTO> getListaImagenes() {
			return listaImagenes;
		}
		public void setListaImagenes(List<PublicidadImagenesDTO> listaImagenes) {
			this.listaImagenes = listaImagenes;
		}
		public List<PublicidadVideoDTO> getListaVIdeos() {
			return listaVIdeos;
		}
		public void setListaVIdeos(List<PublicidadVideoDTO> listaVIdeos) {
			this.listaVIdeos = listaVIdeos;
		}
		public PublicidadRedesSocialesDTO getListaRedesSociales() {
			return listaRedesSociales;
		}
		public void setListaRedesSociales(
				PublicidadRedesSocialesDTO listaRedesSociales) {
			this.listaRedesSociales = listaRedesSociales;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public String getRedireccion() {
			return redireccion;
		}
		public void setRedireccion(String redireccion) {
			this.redireccion = redireccion;
		}
	
}
