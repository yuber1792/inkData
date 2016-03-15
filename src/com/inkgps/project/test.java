package com.inkgps.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {

	public static void main(String[] args) {
		try {
		String ruta = "./war/data.json";
		File archivo = new File(ruta);
		BufferedWriter bw = null ;
		if(archivo.exists()) {
			
				bw = new BufferedWriter(new FileWriter(archivo));
				 bw.write("El fichero de texto ya estaba creado.");
			
			System.out.print("entra");
		      // El fichero ya existe
		} else {
			System.out.print("no entra");
		      // El fichero no existe y hay que crearlo
		}
		bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
