package datastructure.list;

public class NodePlanet {

    int size;
    String name;
    int distance;
    NodePlanet next;

    public NodePlanet(int size, String name, int distance) {
        this.size = size;
        this.name = name;
        this.distance = distance;
        this.next = null;
    }

    public void setNext(NodePlanet next) {
        this.next = next;
    }
}
