 package datastructure;



public class FlexibleArrayTest {

    public static void main(String[] args) {

        FlexibleArray<Object> flexibleArray = new FlexibleArray<>();

        System.out.println("the current size = " + flexibleArray.size());


        for (int i = 0; i < 60; i++) {
        	flexibleArray.add(3);
			
		}

        flexibleArray.remove(4);
        

    }
    
    
    

    

}