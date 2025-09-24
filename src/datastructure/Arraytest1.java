package datastructure;

import java.time.chrono.JapaneseChronology;
import java.util.Random;

import sun.awt.windows.ThemeReader;


public class Arraytest1 {
	
	public static void main(String[] args) {
		int[] nums = new int[1000];
		System.out.println("The Length of the numer array is " + nums.length);
		
		Random random = new Random(); // crea un generador de numeros aleatorios
		random.nextInt(-1000, 1000000); //Genera un numero aleatorio en ese rango.
		
		nums[0] = random.nextInt(-1000, 1000000); // Genera otro numero aleatorio y lo asiga a la primera posicion del array nums
		
		
		int len = nums.length;
		int j = 0;
		
		while (len > j) {
			nums[j] = random.nextInt(-1000, 1000000);
			j = j + 1;
		}
		
		
		// inicializa mayor y menor con el primer elemento del array
		
		int menor = nums[0];
		int mayor = nums[0];
		
	
		
		// Recorre el array desde la posicion 1 hasta el final
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > mayor) {
				mayor = nums[i];
			}
			
			if (nums[i] < menor) {
				menor = nums[i];
			}
			
		}
		
		System.out.println("Número mayor: " + mayor);
		System.out.println("Número menor: " + menor);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}
	

}
