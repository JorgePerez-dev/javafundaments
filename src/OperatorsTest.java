
public class OperatorsTest {

    public static void main(String[] args) {
        unaryOperatorsTest();         // llamo al método
        assignmentOperatorsTest();    // llamo al otro método
    }

    private static void unaryOperatorsTest() {
        int x = 5;
        int z = 4;
        int r = 3;

        System.out.println("El total es: " + (x + z + r));

        // comparaciones lógicas
        System.out.println(x == z);  // false
        System.out.println(r == 3);  // true
        System.out.println(r < x);   // true
    }

    private static void assignmentOperatorsTest() {
        int number1 = 3;
        int number2 = 20;

        float result = number1 + number2;
        System.out.println(result); // 23.0

        result /= number1; // equivale a result = result / number1
        System.out.println(result); // 23 / 3 = 7.666...
        System.out.println("este es el resultado");
    }
}
