package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import addresbook.AddressBook;  // <-- corregido

public class reflectiontest {

    public static void main(String[] args) {

        // Forma 1
        Class<AddressBook> cls1 = AddressBook.class;

        // Forma 2
        Class<?> class2 = AddressBook.class;

        // Forma 3
        Class<?> class3 = new AddressBook().getClass();

        // Forma 4
        try {
            Class<?> class4 = Class.forName("addressbook.AddressBook"); // <-- corregido
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 🔥 MOVIDO fuera del catch (IMPORTANTE)
        inspectClass(cls1);
        inspectConstructors(cls1);
        inspectMethods(cls1);
        inspectAnnotations(cls1);
    }

    private static void inspectClass(Class<AddressBook> cls1) {
        cls1.getDeclaredConstructors();
        cls1.getDeclaredMethods();
        cls1.getDeclaredFields();
        cls1.getAnnotations();

        for (Field field : cls1.getDeclaredFields()) {
            System.out.println("field name is " + field.getName());
            System.out.println("field type is " + field.getType().getSimpleName());
        }
    }

    private static void inspectConstructors(Class<AddressBook> cls1) {
        cls1.getDeclaredConstructors();
        cls1.getDeclaredMethods();
        cls1.getDeclaredFields();
        cls1.getAnnotations();

        for (Constructor<?> constructor : cls1.getDeclaredConstructors()) {
            System.out.println("Constructor: " + constructor.getName());
        }
    }

    
    private static void inspectMethods(Class<AddressBook> cls1) {

        Method[] ms = cls1.getDeclaredMethods();

        for (int i = 0; i < ms.length; i++) {

            System.out.println("method name is " + ms[i].getName());

            Parameter[] params = ms[i].getParameters();

            for (int j = 0; j < params.length; j++) {
                System.out.println("method param is " + params[j].getName() +
                                   " type is " + params[j].getType().getSimpleName());
            }
        }
    }

    private static void inspectAnnotations(Class<AddressBook> cls1) {

        for (Annotation annotation : cls1.getAnnotations()) {
            System.out.println(annotation.annotationType().getName());
        }
    }
}