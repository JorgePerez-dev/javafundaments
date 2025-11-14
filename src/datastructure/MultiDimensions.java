package datastructure;

import java.util.Arrays;

public class MultiDimensions {
    public static void main(String[] args) {
        int depth = 3;   // Profundidad: número de capas
        int rows = 3;    // Número de filas por capa
        int cols = 3;    // Número de columnas por capa

        // 1️⃣ Crear el array tridimensional
        int[][][] cube = new int[depth][rows][cols];

        // 2️⃣ Asignar valores
        // En cada capa (profundidad), todos los elementos tienen el mismo valor
        for (int d = 0; d < depth; d++) {           // Recorre las capas
            for (int i = 0; i < rows; i++) {        // Recorre las filas
                for (int j = 0; j < cols; j++) {    // Recorre las columnas
                    cube[d][i][j] = d;              // Asigna el valor igual al número de capa
                }
            }
        }

        // 3️⃣ Imprimir todas las capas
        System.out.println("Contenido del array tridimensional:");
        for (int d = 0; d < depth; d++) {
            System.out.println("Capa " + d + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(cube[d][i][j] + " ");
                }
                System.out.println(); // salto de línea al terminar una fila
            }
            System.out.println(); // separación entre capas
        }
    }
}