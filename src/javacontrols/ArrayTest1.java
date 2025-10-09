package javacontrols;

import java.util.Arrays;



public class ArrayTest1 {
	
	public static void invertirArray(int[] array) {
		int i = 0;
		int j = array.length - 1;
		
		
		while (i < j) {
			int tempo = array[i];
			array[i] = array[j];
			array[j] = tempo;
			i++;
			j--;
			
			
		}
		
		
	}
	
	
	private static int[] slice(int[] arr,  int inicio , int fin) {
		// Creamos un nuevo array con el tamaño correcto
        int[] resultado = new int[fin - inicio +1];

        // Copiamos los valores del original al nuevo
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = arr[inicio + i];
        }

        // Devolvemos el nuevo array
        return resultado;
    }
	
	
	// this metod  order the array  from lowest to highest

	private static  int[] ordenarArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				
				
			}
			
		}
		
		return array;
		
		
		
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	public static void main(String[] args) {
		
		int[] numeros = {10, 4, 56, 42, 76, 74, 35, 5, 6, 5};
		
		ordenarArray(numeros);
		
		int[] parte = slice(numeros, 0, 5);
		
		System.out.println(Arrays.toString(parte));
		System.out.println(Arrays.toString(numeros));
		
	
		
		
		
		
		
		
	}


}
