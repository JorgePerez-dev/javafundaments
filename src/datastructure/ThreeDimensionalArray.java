package datastructure;

public class ThreeDimensionalArray {
        public static void main(String[] args) {
            int depth = 3;  // Profundidad
            int rows = 4;   // Filas (puedes cambiarlo)
            int cols = 5;   // Columnas (puedes cambiarlo)

            int[][][] array = new int[depth][rows][cols];

            // Asignar valores: cada capa de profundidad tiene el mismo valor
            for (int d = 0; d < depth; d++) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        array[d][i][j] = d + 1; // cada capa tiene un valor distinto (1, 2, 3)
                    }
                }
            }

            // Imprimir todas las capas
            for (int d = 0; d < depth; d++) {
                System.out.println("Capa de profundidad " + d + ":");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.print(array[d][i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
        }
    }


