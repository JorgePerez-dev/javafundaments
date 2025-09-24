package datastructure;




import java.util.EnumSet;
import java.util.Random;

import oopmodeling.Planet;

public class Arraytest {
	
	public static void main(String[] args) {
	        // 1) Array de puntuaciones que usaremos en todo el main
	        int[] scores = { 12, 34, 67, 3423, 33 };
	        

	       
	     
	        

	        // 3) Arrays de prueba
	        String[] nameStrings = { "Pablo", "Jorge", "Carlos" };
	        Planet[] planets = { new Planet(), new Planet() };

	        System.out.println(nameStrings[1]); // "Jorge"

	        // 4) try/catch para mostrar un acceso fuera de rango controlado
	        try {
	            System.out.println(scores[3423]); // fuera de rango -> saltará al catch
	        } catch (Exception e) {
	            // Manejo del error: imprime el stacktrace
	            e.printStackTrace();
	        }

	        // 5) Creamos un array de 1000 enteros
	        int[] nums = new int[1000];
	        System.out.println("The length of the number array is " + nums.length);
	        
	        initializeArray(nums);
	        
	        findMaxMin(nums);

	        
	        
	        // (Opcional) Mostrar los primeros 5 números para verificar
	        System.out.println("Primeros 5 nums:");
	        for (int i = 0; i < 5; i++) {
	            System.out.println(nums[i]);
	        }
	    }

	    private static void findMaxMin(int[] nums) {
	    	
	    	int maximo = nums[0];
	    	int minimo = nums[0];
	    	
	    	
	    	
	    	for (int i = 0; i < nums.length; i++) {
	    		if (maximo < nums[i]) {
	    			maximo = nums[i];
	    		}
	    		
	    		if (nums[i] < minimo) {
	    			minimo = nums[i];
	    		}	
			}
	    	
	    	System.out.println("Numero máximo: " + maximo);
	    	System.out.println("Numero mínimo: " + minimo);
	
		
	}

		private static void initializeArray(int[] nums) {
			Random random = new Random();
			for (int i = 0; i < nums.length; i++) {
				nums[i] = random.nextInt(1000);
				
			}
		
		
	}

		// Suma de elementos del array scores y salida por consola
	    private static void sumUp(int[] scores) {
	        // Acceder a elementos concretos
	        System.out.println(scores[0]);
	        System.out.println(scores[1]);
	        System.out.println(scores[2]);
	        System.out.println(scores[3]);

	        // Suma "a mano" de los cuatro primeros
	        int total = scores[0] + scores[1] + scores[2] + scores[3];
	        System.out.println("The total score is " + total);

	        // Suma con bucle de todos los elementos
	        int totalScore = 0;
	        for (int i = 0; i < scores.length; i++) {
	            totalScore += scores[i];
	        }
	        System.out.println("Total score = " + totalScore);
	        
	    }
	    
	    
	   
	    
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
	
	
	

		
		
		
		
		
	

  

