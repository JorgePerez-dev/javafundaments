package oopmodeling;

public class ObjectCreation {
    public static void main(String[] args) {
        Object object = new Planet();
        Planet obj2 = new Planet();
        Planet jupiter = new Planet("jupiter", 647f, 74f);
        Planet marte = new Planet("Marte", 644237f, 73254f);

        System.out.println(marte.name);
        System.out.println(marte.mass);

    }
}
