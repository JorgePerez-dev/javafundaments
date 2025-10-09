package datastructure;

import java.util.Arrays;

public class SortingTest {
	public static void main(String[] args) {
		String[] name = {"Pablo", "jorge", "ana", "Ruben"};
		int[] scores = {12, 1000, 3423, 32, 2, 54, 24, 42};
		
		
		
		
		OrdenarArray(scores);
		System.out.println(Arrays.toString(scores));
		
		
		
		
		
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
	
	
	
	
	
	
	

