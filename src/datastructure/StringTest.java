package datastructure;

import java.util.Arrays;


public class StringTest {
	
	public static void main(String[] args) {
		
		
		
		System.out.println(selectquery(null, "jorge", "jorge@gmail.com"));

		String hola = "hola que tal";
	
		
		System.out.println(hola.charAt(1));
		
		

	}
	
	private static String selectquery(String[] parameters, String username, String email) {

	    // Consulta original con marcadores
	    String querysql = "select * from user where username = ? and email = ?";

	    // Convertimos el String en un array de caracteres
	    char[] characters = querysql.toCharArray();

	    // String donde construiremos la nueva consulta
	    String sumString = "";

	    // Contador para saber cuál "?" estamos reemplazando
	    int count = 0;

	    // Recorremos todos los caracteres del texto original
	    for (char character : characters) {

	        // Si no es un signo de interrogación, lo añadimos tal cual
	        if (character != '?') {
	            sumString += character;
	        } 
	        // Si encontramos un '?', lo reemplazamos
	        else {
	            if (count == 0) {
	                sumString += "'" + username + "'";
	            } else if (count == 1) {
	                sumString += "'" + email + "'";
	            }
	            count++; // Aumentamos el contador para el siguiente '?'
	        }
	    }

	    // Mostramos información adicional en consola (opcional, para depurar)
	    System.out.println("Sub String: " + querysql.subSequence(0, 10));
	    System.out.println("Replace all ? with values: " + sumString);
	    System.out.println("Array de caracteres: " + Arrays.toString(characters));
	    System.out.println("Primera posición de ?: " + querysql.indexOf("?"));
	    System.out.println("Caracter en posición 3: " + querysql.charAt(3));

	    // Retornamos la nueva consulta completa
	    return sumString;
	



	}	
		
	
	
	

		
	
	
	

}
