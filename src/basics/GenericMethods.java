package basics;

import java.util.Arrays;

public class GenericMethods {
	public static void main(String[] args) {
		String[] name = {"Pablo", "juan", "jorge"};
		Integer[] scores = {1284, 2525, 32, 643, 632};
		
		
		
		
		switchvalues(scores, 2, 3);
		switchvalues(name, 0, 1);
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(scores));
			
		
		
	}
	
	/**
	 * we can create generic methods to reach its maximum reusability of the code of a method
	 * @param <Element> the name of the generic type
	 * @param array
	 * @param index1
	 * @param index2
	 */
	

	public static <Element> void switchvalues(Element[] array, int index1, int index2) {

		if (array == null) {

			return;

		}

		if (index1 < 0 || index2 < 0) {

			return;

		}


		Element dato = array[index1];

		array[index1] = array[index2];

		array[index2] = dato;



	}
	
	
	
}
