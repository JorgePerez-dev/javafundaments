

package basics;



import com.sun.org.apache.bcel.internal.generic.NEW;

import oopmodeling.Celestialbody;
import oopmodeling.Planet;

import oopmodeling.Star;



public class conversiontest {



	public static void main(String[] args) {

		primitiveConversion();

		

		//Polymorphism
		Planet p1 = new Planet();
		Celestialbody p2 = new Planet();
		Object p3 = new Planet();
		Object p4 = new Celestialbody();
		
		Planet p5 = (Planet)p3;
		System.out.println(p5 == p3);
		
		Object[] planetsObjects = new Planet[20];
		Planet[] plsPlanets = (Planet[]) planets;
		
		
		polymorphisMethod(p2);

	}
	
	private static void polymorphisMethod(Celestialbody cb) {
		
		
	}


	
	


	private static void primitiveConversion() {



		int num = 2312124;

		byte num2 = 127;

		float num3 = 324.4f;

		double num4 = 3434.434343f;

		num = num2;

		System.out.println(num);



		num2 = (byte) num;

		System.out.println(num2);

		num = 123;

		System.out.println(num);

		// explicit conversion from an integer to a byte number

		num2 = (byte) num;



		System.out.println("Number 2 is: " + num2);
		
		// even explicitly we can not and should not cash an int array to a byte array
		int[] nums1 = new int[23];
		byte[] nums3 = new byte[23];
		

	}
	
	
	



}