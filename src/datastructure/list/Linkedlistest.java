package datastructure.list;

public class Linkedlistest {

    public static void main(String[] args) {

        NodePlanet first = new NodePlanet(1000, "Earth", 14535);
        NodePlanet second = new NodePlanet(1000, "Moon", 14535);
        NodePlanet third = new NodePlanet(1000, "Mars", 14535);
        NodePlanet fourth = new NodePlanet(1000, "Earth", 14535);


        first.setNext(second);
        second.setNext(third);
        third.setNext(fourth);
        
        LinkedListImpl<Integer> list = new LinkedListImpl<Integer>();
        list.add(12);
        list.add(333);
        list.add(20);
        list.add(320);

    }

}