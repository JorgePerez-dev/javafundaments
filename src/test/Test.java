package test;


import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {
public static void main(String[] args) {
	System.out.println("this is the good application");
 int var1 = 1;
 int var2 = 2;
 	System.out.println(var1 + var2);
 	
 Star Sun = new Star();
 Planet venus = new Planet();
 Planet tierra = new Planet();
System.out.println(Sun.temperature);
 
// Cambiar la masa de las estrellas 

Sun.setMass(23424);
Sun.setName("234");
System.out.println("The mass of the sun is" + Sun.getMass());


Star utus = new Star();

if(utus == Sun) {
	System.out.println("correcto");;

}
else {
	System.out.println("No es correcto");
	
}
System.out.println("The mass of utus is " + utus.getMass());


 	
 
 
			
}
	
}
	

	


