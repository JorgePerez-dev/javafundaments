/**
 * 
 */
package oopmodeling;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Planet {
    public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
           

           
            if (arreglo[medio] == valorBuscado) {
                return medio;
            }

           
            if (arreglo[medio] > valorBuscado) {
                fin = medio - 1;
            }
           
            else {
                inicio = medio + 1;
            }
        }

        
        return -1;
    }

   
    public static int[] generarArregloAleatorio(int tamaño, int valorMaximo) {
        Random rand = new Random();
        int[] arreglo = new int[tamaño];
        
        
        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = rand.nextInt(valorMaximo);
        }
        
        
        Arrays.sort(arreglo);
        return arreglo;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int tamaño = 20;  
        int valorMaximo = 100; 

        
        int[] arreglo = generarArregloAleatorio(tamaño, valorMaximo);


   
        int valorBuscado = -1;
        while (valorBuscado < 0) {
            System.out.print("Ingrese el valor a buscar (número entero): ");
            try {
                valorBuscado = scanner.nextInt();
                if (valorBuscado < 0) {
                    System.out.println("Por favor, ingrese un número positivo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Debe ingresar un número entero.");
                scanner.next(); // Limpiar el buffer
            }
        }

       

        int resultado = busquedaBinaria(arreglo, valorBuscado);

        // Imprimir el resultado
        if (resultado != -1) {
            System.out.println("Valor encontrado en la posición: " + resultado);
        } else {
            System.out.println("Valor no encontrado en el arreglo.");
        }
    }
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	