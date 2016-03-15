package com.inkgps.project;

import java.awt.List;
import java.util.ArrayList;

public class Artista {

	private String especialidad;
	private String direccion;
	private String celular;
	private String facebook;
	private String twitter;
	private String instagram;
	private String latitud;
	private String longitud;
	private ArrayList<TrabajosArtista> trabajosArtistas = new ArrayList<TrabajosArtista>();
	private String videoOpcion;
	private ArrayList<VideoDTO> videosArtistas = new ArrayList<VideoDTO>();
	private String id;
	private String nombre;
	private String imagen;
	private String descripcion;
	public String getVideoOpcion() {
		return videoOpcion;
	}
	public void setVideoOpcion(String videoOpcion) {
		this.videoOpcion = videoOpcion;
	}
	public ArrayList<VideoDTO> getVideosArtistas() {
		return videosArtistas;
	}
	public void setVideosArtistas(ArrayList<VideoDTO> videosArtistas) {
		this.videosArtistas = videosArtistas;
	}
	private String nombreEstudio;
	private String email;
	private String ciudad;
	private String usuarioFacebook;
	private String usuarioTwitter;
	private String usuarioInstagram;
	private String verificado;
	private String escarificacion;
	
	
	public String getEscarificacion() {
		return escarificacion;
	}
	public void setEscarificacion(String escarificacion) {
		this.escarificacion = escarificacion;
	}
	public String getVerificado() {
		return verificado;
	}
	public void setVerificado(String verificado) {
		this.verificado = verificado;
	}
	public String getUsuarioFacebook() {
		return usuarioFacebook;
	}
	public void setUsuarioFacebook(String usuarioFacebook) {
		this.usuarioFacebook = usuarioFacebook;
	}
	public String getUsuarioTwitter() {
		return usuarioTwitter;
	}
	public void setUsuarioTwitter(String usuarioTwitter) {
		this.usuarioTwitter = usuarioTwitter;
	}
	public String getUsuarioInstagram() {
		return usuarioInstagram;
	}
	public void setUsuarioInstagram(String usuarioInstagram) {
		this.usuarioInstagram = usuarioInstagram;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEstudio() {
		return nombreEstudio;
	}
	public void setNombreEstudio(String nombreEstudio) {
		this.nombreEstudio = nombreEstudio;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public ArrayList<TrabajosArtista> getTrabajosArtistas() {
		return trabajosArtistas;
	}
	public void setTrabajosArtistas(ArrayList<TrabajosArtista> trabajosArtistas) {
		this.trabajosArtistas = trabajosArtistas;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
