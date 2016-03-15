/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inkgps.project;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ContainerFactory;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author steven
 */
public class JsonUtil {
    
    
    /**
     * generateJson - Convierte un objeto de tipo Map en una cadena string con
     * formato json
     *
     * @param mapa mapa con clave valor para generar un json
     * @return string en formato json
     */
    public static String generateStringJson(Map mapa) {
        try {
//            Map obj = new LinkedHashMap();
//            obj = new java.util.LinkedHashMap();
//            obj.put("empresaId", "4");
//            obj.put("telefono", new Integer(9999999));
//            obj.put("codCiudad", new Integer(11001));
//            obj.put("keyCommand", new Integer(2));
            String jsonText = JSONValue.toJSONString(mapa);
            StringBuffer buffer = new StringBuffer();
            buffer.append("[");
            buffer.append(jsonText);
            buffer.append("]");
            System.out.println(buffer.toString());
            return buffer.toString();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

  
    
    /**
     * convertJson- Convierte una cadena json en un mapa -Si un parametro de la
     * cadena json es un array, el valor de va ha ser una cadena json con los
     * valores del array
     *
     * @param jsont cadena que contiene la trama json
     * @return Map con la clave y el valor de cada una de las variables
     */
     public static  Map convertJson(String jsont) {
         //objeto para hacer parseo de json
         JSONParser parser = new JSONParser();
         ContainerFactory containerFactory = new ContainerFactory() {
             public List creatArrayContainer() {
                 return new LinkedList();
             }

             public Map createObjectContainer() {
                 return new LinkedHashMap();
             }
         };
         try {
             //Map que captura el  resultado del parseo del json 
             Map json = (Map) parser.parse(jsont, containerFactory);
             //imprime  por consola  el resultado del array (opcional )
             Iterator iter = json.entrySet().iterator();
             System.out.println("==MAPA GENERADO==");
             while (iter.hasNext()) {
                 Map.Entry entry = (Map.Entry) iter.next();
                 System.out.println(entry.getKey() + "===>" + entry.getValue());
             }
             System.out.println("==FIN MAPA==");
             System.out.println("==CADENA JSON==");
             System.out.println(JSONValue.toJSONString(json));
             // retorna el mapa
             return json;
         } catch (Exception e) {
             e.printStackTrace();
             return null;
         }


     }

    /**
     * getValueFromJson-Obtiene el valor de una variable en una cadena json
     *
     * @param json cadena json para consultar el valor de la variable
     * @param key especifica el nombre de la variable que se quiere obtener
     * @return Object con el resultado de la consulta
     */
    public static  Object getValueFromJson(String json, String key) {
        try {
            //objeto que se va ha retornar
            Object object = new Object();
            //objeto para hacer el parseo del json
            JSONParser jSONParser = new JSONParser();
            //objeto que contiene almacena el json luego de convertirlo
            JSONObject jsonObject = (JSONObject) jSONParser.parse(json);
            //ciclo para obtener el valor requerido
            Iterator keys = jsonObject.keySet().iterator();
            while (keys.hasNext()) {
                String dynamicKey = (String) keys.next();
                object = jsonObject.get(key);
            }
            //mensaje de información
            System.out.println("Valor  para " + key + " es de :" + object.toString());
            return object;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }

    }

    /**
     * getValueJsonFromArray-Metodo que captura un valor dentro de un array en
     * una posicion especifica
     *
     * @param json cadena json para consultar el valor de la variable
     * @param jsonArray nombre de el array que se encuentra en el json, del cual
     * se quiere obtener un valor
     * @param key nombre de la variable dentro del array de la cual se quiere
     * obtener el valor
     * @param position posicion del valor que se quiere obtener
     * @return Object con el valor obtenido
     */
    public static  Object getValueJsonFromArray(String json, String jsonArray, String key, int position) {
        try {
            //cadena que almacena el  json obtenido 
            String nuevoJson = json;
            //se concatenia el valor  del nombre del array que se quiere consultar  
            nuevoJson = "{\"" + jsonArray + "\":" + nuevoJson + "}";
            //objeto para hacer la conversion del json
            JSONParser jSONParser = new JSONParser();
            //objeto que captura la conversion de la cadena json
            JSONObject jsonObject = (JSONObject) jSONParser.parse(nuevoJson);
            //obeto que almacena los valores del array
            JSONArray objectTemp = new JSONArray();
            //objeto que almacena el valor a retornar 
            Object objectReturn = new Object();

            //ciclo para obtener los valores del array 
            Iterator keys = jsonObject.keySet().iterator();
            while (keys.hasNext()) {
                String dynamicKey = (String) keys.next();
                objectTemp = (JSONArray) jsonObject.get(jsonArray);
            }
            //ciclo que recorreo el array  obtenido y lo recorre para obetener el valor en la posicion deseada
            for (int i = 0; i < objectTemp.size(); i++) {
                //valida la  posicion 
                if (i == position) {
                    Object object = (JSONObject) JSONValue.parse(objectTemp.get(i).toString());
                    JSONObject obj = (JSONObject) object;
                    Iterator iter = jsonObject.keySet().iterator();
                    //ciclo para obtener el valor 
                    while (iter.hasNext()) {
                        String dynamicKey = (String) iter.next();
                        objectReturn = obj.get(key);
                    }
                }

            }
            //mensaje de informacion 
            System.out.println("Valor  para el arreglo  " + jsonArray + " en la clave " + key + "de la posicion " + position + "es de :" + objectReturn.toString());
            return objectReturn;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * isArrayJson - Verifica si un parametro es un array o es un valor sencillo
     *
     * @param json cadena json para consultar el valor de la variable
     * @param key valor del cual se desea saber si es un array o no
     * @return boolean - true si es un array ,false si no es un array
     */
    public boolean isArrayJson(String json, String key) {
        try {
            //objeto que se va ha retornar
            Object object = new Object();
            //objeto para hacer el parseo del json
            JSONParser jSONParser = new JSONParser();
            //objeto que contiene almacena el json luego de convertirlo
            JSONObject jsonObject = (JSONObject) jSONParser.parse(json);
            //ciclo para obtener el valor requerido
            Iterator keys = jsonObject.keySet().iterator();
            while (keys.hasNext()) {
                String dynamicKey = (String) keys.next();
                object = jsonObject.get(key);
            }
            //valida  si es una instancia de  JSonarray
            if (object instanceof JSONArray) {
                //mensae de informacion
                System.out.println("el parametro " + key + " es un array");
                return true;
            } else {
                //mensaje de informacion
                System.out.println("el parametro " + key + " no es un array");
                return false;
            }

        } catch (Exception e) {
            return false;
        }

    }

    /**
     * isJson - Metodo que verifica si una cadena string tiene formato json
     *
     * @param json cadena a evaluar
     * @return true si es un json
     */
    public static boolean isJson(String json) {

        if (json == null || json.trim( ).equalsIgnoreCase( "" )) {
            return false;
        }
        
        try {
            //objeto que se va ha retornar
            Object object = new Object();
            //objeto para hacer el parseo del json
            JSONParser jSONParser = new JSONParser();
            
            // Valida cadena vacia para evitar Excepción.
            // java.lang.StringIndexOutOfBoundsException
            if (json == null || json.trim().equalsIgnoreCase("")){
            	return false;
            }
            
            
            String jsonValidaini = json.substring(0, 1);
            String jsonValidafin = json.substring(json.length() - 1, json.length());

            if (jsonValidaini.equals("{") && jsonValidafin.equals("}")) {

//            objeto que contiene almacena el json luego de convertirlo
                Object jsonObject = jSONParser.parse(json);
                if (jsonObject instanceof JSONObject) {
                    System.out.println("Es una cadena  json ");
                    return true;

                } else {
                    System.out.println("No es una cadena  json");
                    return false;
                }

            } else {
                System.out.println("No es una cadena  json");
                return false;

            }



        } catch (Exception e) {


            e.printStackTrace();
            return false;
        }
    }

    /**
     * getDataFromArray -Metodo que devuelve un array de strigs cada posicion
     * tiene un json
     *
     * @param arrayJson json array
     * @return array de strings
     */
    public String[] getDataFromArray(String arrayJson) {
        try {

			//Eporras: 2013-06-27  Issue: 5408
			//  Si la información enviada es una cadena vacia, se devuelve un
			//  arreglo de estring vacio.
        	if (arrayJson.trim().equalsIgnoreCase("")){
        		return new String[0];
        	}
        	
            arrayJson.trim();
            String[] values = arrayJson.split("}");

            for (int i = 0; i < values.length; i++) {
                if (i == 0) {
                    values[i] += "}";
                } else {
                    char simbol = '{';
                    for (int j = 0; j < values[i].length(); j++) {

                        if (values[i].charAt(j) == simbol) {
                            values[i] = values[i].substring(j, values[i].length());
                        }
                    }
                    values[i] += "}";
                }
                System.out.println(i + "--" + values[i]);

            }
            return values;
        } catch (Exception e) {
            return new String[0];
        }
    }

    /**
     * Función que elimina acentos y caracteres especiales de una cadena de
     * texto.
     *
     * @param input
     * @return cadena de texto limpia de acentos y caracteres especiales.
     */
    public String eliminarCaracteresEspeciales(String input) {
        // Cadena de caracteres original a sustituir.
        String original = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
        // Cadena de caracteres ASCII que reemplazarán los originales.
        String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
        String output = input;
        for (int i = 0; i < original.length(); i++) {
            // Reemplazamos los caracteres especiales.
            output = output.replace(original.charAt(i), ascii.charAt(i));
        }//for i
        output.toLowerCase();
        return output;
    }//remove1
}
