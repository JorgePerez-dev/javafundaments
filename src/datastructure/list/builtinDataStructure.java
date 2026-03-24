package datastructure.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


import oopmodeling.Planet;

public class builtinDataStructure {
	
	
	public static void main(String[] args) {
		
		Planet planet1 = new Planet();
		Planet planet2 = new Planet();
			
		Planet[] pls = new Planet[5];
		
		//create an object of class
		ArrayList<Planet> planets = new ArrayList<>();
		
		//add an object to position 0
		planets.add(planet2);
		//add an object to position 1
		planets.add(planet1);
		
		//retrieve the value at index 1
		planets.get(1);
		
		
		//Create an object of class LinkedList
		LinkedList<String> names =new LinkedList<String>();
		names.add("Jorge");
		names.add("Carlos");
		
		//Less efficient than accesing elements in an Array when using 
		names.get(1);
		
		Stack<Integer> callStack = new Stack<>();
		
		//add  an element on the top of the stack object
		callStack.push(34);
		callStack.push(10);
		callStack.push(2);
		
		//peek method is used to read the element on the top of the stack
		System.out.println(callStack.peek());
		
		
		
		ArrayList<Planet> arr;
		
		
	}

}
