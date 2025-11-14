package datastructure;

import  oopmodeling.Planet;

public class FlexibleArrayTest {
    public static void main(String[] args) {
         FlexibleArray<Integer> flexibleArray = new FlexibleArray<>();
        System.out.println("The crrent size = " + flexibleArray.size());
        flexibleArray.add(3);
        flexibleArray.remove(4);
    }
}
