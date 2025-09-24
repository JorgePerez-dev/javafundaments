package javacontrols;

import java.util.Random;

public class Ifcontrol {



public static void main(String[] args) {
	Random random = new Random();
	
	
	
	
	int num1 = 12;
	int num2;
	num2 = 34;
	int result;
	result = num1 - num2;
	System.out.println(result);
	
	if(result > 0) {
		System.out.println("number 1 is greater than numer2");
		
		
	}
	else if(result == 0) {
		System.out.println("number 1 is equal to numer 2");
		
		
		
	}
	
	
	else {
		System.out.println("numer 1 is less than numer 2");
	}
	
	
	
	
	

}


}