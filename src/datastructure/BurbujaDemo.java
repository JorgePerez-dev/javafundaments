package datastructure;

import java.util.Random;

public class BurbujaDemo {

    public static void main(String[] args) {
        int[] numeros = generarArrayAleatorio(10, 1, 100); // 10 números entre 1 y 100
        
        burbuja(numeros);
        
    }
       

   
    public static void burbuja(int[] array) {
        int n = array.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambio = true;
                }
            }


            if (!intercambio) break; // si no hubo intercambios, ya está ordenado
        }
    }

    // Genera un array con números aleatorios entre min y max
    public static int[] generarArrayAleatorio(int tamaño, int min, int max) {
        int[] array = new int[tamaño];
        Random random = new Random();

        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
		}
			
		
		
	}
	
	
	
	
	
	
	

