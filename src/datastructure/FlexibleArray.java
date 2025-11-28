package datastructure;

import java.lang.runtime.TemplateRuntime;

import oopmodeling.addresbook.Contact;

/*

* This is a class that represent an extensible array

* An aaray has a fixed capacity, when ranching the end

* of the array, we have to expand it automaticaly*/

public class FlexibleArray <T> {

    private T[] elements;
   
    private int size = 0;
    private int  EXPANSION_FACTOR = 40;

    private static final int initial_capacity = 5;


//the variable to sotore how many elemets we have added to the array

    public FlexibleArray() {

        elements = (T[]) new Object[initial_capacity];

    }



    public FlexibleArray(int size) {
    	if (size <= 0) {
    		size = initial_capacity;
    	}
    		
    	// create a array of objects
        elements = (T[]) new Object[size];

    }

    /*

     * add an element to the array at its last position

     * @param e

     * */



    public void add(T element){
    	elements[size] = element;
    	if (size == elements.length) {
    		
    	T[]	NewArr = (T[]) new Object[elements.length + EXPANSION_FACTOR];
    	for (int i = 0; i < NewArr.length; i++) {
    		NewArr[i] = elements[i

        /*

         * remove an element to the array at its last position

         * @param i

         * */

        public boolean remove ( Contact c){
        	elements[c] = null;
        	for (int j = 0; j < 5; j++) {
        		
        		
				
			}
        	 



        }

        public int size(){





            return elements.length;

        }



		public int get(int i) {
			// TODO Auto-generated method stub
			return 0;
		}



		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}



		public boolean remove(Contact c) {
			// TODO Auto-generated method stub
			return false;
		}

    }



