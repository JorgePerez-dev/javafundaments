package datastructure;

import java.util.Arrays;

public class SortingTest {
	public static void main(String[] args) {
		String[] name = {"Pablo", "jorge", "ana", "Ruben"};
		int[] scores = {12, 1000, 3423, 32, 2, 54, 24, 42};
		
		
		
		
		OrdenarArray(scores);
        System.out.println(Arrays.toString(scores));
		




        boolean metodo = linearSearch(234, scores);

        System.out.println(metodo);
		
	}


    private static boolean linearSearch(int valor, int[] scores) {
        for (int j = 0; j <  scores.length; j++) {
            if (scores[j] == valor) {
                return true;
            }


        }
        return false;

    }

    private static boolean BinarySearch(int valor1, int[] scores) {
        int start = 0;
        int endIndex = scores.length;


         int middleIndex = (endIndex - start) / 2;
        if (scores[middleIndex] == valor1) {
            return true;

        } else if (valor1 < middleIndex) {
            return  true;

        }
        return false;

    }









	public static void OrdenarArray(int[] Array) {
	
		
		for (int i = 0; i < Array.length; i++) {
			for (int j = i + 1; j < Array.length; j++) {
				if (Array[i] > Array[j]) {
					int temporal = Array[i];
					Array[i] = Array[j];
					Array[j] = temporal;
				}
				
				
				
			}
			
				
			
			
				
				
				
			}
			
		}
			
		
		
	}
	
	
	
	
	
	
	

